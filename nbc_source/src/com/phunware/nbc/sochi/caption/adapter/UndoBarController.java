// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

public class UndoBarController
{
    public static interface UndoListener
    {

        public abstract void onUndo(Parcelable parcelable);
    }


    private ViewPropertyAnimator mBarAnimator;
    private final View mBarView;
    private final Handler mHideHandler = new Handler();
    private final Runnable mHideRunnable = new Runnable() {

        final UndoBarController this$0;

        public void run()
        {
            hideUndoBar(false);
        }

            
            {
                this$0 = UndoBarController.this;
                super();
            }
    };
    private final TextView mMessageView;
    private final UndoListener mUndoListener;
    private CharSequence mUndoMessage;
    private Parcelable mUndoToken;

    public UndoBarController(View view, UndoListener undolistener)
    {
        mBarView = view;
        initAnimations();
        mUndoListener = undolistener;
        mMessageView = (TextView)mBarView.findViewById(0x7f0f008b);
        mBarView.findViewById(0x7f0f008c).setOnClickListener(new android.view.View.OnClickListener() {

            final UndoBarController this$0;

            public void onClick(View view1)
            {
                hideUndoBar(false);
                mUndoListener.onUndo(mUndoToken);
            }

            
            {
                this$0 = UndoBarController.this;
                super();
            }
        });
        hideUndoBar(true);
    }

    private void initAnimations()
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            mBarAnimator = mBarView.animate();
        }
    }

    private void internalHideUndoBar()
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            mBarAnimator.cancel();
            mBarAnimator.alpha(0.0F).setDuration(mBarView.getResources().getInteger(0x10e0000)).setListener(new AnimatorListenerAdapter() {

                final UndoBarController this$0;

                public void onAnimationEnd(Animator animator)
                {
                    mBarView.setVisibility(8);
                    mUndoMessage = null;
                    mUndoToken = null;
                }

            
            {
                this$0 = UndoBarController.this;
                super();
            }
            });
            return;
        } else
        {
            mBarView.setVisibility(8);
            return;
        }
    }

    private void internalHideUndoBarImmediate()
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            mBarView.setAlpha(0.0F);
            return;
        } else
        {
            mBarView.setVisibility(8);
            return;
        }
    }

    private void internalShowUndoBar(boolean flag)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 12)
            {
                if (!flag)
                {
                    break label0;
                }
                mBarView.setAlpha(1.0F);
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            mBarAnimator.cancel();
        }
        mBarAnimator.alpha(1.0F).setDuration(mBarView.getResources().getInteger(0x10e0000)).setListener(null);
    }

    public void hideUndoBar(boolean flag)
    {
        mHideHandler.removeCallbacks(mHideRunnable);
        if (flag)
        {
            mBarView.setVisibility(8);
            internalHideUndoBarImmediate();
            mUndoMessage = null;
            mUndoToken = null;
            return;
        } else
        {
            internalHideUndoBar();
            return;
        }
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            mUndoMessage = bundle.getCharSequence("undo_message");
            mUndoToken = bundle.getParcelable("undo_token");
            if (mUndoToken != null || !TextUtils.isEmpty(mUndoMessage))
            {
                showUndoBar(true, mUndoMessage, mUndoToken);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putCharSequence("undo_message", mUndoMessage);
        bundle.putParcelable("undo_token", mUndoToken);
    }

    public void showUndoBar(boolean flag, CharSequence charsequence, Parcelable parcelable)
    {
        mUndoToken = parcelable;
        mUndoMessage = charsequence;
        mMessageView.setText(mUndoMessage);
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, mBarView.getResources().getInteger(0x7f0c000e));
        mBarView.setVisibility(0);
        internalShowUndoBar(flag);
    }



/*
    static Parcelable access$002(UndoBarController undobarcontroller, Parcelable parcelable)
    {
        undobarcontroller.mUndoToken = parcelable;
        return parcelable;
    }

*/




/*
    static CharSequence access$302(UndoBarController undobarcontroller, CharSequence charsequence)
    {
        undobarcontroller.mUndoMessage = charsequence;
        return charsequence;
    }

*/
}
