// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;


// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            DecodedObject

final class DecodedInformation extends DecodedObject
{

    private final String newString;
    private final boolean remaining;
    private final int remainingValue;

    DecodedInformation(int i, String s)
    {
        super(i);
        newString = s;
        remaining = false;
        remainingValue = 0;
    }

    DecodedInformation(int i, String s, int j)
    {
        super(i);
        remaining = true;
        remainingValue = j;
        newString = s;
    }

    String getNewString()
    {
        return newString;
    }

    int getRemainingValue()
    {
        return remainingValue;
    }

    boolean isRemaining()
    {
        return remaining;
    }
}
