// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.utils;

import android.opengl.GLES10;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.assist.ViewScaleType;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;

public final class ImageSizeUtils
{

    private static final int DEFAULT_MAX_BITMAP_DIMENSION = 2048;
    private static ImageSize maxBitmapSize;

    private ImageSizeUtils()
    {
    }

    public static int computeImageSampleSize(ImageSize imagesize, ImageSize imagesize1, ViewScaleType viewscaletype, boolean flag)
    {
        int i;
        int j;
        boolean flag1;
        int i1;
        boolean flag2;
        boolean flag3;
        int j1;
        int k1;
        int l1;
        j = imagesize.getWidth();
        i = imagesize.getHeight();
        j1 = imagesize1.getWidth();
        k1 = imagesize1.getHeight();
        flag2 = true;
        flag3 = true;
        flag1 = true;
        i1 = j / j1;
        l1 = i / k1;
        static class _cls1
        {

            static final int $SwitchMap$com$nostra13$universalimageloader$core$assist$ViewScaleType[];

            static 
            {
                $SwitchMap$com$nostra13$universalimageloader$core$assist$ViewScaleType = new int[ViewScaleType.values().length];
                try
                {
                    $SwitchMap$com$nostra13$universalimageloader$core$assist$ViewScaleType[ViewScaleType.FIT_INSIDE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$nostra13$universalimageloader$core$assist$ViewScaleType[ViewScaleType.CROP.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.nostra13.universalimageloader.core.assist.ViewScaleType[viewscaletype.ordinal()];
        JVM INSTR tableswitch 1 2: default 76
    //                   1 96
    //                   2 167;
           goto _L1 _L2 _L3
_L1:
        i = ((flag1) ? 1 : 0);
_L5:
        j = i;
        if (i < 1)
        {
            j = 1;
        }
        return j;
_L2:
        if (flag)
        {
            i1 = j;
            int k = i;
            j = ((flag2) ? 1 : 0);
            do
            {
                if (i1 / 2 < j1)
                {
                    i = j;
                    if (k / 2 < k1)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                }
                i1 /= 2;
                k /= 2;
                j *= 2;
            } while (true);
        }
        i = Math.max(i1, l1);
        continue; /* Loop/switch isn't completed */
_L3:
        if (flag)
        {
            i1 = j;
            int l = i;
            j = ((flag3) ? 1 : 0);
            do
            {
                i = j;
                if (i1 / 2 < j1)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i = j;
                if (l / 2 < k1)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i1 /= 2;
                l /= 2;
                j *= 2;
            } while (true);
        }
        i = Math.min(i1, l1);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static float computeImageScale(ImageSize imagesize, ImageSize imagesize1, ViewScaleType viewscaletype, boolean flag)
    {
label0:
        {
            int k = imagesize.getWidth();
            int l = imagesize.getHeight();
            int j = imagesize1.getWidth();
            int i = imagesize1.getHeight();
            float f = (float)k / (float)j;
            float f1 = (float)l / (float)i;
            if (viewscaletype == ViewScaleType.FIT_INSIDE && f >= f1 || viewscaletype == ViewScaleType.CROP && f < f1)
            {
                i = (int)((float)l / f);
            } else
            {
                j = (int)((float)k / f1);
            }
            f1 = 1.0F;
            if (flag || j >= k || i >= l)
            {
                f = f1;
                if (!flag)
                {
                    break label0;
                }
                f = f1;
                if (j == k)
                {
                    break label0;
                }
                f = f1;
                if (i == l)
                {
                    break label0;
                }
            }
            f = (float)j / (float)k;
        }
        return f;
    }

    public static int computeMinImageSampleSize(ImageSize imagesize)
    {
        int i = imagesize.getWidth();
        int j = imagesize.getHeight();
        int k = maxBitmapSize.getWidth();
        int l = maxBitmapSize.getHeight();
        return Math.max((int)Math.ceil((float)i / (float)k), (int)Math.ceil((float)j / (float)l));
    }

    public static ImageSize defineTargetSizeForView(ImageAware imageaware, ImageSize imagesize)
    {
        int j = imageaware.getWidth();
        int i = j;
        if (j <= 0)
        {
            i = imagesize.getWidth();
        }
        int k = imageaware.getHeight();
        j = k;
        if (k <= 0)
        {
            j = imagesize.getHeight();
        }
        return new ImageSize(i, j);
    }

    static 
    {
        int ai[] = new int[1];
        GLES10.glGetIntegerv(3379, ai, 0);
        int i = Math.max(ai[0], 2048);
        maxBitmapSize = new ImageSize(i, i);
    }
}
