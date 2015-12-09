// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.content.res.Resources;
import com.fitbit.FitBitApplication;
import com.fitbit.pedometer.k;

public class DeviceVersion extends Enum
{

    private static final DeviceVersion $VALUES[];
    public static final DeviceVersion ARIA;
    public static final DeviceVersion CHARGE;
    public static final DeviceVersion CHARGE_HR;
    private static final String CHARGE_HR_EQUIVALENT_NAME = "Charge HR";
    public static final DeviceVersion CLASSIC;
    public static final DeviceVersion FLEX;
    public static final DeviceVersion FORCE;
    public static final int HIGHEST_PRIORITY = 1;
    public static final DeviceVersion MOTIONBIT;
    private static final String MOTIONBIT_EQUIVALENT_NAME = "MobileTrack";
    public static final DeviceVersion ONE;
    public static final DeviceVersion SURGE;
    public static final DeviceVersion ULTRA;
    public static final DeviceVersion UNKNOWN;
    public static final DeviceVersion ZIP;
    private final int deviceIcon;
    private final int helpUrl;
    private final int priority;

    private DeviceVersion(String s, int i, int j, int k, int l)
    {
        super(s, i);
        deviceIcon = j;
        helpUrl = k;
        priority = l;
    }


    public static DeviceVersion parse(String s)
    {
        String s1 = s.replaceAll(" ", "_");
        try
        {
            if ("MobileTrack".equalsIgnoreCase(s1))
            {
                return MOTIONBIT;
            }
            if ("Charge HR".equalsIgnoreCase(s))
            {
                return CHARGE_HR;
            }
            s = valueOf(s.toUpperCase().replaceAll(" ", "_"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return UNKNOWN;
        }
        return s;
    }

    public static DeviceVersion valueOf(String s)
    {
        return (DeviceVersion)Enum.valueOf(com/fitbit/data/domain/device/DeviceVersion, s);
    }

    public static DeviceVersion[] values()
    {
        return (DeviceVersion[])$VALUES.clone();
    }

    public int getDeviceIcon()
    {
        return deviceIcon;
    }

    public String getHelpUrl()
    {
        if (helpUrl > 0)
        {
            return FitBitApplication.a().getResources().getString(helpUrl);
        } else
        {
            return null;
        }
    }

    public int getPriority()
    {
        return priority;
    }

    static 
    {
        SURGE = new DeviceVersion("SURGE", 0, 0, 0x7f080635, 1);
        CHARGE_HR = new DeviceVersion("CHARGE_HR", 1, 0, 0x7f0805ef, 2);
        CHARGE = new DeviceVersion("CHARGE", 2, 0, 0x7f0805eb, 3);
        FORCE = new DeviceVersion("FORCE", 3, 0x7f0201fd, 0x7f080605, 4);
        FLEX = new DeviceVersion("FLEX", 4, 0x7f0201e2, 0x7f080603, 5);
        ONE = new DeviceVersion("ONE", 5, 0x7f02030c, 0x7f080623, 6);
        ZIP = new DeviceVersion("ZIP", 6, 0x7f0203db, 0x7f08063b, 7);
        MOTIONBIT = new DeviceVersion("MOTIONBIT", 7, 0, 0, 8) {

            public int getDeviceIcon()
            {
                return !k.a() ? 0x7f0202b5 : 0x7f0202b4;
            }

        };
        ULTRA = new DeviceVersion("ULTRA", 8, 0x7f0203b4, 0x7f080638, 99);
        CLASSIC = new DeviceVersion("CLASSIC", 9, 0x7f0203b4, 0x7f080638, 99);
        ARIA = new DeviceVersion("ARIA", 10, 0x7f020055, 0x7f0805e7, 99);
        UNKNOWN = new DeviceVersion("UNKNOWN", 11, 0, 0, 99);
        $VALUES = (new DeviceVersion[] {
            SURGE, CHARGE_HR, CHARGE, FORCE, FLEX, ONE, ZIP, MOTIONBIT, ULTRA, CLASSIC, 
            ARIA, UNKNOWN
        });
    }
}
