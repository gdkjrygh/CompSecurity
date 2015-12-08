// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class InputDeviceType extends Enum
{

    private static final InputDeviceType $VALUES[];
    public static final InputDeviceType CAMERA;
    public static final InputDeviceType KEYBOARD;
    public static final InputDeviceType KINECT;
    public static final InputDeviceType MICROPHONE;
    public static final InputDeviceType MOUSE;
    public static final InputDeviceType OTHER;
    public static final InputDeviceType STYLUS;
    public static final InputDeviceType TOUCH;
    public static final InputDeviceType UNKNOWN;
    public static final InputDeviceType UNSPECIFIED;
    private final int val;

    private InputDeviceType(String s, int i, int j)
    {
        super(s, i);
        val = j;
    }

    public static InputDeviceType valueOf(String s)
    {
        return (InputDeviceType)Enum.valueOf(com/microsoft/applications/telemetry/InputDeviceType, s);
    }

    public static InputDeviceType[] values()
    {
        return (InputDeviceType[])$VALUES.clone();
    }

    public final int getValue()
    {
        return val;
    }

    static 
    {
        UNSPECIFIED = new InputDeviceType("UNSPECIFIED", 0, 0);
        UNKNOWN = new InputDeviceType("UNKNOWN", 1, 1);
        OTHER = new InputDeviceType("OTHER", 2, 2);
        MOUSE = new InputDeviceType("MOUSE", 3, 3);
        KEYBOARD = new InputDeviceType("KEYBOARD", 4, 4);
        TOUCH = new InputDeviceType("TOUCH", 5, 5);
        STYLUS = new InputDeviceType("STYLUS", 6, 6);
        MICROPHONE = new InputDeviceType("MICROPHONE", 7, 7);
        KINECT = new InputDeviceType("KINECT", 8, 8);
        CAMERA = new InputDeviceType("CAMERA", 9, 9);
        $VALUES = (new InputDeviceType[] {
            UNSPECIFIED, UNKNOWN, OTHER, MOUSE, KEYBOARD, TOUCH, STYLUS, MICROPHONE, KINECT, CAMERA
        });
    }
}
