// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;
import com.google.zxing.qrcode.QRCodeWriter;
import java.lang.ref.WeakReference;

public class BarcodeCreator
{

    public static final int BLACK = 0xff000000;
    public static final String DEFAULT_BARCODE = "1427 79789 529 029";
    public static final int GREY = 0xffcccccc;
    private static final int WHITE = -1;

    public BarcodeCreator()
    {
    }

    private WeakReference encodeAsBitmap(String s, BarcodeFormat barcodeformat, int i, int j, int k)
    {
        barcodeformat = new Code128Writer();
        BitMatrix bitmatrix;
        bitmatrix = barcodeformat.encode(s, BarcodeFormat.CODE_128, i, j);
        barcodeformat = new WeakReference(Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888));
        int l = 0;
          goto _L1
_L5:
        int i1;
        if (i1 >= j)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        s = (Bitmap)barcodeformat.get();
        int j1;
        if (bitmatrix.get(l, i1))
        {
            j1 = k;
        } else
        {
            j1 = -1;
        }
        s.setPixel(l, i1, j1);
        i1++;
        continue; /* Loop/switch isn't completed */
        l++;
          goto _L1
        s;
        s.printStackTrace();
        s = null;
_L3:
        return s;
_L1:
        s = barcodeformat;
        if (l >= i) goto _L3; else goto _L2
_L2:
        i1 = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private WeakReference encodeQRCodeAsBitmap(String s, BarcodeFormat barcodeformat, int i, int j, int k)
    {
        barcodeformat = new QRCodeWriter();
        BitMatrix bitmatrix;
        bitmatrix = barcodeformat.encode(s, BarcodeFormat.QR_CODE, i, j);
        barcodeformat = new WeakReference(Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888));
        int l = 0;
          goto _L1
_L5:
        int i1;
        if (i1 >= j)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        s = (Bitmap)barcodeformat.get();
        int j1;
        if (bitmatrix.get(l, i1))
        {
            j1 = k;
        } else
        {
            j1 = -1;
        }
        s.setPixel(l, i1, j1);
        i1++;
        continue; /* Loop/switch isn't completed */
        l++;
          goto _L1
        s;
        s.printStackTrace();
        s = null;
_L3:
        return s;
_L1:
        s = barcodeformat;
        if (l >= i) goto _L3; else goto _L2
_L2:
        i1 = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public WeakReference renderBarcode(String s, int i, int j, int k)
    {
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = "1427 79789 529 029";
        }
        return encodeAsBitmap(s1, BarcodeFormat.CODE_128, i, j, k);
    }

    public WeakReference renderQRcode(String s, int i, int j, int k)
    {
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = "1427 79789 529 029";
        }
        return encodeQRCodeAsBitmap(s1, BarcodeFormat.QR_CODE, i, j, k);
    }
}
