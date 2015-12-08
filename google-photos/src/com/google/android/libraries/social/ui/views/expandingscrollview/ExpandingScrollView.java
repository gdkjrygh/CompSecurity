// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.ui.views.expandingscrollview;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import ojg;
import ojh;
import oji;
import ojj;
import ojk;
import ojl;
import ojm;
import ojn;
import ojo;
import ojp;
import ojq;
import ojs;
import ojt;
import oju;

public final class ExpandingScrollView extends oju
{

    public static final ojn a = new ojn();
    public static final ojn b = new ojj();
    private static ojn j = new ojp();
    private static boolean k;
    public int c;
    boolean d;
    ojm e;
    final Set f;
    View g;
    private final int l;
    private ojs m;
    private ojn n;
    private ojn o;
    private ojn p;
    private ojm q;
    private ojm r;
    private ojm s;
    private final float t[];
    private final Set u;

    public ExpandingScrollView(Context context)
    {
        super(context);
        d = true;
        n = a;
        o = a;
        p = j;
        e = ojm.a;
        t = new float[ojm.values().length];
        u = new CopyOnWriteArraySet();
        f = new CopyOnWriteArraySet();
        context = getResources();
        if (!k)
        {
            a(context.getConfiguration());
            k = true;
        }
        m = new ojs(this, new ojh(this), new oji(this));
        l = (int)(context.getDisplayMetrics().density * 400F);
        c();
    }

