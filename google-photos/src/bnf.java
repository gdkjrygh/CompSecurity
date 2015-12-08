// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bnf extends bxh
{

    private bne a;

    transient bnf(bne bne1, bmb bmb, bxg abxg[])
    {
        a = bne1;
        super(bmb, abxg);
    }

    public final void b()
    {
        c();
        if (c.c.d)
        {
            bne bne1 = a;
            boolean flag;
            if (c.b.ae || c.b.af)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bne1.e = flag;
            a.b();
        }
    }
}
