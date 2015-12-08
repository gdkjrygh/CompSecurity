// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;


// Referenced classes of package com.google.android.m4b.maps.bx:
//            ag

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
        return ()Enum.valueOf(com/google/android/m4b/maps/bx/ag$a, s);
    }

    public static [] values()
    {
        return ([])j.clone();
    }

    static 
    {
        a = new <init>("BASE", 0);
        b = new <init>("DROP_SHADOWS_OUTER", 1);
        c = new <init>("ELEVATED_COLOR", 2);
        d = new <init>("UNDERGROUND_MODE_MASK", 3);
        e = new <init>("UNDERGROUND_STENCIL", 4);
        f = new <init>("UNDERGROUND_COLOR", 5);
        g = new <init>("DROP_SHADOWS_INNER", 6);
        h = new <init>("ANIMATED_ELEVATED_COLOR", 7);
        i = new <init>("DEFAULT", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private (String s, int k)
    {
        super(s, k);
    }
}
