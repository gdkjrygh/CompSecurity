// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.gfx;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapHelper
{

    public BitmapHelper()
    {
    }

    private static int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int i, int j)
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

    private static Bitmap createBitmap(int i, int j, int k)
    {
        return Bitmap.createBitmap(i, j, getBitmapConfigForFormat(k));
    }

    private static Bitmap decodeDrawableResource(String s, int i, int j)
    {
        Resources resources = Resources.getSystem();
        int k = resources.getIdentifier(s, null, null);
        if (k == 0)
        {
            return null;
        } else
        {
            s = new android.graphics.BitmapFactory.Options();
            s.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(resources, k, s);
            s.inSampleSize = calculateInSampleSize(s, i, j);
            s.inJustDecodeBounds = false;
            s.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
            return BitmapFactory.decodeResource(resources, k, s);
        }
    }

    private static android.graphics.Bitmap.Config getBitmapConfigForFormat(int i)
    {
        switch (i)
        {
        case 3: // '\003'
        default:
            return android.graphics.Bitmap.Config.ARGB_8888;

        case 1: // '\001'
            return android.graphics.Bitmap.Config.ALPHA_8;

        case 2: // '\002'
            return android.graphics.Bitmap.Config.ARGB_4444;

        case 4: // '\004'
            return android.graphics.Bitmap.Config.RGB_565;
        }
    }

    private static int getBitmapFormatForConfig(android.graphics.Bitmap.Config config)
    {
        static class _cls1
        {

            static final int $SwitchMap$android$graphics$Bitmap$Config[];

            static 
            {
                $SwitchMap$android$graphics$Bitmap$Config = new int[android.graphics.Bitmap.Config.values().length];
                try
                {
                    $SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ARGB_4444.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.RGB_565.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.android.graphics.Bitmap.Config[config.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;

        case 4: // '\004'
            return 4;
        }
    }
}
