// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

public final class awc
{

    private static final Paint a = new Paint(6);
    private static final Paint b = new Paint(7);
    private static final Paint c;

    public static int a(int i)
    {
        switch (i)
        {
        default:
            return 0;

        case 5: // '\005'
        case 6: // '\006'
            return 90;

        case 3: // '\003'
        case 4: // '\004'
            return 180;

        case 7: // '\007'
        case 8: // '\b'
            return 270;
        }
    }

    private static android.graphics.Bitmap.Config a(Bitmap bitmap)
    {
        if (bitmap.getConfig() != null)
        {
            return bitmap.getConfig();
        } else
        {
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
    }

    public static Bitmap a(aqm aqm1, Bitmap bitmap, int i)
    {
        Matrix matrix = new Matrix();
        i;
        JVM INSTR tableswitch 2 8: default 52
    //                   2 61
    //                   3 71
    //                   4 80
    //                   5 97
    //                   6 114
    //                   7 123
    //                   8 140;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_140;
_L9:
        if (matrix.isIdentity())
        {
            return bitmap;
        } else
        {
            Object obj = new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
            matrix.mapRect(((RectF) (obj)));
            aqm1 = aqm1.a(Math.round(((RectF) (obj)).width()), Math.round(((RectF) (obj)).height()), a(bitmap));
            matrix.postTranslate(-((RectF) (obj)).left, -((RectF) (obj)).top);
            obj = new Canvas(aqm1);
            ((Canvas) (obj)).drawBitmap(bitmap, matrix, a);
            ((Canvas) (obj)).setBitmap(null);
            return aqm1;
        }
_L2:
        matrix.setScale(-1F, 1.0F);
          goto _L9
_L3:
        matrix.setRotate(180F);
          goto _L9
_L4:
        matrix.setRotate(180F);
        matrix.postScale(-1F, 1.0F);
          goto _L9
_L5:
        matrix.setRotate(90F);
        matrix.postScale(-1F, 1.0F);
          goto _L9
_L6:
        matrix.setRotate(90F);
          goto _L9
_L7:
        matrix.setRotate(-90F);
        matrix.postScale(-1F, 1.0F);
          goto _L9
        matrix.setRotate(-90F);
          goto _L9
    }

    public static Bitmap a(aqm aqm1, Bitmap bitmap, int i, int j)
    {
        float f = 0.0F;
        if (bitmap.getWidth() == i && bitmap.getHeight() == j)
        {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f1;
        float f2;
        Canvas canvas;
        if (bitmap.getWidth() * j > bitmap.getHeight() * i)
        {
            f2 = (float)j / (float)bitmap.getHeight();
            f1 = ((float)i - (float)bitmap.getWidth() * f2) * 0.5F;
        } else
        {
            f2 = (float)i / (float)bitmap.getWidth();
            f = j;
            float f3 = bitmap.getHeight();
            f1 = 0.0F;
            f = (f - f3 * f2) * 0.5F;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((int)(f1 + 0.5F), (int)(f + 0.5F));
        aqm1 = aqm1.a(i, j, a(bitmap));
        a(bitmap, ((Bitmap) (aqm1)));
        canvas = new Canvas(aqm1);
        canvas.drawBitmap(bitmap, matrix, a);
        canvas.setBitmap(null);
        return aqm1;
    }

    private static void a(Bitmap bitmap, Bitmap bitmap1)
    {
        a(bitmap1, bitmap.hasAlpha());
    }

    private static void a(Bitmap bitmap, boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT >= 12 && bitmap != null)
        {
            bitmap.setHasAlpha(flag);
        }
    }

    public static Bitmap b(aqm aqm1, Bitmap bitmap, int i, int j)
    {
        if (bitmap.getWidth() != i || bitmap.getHeight() != j)
        {
            float f = Math.min((float)i / (float)bitmap.getWidth(), (float)j / (float)bitmap.getHeight());
            int k = (int)((float)bitmap.getWidth() * f);
            int l = (int)((float)bitmap.getHeight() * f);
            if (bitmap.getWidth() != k || bitmap.getHeight() != l)
            {
                aqm1 = aqm1.a(k, l, a(bitmap));
                a(bitmap, aqm1);
                if (Log.isLoggable("TransformationUtils", 2))
                {
                    (new StringBuilder(32)).append("request: ").append(i).append("x").append(j);
                    i = bitmap.getWidth();
                    j = bitmap.getHeight();
                    (new StringBuilder(32)).append("toFit:   ").append(i).append("x").append(j);
                    i = aqm1.getWidth();
                    j = aqm1.getHeight();
                    (new StringBuilder(32)).append("toReuse: ").append(i).append("x").append(j);
                    (new StringBuilder(25)).append("minPct:   ").append(f);
                }
                Canvas canvas = new Canvas(aqm1);
                Matrix matrix = new Matrix();
                matrix.setScale(f, f);
                canvas.drawBitmap(bitmap, matrix, a);
                canvas.setBitmap(null);
                return aqm1;
            }
        }
        return bitmap;
    }

    public static Bitmap c(aqm aqm1, Bitmap bitmap, int i, int j)
    {
        int k = Math.min(i, j);
        float f = (float)k / 2.0F;
        Rect rect = new Rect((i - k) / 2, (j - k) / 2, k, k);
        k = bitmap.getWidth();
        int l = bitmap.getHeight();
        int i1 = Math.min(k, l);
        Rect rect1 = new Rect((k - i1) / 2, (l - i1) / 2, i1, i1);
        Bitmap bitmap1;
        Bitmap bitmap2;
        Canvas canvas;
        if (android.graphics.Bitmap.Config.ARGB_8888.equals(bitmap.getConfig()))
        {
            bitmap1 = bitmap;
        } else
        {
            bitmap1 = aqm1.a(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            (new Canvas(bitmap1)).drawBitmap(bitmap, 0.0F, 0.0F, null);
        }
        bitmap2 = aqm1.a(i, j, a(bitmap1));
        a(bitmap2, true);
        canvas = new Canvas(bitmap2);
        canvas.drawCircle((float)rect.left + f, (float)rect.top + f, f, b);
        canvas.drawBitmap(bitmap1, rect1, rect, c);
        canvas.setBitmap(null);
        if (!bitmap1.equals(bitmap))
        {
            aqm1.a(bitmap1);
        }
        return bitmap2;
    }

    static 
    {
        Paint paint = new Paint(7);
        c = paint;
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
    }
}
