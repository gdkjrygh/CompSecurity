// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.barcode;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

public final class BarcodeTypeConverter
{
    public static final class TableItem
    {

        public final com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType irType;
        public final int protoWoblType;
        public final int walletEntitiesType;

        private TableItem(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodetype, int i, int j)
        {
            irType = barcodetype;
            walletEntitiesType = i;
            protoWoblType = j;
        }

    }


    private static final List TABLE;

    public static com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType convertToIrBarcodeType(int i)
    {
        Object obj = lookupByWalletEntitiesType(i);
        if (obj == null)
        {
            obj = String.valueOf("Unable to convert WalletEntities.Barcode.Type to BarcodeIr.BarcodeType. WalletEntities.Barcode.Type is ");
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 11)).append(((String) (obj))).append(i).toString());
        } else
        {
            return ((TableItem) (obj)).irType;
        }
    }

    public static TableItem lookupByProtoWoblBarcodeType(int i)
    {
        for (Iterator iterator = TABLE.iterator(); iterator.hasNext();)
        {
            TableItem tableitem = (TableItem)iterator.next();
            if (i == tableitem.protoWoblType)
            {
                return tableitem;
            }
        }

        return null;
    }

    public static TableItem lookupByWalletEntitiesType(int i)
    {
        for (Iterator iterator = TABLE.iterator(); iterator.hasNext();)
        {
            TableItem tableitem = (TableItem)iterator.next();
            if (i == tableitem.walletEntitiesType)
            {
                return tableitem;
            }
        }

        return null;
    }

    static 
    {
        TABLE = ImmutableList.of(new TableItem(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.AZTEC, 2, 1), new TableItem(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.CODABAR, 6, 2), new TableItem(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.CODE_128, 5, 4), new TableItem(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.CODE_39, 3, 3), new TableItem(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.DATA_MATRIX, 7, 5), new TableItem(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.EAN_13, 9, 7), new TableItem(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.EAN_8, 8, 6), new TableItem(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.ITF, 10, 8), new TableItem(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.PDF_417, 11, 9), new TableItem(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.PDF_417_COMPACT, 11, 10), new TableItem(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.QR_CODE, 14, 11), new TableItem(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.UPC_A, 15, 12), new TableItem[0]);
    }
}
