// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.Context;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.pebble:
//            PebbleManager, PebbleSession_

public final class PebbleManager_ extends PebbleManager
{

    private static PebbleManager_ instance_;
    private Context context_;

    private PebbleManager_(Context context)
    {
        super(context);
        context_ = context;
    }

    public static PebbleManager_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new PebbleManager_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        prefs = new DominosPrefs_(context_);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context_);
        powerRestClient = PowerRestClient_.getInstance_(context_);
        mPebbleSession = PebbleSession_.getInstance_(context_);
        initialize();
    }
}
