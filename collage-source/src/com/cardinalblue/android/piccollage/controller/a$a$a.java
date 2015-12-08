// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;


// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            a

public static final class  extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/cardinalblue/android/piccollage/controller/a$a$a, s);
    }

    public static [] values()
    {
        return ([])h.clone();
    }

    static 
    {
        a = new <init>("START", 0);
        b = new <init>("PROGRESSING", 1);
        c = new <init>("SUCCESS", 2);
        d = new <init>("FAILED", 3);
        e = new <init>("CANCELLED", 4);
        f = new <init>("DATA_CHANGED", 5);
        g = new <init>("BUNDLE_LIST_UPDATED", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
