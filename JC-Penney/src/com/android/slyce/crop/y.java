// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;

// Referenced classes of package com.android.slyce.crop:
//            z, u

public class y
{

    public static Bitmap a(Bitmap bitmap, float f)
    {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap a(Matrix matrix, Bitmap bitmap, int i, int j, boolean flag)
    {
        int i1 = bitmap.getWidth() - i;
        int k = bitmap.getHeight() - j;
        if (!flag && (i1 < 0 || k < 0))
        {
            matrix = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(matrix);
            i1 = Math.max(0, i1 / 2);
            k = Math.max(0, k / 2);
            Rect rect = new Rect(i1, k, Math.min(i, bitmap.getWidth()) + i1, Math.min(j, bitmap.getHeight()) + k);
            k = (i - rect.width()) / 2;
            i1 = (j - rect.height()) / 2;
            canvas.drawBitmap(bitmap, rect, new Rect(k, i1, i - k, j - i1), null);
            return matrix;
        }
        float f = bitmap.getWidth();
        float f1 = bitmap.getHeight();
        if (f / f1 > (float)i / (float)j)
        {
            f = (float)j / f1;
            Bitmap bitmap1;
            int l;
            int j1;
            if (f < 0.9F || f > 1.0F)
            {
                matrix.setScale(f, f);
            } else
            {
                matrix = null;
            }
        } else
        {
            f = (float)i / f;
            if (f < 0.9F || f > 1.0F)
            {
                matrix.setScale(f, f);
            } else
            {
                matrix = null;
            }
        }
        if (matrix != null)
        {
            matrix = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } else
        {
            matrix = bitmap;
        }
        l = Math.max(0, matrix.getWidth() - i);
        j1 = Math.max(0, matrix.getHeight() - j);
        bitmap1 = Bitmap.createBitmap(matrix, l / 2, j1 / 2, i, j);
        if (matrix != bitmap)
        {
            matrix.recycle();
        }
        return bitmap1;
    }

    public static void a(u u, String s, String s1, Runnable runnable, Handler handler)
    {
        (new Thread(new z(u, runnable, ProgressDialog.show(u, s, s1, true, false), handler))).start();
    }
}
