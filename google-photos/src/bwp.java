// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bwp extends bsr
{

    private bwn a;

    bwp(bwn bwn1, String s)
    {
        a = bwn1;
        super(s);
    }

    public final mtf a(String s)
    {
        cst cst = bwn.k(a).c.r;
        c.a(cst, "musicLibrary", null);
        return new bwv(s, cst);
    }

    public final boolean a(String s, mue mue)
    {
        bwn.m(a).a(bwn.l(a).c.r);
        return true;
    }
}
