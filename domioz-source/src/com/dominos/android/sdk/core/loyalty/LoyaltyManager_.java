// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.loyalty;

import android.content.Context;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.android.sdk.core.loyalty:
//            LoyaltyManager, LoyaltyAPI_

public final class LoyaltyManager_ extends LoyaltyManager
{

    private static LoyaltyManager_ instance_;
    private Context context_;

    private LoyaltyManager_(Context context)
    {
        context_ = context;
    }

    public static LoyaltyManager_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new LoyaltyManager_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mLoyaltyAPI = LoyaltyAPI_.getInstance_(context_);
    }
}
