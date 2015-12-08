// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            d

public static final class a extends a
{

    public final a a(long l)
    {
        a("&utt", Long.toString(l));
        return this;
    }

    public final a a(String s)
    {
        a("&utv", s);
        return this;
    }

    public final volatile Map a()
    {
        return super.a();
    }

    public final a b(String s)
    {
        a("&utc", s);
        return this;
    }

    public final a c(String s)
    {
        a("&utl", s);
        return this;
    }

    public ()
    {
        a("&t", "timing");
    }
}
