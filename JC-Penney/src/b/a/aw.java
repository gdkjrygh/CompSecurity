// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class aw extends Enum
{

    public static final aw a;
    public static final aw b;
    private static final aw d[];
    private String c;

    private aw(String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }

    public static aw valueOf(String s)
    {
        return (aw)Enum.valueOf(b/a/aw, s);
    }

    public static aw[] values()
    {
        return (aw[])d.clone();
    }

    public final String a()
    {
        return c;
    }

    static 
    {
        a = new aw("FOREGROUND", 0, "foregrounded");
        b = new aw("BACKGROUND", 1, "backgrounded");
        d = (new aw[] {
            a, b
        });
    }
}
