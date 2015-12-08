// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycVerifyingIdentityActivity

final class val.background
    implements android.view.ner
{

    final KycVerifyingIdentityActivity this$0;
    final ImageView val$background;

    public final boolean onPreDraw()
    {
        findViewById(com.google.android.apps.walletnfcrel.ViewById).getViewTreeObserver().removeOnPreDrawListener(this);
        loadingAnimator = ObjectAnimator.ofFloat(val$background, View.ROTATION, new float[] {
            0.0F, 360F
        });
        loadingAnimator.setInterpolator(new LinearInterpolator());
        loadingAnimator.setRepeatCount(-1);
        loadingAnimator.setDuration(700L);
        loadingAnimator.start();
        return true;
    }

    ()
    {
        this$0 = final_kycverifyingidentityactivity;
        val$background = ImageView.this;
        super();
    }
}
