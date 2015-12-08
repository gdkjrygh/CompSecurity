// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.SectionIndexer;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;
import com.google.android.apps.photos.touchcapture.TouchCaptureView;
import java.util.Iterator;
import java.util.List;

public final class fsv
{

    private static final int j[] = {
        0x10100a7
    };
    private static final int k[] = new int[0];
    public Drawable a;
    public int b[];
    public int c;
    public int d;
    public final ftf e;
    public int f;
    public final ftj g;
    public final fss h;
    public final FastScrollRecyclerView i;
    private float l;
    private float m;
    private final iwc n;
    private final mwx o;
    private final SectionIndexer p;
    private int q;
    private final ValueAnimator r = ValueAnimator.ofFloat(new float[] {
        0.0F, 1.0F
    });
    private final Runnable s = new fsw(this);
    private mwz t;
    private final iwe u = new fsx(this);

    public fsv(fss fss1, FastScrollRecyclerView fastscrollrecyclerview, SectionIndexer sectionindexer)
    {
        b = new int[2];
        f = ftk.a;
        Context context = fastscrollrecyclerview.getContext();
        i = fastscrollrecyclerview;
        p = sectionindexer;
        n = (iwc)olm.b(context, iwc);
        o = (mwx)olm.a(context, mwx);
        g = new ftj(olm.c(context, ftd));
        e = new ftf(this, context);
        h = fss1;
        fss1 = context.getResources();
        fastscrollrecyclerview = context.getTheme().obtainStyledAttributes(new int[] {
            0x1010336, 0x1010339
        });
        a = fss1.getDrawable(b.qr);
        d = context.getResources().getDimensionPixelSize(b.qp);
        c = context.getResources().getDimensionPixelSize(b.qo);
        fastscrollrecyclerview.recycle();
        g();
        i.b(new fsy(this));
        r.addUpdateListener(new fsz(this));
        r.addListener(new fta(this));
        h.a().a(new ftb(this), false);
    }

    static int a(fsv fsv1, int i1)
    {
        fsv1.q = i1;
        return i1;
    }

    static ValueAnimator a(fsv fsv1)
    {
        return fsv1.r;
    }

    static ftf b(fsv fsv1)
    {
        return fsv1.e;
    }

    static ftj c(fsv fsv1)
    {
        return fsv1.g;
    }

    static iwc d(fsv fsv1)
    {
        return fsv1.n;
    }

    static int e(fsv fsv1)
    {
        return fsv1.q;
    }

    private int f()
    {
        return i.getHeight() - i.getPaddingTop() - i.getPaddingBottom();
    }

    static void f(fsv fsv1)
    {
        if (fsv1.q >= fsv1.i.getResources().getDimensionPixelSize(b.qq))
        {
            fsv1.h();
            if (fsv1.h.b() && fsv1.f != ftk.c)
            {
                fsv1.a(ftk.b);
                fsv1.e.a(150L);
                fsv1.o.a(fsv1.t);
                fsv1.t = fsv1.o.a(fsv1.s, 2500L);
            }
        }
    }

    static FastScrollRecyclerView g(fsv fsv1)
    {
        return fsv1.i;
    }

    private void g()
    {
        int ai[];
        if (f == ftk.c)
        {
            ai = j;
        } else
        {
            ai = k;
        }
        if (a != null && a.isStateful())
        {
            a.setState(ai);
        }
    }

    static int h(fsv fsv1)
    {
        return fsv1.f;
    }

