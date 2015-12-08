// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d.a;


// Referenced classes of package kik.a.d.a:
//            a

public static final class ng extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static ng valueOf(String s)
    {
        return (ng)Enum.valueOf(kik/a/d/a/a$c, s);
    }

    public static ng[] values()
    {
        return (ng[])g.clone();
    }

    static 
    {
        a = new <init>("WebM", 0);
        b = new <init>("TinyWebM", 1);
        c = new <init>("MP4", 2);
        d = new <init>("TinyMP4", 3);
        e = new <init>("NanoMP4", 4);
        f = new <init>("NanoWebM", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private ng(String s, int i)
    {
        super(s, i);
    }
}
