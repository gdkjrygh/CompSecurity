// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bls extends bsr
{

    private blq a;

    bls(blq blq1, String s)
    {
        a = blq1;
        super(s);
    }

    public final mtf a(String s)
    {
        if (!blq.b(a).a())
        {
            return null;
        } else
        {
            s = a.c.c.p;
            blq.a(a, s);
            can can1 = blq.d(a);
            int i = blq.c(a).d();
            byte abyte0[] = b.a(s);
            String s1 = a.c.b.p;
            String s2 = a.c.b.X;
            return new cam(can1.a, can1.b, i, s, abyte0, s1, s2);
        }
    }

    public final boolean a(String s, mue mue)
    {
        return blq.a(a, mue);
    }
}
