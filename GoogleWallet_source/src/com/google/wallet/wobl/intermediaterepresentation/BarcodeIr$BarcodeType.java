// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.wallet.wobl.exception.WoblMalformedDocException;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            BarcodeIr

public static final class is2d extends Enum
{

    private static final AZTEC $VALUES[];
    public static final AZTEC AZTEC;
    public static final AZTEC CODABAR;
    public static final AZTEC CODE_128;
    public static final AZTEC CODE_39;
    public static final AZTEC DATA_MATRIX;
    public static final AZTEC EAN_13;
    public static final AZTEC EAN_8;
    public static final AZTEC ITF;
    public static final AZTEC PDF_417;
    public static final AZTEC PDF_417_COMPACT;
    public static final AZTEC QR_CODE;
    public static final AZTEC UPC_A;
    private boolean is2d;

    public static is2d of(String s)
        throws WoblMalformedDocException
    {
        if (s.equalsIgnoreCase("ean_8"))
        {
            return EAN_8;
        }
        if (s.equalsIgnoreCase("ean_13"))
        {
            return EAN_13;
        }
        if (s.equalsIgnoreCase("upc_a"))
        {
            return UPC_A;
        }
        if (s.equalsIgnoreCase("qr_code"))
        {
            return QR_CODE;
        }
        if (s.equalsIgnoreCase("code_39"))
        {
            return CODE_39;
        }
        if (s.equalsIgnoreCase("code_128"))
        {
            return CODE_128;
        }
        if (s.equalsIgnoreCase("itf") || s.equalsIgnoreCase("ITF_14"))
        {
            return ITF;
        }
        if (s.equalsIgnoreCase("pdf_417"))
        {
            return PDF_417;
        }
        if (s.equalsIgnoreCase("pdf_417_compact"))
        {
            return PDF_417_COMPACT;
        }
        if (s.equalsIgnoreCase("codabar"))
        {
            return CODABAR;
        }
        if (s.equalsIgnoreCase("data_matrix"))
        {
            return DATA_MATRIX;
        }
        if (s.equalsIgnoreCase("aztec"))
        {
            return AZTEC;
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Unrecognized barcode format ".concat(s);
        } else
        {
            s = new String("Unrecognized barcode format ");
        }
        throw new WoblMalformedDocException(s);
    }

    public static AZTEC valueOf(String s)
    {
        return (AZTEC)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/BarcodeIr$BarcodeType, s);
    }

    public static AZTEC[] values()
    {
        return (AZTEC[])$VALUES.clone();
    }

    public final boolean is2d()
    {
        return is2d;
    }

    public final boolean isSquare()
    {
        return this == QR_CODE || this == AZTEC || this == DATA_MATRIX;
    }

    static 
    {
        EAN_8 = new <init>("EAN_8", 0, false);
        EAN_13 = new <init>("EAN_13", 1, false);
        UPC_A = new <init>("UPC_A", 2, false);
        QR_CODE = new <init>("QR_CODE", 3, true);
        CODE_39 = new <init>("CODE_39", 4, false);
        CODE_128 = new <init>("CODE_128", 5, false);
        ITF = new <init>("ITF", 6, false);
        PDF_417 = new <init>("PDF_417", 7, true);
        PDF_417_COMPACT = new <init>("PDF_417_COMPACT", 8, true);
        CODABAR = new <init>("CODABAR", 9, false);
        DATA_MATRIX = new <init>("DATA_MATRIX", 10, true);
        AZTEC = new <init>("AZTEC", 11, true);
        $VALUES = (new .VALUES[] {
            EAN_8, EAN_13, UPC_A, QR_CODE, CODE_39, CODE_128, ITF, PDF_417, PDF_417_COMPACT, CODABAR, 
            DATA_MATRIX, AZTEC
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        is2d = flag;
    }
}
