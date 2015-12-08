// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;


// Referenced classes of package com.google.android.m4b.maps.bk:
//            a

public static final class  extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    private static g g;
    private static final g h[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/m4b/maps/bk/a$b, s);
    }

    public static [] values()
    {
        return ([])h.clone();
    }

    static 
    {
        a = new <init>("SPLIT_VERTEX", 0);
        b = new <init>("MERGE_VERTEX", 1);
        c = new <init>("RIGHT_VERTEX", 2);
        d = new <init>("LEFT_VERTEX", 3);
        e = new <init>("START_VERTEX", 4);
        f = new <init>("END_VERTEX", 5);
        g = new <init>("INTERSECTION_VERTEX", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
