// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitMatrix;

public final class AztecCode
{

    private int codeWords;
    private boolean compact;
    private int layers;
    private BitMatrix matrix;
    private int size;

    public AztecCode()
    {
    }

    public final BitMatrix getMatrix()
    {
        return matrix;
    }

    public final void setCodeWords(int i)
    {
        codeWords = i;
    }

    public final void setCompact(boolean flag)
    {
        compact = flag;
    }

    public final void setLayers(int i)
    {
        layers = i;
    }

    public final void setMatrix(BitMatrix bitmatrix)
    {
        matrix = bitmatrix;
    }

    public final void setSize(int i)
    {
        size = i;
    }
}
