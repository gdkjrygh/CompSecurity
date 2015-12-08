// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;


// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            DecodedObject

final class DecodedNumeric extends DecodedObject
{

    static final int FNC1 = 10;
    private final int firstDigit;
    private final int secondDigit;

    DecodedNumeric(int i, int j, int k)
    {
        super(i);
        firstDigit = j;
        secondDigit = k;
        if (firstDigit < 0 || firstDigit > 10)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid firstDigit: ").append(j).toString());
        }
        if (secondDigit < 0 || secondDigit > 10)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid secondDigit: ").append(k).toString());
        } else
        {
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
