// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.stories;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import imt;
import ios;
import iot;
import ipb;
import ipc;
import ipk;
import ipn;
import ipo;
import iqx;
import iqy;
import iqz;
import ira;
import irb;
import irc;
import ird;
import ire;
import irf;
import irg;
import irh;
import iri;
import irj;
import irm;
import iro;
import irp;
import irq;
import irr;
import irx;
import isa;
import isb;
import isc;
import isg;
import isw;
import isx;
import ite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import oce;
import per;
import pev;
import pex;
import pey;
import pfp;
import pgf;
import qw;
import s;

public class StoryLayout extends AdapterView
    implements ios, ipk
{

    private final int A;
    private final int B;
    private VelocityTracker C;
    private final qw D;
    private final qw E;
    private int F;
    private int G;
    private boolean H;
    private final Runnable I;
    private final Runnable J;
    private Path K;
    private boolean L;
    private boolean M;
    private byte N[];
    private final Runnable O;
    private final Runnable P;
    public Point a[][];
    public irq b;
    public isa c;
    public iot d;
    public Point e[];
    public Paint f;
    public List g;
    public ipb h;
    public irh i;
    public irg j;
    public ire k;
    public iri l;
    public irf m;
    public iro n;
    public final ird o;
    public irj p;
    public long q;
    public boolean r;
    private final irc s;
    private isx t;
    private int u;
    private int v[];
    private final Point w;
    private int x;
    private int y;
    private int z;

    public StoryLayout(Context context)
    {
        this(context, null);
    }

    public StoryLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public StoryLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        s = new irc(this);
        u = -1;
        w = new Point();
        I = new iqx(this);
        J = new iqy(this);
        L = true;
        M = true;
        o = new ird();
        q = -1L;
        O = new iqz(this);
        P = new irb(this);
        attributeset = ViewConfiguration.get(context);
        A = attributeset.getScaledTouchSlop();
        B = attributeset.getScaledMaximumFlingVelocity();
        D = new qw(context);
        E = new qw(context);
        K = new Path();
        f = new Paint(1);
        f.setStyle(android.graphics.Paint.Style.STROKE);
        f.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            h = new ipb(this);
        }
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
    }

    public static int a(StoryLayout storylayout, int i1)
    {
        storylayout.u = -1;
        return -1;
    }

    private View a(int i1, int j1)
    {
        View view = b.getView(i1, t.a(b.getItemViewType(i1)), this);
        view.setTag(s.bD, Integer.valueOf(i1));
        Object obj1 = view.getLayoutParams();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = new android.view.ViewGroup.LayoutParams(-2, -2);
        }
        addViewInLayout(view, j1, ((android.view.ViewGroup.LayoutParams) (obj)), true);
        obj = isb.a(view);
        obj1 = ((isb) (obj)).A();
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (((isb) (obj)).x())
        {
            i1 = ((isb) (obj)).y().a;
        } else
        {
            i1 = 0;
        }
        i1 *= 2;
        j1 = ((isb) (obj)).e();
        k1 = ((isg) (obj1)).b;
        l1 = ((isg) (obj1)).d;
        i2 = ((isb) (obj)).g();
        j2 = ((isg) (obj1)).c;
        k2 = ((isg) (obj1)).e;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1 + k1 + l1 + i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i1 + (i2 + j2 + k2), 0x40000000));
        isw.a(view, 0, 0);
        return view;
    }

    private View a(per per, View view, Class class1)
    {
        if (view != null) goto _L2; else goto _L1
_L1:
        class1 = null;
_L4:
        return class1;
_L2:
        if (view instanceof ViewGroup)
        {
            ViewGroup viewgroup = (ViewGroup)view;
            for (int i1 = 0; i1 < viewgroup.getChildCount(); i1++)
            {
                View view1 = a(per, viewgroup.getChildAt(i1), class1);
                if (view1 != null)
                {
                    return view1;
                }
            }

        }
        if (!view.getClass().isAssignableFrom(class1) || view.getTag(s.bL) == null || ((pex)view.getTag(s.bL)).d == null)
        {
            break; /* Loop/switch isn't completed */
        }
        class1 = view;
        if (ite.a(per, ((pex)view.getTag(s.bL)).d)) goto _L4; else goto _L3
_L3:
        return null;
    }

    public static ird a(StoryLayout storylayout)
    {
        return storylayout.o;
    }

    private void a(Canvas canvas, qw qw1, float f1, float f2, float f3)
    {
        if (qw1 != null && !qw1.a())
        {
            int i1 = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            canvas.rotate(f1);
            canvas.translate(f2, f3);
            if (qw1.a(canvas))
            {
                invalidate();
            }
            canvas.restoreToCount(i1);
        }
    }

    private void a(View view, int i1)
    {
        isb isb1 = isb.a(view);
        int j1 = isb1.c;
        int k1 = isb1.b;
        view.layout(j1, k1, view.getMeasuredWidth() + j1, view.getMeasuredHeight() + k1);
        b(view, i1);
    }

    private void a(boolean flag)
    {
        if (j != null)
        {
            removeCallbacks(P);
            if (d.p() != 0)
            {
                j.h(flag);
            }
        }
    }

    public static boolean a(StoryLayout storylayout, boolean flag)
    {
        storylayout.H = true;
        return true;
    }

    public static iot b(StoryLayout storylayout)
    {
        return storylayout.d;
    }

    private void b(View view, int i1)
    {
        isb isb1 = isb.a(view);
        int j1 = d.j();
        int k1 = d.k();
        int i2 = isb1.j();
        int l1 = d.a(i2);
        i2 = d.b(i2);
        view.setTranslationX(-(l1 - j1));
        view.setTranslationY(-(i2 - k1));
        c(view, i1);
    }

    public static void b(StoryLayout storylayout, boolean flag)
    {
        storylayout.a(false);
    }

    private void c()
    {
        H = false;
        removeCallbacks(I);
    }

    private void c(View view, int i1)
    {
        boolean flag2 = true;
        boolean flag1 = false;
        int j1 = (int)view.getX();
        int k1 = view.getMeasuredWidth();
        int l1 = d.j();
        Object obj;
        boolean flag;
        if ((view instanceof isw) && !((isw)view).b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j1 + k1 >= l1 && j1 <= l1 + i1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj = view.getTag(s.bZ);
        if (i1 == 0 || flag)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        i1 = ((flag2) ? 1 : 0);
        if (obj != null)
        {
            if (((Boolean)obj).booleanValue())
            {
                break MISSING_BLOCK_LABEL_130;
            }
            i1 = ((flag2) ? 1 : 0);
        }
_L1:
        if (i1 != 0)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 4;
        }
        view.setVisibility(i1);
        return;
        i1 = 0;
          goto _L1
    }

    private boolean c(int i1)
    {
        return e.length - 1 == i1 && !c.c;
    }

    public static boolean c(StoryLayout storylayout)
    {
        return storylayout.r;
    }

    public static Path d(StoryLayout storylayout)
    {
        return storylayout.K;
    }

    private void d(View view, int i1)
    {
        removeViewInLayout(view);
        view.setTranslationX(0.0F);
        view.setTranslationY(0.0F);
        view.setVisibility(0);
        t.a(view, i1);
    }

    private boolean d()
    {
        return p != null && p.c;
    }

    private static boolean d(int i1)
    {
        return i1 == 0;
    }

    public static Paint e(StoryLayout storylayout)
    {
        return storylayout.f;
    }

    public final View a(per per, Class class1)
    {
        if (per == null)
        {
            return null;
        } else
        {
            return a(per, ((View) (this)), class1);
        }
    }

    public final void a()
    {
        int j1 = getWidth();
        for (int i1 = 0; i1 < getChildCount(); i1++)
        {
            c(getChildAt(i1), j1);
        }

    }

    public final void a(int i1)
    {
        boolean flag;
        flag = false;
        if (h != null)
        {
            flag = h.a(i1);
        }
        if (!c(i1) || k == null) goto _L2; else goto _L1
_L1:
        k.b(flag);
_L4:
        if (i1 != 0)
        {
            removeCallbacks(P);
            postDelayed(P, 3000L);
        }
        return;
_L2:
        if (d(i1) && l != null && !d())
        {
            l.u();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(iot iot1)
    {
        if (h != null)
        {
            Object obj = h;
            if (((ipb) (obj)).e != null)
            {
                obj = ((ipb) (obj)).e;
                for (int i1 = 0; i1 < iot1.a(); i1++)
                {
                    int j1 = iot1.a(i1);
                    Point apoint[] = ((ipn) (obj)).a[i1];
                    int l1 = (int)((float)j1 + (float)((ipn) (obj)).b / 2.0F);
                    for (int k1 = 0; k1 < apoint.length; k1++)
                    {
                        float f1 = (float)(l1 - apoint[k1].x) / (float)((ipn) (obj)).b;
                        if (f1 >= -1F && f1 <= 1.0F)
                        {
                            ((ipn) (obj)).c.a(i1, k1, f1);
                        }
                    }

                }

            }
        }
    }

    public final void a(irq irq1)
    {
        if (b != null)
        {
            b.unregisterDataSetObserver(s);
        }
        b = irq1;
        if (b != null)
        {
            b.registerDataSetObserver(s);
            t = b.a();
            Object obj = b;
            obj.i = h;
            irq1 = ((irq) (obj)).d;
            obj = new irr(((irq) (obj)));
            ((isx) (irq1)).a.add(obj);
        }
        removeAllViewsInLayout();
        requestLayout();
    }

    public final void a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            N = null;
            return;
        } else
        {
            N = Arrays.copyOf(abyte0, abyte0.length);
            return;
        }
    }

    protected boolean addViewInLayout(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams, boolean flag)
    {
        v = null;
        return super.addViewInLayout(view, i1, layoutparams, flag);
    }

    public void b()
    {
        if (h != null && a != null)
        {
            ipb ipb1 = h;
            ipb1.e = new ipn(a, getMeasuredWidth(), new ipc(ipb1));
            a(d);
        }
    }

    public final void b(int i1)
    {
        if (c(i1) && k != null)
        {
            k.t();
        } else
        if (d(i1) && l != null && !d())
        {
            l.v();
            return;
        }
    }

    public void computeScroll()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (d.h())
        {
            postInvalidate();
        }
        int j1 = getChildCount();
        int i1;
        if (b == null)
        {
            i1 = 0;
        } else
        {
            i1 = b.getCount();
        }
        if (i1 != 0 && j1 != 0)
        {
            int l2 = getMeasuredWidth();
            int k1 = d.j();
            if (k1 > getScrollX())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            scrollTo(k1, d.k());
            k1 = getScrollX();
            if (d.c() || i1 != 0 && F - (k1 + l2) <= l2 || i1 == 0 && k1 - G <= l2)
            {
                F = l2 * 3 + k1;
                G = k1 - l2 * 2;
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                i1 = getChildCount();
                View view;
                int l1;
                int i2;
                int j2;
                int k2;
                if (b == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = b.getCount();
                }
                view = getChildAt(0);
                k2 = (int)view.getX() + view.getWidth();
                j2 = k2;
                l1 = i1;
                if (k2 <= G)
                {
                    l1 = i1;
                    do
                    {
                        i1 = l1;
                        if (l1 <= 1)
                        {
                            break;
                        }
                        View view2 = getChildAt(1);
                        i1 = l1;
                        if ((int)view2.getX() + view2.getWidth() > G)
                        {
                            break;
                        }
                        irq irq1 = b;
                        i1 = u;
                        u = i1 + 1;
                        d(view, irq1.getItemViewType(i1));
                        l1--;
                        view = view2;
                    } while (true);
                } else
                {
                    do
                    {
                        i1 = l1;
                        if (u <= 0)
                        {
                            break;
                        }
                        i1 = l1;
                        if (j2 <= G)
                        {
                            break;
                        }
                        i1 = u - 1;
                        u = i1;
                        view = a(i1, 0);
                        a(view, l2);
                        i1 = (int)view.getX();
                        j2 = view.getWidth() + i1;
                        l1++;
                    } while (true);
                }
                view = getChildAt(i1 - 1);
                l1 = (int)view.getX();
                if (l1 >= F)
                {
                    do
                    {
                        if (i1 <= 1)
                        {
                            break;
                        }
                        View view3 = getChildAt(i1 - 2);
                        if ((int)view3.getX() < F)
                        {
                            break;
                        }
                        d(view, b.getItemViewType((u + i1) - 1));
                        i1--;
                        view = view3;
                    } while (true);
                } else
                {
                    for (; u + i1 < i2 && l1 < F; i1++)
                    {
                        View view1 = a(u + i1, i1);
                        a(view1, l2);
                        l1 = (int)view1.getX();
                    }

                }
            }
            i1 = getChildCount() - 1;
            while (i1 >= 0) 
            {
                b(getChildAt(i1), l2);
                i1--;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag = super.dispatchTouchEvent(motionevent);
        if (!o.a && o.b)
        {
            post(J);
        }
        return flag;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        a(canvas, D, 270F, -getHeight(), 0.0F);
        a(canvas, E, 90F, 0.0F, -getWidth());
    }

    public Adapter getAdapter()
    {
        return b;
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        boolean flag = false;
        if (v == null)
        {
            int l1 = getChildCount();
            Object obj = new TreeSet(new ira(this));
            Object obj1 = new TreeMap();
            i1 = 0;
            while (i1 < l1) 
            {
                isb isb1 = isb.a(getChildAt(i1));
                int k1;
                if (isb1.j() >= 0)
                {
                    k1 = isb1.j();
                } else
                {
                    k1 = 0;
                }
                ((Map) (obj1)).put(Integer.valueOf(i1), Integer.valueOf(k1));
                i1++;
            }
            ((SortedSet) (obj)).addAll(((Map) (obj1)).entrySet());
            v = new int[l1];
            obj = ((SortedSet) (obj)).iterator();
            for (i1 = ((flag) ? 1 : 0); ((Iterator) (obj)).hasNext(); i1++)
            {
                obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                v[i1] = ((Integer)((java.util.Map.Entry) (obj1)).getKey()).intValue();
            }

        }
        return v[j1];
    }

    public View getSelectedView()
    {
        return null;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (h != null)
        {
            h.f = getHandler();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (p != null)
        {
            p.a();
        }
    }

    public void onDraw(Canvas canvas)
    {
        boolean flag = false;
        if (n != null)
        {
            iro iro1 = n;
            if (iro1.h.d != null && iro1.g != null)
            {
                float f1 = iro1.h.d.j();
                float f2 = f1 + (float)iro1.h.getWidth();
                for (; (float)iro1.b < f1 - (float)iro1.a && !iro1.e.isEmpty(); iro1.b = iro1.b + iro1.a)
                {
                    iro1.a(((irp)iro1.e.remove(0)).a);
                }

                for (; (float)iro1.c > (float)iro1.a + f2 && !iro1.e.isEmpty(); iro1.c = iro1.c - iro1.a)
                {
                    iro1.a(((irp)iro1.e.remove(iro1.e.size() - 1)).a);
                }

                while ((float)iro1.b > f1) 
                {
                    irp irp1 = iro1.a(iro1.b - iro1.a);
                    iro1.b = iro1.b - iro1.a;
                    iro1.e.add(0, irp1);
                }
                int i1;
                do
                {
                    i1 = ((flag) ? 1 : 0);
                    if ((float)iro1.c >= f2)
                    {
                        break;
                    }
                    irp irp2 = iro1.a(iro1.c);
                    iro1.c = iro1.c + iro1.a;
                    iro1.e.add(iro1.e.size(), irp2);
                } while (true);
                while (i1 < iro1.e.size()) 
                {
                    irp irp3 = (irp)iro1.e.get(i1);
                    canvas.drawBitmap(irp3.a, iro1.b + iro1.a * i1, irp3.b, null);
                    i1++;
                }
            }
        }
        canvas = imt.a;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (getChildCount() != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (motionevent.getActionMasked())
        {
        default:
            return false;

        case 3: // '\003'
            break;

        case 0: // '\0'
            w.set((int)motionevent.getX(), (int)motionevent.getY());
            x = w.x;
            y = d.l();
            z = 0;
            ird ird1 = o;
            ird1.a = false;
            ird1.b = false;
            postDelayed(I, ViewConfiguration.getLongPressTimeout());
            if (C == null)
            {
                C = VelocityTracker.obtain();
            } else
            {
                C.clear();
            }
            C.addMovement(motionevent);
            if (d.e())
            {
                d.m();
                d.f();
                return true;
            }
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            C.addMovement(motionevent);
            w.set((int)motionevent.getX(), (int)motionevent.getY());
            if (!d.g() && Math.abs(motionevent.getX() - (float)x) > (float)A)
            {
                g = null;
                d.f();
                a(true);
                c();
                return true;
            }
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            if (!H && d.c())
            {
                o.b = true;
            }
            break;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        c();
        if (C != null)
        {
            C.recycle();
            C = null;
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2;
        if (b == null)
        {
            i2 = 0;
        } else
        {
            i2 = b.getCount();
        }
        if (i2 != 0)
        {
            l1 -= j1;
            k1 -= i1;
            if (u == -1)
            {
                irj irj1;
                long l2;
                if (g != null && !g.isEmpty())
                {
                    i1 = b.a(g);
                } else
                {
                    i1 = -1;
                }
                j1 = i1;
                if (i1 == -1)
                {
                    j1 = 0;
                }
                u = j1;
                a(a(u, 0), k1);
                computeScroll();
            }
            for (i1 = getChildCount() - 1; i1 >= 0; i1--)
            {
                a(getChildAt(i1), k1);
            }

            D.a(l1, k1);
            E.a(l1, k1);
            if (d.p() == 0)
            {
                irj1 = p;
                if (irj1.a >= 2)
                {
                    l2 = 10000L;
                } else
                {
                    l2 = 2000L;
                }
                irj1.a(l2);
            }
            if (L && d.p() == 0)
            {
                post(O);
            }
            L = false;
            if (M && m != null)
            {
                m.a();
            }
            if (M && getChildCount() > 0)
            {
                (new oce(6)).b(getContext());
                M = false;
                return;
            }
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        k1 = android.view.View.MeasureSpec.getSize(i1);
        l1 = android.view.View.MeasureSpec.getSize(j1);
        i1 = l1;
        j1 = k1;
        if (c == null) goto _L2; else goto _L1
_L1:
        float f1;
        pgf pgf1 = c.a.d;
        if (pgf1 != null)
        {
            f1 = pgf1.a.floatValue() / pgf1.b.floatValue();
        } else
        {
            f1 = 0.0F;
        }
        i1 = l1;
        j1 = k1;
        if (f1 <= 0.0F) goto _L2; else goto _L3
_L3:
        if ((float)l1 * f1 >= (float)k1) goto _L5; else goto _L4
_L4:
        j1 = (int)((float)l1 * f1);
        i1 = l1;
_L2:
        setMeasuredDimension(j1, i1);
        if (d != null)
        {
            d.a(j1, i1);
        }
        return;
_L5:
        i1 = l1;
        j1 = k1;
        if ((float)k1 / f1 < (float)l1)
        {
            i1 = (int)((float)k1 / f1);
            j1 = k1;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (irm)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        g = irm.a(parcelable);
        L = irm.b(parcelable);
        q = irm.c(parcelable);
    }

    public Parcelable onSaveInstanceState()
    {
        irm irm1 = new irm(super.onSaveInstanceState());
        irm.a(irm1, L);
        irm.b(irm1, false);
        long l1;
        if (d != null)
        {
            int i1 = d.p();
            irj irj1;
            boolean flag1;
            if (e.length - 1 == i1 && c.c)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            irm.b(irm1, flag1);
            if (g != null)
            {
                irm.a(irm1, g);
            } else
            {
                Object obj;
                if (N != null)
                {
                    irq irq1 = b;
                    byte abyte0[] = N;
                    obj = new ArrayList();
                    if (irq1.e != null && irq1.f != -1)
                    {
                        i1 = irq1.e.h[irq1.f].c.length;
                        boolean flag = false;
                        i1--;
                        while (i1 >= 0) 
                        {
                            pfp pfp1 = irq1.e.h[irq1.f].c[i1];
                            if (pfp1.f == null)
                            {
                                Log.w("StoryLayoutAdapter", "Layout element with no layout element ref");
                            } else
                            if (flag)
                            {
                                ((List) (obj)).add(new irx(pfp1.f));
                            } else
                            if (Arrays.equals(abyte0, pfp1.f))
                            {
                                ((List) (obj)).add(new irx(pfp1.f));
                                flag = true;
                            }
                            i1--;
                        }
                    }
                } else
                {
                    obj = b.b(i1);
                }
                irm.a(irm1, ((List) (obj)));
            }
        }
        if (p != null)
        {
            irj1 = p;
            if (irj1.d != -1L)
            {
                l1 = irj1.d - SystemClock.elapsedRealtime();
            } else
            {
                l1 = -1L;
            }
        } else
        {
            l1 = -1L;
        }
        irm.a(irm1, l1);
        return irm1;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        b();
        if (i != null)
        {
            i.a(this);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        flag = false;
        if (getChildCount() == 0)
        {
            return false;
        }
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 48
    //                   0 50
    //                   1 393
    //                   2 166
    //                   3 415;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return true;
_L2:
        w.set((int)motionevent.getX(), (int)motionevent.getY());
        x = w.x;
        y = d.l();
        z = 0;
        postDelayed(I, ViewConfiguration.getLongPressTimeout());
        if (d.e())
        {
            d.m();
            d.f();
        }
        if (C == null)
        {
            C = VelocityTracker.obtain();
        } else
        {
            C.clear();
        }
        C.addMovement(motionevent);
        continue; /* Loop/switch isn't completed */
_L4:
        C.addMovement(motionevent);
        int i1 = (int)motionevent.getX() - x;
        if (!d.g() && Math.abs(i1) > A)
        {
            g = null;
            d.f();
            a(true);
            c();
        }
        if (d.g())
        {
            i1 = y - i1;
            int j1 = Math.max(0, Math.min(d.o(), i1));
            if (j1 != d.l())
            {
                d.c(j1);
                p.a();
                computeScroll();
            }
            if (d.l() != i1)
            {
                z = i1 - d.l();
                qw qw1;
                if (z < 0)
                {
                    qw1 = D;
                } else
                {
                    qw1 = E;
                }
                qw1.a((motionevent.getX() - (float)w.x) / (float)getWidth());
            } else
            {
                z = 0;
            }
            invalidate();
        }
        w.set((int)motionevent.getX(), (int)motionevent.getY());
        continue; /* Loop/switch isn't completed */
_L3:
        if (H || !d.c())
        {
            break; /* Loop/switch isn't completed */
        }
        performClick();
_L5:
        c();
        if (C != null)
        {
            C.recycle();
            C = null;
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (!d.g()) goto _L5; else goto _L7
_L7:
        C.computeCurrentVelocity(1000, B);
        if (z != 0)
        {
            motionevent = d;
            if (z < 0)
            {
                flag = true;
            }
            motionevent.b(flag);
            if (z < 0)
            {
                motionevent = D;
            } else
            {
                motionevent = E;
            }
            if (motionevent.c())
            {
                invalidate();
            }
        } else
        if (Math.abs(C.getXVelocity()) >= 0.0F)
        {
            d.a(d.l(), 0, (int)(-C.getXVelocity()), 0, 0, d.o(), 0, 0);
            invalidate();
        } else
        {
            d.b();
        }
          goto _L5
    }

    public boolean performClick()
    {
        a(false);
        return super.performClick();
    }

    public void removeViewInLayout(View view)
    {
        v = null;
        super.removeViewInLayout(view);
    }

    public void setAdapter(Adapter adapter)
    {
        a((irq)adapter);
    }

    public void setSelection(int i1)
    {
        throw new UnsupportedOperationException("Not supported");
    }
}