    private void h()
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (h.b())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f != ftk.a)
        {
            a(ftk.a);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (f == ftk.c) goto _L1; else goto _L3
_L3:
        float f1 = h.c();
        float f2 = h.d();
        float f3 = l;
        float f4 = f() - c;
        l = (f2 / f1) * f4;
        if (l != f3 && f != ftk.a)
        {
            g.a(this);
            i.invalidate();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    static void i(fsv fsv1)
    {
        fsv1.h();
    }

    public static boolean j(fsv fsv1)
    {
        return fsv1.e();
    }

    public final void a()
    {
        if (f == ftk.b)
        {
            o.a(t);
            s.run();
        }
    }

    public final void a(int i1)
    {
        ftc.a[i1 - 1];
        JVM INSTR tableswitch 1 4: default 36
    //                   1 46
    //                   2 67
    //                   3 179
    //                   4 200;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        f = i1;
        g();
        return;
_L2:
        o.a(t);
        i.invalidate();
        continue; /* Loop/switch isn't completed */
_L3:
        if (f != ftk.b)
        {
            r.setFloatValues(new float[] {
                ((Float)r.getAnimatedValue()).floatValue(), 1.0F
            });
            r.setDuration(100L);
            r.start();
            for (Iterator iterator = g.a.iterator(); iterator.hasNext(); ((ftd)iterator.next()).d(this)) { }
        }
        o.a(t);
        continue; /* Loop/switch isn't completed */
_L4:
        o.a(t);
        e.a();
        continue; /* Loop/switch isn't completed */
_L5:
        i.invalidate((int)c(), (int)l, (int)b(), (int)l + c);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final boolean a(float f1, float f2)
    {
        return f1 > c() && f1 < b() && f2 >= (float)d() && f2 <= (float)(c + d());
    }

    public final boolean a(MotionEvent motionevent)
    {
        float f2;
        float f3;
        f3 = 1.0F;
        f2 = 0.0F;
        if (f != ftk.a) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 48
    //                   0 50
    //                   1 223
    //                   2 348;
           goto _L3 _L4 _L5 _L6
_L6:
        continue; /* Loop/switch isn't completed */
_L3:
        return false;
_L4:
        if (!a(motionevent.getX(), motionevent.getY())) goto _L1; else goto _L7
_L7:
        a(ftk.c);
        m = motionevent.getY();
        motionevent = e;
        if (((ftf) (motionevent)).m || !((ftf) (motionevent)).l)
        {
            motionevent.a();
        }
        ((ftf) (motionevent)).j.setFloatValues(new float[] {
            ((ftf) (motionevent)).p, (float)((ftf) (motionevent)).i
        });
        ((ftf) (motionevent)).j.start();
        for (motionevent = g.a.iterator(); motionevent.hasNext(); ((ftd)motionevent.next()).a(this)) { }
        if (n != null)
        {
            n.a().a(u);
        }
        motionevent = MotionEvent.obtain(0L, 0L, 3, 0.0F, 0.0F, 0);
        i.onTouchEvent(motionevent);
        motionevent.recycle();
        return true;
_L5:
        if (f != ftk.c) goto _L1; else goto _L8
_L8:
        a(ftk.b);
        o.a(t);
        t = o.a(s, 1000L);
        motionevent = e;
        ((ftf) (motionevent)).j.setFloatValues(new float[] {
            ((ftf) (motionevent)).p, (float)((ftf) (motionevent)).h
        });
        ((ftf) (motionevent)).j.start();
        for (motionevent = g.a.iterator(); motionevent.hasNext(); ((ftd)motionevent.next()).b(this)) { }
        return true;
        if (f != ftk.c) goto _L1; else goto _L9
_L9:
        float f1;
        int i1;
        if (Math.abs(motionevent.getY() - m) < 2.0F)
        {
            return true;
        }
        i1 = f();
        int j1 = i.getWidth();
        float f4;
        Object aobj[];
        String s1;
        if (e())
        {
            f1 = motionevent.getX();
        } else
        {
            f1 = (float)j1 - motionevent.getX();
        }
        f4 = f1 / (float)j1;
        f1 = f3;
        if (f4 > 0.1F)
        {
            f1 = (float)Math.pow((1.0F - f4) + 0.1F, 2D);
        }
        f3 = l;
        f1 = f1 * (motionevent.getY() - m) + f3;
        if (f1 >= 0.0F) goto _L11; else goto _L10
_L10:
        f1 = f2;
_L13:
        l = f1;
        m = motionevent.getY();
        f1 = l / (float)(i1 - c);
        i1 = h.a(f1);
        aobj = p.getSections();
        if (aobj.length > 0)
        {
            motionevent = e;
            s1 = aobj[p.getSectionForPosition(i1)].toString();
            if (!s1.equals(((ftf) (motionevent)).q))
            {
                motionevent.q = s1;
                ((ftf) (motionevent)).f.getTextBounds(s1, 0, s1.length(), ((ftf) (motionevent)).e);
            }
        }
        g.a(this);
        i.invalidate();
        return true;
_L11:
        if ((float)c + f1 > (float)i1)
        {
            f1 = i1 - c;
        }
        if (true) goto _L13; else goto _L12
_L12:
    }

    public float b()
    {
        int i1 = i.getWidth();
        if (e())
        {
            return ((Float)r.getAnimatedValue()).floatValue() * (float)d;
        } else
        {
            float f1 = i1;
            return (1.0F - ((Float)r.getAnimatedValue()).floatValue()) * (float)d + f1;
        }
    }

    public float c()
    {
        int i1 = i.getWidth();
        if (e())
        {
            return (((Float)r.getAnimatedValue()).floatValue() - 1.0F) * (float)d;
        } else
        {
            float f1 = i1 - d;
            return (1.0F - ((Float)r.getAnimatedValue()).floatValue()) * (float)d + f1;
        }
    }

    public int d()
    {
        return (int)l + i.getPaddingTop();
    }

    public boolean e()
    {
        return mk.h(i) == 1;
    }

}
