// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.common.base.Optional;
import com.google.wallet.wobl.common.DisplayUnit;
import com.google.wallet.wobl.exception.WoblMalformedDocException;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            TextIr

public static final class length
{

    private Optional length;
    private Optional multiplier;

    public static length of(double d)
    {
        length length1 = new <init>();
        length1.multiplier = Optional.of(Double.valueOf(d));
        return length1;
    }

    public static multiplier of(DisplayUnit displayunit)
    {
        multiplier multiplier1 = new <init>();
        multiplier1.length = Optional.of(displayunit);
        return multiplier1;
    }

    public static length of(String s)
        throws WoblMalformedDocException
    {
        double d;
        try
        {
            d = Double.parseDouble(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            return of(DisplayUnit.of(s));
        }
        if (d >= 0.0D)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        throw new WoblMalformedDocException("line-height must be a non-negative number or a display unit value");
        length length1 = of(d);
        return length1;
    }

    public final Optional getLength()
    {
        return length;
    }

    public final Optional getMultiplier()
    {
        return multiplier;
    }

    public I()
    {
        multiplier = Optional.absent();
        length = Optional.absent();
    }
}
