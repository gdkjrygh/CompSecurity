// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class RawActionType extends Enum
{

    private static final RawActionType $VALUES[];
    public static final RawActionType KEYBOARD_ENTER;
    public static final RawActionType KEYBOARD_PRESS;
    public static final RawActionType L_BUTTON_DOUBLE_CLICK;
    public static final RawActionType L_BUTTON_DOWN;
    public static final RawActionType L_BUTTON_UP;
    public static final RawActionType MOUSE_HOVER;
    public static final RawActionType MOUSE_MOVE;
    public static final RawActionType MOUSE_WHEEL;
    public static final RawActionType M_BUTTON_DOUBLE_CLICK;
    public static final RawActionType M_BUTTON_DOWN;
    public static final RawActionType M_BUTTON_UP;
    public static final RawActionType OTHER;
    public static final RawActionType R_BUTTON_DOUBLE_CLICK;
    public static final RawActionType R_BUTTON_DOWN;
    public static final RawActionType R_BUTTON_UP;
    public static final RawActionType TOUCH_DOUBLE_TAP;
    public static final RawActionType TOUCH_FLICK;
    public static final RawActionType TOUCH_LONG_PRESS;
    public static final RawActionType TOUCH_PAN;
    public static final RawActionType TOUCH_PINCH;
    public static final RawActionType TOUCH_ROTATE;
    public static final RawActionType TOUCH_SCROLL;
    public static final RawActionType TOUCH_TAP;
    public static final RawActionType TOUCH_ZOOM;
    public static final RawActionType UNKNOWN;
    public static final RawActionType UNSPECIFIED;
    private final int val;

    private RawActionType(String s, int i, int j)
    {
        super(s, i);
        val = j;
    }

    public static RawActionType valueOf(String s)
    {
        return (RawActionType)Enum.valueOf(com/microsoft/applications/telemetry/RawActionType, s);
    }

    public static RawActionType[] values()
    {
        return (RawActionType[])$VALUES.clone();
    }

    public final int getValue()
    {
        return val;
    }

    static 
    {
        UNSPECIFIED = new RawActionType("UNSPECIFIED", 0, 0);
        UNKNOWN = new RawActionType("UNKNOWN", 1, 1);
        OTHER = new RawActionType("OTHER", 2, 2);
        L_BUTTON_DOUBLE_CLICK = new RawActionType("L_BUTTON_DOUBLE_CLICK", 3, 11);
        L_BUTTON_DOWN = new RawActionType("L_BUTTON_DOWN", 4, 12);
        L_BUTTON_UP = new RawActionType("L_BUTTON_UP", 5, 13);
        M_BUTTON_DOUBLE_CLICK = new RawActionType("M_BUTTON_DOUBLE_CLICK", 6, 14);
        M_BUTTON_DOWN = new RawActionType("M_BUTTON_DOWN", 7, 15);
        M_BUTTON_UP = new RawActionType("M_BUTTON_UP", 8, 16);
        MOUSE_HOVER = new RawActionType("MOUSE_HOVER", 9, 17);
        MOUSE_WHEEL = new RawActionType("MOUSE_WHEEL", 10, 18);
        MOUSE_MOVE = new RawActionType("MOUSE_MOVE", 11, 20);
        R_BUTTON_DOUBLE_CLICK = new RawActionType("R_BUTTON_DOUBLE_CLICK", 12, 22);
        R_BUTTON_DOWN = new RawActionType("R_BUTTON_DOWN", 13, 23);
        R_BUTTON_UP = new RawActionType("R_BUTTON_UP", 14, 24);
        TOUCH_TAP = new RawActionType("TOUCH_TAP", 15, 50);
        TOUCH_DOUBLE_TAP = new RawActionType("TOUCH_DOUBLE_TAP", 16, 51);
        TOUCH_LONG_PRESS = new RawActionType("TOUCH_LONG_PRESS", 17, 52);
        TOUCH_SCROLL = new RawActionType("TOUCH_SCROLL", 18, 53);
        TOUCH_PAN = new RawActionType("TOUCH_PAN", 19, 54);
        TOUCH_FLICK = new RawActionType("TOUCH_FLICK", 20, 55);
        TOUCH_PINCH = new RawActionType("TOUCH_PINCH", 21, 56);
        TOUCH_ZOOM = new RawActionType("TOUCH_ZOOM", 22, 57);
        TOUCH_ROTATE = new RawActionType("TOUCH_ROTATE", 23, 58);
        KEYBOARD_PRESS = new RawActionType("KEYBOARD_PRESS", 24, 100);
        KEYBOARD_ENTER = new RawActionType("KEYBOARD_ENTER", 25, 101);
        $VALUES = (new RawActionType[] {
            UNSPECIFIED, UNKNOWN, OTHER, L_BUTTON_DOUBLE_CLICK, L_BUTTON_DOWN, L_BUTTON_UP, M_BUTTON_DOUBLE_CLICK, M_BUTTON_DOWN, M_BUTTON_UP, MOUSE_HOVER, 
            MOUSE_WHEEL, MOUSE_MOVE, R_BUTTON_DOUBLE_CLICK, R_BUTTON_DOWN, R_BUTTON_UP, TOUCH_TAP, TOUCH_DOUBLE_TAP, TOUCH_LONG_PRESS, TOUCH_SCROLL, TOUCH_PAN, 
            TOUCH_FLICK, TOUCH_PINCH, TOUCH_ZOOM, TOUCH_ROTATE, KEYBOARD_PRESS, KEYBOARD_ENTER
        });
    }
}
