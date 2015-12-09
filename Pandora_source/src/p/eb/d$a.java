// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.eb;


// Referenced classes of package p.eb:
//            d

public static final class .String extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/eb/d$a, s);
    }

    public static .String[] values()
    {
        return (.String[])g.clone();
    }

    static 
    {
        a = new <init>("CONTINUOUS", 0);
        b = new <init>("TEXT", 1);
        c = new <init>("BINARY", 2);
        d = new <init>("PING", 3);
        e = new <init>("PONG", 4);
        f = new <init>("CLOSING", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private .String(String s, int i)
    {
        super(s, i);
    }
}
