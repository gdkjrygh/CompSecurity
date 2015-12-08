// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tapandpay.ui;

import android.content.Intent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import com.google.common.base.Throwables;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.apps.wallet.tapandpay.ui:
//            TapCompletedActivity

final class this._cls0
    implements android.view.animation.ener
{

    final TapCompletedActivity this$0;

    public final void onAnimationEnd(Animation animation)
    {
        findViewById(com.google.android.apps.walletnfcrel.vity.findViewById).animate().alpha(0.0F).setDuration(0x10e0000L);
        animation = getIntent().getByteArrayExtra("NFC_TAP_EVENT");
        if (TapCompletedActivity.access$200(TapCompletedActivity.this))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        analyticsUtil.sendNfcEvent("TapAndPayDetailsUnknown", new AnalyticsCustomDimension[0]);
        accessibilityUtil.announce(TapCompletedActivity.access$100(TapCompletedActivity.this), com.google.android.apps.walletnfcrel.accessibility_unknown);
        purchaseRecord = PurchaseRecord.from((com.google.wallet.proto.apEvent)MessageNano.mergeFrom(new com.google.wallet.proto.apEvent(), animation), TapCompletedActivity.this, com.google.android.apps.walletnfcrel.s_merchant);
_L1:
        TapCompletedActivity.access$300(TapCompletedActivity.this);
        return;
        try
        {
            analyticsUtil.sendNfcEvent("TapAndPayDetailsFetched", new AnalyticsCustomDimension[0]);
            accessibilityUtil.announce(TapCompletedActivity.access$100(TapCompletedActivity.this), com.google.android.apps.walletnfcrel.accessibility_unknown);
        }
        // Misplaced declaration of an exception variable
        catch (Animation animation)
        {
            throw Throwables.propagate(animation);
        }
          goto _L1
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        TapCompletedActivity.access$100(TapCompletedActivity.this).clearAnimation();
        TapCompletedActivity.access$100(TapCompletedActivity.this).setVisibility(4);
    }

    ()
    {
        this$0 = TapCompletedActivity.this;
        super();
    }
}
