// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.barcode;


// Referenced classes of package com.google.android.apps.wallet.util.barcode:
//            BarcodeBitmapUtil

static final class odeType
{

    static final int $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[];

    static 
    {
        $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType = new int[com.google.wallet.wobl.intermediaterepresentation.e.values().length];
        try
        {
            $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.e.PDF_417.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.e.EAN_8.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.e.EAN_13.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.e.UPC_A.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.e.CODE_128.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.e.CODE_39.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.e.ITF.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.e.CODABAR.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.e.DATA_MATRIX.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.e.AZTEC.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.e.QR_CODE.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
