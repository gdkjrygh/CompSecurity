// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fse extends fzj
{

    public fse()
    {
        super("ab-adapt-cta-button", new fym("ab-adapt-cta-button"));
    }

    public static boolean a(String s)
    {
        return "Control".equals(s) || !"use-text-shrinking".equals(s) && !"use-marquee".equals(s);
    }

    public static boolean b(String s)
    {
        return "use-marquee".equals(s);
    }
}
