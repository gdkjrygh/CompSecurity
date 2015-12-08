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

    public int getCodeWords()
    {
        return codeWords;
    }

    public int getLayers()
    {
        return layers;
    }

    public BitMatrix getMatrix()
    {
        return matrix;
    }

    public int getSize()
    {
        return size;
    }

    public boolean isCompact()
    {
        return compact;
    }

    public void setCodeWords(int i)
    {
        codeWords = i;
    }

    public void setCompact(boolean flag)
    {
        compact = flag;
    }

    public void setLayers(int i)
    {
        layers = i;
    }

    public void setMatrix(BitMatrix bitmatrix)
    {
        matrix = bitmatrix;
    }

    public void setSize(int i)
    {
        size = i;
    }
}
