// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;

public final class AztecDetectorResult extends DetectorResult
{

    private final boolean compact;
    private final int nbDatablocks;
    private final int nbLayers;

    public AztecDetectorResult(BitMatrix bitmatrix, ResultPoint aresultpoint[], boolean flag, int i, int j)
    {
        super(bitmatrix, aresultpoint);
        compact = flag;
        nbDatablocks = i;
        nbLayers = j;
    }

    public int getNbDatablocks()
    {
        return nbDatablocks;
    }

    public int getNbLayers()
    {
        return nbLayers;
    }

    public boolean isCompact()
    {
        return compact;
    }
}
