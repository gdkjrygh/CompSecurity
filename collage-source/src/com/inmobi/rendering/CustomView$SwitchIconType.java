// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.rendering;


// Referenced classes of package com.inmobi.rendering:
//            CustomView

public static final class  extends Enum
{

    private static final FORWARD_INACTIVE $VALUES[];
    public static final FORWARD_INACTIVE BACK;
    public static final FORWARD_INACTIVE CLOSE_BUTTON;
    public static final FORWARD_INACTIVE CLOSE_ICON;
    public static final FORWARD_INACTIVE CLOSE_TRANSPARENT;
    public static final FORWARD_INACTIVE FORWARD_ACTIVE;
    public static final FORWARD_INACTIVE FORWARD_INACTIVE;
    public static final FORWARD_INACTIVE REFRESH;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/inmobi/rendering/CustomView$SwitchIconType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CLOSE_BUTTON = new <init>("CLOSE_BUTTON", 0);
        CLOSE_TRANSPARENT = new <init>("CLOSE_TRANSPARENT", 1);
        CLOSE_ICON = new <init>("CLOSE_ICON", 2);
        REFRESH = new <init>("REFRESH", 3);
        BACK = new <init>("BACK", 4);
        FORWARD_ACTIVE = new <init>("FORWARD_ACTIVE", 5);
        FORWARD_INACTIVE = new <init>("FORWARD_INACTIVE", 6);
        $VALUES = (new .VALUES[] {
            CLOSE_BUTTON, CLOSE_TRANSPARENT, CLOSE_ICON, REFRESH, BACK, FORWARD_ACTIVE, FORWARD_INACTIVE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
