// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;


// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class value extends Enum
{

    private static final UPC_EAN_EXTENSION $VALUES[];
    public static final UPC_EAN_EXTENSION AZTEC;
    public static final UPC_EAN_EXTENSION CODABAR;
    public static final UPC_EAN_EXTENSION CODE_128;
    public static final UPC_EAN_EXTENSION CODE_39;
    public static final UPC_EAN_EXTENSION CODE_93;
    public static final UPC_EAN_EXTENSION DATA_MATRIX;
    public static final UPC_EAN_EXTENSION EAN_13;
    public static final UPC_EAN_EXTENSION EAN_8;
    public static final UPC_EAN_EXTENSION ITF_14;
    public static final UPC_EAN_EXTENSION PDF_417;
    public static final UPC_EAN_EXTENSION QR_CODE;
    public static final UPC_EAN_EXTENSION UNKNOWN_FORMAT;
    public static final UPC_EAN_EXTENSION UPC_A;
    public static final UPC_EAN_EXTENSION UPC_E;
    public static final UPC_EAN_EXTENSION UPC_EAN_EXTENSION;
    private static com.google.protobuf.to.Barcode.Type internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

    };
    private final int value;

    public static value valueOf(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return UNKNOWN_FORMAT;

        case 2: // '\002'
            return AZTEC;

        case 3: // '\003'
            return CODE_39;

        case 4: // '\004'
            return CODE_93;

        case 5: // '\005'
            return CODE_128;

        case 6: // '\006'
            return CODABAR;

        case 7: // '\007'
            return DATA_MATRIX;

        case 8: // '\b'
            return EAN_8;

        case 9: // '\t'
            return EAN_13;

        case 10: // '\n'
            return ITF_14;

        case 11: // '\013'
            return PDF_417;

        case 12: // '\f'
            return QR_CODE;

        case 13: // '\r'
            return UPC_A;

        case 14: // '\016'
            return UPC_E;

        case 15: // '\017'
            return UPC_EAN_EXTENSION;
        }
    }

    public static UPC_EAN_EXTENSION valueOf(String s)
    {
        return (UPC_EAN_EXTENSION)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$Barcode$Type, s);
    }

    public static UPC_EAN_EXTENSION[] values()
    {
        return (UPC_EAN_EXTENSION[])$VALUES.clone();
    }

    public final int getNumber()
    {
        return value;
    }

    static 
    {
        UNKNOWN_FORMAT = new <init>("UNKNOWN_FORMAT", 0, 0, 1);
        AZTEC = new <init>("AZTEC", 1, 1, 2);
        CODE_39 = new <init>("CODE_39", 2, 2, 3);
        CODE_93 = new <init>("CODE_93", 3, 3, 4);
        CODE_128 = new <init>("CODE_128", 4, 4, 5);
        CODABAR = new <init>("CODABAR", 5, 5, 6);
        DATA_MATRIX = new <init>("DATA_MATRIX", 6, 6, 7);
        EAN_8 = new <init>("EAN_8", 7, 7, 8);
        EAN_13 = new <init>("EAN_13", 8, 8, 9);
        ITF_14 = new <init>("ITF_14", 9, 9, 10);
        PDF_417 = new <init>("PDF_417", 10, 10, 11);
        QR_CODE = new <init>("QR_CODE", 11, 11, 12);
        UPC_A = new <init>("UPC_A", 12, 12, 13);
        UPC_E = new <init>("UPC_E", 13, 13, 14);
        UPC_EAN_EXTENSION = new <init>("UPC_EAN_EXTENSION", 14, 14, 15);
        $VALUES = (new .VALUES[] {
            UNKNOWN_FORMAT, AZTEC, CODE_39, CODE_93, CODE_128, CODABAR, DATA_MATRIX, EAN_8, EAN_13, ITF_14, 
            PDF_417, QR_CODE, UPC_A, UPC_E, UPC_EAN_EXTENSION
        });
    }

    private _cls1(String s, int i, int j, int k)
    {
        super(s, i);
        value = k;
    }
}
