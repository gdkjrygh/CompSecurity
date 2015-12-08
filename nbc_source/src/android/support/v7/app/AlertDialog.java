// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.app:
//            AppCompatDialog, AlertController

public class AlertDialog extends AppCompatDialog
    implements DialogInterface
{
    public static class Builder
    {

        private final AlertController.AlertParams P;
        private int mTheme;

        public AlertDialog create()
        {
            AlertDialog alertdialog = new AlertDialog(P.mContext, mTheme, false);
            P.apply(alertdialog.mAlert);
            alertdialog.setCancelable(P.mCancelable);
            if (P.mCancelable)
            {
                alertdialog.setCanceledOnTouchOutside(true);
            }
            alertdialog.setOnCancelListener(P.mOnCancelListener);
            alertdialog.setOnDismissListener(P.mOnDismissListener);
            if (P.mOnKeyListener != null)
            {
                alertdialog.setOnKeyListener(P.mOnKeyListener);
            }
            return alertdialog;
        }

        public Context getContext()
        {
            return P.mContext;
        }

        public Builder setAdapter(ListAdapter listadapter, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            P.mAdapter = listadapter;
            P.mOnClickListener = onclicklistener;
            return this;
        }

        public Builder setCustomTitle(View view)
        {
            P.mCustomTitleView = view;
            return this;
        }

        public Builder setIcon(Drawable drawable)
        {
            P.mIcon = drawable;
            return this;
        }

        public Builder setOnKeyListener(android.content.DialogInterface.OnKeyListener onkeylistener)
        {
            P.mOnKeyListener = onkeylistener;
            return this;
        }

        public Builder setTitle(CharSequence charsequence)
        {
            P.mTitle = charsequence;
            return this;
        }

        public Builder(Context context)
        {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }

        public Builder(Context context, int i)
        {
            P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)));
            mTheme = i;
        }
    }


    private AlertController mAlert;

    AlertDialog(Context context, int i, boolean flag)
    {
        super(context, resolveDialogTheme(context, i));
        mAlert = new AlertController(getContext(), this, getWindow());
    }

    static int resolveDialogTheme(Context context, int i)
    {
        if (i >= 0x1000000)
        {
            return i;
        } else
        {
            TypedValue typedvalue = new TypedValue();
            context.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.alertDialogTheme, typedvalue, true);
            return typedvalue.resourceId;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mAlert.installContent();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (mAlert.onKeyDown(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (mAlert.onKeyUp(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        mAlert.setTitle(charsequence);
    }

}
