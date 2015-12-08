// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.FaceDetector;
import android.os.Handler;
import java.util.ArrayList;

// Referenced classes of package com.android.slyce.crop:
//            n, CropImageActivity, CropImageView, m

class l
    implements Runnable
{

    float a;
    Matrix b;
    android.media.FaceDetector.Face c[];
    int d;
    final CropImageActivity e;

    l(CropImageActivity cropimageactivity)
    {
        e = cropimageactivity;
        super();
        a = 1.0F;
        c = new android.media.FaceDetector.Face[3];
    }

    private void a()
    {
        boolean flag1 = false;
        n n1 = new n(CropImageActivity.c(e));
        int i = CropImageActivity.b(e).getWidth();
        int j = CropImageActivity.b(e).getHeight();
        Rect rect = new Rect(0, 0, i, j);
        int k = (Math.min(i, j) * 4) / 5;
        RectF rectf;
        Matrix matrix;
        int i1;
        boolean flag;
        boolean flag2;
        if (CropImageActivity.h(e) != 0 && CropImageActivity.i(e) != 0)
        {
            if (CropImageActivity.h(e) > CropImageActivity.i(e))
            {
                k = (k * CropImageActivity.i(e)) / CropImageActivity.h(e);
            } else
            {
                k = (k * CropImageActivity.h(e)) / CropImageActivity.i(e);
            }
        }
        k = j - 20;
        i1 = (i - i) / 2;
        j = (j - k) / 2;
        rectf = new RectF(i1, j, i + i1, k + j);
        matrix = b;
        flag2 = CropImageActivity.g(e);
        flag = flag1;
        if (CropImageActivity.h(e) != 0)
        {
            flag = flag1;
            if (CropImageActivity.i(e) != 0)
            {
                flag = true;
            }
        }
        n1.a(matrix, rect, rectf, flag2, flag);
        CropImageActivity.c(e).a.clear();
        CropImageActivity.c(e).a(n1);
    }

    private void a(android.media.FaceDetector.Face face)
    {
        boolean flag1 = false;
        Object obj = new PointF();
        int i = (int)(face.eyesDistance() * a) * 2;
        face.getMidPoint(((PointF) (obj)));
        obj.x = ((PointF) (obj)).x * a;
        obj.y = ((PointF) (obj)).y * a;
        int j = (int)((PointF) (obj)).x;
        int k = (int)((PointF) (obj)).y;
        face = new n(CropImageActivity.c(e));
        obj = new Rect(0, 0, CropImageActivity.b(e).getWidth(), CropImageActivity.b(e).getHeight());
        RectF rectf = new RectF(j, k, j, k);
        rectf.inset(-i, -i);
        if (rectf.left < 0.0F)
        {
            rectf.inset(-rectf.left, -rectf.left);
        }
        if (rectf.top < 0.0F)
        {
            rectf.inset(-rectf.top, -rectf.top);
        }
        if (rectf.right > (float)((Rect) (obj)).right)
        {
            rectf.inset(rectf.right - (float)((Rect) (obj)).right, rectf.right - (float)((Rect) (obj)).right);
        }
        if (rectf.bottom > (float)((Rect) (obj)).bottom)
        {
            rectf.inset(rectf.bottom - (float)((Rect) (obj)).bottom, rectf.bottom - (float)((Rect) (obj)).bottom);
        }
        Matrix matrix = b;
        boolean flag2 = CropImageActivity.g(e);
        boolean flag = flag1;
        if (CropImageActivity.h(e) != 0)
        {
            flag = flag1;
            if (CropImageActivity.i(e) != 0)
            {
                flag = true;
            }
        }
        face.a(matrix, ((Rect) (obj)), rectf, flag2, flag);
        CropImageActivity.c(e).a(face);
    }

    static void a(l l1)
    {
        l1.a();
    }

    static void a(l l1, android.media.FaceDetector.Face face)
    {
        l1.a(face);
    }

    private Bitmap b()
    {
        if (CropImageActivity.b(e) == null)
        {
            return null;
        }
        if (CropImageActivity.b(e).getWidth() > 256)
        {
            a = 256F / (float)CropImageActivity.b(e).getWidth();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(a, a);
        return Bitmap.createBitmap(CropImageActivity.b(e), 0, 0, CropImageActivity.b(e).getWidth(), CropImageActivity.b(e).getHeight(), matrix, true);
    }

    public void run()
    {
        b = CropImageActivity.c(e).getImageMatrix();
        Bitmap bitmap = b();
        a = 1.0F / a;
        if (bitmap != null && CropImageActivity.j(e))
        {
            d = (new FaceDetector(bitmap.getWidth(), bitmap.getHeight(), c.length)).findFaces(bitmap, c);
        }
        if (bitmap != null && bitmap != CropImageActivity.b(e))
        {
            bitmap.recycle();
        }
        CropImageActivity.f(e).post(new m(this));
    }
}
