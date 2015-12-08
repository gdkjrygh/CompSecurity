// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ibk
    implements oaa
{

    private ibi a;

    ibk(ibi ibi1)
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
            boolean flag = ((Boolean)obj).booleanValue();
            nzw = ibi.b(a);
            obj = ibi.a(a).c;
            icj icj1 = nzw.a();
            boolean flag1 = ((nwc) (obj)).f;
            icj1.a.c = icj.a(flag1, flag);
            nzw.a(icj1);
            mtj.a(ibi.d(a), new ibm(ibi.e(a)));
            ibi.c(a).a(Boolean.valueOf(flag));
            return true;
        }
    }
}
