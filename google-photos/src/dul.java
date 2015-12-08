// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dul extends Enum
{

    public static final dul a;
    public static final dul b;
    public static final dul c;
    public static final dul d;
    private static final dul e[];

    private dul(String s, int i)
    {
        super(s, i);
    }

    public static dul valueOf(String s)
    {
        return (dul)Enum.valueOf(dul, s);
    }

    public static dul[] values()
    {
        return (dul[])e.clone();
    }

    static 
    {
        a = new dul("ALWAYS_TOP", 0);
        b = new dul("ONBOARDING", 1);
        c = new dul("IMPORTANT", 2);
        d = new dul("NORMAL", 3);
        e = (new dul[] {
            a, b, c, d
        });
    }
}
