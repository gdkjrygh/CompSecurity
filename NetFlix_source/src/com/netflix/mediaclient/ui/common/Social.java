// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.app.Activity;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.Section;
import com.netflix.mediaclient.util.ViewUtils;

public class Social extends Section
{
    public static interface SocialProviderCallback
    {

        public abstract void doNotShare();

        public abstract void extendTimeoutTimer();
    }


    private static final String TAG = "playcard";
    protected SocialProviderCallback mCallback;
    private final Activity mContext;
    private boolean mIsShared;
    private boolean mIsSharingDisabled;
    private boolean mMessageVisible;
    private View mNotSharingButton;
    private View mNotSharingLabel;
    protected ImageButton mShareButton;

    public Social(Activity activity, SocialProviderCallback socialprovidercallback)
    {
        super(activity);
        mIsShared = true;
        mIsSharingDisabled = true;
        mContext = activity;
        mCallback = socialprovidercallback;
        initSocial();
    }

    private void doNotShare()
    {
        mIsShared = false;
        mCallback.extendTimeoutTimer();
        updateSharingStatusPosition(mNotSharingButton, false);
        updateSharingStatusPosition(mNotSharingLabel, true);
        if (mShareButton != null)
        {
            setDisableOverlayForImageButton(mShareButton);
        }
        if (mCallback != null)
        {
            mCallback.doNotShare();
        }
    }

    private int getMarginLeftForSharingStatus(View view)
    {
        int ai[] = new int[2];
        mShareButton.getLocationInWindow(ai);
        int j = ai[0];
        int k = mShareButton.getMeasuredWidth() / 2;
        int i = view.getMeasuredWidth();
        j = (j + k) - i / 2;
        k = ViewUtils.getDisplaySize(mContext).x;
        if (j + i > k)
        {
            Log.d("playcard", "Adjusting position of window");
            return k - i - 2;
        } else
        {
            Log.d("playcard", "No adjustment to address corner");
            return j;
        }
    }

    private void initSocial()
    {
        mShareButton = (ImageButton)mContext.findViewById(0x7f070157);
        if (mShareButton != null)
        {
            mShareButton.setOnClickListener(new android.view.View.OnClickListener() {

                final Social this$0;

                public void onClick(View view)
                {
                    Log.d("playcard", "Touch facebook!");
                    toggleMessageVisibility();
                }

            
            {
                this$0 = Social.this;
                super();
            }
            });
        } else
        {
            Log.e("playcard", "Social button not found!");
        }
        mNotSharingButton = mContext.findViewById(0x7f070168);
        mNotSharingLabel = mContext.findViewById(0x7f070169);
        if (mNotSharingButton != null)
        {
            mNotSharingButton.setOnTouchListener(new android.view.View.OnTouchListener() {

                final Social this$0;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    doNotShare();
                    return true;
                }

            
            {
                this$0 = Social.this;
                super();
            }
            });
            return;
        } else
        {
            Log.e("playcard", "Not sharing button not found!");
            return;
        }
    }

    private void toggleMessageVisibility()
    {
        boolean flag = true;
        if (!mMessageVisible)
        {
            Log.d("playcard", "Make sharing status visible");
            updateSharingStatusPosition(mNotSharingButton, true);
            updateSharingStatusPosition(mNotSharingLabel, false);
        } else
        {
            Log.d("playcard", "Make sharing status gone");
            mNotSharingButton.setVisibility(4);
            mNotSharingLabel.setVisibility(4);
        }
        if (mMessageVisible)
        {
            flag = false;
        }
        mMessageVisible = flag;
    }

    private void updateSharingStatusPosition(View view, boolean flag)
    {
        if (view != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
            int i = getMarginLeftForSharingStatus(view);
            if (i != layoutparams.leftMargin)
            {
                layoutparams.setMargins(i, layoutparams.topMargin, layoutparams.rightMargin, layoutparams.bottomMargin);
            }
            if (flag)
            {
                view.setVisibility(0);
            } else
            {
                view.setVisibility(4);
            }
            view.setLayoutParams(layoutparams);
        }
    }

    public void changeActionState(boolean flag)
    {
        if (!mIsShared && flag)
        {
            Log.d("playcard", "Ignore changeAction state enabled when user choose not to share!");
        } else
        {
            Log.d("playcard", (new StringBuilder()).append("Facebook button enable ").append(flag).toString());
            enableButton(mShareButton, flag);
            if (mNotSharingButton != null)
            {
                mNotSharingButton.setEnabled(flag);
                return;
            }
        }
    }

    public void destroy()
    {
        if (mShareButton != null)
        {
            mShareButton.setOnTouchListener(null);
        }
        if (mNotSharingButton != null)
        {
            mNotSharingButton.setOnTouchListener(null);
        }
    }

    public void hide()
    {
        if (mShareButton != null)
        {
            mShareButton.setVisibility(8);
            mShareButton.clearAnimation();
        }
        if (mNotSharingButton != null)
        {
            mNotSharingButton.setVisibility(4);
        }
        if (mNotSharingLabel != null)
        {
            mNotSharingLabel.setVisibility(4);
        }
    }

    public boolean isShared()
    {
        return mIsShared;
    }

    public void setSharingDisabled(boolean flag)
    {
        mIsSharingDisabled = flag;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        changeActionState(flag);
    }

    public void show()
    {
        if (mIsSharingDisabled || !mIsShared)
        {
            Log.d("playcard", "Facebook is disabled or not shared. Do NOT display!");
            return;
        } else
        {
            ViewUtils.setVisibility(mShareButton, true);
            updateSharingStatusPosition(mNotSharingButton, mMessageVisible);
            return;
        }
    }


}
