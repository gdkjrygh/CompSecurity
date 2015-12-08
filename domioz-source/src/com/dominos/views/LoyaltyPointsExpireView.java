// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.DateFormatUtil;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;

public class LoyaltyPointsExpireView extends LinearLayout
{

    private LoyaltyManager mLoyaltyManager;
    TextView mLoyaltyPointsExpire;
    MobileSession mMobileSession;

    public LoyaltyPointsExpireView(Context context)
    {
        super(context);
    }

    public void afterInject()
    {
        mLoyaltyManager = (LoyaltyManager)mMobileSession.getManager("loyalty_manager");
    }

    public void afterViews()
    {
        String s = DateFormatUtil.formatFromApiToUsFormat(mLoyaltyManager.getExpirationDate());
        mLoyaltyPointsExpire.setText(getResources().getString(0x7f08034a, new Object[] {
            s
        }));
    }
}
