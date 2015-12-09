// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.content.res.Resources;
import com.a.a.a.a;
import com.fitbit.FitBitApplication;
import com.fitbit.util.al;

// Referenced classes of package com.fitbit.data.domain:
//            m, q, s, Length

public static final class serializableName extends Enum
    implements m, q, s
{

    private static final METERS $VALUES[];
    public static final METERS CM;
    public static final METERS FEET;
    public static final METERS INCH;
    public static final METERS KM;
    public static final METERS METERS;
    public static final METERS MILES;
    public static final METERS MM;
    private final double cmInUnit;
    private final int quantityNameResId;
    private final int resId;
    private final String serializableName;
    private final int shortNameResId;

    public static serializableName valueOf(String s1)
    {
        return (serializableName)Enum.valueOf(com/fitbit/data/domain/Length$LengthUnits, s1);
    }

    public static serializableName[] values()
    {
        return (serializableName[])$VALUES.clone();
    }

    public double convert(double d, s_3B_.clone clone)
    {
        return (clone.cmInUnit * d) / cmInUnit;
    }

    public String getDisplayName()
    {
        return FitBitApplication.a().getResources().getString(resId);
    }

    public String getQuantityDisplayName(String s1)
    {
        Object obj = null;
        a a1 = FitBitApplication.a().e();
        String s2 = obj;
        if (a1 != null)
        {
            s2 = obj;
            try
            {
                if (quantityNameResId != 0)
                {
                    s2 = a1.a(quantityNameResId, s1, al.j());
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s2 = obj;
            }
        }
        if (quantityNameResId > 0 && s2 != null)
        {
            return s2;
        } else
        {
            return getShortDisplayName();
        }
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    public String getShortDisplayName()
    {
        return FitBitApplication.a().getResources().getString(shortNameResId);
    }

    public String toString()
    {
        return getSerializableName();
    }

    static 
    {
        FEET = new <init>("FEET", 0, 0x7f0801ba, 0x7f0801bb, 0, "feet", 30.479999953670397D);
        CM = new <init>("CM", 1, 0x7f080104, 0x7f080104, 0, "cm", 1.0D);
        MM = new <init>("MM", 2, 0x7f0803e8, 0x7f0803e8, 0, "mm", 0.10000000000000001D);
        INCH = new <init>("INCH", 3, 0x7f080283, 0x7f080284, 0, "inch", 2.5400000025908001D);
        MILES = new <init>("MILES", 4, 0x7f0803d3, 0x7f0803d5, 0x7f0b000d, "miles", 160934.39999999999D);
        KM = new <init>("KM", 5, 0x7f0802a1, 0x7f0802a1, 0, "km", 100000D);
        METERS = new <init>("METERS", 6, 0x7f0803d0, 0x7f0803d1, 0, "meters", 100D);
        $VALUES = (new .VALUES[] {
            FEET, CM, MM, INCH, MILES, KM, METERS
        });
    }

    private ption(String s1, int i, int j, int k, int l, String s2, double d)
    {
        super(s1, i);
        cmInUnit = d;
        resId = j;
        shortNameResId = k;
        quantityNameResId = l;
        serializableName = s2;
    }
}
