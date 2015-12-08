// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.imagecrop;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;
import me.lyft.android.logging.L;

class CropViewportTransformation
    implements Transformation
{

    private static final double MAX_RATIO = 2D;
    int maxHeight;
    int maxWidth;

    public CropViewportTransformation(int i, int j)
    {
        maxWidth = i;
        maxHeight = j;
    }

    private double getMaxRatio(int i, int j, double d, double d1)
    {
        d = Math.max(d / (double)i, d1 / (double)j);
        L.i("scale originalRatio=%f", new Object[] {
            Double.valueOf(d)
        });
        return Math.min(d, 2D);
    }

    private double getMinRatio(int i, int j, double d, double d1)
    {
        d = Math.min(d / (double)i, d1 / (double)j);
        L.i("scale originalRatio=%f", new Object[] {
            Double.valueOf(d)
        });
        return Math.min(d, 2D);
    }

    private int getTargetMeasure(double d, int i, int j)
    {
        if (d == 1.0D)
        {
            return i;
        } else
        {
            return j;
        }
    }

    public String key()
    {
        return (new StringBuilder()).append(maxWidth).append("x").append(maxHeight).toString();
    }

    public Bitmap transform(Bitmap bitmap)
    {
        int i1 = bitmap.getWidth();
        int l = bitmap.getHeight();
        int k = maxWidth;
        int j = maxHeight;
        int j1 = (int)((float)k * 0.625F);
        double d;
        double d1;
        Bitmap bitmap1;
        int i;
        if (i1 == k && l == j)
        {
            d = 1.0D;
            L.d("scale 1: sourceW=%d, sourceH=%d, displayW=%d, displayH=%d, ratio=1", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(l), Integer.valueOf(k), Integer.valueOf(j)
            });
            i = k;
        } else
        if (i1 > k && l > j)
        {
            d = getMinRatio(i1, l, k, j);
            i = (int)((double)i1 * d);
            int k1 = (int)((double)l * d);
            L.d("scale 2: sourceW=%d, sourceH=%d, displayW=%d, displayH=%d, ratio=%f", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(l), Integer.valueOf(k), Integer.valueOf(j), Double.valueOf(d)
            });
            j = k1;
        } else
        if (i1 >= k && l >= j1)
        {
            d = getMaxRatio(i1, l, k, j1);
            i = (int)((double)i1 * d);
            int l1 = (int)((double)l * d);
            L.d("scale 3: sourceW=%d, sourceH=%d, displayW=%d, displayH=%d, ratio=1", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(l), Integer.valueOf(k), Integer.valueOf(j)
            });
            j = l1;
        } else
        if (i1 > k)
        {
            d = getMaxRatio(i1, l, k, j1);
            L.d("scale 4: sourceW=%d, sourceH=%d, displayW=%d, displayH=%d, ratio=%f", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(l), Integer.valueOf(k), Integer.valueOf(j), Double.valueOf(d)
            });
            j = j1;
            i = k;
        } else
        if (l > j)
        {
            d = getMaxRatio(i1, l, k, j);
            i = getTargetMeasure(d, i1, k);
            int i2 = getTargetMeasure(d, l, j);
            L.d("scale 5: sourceW=%d, sourceH=%d, displayW=%d, displayH=%d, ratio=%f", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(l), Integer.valueOf(k), Integer.valueOf(j), Double.valueOf(d)
            });
            j = i2;
        } else
        if (i1 >= k && l >= j1)
        {
            d = 1.0D;
            L.d("scale 6: sourceW=%d, sourceH=%d, displayW=%d, displayH=%d, ratio=1", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(l), Integer.valueOf(k), Integer.valueOf(j)
            });
            j = l;
            i = i1;
        } else
        if (i1 >= k || l >= j1)
        {
            d = getMaxRatio(i1, l, k, j1);
            L.d("scale 7: sourceW=%d, sourceH=%d, displayW=%d, displayH=%d, ratio=%f", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(l), Integer.valueOf(k), Integer.valueOf(j), Double.valueOf(d)
            });
            j = l;
            i = i1;
        } else
        if (i1 < k && l < j && i1 == l)
        {
            d = 1.0D;
            L.d("scale 8: sourceW=%d, sourceH=%d, displayW=%d, displayH=%d, ratio=1", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(l), Integer.valueOf(k), Integer.valueOf(j)
            });
            j = k;
            i = k;
        } else
        if (i1 < k && l < j1 && i1 > l)
        {
            d = 1.0D;
            L.d("scale 9: sourceW=%d, sourceH=%d, displayW=%d, displayH=%d, ratio=1", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(l), Integer.valueOf(k), Integer.valueOf(j)
            });
            j = j1;
            i = k;
        } else
        {
            d = 1.0D;
            L.d("scale 10: sourceW=%d, sourceH=%d, displayW=%d, displayH=%d, ratio=1", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(l), Integer.valueOf(k), Integer.valueOf(j)
            });
            i = k;
        }
        if (j < j1)
        {
            d = getMaxRatio(i1, l, k, j1);
            i = (int)((double)i1 * d);
            j = (int)((double)l * d);
        }
        i = (int)((double)i * Math.max(d, 1.0D));
        d1 = j;
        bitmap1 = Bitmap.createScaledBitmap(bitmap, i, (int)(Math.max(d, 1.0D) * d1), false);
        if (bitmap1 != bitmap)
        {
            bitmap.recycle();
        }
        return bitmap1;
    }
}
