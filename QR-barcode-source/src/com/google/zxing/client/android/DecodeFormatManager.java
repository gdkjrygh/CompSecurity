// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.Intent;
import android.net.Uri;
import com.google.zxing.BarcodeFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

final class DecodeFormatManager
{

    private static final Pattern COMMA_PATTERN = Pattern.compile(",");
    static final Collection DATA_MATRIX_FORMATS;
    static final Collection ONE_D_FORMATS;
    static final Collection PRODUCT_FORMATS;
    static final Collection QR_CODE_FORMATS;

    private DecodeFormatManager()
    {
    }

    static Collection parseDecodeFormats(Intent intent)
    {
        List list = null;
        String s = intent.getStringExtra("SCAN_FORMATS");
        if (s != null)
        {
            list = Arrays.asList(COMMA_PATTERN.split(s));
        }
        return parseDecodeFormats(((Iterable) (list)), intent.getStringExtra("SCAN_MODE"));
    }

    static Collection parseDecodeFormats(Uri uri)
    {
        List list1 = uri.getQueryParameters("SCAN_FORMATS");
        List list = list1;
        if (list1 != null)
        {
            list = list1;
            if (list1.size() == 1)
            {
                list = list1;
                if (list1.get(0) != null)
                {
                    list = Arrays.asList(COMMA_PATTERN.split((CharSequence)list1.get(0)));
                }
            }
        }
        return parseDecodeFormats(((Iterable) (list)), uri.getQueryParameter("SCAN_MODE"));
    }

    private static Collection parseDecodeFormats(Iterable iterable, String s)
    {
        EnumSet enumset;
        if (iterable == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        enumset = EnumSet.noneOf(com/google/zxing/BarcodeFormat);
        iterable = iterable.iterator();
_L2:
        if (!iterable.hasNext())
        {
            return enumset;
        }
        enumset.add(BarcodeFormat.valueOf((String)iterable.next()));
        if (true) goto _L2; else goto _L1
_L1:
        iterable;
        if (s != null)
        {
            if ("PRODUCT_MODE".equals(s))
            {
                return PRODUCT_FORMATS;
            }
            if ("QR_CODE_MODE".equals(s))
            {
                return QR_CODE_FORMATS;
            }
            if ("DATA_MATRIX_MODE".equals(s))
            {
                return DATA_MATRIX_FORMATS;
            }
            if ("ONE_D_MODE".equals(s))
            {
                return ONE_D_FORMATS;
            }
        }
        return null;
    }

    static 
    {
        QR_CODE_FORMATS = EnumSet.of(BarcodeFormat.QR_CODE);
        DATA_MATRIX_FORMATS = EnumSet.of(BarcodeFormat.DATA_MATRIX);
        PRODUCT_FORMATS = EnumSet.of(BarcodeFormat.UPC_A, new BarcodeFormat[] {
            BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8, BarcodeFormat.RSS_14, BarcodeFormat.RSS_EXPANDED
        });
        ONE_D_FORMATS = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
        ONE_D_FORMATS.addAll(PRODUCT_FORMATS);
    }
}
