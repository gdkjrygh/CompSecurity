// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import com.skype.telemetry.sdk.FlurryAccessInterface;
import java.util.HashMap;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.analytics:
//            Analytics, AnalyticsEvent, AnalyticsParameterContainer

final class c
    implements Callable
{

    final AnalyticsEvent a;
    final Object b;
    final boolean c;
    final Analytics d;

    public final Object call()
        throws Exception
    {
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("ID", Integer.toString(a.a()));
        if (!(b instanceof String) || ((String)b).length() <= 0) goto _L2; else goto _L1
_L1:
        hashmap.put("VALUE", (String)b);
_L4:
        Analytics.a(d).a(a.name(), hashmap, c);
        return Boolean.valueOf(true);
_L2:
        if (b instanceof Integer)
        {
            hashmap.put("VALUE", Integer.toString(((Integer)b).intValue()));
        } else
        if (b instanceof Long)
        {
            hashmap.put("VALUE", Long.toString(((Long)b).longValue()));
        } else
        if (b instanceof AnalyticsParameterContainer)
        {
            ((AnalyticsParameterContainer)b).a(hashmap);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    nt(Analytics analytics, AnalyticsEvent analyticsevent, Object obj, boolean flag)
    {
        d = analytics;
        a = analyticsevent;
        b = obj;
        c = flag;
        super();
    }
}
