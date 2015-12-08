// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;
import com.dominos.android.sdk.core.analytics.AnalyticsService_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;

// Referenced classes of package com.dominos.utils:
//            AnalyticsUtil

public final class AnalyticsUtil_ extends AnalyticsUtil
{

    private Context context_;

    private AnalyticsUtil_(Context context)
    {
        context_ = context;
        init_();
    }

    public static AnalyticsUtil_ getInstance_(Context context)
    {
        return new AnalyticsUtil_(context);
    }

    private void init_()
    {
        prefs = new DominosPrefs_(context_);
        mAnalyticsService = AnalyticsService_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
