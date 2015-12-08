// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class blx extends blz
{

    public blx()
    {
        a("&t", "event");
    }

    public blx(String s, String s1)
    {
        this();
        a("&ec", s);
        a("&ea", s1);
    }

    public final blx a(String s)
    {
        a("&el", s);
        return this;
    }

    public final volatile Map a()
    {
        return super.a();
    }
}
