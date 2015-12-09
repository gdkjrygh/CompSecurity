// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.aviary.android.feather.library.graphics.a.c;
import com.aviary.android.feather.library.graphics.a.d;
import com.aviary.android.feather.library.services.drag.DragView;
import com.aviary.android.feather.library.services.drag.a;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            d

public class ImageViewDrawableOverlay extends ImageViewTouch
    implements com.aviary.android.feather.library.services.drag.a
{
    public static interface a
    {

        public abstract void a(com.aviary.android.feather.sdk.widget.d d1, com.aviary.android.feather.sdk.widget.d d2);

        public abstract void b(com.aviary.android.feather.sdk.widget.d d1);

        public abstract void c(com.aviary.android.feather.sdk.widget.d d1);

        public abstract void d(com.aviary.android.feather.sdk.widget.d d1);
    }


    boolean a;
    float b;
    float c;
    private List d;
    private com.aviary.android.feather.sdk.widget.d e;
    private a f;
    private boolean g;
    private com.aviary.android.feather.library.services.drag.a.a h;
    private Paint i;
    private Rect j;
    private boolean k;
    private int l;

    public ImageViewDrawableOverlay(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new ArrayList();
        g = true;
        j = new Rect();
        k = false;
    }

    public ImageViewDrawableOverlay(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = new ArrayList();
        g = true;
        j = new Rect();
        k = false;
    }

    private void a(com.aviary.android.feather.sdk.widget.d d1, float f1, float f2)
    {
        int l1 = 0;
        d1 = d1.e();
        int i1;
        int j1;
        int k1;
        if (f1 > 0.0F)
        {
            i1 = (int)Math.max(0.0F, (float)getLeft() - ((RectF) (d1)).left);
        } else
        {
            i1 = 0;
        }
        if (f1 < 0.0F)
        {
            j1 = (int)Math.min(0.0F, (float)getRight() - ((RectF) (d1)).right);
        } else
        {
            j1 = 0;
        }
        if (f2 > 0.0F)
        {
            k1 = (int)Math.max(0.0F, (float)getTop() - ((RectF) (d1)).top);
        } else
        {
            k1 = 0;
        }
        if (f2 < 0.0F)
        {
            l1 = (int)Math.min(0.0F, (float)getBottom() - ((RectF) (d1)).bottom);
        }
        if (i1 == 0)
        {
            i1 = j1;
        }
        if (k1 == 0)
        {
            k1 = l1;
        }
        if (i1 != 0 || k1 != 0)
        {
            a(i1, k1);
        }
    }

    private com.aviary.android.feather.sdk.widget.d e(MotionEvent motionevent)
    {
        Iterator iterator = d.iterator();
        com.aviary.android.feather.sdk.widget.d d1 = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.aviary.android.feather.sdk.widget.d d2 = (com.aviary.android.feather.sdk.widget.d)iterator.next();
            if (d2.a(motionevent.getX(), motionevent.getY()) != 1)
            {
                d1 = d2;
            }
        } while (true);
        return d1;
    }

    public com.aviary.android.feather.sdk.widget.d a(int i1)
    {
        return (com.aviary.android.feather.sdk.widget.d)d.get(i1);
    }

    public void a()
    {
        Log.i("ImageViewTouchBase", "clearOverlays");
        setSelectedHighlightView(null);
        for (; d.size() > 0; ((com.aviary.android.feather.sdk.widget.d)d.remove(0)).b()) { }
        e = null;
    }

    protected void a(float f1)
    {
        Log.i("ImageViewTouchBase", (new StringBuilder()).append("onZoomAnimationCompleted: ").append(f1).toString());
        super.a(f1);
        if (e != null)
        {
            e.a(64);
            postInvalidate();
        }
    }

    protected void a(float f1, float f2)
    {
        super.a(f1, f2);
        com.aviary.android.feather.sdk.widget.d d1;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); d1.j())
        {
            d1 = (com.aviary.android.feather.sdk.widget.d)iterator.next();
            if (getScale() != 1.0F)
            {
                float af[] = new float[9];
                getImageMatrix().getValues(af);
                float f3 = af[0];
                if (!k)
                {
                    d1.c().offset(-f1 / f3, -f2 / f3);
                }
            }
            d1.g().set(getImageMatrix());
        }

    }

    protected void a(float f1, float f2, float f3)
    {
        if (d.size() > 0)
        {
            Iterator iterator = d.iterator();
            Matrix matrix = new Matrix(getImageViewMatrix());
            super.a(f1, f2, f3);
            while (iterator.hasNext()) 
            {
                com.aviary.android.feather.sdk.widget.d d1 = (com.aviary.android.feather.sdk.widget.d)iterator.next();
                if (!k)
                {
                    RectF rectf = d1.c();
                    RectF rectf1 = d1.a(matrix, d1.c());
                    RectF rectf2 = d1.a(getImageViewMatrix(), d1.c());
                    float af[] = new float[9];
                    getImageViewMatrix().getValues(af);
                    f1 = af[0];
                    rectf.offset((rectf1.left - rectf2.left) / f1, (rectf1.top - rectf2.top) / f1);
                    rectf.right = rectf.right + -(rectf2.width() - rectf1.width()) / f1;
                    f2 = rectf.bottom;
                    rectf.bottom = -(rectf2.height() - rectf1.height()) / f1 + f2;
                    d1.g().set(getImageMatrix());
                    d1.c().set(rectf);
                } else
                {
                    d1.g().set(getImageMatrix());
                }
                d1.j();
            }
        } else
        {
            super.a(f1, f2, f3);
        }
    }

    protected void a(int i1, int j1, int k1, int l1)
    {
        super.a(i1, j1, k1, l1);
        if (getDrawable() != null)
        {
            com.aviary.android.feather.sdk.widget.d d1;
            for (Iterator iterator = d.iterator(); iterator.hasNext(); d1.j())
            {
                d1 = (com.aviary.android.feather.sdk.widget.d)iterator.next();
                d1.g().set(getImageMatrix());
            }

        }
    }

    protected void a(Context context, AttributeSet attributeset, int i1)
    {
        super.a(context, attributeset, i1);
        x = ViewConfiguration.get(context).getScaledDoubleTapSlop();
        w.setIsLongpressEnabled(false);
        context = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryImageViewDrawableOverlay, i1, 0);
        l = context.getResourceId(0, -1);
        context.recycle();
    }

    public void a(Drawable drawable, Matrix matrix, float f1, float f2)
    {
        super.a(drawable, matrix, f1, f2);
    }

    public void a(com.aviary.android.feather.library.services.DragControllerService.b b1, int i1, int j1, int k1, int l1, DragView dragview, Object obj)
    {
        if (h != null)
        {
            h.b(b1, i1, j1, k1, l1, dragview, obj);
        }
    }

    public boolean a(MotionEvent motionevent)
    {
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.aviary.android.feather.sdk.widget.d d1 = (com.aviary.android.feather.sdk.widget.d)iterator.next();
            if (d1.l())
            {
                d1.b(motionevent.getX(), motionevent.getY());
                postInvalidate();
            }
        } while (true);
        return super.a(motionevent);
    }

    public boolean a(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        float f3 = 0.0F;
        Log.i("ImageViewTouchBase", "onScroll");
        float f5 = motionevent1.getX();
        float f6 = motionevent1.getY();
        float f4;
        if (!a)
        {
            a = true;
            f4 = 0.0F;
        } else
        {
            f4 = b - f5;
            f3 = c - f6;
        }
        b = f5;
        c = f6;
        if (e != null && e.h() != 1)
        {
            e.a(e.h(), motionevent1, -f4, -f3);
            postInvalidate();
            if (f != null)
            {
                f.c(e);
            }
            if (e.h() == 64 && !k)
            {
                a(e, f1, f2);
            }
            return true;
        } else
        {
            return super.a(motionevent, motionevent1, f1, f2);
        }
    }

    public boolean a(com.aviary.android.feather.sdk.widget.d d1)
    {
        for (int i1 = 0; i1 < d.size(); i1++)
        {
            if (((com.aviary.android.feather.sdk.widget.d)d.get(i1)).equals(d1))
            {
                return false;
            }
        }

        d.add(d1);
        postInvalidate();
        if (d.size() == 1)
        {
            setSelectedHighlightView(d1);
        }
        return true;
    }

    public void b(com.aviary.android.feather.library.services.DragControllerService.b b1, int i1, int j1, int k1, int l1, DragView dragview, Object obj)
    {
        i = new Paint();
        i.setColor(0xff33b5e5);
        i.setStrokeWidth(2.0F);
        i.setMaskFilter(new BlurMaskFilter(4F, android.graphics.BlurMaskFilter.Blur.NORMAL));
        i.setStyle(android.graphics.Paint.Style.STROKE);
        invalidate();
    }

    public boolean b(MotionEvent motionevent)
    {
        Log.i("ImageViewTouchBase", "onDown");
        a = false;
        b = motionevent.getX();
        c = motionevent.getY();
        com.aviary.android.feather.sdk.widget.d d1 = e(motionevent);
        Object obj;
        if (d1 == null && d.size() == 1 && g)
        {
            obj = (com.aviary.android.feather.sdk.widget.d)d.get(0);
        } else
        {
            obj = d1;
        }
        setSelectedHighlightView(((com.aviary.android.feather.sdk.widget.d) (obj)));
        if (d1 != null && k)
        {
            obj = d1.a(d1.g(), d1.c());
            boolean flag = d1.n().a(((RectF) (obj)));
            Log.d("ImageViewTouchBase", (new StringBuilder()).append("invalidSize: ").append(flag).toString());
            if (!flag)
            {
                Log.w("ImageViewTouchBase", "drawable too small!!!");
                float f1 = d1.n().f();
                float f2 = d1.n().g();
                Log.d("ImageViewTouchBase", (new StringBuilder()).append("minW: ").append(f1).toString());
                Log.d("ImageViewTouchBase", (new StringBuilder()).append("minH: ").append(f2).toString());
                float f3 = Math.min(f1, f2) * 1.1F;
                Log.d("ImageViewTouchBase", (new StringBuilder()).append("minSize: ").append(f3).toString());
                float f4 = Math.min(((RectF) (obj)).width(), ((RectF) (obj)).height());
                Log.d("ImageViewTouchBase", (new StringBuilder()).append("minRectSize: ").append(f4).toString());
                f3 /= f4;
                Log.d("ImageViewTouchBase", (new StringBuilder()).append("diff: ").append(f3).toString());
                Log.d("ImageViewTouchBase", (new StringBuilder()).append("min.size: ").append(f1).append("x").append(f2).toString());
                Log.d("ImageViewTouchBase", (new StringBuilder()).append("cur.size: ").append(((RectF) (obj)).width()).append("x").append(((RectF) (obj)).height()).toString());
                Log.d("ImageViewTouchBase", (new StringBuilder()).append("zooming to: ").append(getScale() * f3).toString());
                a(getScale() * f3, ((RectF) (obj)).centerX(), ((RectF) (obj)).centerY(), 300F);
                return true;
            }
        }
        if (e != null)
        {
            int i1 = e.a(motionevent.getX(), motionevent.getY());
            if (i1 != 1)
            {
                obj = e;
                if (i1 == 64)
                {
                    i1 = 64;
                } else
                if (i1 == 32)
                {
                    i1 = 32;
                } else
                {
                    i1 = 30;
                }
                ((com.aviary.android.feather.sdk.widget.d) (obj)).a(i1);
                postInvalidate();
                if (f != null)
                {
                    f.b(e);
                }
            }
        }
        return super.b(motionevent);
    }

    public boolean b(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        Log.i("ImageViewTouchBase", "onFling");
        if (e != null && e.h() != 1)
        {
            return false;
        } else
        {
            return super.b(motionevent, motionevent1, f1, f2);
        }
    }

    public boolean b(com.aviary.android.feather.sdk.widget.d d1)
    {
        boolean flag1 = false;
        Log.i("ImageViewTouchBase", "removeHightlightView");
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < d.size())
                {
                    if (!((com.aviary.android.feather.sdk.widget.d)d.get(i1)).equals(d1))
                    {
                        break label0;
                    }
                    d1 = (com.aviary.android.feather.sdk.widget.d)d.remove(i1);
                    if (d1.equals(e))
                    {
                        setSelectedHighlightView(null);
                    }
                    d1.b();
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    public void c(com.aviary.android.feather.library.services.DragControllerService.b b1, int i1, int j1, int k1, int l1, DragView dragview, Object obj)
    {
    }

    public boolean c(MotionEvent motionevent)
    {
        Log.i("ImageViewTouchBase", "onUp");
        if (e != null)
        {
            e.a(1);
            postInvalidate();
        }
        return super.c(motionevent);
    }

    public void d(com.aviary.android.feather.library.services.DragControllerService.b b1, int i1, int j1, int k1, int l1, DragView dragview, Object obj)
    {
        i = null;
        invalidate();
    }

    public boolean d(MotionEvent motionevent)
    {
        Log.i("ImageViewTouchBase", "onSingleTapUp");
        if (e != null)
        {
            if ((e.a(motionevent.getX(), motionevent.getY()) & 0x40) == 64)
            {
                if (f != null)
                {
                    f.d(e);
                }
                return true;
            }
            e.a(1);
            postInvalidate();
            Log.d("ImageViewTouchBase", (new StringBuilder()).append("selected items: ").append(d.size()).toString());
            if (d.size() != 1)
            {
                setSelectedHighlightView(null);
            }
        }
        return super.d(motionevent);
    }

    public boolean e(com.aviary.android.feather.library.services.DragControllerService.b b1, int i1, int j1, int k1, int l1, DragView dragview, Object obj)
    {
        if (h != null)
        {
            return h.a(b1, i1, j1, k1, l1, dragview, obj);
        } else
        {
            return false;
        }
    }

    public int getHighlightCount()
    {
        return d.size();
    }

    public int getOverlayStyleId()
    {
        return l;
    }

    public boolean getScaleWithContent()
    {
        return k;
    }

    public com.aviary.android.feather.sdk.widget.d getSelectedHighlightView()
    {
        return e;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i1 = 0;
        boolean flag;
        boolean flag1;
        for (flag = false; i1 < d.size(); flag = flag1)
        {
            canvas.save(1);
            Object obj = (com.aviary.android.feather.sdk.widget.d)d.get(i1);
            ((com.aviary.android.feather.sdk.widget.d) (obj)).a(canvas);
            flag1 = flag;
            if (!flag)
            {
                obj = ((com.aviary.android.feather.sdk.widget.d) (obj)).n();
                flag1 = flag;
                if (obj instanceof c)
                {
                    flag1 = flag;
                    if (((c)obj).q())
                    {
                        flag1 = true;
                    }
                }
            }
            canvas.restore();
            i1++;
        }

        if (i != null)
        {
            getDrawingRect(j);
            canvas.drawRect(j, i);
        }
        if (flag)
        {
            postInvalidateDelayed(400L);
        }
    }

    public void setDropTargetListener(com.aviary.android.feather.library.services.drag.a.a a1)
    {
        h = a1;
    }

    public void setForceSingleSelection(boolean flag)
    {
        g = flag;
    }

    public void setOnDrawableEventListener(a a1)
    {
        f = a1;
    }

    public void setScaleWithContent(boolean flag)
    {
        k = flag;
    }

    public void setSelectedHighlightView(com.aviary.android.feather.sdk.widget.d d1)
    {
        com.aviary.android.feather.sdk.widget.d d2 = e;
        if (e != null && !e.equals(d1))
        {
            e.b(false);
        }
        if (d1 != null)
        {
            d1.b(true);
        }
        postInvalidate();
        e = d1;
        if (f != null)
        {
            f.a(d1, d2);
        }
    }
}
