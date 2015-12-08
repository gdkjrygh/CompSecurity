// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.FaceDetector;
import android.os.Handler;
import android.widget.Toast;
import java.util.ArrayList;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            CropImage, CropImageView, HighlightView

final class c
    implements Runnable
{

    float a;
    Matrix b;
    android.media..Face c[];
    int d;
    final CropImage e;

    public final void run()
    {
        b = CropImage.a(e).getImageMatrix();
        Object obj;
        if (CropImage.b(e) == null)
        {
            obj = null;
        } else
        {
            if (CropImage.b(e).getWidth() > 256)
            {
                a = 256F / (float)CropImage.b(e).getWidth();
            }
            obj = new Matrix();
            ((Matrix) (obj)).setScale(a, a);
            obj = Bitmap.createBitmap(CropImage.b(e), 0, 0, CropImage.b(e).getWidth(), CropImage.b(e).getHeight(), ((Matrix) (obj)), true);
        }
        a = 1.0F / a;
        if (obj != null && CropImage.e(e))
        {
            d = (new FaceDetector(((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), c.length)).findFaces(((Bitmap) (obj)), c);
        }
        if (obj != null && obj != CropImage.b(e))
        {
            ((Bitmap) (obj)).recycle();
        }
        CropImage.f(e).post(new Runnable() {

            final CropImage._cls1 a;

            public final void run()
            {
                CropImage cropimage = a.e;
                boolean flag;
                if (a.d > 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                cropimage.b = flag;
                if (a.d > 0)
                {
                    int i = 0;
                    while (i < a.d) 
                    {
                        CropImage._cls1 _lcls1 = a;
                        Object obj1 = a.c[i];
                        Object obj2 = new PointF();
                        int k = (int)(((android.media.FaceDetector.Face) (obj1)).eyesDistance() * _lcls1.a) * 2;
                        ((android.media.FaceDetector.Face) (obj1)).getMidPoint(((PointF) (obj2)));
                        obj2.x = ((PointF) (obj2)).x * _lcls1.a;
                        obj2.y = ((PointF) (obj2)).y * _lcls1.a;
                        int i1 = (int)((PointF) (obj2)).x;
                        int l1 = (int)((PointF) (obj2)).y;
                        obj1 = new HighlightView(CropImage.a(_lcls1.e));
                        obj2 = new Rect(0, 0, CropImage.b(_lcls1.e).getWidth(), CropImage.b(_lcls1.e).getHeight());
                        RectF rectf = new RectF(i1, l1, i1, l1);
                        rectf.inset(-k, -k);
                        if (rectf.left < 0.0F)
                        {
                            rectf.inset(-rectf.left, -rectf.left);
                        }
                        if (rectf.top < 0.0F)
                        {
                            rectf.inset(-rectf.top, -rectf.top);
                        }
                        if (rectf.right > (float)((Rect) (obj2)).right)
                        {
                            rectf.inset(rectf.right - (float)((Rect) (obj2)).right, rectf.right - (float)((Rect) (obj2)).right);
                        }
                        if (rectf.bottom > (float)((Rect) (obj2)).bottom)
                        {
                            rectf.inset(rectf.bottom - (float)((Rect) (obj2)).bottom, rectf.bottom - (float)((Rect) (obj2)).bottom);
                        }
                        Matrix matrix = _lcls1.b;
                        if (CropImage.c(_lcls1.e) != 0 && CropImage.d(_lcls1.e) != 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        ((HighlightView) (obj1)).a(matrix, ((Rect) (obj2)), rectf, flag);
                        CropImage.a(_lcls1.e).a(((HighlightView) (obj1)));
                        i++;
                    }
                } else
                {
                    CropImage._cls1 _lcls1_1 = a;
                    HighlightView highlightview = new HighlightView(CropImage.a(_lcls1_1.e));
                    int j2 = CropImage.b(_lcls1_1.e).getWidth();
                    int i2 = CropImage.b(_lcls1_1.e).getHeight();
                    Rect rect = new Rect(0, 0, j2, i2);
                    int l = (Math.min(j2, i2) * 4) / 5;
                    RectF rectf1;
                    Matrix matrix1;
                    int j;
                    int j1;
                    boolean flag1;
                    if (CropImage.c(_lcls1_1.e) != 0 && CropImage.d(_lcls1_1.e) != 0)
                    {
                        if (CropImage.c(_lcls1_1.e) > CropImage.d(_lcls1_1.e))
                        {
                            j = (CropImage.d(_lcls1_1.e) * l) / CropImage.c(_lcls1_1.e);
                        } else
                        {
                            int k1 = (CropImage.c(_lcls1_1.e) * l) / CropImage.d(_lcls1_1.e);
                            j = l;
                            l = k1;
                        }
                    } else
                    {
                        j = l;
                    }
                    j1 = (j2 - l) / 2;
                    i2 = (i2 - j) / 2;
                    rectf1 = new RectF(j1, i2, l + j1, j + i2);
                    matrix1 = _lcls1_1.b;
                    if (CropImage.c(_lcls1_1.e) != 0 && CropImage.d(_lcls1_1.e) != 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    highlightview.a(matrix1, rect, rectf1, flag1);
                    CropImage.a(_lcls1_1.e).a.clear();
                    CropImage.a(_lcls1_1.e).a(highlightview);
                }
                CropImage.a(a.e).invalidate();
                if (CropImage.a(a.e).a.size() == 1)
                {
                    a.e.d = (HighlightView)CropImage.a(a.e).a.get(0);
                    a.e.d.e = true;
                }
                if (a.d > 1)
                {
                    Toast.makeText(a.e, "Multi face crop help", 0).show();
                }
            }

            
            {
                a = CropImage._cls1.this;
                super();
            }
        });
    }

    _cls1.a(CropImage cropimage)
    {
        e = cropimage;
        super();
        a = 1.0F;
        c = new android.media..Face[3];
    }
}
