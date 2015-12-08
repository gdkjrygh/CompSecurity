// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jco
    implements jcx
{

    private jcm a;

    jco(jcm jcm1)
    {
        a = jcm1;
        super();
    }

    public final void a()
    {
        jcm.c(a).c();
    }

    public final void a(int i, int j)
    {
        double d = (double)i / (double)j;
        jcm.c(a).a(a.a(b.BY, new Object[] {
            Integer.valueOf(j - i)
        })).a(false).a(d);
    }

    public final void a(ekq ekq)
    {
        if (jcm.d(a).a())
        {
            jcm.d(a);
            noy.a("mediaCollection", ekq);
        }
        jcm.e(a).a(new ele(ekq, ekw.a, jcm.b(a).a(), b.BV));
        jcm.c(a).a(true);
    }
}
