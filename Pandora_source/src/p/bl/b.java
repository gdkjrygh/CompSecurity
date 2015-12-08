// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bl;


public final class b extends Enum
{

    public static final b a;
    public static final b b;
    public static final b c;
    private static final b d[];

    private b(String s, int i)
    {
        super(s, i);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(p/bl/b, s);
    }

    public static b[] values()
    {
        return (b[])d.clone();
    }

    static 
    {
        a = new b("Transmit", 0);
        b = new b("Receive", 1);
        c = new b("None", 2);
        d = (new b[] {
            a, b, c
        });
    }
}
