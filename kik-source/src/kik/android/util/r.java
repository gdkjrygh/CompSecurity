// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.ExifInterface;
import android.os.SystemClock;
import com.a.a.a;
import java.io.IOException;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.util:
//            DeviceUtils, as, bx

public final class r
{

    private static final boolean a = kik.android.util.DeviceUtils.c();
    private static int b;
    private static final as c;
    private static final b d = org.c.c.a("BitmapUtils");

    public static int a(String s)
    {
        if (s == null)
        {
            return -1;
        }
        int i;
        try
        {
            i = (new ExifInterface(s)).getAttributeInt("Orientation", 1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        return i;
    }

    public static Bitmap a(Bitmap bitmap)
    {
        return a(bitmap, 4);
    }

    public static Bitmap a(Bitmap bitmap, int i)
    {
        long l1 = SystemClock.uptimeMillis();
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        d.a("createBlurredBitmap: null bitmap");
_L4:
        return null;
_L2:
        if (bitmap.isRecycled()) goto _L4; else goto _L3
_L3:
        int j;
        int k = bitmap.getWidth();
        j = bitmap.getHeight();
        if (a)
        {
            (new StringBuilder("- input bitmap: ")).append(bitmap.getWidth()).append(" x ").append(bitmap.getHeight());
        }
        k /= i;
        int i1 = j / i;
        int j1 = Math.min(k, i1);
        j = k;
        i = i1;
        if (j1 < 12)
        {
            float f = 12F / (float)j1;
            j = (int)((float)k * f);
            i = (int)((float)i1 * f);
        }
        if (j <= 0 || i <= 0) goto _L6; else goto _L5
_L5:
        Bitmap bitmap1;
        bitmap1 = Bitmap.createScaledBitmap(bitmap, j, i, true);
        if (a)
        {
            (new StringBuilder("- after resize: ")).append(bitmap1.getWidth()).append(" x ").append(bitmap1.getHeight());
        }
        i = bitmap1.getWidth();
        j = bitmap1.getHeight();
        if (a)
        {
            (new StringBuilder("boxBlur(): input: ")).append(i).append(" x ").append(j);
        }
        int l = i * j;
        long l2;
        try
        {
            int ai[] = c.a(l);
            int ai1[] = c.a(l);
            bitmap1.getPixels(ai, 0, i, 0, 0, i, j);
            a(ai, ai1, i, j);
            a(ai1, ai, j, i);
            bitmap = Bitmap.createBitmap(ai, i, j, android.graphics.Bitmap.Config.ARGB_8888);
            c.a(ai);
            c.a(ai1);
            bitmap1.recycle();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            (new StringBuilder("blur Failed with: ")).append(bitmap.getMessage());
            bitmap = null;
        }
        bitmap1 = bitmap;
        if (a)
        {
            (new StringBuilder("- after blur: ")).append(bitmap.getWidth()).append(" x ").append(bitmap.getHeight());
            bitmap1 = bitmap;
        }
_L8:
        l2 = SystemClock.uptimeMillis();
        if (a)
        {
            (new StringBuilder("createBlurredBitmap() done (elapsed = ")).append(l2 - l1).append(" msec)");
        }
        return bitmap1;
_L6:
        com.a.a.a.a((new StringBuilder("Trying to blur a bitmap with invalid height: ")).append(bitmap.getHeight()).append(" or width: ").append(bitmap.getWidth()).toString());
        bitmap1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static Bitmap a(Bitmap bitmap, int i, int j)
    {
        if (bitmap == null)
        {
            return null;
        } else
        {
            int k = bitmap.getWidth();
            int l = bitmap.getHeight();
            float f = (float)i / (float)k;
            float f1 = (float)j / (float)l;
            Matrix matrix = new Matrix();
            matrix.postScale(f, f1);
            return Bitmap.createBitmap(bitmap, 0, 0, k, l, matrix, false);
        }
    }

    private static void a(int ai[], int ai1[], int i, int j)
    {
        int k = 0;
        int k1 = 0;
        while (k < j) 
        {
            int k2 = 0;
            int j2 = 0;
            int i2 = 0;
            int l1 = k;
            int j1 = 0;
            while (i2 < i) 
            {
                int l;
                int i1;
                if (i2 == 0)
                {
                    int l2 = ai[k1];
                    l = k2 + ((0xff0000 & l2) >> 16);
                    i1 = j2 + ((0xff00 & l2) >> 8);
                    j1 += l2 & 0xff;
                    for (j2 = 1; j2 <= 4; j2++)
                    {
                        int i3 = ai[k1 + j2];
                        k2 = 1;
                        if (j2 == 4)
                        {
                            k2 = 0;
                        }
                        l += ((0xff0000 & i3) >> 16) << k2;
                        i1 += ((0xff00 & i3) >> 8) << k2;
                        j1 += (i3 & 0xff) << k2;
                    }

                    j2 = i1;
                    i1 = l;
                    l = j2;
                } else
                {
                    i1 = k1 + i2 + 4;
                    if (i2 + 4 >= i)
                    {
                        i1 = (k1 + i) - 2 - ((i2 + 4) - i);
                    }
                    l = i1;
                    if (i1 < 0)
                    {
                        l = 0;
                    }
                    i1 = l;
                    if (l >= ai.length)
                    {
                        i1 = ai.length - 1;
                    }
                    int j3 = ai[i1];
                    int k3;
                    if (i2 - 4 < 0)
                    {
                        l = (k1 + 4) - i2;
                    } else
                    {
                        l = (k1 + i2) - 4;
                    }
                    k3 = ai[l];
                    i1 = (k2 + ((0xff0000 & j3) >> 16)) - ((0xff0000 & k3) >> 16);
                    l = (((0xff00 & j3) >> 8) + j2) - ((0xff00 & k3) >> 8);
                    j1 = (j1 + (j3 & 0xff)) - (k3 & 0xff);
                }
                ai1[l1] = 0xff000000 | (i1 >> 3) << 16 | (l >> 3) << 8 | j1 >> 3;
                i2++;
                l1 += j;
                j2 = l;
                k2 = i1;
            }
            k++;
            k1 += i;
        }
    }

    public static Bitmap b(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            d.a("getWhiteTintedBitmap: null bitmap");
            return null;
        }
        if (bitmap.getConfig() == null)
        {
            bx.f(new Throwable("Bitmap configuration returned null"));
            return bitmap;
        } else
        {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
            Canvas canvas = new Canvas(bitmap);
            Paint paint = new Paint();
            paint.setColor(0xd6ffffff);
            canvas.drawPaint(paint);
            return bitmap;
        }
    }

    public static Bitmap b(Bitmap bitmap, int i)
    {
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Bitmap) (obj));
_L2:
        obj = bitmap;
        if (i == 1) goto _L4; else goto _L3
_L3:
        obj = new Matrix();
        i;
        JVM INSTR tableswitch 2 8: default 68
    //                   2 70
    //                   3 100
    //                   4 109
    //                   5 126
    //                   6 143
    //                   7 152
    //                   8 169;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L5:
        return bitmap;
_L6:
        ((Matrix) (obj)).setScale(-1F, 1.0F);
_L14:
        try
        {
            obj = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true);
            bitmap.recycle();
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            kik.android.util.bx.a(outofmemoryerror);
            return bitmap;
        }
        return ((Bitmap) (obj));
_L7:
        ((Matrix) (obj)).setRotate(180F);
        continue; /* Loop/switch isn't completed */
_L8:
        ((Matrix) (obj)).setRotate(180F);
        ((Matrix) (obj)).postScale(-1F, 1.0F);
        continue; /* Loop/switch isn't completed */
_L9:
        ((Matrix) (obj)).setRotate(90F);
        ((Matrix) (obj)).postScale(-1F, 1.0F);
        continue; /* Loop/switch isn't completed */
_L10:
        ((Matrix) (obj)).setRotate(90F);
        continue; /* Loop/switch isn't completed */
_L11:
        ((Matrix) (obj)).setRotate(-90F);
        ((Matrix) (obj)).postScale(-1F, 1.0F);
        continue; /* Loop/switch isn't completed */
_L12:
        ((Matrix) (obj)).setRotate(-90F);
        if (true) goto _L14; else goto _L13
_L13:
    }

    public static Bitmap c(Bitmap bitmap)
    {
        int j = 400;
        Bitmap bitmap1;
        if (bitmap == null)
        {
            bitmap1 = null;
        } else
        {
            int i = bitmap.getWidth();
            int k = bitmap.getHeight();
            int l = Math.max(i, k);
            bitmap1 = bitmap;
            if (l > 400)
            {
                if (l == i)
                {
                    i = (int)((400F / (float)i) * (float)k);
                } else
                {
                    float f = 400F / (float)k;
                    j = (int)((float)i * f);
                    i = 400;
                }
                return a(bitmap, j, i);
            }
        }
        return bitmap1;
    }

    public static boolean d(Bitmap bitmap)
    {
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int ai[];
        int k;
        int l;
        int i = bitmap.getWidth();
        k = bitmap.getHeight();
        ai = c.a(i * k);
        bitmap.getPixels(ai, 0, i, 0, 0, i, k);
        k = 0;
        l = 0;
_L9:
        if (k >= ai.length) goto _L1; else goto _L3
_L3:
        int i1 = ai[k];
        if ((i1 >> 24 & 0xff) >= 5) goto _L5; else goto _L4
_L4:
        int j = l + 1;
_L7:
        if (j > ai.length / 2)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L5:
        j = l;
        if ((0xff0000 & i1) >> 16 > 224)
        {
            j = l;
            if ((0xff00 & i1) >> 8 > 224)
            {
                j = l;
                if ((i1 & 0xff) > 224)
                {
                    j = l + 1;
                }
            }
        }
        if (true) goto _L7; else goto _L6
_L6:
        if ((ai.length - k) + j < ai.length / 2) goto _L1; else goto _L8
_L8:
        k++;
        l = j;
          goto _L9
    }

    static 
    {
        b = 2048;
        c = new as(b);
    }
}
