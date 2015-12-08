// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fzf
{

    final String a;
    final boolean b;
    final boolean c;

    public fzf(ekp ekp1)
    {
        boolean flag1 = true;
        super();
        p.a(ekp1);
        Object obj = (fzz)ekp1.b(fzz);
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        if (b)
        {
            obj = ((fzz) (obj)).a;
        } else
        {
            obj = null;
        }
        a = ((String) (obj));
        ekp1 = (gfn)ekp1.b(gfn);
        if (ekp1 != null && ekp1.g())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
