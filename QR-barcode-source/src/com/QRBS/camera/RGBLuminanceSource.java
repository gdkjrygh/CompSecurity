// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.camera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.zxing.LuminanceSource;
import java.io.FileNotFoundException;

public final class RGBLuminanceSource extends LuminanceSource
{

    private final byte luminances[];

    public RGBLuminanceSource(Bitmap bitmap)
    {
        int ai[];
        int i;
        int k;
        int l;
        super(bitmap.getWidth(), bitmap.getHeight());
        k = bitmap.getWidth();
        l = bitmap.getHeight();
        ai = new int[k * l];
        bitmap.getPixels(ai, 0, k, 0, 0, k, l);
        luminances = new byte[k * l];
        i = 0;
_L2:
        if (i >= l)
        {
            return;
        }
        int i1 = i * k;
        int j = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    break label0;
                }
                i++;
            }
            if (true)
            {
                continue;
            }
            int l1 = ai[i1 + j];
            int j1 = l1 >> 16 & 0xff;
            int k1 = l1 >> 8 & 0xff;
            l1 &= 0xff;
            if (j1 == k1 && k1 == l1)
            {
                luminances[i1 + j] = (byte)j1;
            } else
            {
                luminances[i1 + j] = (byte)(j1 + k1 + k1 + l1 >> 2);
            }
            j++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public RGBLuminanceSource(String s)
        throws FileNotFoundException
    {
        this(loadBitmap(s));
    }

    private static Bitmap loadBitmap(String s)
        throws FileNotFoundException
    {
        Bitmap bitmap = BitmapFactory.decodeFile(s);
        if (bitmap == null)
        {
            throw new FileNotFoundException((new StringBuilder("Couldn't open ")).append(s).toString());
        } else
        {
            return bitmap;
        }
    }

    public byte[] getMatrix()
    {
        return luminances;
    }

    public byte[] getRow(int i, byte abyte0[])
    {
        byte abyte1[];
        int j;
label0:
        {
            if (i < 0 || i >= getHeight())
            {
                throw new IllegalArgumentException((new StringBuilder("Requested row is outside the image: ")).append(i).toString());
            }
            j = getWidth();
            if (abyte0 != null)
            {
                abyte1 = abyte0;
                if (abyte0.length >= j)
                {
                    break label0;
                }
            }
            abyte1 = new byte[j];
        }
        System.arraycopy(luminances, i * j, abyte1, 0, j);
        return abyte1;
    }
}
