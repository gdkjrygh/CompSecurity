// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.roidapp.imagelib.crop:
//            ImageViewTouchBase, h, t, a, 
//            i

public class CropImageView extends ImageViewTouchBase
{

    public ArrayList a;
    h b;
    float c;
    float d;
    int e;
    private a n;

    public CropImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        b = null;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        getClass().getMethod("setLayerType", new Class[] {
            Integer.TYPE, android/graphics/Paint
        }).invoke(this, new Object[] {
            Integer.valueOf(1), null
        });
        return;
        context;
        context.printStackTrace();
        return;
        context;
        return;
        context;
        return;
        context;
        return;
        context;
    }

    private void a(MotionEvent motionevent)
    {
        int k;
        boolean flag = false;
        int j = 0;
        do
        {
            k = ((flag) ? 1 : 0);
            if (j >= a.size())
            {
                break;
            }
            h h1 = (h)a.get(j);
            h1.b = false;
            h1.b();
            j++;
        } while (true);
          goto _L1
_L3:
        k++;
_L1:
        h h2;
        if (k >= a.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if ((h2 = (h)a.get(k)).a(motionevent.getX(), motionevent.getY()) == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!h2.b)
        {
            h2.b = true;
            h2.b();
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
        invalidate();
        return;
    }

    private void a(h h1)
    {
        h1 = h1.d;
        int j = Math.max(0, 0 - ((Rect) (h1)).left);
        int i1 = Math.min(0, getRight() - getLeft() - ((Rect) (h1)).right);
        int k = Math.max(0, 0 - ((Rect) (h1)).top);
        int l = Math.min(0, getBottom() - getTop() - ((Rect) (h1)).bottom);
        if (j == 0)
        {
            j = i1;
        }
        if (k == 0)
        {
            k = l;
        }
        if (j != 0 || k != 0)
        {
            b(j, k);
        }
    }

    private void b(h h1)
    {
        Rect rect = h1.d;
        float f = rect.width();
        float f2 = rect.height();
        float f3 = getWidth();
        float f4 = getHeight();
        f2 = Math.max(1.0F, Math.min((f3 / f) * 0.6F, (f4 / f2) * 0.6F) * b());
        if ((double)(Math.abs(f2 - b()) / f2) > 0.10000000000000001D)
        {
            float f1;
            Object obj;
            float af[];
            Matrix matrix;
            Matrix matrix1;
            int j;
            int k;
            int l;
            int i1;
            if (f2 > this.k)
            {
                f1 = this.k;
            } else
            {
                f1 = f2;
            }
            af = new float[2];
            af[0] = h1.e.centerX();
            af[1] = h1.e.centerY();
            getImageMatrix().mapPoints(af);
            obj = new Matrix(g);
            ((Matrix) (obj)).postScale(f1 / b(), f1 / b(), af[0], af[1]);
            matrix1 = new Matrix(this.f);
            matrix = new Matrix();
            matrix.set(matrix1);
            matrix.postConcat(((Matrix) (obj)));
            obj = new RectF(h1.e.left, h1.e.top, h1.e.right, h1.e.bottom);
            matrix.mapRect(((RectF) (obj)));
            obj = new Rect(Math.round(((RectF) (obj)).left), Math.round(((RectF) (obj)).top), Math.round(((RectF) (obj)).right), Math.round(((RectF) (obj)).bottom));
            j = Math.max(0, 0 - ((Rect) (obj)).left);
            i1 = Math.min(0, getRight() - getLeft() - ((Rect) (obj)).right);
            k = Math.max(0, 0 - ((Rect) (obj)).top);
            l = Math.min(0, getBottom() - getTop() - ((Rect) (obj)).bottom);
            if (j == 0)
            {
                j = i1;
            }
            if (k == 0)
            {
                k = l;
            }
            obj = new Point(j, k);
            matrix = new float[2];
            matrix[0] = h1.e.centerX();
            matrix[1] = h1.e.centerY();
            getImageMatrix().mapPoints(matrix);
            a(f2, matrix[0], matrix[1], ((Point) (obj)));
        }
        a(h1);
    }

    protected final void a(float f, float f1)
    {
        super.a(f, f1);
        for (int j = 0; j < a.size(); j++)
        {
            h h1 = (h)a.get(j);
            h1.f.postTranslate(f, f1);
            h1.b();
        }

    }

    protected final void a(float f, float f1, float f2, float f3, float f4)
    {
        super.a(f, f1, f2, f3, f4);
        h h1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); h1.b())
        {
            h1 = (h)iterator.next();
            h1.f.set(getImageMatrix());
        }

    }

    public final void a(a a1)
    {
        n = a1;
    }

    protected void onDraw(Canvas canvas)
    {
        BitmapDrawable bitmapdrawable = (BitmapDrawable)getDrawable();
        if (bitmapdrawable != null && bitmapdrawable.getBitmap() != null && !bitmapdrawable.getBitmap().isRecycled())
        {
            super.onDraw(canvas);
            for (int j = 0; j < a.size(); j++)
            {
                ((h)a.get(j)).a(canvas);
            }

        }
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        if (h.b() != null)
        {
            h h1;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); h1.b())
            {
                h1 = (h)iterator.next();
                h1.f.set(getImageMatrix());
            }

        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Object obj;
        int i1;
        i1 = 0;
        obj = n;
        if (((a) (obj)).b || ((a) (obj)).c)
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 56
    //                   0 86
    //                   1 219
    //                   2 370;
           goto _L1 _L2 _L3 _L4
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 1 2: default 84
    //                   1 537
    //                   2 544;
           goto _L5 _L6 _L7
