// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.cardinalblue.android.piccollage.activities.CropImageActivity;
import com.cardinalblue.android.piccollage.controller.f;

// Referenced classes of package com.cardinalblue.android.piccollage.view.crop:
//            a

public class CropImageView extends ImageView
{

    private Matrix a;
    private final Matrix b;
    private Context c;
    private Bitmap d;
    private float e;
    private float f;
    private int g;
    private a h;

    public CropImageView(Context context)
    {
        super(context);
        a = new Matrix();
        b = new Matrix();
        h = null;
        c = context;
        a();
    }

    public CropImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Matrix();
        b = new Matrix();
        h = null;
        c = context;
        a();
    }

    private void a()
    {
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        h = new a(this);
    }

    private void a(Matrix matrix)
    {
        float f1 = getWidth();
        float f2 = getHeight();
        float f3 = d.getWidth();
        float f4 = d.getHeight();
        matrix.reset();
        float f5 = Math.min(Math.min(f1 / f3, 2.0F), Math.min(f2 / f4, 2.0F));
        matrix.postScale(f5, f5);
        matrix.postTranslate((f1 - f3 * f5) / 2.0F, (f2 - f4 * f5) / 2.0F);
    }

    private void b()
    {
        int l1 = d.getWidth();
        int k1 = d.getHeight();
        int i1 = h.d();
        int j1 = h.e();
        Rect rect = new Rect(0, 0, l1, k1);
        int j = (Math.min(l1, k1) * 3) / 5;
        RectF rectf;
        a a1;
        Matrix matrix;
        int i;
        int k;
        boolean flag;
        if (i1 != 0 && j1 != 0)
        {
            if (i1 > j1)
            {
                i = (j * j1) / i1;
            } else
            {
                int l = (j * i1) / j1;
                i = j;
                j = l;
            }
        } else
        {
            i = j;
        }
        k = (l1 - j) / 2;
        k1 = (k1 - i) / 2;
        rectf = new RectF(k, k1, j + k, i + k1);
        a1 = h;
        matrix = getImageMatrix();
        if (i1 != 0 && j1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.a(matrix, rect, rectf, flag);
    }

    private Matrix getImageViewMatrix()
    {
        b.set(a);
        return b;
    }

    public void a(int i, int j)
    {
        h.a(i);
        h.b(j);
    }

    public Bitmap b(int i, int j)
    {
        Rect rect = h.a();
        int k = rect.width();
        int l = rect.height();
        if (k <= 0 || l <= 0)
        {
            return null;
        }
        Bitmap bitmap = Bitmap.createBitmap(d, rect.left, rect.top, k, l);
        if (bitmap == null)
        {
            return null;
        }
        if (i != 0 && j != 0)
        {
            Bitmap bitmap1 = Bitmap.createBitmap(i, j, f.e);
            Canvas canvas = new Canvas(bitmap1);
            Rect rect1 = new Rect(0, 0, i, j);
            i = (rect.width() - rect1.width()) / 2;
            j = (rect.height() - rect1.height()) / 2;
            rect.inset(Math.max(0, i), Math.max(0, j));
            rect1.inset(Math.max(0, -i), Math.max(0, -j));
            canvas.drawBitmap(d, rect, rect1, null);
            bitmap.recycle();
            return bitmap1;
        } else
        {
            return bitmap;
        }
    }

    public Bitmap getBitmap()
    {
        return d;
    }

    public a getHighlightRect()
    {
        return h;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (h != null)
        {
            h.a(canvas);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (d != null)
        {
            a(a);
            setImageMatrix(getImageViewMatrix());
            if (h != null)
            {
                h.c().set(getImageMatrix());
                h.b();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (((CropImageActivity)c).a())
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 44
    //                   0 74
    //                   1 157
    //                   2 170;
           goto _L1 _L2 _L3 _L4
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 1 2: default 72
    //                   1 218
    //                   2 218;
           goto _L5 _L6 _L6
_L5:
        return true;
_L2:
        if (h != null)
        {
            int i = h.a(motionevent.getX(), motionevent.getY());
            if (i != 1)
            {
                g = i;
                e = motionevent.getX();
                f = motionevent.getY();
                a a2 = h;
                a.a a1;
                if (i == 32)
                {
                    a1 = a.a.b;
                } else
                {
                    a1 = a.a.c;
                }
                a2.a(a1);
            }
        }
          goto _L1
_L3:
        h.a(a.a.a);
          goto _L1
_L4:
        h.a(g, motionevent.getX() - e, motionevent.getY() - f);
        e = motionevent.getX();
        f = motionevent.getY();
          goto _L1
_L6:
        if (d != null)
        {
            setImageMatrix(getImageViewMatrix());
        }
          goto _L5
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
        d = bitmap;
        bitmap = getDrawable();
        if (bitmap != null)
        {
            bitmap.setDither(true);
        }
        if (d != null)
        {
            b();
            a(a);
        } else
        {
            a.reset();
        }
        setImageMatrix(getImageViewMatrix());
    }
}
