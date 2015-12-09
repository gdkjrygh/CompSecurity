// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import com.netflix.mediaclient.Log;

public class UpdateDialog extends AlertDialog
{
    static class AlertParams
    {

        public boolean mCancelable;
        public final Context mContext;
        public Drawable mIcon;
        public int mIconId;
        public CharSequence mMessage;
        public android.content.DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNegativeButtonText;
        public android.content.DialogInterface.OnClickListener mNeutralButtonListener;
        public CharSequence mNeutralButtonText;
        public android.content.DialogInterface.OnCancelListener mOnCancelListener;
        public android.content.DialogInterface.OnClickListener mOnClickListener;
        public android.content.DialogInterface.OnKeyListener mOnKeyListener;
        public android.content.DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mPositiveButtonText;
        public CharSequence mTitle;

        private AlertParams(Context context)
        {
            mIconId = -1;
            mContext = context;
        }

    }

    public static class Builder
    {

        private AlertParams params;

        public UpdateDialog create()
        {
            UpdateDialog updatedialog = new UpdateDialog(params.mContext);
            updatedialog.setCancelable(params.mCancelable);
            updatedialog.setOnCancelListener(params.mOnCancelListener);
            updatedialog.setOnKeyListener(params.mOnKeyListener);
            if (params.mTitle != null)
            {
                updatedialog.setTitle(params.mTitle);
            }
            if (params.mIcon != null)
            {
                updatedialog.setIcon(params.mIcon);
            }
            if (params.mIconId >= 0)
            {
                updatedialog.setIcon(params.mIconId);
            }
            if (params.mMessage != null)
            {
                updatedialog.setMessage(params.mMessage);
            }
            if (params.mPositiveButtonText != null)
            {
                updatedialog.setButton(-1, params.mPositiveButtonText, params.mPositiveButtonListener);
            }
            if (params.mNegativeButtonText != null)
            {
                updatedialog.setButton(-2, params.mNegativeButtonText, params.mNegativeButtonListener);
            }
            return updatedialog;
        }

        public Builder setCancelable(boolean flag)
        {
            params.mCancelable = flag;
            return this;
        }

        public Builder setIcon(int i)
        {
            params.mIconId = i;
            return this;
        }

        public Builder setIcon(Drawable drawable)
        {
            params.mIcon = drawable;
            return this;
        }

        public Builder setMessage(int i)
        {
            params.mMessage = params.mContext.getText(i);
            return this;
        }

        public Builder setMessage(CharSequence charsequence)
        {
            params.mMessage = charsequence;
            return this;
        }

        public Builder setNegativeButton(int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            params.mNegativeButtonText = params.mContext.getText(i);
            params.mNegativeButtonListener = onclicklistener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            params.mNegativeButtonText = charsequence;
            params.mNegativeButtonListener = onclicklistener;
            return this;
        }

        public Builder setOnCancelListener(android.content.DialogInterface.OnCancelListener oncancellistener)
        {
            params.mOnCancelListener = oncancellistener;
            return this;
        }

        public Builder setOnKeyListener(android.content.DialogInterface.OnKeyListener onkeylistener)
        {
            params.mOnKeyListener = onkeylistener;
            return this;
        }

        public Builder setPositiveButton(int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            params.mPositiveButtonText = params.mContext.getText(i);
            params.mPositiveButtonListener = onclicklistener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            params.mPositiveButtonText = charsequence;
            params.mPositiveButtonListener = onclicklistener;
            return this;
        }

        public Builder setTitle(int i)
        {
            params.mTitle = params.mContext.getText(i);
            return this;
        }

        public Builder setTitle(CharSequence charsequence)
        {
            params.mTitle = charsequence;
            return this;
        }

        public AlertDialog show()
        {
            UpdateDialog updatedialog = create();
            updatedialog.show();
            return updatedialog;
        }

        public Builder(Context context)
        {
            params = new AlertParams(context);
        }
    }


    private static final String TAG = "Update";

    public UpdateDialog(Context context)
    {
        super(context);
    }

    public UpdateDialog(Context context, int i)
    {
        super(context, i);
    }

    public UpdateDialog(Context context, boolean flag, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        super(context, flag, oncancellistener);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        Log.i("Update", (new StringBuilder()).append("Key ").append(i).toString());
        if (i == 84)
        {
            Log.i("Update", "Ignore search key");
            return true;
        }
        if (i == 4)
        {
            Log.i("Update", "Ignore back key");
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onSearchRequested()
    {
        return false;
    }
}
