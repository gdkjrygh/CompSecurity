// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Log;

public final class oqj
{

    private static final Paint a = new Paint(2);
    private static final Paint b = new Paint(2);
    private static volatile Thread c;

    public static Bitmap a(Bitmap bitmap, int i, int j)
    {
        if (bitmap != null)
        {
            if (Log.isLoggable("BitmapUtils", 3))
            {
                j = bitmap.getWidth();
                int k = bitmap.getHeight();
                (new StringBuilder(84)).append("resizeToSquareBitmap: Input: ").append(j).append("x").append(k).append(", output:").append(i).append("x").append(i);
            }
            Bitmap bitmap1 = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
            if (bitmap1 != null)
            {
                Canvas canvas = new Canvas(bitmap1);
                if (bitmap.getWidth() != i || bitmap.getHeight() != i)
                {
                    a(canvas, bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, i, i));
                } else
                {
                    canvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
                }
                return bitmap1;
            }
        }
        return null;
    }

    public static Bitmap a(Bitmap bitmap, int i, int j, Bitmap bitmap1)
    {
        if (bitmap != null && i != 0 && j != 0) goto _L2; else goto _L1
_L1:
        Bitmap bitmap2 = null;
_L4:
        return bitmap2;
_L2:
        if (Log.isLoggable("BitmapUtils", 3))
        {
            int k = bitmap.getWidth();
            int i1 = bitmap.getHeight();
            (new StringBuilder(83)).append("resizeAndCropBitmap: Input: ").append(k).append("x").append(i1).append(", output:").append(i).append("x").append(j);
        }
        if (bitmap.getWidth() != i)
        {
            break; /* Loop/switch isn't completed */
        }
        bitmap2 = bitmap;
        if (bitmap.getHeight() == j) goto _L4; else goto _L3
_L3:
        if (bitmap1 == null)
        {
            bitmap1 = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        }
        if (bitmap1 == null)
        {
            return null;
        }
        Canvas canvas = new Canvas(bitmap1);
        int j1 = bitmap.getWidth();
        int l = bitmap.getHeight();
        int k1;
        int l1;
        if (bitmap.getWidth() * j > bitmap.getHeight() * i)
        {
            j1 = (bitmap.getHeight() * i) / j;
        } else
        {
            l = (bitmap.getWidth() * j) / i;
        }
        k1 = (bitmap.getWidth() - j1) / 2;
        l1 = (bitmap.getHeight() - l) / 2;
        a(canvas, bitmap, new Rect(k1, l1, j1 + k1, l + l1), new Rect(0, 0, i, j));
        return bitmap1;
    }

    private static void a(Canvas canvas, Bitmap bitmap, Rect rect, Rect rect1)
    {
        if (c == null)
        {
            c = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == c)
        {
            canvas.drawBitmap(bitmap, rect, rect1, a);
            return;
        }
        synchronized (b)
        {
            canvas.drawBitmap(bitmap, rect, rect1, b);
        }
        return;
        canvas;
        paint;
        JVM INSTR monitorexit ;
        throw canvas;
    }

}
