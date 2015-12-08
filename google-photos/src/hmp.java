// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hmp
    implements mxe
{

    private hmn a;

    hmp(hmn hmn1)
    {
        a = hmn1;
        super();
    }

    public final void v()
    {
        hmn.b(a).a(true);
        hmn.c(a).a(false);
        hmn.d(a).v();
    }

    public final void w()
    {
        hmn.b(a).a(true);
        hmn.d(a).a();
    }

    public final void x()
    {
        hmn.b(a).a(false);
        hmn.d(a).a();
    }
}
