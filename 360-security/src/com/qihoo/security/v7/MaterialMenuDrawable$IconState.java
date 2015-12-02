// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v7;


// Referenced classes of package com.qihoo.security.v7:
//            MaterialMenuDrawable

public static final class  extends Enum
{

    public static final CHECK ARROW;
    public static final CHECK BURGER;
    public static final CHECK CHECK;
    public static final CHECK X;
    private static final CHECK a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo/security/v7/MaterialMenuDrawable$IconState, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        BURGER = new <init>("BURGER", 0);
        ARROW = new <init>("ARROW", 1);
        X = new <init>("X", 2);
        CHECK = new <init>("CHECK", 3);
        a = (new a[] {
            BURGER, ARROW, X, CHECK
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
