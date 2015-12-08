// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dd;


// Referenced classes of package p.dd:
//            bh

public static final class String extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static String valueOf(String s)
    {
        return (String)Enum.valueOf(p/dd/bh$a, s);
    }

    public static String[] values()
    {
        return (String[])f.clone();
    }

    static 
    {
        a = new <init>("NONE", 0);
        b = new <init>("STARTED", 1);
        c = new <init>("PLAYING", 2);
        d = new <init>("PAUSED", 3);
        e = new <init>("STOPPED", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private String(String s, int i)
    {
        super(s, i);
    }
}
