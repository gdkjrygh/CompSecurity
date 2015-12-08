// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import com.cardinalblue.android.piccollage.model.k;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class j
{

    private static final Random a = new Random();
    private static int b[] = {
        0x7f0202d3, 0x7f0202d4, 0x7f0202d5, 0x7f0202d6, 0x7f0202d7, 0x7f0202da
    };

    public j()
    {
    }

    public static int a()
    {
        return b[a.nextInt(b.length)];
    }

    public static Bitmap a(Bitmap bitmap, Bitmap bitmap1)
    {
        Canvas canvas = new Canvas(bitmap);
        if (bitmap1 == null)
        {
            throw new IllegalArgumentException("the bitmap of watermark isn't decode correctly");
        } else
        {
            canvas.drawBitmap(bitmap1, bitmap.getWidth() - bitmap1.getWidth(), bitmap.getHeight() - bitmap1.getHeight(), null);
            return bitmap;
        }
    }

    private static Bitmap a(Bitmap bitmap, Bitmap bitmap1, boolean flag)
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        Canvas canvas;
        Bitmap bitmap2;
label0:
        {
            int l = bitmap.getHeight();
            int j1 = bitmap.getWidth();
            int i;
            if (j1 == l)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0)
            {
                bitmap2 = Bitmap.createBitmap(l, l, android.graphics.Bitmap.Config.ARGB_8888);
                canvas = new Canvas(bitmap2);
                canvas.drawColor(-1);
                canvas.drawBitmap(bitmap, Math.round((l - j1) / 2), 0.0F, null);
            } else
            {
                canvas = new Canvas(bitmap);
                bitmap2 = bitmap;
            }
            if (flag)
            {
                if (i == 0)
                {
                    break label0;
                }
                i = canvas.getWidth();
                int i1 = bitmap1.getWidth();
                int k1 = canvas.getHeight();
                int l1 = bitmap1.getHeight();
                canvas.drawBitmap(bitmap1, i - i1, k1 - l1, null);
            }
            return bitmap2;
        }
        a(canvas, bitmap1, bitmap.getWidth(), bitmap.getHeight(), bitmap2.getWidth(), bitmap2.getHeight());
        return bitmap2;
    }

    public static File a(Context context, File file, boolean flag, boolean flag1)
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        if (file == null || !file.exists())
        {
            throw new com.cardinalblue.android.piccollage.model.k.a(new IllegalArgumentException("src image should not be null or non-exist"));
        }
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inMutable = true;
        try
        {
            obj = BitmapFactory.decodeFile(file.getAbsolutePath(), ((android.graphics.BitmapFactory.Options) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new com.cardinalblue.android.piccollage.model.k.a(new IOException((new StringBuilder()).append("can't decode image : ").append(file.getAbsolutePath()).toString()));
        }
        if (obj == null)
        {
            throw new com.cardinalblue.android.piccollage.model.k.a(new IOException((new StringBuilder()).append("can't decode image : ").append(file.getAbsolutePath()).toString()));
        }
        int i;
        if (flag1)
        {
            if (((Bitmap) (obj)).getWidth() == ((Bitmap) (obj)).getHeight())
            {
                i = 0x7f0202d9;
            } else
            {
                i = 0x7f0202d8;
            }
        } else
        {
            i = a();
        }
        context = BitmapFactory.decodeResource(context.getResources(), i);
        if (context == null)
        {
            throw new com.cardinalblue.android.piccollage.model.k.a(new IOException("can't decode watermark image"));
        }
        float f = (float)((Bitmap) (obj)).getWidth() / 1024F;
        context = Bitmap.createScaledBitmap(context, (int)((float)context.getWidth() * f), (int)(f * (float)context.getHeight()), false);
        if (flag1)
        {
            context = a(((Bitmap) (obj)), ((Bitmap) (context)), flag);
        } else
        if (flag)
        {
            context = a(((Bitmap) (obj)), ((Bitmap) (context)));
        } else
        {
            context = ((Context) (obj));
        }
        file = k.a(context);
        context.recycle();
        return file;
        file;
        throw new com.cardinalblue.android.piccollage.model.k.a(file);
        file;
        context.recycle();
        throw file;
    }

    private static void a(Canvas canvas, Bitmap bitmap, int i, int l, int i1, int j1)
    {
        float f = (float)l / (float)i;
        i = (int)((float)j1 / f);
        l = Math.round((j1 - i) / 2);
        i1 = bitmap.getHeight();
        canvas.drawBitmap(bitmap, i + l, j1 - i1, null);
    }

}
