// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            i

public class h extends i
{

    public h()
    {
        a("&t", "event");
    }

    public h a(String s)
    {
        a("&ec", s);
        return this;
    }

    public volatile Map a()
    {
        return super.a();
    }

    public h b(String s)
    {
        a("&ea", s);
        return this;
    }

    public h c(String s)
    {
        a("&el", s);
        return this;
    }
}
