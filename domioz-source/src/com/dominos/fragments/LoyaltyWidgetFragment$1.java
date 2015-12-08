// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;

// Referenced classes of package com.dominos.fragments:
//            LoyaltyWidgetFragment

class Callback extends com.dominos.android.sdk.core.loyalty.edemptionCallback
{

    final LoyaltyWidgetFragment this$0;
    final demptionSource val$source;

    public void onInvalidRedemption(com.dominos.android.sdk.core.loyalty.demptionCause demptioncause)
    {
        switch (.SwitchMap.com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause[demptioncause.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            mActivityHelper.showAlert(AlertType.NON_LOYALTY_STORE, LoyaltyWidgetFragment.access$000(LoyaltyWidgetFragment.this));
            disableRedemption();
            return;

        case 2: // '\002'
            mActivityHelper.showAlert(AlertType.LOYALTY_REDEMPTION_LIMIT, String.valueOf(mLoyaltyManger.getBaseCouponLimit()), null, LoyaltyWidgetFragment.access$000(LoyaltyWidgetFragment.this), null);
            return;

        case 3: // '\003'
            mActivityHelper.showAlert(AlertType.LOYALTY_CANNOT_REDEEM, LoyaltyWidgetFragment.access$000(LoyaltyWidgetFragment.this));
            return;

        case 4: // '\004'
            LoyaltyWidgetFragment.access$100(LoyaltyWidgetFragment.this, val$source);
            return;

        case 5: // '\005'
            mActivityHelper.showAlert(AlertType.LOYALTY_NOT_ENOUGH_POINTS, LoyaltyWidgetFragment.access$000(LoyaltyWidgetFragment.this));
            return;

        case 6: // '\006'
            mActivityHelper.showAlert(AlertType.LOYALTY_CANNOT_REDEEM, LoyaltyWidgetFragment.access$000(LoyaltyWidgetFragment.this));
            break;
        }
    }

    public void onValidRedemption()
    {
        LoyaltyWidgetFragment.access$200(LoyaltyWidgetFragment.this, val$source);
    }

    demptionSource()
    {
        this$0 = final_loyaltywidgetfragment;
        val$source = demptionSource.this;
        super();
    }
}
