// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.barcode;

import android.graphics.Bitmap;
import com.google.android.apps.wallet.logging.WLog;
import com.google.wallet.wobl.renderer.common.BarcodeRenderUtils;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.util.barcode:
//            BarcodeTypeConverter

public class BarcodeBitmapUtil
{

    private static final String TAG = com/google/android/apps/wallet/util/barcode/BarcodeBitmapUtil.getSimpleName();

    public BarcodeBitmapUtil()
    {
    }

    private static Bitmap createBitmap(String s, com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodetype, int i, int j)
        throws IllegalArgumentException, WriterException
    {
        String s1 = TAG;
        String s2 = String.valueOf(barcodetype);
        WLog.v(s1, (new StringBuilder(String.valueOf(s2).length() + 84 + String.valueOf(s).length())).append("Creating barcode bitmap for ").append(s2).append(": [").append(s).append("]\ntargetWidth: ").append(i).append(", targetHeight: ").append(j).toString());
        s = BarcodeRenderUtils.generateBarcodeBitMatrix(s, barcodetype, i, j);
        int j2 = s.getWidth();
        int l1 = 0;
        int k1 = s.getHeight();
        int i2 = 0;
        for (int k = 0; k < s.getWidth();)
        {
            int i1 = 0;
            int k2 = i2;
            while (i1 < s.getHeight()) 
            {
                int k4 = k2;
                int i3 = j2;
                int k3 = l1;
                int i4 = k1;
                if (s.get(k, i1))
                {
                    i2 = j2;
                    if (k < j2)
                    {
                        i2 = k;
                    }
                    j2 = l1;
                    if (k > l1)
                    {
                        j2 = k;
                    }
                    l1 = k1;
                    if (i1 < k1)
                    {
                        l1 = i1;
                    }
                    k4 = k2;
                    i3 = i2;
                    k3 = j2;
                    i4 = l1;
                    if (i1 > k2)
                    {
                        k4 = i1;
                        i4 = l1;
                        k3 = j2;
                        i3 = i2;
                    }
                }
                i1++;
                k2 = k4;
                j2 = i3;
                l1 = k3;
                k1 = i4;
            }
            k++;
            i2 = k2;
        }

        int j3 = s.getWidth();
        int l3 = s.getHeight();
        int j4 = (l1 - j2) + 1;
        int l2 = (i2 - k1) + 1;
        int j1 = 1;
        int l = j1;
        if (j4 << 1 <= i)
        {
            l = j1;
            if (l2 << 1 <= j)
            {
                l = Math.min(i / j4, j / l2);
            }
        }
        WLog.v(TAG, (new StringBuilder(190)).append("bitmapWidth: ").append(j4).append(", bitmapHeight: ").append(l2).append(", scaling factor: ").append(l).append(", left padding: ").append(j2).append(", right padding: ").append(j3 - l1 - 1).append(", top padding: ").append(k1).append(", bottom padding: ").append(l3 - i2 - 1).toString());
        j1 = j4 * l;
        l1 = l2 * l;
        barcodetype = new int[j1 * l1];
        Arrays.fill(barcodetype, -1);
        for (i = 0; i < l1; i++)
        {
            for (j = 0; j < j1; j++)
            {
                if (s.get(j / l + j2, i / l + k1))
                {
                    barcodetype[i * j1 + j] = 0xff000000;
                }
            }

        }

        return Bitmap.createBitmap(barcodetype, j1, l1, android.graphics.Bitmap.Config.RGB_565);
    }

    public static Bitmap generateBitmap(String s, int i, int j, int k)
        throws IllegalArgumentException, WriterException
    {
        com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodetype = BarcodeTypeConverter.convertToIrBarcodeType(i);
        Bitmap abitmap[] = new Bitmap[3];
        int i1 = (int)((double)j / getIdealAspectRatioFor(barcodetype) + 0.5D);
        abitmap[0] = createBitmap(s, barcodetype, j, i1);
        if (abitmap[0] == null)
        {
            return abitmap[0];
        }
        i = (j + j) - abitmap[0].getWidth();
        int j1 = (i1 + i1) - abitmap[0].getHeight();
        abitmap[1] = createBitmap(s, barcodetype, i, j1);
        if (abitmap[1] == null)
        {
            return abitmap[0];
        }
        int l1 = abitmap[1].getWidth() - abitmap[0].getWidth();
        int l = abitmap[1].getHeight() - abitmap[0].getHeight();
        int i2 = abitmap[0].getWidth();
        int k1 = abitmap[0].getHeight();
        double d;
        double d1;
        double d2;
        if (l1 > 0)
        {
            i = j + ((j - i2) * (i - j)) / l1;
        } else
        {
            i = (i + i) - j;
        }
        if (l > 0)
        {
            l = i1 + ((i1 - k1) * (j1 - i1)) / l;
        } else
        {
            l = (j1 + j1) - i1;
        }
        abitmap[2] = createBitmap(s, barcodetype, i, l);
        d = score(abitmap[0], j, i1);
        d1 = score(abitmap[1], j, i1);
        d2 = score(abitmap[2], j, i1);
        WLog.v(TAG, (new StringBuilder(108)).append("scores (max height = ").append(k).append(")\n").append(d).append("\n").append(d1).append("\n").append(d2).toString());
        if (d2 < d && d2 < d1 && l <= k)
        {
            return abitmap[2];
        }
        if (d1 < d && j1 <= k)
        {
            return abitmap[1];
        } else
        {
            return abitmap[0];
        }
    }

    private static double getIdealAspectRatioFor(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodetype)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[];

            static 
            {
                $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType = new int[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.values().length];
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.PDF_417.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.EAN_8.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.EAN_13.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.UPC_A.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.CODE_128.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.CODE_39.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.ITF.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.CODABAR.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.DATA_MATRIX.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.AZTEC.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.QR_CODE.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType[barcodetype.ordinal()])
        {
        default:
            barcodetype = String.valueOf(barcodetype);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(barcodetype).length() + 13)).append("Unknown type ").append(barcodetype).toString());

        case 1: // '\001'
            return 3D;

        case 2: // '\002'
            return 4D;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            return 6D;

        case 8: // '\b'
            return 5D;

        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
            return 1.0D;
        }
    }

    private static double score(Bitmap bitmap, int i, int j)
    {
        if (bitmap == null)
        {
            return 1000D;
        } else
        {
            return (double)Math.abs(i - bitmap.getWidth()) / (double)i + (double)Math.abs(j - bitmap.getHeight()) / (double)j;
        }
    }

}
