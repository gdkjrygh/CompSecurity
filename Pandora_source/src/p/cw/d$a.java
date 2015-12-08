// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cw;


// Referenced classes of package p.cw:
//            d

public static final class .String extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    private static final i j[];

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/cw/d$a, s);
    }

    public static .String[] values()
    {
        return (.String[])j.clone();
    }

    static 
    {
        a = new <init>("NO_ERROR", 0);
        b = new <init>("SKIP_LIMIT_REACHED", 1);
        c = new <init>("SKIPPING_AUDIO_AD", 2);
        d = new <init>("SKIPPING_NO_TRACK", 3);
        e = new <init>("THUMB_UP_AD", 4);
        f = new <init>("THUMB_UP_SHARED", 5);
        g = new <init>("THUMB_DOWN_AD", 6);
        h = new <init>("THUMB_DOWN_SHARED", 7);
        i = new <init>("SKIP_THUMBS_DOWN", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private .String(String s, int k)
    {
        super(s, k);
    }
}
