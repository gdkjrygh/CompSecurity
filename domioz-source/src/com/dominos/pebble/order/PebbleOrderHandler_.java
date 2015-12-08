// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble.order;

import android.content.Context;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.pebble.PebbleManager_;
import com.dominos.pebble.PebbleRequestManager_;
import com.dominos.pebble.PebbleSession_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.pebble.order:
//            PebbleOrderHandler

public final class PebbleOrderHandler_ extends PebbleOrderHandler
{

    private static PebbleOrderHandler_ instance_;
    private Context context_;

    private PebbleOrderHandler_(Context context)
    {
        super(context);
        context_ = context;
    }

    public static PebbleOrderHandler_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new PebbleOrderHandler_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mRequestManager = PebbleRequestManager_.getInstance_(context_);
        mPebbleManager = PebbleManager_.getInstance_(context_);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context_);
        mOrderUtil = OrderUtil_.getInstance_(context_);
        mPebbleSession = PebbleSession_.getInstance_(context_);
        mPowerRestClient = PowerRestClient_.getInstance_(context_);
        onAfterInject();
    }
}
