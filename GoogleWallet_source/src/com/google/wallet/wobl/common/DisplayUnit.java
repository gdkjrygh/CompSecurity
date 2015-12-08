// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.common;

import com.google.common.base.Objects;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DisplayUnit
{
    public static final class Unit extends Enum
    {

        private static final Unit $VALUES[];
        public static final Unit DP;
        public static final Unit IN;
        public static final Unit MM;
        public static final Unit PIXEL;
        public static final Unit PT;
        public static final Unit SP;
        public static final Unit WEIGHT;
        private String mString;

        public static Unit valueOf(String s)
        {
            return (Unit)Enum.valueOf(com/google/wallet/wobl/common/DisplayUnit$Unit, s);
        }

        public static Unit[] values()
        {
            return (Unit[])$VALUES.clone();
        }

        public final String toString()
        {
            return mString;
        }

        static 
        {
            DP = new Unit("DP", 0, "dp");
            IN = new Unit("IN", 1, "in");
            MM = new Unit("MM", 2, "mm");
            PT = new Unit("PT", 3, "pt");
            SP = new Unit("SP", 4, "sp");
            WEIGHT = new Unit("WEIGHT", 5, "wt");
            PIXEL = new Unit("PIXEL", 6, "px");
            $VALUES = (new Unit[] {
                DP, IN, MM, PT, SP, WEIGHT, PIXEL
            });
        }

        private Unit(String s, int i, String s1)
        {
            super(s, i);
            mString = s1;
        }
    }


    private static final Pattern VALIDATE_REGEX;
    public static final DisplayUnit ZERO;
    private final Unit unit;
    private final float value;

    private DisplayUnit(float f, Unit unit1)
    {
        value = f;
        unit = unit1;
    }

    private float getPixelInternal(float f, float f1, float f2)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[];

            static 
            {
                $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit = new int[Unit.values().length];
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[Unit.DP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[Unit.IN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[Unit.MM.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[Unit.PT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[Unit.SP.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[Unit.PIXEL.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[Unit.WEIGHT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.wallet.wobl.common.DisplayUnit.Unit[unit.ordinal()])
        {
        default:
            String s = String.valueOf(unit);
            throw new UnsupportedOperationException((new StringBuilder(String.valueOf(s).length() + 19)).append(s).append(" is an unknown type").toString());

        case 1: // '\001'
            return value * f;

        case 2: // '\002'
            return value * f2;

        case 3: // '\003'
            return (value * f2) / 25.4F;

        case 4: // '\004'
            return (value * f2) / 72F;

        case 5: // '\005'
            return value * f1;

        case 6: // '\006'
            return value;

        case 7: // '\007'
            throw new UnsupportedOperationException("weight can not be converted to absolute len value / use get...ThrowIfWeight() if you need to throw a catchable exception");
        }
    }

    public static DisplayUnit of(float f, Unit unit1)
    {
        return new DisplayUnit(f, unit1);
    }

    public static DisplayUnit of(String s)
        throws WoblMalformedDocException
    {
        Object obj1 = VALIDATE_REGEX.matcher(s);
        if (!((Matcher) (obj1)).matches())
        {
            if (s.trim().equals("0"))
            {
                return ZERO;
            } else
            {
                throw new WoblMalformedDocException(String.valueOf(s).concat(" is not valid."));
            }
        }
        Object obj = ((Matcher) (obj1)).group(1);
        obj1 = ((Matcher) (obj1)).group(2);
        obj = Float.valueOf(Float.parseFloat(((String) (obj)).toString()));
        obj1 = ((String) (obj1)).toString();
        if (((Float) (obj)).floatValue() == 0.0F)
        {
            return ZERO;
        }
        if (((String) (obj1)).equalsIgnoreCase(Unit.WEIGHT.toString()))
        {
            return new DisplayUnit(((Float) (obj)).floatValue(), Unit.WEIGHT);
        }
        if (((String) (obj1)).equalsIgnoreCase(Unit.DP.toString()))
        {
            return new DisplayUnit(((Float) (obj)).floatValue(), Unit.DP);
        }
        if (((String) (obj1)).equalsIgnoreCase(Unit.IN.toString()))
        {
            return new DisplayUnit(((Float) (obj)).floatValue(), Unit.IN);
        }
        if (((String) (obj1)).equalsIgnoreCase(Unit.PT.toString()))
        {
            return new DisplayUnit(((Float) (obj)).floatValue(), Unit.PT);
        }
        if (((String) (obj1)).equalsIgnoreCase(Unit.SP.toString()))
        {
            return new DisplayUnit(((Float) (obj)).floatValue(), Unit.SP);
        }
        if (((String) (obj1)).equalsIgnoreCase(Unit.MM.toString()))
        {
            return new DisplayUnit(((Float) (obj)).floatValue(), Unit.MM);
        } else
        {
            throw new UnsupportedOperationException(String.valueOf(s).concat(" is not implemented."));
        }
    }

    public static boolean validate(String s)
    {
        return VALIDATE_REGEX.matcher(s).matches() || s.trim().equals("0");
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DisplayUnit)
        {
            if (((DisplayUnit) (obj = (DisplayUnit)obj)).value == 0.0F && value == 0.0F || ((DisplayUnit) (obj)).unit == unit && ((DisplayUnit) (obj)).value == value)
            {
                return true;
            }
        }
        return false;
    }

    public int getPixel(float f, float f1, float f2)
    {
        return (int)getPixelInternal(f, f1, f2);
    }

    public int getPixelThrowIfWeight(float f, float f1, float f2)
        throws WoblMalformedDocException
    {
        if (unit == Unit.WEIGHT)
        {
            throw new WoblMalformedDocException("Malformed doc: this value should not be weight");
        } else
        {
            return getPixel(f, f1, f2);
        }
    }

    public float getRawValue()
    {
        return value;
    }

    public float getSpValue(float f, float f1, float f2)
    {
        return getPixelInternal(f, f1, f2) / f1;
    }

    public float getSpValueThrowIfWeight(float f, float f1, float f2)
        throws WoblMalformedDocException
    {
        if (unit == Unit.WEIGHT)
        {
            throw new WoblMalformedDocException("Malformed doc: this value should not be weight");
        } else
        {
            return getSpValue(f, f1, f2);
        }
    }

    public Unit getUnitType()
    {
        return unit;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Float.valueOf(value), unit
        });
    }

    public DisplayUnit multiplyBy(float f)
    {
        return new DisplayUnit(value * f, unit);
    }

    public String toString()
    {
        return String.format("%s%s", new Object[] {
            Float.valueOf(value), unit
        });
    }

    static 
    {
        ZERO = of(0.0F, Unit.PIXEL);
        VALIDATE_REGEX = Pattern.compile(String.format("\\s*(\\d*\\.?\\d+)(?i)(%s|%s|%s|%s|%s|%s)\\s*", new Object[] {
            Unit.IN, Unit.MM, Unit.PT, Unit.DP, Unit.SP, Unit.WEIGHT
        }));
    }
}
