// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.format;

import com.fitbit.data.domain.Length;
import java.text.DecimalFormat;
import java.text.FieldPosition;

public class DistanceDecimalFormat extends DecimalFormat
{

    private static final long serialVersionUID = 0x34349a8d870a4035L;
    private final Length length;
    private final com.fitbit.data.domain.Length.LengthUnits sourceUnit;
    private final com.fitbit.data.domain.Length.LengthUnits targetUnit;

    public DistanceDecimalFormat(com.fitbit.data.domain.Length.LengthUnits lengthunits)
    {
        length = new Length();
        sourceUnit = lengthunits;
        targetUnit = lengthunits;
        length.b(sourceUnit);
    }

    public DistanceDecimalFormat(com.fitbit.data.domain.Length.LengthUnits lengthunits, com.fitbit.data.domain.Length.LengthUnits lengthunits1)
    {
        length = new Length();
        sourceUnit = lengthunits;
        targetUnit = lengthunits1;
        length.b(lengthunits);
    }

    public StringBuffer format(double d, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        String s = targetUnit.getShortDisplayName();
        length.a(d);
        double d1 = d;
        if (sourceUnit != targetUnit)
        {
            d1 = length.a(targetUnit).b();
        }
        String s1 = s;
        d = d1;
        if (targetUnit == com.fitbit.data.domain.Length.LengthUnits.KM)
        {
            s1 = s;
            d = d1;
            if (d1 < 1.0D)
            {
                d = Math.round(length.a(com.fitbit.data.domain.Length.LengthUnits.METERS).b());
                s1 = com.fitbit.data.domain.Length.LengthUnits.METERS.getShortDisplayName();
            }
        }
        s = s1;
        d1 = d;
        if (targetUnit == com.fitbit.data.domain.Length.LengthUnits.MILES)
        {
            s = s1;
            d1 = d;
            if (d < 0.10000000000000001D)
            {
                d1 = Math.round(length.a(com.fitbit.data.domain.Length.LengthUnits.FEET).b());
                s = com.fitbit.data.domain.Length.LengthUnits.FEET.getShortDisplayName();
            }
        }
        fieldposition = super.format(d1, stringbuffer, fieldposition);
        stringbuffer = s;
        if (s == com.fitbit.data.domain.Length.LengthUnits.MILES.getShortDisplayName())
        {
            stringbuffer = targetUnit.getQuantityDisplayName(fieldposition.toString());
        }
        return fieldposition.append(" ").append(stringbuffer);
    }

    public StringBuffer format(long l, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        return format(l, stringbuffer, fieldposition);
    }
}
