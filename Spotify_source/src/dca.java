// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dca
    implements Cloneable
{

    public String a;
    public String b;
    public String c;
    public String d;
    public Integer e;
    public Long f;
    public String g;

    public dca()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
    }

    public final Object clone()
    {
        dca dca1 = new dca();
        dca1.a = a;
        dca1.b = b;
        dca1.c = c;
        dca1.d = d;
        dca1.e = e;
        dca1.f = f;
        dca1.g = g;
        return dca1;
    }
}
