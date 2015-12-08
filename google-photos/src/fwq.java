// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fwq
    implements lzy
{

    private fwm a;

    public fwq(fwm fwm1)
    {
        a = fwm1;
        super();
    }

    public final void a(lzx lzx)
    {
        Object obj = (mho)lzx;
        lzx = a;
        boolean flag = ((mho) (obj)).r().a();
        obj = ((mho) (obj)).a();
        if (flag)
        {
            ((fwm) (lzx)).a.a(((mhp) (obj)));
            ((fwm) (lzx)).d.a(((mhp) (obj)));
            return;
        } else
        {
            ((fwm) (lzx)).d.b();
            return;
        }
    }
}
