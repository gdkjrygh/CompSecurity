// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.internal.widget.TintTypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.app:
//            AppCompatDialog, AlertController, AppCompatDelegate

public final class AlertDialog extends AppCompatDialog
    implements DialogInterface
{
    public static class Builder
    {

        public final AlertController.AlertParams P;
        private int mTheme;

        public final AlertDialog create()
        {
            AlertDialog alertdialog = new AlertDialog(P.mContext, mTheme);
            AlertController.AlertParams alertparams = P;
            AlertController alertcontroller = alertdialog.mAlert;
            if (alertparams.mCustomTitleView != null)
            {
                alertcontroller.mCustomTitleView = alertparams.mCustomTitleView;
            } else
            {
                if (alertparams.mTitle != null)
                {
                    alertcontroller.setTitle(alertparams.mTitle);
                }
                if (alertparams.mIcon != null)
                {
                    obj = alertparams.mIcon;
                    alertcontroller.mIcon = ((Drawable) (obj));
                    alertcontroller.mIconId = 0;
                    if (alertcontroller.mIconView != null)
                    {
                        if (obj != null)
                        {
                            alertcontroller.mIconView.setImageDrawable(((Drawable) (obj)));
                        } else
                        {
                            alertcontroller.mIconView.setVisibility(8);
                        }
                    }
                }
            }
            if (alertparams.mMessage != null)
            {
                CharSequence charsequence = alertparams.mMessage;
                alertcontroller.mMessage = charsequence;
                if (alertcontroller.mMessageView != null)
                {
                    alertcontroller.mMessageView.setText(charsequence);
                }
            }
            if (alertparams.mPositiveButtonText != null)
            {
                alertcontroller.setButton(-1, alertparams.mPositiveButtonText, alertparams.mPositiveButtonListener, null);
            }
            if (alertparams.mNegativeButtonText != null)
            {
                alertcontroller.setButton(-2, alertparams.mNegativeButtonText, alertparams.mNegativeButtonListener, null);
            }
            if (alertparams.mNeutralButtonText != null)
            {
                alertcontroller.setButton(-3, alertparams.mNeutralButtonText, alertparams.mNeutralButtonListener, null);
            }
            if (alertparams.mAdapter != null)
            {
                ListView listview = (ListView)alertparams.mInflater.inflate(alertcontroller.mListLayout, null);
                int i = alertcontroller.mListItemLayout;
                Object obj;
                if (alertparams.mAdapter != null)
                {
                    obj = alertparams.mAdapter;
                } else
                {
                    obj = new AlertController.CheckedItemAdapter(alertparams.mContext, i, null);
                }
                alertcontroller.mAdapter = ((ListAdapter) (obj));
                alertcontroller.mCheckedItem = alertparams.mCheckedItem;
                if (alertparams.mOnClickListener != null)
                {
                    listview.setOnItemClickListener(new AlertController.AlertParams._cls3(alertparams, alertcontroller));
                }
                alertcontroller.mListView = listview;
            }
            if (alertparams.mView != null)
            {
                alertcontroller.mView = alertparams.mView;
                alertcontroller.mViewLayoutResId = 0;
                alertcontroller.mViewSpacingSpecified = false;
            }
            alertdialog.setCancelable(P.mCancelable);
            if (P.mCancelable)
            {
                alertdialog.setCanceledOnTouchOutside(true);
            }
            alertdialog.setOnCancelListener(P.mOnCancelListener);
            alertdialog.setOnDismissListener(null);
            if (P.mOnKeyListener != null)
            {
                alertdialog.setOnKeyListener(P.mOnKeyListener);
            }
            return alertdialog;
        }

        public final Builder setAdapter(ListAdapter listadapter, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            P.mAdapter = listadapter;
            P.mOnClickListener = onclicklistener;
            return this;
        }

        public final Builder setCancelable(boolean flag)
        {
            P.mCancelable = flag;
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

        public final Builder setMessage(int i)
        {
            P.mMessage = P.mContext.getText(i);
            return this;
        }

        public final Builder setMessage(CharSequence charsequence)
        {
            P.mMessage = charsequence;
            return this;
        }

        public final Builder setNegativeButton(int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            P.mNegativeButtonText = P.mContext.getText(i);
            P.mNegativeButtonListener = onclicklistener;
            return this;
        }

        public final Builder setNeutralButton(int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            P.mNeutralButtonText = P.mContext.getText(i);
            P.mNeutralButtonListener = onclicklistener;
            return this;
        }

        public final Builder setOnCancelListener(android.content.DialogInterface.OnCancelListener oncancellistener)
        {
            P.mOnCancelListener = oncancellistener;
            return this;
        }

        public final Builder setPositiveButton(int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            P.mPositiveButtonText = P.mContext.getText(i);
            P.mPositiveButtonListener = onclicklistener;
            return this;
        }

        public Builder setTitle(CharSequence charsequence)
        {
            P.mTitle = charsequence;
            return this;
        }

        public final Builder setView(View view)
        {
            P.mView = view;
            P.mViewLayoutResId = 0;
            P.mViewSpacingSpecified = false;
            return this;
        }

        public final AlertDialog show()
        {
            AlertDialog alertdialog = create();
            alertdialog.show();
            return alertdialog;
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


    public AlertController mAlert;

    AlertDialog(Context context, int i)
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
            context.getTheme().resolveAttribute(0x7f010147, typedvalue, true);
            return typedvalue.resourceId;
        }
    }

    protected final void onCreate(Bundle bundle)
    {
        boolean flag2 = false;
        super.onCreate(bundle);
        AlertController alertcontroller = mAlert;
        alertcontroller.mDialog.getDelegate().requestWindowFeature(1);
        int i = alertcontroller.mAlertDialogLayout;
        alertcontroller.mDialog.setContentView(i);
        bundle = (ViewGroup)alertcontroller.mWindow.findViewById(0x7f0d00bc);
        alertcontroller.mScrollView = (ScrollView)alertcontroller.mWindow.findViewById(0x7f0d00bd);
        alertcontroller.mScrollView.setFocusable(false);
        alertcontroller.mMessageView = (TextView)alertcontroller.mWindow.findViewById(0x102000b);
        Object obj;
        FrameLayout framelayout;
        boolean flag;
        if (alertcontroller.mMessageView != null)
        {
            if (alertcontroller.mMessage != null)
            {
                alertcontroller.mMessageView.setText(alertcontroller.mMessage);
            } else
            {
                alertcontroller.mMessageView.setVisibility(8);
                alertcontroller.mScrollView.removeView(alertcontroller.mMessageView);
                if (alertcontroller.mListView != null)
                {
                    bundle = (ViewGroup)alertcontroller.mScrollView.getParent();
                    i = bundle.indexOfChild(alertcontroller.mScrollView);
                    bundle.removeViewAt(i);
                    bundle.addView(alertcontroller.mListView, i, new android.view.ViewGroup.LayoutParams(-1, -1));
                } else
                {
                    bundle.setVisibility(8);
                }
            }
        }
        alertcontroller.mButtonPositive = (Button)alertcontroller.mWindow.findViewById(0x1020019);
        alertcontroller.mButtonPositive.setOnClickListener(alertcontroller.mButtonHandler);
        if (TextUtils.isEmpty(alertcontroller.mButtonPositiveText))
        {
            alertcontroller.mButtonPositive.setVisibility(8);
            i = 0;
        } else
        {
            alertcontroller.mButtonPositive.setText(alertcontroller.mButtonPositiveText);
            alertcontroller.mButtonPositive.setVisibility(0);
            i = 1;
        }
        alertcontroller.mButtonNegative = (Button)alertcontroller.mWindow.findViewById(0x102001a);
        alertcontroller.mButtonNegative.setOnClickListener(alertcontroller.mButtonHandler);
        if (TextUtils.isEmpty(alertcontroller.mButtonNegativeText))
        {
            alertcontroller.mButtonNegative.setVisibility(8);
        } else
        {
            alertcontroller.mButtonNegative.setText(alertcontroller.mButtonNegativeText);
            alertcontroller.mButtonNegative.setVisibility(0);
            i |= 2;
        }
        alertcontroller.mButtonNeutral = (Button)alertcontroller.mWindow.findViewById(0x102001b);
        alertcontroller.mButtonNeutral.setOnClickListener(alertcontroller.mButtonHandler);
        if (TextUtils.isEmpty(alertcontroller.mButtonNeutralText))
        {
            alertcontroller.mButtonNeutral.setVisibility(8);
        } else
        {
            alertcontroller.mButtonNeutral.setText(alertcontroller.mButtonNeutralText);
            alertcontroller.mButtonNeutral.setVisibility(0);
            i |= 4;
        }
        bundle = alertcontroller.mContext;
        obj = new TypedValue();
        bundle.getTheme().resolveAttribute(0x7f010146, ((TypedValue) (obj)), true);
        if (((TypedValue) (obj)).data != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (i == 1)
            {
                AlertController.centerButton(alertcontroller.mButtonPositive);
            } else
            if (i == 2)
            {
                AlertController.centerButton(alertcontroller.mButtonNegative);
            } else
            if (i == 4)
            {
                AlertController.centerButton(alertcontroller.mButtonNeutral);
            }
        }
        if (i != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        bundle = (ViewGroup)alertcontroller.mWindow.findViewById(0x7f0d00b9);
        obj = TintTypedArray.obtainStyledAttributes$1a6c1917(alertcontroller.mContext, null, android.support.v7.appcompat.R.styleable.AlertDialog, 0x7f010144);
        if (alertcontroller.mCustomTitleView != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -2);
            bundle.addView(alertcontroller.mCustomTitleView, 0, layoutparams);
            alertcontroller.mWindow.findViewById(0x7f0d00ba).setVisibility(8);
        } else
        {
            alertcontroller.mIconView = (ImageView)alertcontroller.mWindow.findViewById(0x1020006);
            boolean flag1;
            if (!TextUtils.isEmpty(alertcontroller.mTitle))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                alertcontroller.mTitleView = (TextView)alertcontroller.mWindow.findViewById(0x7f0d00bb);
                alertcontroller.mTitleView.setText(alertcontroller.mTitle);
                if (alertcontroller.mIcon != null)
                {
                    alertcontroller.mIconView.setImageDrawable(alertcontroller.mIcon);
                } else
                {
                    alertcontroller.mTitleView.setPadding(alertcontroller.mIconView.getPaddingLeft(), alertcontroller.mIconView.getPaddingTop(), alertcontroller.mIconView.getPaddingRight(), alertcontroller.mIconView.getPaddingBottom());
                    alertcontroller.mIconView.setVisibility(8);
                }
            } else
            {
                alertcontroller.mWindow.findViewById(0x7f0d00ba).setVisibility(8);
                alertcontroller.mIconView.setVisibility(8);
                bundle.setVisibility(8);
            }
        }
        bundle = alertcontroller.mWindow.findViewById(0x7f0d00c1);
        if (i == 0)
        {
            bundle.setVisibility(8);
            bundle = alertcontroller.mWindow.findViewById(0x7f0d00be);
            if (bundle != null)
            {
                bundle.setVisibility(0);
            }
        }
        framelayout = (FrameLayout)alertcontroller.mWindow.findViewById(0x7f0d00bf);
        if (alertcontroller.mView != null)
        {
            bundle = alertcontroller.mView;
        } else
        {
            bundle = null;
        }
        i = ((flag2) ? 1 : 0);
        if (bundle != null)
        {
            i = 1;
        }
        if (i == 0 || !AlertController.canTextInput(bundle))
        {
            alertcontroller.mWindow.setFlags(0x20000, 0x20000);
        }
        if (i != 0)
        {
            ((FrameLayout)alertcontroller.mWindow.findViewById(0x7f0d00c0)).addView(bundle, new android.view.ViewGroup.LayoutParams(-1, -1));
            if (alertcontroller.mListView != null)
            {
                ((android.widget.LinearLayout.LayoutParams)framelayout.getLayoutParams()).weight = 0.0F;
            }
        } else
        {
            framelayout.setVisibility(8);
        }
        bundle = alertcontroller.mListView;
        if (bundle != null && alertcontroller.mAdapter != null)
        {
            bundle.setAdapter(alertcontroller.mAdapter);
            i = alertcontroller.mCheckedItem;
            if (i >= 0)
            {
                bundle.setItemChecked(i, true);
                bundle.setSelection(i);
            }
        }
        ((TintTypedArray) (obj)).mWrapped.recycle();
    }

    public final boolean onKeyDown(int i, KeyEvent keyevent)
    {
        AlertController alertcontroller = mAlert;
        boolean flag;
        if (alertcontroller.mScrollView != null && alertcontroller.mScrollView.executeKeyEvent(keyevent))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public final boolean onKeyUp(int i, KeyEvent keyevent)
    {
        AlertController alertcontroller = mAlert;
        boolean flag;
        if (alertcontroller.mScrollView != null && alertcontroller.mScrollView.executeKeyEvent(keyevent))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public final void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        mAlert.setTitle(charsequence);
    }

}
