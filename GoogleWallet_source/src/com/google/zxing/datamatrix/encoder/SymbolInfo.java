// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;

// Referenced classes of package com.google.zxing.datamatrix.encoder:
//            DataMatrixSymbolInfo144, SymbolShapeHint

public class SymbolInfo
{

    public static final SymbolInfo PROD_SYMBOLS[];
    private static SymbolInfo symbols[];
    private final int dataCapacity;
    private final int dataRegions;
    private final int errorCodewords;
    public final int matrixHeight;
    public final int matrixWidth;
    private final boolean rectangular;
    private int rsBlockData;
    private int rsBlockError;

    private SymbolInfo(boolean flag, int i, int j, int k, int l, int i1)
    {
        this(flag, i, j, k, l, i1, i, j);
    }

    SymbolInfo(boolean flag, int i, int j, int k, int l, int i1, int j1, 
            int k1)
    {
        rectangular = flag;
        dataCapacity = i;
        errorCodewords = j;
        matrixWidth = k;
        matrixHeight = l;
        dataRegions = i1;
        rsBlockData = j1;
        rsBlockError = k1;
    }

    private int getHorizontalDataRegions()
    {
        byte byte0 = 2;
        switch (dataRegions)
        {
        default:
            throw new IllegalStateException("Cannot handle this number of data regions");

        case 1: // '\001'
            byte0 = 1;
            // fall through

        case 2: // '\002'
        case 4: // '\004'
            return byte0;

        case 16: // '\020'
            return 4;

        case 36: // '$'
            return 6;
        }
    }

    private int getVerticalDataRegions()
    {
        byte byte0 = 1;
        switch (dataRegions)
        {
        default:
            throw new IllegalStateException("Cannot handle this number of data regions");

        case 4: // '\004'
            byte0 = 2;
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            return byte0;

        case 16: // '\020'
            return 4;

        case 36: // '$'
            return 6;
        }
    }

    public static SymbolInfo lookup(int i, SymbolShapeHint symbolshapehint, Dimension dimension, Dimension dimension1, boolean flag)
    {
        SymbolInfo asymbolinfo[] = symbols;
        int k = asymbolinfo.length;
        for (int j = 0; j < k; j++)
        {
            SymbolInfo symbolinfo = asymbolinfo[j];
            if ((symbolshapehint != SymbolShapeHint.FORCE_SQUARE || !symbolinfo.rectangular) && (symbolshapehint != SymbolShapeHint.FORCE_RECTANGLE || symbolinfo.rectangular) && (dimension == null || symbolinfo.getSymbolWidth() >= dimension.getWidth() && symbolinfo.getSymbolHeight() >= dimension.getHeight()) && (dimension1 == null || symbolinfo.getSymbolWidth() <= dimension1.getWidth() && symbolinfo.getSymbolHeight() <= dimension1.getHeight()) && i <= symbolinfo.dataCapacity)
            {
                return symbolinfo;
            }
        }

        if (flag)
        {
            throw new IllegalArgumentException((new StringBuilder("Can't find a symbol arrangement that matches the message. Data codewords: ")).append(i).toString());
        } else
        {
            return null;
        }
    }

    public final int getDataCapacity()
    {
        return dataCapacity;
    }

    public int getDataLengthForInterleavedBlock(int i)
    {
        return rsBlockData;
    }

    public final int getErrorCodewords()
    {
        return errorCodewords;
    }

    public final int getErrorLengthForInterleavedBlock(int i)
    {
        return rsBlockError;
    }

    public int getInterleavedBlockCount()
    {
        return dataCapacity / rsBlockData;
    }

    public final int getSymbolDataHeight()
    {
        return getVerticalDataRegions() * matrixHeight;
    }

    public final int getSymbolDataWidth()
    {
        return getHorizontalDataRegions() * matrixWidth;
    }

    public final int getSymbolHeight()
    {
        return getSymbolDataHeight() + (getVerticalDataRegions() << 1);
    }

