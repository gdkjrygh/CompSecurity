// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;


// Referenced classes of package p.ca:
//            bf

static final class String extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static String valueOf(String s)
    {
        return (String)Enum.valueOf(p/ca/bf$h, s);
    }

    public static String[] values()
    {
        return (String[])d.clone();
    }

    static 
    {
        a = new <init>("showing", 0);
        b = new <init>("pending", 1);
        c = new <init>("hidden", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private String(String s, int i)
    {
        super(s, i);
    }
}
