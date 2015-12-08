// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;


final class BarcodeMetadata
{

    private final int columnCount;
    private final int errorCorrectionLevel;
    private final int rowCount;
    private final int rowCountLowerPart;
    private final int rowCountUpperPart;

    BarcodeMetadata(int i, int j, int k, int l)
    {
        columnCount = i;
        errorCorrectionLevel = l;
        rowCountUpperPart = j;
        rowCountLowerPart = k;
        rowCount = j + k;
    }

    final int getColumnCount()
    {
        return columnCount;
    }

    final int getErrorCorrectionLevel()
    {
        return errorCorrectionLevel;
    }

    final int getRowCount()
    {
        return rowCount;
    }

    final int getRowCountLowerPart()
    {
        return rowCountLowerPart;
    }

    final int getRowCountUpperPart()
    {
        return rowCountUpperPart;
    }
}
