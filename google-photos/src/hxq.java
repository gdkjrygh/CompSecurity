// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hxq
    implements nug
{

    private hxo a;

    hxq(hxo hxo1)
    {
        a = hxo1;
        super();
    }

    public final void b_(Object obj)
    {
        obj = (hxh)obj;
        boolean flag;
        if (((hxh) (obj)).d == hxi.b || ((hxh) (obj)).d == hxi.c && ((hxh) (obj)).e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            hxo.d(a).a(hxo.b(a), hxo.c(a));
        }
    }
}
