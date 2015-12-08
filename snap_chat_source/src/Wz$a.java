// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class b
    implements lang.Object
{

    private a a;
    private long b;
    private Wz c;

    public final void a(int i)
    {
        i = (int)((((b * (long)i) / 100L + c.e) * 100L) / c.c);
        if ((long)i != c.f)
        {
            c.f = i;
            a.a(i);
        }
    }

    public >(Wz wz, Wt wt, t t)
    {
        c = wz;
        super();
        a = t;
        b = wt.a();
    }
}
