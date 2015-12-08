// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.common.base.Optional;
import com.google.wallet.wobl.exception.WoblMalformedDocException;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            IntermediateRepresentation

public class BarcodeIr extends IntermediateRepresentation
{
    public static final class BarcodeType extends Enum
    {

        private static final BarcodeType $VALUES[];
        public static final BarcodeType AZTEC;
        public static final BarcodeType CODABAR;
        public static final BarcodeType CODE_128;
        public static final BarcodeType CODE_39;
        public static final BarcodeType DATA_MATRIX;
        public static final BarcodeType EAN_13;
        public static final BarcodeType EAN_8;
        public static final BarcodeType ITF;
        public static final BarcodeType PDF_417;
        public static final BarcodeType PDF_417_COMPACT;
        public static final BarcodeType QR_CODE;
        public static final BarcodeType UPC_A;
        private boolean is2d;

        public static BarcodeType of(String s)
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

        public static BarcodeType valueOf(String s)
        {
            return (BarcodeType)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/BarcodeIr$BarcodeType, s);
        }

        public static BarcodeType[] values()
        {
            return (BarcodeType[])$VALUES.clone();
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
            EAN_8 = new BarcodeType("EAN_8", 0, false);
            EAN_13 = new BarcodeType("EAN_13", 1, false);
            UPC_A = new BarcodeType("UPC_A", 2, false);
            QR_CODE = new BarcodeType("QR_CODE", 3, true);
            CODE_39 = new BarcodeType("CODE_39", 4, false);
            CODE_128 = new BarcodeType("CODE_128", 5, false);
            ITF = new BarcodeType("ITF", 6, false);
            PDF_417 = new BarcodeType("PDF_417", 7, true);
            PDF_417_COMPACT = new BarcodeType("PDF_417_COMPACT", 8, true);
            CODABAR = new BarcodeType("CODABAR", 9, false);
            DATA_MATRIX = new BarcodeType("DATA_MATRIX", 10, true);
            AZTEC = new BarcodeType("AZTEC", 11, true);
            $VALUES = (new BarcodeType[] {
                EAN_8, EAN_13, UPC_A, QR_CODE, CODE_39, CODE_128, ITF, PDF_417, PDF_417_COMPACT, CODABAR, 
                DATA_MATRIX, AZTEC
            });
        }

        private BarcodeType(String s, int i, boolean flag)
        {
            super(s, i);
            is2d = flag;
        }
    }


    private BarcodeType barcodeType;
    private String data;
    private Optional readableCode;

    public BarcodeIr()
    {
        readableCode = Optional.absent();
    }

    public BarcodeType getBarcodeType()
    {
        return barcodeType;
    }

    public String getData()
    {
        return data;
    }

    public Optional getReadableCode()
    {
        return readableCode;
    }

    public void setBarcodeType(BarcodeType barcodetype)
    {
        barcodeType = barcodetype;
    }

    public void setData(String s)
    {
        data = s;
    }

    public void setReadableCode(String s)
    {
        readableCode = Optional.of(s);
    }
}
