// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.appboy.b;

public class d
{

    private static final String a;

    public d()
    {
    }

    public static android.support.v4.app.NotificationCompat.Style a(Context context, Bundle bundle, Bundle bundle1)
    {
        Object obj1 = null;
        Object obj = null;
        if (bundle1 != null && bundle1.containsKey("appboy_image_url"))
        {
            context = b(context, bundle, bundle1);
        } else
        {
            context = null;
        }
        if (context == null)
        {
            context = obj1;
            if (bundle != null)
            {
                android.support.v4.app.NotificationCompat.BigTextStyle bigtextstyle = new android.support.v4.app.NotificationCompat.BigTextStyle();
                bigtextstyle.bigText(bundle.getString("a"));
                if (bundle.containsKey("ab_bs"))
                {
                    context = bundle.getString("ab_bs");
                } else
                {
                    context = null;
                }
                bundle1 = obj;
                if (bundle.containsKey("ab_bt"))
                {
                    bundle1 = bundle.getString("ab_bt");
                }
                if (context != null)
                {
                    bigtextstyle.setSummaryText(context);
                }
                if (bundle1 != null)
                {
                    bigtextstyle.setBigContentTitle(bundle1);
                }
                context = bigtextstyle;
            }
            return context;
        } else
        {
            return context;
        }
    }

    private static android.support.v4.app.NotificationCompat.BigPictureStyle b(Context context, Bundle bundle, Bundle bundle1)
    {
        if (bundle1 != null && bundle1.containsKey("appboy_image_url")) goto _L2; else goto _L1
_L1:
        bundle1 = null;
_L6:
        return bundle1;
_L2:
        Object obj;
        bundle1 = bundle1.getString("appboy_image_url");
        if (bundle1 == null)
        {
            return null;
        }
        obj = com.appboy.b.a(bundle1);
        if (obj == null)
        {
            return null;
        }
        bundle1 = ((Bundle) (obj));
        int k;
        if (((Bitmap) (obj)).getWidth() <= ((Bitmap) (obj)).getHeight())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        context = (WindowManager)context.getSystemService("window");
        bundle1 = new DisplayMetrics();
        context.getDefaultDisplay().getMetrics(bundle1);
        k = com.appboy.b.a(((DisplayMetrics) (bundle1)).densityDpi);
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
            return null;
        }
        try
        {
            bundle1 = Bitmap.createScaledBitmap(((Bitmap) (obj)), i, k, true);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            bundle1 = ((Bundle) (obj));
        }
        if (bundle1 == null)
        {
            return null;
        }
        obj = new android.support.v4.app.NotificationCompat.BigPictureStyle();
        ((android.support.v4.app.NotificationCompat.BigPictureStyle) (obj)).bigPicture(bundle1);
        if (!bundle.containsKey("ab_bs"))
        {
            break MISSING_BLOCK_LABEL_242;
        }
        context = bundle.getString("ab_bs");
_L9:
        if (!bundle.containsKey("ab_bt")) goto _L4; else goto _L3
_L3:
        bundle1 = bundle.getString("ab_bt");
_L8:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        ((android.support.v4.app.NotificationCompat.BigPictureStyle) (obj)).setSummaryText(context);
        if (bundle1 == null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        ((android.support.v4.app.NotificationCompat.BigPictureStyle) (obj)).setBigContentTitle(bundle1);
        bundle1 = ((Bundle) (obj));
        if (bundle.getString("s") != null) goto _L6; else goto _L5
_L5:
        bundle1 = ((Bundle) (obj));
        if (context != null) goto _L6; else goto _L7
_L7:
        ((android.support.v4.app.NotificationCompat.BigPictureStyle) (obj)).setSummaryText(bundle.getString("a"));
        return ((android.support.v4.app.NotificationCompat.BigPictureStyle) (obj));
_L4:
        bundle1 = null;
          goto _L8
        context = null;
          goto _L9
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            com.appboy.d.a, com/appboy/e/d.getName()
        });
    }
}
