// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.n;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            d

public static class a extends a
{

    public a a(String s)
    {
        a("&exd", s);
        return this;
    }

    public a a(boolean flag)
    {
        a("&exf", n.a(flag));
        return this;
    }

    public volatile Map a()
    {
        return super.a();
    }

    public rnal.n()
    {
        a("&t", "exception");
    }
}
