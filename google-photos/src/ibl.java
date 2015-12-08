// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ibl
    implements oaa
{

    private ibi a;

    ibl(ibi ibi1)
    {
        a = ibi1;
        super();
    }

    public final boolean a(nzw nzw, Object obj)
    {
        if (!ibi.a(a).b())
        {
            return false;
        } else
        {
            nzw = ibi.b(a);
            nwc nwc1 = ibi.a(a).c;
            boolean flag = ((Boolean)obj).booleanValue();
            icj icj1 = nzw.a();
            boolean flag1 = nwc1.c;
            icj1.a.b = icj.a(flag1, flag);
            nzw.a(icj1);
            ibi.c(a).a(Boolean.valueOf(((Boolean)obj).booleanValue()));
            return true;
        }
    }
}
