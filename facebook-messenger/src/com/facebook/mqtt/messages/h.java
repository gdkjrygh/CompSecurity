// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt.messages;


// Referenced classes of package com.facebook.mqtt.messages:
//            i, k

public class h
{

    private final k a;
    private final boolean b;
    private final int c;
    private final boolean d;
    private final int e;

    h(i j)
    {
        a = j.a();
        b = j.b();
        c = j.c();
        d = j.d();
        e = j.e();
    }

    public static i newBuilder()
    {
        return new i();
    }

    public k a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public int e()
    {
        return e;
    }
}
