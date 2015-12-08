// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;


// Referenced classes of package com.google.android.m4b.maps.cc:
//            n

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

    public static  a(int k)
    {
        switch (k)
        {
        case 8: // '\b'
        case 12: // '\f'
        default:
            throw new IllegalArgumentException("Unknown position");

        case 5: // '\005'
            return a;

        case 6: // '\006'
            return e;

        case 7: // '\007'
            return c;

        case 9: // '\t'
            return b;

        case 10: // '\n'
            return i;

        case 11: // '\013'
            return h;

        case 13: // '\r'
            return d;

        case 14: // '\016'
            return g;

        case 15: // '\017'
            return f;
        }
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/google/android/m4b/maps/cc/n$a, s);
    }

    public static f[] values()
    {
        return (f[])j.clone();
    }

    static 
    {
        a = new <init>("AT_CENTER", 0);
        b = new <init>("ABOVE_CENTER", 1);
        c = new <init>("RIGHT_OF_CENTER", 2);
        d = new <init>("BELOW_CENTER", 3);
        e = new <init>("LEFT_OF_CENTER", 4);
        f = new <init>("BOTTOM_RIGHT", 5);
        g = new <init>("BOTTOM_LEFT", 6);
        h = new <init>("TOP_RIGHT", 7);
        i = new <init>("TOP_LEFT", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private (String s, int k)
    {
        super(s, k);
    }
}
