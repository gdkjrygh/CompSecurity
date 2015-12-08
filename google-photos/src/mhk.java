// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mhk
{

    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private final String h;

    public mhk(String s)
    {
        b = true;
        e = true;
        f = true;
        h = s;
    }

    public mhk(mhj mhj1)
    {
        b = true;
        e = true;
        f = true;
        h = mhj1.a;
        a = mhj1.b;
        b = mhj1.c;
        c = mhj1.d;
        d = mhj1.e;
        e = mhj1.f;
        f = mhj1.g;
        g = mhj1.h;
    }

    public final mhj a()
    {
        return new mhj(h, a, b, c, d, e, f, g);
    }
}
