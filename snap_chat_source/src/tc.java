// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class tc
{

    final int a;
    final int b;
    final int c;
    private final boolean d;
    private final int e;
    private final int f;

    public tc(Tv tv, boolean flag)
    {
        d = flag;
        a = tv.c().intValue();
        Integer integer;
        int i;
        if (tv.g())
        {
            integer = tv.f();
        } else
        {
            integer = tv.c();
        }
        e = integer.intValue();
        if (tv.b())
        {
            i = tv.a().intValue();
        } else
        {
            i = 1;
        }
        f = i;
        if (tv.e())
        {
            i = tv.d().intValue();
        } else
        {
            i = 0;
        }
        b = i;
        if (flag)
        {
            i = f;
        } else
        {
            i = e;
        }
        c = i;
    }

    public final String toString()
    {
        return ds.a(getClass()).a("isResume", d).a("interval", a).a("minSnapsAfterAd", b).a("firstAllowedIndex", c).toString();
    }
}