    public final int getSymbolWidth()
    {
        return getSymbolDataWidth() + (getHorizontalDataRegions() << 1);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (rectangular)
        {
            s = "Rectangular Symbol:";
        } else
        {
            s = "Square Symbol:";
        }
        stringbuilder.append(s);
        stringbuilder.append(" data region ").append(matrixWidth).append('x').append(matrixHeight);
        stringbuilder.append(", symbol size ").append(getSymbolWidth()).append('x').append(getSymbolHeight());
        stringbuilder.append(", symbol data size ").append(getSymbolDataWidth()).append('x').append(getSymbolDataHeight());
        stringbuilder.append(", codewords ").append(dataCapacity).append('+').append(errorCodewords);
        return stringbuilder.toString();
    }

    static 
    {
        SymbolInfo asymbolinfo[] = new SymbolInfo[30];
        asymbolinfo[0] = new SymbolInfo(false, 3, 5, 8, 8, 1);
        asymbolinfo[1] = new SymbolInfo(false, 5, 7, 10, 10, 1);
        asymbolinfo[2] = new SymbolInfo(true, 5, 7, 16, 6, 1);
        asymbolinfo[3] = new SymbolInfo(false, 8, 10, 12, 12, 1);
        asymbolinfo[4] = new SymbolInfo(true, 10, 11, 14, 6, 2);
        asymbolinfo[5] = new SymbolInfo(false, 12, 12, 14, 14, 1);
        asymbolinfo[6] = new SymbolInfo(true, 16, 14, 24, 10, 1);
        asymbolinfo[7] = new SymbolInfo(false, 18, 14, 16, 16, 1);
        asymbolinfo[8] = new SymbolInfo(false, 22, 18, 18, 18, 1);
        asymbolinfo[9] = new SymbolInfo(true, 22, 18, 16, 10, 2);
        asymbolinfo[10] = new SymbolInfo(false, 30, 20, 20, 20, 1);
        asymbolinfo[11] = new SymbolInfo(true, 32, 24, 16, 14, 2);
        asymbolinfo[12] = new SymbolInfo(false, 36, 24, 22, 22, 1);
        asymbolinfo[13] = new SymbolInfo(false, 44, 28, 24, 24, 1);
        asymbolinfo[14] = new SymbolInfo(true, 49, 28, 22, 14, 2);
        asymbolinfo[15] = new SymbolInfo(false, 62, 36, 14, 14, 4);
        asymbolinfo[16] = new SymbolInfo(false, 86, 42, 16, 16, 4);
        asymbolinfo[17] = new SymbolInfo(false, 114, 48, 18, 18, 4);
        asymbolinfo[18] = new SymbolInfo(false, 144, 56, 20, 20, 4);
        asymbolinfo[19] = new SymbolInfo(false, 174, 68, 22, 22, 4);
        asymbolinfo[20] = new SymbolInfo(false, 204, 84, 24, 24, 4, 102, 42);
        asymbolinfo[21] = new SymbolInfo(false, 280, 112, 14, 14, 16, 140, 56);
        asymbolinfo[22] = new SymbolInfo(false, 368, 144, 16, 16, 16, 92, 36);
        asymbolinfo[23] = new SymbolInfo(false, 456, 192, 18, 18, 16, 114, 48);
        asymbolinfo[24] = new SymbolInfo(false, 576, 224, 20, 20, 16, 144, 56);
        asymbolinfo[25] = new SymbolInfo(false, 696, 272, 22, 22, 16, 174, 68);
        asymbolinfo[26] = new SymbolInfo(false, 816, 336, 24, 24, 16, 136, 56);
        asymbolinfo[27] = new SymbolInfo(false, 1050, 408, 18, 18, 36, 175, 68);
        asymbolinfo[28] = new SymbolInfo(false, 1304, 496, 20, 20, 36, 163, 62);
        asymbolinfo[29] = new DataMatrixSymbolInfo144();
        PROD_SYMBOLS = asymbolinfo;
        symbols = asymbolinfo;
    }
}
