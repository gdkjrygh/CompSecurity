// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ibj
    implements oaa
{

    private ibi a;

    ibj(ibi ibi1)
    {
        a = ibi1;
        super();
    }

    public final boolean a(nzw nzw, Object obj)
    {
        if (!ibi.a(a).b())
        {
            return false;
        }
        nwc nwc1;
        icj icj1;
        boolean flag;
        boolean flag1;
        if (!((Boolean)obj).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        nzw = ibi.b(a);
        nwc1 = ibi.a(a).c;
        icj1 = nzw.a();
        flag1 = nwc1.d;
        icj1.a.f = icj.a(flag1, flag);
        nzw.a(icj1);
        ibi.c(a).a(Boolean.valueOf(((Boolean)obj).booleanValue()));
        return true;
    }
}
