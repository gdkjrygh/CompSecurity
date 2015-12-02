// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.FaceDetector;
import android.os.Handler;

// Referenced classes of package com.facebook.orca.camera:
//            m, CropImage, CropImageView, l

class k
    implements Runnable
{

    float a;
    Matrix b;
    android.media.FaceDetector.Face c[];
    int d;
    final CropImage e;

    k(CropImage cropimage)
    {
        e = cropimage;
        super();
        a = 1.0F;
        c = new android.media.FaceDetector.Face[3];
    }

    private void a()
    {
        boolean flag1 = false;
        m m1 = new m(CropImage.d(e));
        int i2 = CropImage.c(e).getWidth();
        int l1 = CropImage.c(e).getHeight();
        Rect rect = new Rect(0, 0, i2, l1);
        int i = (Math.min(i2, l1) * 4) / 5;
        RectF rectf;
        Matrix matrix;
        int j;
        int j1;
        boolean flag;
        boolean flag2;
        if (CropImage.g(e) != 0 && CropImage.h(e) != 0)
        {
            if (CropImage.g(e) > CropImage.h(e))
            {
                int i1 = (CropImage.h(e) * i) / CropImage.g(e);
                j = i;
                i = i1;
            } else
            {
                j = (CropImage.g(e) * i) / CropImage.h(e);
            }
        } else
        {
            j = i;
            int k1 = i;
            i = j;
            j = k1;
        }
        j1 = (i2 - j) / 2;
        l1 = (l1 - i) / 2;
        rectf = new RectF(j1, l1, j + j1, i + l1);
        matrix = b;
        flag2 = CropImage.f(e);
        flag = flag1;
        if (CropImage.g(e) != 0)
        {
            flag = flag1;
            if (CropImage.h(e) != 0)
            {
                flag = true;
            }
        }
        m1.a(matrix, rect, rectf, flag2, flag);
        CropImage.d(e).a(m1);
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
        int i1 = (int)((PointF) (obj)).y;
        face = new m(CropImage.d(e));
        obj = new Rect(0, 0, CropImage.c(e).getWidth(), CropImage.c(e).getHeight());
        RectF rectf = new RectF(j, i1, j, i1);
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
        boolean flag2 = CropImage.f(e);
        boolean flag = flag1;
        if (CropImage.g(e) != 0)
        {
            flag = flag1;
            if (CropImage.h(e) != 0)
            {
                flag = true;
            }
        }
        face.a(matrix, ((Rect) (obj)), rectf, flag2, flag);
        CropImage.d(e).a(face);
    }

    static void a(k k1)
    {
        k1.a();
    }

    static void a(k k1, android.media.FaceDetector.Face face)
    {
        k1.a(face);
    }

    private Bitmap b()
    {
        if (CropImage.c(e) == null)
        {
            return null;
        }
        if (CropImage.c(e).getWidth() > 256)
        {
            a = 256F / (float)CropImage.c(e).getWidth();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(a, a);
        return Bitmap.createBitmap(CropImage.c(e), 0, 0, CropImage.c(e).getWidth(), CropImage.c(e).getHeight(), matrix, true);
    }

    public void run()
    {
        b = CropImage.d(e).getImageMatrix();
        Bitmap bitmap = b();
        a = 1.0F / a;
        if (bitmap != null && CropImage.i(e))
        {
            d = (new FaceDetector(bitmap.getWidth(), bitmap.getHeight(), c.length)).findFaces(bitmap, c);
        }
        if (bitmap != null && bitmap != CropImage.c(e))
        {
            bitmap.recycle();
        }
        CropImage.e(e).post(new l(this));
    }
}
