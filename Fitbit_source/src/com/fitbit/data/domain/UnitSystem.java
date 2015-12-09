// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            s

public final class UnitSystem extends Enum
    implements s
{

    private static final UnitSystem $VALUES[];
    public static final UnitSystem DEFAULT;
    public static final UnitSystem EN_GB;
    public static final UnitSystem EN_US;
    private String serializableName;

    private UnitSystem(String s1, int i, String s2)
    {
        super(s1, i);
        serializableName = s2;
    }

    public static UnitSystem getByDistanceUnit(Length.LengthUnits lengthunits)
    {
        if (Length.LengthUnits.MILES == lengthunits)
        {
            return EN_US;
        } else
        {
            return DEFAULT;
        }
    }

    public static UnitSystem getByHeightUnit(Length.LengthUnits lengthunits)
    {
        if (Length.LengthUnits.FEET == lengthunits)
        {
            return EN_US;
        } else
        {
            return DEFAULT;
        }
    }

    public static UnitSystem getByWaterUnit(WaterLogEntry.WaterUnits waterunits)
    {
        if (WaterLogEntry.WaterUnits.ML == waterunits)
        {
            return DEFAULT;
        } else
        {
            return EN_US;
        }
    }

    public static UnitSystem getByWeightUnit(WeightLogEntry.WeightUnits weightunits)
    {
        if (WeightLogEntry.WeightUnits.LBS == weightunits)
        {
            return EN_US;
        }
        if (WeightLogEntry.WeightUnits.STONE == weightunits)
        {
            return EN_GB;
        } else
        {
            return DEFAULT;
        }
    }

    public static UnitSystem parse(String s1)
    {
        try
        {
            s1 = valueOf(s1.toUpperCase());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return DEFAULT;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return DEFAULT;
        }
        return s1;
    }

    public static UnitSystem valueOf(String s1)
    {
        return (UnitSystem)Enum.valueOf(com/fitbit/data/domain/UnitSystem, s1);
    }

    public static UnitSystem[] values()
    {
        return (UnitSystem[])$VALUES.clone();
    }

    public Length.LengthUnits getDistanceUnit()
    {
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1.a[ordinal()])
        {
        default:
            return Length.LengthUnits.KM;

        case 1: // '\001'
            return Length.LengthUnits.MILES;
        }
    }

    public Length.LengthUnits getHeightUnit()
    {
        switch (_cls1.a[ordinal()])
        {
        default:
            return Length.LengthUnits.CM;

        case 1: // '\001'
            return Length.LengthUnits.FEET;
        }
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    public WaterLogEntry.WaterUnits getWaterUnits()
    {
        switch (_cls1.a[ordinal()])
        {
        default:
            return WaterLogEntry.WaterUnits.ML;

        case 1: // '\001'
            return WaterLogEntry.WaterUnits.OZ;
        }
    }

    public WeightLogEntry.WeightUnits getWeightUnits()
    {
        switch (_cls1.a[ordinal()])
        {
        default:
            return WeightLogEntry.WeightUnits.KG;

        case 1: // '\001'
            return WeightLogEntry.WeightUnits.LBS;

        case 2: // '\002'
            return WeightLogEntry.WeightUnits.STONE;
        }
    }

    static 
    {
        EN_US = new UnitSystem("EN_US", 0, "en_US");
        EN_GB = new UnitSystem("EN_GB", 1, "en_GB");
        DEFAULT = new UnitSystem("DEFAULT", 2, "METRIC");
        $VALUES = (new UnitSystem[] {
            EN_US, EN_GB, DEFAULT
        });
    }
}
