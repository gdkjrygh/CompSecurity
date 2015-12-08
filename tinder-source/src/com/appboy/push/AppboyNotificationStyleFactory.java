// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.push;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.appboy.AppboyImageUtils;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;

public class AppboyNotificationStyleFactory
{

    public static final int BIG_PICTURE_STYLE_IMAGE_HEIGHT = 192;
    private static final String TAG;

    public AppboyNotificationStyleFactory()
    {
    }

    public static android.support.v4.app.aa.q getBigNotificationStyle(Context context, Bundle bundle, Bundle bundle1)
    {
        Object obj = null;
        android.support.v4.app.aa.b b = obj;
        if (bundle1 != null)
        {
            b = obj;
            if (bundle1.containsKey("appboy_image_url"))
            {
                b = getBigPictureNotificationStyle(context, bundle, bundle1);
            }
        }
        context = b;
        if (b == null)
        {
            AppboyLogger.d(TAG, "Rendering push notification with BigTextStyle");
            context = getBigTextNotificationStyle(bundle);
        }
        return context;
    }

    public static android.support.v4.app.aa.b getBigPictureNotificationStyle(Context context, Bundle bundle, Bundle bundle1)
    {
        Bitmap bitmap;
        if (bundle1 == null || !bundle1.containsKey("appboy_image_url"))
        {
            return null;
        }
        bundle1 = bundle1.getString("appboy_image_url");
        if (bundle1 == null)
        {
            return null;
        }
        bitmap = AppboyImageUtils.downloadImageBitmap(bundle1);
        if (bitmap == null)
        {
            return null;
        }
        bundle1 = bitmap;
        int k;
        if (bitmap.getWidth() <= bitmap.getHeight())
        {
            break MISSING_BLOCK_LABEL_127;
        }
        context = (WindowManager)context.getSystemService("window");
        bundle1 = new DisplayMetrics();
        context.getDefaultDisplay().getMetrics(bundle1);
        k = AppboyImageUtils.getPixelsFromDensityAndDp(((DisplayMetrics) (bundle1)).densityDpi, 192);
        int j = k * 2;
        int i = j;
        try
        {
            if (j > ((DisplayMetrics) (bundle1)).widthPixels)
            {
                i = ((DisplayMetrics) (bundle1)).widthPixels;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            AppboyLogger.e(TAG, "Failed to create Big Picture Style.", context);
            return null;
        }
        bundle1 = Bitmap.createScaledBitmap(bitmap, i, k, true);
_L2:
        if (bundle1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        AppboyLogger.i(TAG, "Bitmap download failed for push notification. No image will be included with the notification.");
        return null;
        context;
        AppboyLogger.e(TAG, "Failed to scale image bitmap, using original.", context);
        bundle1 = bitmap;
        if (true) goto _L2; else goto _L1
_L1:
        context = new android.support.v4.app.aa.b();
        context.a = bundle1;
        setBigPictureSummaryAndTitle(context, bundle);
        return context;
    }

    public static android.support.v4.app.aa.c getBigTextNotificationStyle(Bundle bundle)
    {
        Object obj = null;
        String s = null;
        if (bundle != null)
        {
            android.support.v4.app.aa.c c = new android.support.v4.app.aa.c();
            c.c(bundle.getString("a"));
            if (bundle.containsKey("ab_bs"))
            {
                obj = bundle.getString("ab_bs");
            } else
            {
                obj = null;
            }
            if (bundle.containsKey("ab_bt"))
            {
                s = bundle.getString("ab_bt");
            }
            if (obj != null)
            {
                c.b(((CharSequence) (obj)));
            }
            if (s != null)
            {
                c.a(s);
            }
            obj = c;
        }
        return ((android.support.v4.app.aa.c) (obj));
    }

    static void setBigPictureSummaryAndTitle(android.support.v4.app.aa.b b, Bundle bundle)
    {
        String s1 = null;
        String s;
        if (bundle.containsKey("ab_bs"))
        {
            s = bundle.getString("ab_bs");
        } else
        {
            s = null;
        }
        if (bundle.containsKey("ab_bt"))
        {
            s1 = bundle.getString("ab_bt");
        }
        if (s != null)
        {
            b.b(s);
        }
        if (s1 != null)
        {
            b.a(s1);
        }
        if (bundle.getString("s") == null && s == null)
        {
            b.b(bundle.getString("a"));
        }
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/push/AppboyNotificationStyleFactory.getName()
        });
    }
}
