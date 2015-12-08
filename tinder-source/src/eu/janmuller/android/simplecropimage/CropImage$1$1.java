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
//            CropImage, HighlightView, CropImageView

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        CropImage cropimage = a.a;
        boolean flag;
        if (a.a > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cropimage.b = flag;
        if (a.a > 0)
        {
            int i = 0;
            while (i < a.a) 
            {
                a a1 = a;
                Object obj = a.a[i];
                Object obj1 = new PointF();
                int k = (int)(((android.media.ace) (obj)).eyesDistance() * a1.a) * 2;
                ((android.media.ace) (obj)).getMidPoint(((PointF) (obj1)));
                obj1.x = ((PointF) (obj1)).x * a1.a;
                obj1.y = ((PointF) (obj1)).y * a1.a;
                int i1 = (int)((PointF) (obj1)).x;
                int l1 = (int)((PointF) (obj1)).y;
                obj = new HighlightView(CropImage.a(a1.<init>));
                obj1 = new Rect(0, 0, CropImage.b(a1.<init>).getWidth(), CropImage.b(a1.<init>).getHeight());
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
                if (rectf.right > (float)((Rect) (obj1)).right)
                {
                    rectf.inset(rectf.right - (float)((Rect) (obj1)).right, rectf.right - (float)((Rect) (obj1)).right);
                }
                if (rectf.bottom > (float)((Rect) (obj1)).bottom)
                {
                    rectf.inset(rectf.bottom - (float)((Rect) (obj1)).bottom, rectf.bottom - (float)((Rect) (obj1)).bottom);
                }
                Matrix matrix = a1.<init>;
                if (CropImage.c(a1.<init>) != 0 && CropImage.d(a1.<init>) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((HighlightView) (obj)).a(matrix, ((Rect) (obj1)), rectf, flag);
                CropImage.a(a1.a).a(((HighlightView) (obj)));
                i++;
            }
        } else
        {
            a a2 = a;
            HighlightView highlightview = new HighlightView(CropImage.a(a2.<init>));
            int j2 = CropImage.b(a2.<init>).getWidth();
            int i2 = CropImage.b(a2.<init>).getHeight();
            Rect rect = new Rect(0, 0, j2, i2);
            int l = (Math.min(j2, i2) * 4) / 5;
            RectF rectf1;
            Matrix matrix1;
            int j;
            int j1;
            boolean flag1;
            if (CropImage.c(a2.<init>) != 0 && CropImage.d(a2.<init>) != 0)
            {
                if (CropImage.c(a2.<init>) > CropImage.d(a2.<init>))
                {
                    j = (CropImage.d(a2.<init>) * l) / CropImage.c(a2.<init>);
                } else
                {
                    int k1 = (CropImage.c(a2.<init>) * l) / CropImage.d(a2.<init>);
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
            matrix1 = a2.<init>;
            if (CropImage.c(a2.<init>) != 0 && CropImage.d(a2.<init>) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            highlightview.a(matrix1, rect, rectf1, flag1);
            CropImage.a(a2.a).a.clear();
            CropImage.a(a2.a).a(highlightview);
        }
        CropImage.a(a.a).invalidate();
        if (CropImage.a(a.a).a.size() == 1)
        {
            a.a.d = (HighlightView)CropImage.a(a.a).a.get(0);
            a.a.d.e = true;
        }
        if (a.a > 1)
        {
            Toast.makeText(a.a, "Multi face crop help", 0).show();
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class eu/janmuller/android/simplecropimage/CropImage$1

/* anonymous class */
    final class CropImage._cls1
        implements Runnable
    {

        float a;
        Matrix b;
        android.media.FaceDetector.Face c[];
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
            CropImage.f(e).post(new CropImage._cls1._cls1(this));
        }

            
            {
                e = cropimage;
                super();
                a = 1.0F;
                c = new android.media.FaceDetector.Face[3];
            }
    }

}
