// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.braintreepayments.api.dropin.view:
//            SecureLoadingProgressBar

public class LoadingHeader extends RelativeLayout
{

    private HeaderState mCurrentState;
    private TextView mHeaderMessage;
    private SecureLoadingProgressBar mLoadingSpinner;
    private ImageView mStatusIcon;

    public LoadingHeader(Context context)
    {
        super(context);
        init(context);
    }

    public LoadingHeader(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context);
    }

    public LoadingHeader(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private View findView(int i)
    {
        return findViewById(i);
    }

    private void init(Context context)
    {
        inflate(context, com.braintreepayments.api.dropin.R.layout.bt_loading_header, this);
        mLoadingSpinner = (SecureLoadingProgressBar)findView(com.braintreepayments.api.dropin.R.id.bt_header_loading_spinner);
        mStatusIcon = (ImageView)findView(com.braintreepayments.api.dropin.R.id.bt_header_status_icon);
        mHeaderMessage = (TextView)findView(com.braintreepayments.api.dropin.R.id.bt_header_message);
    }

    public HeaderState getCurrentState()
    {
        return mCurrentState;
    }

    public void setError(String s)
    {
        mCurrentState = HeaderState.ERROR;
        mLoadingSpinner.setVisibility(8);
        mHeaderMessage.setVisibility(8);
        mHeaderMessage.setText(s);
        setBackgroundColor(getResources().getColor(com.braintreepayments.api.dropin.R.color.bt_red));
        mStatusIcon.setImageResource(com.braintreepayments.api.dropin.R.drawable.bt_error);
        mStatusIcon.setVisibility(0);
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setInterpolator(new DecelerateInterpolator());
        alphaanimation.setStartOffset(500L);
        alphaanimation.setDuration(200L);
        s = new AnimationSet(false);
        s.addAnimation(alphaanimation);
        s.setRepeatMode(0);
        s.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final LoadingHeader this$0;

            public void onAnimationEnd(Animation animation)
            {
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
                mHeaderMessage.setVisibility(0);
            }

            
            {
                this$0 = LoadingHeader.this;
                super();
            }
        });
        alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setInterpolator(new AccelerateInterpolator());
        alphaanimation.setDuration(500L);
        AnimationSet animationset = new AnimationSet(false);
        animationset.addAnimation(alphaanimation);
        animationset.setRepeatMode(0);
        animationset.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final LoadingHeader this$0;

            public void onAnimationEnd(Animation animation)
            {
                mStatusIcon.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = LoadingHeader.this;
                super();
            }
        });
        mStatusIcon.setAnimation(animationset);
        mHeaderMessage.setAnimation(s);
        setVisibility(0);
    }

    public void setLoading()
    {
        mCurrentState = HeaderState.LOADING;
        mStatusIcon.setVisibility(8);
        mHeaderMessage.setVisibility(8);
        setBackgroundColor(getResources().getColor(com.braintreepayments.api.dropin.R.color.bt_white));
        mLoadingSpinner.setVisibility(0);
        setVisibility(0);
    }

    public void setSuccessful()
    {
        mCurrentState = HeaderState.SUCCESS;
        mLoadingSpinner.setVisibility(8);
        mHeaderMessage.setVisibility(8);
        setBackgroundColor(getResources().getColor(com.braintreepayments.api.dropin.R.color.bt_blue));
        mStatusIcon.setImageResource(com.braintreepayments.api.dropin.R.drawable.bt_success);
        mStatusIcon.setVisibility(0);
        setVisibility(0);
    }



    private class HeaderState extends Enum
    {

        private static final HeaderState $VALUES[];
        public static final HeaderState ERROR;
        public static final HeaderState LOADING;
        public static final HeaderState SUCCESS;

        public static HeaderState valueOf(String s)
        {
            return (HeaderState)Enum.valueOf(com/braintreepayments/api/dropin/view/LoadingHeader$HeaderState, s);
        }

        public static HeaderState[] values()
        {
            return (HeaderState[])$VALUES.clone();
        }

        static 
        {
            LOADING = new HeaderState("LOADING", 0);
            SUCCESS = new HeaderState("SUCCESS", 1);
            ERROR = new HeaderState("ERROR", 2);
            $VALUES = (new HeaderState[] {
                LOADING, SUCCESS, ERROR
            });
        }

        private HeaderState(String s, int i)
        {
            super(s, i);
        }
    }

}
