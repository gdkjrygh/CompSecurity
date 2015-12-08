// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class iap
    implements oaa
{

    private iao a;

    iap(iao iao1)
    {
        a = iao1;
        super();
    }

    public final boolean a(nzw nzw, Object obj)
    {
        if (!iao.a(a).b())
        {
            return false;
        } else
        {
            nzw = iao.b(a);
            nwc nwc1 = iao.a(a).c;
            boolean flag = ((Boolean)obj).booleanValue();
            icj icj1 = nzw.a();
            boolean flag1 = nwc1.a;
            icj1.a.a = icj.a(flag1, flag);
            nzw.a(icj1);
            iao.c(a).a(Boolean.valueOf(((Boolean)obj).booleanValue()));
            return true;
        }
    }
}
