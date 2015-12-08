// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.rendering;


// Referenced classes of package com.inmobi.rendering:
//            RenderingProperties

public static final class  extends Enum
{

    private static final INLINE $VALUES[];
    public static final INLINE FULL_SCREEN;
    public static final INLINE INLINE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/inmobi/rendering/RenderingProperties$PlacementType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FULL_SCREEN = new <init>("FULL_SCREEN", 0);
        INLINE = new <init>("INLINE", 1);
        $VALUES = (new .VALUES[] {
            FULL_SCREEN, INLINE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
