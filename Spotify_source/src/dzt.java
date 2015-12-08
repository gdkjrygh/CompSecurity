// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dzt
    implements dd
{

    int a;
    da b;
    boolean c;
    boolean d;
    private an e;

    private dzt(int i, an an1)
    {
        a = i;
        b = an1.a(null);
        e = an1;
    }

    dzt(int i, an an1, byte byte0)
    {
        this(i, an1);
    }

    public final void a()
    {
        if (d)
        {
            d = false;
            b.a(this);
        }
        b.p();
        e.a();
    }

    public final void a(Object obj)
    {
        e.a(obj);
    }
}
