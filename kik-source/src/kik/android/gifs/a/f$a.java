// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.a;


// Referenced classes of package kik.android.gifs.a:
//            f

public static final class  extends Enum
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

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(kik/android/gifs/a/f$a, s);
    }

    public static [] values()
    {
        return ([])j.clone();
    }

    static 
    {
        a = new <init>("MP4", 0);
        b = new <init>("WebM", 1);
        c = new <init>("TinyWebM", 2);
        d = new <init>("NanoWebM", 3);
        e = new <init>("TinyGif", 4);
        f = new <init>("NanoGif", 5);
        g = new <init>("TinyMP4", 6);
        h = new <init>("NanoMP4", 7);
        i = new <init>("GIF", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private (String s, int k)
    {
        super(s, k);
    }
}
