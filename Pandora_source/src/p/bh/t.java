// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class t extends Enum
{

    public static final t a;
    public static final t b;
    public static final t c;
    private static final t e[];
    String d;

    private t(String s, int i, String s1)
    {
        super(s, i);
        d = s1;
    }

    public static t valueOf(String s)
    {
        return (t)Enum.valueOf(p/bh/t, s);
    }

    public static t[] values()
    {
        return (t[])e.clone();
    }

    public String toString()
    {
        return d;
    }

    static 
    {
        a = new t("SBT_TEXT", 0, "TEXT");
        b = new t("SBT_IMAGE", 1, "IMAGE");
        c = new t("SBT_BOTH", 2, "BOTH");
        e = (new t[] {
            a, b, c
        });
    }
}
