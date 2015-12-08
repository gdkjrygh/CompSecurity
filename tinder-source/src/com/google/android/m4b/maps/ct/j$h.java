// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;


// Referenced classes of package com.google.android.m4b.maps.ct:
//            j

public static final class  extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/m4b/maps/ct/j$h, s);
    }

    public static [] values()
    {
        return ([])i.clone();
    }

    static 
    {
        a = new <init>("IS_INITIALIZED", 0);
        b = new <init>("PARSE_PARTIAL_FROM", 1);
        c = new <init>("MERGE_FROM", 2);
        d = new <init>("MAKE_IMMUTABLE", 3);
        e = new <init>("NEW_INSTANCE", 4);
        f = new <init>("NEW_BUILDER", 5);
        g = new <init>("GET_DEFAULT_INSTANCE", 6);
        h = new <init>("GET_PARSER", 7);
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private (String s, int k)
    {
        super(s, k);
    }
}
