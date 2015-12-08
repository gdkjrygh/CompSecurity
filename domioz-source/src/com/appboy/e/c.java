// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.bg;
import android.support.v4.app.bh;
import android.support.v4.app.bu;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.appboy.d;
import com.appboy.f;
import com.appboy.f.a;

public class c
{

    private static final String a;

    public c()
    {
    }

    public static bu a(Context context, Bundle bundle, Bundle bundle1)
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
            com.appboy.f.a.a(a, "Rendering push notification with BigTextStyle");
            context = obj1;
            if (bundle != null)
            {
                bh bh1 = new bh();
                bh1.c(bundle.getString("a"));
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
                    bh1.b(context);
                }
                if (bundle1 != null)
                {
                    bh1.a(bundle1);
                }
                context = bh1;
            }
            return context;
        } else
        {
            return context;
        }
    }

    private static bg b(Context context, Bundle bundle, Bundle bundle1)
    {
        if (bundle1 != null && bundle1.containsKey("appboy_image_url")) goto _L2; else goto _L1
_L1:
        bundle1 = null;
_L8:
        return bundle1;
_L2:
        Object obj;
        bundle1 = bundle1.getString("appboy_image_url");
        if (bundle1 == null)
        {
            return null;
        }
        obj = d.a(bundle1);
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
        k = d.a(((DisplayMetrics) (bundle1)).densityDpi);
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
            com.appboy.f.a.c(a, "Failed to create Big Picture Style.", context);
            return null;
        }
        bundle1 = Bitmap.createScaledBitmap(((Bitmap) (obj)), i, k, true);
_L4:
        if (bundle1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        com.appboy.f.a.b(a, "Bitmap download failed for push notification. No image will be included with the notification.");
        return null;
        context;
        com.appboy.f.a.c(a, "Failed to scale image bitmap, using original.", context);
        bundle1 = ((Bundle) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        obj = new bg();
        ((bg) (obj)).a(bundle1);
        if (!bundle.containsKey("ab_bs"))
        {
            break MISSING_BLOCK_LABEL_271;
        }
        context = bundle.getString("ab_bs");
_L11:
        if (!bundle.containsKey("ab_bt")) goto _L6; else goto _L5
_L5:
        bundle1 = bundle.getString("ab_bt");
_L10:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        ((bg) (obj)).b(context);
        if (bundle1 == null)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        ((bg) (obj)).a(bundle1);
        bundle1 = ((Bundle) (obj));
        if (bundle.getString("s") != null) goto _L8; else goto _L7
_L7:
        bundle1 = ((Bundle) (obj));
        if (context != null) goto _L8; else goto _L9
_L9:
        ((bg) (obj)).b(bundle.getString("a"));
        return ((bg) (obj));
_L6:
        bundle1 = null;
          goto _L10
        context = null;
          goto _L11
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/e/c.getName()
        });
    }
}
