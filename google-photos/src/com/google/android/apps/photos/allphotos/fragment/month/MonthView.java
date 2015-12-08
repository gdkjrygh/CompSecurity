// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.allphotos.fragment.month;

import ame;
import amh;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import ayt;
import b;
import drl;
import drm;
import drn;
import dro;
import ekp;
import elt;
import fli;
import fnh;
import fnj;
import iws;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kp;
import mk;
import nud;
import nug;
import olm;

public class MonthView extends View
    implements nug
{

    private static final Paint e = new Paint();
    private static boolean f;
    private static int g;
    private static Paint h;
    public int a;
    public List b;
    public drl c;
    public drn d;
    private final List i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private kp n;
    private amh o;
    private final RectF p;
    private final RectF q;
    private final Rect r;
    private final Paint s;
    private final Matrix t;
    private ame u;
    private fnh v;

    public MonthView(Context context)
    {
        super(context);
        i = new ArrayList();
        p = new RectF();
        q = new RectF();
        r = new Rect();
        s = new Paint();
        t = new Matrix();
        e();
    }

    public MonthView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = new ArrayList();
        p = new RectF();
        q = new RectF();
        r = new Rect();
        s = new Paint();
        t = new Matrix();
        e();
    }

    public MonthView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        i = new ArrayList();
        p = new RectF();
        q = new RectF();
        r = new Rect();
        s = new Paint();
        t = new Matrix();
        e();
    }

    public MonthView(Context context, AttributeSet attributeset, int i1, int j1)
    {
        super(context, attributeset, i1, j1);
        i = new ArrayList();
        p = new RectF();
        q = new RectF();
        r = new Rect();
        s = new Paint();
        t = new Matrix();
        e();
    }

    public static drl a(MonthView monthview)
    {
        return monthview.c;
    }

    public static void a(MonthView monthview, int i1)
    {
        if (monthview.j)
        {
            monthview.a(monthview.r, i1);
            monthview.invalidate(monthview.r.left, monthview.r.top, monthview.r.right, monthview.r.bottom);
            return;
        } else
        {
            monthview.invalidate();
            return;
        }
    }

    public static List b(MonthView monthview)
    {
        return monthview.b;
    }

    private void e()
    {
        n = new kp(getContext(), new dro(this));
        v = (fnh)olm.a(getContext(), fnh);
        o = (amh)olm.a(getContext(), amh);
        if (f)
        {
            return;
        } else
        {
            f = true;
            g = getResources().getDimensionPixelSize(b.iU);
            Paint paint = new Paint();
            h = paint;
            paint.setColor(getResources().getColor(b.iR));
            h.setStyle(android.graphics.Paint.Style.FILL);
            return;
        }
    }

    public void a()
    {
        if (m == (int)Math.ceil((float)a / (float)l))
        {
            return;
        } else
        {
            requestLayout();
            j = false;
            return;
        }
    }

    public final void a(Rect rect, int i1)
    {
        int j1 = 1;
        int l1 = i1 % l;
        int k1 = i1 / l;
        if (mk.h(this) == 1)
        {
            i1 = j1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = (l - l1 - 1) * g;
        } else
        {
            i1 = k + l1 * g;
        }
        j1 = g * k1;
        rect.set(i1, j1, g + i1, g + j1);
    }

    public final void a(MotionEvent motionevent, ekp ekp1)
    {
        if (c != null)
        {
            c.a(motionevent);
        }
        super.performClick();
    }

    public final void b()
    {
        drm drm1;
        for (Iterator iterator = i.iterator(); iterator.hasNext(); o.a(drm1))
        {
            drm1 = (drm)iterator.next();
        }

        i.clear();
        invalidate();
    }

    public final void b_(Object obj)
    {
        if (((fnh)obj).a(fnj.a))
        {
            c();
            return;
        } else
        {
            b();
            return;
        }
    }

    public void c()
    {
        if (b != null && !b.isEmpty() && i.isEmpty() && v.a(fnj.a))
        {
            int i1 = 0;
            while (i1 < b.size()) 
            {
                drm drm1 = new drm(this, i1);
                gap gap = ((elt)((ekp)b.get(i1)).a(elt)).e();
                if (u == null)
                {
                    fli fli1 = (fli)olm.a(getContext(), fli);
                    android.graphics.drawable.Drawable drawable = getResources().getDrawable(b.iR);
                    u = o.f().a(fli1.g()).a(ayt.d(drawable));
                }
                u.a(gap).a(drm1);
                i.add(drm1);
                i1++;
            }
        }
    }

    public final List d()
    {
        if (b == null)
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList(b.size());
        for (int i1 = 0; i1 < b.size(); i1++)
        {
            Rect rect = new Rect();
            a(rect, i1);
            arraylist.add(new iws(this, (ekp)b.get(i1), rect));
        }

        return arraylist;
    }

    public boolean hasOverlappingRendering()
    {
        return false;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        v.a.a(this, false);
        c();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        b();
        v.a.a(this);
    }

    protected void onDraw(Canvas canvas)
    {
        int i1 = 0;
        super.onDraw(canvas);
        if (i.isEmpty())
        {
            for (; i1 < a; i1++)
            {
                a(r, i1);
                Paint paint = h;
                if (d != null)
                {
                    s.set(h);
                    d.a(this, i1, r, s);
                    paint = s;
                }
                canvas.drawRect(r, paint);
            }

        } else
        {
            int j1 = 0;
            while (j1 < i.size()) 
            {
                drm drm1 = (drm)i.get(j1);
                a(r, j1);
                Paint paint1;
                Paint paint2;
                if (drm1.a == null)
                {
                    paint1 = h;
                } else
                {
                    paint1 = e;
                }
                paint2 = paint1;
                if (d != null)
                {
                    s.set(paint1);
                    paint2 = s;
                    d.a(this, j1, r, s);
                }
                if (drm1.a != null)
                {
                    p.set(0.0F, 0.0F, drm1.a.getWidth(), drm1.a.getHeight());
                    q.set(r);
                    t.setRectToRect(p, q, android.graphics.Matrix.ScaleToFit.FILL);
                    canvas.drawBitmap(drm1.a, t, paint2);
                } else
                {
                    canvas.drawRect(r, paint2);
                }
                j1++;
            }
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        l = k1 / g;
        m = (int)Math.ceil((float)a / (float)l);
        k = k1 % g;
        int l1 = k;
        int i2 = g;
        int j2 = m;
        j = true;
        setMeasuredDimension(resolveSize(k1 - l1, i1), resolveSize(i2 * j2, j1));
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        super.onTouchEvent(motionevent);
        n.onTouchEvent(motionevent);
        return true;
    }

}
