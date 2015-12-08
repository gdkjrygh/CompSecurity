// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fwo
    implements lzy
{

    private fwm a;

    public fwo(fwm fwm1)
    {
        a = fwm1;
        super();
    }

    public final void a(lzx lzx)
    {
        boolean flag1 = true;
        lzx = (mhn)lzx;
        Object obj = lzx.a();
        boolean flag;
        boolean flag2;
        if (obj != null && ((mhm) (obj)).a() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = a;
        flag2 = lzx.r().a();
        lzx = ((fwm) (obj)).d;
        if (!flag2 || !flag)
        {
            flag1 = false;
        }
        lzx.a(flag1);
        if (flag2 && flag)
        {
            ((fwm) (obj)).c.b(((fwm) (obj)).b).a(((fwm) (obj)).e);
            return;
        } else
        {
            ((fwm) (obj)).d.b();
            return;
        }
    }
}
