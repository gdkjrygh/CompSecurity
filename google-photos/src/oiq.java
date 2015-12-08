// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;

public final class oiq
{

    private static final mzc a = new oir();
    private static final mzc b = new oir();

    public static Bitmap a(Bitmap bitmap)
    {
        Bitmap bitmap1;
        long l;
label0:
        {
            l = System.nanoTime();
            if (android.os.Build.VERSION.SDK_INT >= 12)
            {
                bitmap.setHasAlpha(true);
            }
            if (bitmap.isMutable())
            {
                bitmap1 = bitmap;
                if (bitmap.hasAlpha())
                {
                    break label0;
                }
            }
            bitmap1 = bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        }
        a(new Canvas(bitmap1));
        if (Log.isLoggable("BitmapShapeUtils", 3))
        {
            long l1 = System.nanoTime();
            (new StringBuilder(43)).append("Avatar rounding took ").append(l1 - l).append("ns");
        }
        return bitmap1;
    }

    public static Bitmap a(Bitmap bitmap, float f)
    {
        return a(bitmap, f, null);
    }

    public static Bitmap a(Bitmap bitmap, float f, Bitmap bitmap1)
    {
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        boolean flag;
        if (bitmap1 != null && (bitmap1.getWidth() != bitmap.getWidth() || bitmap1.getHeight() != bitmap.getHeight() || !bitmap1.isMutable()))
        {
            String s = String.valueOf("Given bitmap cannot be reused; Invalid dimensions or immutable: mutable=");
            boolean flag1 = bitmap1.isMutable();
            int i = bitmap1.getWidth();
            int j = bitmap1.getHeight();
            int l = bitmap.getWidth();
            int j1 = bitmap.getHeight();
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 85)).append(s).append(flag1).append(" forMask dimens=[").append(i).append("x").append(j).append(" bitmap dimens=[").append(l).append("x").append(j1).append("]").toString());
        }
        int k = bitmap.getWidth();
        int i1 = bitmap.getHeight();
        Bitmap bitmap2;
        if (bitmap1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bitmap1 != null) goto _L4; else goto _L3
_L3:
        bitmap2 = Bitmap.createBitmap(k, i1, android.graphics.Bitmap.Config.ARGB_8888);
        bitmap1 = bitmap2;
_L6:
        OutOfMemoryError outofmemoryerror;
        if (bitmap1 == null)
        {
            if (Log.isLoggable("BitmapShapeUtils", 5))
            {
                Log.w("BitmapShapeUtils", (new StringBuilder(85)).append("Failed to allocate a bitmap for roundedCornersBitmap of size: ").append(k).append("x").append(i1).toString());
                return null;
            }
        } else
        {
            Object obj = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(((android.graphics.Shader) (obj)));
            bitmap = new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
            obj = new Canvas(bitmap1);
            if (flag)
            {
                ((Canvas) (obj)).drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            }
            ((Canvas) (obj)).drawRoundRect(bitmap, f, f, paint);
            return bitmap1;
        }
        if (true) goto _L1; else goto _L5
_L5:
        outofmemoryerror;
          goto _L6
_L4:
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            bitmap1.setHasAlpha(true);
        }
          goto _L6
    }

    public static void a(Canvas canvas)
    {
        if (b.t())
        {
            a(canvas, (Paint)a.b());
            return;
        }
        synchronized ((Paint)b.b())
        {
            a(canvas, paint);
        }
        return;
        canvas;
        paint;
        JVM INSTR monitorexit ;
        throw canvas;
    }

    private static void a(Canvas canvas, Paint paint)
    {
        float f = (float)Math.min(canvas.getWidth(), canvas.getHeight()) / 2.0F;
        float f1 = (float)Math.hypot(canvas.getWidth(), canvas.getHeight()) - f;
        paint.setStrokeWidth(f1);
        canvas.drawCircle((float)canvas.getWidth() / 2.0F, (float)canvas.getHeight() / 2.0F, f + f1 / 2.0F, paint);
    }

}
