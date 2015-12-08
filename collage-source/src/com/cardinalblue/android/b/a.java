// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.support.v8.renderscript.Allocation;
import android.support.v8.renderscript.Element;
import android.support.v8.renderscript.RenderScript;
import android.support.v8.renderscript.ScriptIntrinsicBlur;
import com.cardinalblue.android.piccollage.model.c;
import java.io.ByteArrayOutputStream;

public class a
{

    public a()
    {
    }

    public static Bitmap a(int i, int j, c c, Bitmap bitmap, RectF rectf)
    {
        if (bitmap == null || i <= 0 || j <= 0)
        {
            return null;
        }
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        paint.setColor(0xffff0000);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        Paint paint1 = new Paint();
        paint1.setColor(0xffff0000);
        paint1.setAntiAlias(true);
        Bitmap bitmap1 = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        if (bitmap1 == null)
        {
            throw new OutOfMemoryError("Cannot create masking bitmap.");
        }
        (new Canvas(bitmap1)).drawPath(c, paint1);
        c = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        if (c == null)
        {
            throw new OutOfMemoryError("Cannot create clipped bitmap.");
        } else
        {
            Canvas canvas = new Canvas(c);
            i = canvas.saveLayer(rectf, null, 15);
            canvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
            canvas.drawBitmap(bitmap1, 0.0F, 0.0F, paint);
            canvas.restoreToCount(i);
            return c;
        }
    }

    public static Bitmap a(Context context, Bitmap bitmap, Bitmap bitmap1, int i)
    {
        Object obj = RenderScript.create(context);
        context = ScriptIntrinsicBlur.create(((RenderScript) (obj)), Element.U8_4(((RenderScript) (obj))));
        bitmap = Allocation.createFromBitmap(((RenderScript) (obj)), bitmap);
        obj = Allocation.createFromBitmap(((RenderScript) (obj)), bitmap1);
        context.setRadius(i);
        context.setInput(bitmap);
        context.forEach(((Allocation) (obj)));
        ((Allocation) (obj)).copyTo(bitmap1);
        return bitmap1;
    }

    public static Bitmap a(Bitmap bitmap, float f, int i)
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        if (f == 0.0F)
        {
            return bitmap;
        }
        Object obj;
        if ((i & 2) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj = new Matrix();
        ((Matrix) (obj)).postRotate(f);
        try
        {
            obj = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            throw new com.cardinalblue.android.piccollage.model.k.a(bitmap);
        }
        if (i == 0 || bitmap == obj)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        bitmap.recycle();
        return ((Bitmap) (obj));
    }

    public static boolean a(Bitmap bitmap, Bitmap bitmap1)
    {
        return bitmap.getWidth() > bitmap1.getWidth() && bitmap.getHeight() > bitmap1.getHeight();
    }

    public static byte[] a(Bitmap bitmap)
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        if (bitmap == null)
        {
            throw new com.cardinalblue.android.piccollage.model.k.a(new OutOfMemoryError("bitmap should not be null"));
        } else
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, bytearrayoutputstream);
            byte abyte0[] = bytearrayoutputstream.toByteArray();
            bitmap.recycle();
            return abyte0;
        }
    }

    public static void b(Bitmap bitmap)
    {
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }
}
