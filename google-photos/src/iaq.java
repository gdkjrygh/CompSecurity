// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class iaq
    implements oaa
{

    private iao a;

    iaq(iao iao1)
    {
        a = iao1;
        super();
    }

    public final boolean a(nzw nzw, Object obj)
    {
        if (!iao.a(a).b())
        {
            return false;
        }
        nzw = iao.b(a);
        nwc nwc1 = iao.a(a).c;
        boolean flag1 = ((Boolean)obj).booleanValue();
        boolean flag;
        if (!nwc1.g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        nzw.a(flag, nwc1.h, flag1);
        iao.c(a).a(Boolean.valueOf(((Boolean)obj).booleanValue()));
        return true;
    }
}
