// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;


public final class DeviceType extends Enum
{

    private static final DeviceType $VALUES[];
    public static final DeviceType SCALE;
    public static final DeviceType TRACKER;
    public static final DeviceType UNKNOWN;

    private DeviceType(String s, int i)
    {
        super(s, i);
    }

    public static DeviceType parse(String s)
    {
        try
        {
            s = valueOf(s.toUpperCase());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return UNKNOWN;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return UNKNOWN;
        }
        return s;
    }

    public static DeviceType valueOf(String s)
    {
        return (DeviceType)Enum.valueOf(com/fitbit/data/domain/device/DeviceType, s);
    }

    public static DeviceType[] values()
    {
        return (DeviceType[])$VALUES.clone();
    }

    static 
    {
        TRACKER = new DeviceType("TRACKER", 0);
        SCALE = new DeviceType("SCALE", 1);
        UNKNOWN = new DeviceType("UNKNOWN", 2);
        $VALUES = (new DeviceType[] {
            TRACKER, SCALE, UNKNOWN
        });
    }
}
