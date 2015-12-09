// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.fitbit.FitBitApplication;

public final class BatteryLevel extends Enum
{

    private static final BatteryLevel $VALUES[];
    public static final BatteryLevel EMPTY;
    public static final BatteryLevel HIGH;
    public static final BatteryLevel LOW;
    public static final BatteryLevel MEDIUM;
    public static final BatteryLevel UNKNOWN;
    private final int largeImage;
    private final int smallImage;

    private BatteryLevel(String s, int i, int j, int k)
    {
        super(s, i);
        largeImage = j;
        smallImage = k;
    }

    private static Drawable getImage(int i)
    {
        if (i > 0)
        {
            return FitBitApplication.a().getResources().getDrawable(i);
        } else
        {
            return null;
        }
    }

    public static BatteryLevel parse(String s)
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

    public static BatteryLevel valueOf(String s)
    {
        return (BatteryLevel)Enum.valueOf(com/fitbit/data/domain/device/BatteryLevel, s);
    }

    public static BatteryLevel[] values()
    {
        return (BatteryLevel[])$VALUES.clone();
    }

    public Drawable getLargeImage()
    {
        return getImage(largeImage);
    }

    public Drawable getSmallImage()
    {
        return getImage(smallImage);
    }

    public int getSmallImageInt()
    {
        return smallImage;
    }

    public String getStringBatteryLevel()
    {
        switch (getSmallImageInt())
        {
        default:
            return null;

        case 2130837901: 
            return "EMPTY";

        case 2130837903: 
            return "LOW";

        case 2130837904: 
            return "MEDIUM";

        case 2130837902: 
            return "HIGH";
        }
    }

    static 
    {
        EMPTY = new BatteryLevel("EMPTY", 0, 0x7f02018d, 0);
        LOW = new BatteryLevel("LOW", 1, 0x7f02018f, 0x7f020068);
        MEDIUM = new BatteryLevel("MEDIUM", 2, 0x7f020190, 0x7f020069);
        HIGH = new BatteryLevel("HIGH", 3, 0x7f02018e, 0x7f020067);
        UNKNOWN = new BatteryLevel("UNKNOWN", 4, 0, 0);
        $VALUES = (new BatteryLevel[] {
            EMPTY, LOW, MEDIUM, HIGH, UNKNOWN
        });
    }
}
