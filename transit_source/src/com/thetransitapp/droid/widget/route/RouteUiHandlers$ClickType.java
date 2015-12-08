// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget.route;


// Referenced classes of package com.thetransitapp.droid.widget.route:
//            RouteUiHandlers

public static final class  extends Enum
{

    public static final MENU_OPEN DEFAULT;
    private static final MENU_OPEN ENUM$VALUES[];
    public static final MENU_OPEN FAVORITE;
    public static final MENU_OPEN MAP;
    public static final MENU_OPEN MENU_OPEN;
    public static final MENU_OPEN NONE;
    public static final MENU_OPEN SWITCH_DIRECTION;
    public static final MENU_OPEN TIMETABLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        MAP = new <init>("MAP", 0);
        SWITCH_DIRECTION = new <init>("SWITCH_DIRECTION", 1);
        FAVORITE = new <init>("FAVORITE", 2);
        TIMETABLE = new <init>("TIMETABLE", 3);
        DEFAULT = new <init>("DEFAULT", 4);
        NONE = new <init>("NONE", 5);
        MENU_OPEN = new <init>("MENU_OPEN", 6);
        ENUM$VALUES = (new ENUM.VALUES[] {
            MAP, SWITCH_DIRECTION, FAVORITE, TIMETABLE, DEFAULT, NONE, MENU_OPEN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
