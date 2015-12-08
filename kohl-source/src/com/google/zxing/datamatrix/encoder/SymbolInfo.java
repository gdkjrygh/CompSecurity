// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;

// Referenced classes of package com.google.zxing.datamatrix.encoder:
//            DataMatrixSymbolInfo144, SymbolShapeHint

public class SymbolInfo
{

    public static final SymbolInfo PROD_SYMBOLS[] = {
        new SymbolInfo(false, 3, 5, 8, 8, 1), new SymbolInfo(false, 5, 7, 10, 10, 1), new SymbolInfo(true, 5, 7, 16, 6, 1), new SymbolInfo(false, 8, 10, 12, 12, 1), new SymbolInfo(true, 10, 11, 14, 6, 2), new SymbolInfo(false, 12, 12, 14, 14, 1), new SymbolInfo(true, 16, 14, 24, 10, 1), new SymbolInfo(false, 18, 14, 16, 16, 1), new SymbolInfo(false, 22, 18, 18, 18, 1), new SymbolInfo(true, 22, 18, 16, 10, 2), 
        new SymbolInfo(false, 30, 20, 20, 20, 1), new SymbolInfo(true, 32, 24, 16, 14, 2), new SymbolInfo(false, 36, 24, 22, 22, 1), new SymbolInfo(false, 44, 28, 24, 24, 1), new SymbolInfo(true, 49, 28, 22, 14, 2), new SymbolInfo(false, 62, 36, 14, 14, 4), new SymbolInfo(false, 86, 42, 16, 16, 4), new SymbolInfo(false, 114, 48, 18, 18, 4), new SymbolInfo(false, 144, 56, 20, 20, 4), new SymbolInfo(false, 174, 68, 22, 22, 4), 
        new SymbolInfo(false, 204, 84, 24, 24, 4, 102, 42), new SymbolInfo(false, 280, 112, 14, 14, 16, 140, 56), new SymbolInfo(false, 368, 144, 16, 16, 16, 92, 36), new SymbolInfo(false, 456, 192, 18, 18, 16, 114, 48), new SymbolInfo(false, 576, 224, 20, 20, 16, 144, 56), new SymbolInfo(false, 696, 272, 22, 22, 16, 174, 68), new SymbolInfo(false, 816, 336, 24, 24, 16, 136, 56), new SymbolInfo(false, 1050, 408, 18, 18, 36, 175, 68), new SymbolInfo(false, 1304, 496, 20, 20, 36, 163, 62), new DataMatrixSymbolInfo144()
    };
    private static SymbolInfo symbols[] = PROD_SYMBOLS;
    private final int dataCapacity;
    private final int dataRegions;
    private final int errorCodewords;
    public final int matrixHeight;
    public final int matrixWidth;
    private final boolean rectangular;
    private final int rsBlockData;
    private final int rsBlockError;

    public SymbolInfo(boolean flag, int i, int j, int k, int l, int i1)
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

    public static SymbolInfo lookup(int i)
    {
        return lookup(i, SymbolShapeHint.FORCE_NONE, true);
    }

    public static SymbolInfo lookup(int i, SymbolShapeHint symbolshapehint)
    {
        return lookup(i, symbolshapehint, true);
    }

    public static SymbolInfo lookup(int i, SymbolShapeHint symbolshapehint, Dimension dimension, Dimension dimension1, boolean flag)
    {
        SymbolInfo asymbolinfo[];
        int j;
        int k;
        asymbolinfo = symbols;
        k = asymbolinfo.length;
        j = 0;
_L3:
        SymbolInfo symbolinfo;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        symbolinfo = asymbolinfo[j];
          goto _L1
_L5:
        j++;
        if (true) goto _L3; else goto _L2
_L1:
        if (symbolshapehint == SymbolShapeHint.FORCE_SQUARE && symbolinfo.rectangular || symbolshapehint == SymbolShapeHint.FORCE_RECTANGLE && !symbolinfo.rectangular || dimension != null && (symbolinfo.getSymbolWidth() < dimension.getWidth() || symbolinfo.getSymbolHeight() < dimension.getHeight()) || dimension1 != null && (symbolinfo.getSymbolWidth() > dimension1.getWidth() || symbolinfo.getSymbolHeight() > dimension1.getHeight()) || i > symbolinfo.dataCapacity) goto _L5; else goto _L4
_L4:
        return symbolinfo;
_L2:
        if (flag)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can't find a symbol arrangement that matches the message. Data codewords: ").append(i).toString());
        } else
        {
            return null;
        }
    }

    private static SymbolInfo lookup(int i, SymbolShapeHint symbolshapehint, boolean flag)
    {
        return lookup(i, symbolshapehint, null, null, flag);
    }

    public static SymbolInfo lookup(int i, boolean flag, boolean flag1)
    {
        SymbolShapeHint symbolshapehint;
        if (flag)
        {
            symbolshapehint = SymbolShapeHint.FORCE_NONE;
        } else
        {
            symbolshapehint = SymbolShapeHint.FORCE_SQUARE;
        }
        return lookup(i, symbolshapehint, flag1);
    }

    public static void overrideSymbolSet(SymbolInfo asymbolinfo[])
    {
        symbols = asymbolinfo;
    }

    public int getCodewordCount()
    {
        return dataCapacity + errorCodewords;
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

    final int getHorizontalDataRegions()
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
        return getSymbolDataHeight() + getVerticalDataRegions() * 2;
    }

    public final int getSymbolWidth()
    {
        return getSymbolDataWidth() + getHorizontalDataRegions() * 2;
    }

    final int getVerticalDataRegions()
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

}
