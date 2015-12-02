// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.c.a;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class a extends Animation
{

    public static final boolean a;
    private static final WeakHashMap b = new WeakHashMap();
    private final WeakReference c;
    private final Camera d = new Camera();
    private boolean e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private final RectF p = new RectF();
    private final RectF q = new RectF();
    private final Matrix r = new Matrix();

    private a(View view)
    {
        f = 1.0F;
        l = 1.0F;
        m = 1.0F;
        setDuration(0L);
        setFillAfter(true);
        if (view.getVisibility() == 0)
        {
            view.setAnimation(this);
        }
        c = new WeakReference(view);
    }

    public static a a(View view)
    {
        a a1;
label0:
        {
            a a2 = (a)b.get(view);
            if (a2 != null)
            {
                a1 = a2;
                if (a2 == view.getAnimation())
                {
                    break label0;
                }
            }
            a1 = new a(view);
            b.put(view, a1);
        }
        return a1;
    }

    private void a()
    {
        View view = (View)c.get();
        if (view != null)
        {
            a(p, view);
        }
    }

    private void a(Matrix matrix, View view)
    {
        float f3 = view.getWidth();
        float f4 = view.getHeight();
        boolean flag = e;
        float f1;
        float f2;
        float f5;
        float f6;
        float f7;
        if (flag)
        {
            f1 = g;
        } else
        {
            f1 = f3 / 2.0F;
        }
        if (flag)
        {
            f2 = h;
        } else
        {
            f2 = f4 / 2.0F;
        }
        f5 = i;
        f6 = j;
        f7 = k;
        if (f5 != 0.0F || f6 != 0.0F || f7 != 0.0F)
        {
            view = d;
            view.save();
            view.rotateX(f5);
            view.rotateY(f6);
            view.rotateZ(-f7);
            view.getMatrix(matrix);
            view.restore();
            matrix.preTranslate(-f1, -f2);
            matrix.postTranslate(f1, f2);
        }
        f5 = l;
        f6 = m;
        if (f5 != 1.0F || f6 != 1.0F)
        {
            matrix.postScale(f5, f6);
            matrix.postTranslate(-(f1 / f3) * (f5 * f3 - f3), -(f2 / f4) * (f6 * f4 - f4));
        }
        matrix.postTranslate(n, o);
    }

    private void a(RectF rectf, View view)
    {
        rectf.set(0.0F, 0.0F, view.getWidth(), view.getHeight());
        Matrix matrix = r;
        matrix.reset();
        a(matrix, view);
        r.mapRect(rectf);
        rectf.offset(view.getLeft(), view.getTop());
        if (rectf.right < rectf.left)
        {
            float f1 = rectf.right;
            rectf.right = rectf.left;
            rectf.left = f1;
        }
        if (rectf.bottom < rectf.top)
        {
            float f2 = rectf.top;
            rectf.top = rectf.bottom;
            rectf.bottom = f2;
        }
    }

    private void b()
    {
        View view = (View)c.get();
        if (view == null || view.getParent() == null)
        {
            return;
        } else
        {
            RectF rectf = q;
            a(rectf, view);
            rectf.union(p);
            ((View)view.getParent()).invalidate((int)Math.floor(rectf.left), (int)Math.floor(rectf.top), (int)Math.ceil(rectf.right), (int)Math.ceil(rectf.bottom));
            return;
        }
    }

    protected void applyTransformation(float f1, Transformation transformation)
    {
        View view = (View)c.get();
        if (view != null)
        {
            transformation.setAlpha(f);
            a(transformation.getMatrix(), view);
        }
    }

    public float getAlpha()
    {
        return f;
    }

    public float getPivotX()
    {
        return g;
    }

    public float getPivotY()
    {
        return h;
    }

    public float getRotation()
    {
        return k;
    }

    public float getRotationX()
    {
        return i;
    }

    public float getRotationY()
    {
        return j;
    }

    public float getScaleX()
    {
        return l;
    }

    public float getScaleY()
    {
        return m;
    }

    public int getScrollX()
    {
        View view = (View)c.get();
        if (view == null)
        {
            return 0;
        } else
        {
            return view.getScrollX();
        }
    }

    public int getScrollY()
    {
        View view = (View)c.get();
        if (view == null)
        {
            return 0;
        } else
        {
            return view.getScrollY();
        }
    }

    public float getTranslationX()
    {
        return n;
    }

    public float getTranslationY()
    {
        return o;
    }

    public float getX()
    {
        View view = (View)c.get();
        if (view == null)
        {
            return 0.0F;
        } else
        {
            return (float)view.getLeft() + n;
        }
    }

    public float getY()
    {
        View view = (View)c.get();
        if (view == null)
        {
            return 0.0F;
        } else
        {
            return (float)view.getTop() + o;
        }
    }

    public void setAlpha(float f1)
    {
        if (f != f1)
        {
            f = f1;
            View view = (View)c.get();
            if (view != null)
            {
                view.invalidate();
            }
        }
    }

    public void setPivotX(float f1)
    {
        if (!e || g != f1)
        {
            a();
            e = true;
            g = f1;
            b();
        }
    }

    public void setPivotY(float f1)
    {
        if (!e || h != f1)
        {
            a();
            e = true;
            h = f1;
            b();
        }
    }

    public void setRotation(float f1)
    {
        if (k != f1)
        {
            a();
            k = f1;
            b();
        }
    }

    public void setRotationX(float f1)
    {
        if (i != f1)
        {
            a();
            i = f1;
            b();
        }
    }

    public void setRotationY(float f1)
    {
        if (j != f1)
        {
            a();
            j = f1;
            b();
        }
    }

    public void setScaleX(float f1)
    {
        if (l != f1)
        {
            a();
            l = f1;
            b();
        }
    }

    public void setScaleY(float f1)
    {
        if (m != f1)
        {
            a();
            m = f1;
            b();
        }
    }

    public void setScrollX(int i1)
    {
        View view = (View)c.get();
        if (view != null)
        {
            view.scrollTo(i1, view.getScrollY());
        }
    }

    public void setScrollY(int i1)
    {
        View view = (View)c.get();
        if (view != null)
        {
            view.scrollTo(view.getScrollX(), i1);
        }
    }

    public void setTranslationX(float f1)
    {
        if (n != f1)
        {
            a();
            n = f1;
            b();
        }
    }

    public void setTranslationY(float f1)
    {
        if (o != f1)
        {
            a();
            o = f1;
            b();
        }
    }

    public void setVisibility(int i1)
    {
        View view = (View)c.get();
        if (view != null)
        {
            if (i1 == 0)
            {
                view.setAnimation(this);
            } else
            {
                view.clearAnimation();
            }
            view.setVisibility(i1);
        }
    }

    public void setX(float f1)
    {
        View view = (View)c.get();
        if (view != null)
        {
            setTranslationX(f1 - (float)view.getLeft());
        }
    }

    public void setY(float f1)
    {
        View view = (View)c.get();
        if (view != null)
        {
            setTranslationY(f1 - (float)view.getTop());
        }
    }

    static 
    {
        boolean flag;
        if (Integer.valueOf(android.os.Build.VERSION.SDK).intValue() < 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
