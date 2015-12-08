// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.braintreepayments.api.dropin.utils.LoadingSpinnerInterpolator;

public class SecureLoadingProgressBar extends RelativeLayout
{

    public SecureLoadingProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context);
    }

    public SecureLoadingProgressBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private void init(Context context)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(13);
        Object obj = (ProgressBar)inflate(context, com.braintreepayments.api.dropin.R.layout.bt_secure_loading_progress_bar, null);
        ((ProgressBar) (obj)).setIndeterminate(true);
        ((ProgressBar) (obj)).setIndeterminateDrawable(context.getResources().getDrawable(com.braintreepayments.api.dropin.R.drawable.bt_loading_animation));
        ((ProgressBar) (obj)).setInterpolator(new LoadingSpinnerInterpolator());
        ((ProgressBar) (obj)).setLayoutParams(layoutparams);
        addView(((android.view.View) (obj)));
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(13);
        obj = new ImageView(context);
        ((ImageView) (obj)).setImageDrawable(context.getResources().getDrawable(com.braintreepayments.api.dropin.R.drawable.bt_secure));
        ((ImageView) (obj)).setLayoutParams(layoutparams);
        ((ImageView) (obj)).setPadding(0, 0, 0, 4);
        addView(((android.view.View) (obj)));
    }
}
