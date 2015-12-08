// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;


// Referenced classes of package com.google.inject.spi:
//            InjectionPoint

static final class  extends Enum
{

    private static final BOTTOM $VALUES[];
    public static final BOTTOM BOTTOM;
    public static final BOTTOM MIDDLE;
    public static final BOTTOM TOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/inject/spi/InjectionPoint$Position, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TOP = new <init>("TOP", 0);
        MIDDLE = new <init>("MIDDLE", 1);
        BOTTOM = new <init>("BOTTOM", 2);
        $VALUES = (new .VALUES[] {
            TOP, MIDDLE, BOTTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
