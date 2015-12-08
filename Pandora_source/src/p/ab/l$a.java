// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ab;


// Referenced classes of package p.ab:
//            l

public static final class f extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e g[];
    private final boolean f;

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/ab/l$a, s);
    }

    public static .String[] values()
    {
        return (.String[])g.clone();
    }

    public boolean a()
    {
        return f;
    }

    static 
    {
        a = new <init>("GIF", 0, true);
        b = new <init>("JPEG", 1, false);
        c = new <init>("PNG_A", 2, true);
        d = new <init>("PNG", 3, false);
        e = new <init>("UNKNOWN", 4, false);
        g = (new g[] {
            a, b, c, d, e
        });
    }

    private .String(String s, int i, boolean flag)
    {
        super(s, i);
        f = flag;
    }
}
