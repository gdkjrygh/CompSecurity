// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.mediaclient.util.gfx.AnimationUtils;

public class ErrorWrapper
{
    public static interface Callback
    {

        public abstract void onRetryRequested();
    }


    private static final String TAG = "ErrorWrapper";
    private final Callback callback;
    private final View errorGroup;
    private final TextView errorMsg;
    private final Button retryBtn;
    private final android.view.View.OnClickListener retryClickListener = new android.view.View.OnClickListener() {

        final ErrorWrapper this$0;

        public void onClick(View view1)
        {
            Log.v("ErrorWrapper", "Retry requested");
            if (callback != null)
            {
                callback.onRetryRequested();
            }
        }

            
            {
                this$0 = ErrorWrapper.this;
                super();
            }
    };
    private boolean showRetry;

    public ErrorWrapper(View view, Callback callback1)
    {
        showRetry = true;
        callback = callback1;
        errorGroup = view.findViewById(0x7f070096);
        errorMsg = (TextView)view.findViewById(0x7f070097);
        retryBtn = (Button)errorGroup.findViewById(0x7f070098);
        retryBtn.setOnClickListener(retryClickListener);
        if (view.getContext() instanceof NetflixActivity)
        {
            view = (NetflixActivity)view.getContext();
            if (view.isForKids())
            {
                configureViewsForKidsExperience(view);
            }
        }
        setRetryVisibility();
    }

    private void configureViewsForKidsExperience(NetflixActivity netflixactivity)
    {
        netflixactivity = netflixactivity.getResources();
        errorMsg.setTextColor(netflixactivity.getColor(0x7f090032));
        ViewUtils.setTextViewSizeByRes(errorMsg, 0x7f0a002e);
        ViewUtils.setTextViewToBold(errorMsg);
        android.view.ViewGroup.LayoutParams layoutparams = retryBtn.getLayoutParams();
        layoutparams.height = netflixactivity.getDimensionPixelSize(0x7f0a007a);
        layoutparams.width = netflixactivity.getDimensionPixelSize(0x7f0a0079);
        retryBtn.setBackgroundResource(0x7f0200ed);
        retryBtn.setTextColor(netflixactivity.getColor(0x7f090035));
        ViewUtils.setTextViewSizeByRes(retryBtn, 0x7f0a0033);
        ViewUtils.setTextViewToBold(retryBtn);
    }

    private void setRetryVisibility()
    {
        Button button = retryBtn;
        byte byte0;
        if (callback == null || !showRetry)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        button.setVisibility(byte0);
    }

    public TextView getErrorMessageTextView()
    {
        return errorMsg;
    }

    public void hide(boolean flag)
    {
        AnimationUtils.hideView(errorGroup, flag);
    }

    public void showErrorView(int i, boolean flag, boolean flag1)
    {
        errorMsg.setText(i);
        showRetry = flag;
        AnimationUtils.showView(errorGroup, flag1);
        setRetryVisibility();
    }

    public void showErrorView(boolean flag)
    {
        AnimationUtils.showView(errorGroup, flag);
        setRetryVisibility();
    }

}
