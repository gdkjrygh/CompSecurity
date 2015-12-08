// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            DecodedObject

final class DecodedNumeric extends DecodedObject
{

    static final int FNC1 = 10;
    private final int firstDigit;
    private final int secondDigit;

    DecodedNumeric(int i, int j, int k)
        throws FormatException
    {
        super(i);
        if (j < 0 || j > 10 || k < 0 || k > 10)
        {
            throw FormatException.getFormatInstance();
        } else
        {
            firstDigit = j;
            secondDigit = k;
            return;
        }
    }

    int getFirstDigit()
    {
        return firstDigit;
    }

    int getSecondDigit()
    {
        return secondDigit;
    }

    int getValue()
    {
        return firstDigit * 10 + secondDigit;
    }

    boolean isAnyFNC1()
    {
        return firstDigit == 10 || secondDigit == 10;
    }

    boolean isFirstDigitFNC1()
    {
        return firstDigit == 10;
    }

    boolean isSecondDigitFNC1()
    {
        return secondDigit == 10;
    }
}
