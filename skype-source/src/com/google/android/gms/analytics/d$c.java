// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.m;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            d

public static final class a extends a
{

    public final a a(String s)
    {
        a("&exd", s);
        return this;
    }

    public final a a(boolean flag)
    {
        a("&exf", m.a(flag));
        return this;
    }

    public final volatile Map a()
    {
        return super.a();
    }

    public rnal.m()
    {
        a("&t", "exception");
    }
}
