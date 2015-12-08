// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import android.graphics.Rect;
import com.google.common.base.Preconditions;
import com.google.zxing.LuminanceSource;

final class RotatedPlanarYUVLuminanceSource extends LuminanceSource
{

    private final Rect croppedArea;
    private final byte croppedAreaBuffer[];
    private final int fullImageWidth;
    private final byte yuvData[];

    public RotatedPlanarYUVLuminanceSource(byte abyte0[], int i, int j, Rect rect, byte abyte1[])
    {
        super(rect.height(), rect.width());
        boolean flag;
        if (rect.right <= i && rect.bottom <= j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Crop rectangle does not fit within image data. crop=%s, image=%dx%d", new Object[] {
            rect, Integer.valueOf(i), Integer.valueOf(j)
        });
        yuvData = abyte0;
        fullImageWidth = i;
        croppedArea = rect;
        croppedAreaBuffer = abyte1;
    }

    private byte[] getRow(int i, byte abyte0[], int j)
        throws IllegalArgumentException
    {
        int l = getWidth();
        int k;
        boolean flag;
        if (abyte0 != null && abyte0.length >= l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "result buffer too small");
        k = j;
        for (i = croppedArea.left + i + (croppedArea.bottom - 1) * fullImageWidth; k < j + l; i -= fullImageWidth)
        {
            abyte0[k] = yuvData[i];
            k++;
        }

        return abyte0;
    }

    private byte[] rotate90DegreesClockwise(byte abyte0[])
    {
        for (int i = 0; i < getHeight(); i++)
        {
            getRow(i, abyte0, getWidth() * i);
        }

        return abyte0;
    }

    public final byte[] getMatrix()
    {
        return rotate90DegreesClockwise(croppedAreaBuffer);
    }

    public final byte[] getRow(int i, byte abyte0[])
    {
        return getRow(i, abyte0, 0);
    }
}
