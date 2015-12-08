// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            i

public final class h extends i
{

    public h()
    {
        a("&t", "event");
    }

    public h(String s, String s1)
    {
        this();
        a("&ec", s);
        a("&ea", s1);
    }

    public final volatile Map a()
    {
        return super.a();
    }
}
