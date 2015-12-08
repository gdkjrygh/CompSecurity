// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class kxn
    implements lab
{

    private String a;
    private kxp b;

    kxn(kxm kxm, String s, kxp kxp1)
    {
        a = s;
        b = kxp1;
        super();
    }

    public final void a(lev lev1)
    {
        b.m((new StringBuilder("Failed to load URL: ")).append(a).append("\n").append(lev1.toString()).toString());
        b.a(null);
    }
}
