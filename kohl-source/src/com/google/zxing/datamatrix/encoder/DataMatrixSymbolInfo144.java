// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.encoder;


// Referenced classes of package com.google.zxing.datamatrix.encoder:
//            SymbolInfo

final class DataMatrixSymbolInfo144 extends SymbolInfo
{

    DataMatrixSymbolInfo144()
    {
        super(false, 1558, 620, 22, 22, 36, -1, 62);
    }

    public int getDataLengthForInterleavedBlock(int i)
    {
        return i > 8 ? 155 : 156;
    }

    public int getInterleavedBlockCount()
    {
        return 10;
    }
}
