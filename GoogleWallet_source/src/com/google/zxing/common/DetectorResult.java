// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import com.google.zxing.ResultPoint;

// Referenced classes of package com.google.zxing.common:
//            BitMatrix

public class DetectorResult
{

    private final BitMatrix bits;
    private final ResultPoint points[];

    public DetectorResult(BitMatrix bitmatrix, ResultPoint aresultpoint[])
    {
        bits = bitmatrix;
        points = aresultpoint;
    }

    public final BitMatrix getBits()
    {
        return bits;
    }

    public final ResultPoint[] getPoints()
    {
        return points;
    }
}
