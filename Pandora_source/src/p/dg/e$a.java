// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;


// Referenced classes of package p.dg:
//            e

public static final class .String extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;
    private static final j k[];

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/dg/e$a, s);
    }

    public static .String[] values()
    {
        return (.String[])k.clone();
    }

    static 
    {
        a = new <init>("IDLE", 0);
        b = new <init>("INITIALIZED", 1);
        c = new <init>("PREPARING", 2);
        d = new <init>("PREPARED", 3);
        e = new <init>("STARTED", 4);
        f = new <init>("PAUSED", 5);
        g = new <init>("STOPPED", 6);
        h = new <init>("PLAYBACKCOMPLETE", 7);
        i = new <init>("END", 8);
        j = new <init>("ERROR", 9);
        k = (new k[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }

    private .String(String s, int l)
    {
        super(s, l);
    }
}
