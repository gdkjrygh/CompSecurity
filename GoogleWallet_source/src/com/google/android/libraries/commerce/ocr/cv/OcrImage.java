// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv;

import android.graphics.Point;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Arrays;

public final class OcrImage
{

    static final String DESTROYED_MSG = "OcrImage Destroyed";
    private byte data[];
    private int format;
    private int orientation;
    private Point resolution;

    OcrImage()
    {
    }

    public OcrImage(OcrImage ocrimage)
    {
        copyFrom(ocrimage);
    }

    public OcrImage(byte abyte0[], int i, int j, int k, int l)
    {
        this(abyte0, i, new Point(j, k), l);
    }

    public OcrImage(byte abyte0[], int i, Point point, int j)
    {
        Preconditions.checkNotNull(abyte0, "must have data for image");
        Preconditions.checkNotNull(point, "must have resolution for image");
        boolean flag;
        if (i == 256 || i == 16 || i == 17 || i == 4 || i == 0 || i == 20 || i == 0x32315659)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid format %s", new Object[] {
            Integer.valueOf(i)
        });
        data = abyte0;
        format = i;
        resolution = point;
        orientation = j;
    }

    public final OcrImage copyFrom(OcrImage ocrimage)
    {
        return set(ocrimage.data, ocrimage.format, ocrimage.resolution, ocrimage.orientation);
    }

    public final void destroy()
    {
        data = null;
        resolution = null;
        format = 0x80000000;
        orientation = 0x80000000;
    }

    public final boolean equals(Object obj)
    {
        if (!super.equals(obj))
        {
            if (obj instanceof OcrImage)
            {
                if (!isSameType(((OcrImage) (obj = (OcrImage)obj))) || !Arrays.equals(((OcrImage) (obj)).data, data))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final byte[] getData()
    {
        Preconditions.checkNotNull(data, "OcrImage Destroyed");
        return data;
    }

    public final int getFormat()
    {
        boolean flag;
        if (format != 0x80000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "OcrImage Destroyed");
        return format;
    }

    public final int getHeight()
    {
        Preconditions.checkNotNull(resolution, "OcrImage Destroyed");
        return resolution.y;
    }

    public final int getOrientation()
    {
        Preconditions.checkNotNull(resolution, "OcrImage Destroyed");
        return orientation;
    }

    public final Point getResolution()
    {
        Preconditions.checkNotNull(resolution, "OcrImage Destroyed");
        return resolution;
    }

    public final int getWidth()
    {
        Preconditions.checkNotNull(resolution, "OcrImage Destroyed");
        return resolution.x;
    }

    public final OcrImage init(int i)
    {
        if (data == null || data.length != i)
        {
            data = new byte[i];
        }
        return this;
    }

    public final boolean isSameType(OcrImage ocrimage)
    {
        while (ocrimage == null || format != ocrimage.format || !resolution.equals(ocrimage.resolution) || orientation != ocrimage.orientation || data.length != ocrimage.data.length) 
        {
            return false;
        }
        return true;
    }

    public final OcrImage set(byte abyte0[], int i, Point point, int j)
    {
        format = i;
        resolution = point;
        orientation = j;
        init(abyte0.length);
        System.arraycopy(abyte0, 0, data, 0, abyte0.length);
        return this;
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).add("data", data).add("format", format).add("resolution", resolution).add("orientiation", orientation).toString();
    }
}