    public ExpandingScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = true;
        n = a;
        o = a;
        p = j;
        e = ojm.a;
        t = new float[ojm.values().length];
        u = new CopyOnWriteArraySet();
        f = new CopyOnWriteArraySet();
        context = getResources();
        if (!k)
        {
            a(context.getConfiguration());
            k = true;
        }
        m = new ojs(this, new ojh(this), new oji(this));
        l = (int)(context.getDisplayMetrics().density * 400F);
        c();
    }

    public ExpandingScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = true;
        n = a;
        o = a;
        p = j;
        e = ojm.a;
        t = new float[ojm.values().length];
        u = new CopyOnWriteArraySet();
        f = new CopyOnWriteArraySet();
        context = getResources();
        if (!k)
        {
            a(context.getConfiguration());
            k = true;
        }
        m = new ojs(this, new ojh(this), new oji(this));
        l = (int)(context.getDisplayMetrics().density * 400F);
        c();
    }

    public static View a(ExpandingScrollView expandingscrollview)
    {
        return expandingscrollview.g;
    }

    private void a(Configuration configuration)
    {
        if (configuration.orientation == 2)
        {
            configuration = p;
        } else
        {
            configuration = o;
        }
        n = configuration;
        a(e, false);
    }

    private void a(Iterable iterable)
    {
        int i = 0;
        int i1 = getScrollY();
        ojm ojm1 = ojm.values()[0];
        ojm aojm[] = ojm.values();
        int j1 = aojm.length;
        do
        {
            if (i >= j1)
            {
                break;
            }
            ojm ojm2 = aojm[i];
            if (i1 < a(ojm2))
            {
                break;
            }
            i++;
            ojm1 = ojm2;
        } while (true);
        if (t[ojm1.ordinal()] == 100F)
        {
            for (iterable = iterable.iterator(); iterable.hasNext(); iterable.next()) { }
        } else
        {
            a(ojm1);
            if (ojm1 == ojm.a)
            {
                ojm1 = ojm.b;
            } else
            {
                ojm1 = c(ojm1);
            }
            a(ojm1);
            for (iterable = iterable.iterator(); iterable.hasNext(); iterable.next()) { }
        }
    }

    public static boolean a(ExpandingScrollView expandingscrollview, MotionEvent motionevent)
    {
        return expandingscrollview.oju.onTouchEvent(motionevent);
    }

    private void b(ojm ojm1)
    {
        ojm ojm2 = e;
        e = ojm1;
        d();
        if (e != ojm2)
        {
            for (ojm1 = u.iterator(); ojm1.hasNext(); ((ojl)ojm1.next()).a(e)) { }
        }
    }

    private ojm c(ojm ojm1)
    {
        return n.b(ojm1);
    }

    private void c()
    {
        ojm aojm[] = ojm.values();
        int i1 = aojm.length;
        for (int i = 0; i < i1; i++)
        {
            ojm ojm1 = aojm[i];
            t[ojm1.ordinal()] = ojm1.g;
        }

    }

    private ojm d(ojm ojm1)
    {
        return n.a(ojm1);
    }

    private void d()
    {
        if (e == ojm.a)
        {
            int i = a(ojm.a);
            a(i, i);
            return;
        } else
        {
            ojm ojm1 = (ojm)Collections.max(n.a);
            a(a(ojm.b), a(ojm1));
            return;
        }
    }

    public final int a(ojm ojm1)
    {
        return Math.round(((float)c * t[ojm1.ordinal()]) / 100F);
    }

    final void a()
    {
        super.a();
        s = e;
        for (Iterator iterator = u.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    protected final void a(float f1)
    {
        if (e == ojm.a)
        {
            return;
        }
        ojm ojm3;
        if (Math.abs(f1) > (float)l)
        {
            int l1 = (int)(0.3F * f1 + (float)getScrollY());
            ojm ojm1 = null;
            int i = 0x7fffffff;
            Iterator iterator = n.a.iterator();
            do
            {
                ojm3 = ojm1;
                if (!iterator.hasNext())
                {
                    break;
                }
                ojm3 = (ojm)iterator.next();
                int j1 = Math.abs(a(ojm3) - l1);
                if (j1 < i)
                {
                    ojm1 = ojm3;
                    i = j1;
                }
            } while (true);
        } else
        {
            ojm ojm4 = e;
            ojm ojm2;
            if (getScrollY() > a(e))
            {
                ojm2 = c(e);
            } else
            {
                ojm2 = d(e);
            }
            ojm3 = ojm4;
            if (ojm2 != e)
            {
                int i1 = a(e);
                int k1 = a(ojm2);
                ojm3 = ojm4;
                if ((float)(getScrollY() - i1) / (float)(k1 - i1) > 0.2F)
                {
                    ojm3 = ojm2;
                }
            }
        }
        a(ojm3, true);
    }

    public final void a(ojl ojl1)
    {
        u.add(ojl1);
        a(((Iterable) (Arrays.asList(new ojl[] {
            ojl1
        }))));
    }

    public final void a(ojm ojm1, float f1)
    {
        int i = ojm1.ordinal();
        if (t[i] != f1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ojm ojm2 = d(ojm1);
        if (ojm1 != ojm2 && f1 < t[ojm2.ordinal()])
        {
            throw new IllegalArgumentException("exposure percentage less than previous state");
        }
        ojm2 = c(ojm1);
        if (ojm1 != ojm2 && f1 > t[ojm2.ordinal()])
        {
            throw new IllegalArgumentException("exposure percentage more than next state");
        }
        t[i] = f1;
        d();
        if (!h)
        {
            break; /* Loop/switch isn't completed */
        }
        for (i = getScrollY(); i < a(d(e)) && e != d(e); b(d(e))) { }
        while (i > a(c(e)) && e != c(e)) 
        {
            b(c(e));
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (e != ojm1) goto _L1; else goto _L4
_L4:
        a(a(ojm1), true, 500);
        return;
    }

    public final void a(ojm ojm1, int i)
    {
        a(ojm1, ((float)i * 100F) / (float)c);
    }

    public final void a(ojm ojm1, boolean flag)
    {
        char c1;
        int i;
        if (flag)
        {
            c1 = '\u01F4';
        } else
        {
            c1 = '\0';
        }
        ojm1 = n.c(ojm1);
        b(ojm1);
        i = a(ojm1);
        if (c1 > 0)
        {
            a(i, false, c1);
            return;
        } else
        {
            a(i);
            return;
        }
    }

    public final void a(ojn ojn1)
    {
        ojn ojn2 = j;
        o = ojn1;
        p = ojn2;
        a(getContext().getResources().getConfiguration());
        q = null;
        r = null;
    }

    final void b()
    {
        super.b();
        s = null;
        for (Iterator iterator = u.iterator(); iterator.hasNext(); ((ojl)iterator.next()).b(e)) { }
    }

    protected final void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        ojm ojm1 = e;
        a(configuration);
        if (e != ojm1)
        {
            q = ojm1;
            r = e;
        } else
        if (q != null && n.a.contains(q))
        {
            if (e == r)
            {
                a(q, false);
            }
            q = null;
            r = null;
            return;
        }
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        if (getChildCount() > 0 && g == null)
        {
            View view = getChildAt(0);
            removeAllViews();
            m.e.b();
            g = view;
            if (view != null)
            {
                addView(view);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionevent)
    {
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    public final void onLayout(boolean flag, int i, int i1, int j1, int k1)
    {
        i1 = (k1 - i1) / 2;
        int l1;
        if (c != i1)
        {
            c = i1;
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        l1 = c;
        for (k1 = 0; k1 < getChildCount();)
        {
            View view = getChildAt(k1);
            int i2 = view.getMeasuredHeight() + l1;
            int j2 = getPaddingRight();
            view.layout(getPaddingLeft(), l1, j1 - i - j2, i2);
            k1++;
            l1 = i2;
        }

        if (!(g instanceof ojk) || ((ojk)g).a())
        {
            View view1 = findViewById(0);
            if (view1 == null)
            {
                i = 0;
            } else
            {
                i = view1.getHeight();
            }
            if (i > 0)
            {
                a(ojm.b, i);
            }
        }
        d();
        if (i1 != 0)
        {
            a(e, false);
        }
    }

    public final void onMeasure(int i, int i1)
    {
        boolean flag = false;
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        int l1 = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000);
        int j1 = 0;
        for (i1 = ((flag) ? 1 : 0); i1 < getChildCount(); i1++)
        {
            getChildAt(i1).measure(i, l1);
            j1 = Math.max(j1, getChildAt(i1).getMeasuredWidth());
        }

        setMeasuredDimension(j1, k1 * 2);
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (ojq)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        e = ojq.a(parcelable);
    }

    protected final Parcelable onSaveInstanceState()
    {
        return new ojq(super.onSaveInstanceState(), e, t);
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        ojs ojs1;
        ojm ojm1;
        boolean flag1;
        flag1 = false;
        ojs1 = m;
        ojm1 = ojs1.c.e;
        if (ojm1 != ojm.a) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        int j1;
        boolean flag2;
        boolean flag3;
        j1 = ojs1.c.c - ojs1.c.getScrollY();
        float f2 = motionevent.getX();
        float f1 = motionevent.getY();
        if (ojs1.c.d && ojm1 == ojm.c && f1 < (float)j1 && motionevent.getAction() == 1 && Math.abs(motionevent.getX() - ojs1.g) < (float)ojs1.a && Math.abs(motionevent.getY() - ojs1.h) < (float)ojs1.a)
        {
            ojs1.c.a(ojm.b, true);
            for (Iterator iterator = ojs1.c.f.iterator(); iterator.hasNext(); iterator.next()) { }
        }
        if (motionevent.getAction() == 0)
        {
            ojs1.g = f2;
            ojs1.h = f1;
            ojs1.i = f1 - (float)j1;
            ojs1.k = -1F;
            ojs1.l = false;
        }
        i = ojs1.c.c;
        int i1 = ojs1.c.getScrollY();
        int k1 = motionevent.getAction();
        float f4 = motionevent.getX();
        f2 = motionevent.getY();
        if (k1 == 0)
        {
            if (f2 >= (float)(i - i1) || ojs1.c.d && ojs1.c.e == ojm.c)
            {
                i = ojt.b;
            } else
            {
                i = ojt.a;
            }
        } else
        {
label0:
            {
                if (ojs1.f != ojt.b)
                {
                    break label0;
                }
                f4 = Math.abs(f4 - ojs1.g);
                f2 = Math.abs(f2 - ojs1.h);
                boolean flag;
                if (f4 > (float)ojs1.b)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (f2 > (float)ojs1.a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag && i != 0)
                {
                    if (f4 > f2)
                    {
                        i = ojt.c;
                    } else
                    {
                        i = ojt.d;
                    }
                } else
                if (flag)
                {
                    i = ojt.d;
                } else
                {
                    if (i == 0)
                    {
                        break label0;
                    }
                    i = ojt.c;
                }
            }
        }
_L6:
        ojs1.f = i;
        if (ojs1.f == ojt.a) goto _L1; else goto _L3
_L3:
        if (ojs1.e.a != null)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (ojs1.c.g != null) goto _L5; else goto _L4
_L4:
        flag2 = false;
_L11:
        if (flag2)
        {
            ojs1.d.a();
            float f3;
            if (ojs1.f == ojt.b && ojs1.k != -1F)
            {
                motionevent.offsetLocation(0.0F, ojs1.k - f1);
            } else
            {
                motionevent.offsetLocation(0.0F, -j1);
            }
            if (flag3)
            {
                i = ((flag1) ? 1 : 0);
                if (Math.abs(motionevent.getY() - ojs1.k) > (float)ojs1.a)
                {
                    i = 1;
                }
                if (i != 0)
                {
                    ojs1.l = true;
                }
            }
            if (ojs1.k == -1F)
            {
                ojs1.k = motionevent.getY();
            }
            ojs1.e.a(motionevent);
        } else
        {
            ojs1.e.a();
            ojs1.k = -1F;
            ojs1.l = false;
            ojs1.d.a(motionevent);
        }
        ojs1.j = f1;
        return true;
        i = ojs1.f;
          goto _L6
_L5:
        i = motionevent.getAction();
        f3 = motionevent.getY();
        i;
        JVM INSTR tableswitch 0 2: default 692
    //                   0 699
    //                   1 788
    //                   2 705;
           goto _L7 _L8 _L9 _L10
_L7:
        flag2 = flag3;
          goto _L11
_L8:
        flag2 = true;
          goto _L11
_L10:
        if (ojs1.f != ojt.d) goto _L7; else goto _L12
_L12:
        if (ojs1.c.getScrollY() < ojs1.c.a(ojm.d))
        {
            flag2 = false;
        } else
        if (f3 < ojs1.j)
        {
            flag2 = true;
        } else
        {
            flag2 = ojs.a(ojs1.c.g, (int)ojs1.g, (int)ojs1.i);
        }
          goto _L11
_L9:
        if (ojs1.f != ojt.b)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag2 = true;
          goto _L11
        if (ojs1.f != ojt.d || ojs1.l) goto _L7; else goto _L13
_L13:
        flag2 = false;
          goto _L11
    }

    public final void scrollTo(int i, int i1)
    {
        super.scrollTo(i, i1);
        if (!u.isEmpty())
        {
            a(u);
        }
    }

    static 
    {
        new ojo();
    }
}
