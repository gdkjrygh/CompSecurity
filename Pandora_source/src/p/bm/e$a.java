// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bm;


// Referenced classes of package p.bm:
//            e

static final class .String extends Enum
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
        return (.String)Enum.valueOf(p/bm/e$a, s);
    }

    public static .String[] values()
    {
        return (.String[])g.clone();
    }

    static 
    {
        a = new <init>("fromSync", 0);
        b = new <init>("fromApp", 1);
        c = new <init>("appLog", 2);
        d = new <init>("formattedTrace", 3);
        e = new <init>("baselineTimeStamp", 4);
        f = new <init>("traceSettings", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private .String(String s, int i)
    {
        super(s, i);
    }
}
