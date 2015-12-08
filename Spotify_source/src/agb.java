// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class agb extends ags
    implements ahf
{

    private final String a;
    private final String e;

    public agb(String s, String s1, String s2, String s3)
    {
        super(s, s1);
        a = s2;
        e = s3;
    }

    public final void a(String s)
    {
        super.a(s);
        d.b(a, s);
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        d.a(e, flag);
        d.a(a, flag);
    }
}
