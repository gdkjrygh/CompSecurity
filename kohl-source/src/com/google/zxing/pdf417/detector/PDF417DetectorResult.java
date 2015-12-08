// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.detector;

import com.google.zxing.common.BitMatrix;
import java.util.List;

public final class PDF417DetectorResult
{

    private final BitMatrix bits;
    private final List points;

    public PDF417DetectorResult(BitMatrix bitmatrix, List list)
    {
        bits = bitmatrix;
        points = list;
    }

    public BitMatrix getBits()
    {
        return bits;
    }

    public List getPoints()
    {
        return points;
    }
}
