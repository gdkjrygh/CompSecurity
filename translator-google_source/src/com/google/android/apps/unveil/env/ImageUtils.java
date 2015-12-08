// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.graphics.Matrix;

// Referenced classes of package com.google.android.apps.unveil.env:
//            af, v, Size

public class ImageUtils
{

    private static final af a = new af();

    public ImageUtils()
    {
    }

    public static int a(int i, int j)
    {
        double d = ((double)i * (double)j) / 1000000D;
        double d1 = 3681D + 55382D * d;
        if (d1 < 44999.999900000003D)
        {
            if ((i = (int)((Math.sqrt(d * 2000D) * -0.85334390000000004D - 12.19872D) + Math.log(45000D - d1) * 11.63659D)) >= 60)
            {
                if (i > 95)
                {
                    return 95;
                } else
                {
                    return i;
                }
            }
        }
        return 60;
    }

    public static Matrix a(Size size, Size size1, int i)
    {
        if (Math.abs(i) % 90 != 0)
        {
            a.c("Angle that is not multiple of 90! %d", new Object[] {
                Integer.valueOf(i)
            });
        }
        Matrix matrix = new Matrix();
        if (i != 0)
        {
            matrix.postTranslate((float)(-size.width) / 2.0F, (float)(-size.height) / 2.0F);
            matrix.postRotate(i);
        }
        int j;
        int k;
        if ((Math.abs(i) + 90) % 180 == 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            j = size.height;
        } else
        {
            j = size.width;
        }
        if (k != 0)
        {
            k = size.width;
        } else
        {
            k = size.height;
        }
        if (j != size1.width || k != size1.height)
        {
            matrix.postScale((float)size1.width / (float)j, (float)size1.height / (float)k);
        }
        if (i != 0)
        {
            matrix.postTranslate((float)size1.width / 2.0F, (float)size1.height / 2.0F);
        }
        return matrix;
    }

    public static int b(int i, int j)
    {
        return i * j + (((i + 1) / 2) * ((j + 1) / 2) << 1);
    }

    public static native float[] calcBlurredValue(byte abyte0[], int i, int j);

    public static native void computeEdgeBitmap(int i, int j, byte abyte0[], byte abyte1[]);

    private static native float[] computeImageStatisticsNative(int i, int j, byte abyte0[]);

    public static native int[] computeSignatureNative(byte abyte0[], int i, int j, int ai[]);

    public static native void convertARGB8888ToYUV420SP(int ai[], byte abyte0[], int i, int j);

    public static native void convertRGB565ToYUV420SP(byte abyte0[], byte abyte1[], int i, int j);

    public static native void convertYUV420SPToARGB8888(byte abyte0[], int ai[], int i, int j, boolean flag);

    public static native void convertYUV420SPToRGB565(byte abyte0[], byte abyte1[], int i, int j);

    public static native byte[] decodeJpegToYUV420SP(byte abyte0[], byte abyte1[], int ai[]);

    public static native int diffSignatureNative(int ai[], int ai1[]);

    public static native void downsampleImageNative(int i, int j, byte abyte0[], int k, byte abyte1[]);

    public static native byte[] encodeJpegFromYUV420SP(byte abyte0[], int i, int j, int k);

    public static native int[] getBucketDistributionNative(byte abyte0[], int i, int j);

    public static native boolean isBlurredNative(byte abyte0[], int i, int j);

    public static native void mirrorX(int i, int j, byte abyte0[]);

    public static native void rotateYuvFrame(int i, int j, int k, byte abyte0[], byte abyte1[]);

    static 
    {
        v.c("imageutils");
    }
}
