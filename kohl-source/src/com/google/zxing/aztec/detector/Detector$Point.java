// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.detector;

import com.google.zxing.ResultPoint;

// Referenced classes of package com.google.zxing.aztec.detector:
//            Detector

static final class y
{

    private final int x;
    private final int y;

    int getX()
    {
        return x;
    }

    int getY()
    {
        return y;
    }

    ResultPoint toResultPoint()
    {
        return new ResultPoint(getX(), getY());
    }

    public String toString()
    {
        return (new StringBuilder()).append("<").append(x).append(' ').append(y).append('>').toString();
    }

    (int i, int j)
    {
        x = i;
        y = j;
    }
}
