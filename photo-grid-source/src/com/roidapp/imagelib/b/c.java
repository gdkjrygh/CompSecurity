// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.b;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Environment;
import com.roidapp.baselib.a.a;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import com.roidapp.imagelib.d.e;
import com.roidapp.imagelib.f;
import java.io.File;

// Referenced classes of package com.roidapp.imagelib.b:
//            d

public final class c
{

    public static Bitmap a(int i, int j, android.graphics.Bitmap.Config config)
    {
        Object obj;
        boolean flag;
        boolean flag1 = false;
        android.graphics.Bitmap.Config config1 = config;
        if (config == null)
        {
            config1 = android.graphics.Bitmap.Config.ARGB_8888;
        }
        obj = null;
        try
        {
            config = Bitmap.createBitmap(i, j, config1);
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.Bitmap.Config config)
        {
            config.printStackTrace();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.Bitmap.Config config)
        {
            config.printStackTrace();
            continue; /* Loop/switch isn't completed */
        }
        obj = config;
_L4:
        config = ((android.graphics.Bitmap.Config) (obj));
        flag = flag1;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        System.gc();
        System.gc();
        config = Bitmap.createBitmap(i, j, config1);
        flag = flag1;
_L2:
        if (config != null)
        {
            obj = config;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_80;
            }
        }
        System.gc();
        System.gc();
        obj = Bitmap.createBitmap(i, j, config1);
        return ((Bitmap) (obj));
        config;
        config.printStackTrace();
        flag = true;
        config = ((android.graphics.Bitmap.Config) (obj));
        continue; /* Loop/switch isn't completed */
        config;
        config.printStackTrace();
        flag = true;
        config = ((android.graphics.Bitmap.Config) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1;
        ((NullPointerException) (obj1)).printStackTrace();
        return config;
        obj1;
        ((IllegalArgumentException) (obj1)).printStackTrace();
        return config;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Bitmap a(Context context, Bitmap bitmap)
    {
        if (bitmap == null || bitmap.isRecycled())
        {
            return null;
        }
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        float f1;
        if (i > j)
        {
            f1 = (float)j * 0.2F;
        } else
        {
            f1 = (float)i * 0.2F;
        }
        com.roidapp.baselib.a.a.a();
        context = com.roidapp.baselib.a.a.a(context, f.bq, f1);
        if (context == null || context.isRecycled())
        {
            return null;
        }
        if (context.getWidth() > context.getHeight())
        {
            f1 /= context.getWidth();
        } else
        {
            f1 /= context.getHeight();
        }
        com.roidapp.baselib.a.a.a();
        context = com.roidapp.baselib.a.a.a(context, f1);
        if (context == null || context.isRecycled())
        {
            return null;
        }
        Bitmap bitmap1;
        Canvas canvas;
        if (i > j)
        {
            f1 = j;
        } else
        {
            f1 = i;
        }
        f1 = 0.02F * f1;
        bitmap1 = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap1);
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
        canvas.drawBitmap(context, (float)(i - context.getWidth()) - f1, (float)(j - context.getHeight()) - f1, null);
        canvas.save(31);
        canvas.restore();
        context.recycle();
        return bitmap1;
    }

    public static Bitmap a(Bitmap bitmap, int i)
    {
        Object obj = null;
        int j = (int)(((float)bitmap.getHeight() / (float)bitmap.getWidth()) * 200F);
        try
        {
            bitmap = Bitmap.createScaledBitmap(bitmap, 200, j, true);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap = null;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap = null;
        }
        if (bitmap != null)
        {
            obj = new e();
            ((e) (obj)).a(null);
            ((e) (obj)).a(i);
            Bitmap bitmap1 = ((e) (obj)).a(bitmap);
            obj = bitmap1;
            if (bitmap != null)
            {
                obj = bitmap1;
                if (!bitmap.isRecycled())
                {
                    bitmap.recycle();
                    return bitmap1;
                }
            }
        }
        return ((Bitmap) (obj));
    }

    public static Bitmap a(String s, int i)
    {
        aj.a();
        Bitmap bitmap = com.roidapp.imagelib.b.d.a(s, 200, 40000);
        if (bitmap == null)
        {
            s = null;
        } else
        {
            Object obj = new e();
            ((e) (obj)).a(s);
            ((e) (obj)).a(i);
            obj = ((e) (obj)).a(bitmap);
            s = ((String) (obj));
            if (bitmap != null)
            {
                s = ((String) (obj));
                if (!bitmap.isRecycled())
                {
                    bitmap.recycle();
                    return ((Bitmap) (obj));
                }
            }
        }
        return s;
    }

    public static String a()
    {
        return (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/roidapp").toString();
    }

    public static void a(Context context, String s)
    {
        Object obj;
        obj = (new StringBuilder("market://details?id=")).append(s).toString();
        s = (new StringBuilder("https://play.google.com/store/apps/details?id=")).append(s).toString();
        if (!n.a(context, "com.android.vending"))
        {
            break MISSING_BLOCK_LABEL_172;
        }
        Intent intent1;
        Uri uri = Uri.parse(((String) (obj)));
        intent1 = new Intent("android.intent.action.VIEW");
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            intent1.setFlags(0x10000000);
        }
        intent1.setClassName("com.android.vending", "com.google.android.finsky.activities.MainActivity");
        intent1.setData(uri);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        context.startActivity(intent1);
_L2:
        return;
        Exception exception1;
        exception1;
        exception1.printStackTrace();
        Intent intent;
        try
        {
            obj = Uri.parse(((String) (obj)));
            intent = new Intent("android.intent.action.VIEW");
            if (android.os.Build.VERSION.SDK_INT < 19)
            {
                intent.setFlags(0x10000000);
            }
            intent.setPackage("com.android.vending");
            intent.setData(((Uri) (obj)));
        }
        catch (Exception exception)
        {
            b(context, s);
            exception.printStackTrace();
            return;
        }
        if (context == null) goto _L2; else goto _L1
_L1:
        context.startActivity(intent);
        return;
        b(context, s);
        return;
    }

    public static void a(Bitmap bitmap)
    {
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }

    private static void b(Context context, String s)
    {
        Intent intent1;
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri uri = Uri.parse(s);
            intent.setFlags(0x10000000);
            intent.setData(uri);
            intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
            context.startActivity(intent);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            try
            {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri uri1 = Uri.parse(s);
                intent2.setFlags(0x10000000);
                intent2.setData(uri1);
                intent2.setPackage("com.android.browser");
                context.startActivity(intent2);
                return;
            }
            catch (Exception exception1)
            {
                exception.printStackTrace();
            }
            s = Uri.parse(s);
            intent1 = new Intent("android.intent.action.VIEW");
            intent1.setFlags(0x10000000);
            intent1.setData(s);
        }
        try
        {
            context.startActivity(intent1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }
}
