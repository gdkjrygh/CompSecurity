// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;


// Referenced classes of package p.ca:
//            bf

public static final class String extends Enum
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

    public static String valueOf(String s)
    {
        return (String)Enum.valueOf(p/ca/bf$b, s);
    }

    public static String[] values()
    {
        return (String[])j.clone();
    }

    static 
    {
        a = new <init>("VIDEO_COMPLETE", 0);
        b = new <init>("SKIP_BUTTON", 1);
        c = new <init>("BACK_BUTTON", 2);
        d = new <init>("SEARCH_BUTTON", 3);
        e = new <init>("BACKGROUND", 4);
        f = new <init>("SCREEN_LOCKED", 5);
        g = new <init>("AUTOMOTIVE_ACCESSORY_CONNECTED", 6);
        h = new <init>("DESTROY", 7);
        i = new <init>("ERROR", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private String(String s, int k)
    {
        super(s, k);
    }
}
