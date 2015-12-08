// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.apptentive.android.sdk.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.apptentive.android.sdk.util:
//            Util

public class ImageUtil
{

    public ImageUtil()
    {
    }

    public static float calculateBitmapScaleFactor(int i, int j, int k, int l)
    {
        float f;
        float f1;
        if (k <= 0)
        {
            f = 1.0F;
        } else
        {
            f = (float)k / (float)i;
        }
        if (l <= 0)
        {
            f1 = 1.0F;
        } else
        {
            f1 = (float)l / (float)j;
        }
        return Math.min(1.0F, Math.min(f, f1));
    }

    public static int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int i, int j)
    {
label0:
        {
            int i1 = options.outHeight;
            int l = options.outWidth;
            int k = 1;
            if (i1 > j || l > i)
            {
                k = Math.round((float)i1 / (float)j);
                i = Math.round((float)l / (float)i);
                if (k >= i)
                {
                    break label0;
                }
            }
            return k;
        }
        return i;
    }

    public static Bitmap createLightweightScaledBitmapFromStream(InputStream inputstream, int i, int j, android.graphics.Bitmap.Config config)
    {
        inputstream = new BufferedInputStream(inputstream, 32768);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        if (config == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        options.inPreferredConfig = config;
        config = new android.graphics.BitmapFactory.Options();
        config.inJustDecodeBounds = true;
        inputstream.mark(0x7fffffff);
        BitmapFactory.decodeStream(inputstream, null, config);
        inputstream.reset();
        int k = ((android.graphics.BitmapFactory.Options) (config)).outWidth;
        int l = ((android.graphics.BitmapFactory.Options) (config)).outHeight;
        Log.v("Original bitmap dimensions: %d x %d", new Object[] {
            Integer.valueOf(k), Integer.valueOf(l)
        });
        i = Math.max(k / i, l / j);
        if (i < 2)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        options.inSampleSize = i;
        Log.v("Bitmap sample size = %d", new Object[] {
            Integer.valueOf(options.inSampleSize)
        });
        config = BitmapFactory.decodeStream(inputstream, null, options);
        Log.d("Sampled bitmap size = %d X %d", new Object[] {
            Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight)
        });
        Util.ensureClosed(inputstream);
        return config;
        config;
        Log.e("Error resizing bitmap from InputStream.", config, new Object[0]);
        Util.ensureClosed(inputstream);
        return null;
        config;
        Util.ensureClosed(inputstream);
        throw config;
    }

    public static Bitmap createScaledBitmapFromStream(InputStream inputstream, int i, int j, android.graphics.Bitmap.Config config)
    {
        config = createLightweightScaledBitmapFromStream(inputstream, i, j, config);
        inputstream = config;
        int l = config.getWidth();
        int k = config.getHeight();
        float f = calculateBitmapScaleFactor(l, k, i, j);
        if (f < 1.0F)
        {
            i = (int)((float)l * f);
            j = (int)((float)k * f);
            Log.v("Scaling image further down to %d x %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            inputstream = Bitmap.createScaledBitmap(config, i, j, true);
            Log.d("Final bitmap dimensions: %d x %d", new Object[] {
                Integer.valueOf(inputstream.getWidth()), Integer.valueOf(inputstream.getHeight())
            });
            config.recycle();
        }
        return inputstream;
    }
}
