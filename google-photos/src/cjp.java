// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cjp
    implements cje
{

    private final cje a;
    private final cod b;

    public cjp(cje cje1, cod cod1)
    {
        a = (cje)b.a(cje1, "source", null);
        b = (cod)b.a(cod1, "interval", null);
    }

    private void a(cix cix1)
    {
        a.a(cix1);
    }

    public final void a()
    {
        a.a();
    }

    public final volatile void a(Object obj)
    {
        a((cix)obj);
    }

    public final Object b()
    {
        cix cix1 = (cix)a.b();
        if (cix1 == null)
        {
            return null;
        }
        int k = cix1.h;
        long l = cix1.a;
        long l1 = cix1.a - b.b(k, cix1.c, cix1.e, cix1.d);
        int j = cix1.g;
        int i;
        if (l1 < b.b)
        {
            i = Math.min(b.a(b.b - l1, cix1.c, cix1.e, cix1.d), k);
            j += i;
            i = k - i;
        } else
        {
            i = k;
        }
        if (l > b.c)
        {
            i = Math.max(0, k - b.a(l - b.c, cix1.c, cix1.e, cix1.d) - j);
        }
        if (i == 0 && !cix1.b)
        {
            a(cix1);
            return null;
        } else
        {
            cix1.g = j;
            cix1.h = i;
            return cix1;
        }
    }
}
