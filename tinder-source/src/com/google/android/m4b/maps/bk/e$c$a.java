// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;


// Referenced classes of package com.google.android.m4b.maps.bk:
//            e

public static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/m4b/maps/bk/e$c$a, s);
    }

    public static [] values()
    {
        return ([])d.clone();
    }

    static 
    {
        a = new <init>("EMPTY_MESH", 0);
        b = new <init>("TESSELLATE_MONOTONE", 1);
        c = new <init>("CUT_AND_TESSELLATE", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