_L5:
        return true;
_L2:
        if (!((a) (obj)).a) goto _L9; else goto _L8
_L8:
        a(motionevent);
          goto _L1
_L9:
        int j = 0;
_L13:
        if (j >= a.size()) goto _L1; else goto _L10
_L10:
        obj = (h)a.get(j);
        i1 = ((h) (obj)).a(motionevent.getX(), motionevent.getY());
        if (i1 == 1) goto _L12; else goto _L11
_L11:
        e = i1;
        b = ((h) (obj));
        c = motionevent.getX();
        d = motionevent.getY();
        obj = b;
        if (i1 == 32)
        {
            j = i.b;
        } else
        {
            j = i.c;
        }
        ((h) (obj)).a(j);
          goto _L1
_L12:
        j++;
          goto _L13
_L3:
        if (((a) (obj)).a)
        {
            for (int k = 0; k < a.size(); k++)
            {
                h h2 = (h)a.get(k);
                if (h2.b)
                {
                    obj.d = h2;
                    for (i1 = 0; i1 < a.size(); i1++)
                    {
                        if (i1 != k)
                        {
                            ((h)a.get(i1)).c = true;
                        }
                    }

                    b(h2);
                    n.a = false;
                    return true;
                }
            }

        } else
        if (b != null)
        {
            b(b);
            b.a(i.a);
        }
        b = null;
          goto _L1
_L4:
        if (((a) (obj)).a)
        {
            a(motionevent);
        } else
        if (b != null)
        {
            int l;
label0:
            {
                b.a(e, motionevent.getX() - c, motionevent.getY() - d);
                h h1 = b;
                l = h1.d.left;
                int l1 = h1.d.right;
                int j1 = h1.d.top;
                int k1 = h1.d.bottom;
                if (l > 0 || l1 <= getRight() - 1)
                {
                    l = i1;
                    if (j1 > 0)
                    {
                        break label0;
                    }
                    l = i1;
                    if (k1 <= getBottom() - 1)
                    {
                        break label0;
                    }
                }
                l = 1;
            }
            if (l == 0)
            {
                a(b);
            }
            c = motionevent.getX();
            d = motionevent.getY();
        }
          goto _L1
_L6:
        a();
          goto _L5
_L7:
        a();
          goto _L5
    }
}
