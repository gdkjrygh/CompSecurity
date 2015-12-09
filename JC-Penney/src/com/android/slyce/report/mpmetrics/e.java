// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.util.Log;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            aj, ab, af, ak, 
//            d

class e
    implements aj
{

    final String a;
    final d b;

    e(d d, String s)
    {
        b = d;
        a = s;
        super();
    }

    public void a(af af1)
    {
        if (ab.a)
        {
            Log.v("MixpanelAPI.AnalyticsMessages", (new StringBuilder()).append("Using existing pushId ").append(a).toString());
        }
        af1.c().b(a);
    }
}
