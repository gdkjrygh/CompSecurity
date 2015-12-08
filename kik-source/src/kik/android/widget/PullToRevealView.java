// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.widget:
//            de, df

public class PullToRevealView extends LinearLayout
    implements android.view.GestureDetector.OnGestureListener
{
    public static interface a
    {

        public abstract void a(float f1);

        public abstract void c();

        public abstract void d();
    }

    static interface b
    {

        public abstract void a(boolean flag);
    }

    final class c
        implements Runnable
    {

        final PullToRevealView a;
        private final Interpolator b;
        private final int c;
        private final int d;
        private final long e;
        private b f;
        private boolean g;
        private long h;
        private int i;

        public final void a()
        {
            g = false;
        }

        public final void run()
        {
            boolean flag;
            flag = false;
            if (h == -1L)
            {
                h = System.currentTimeMillis();
            } else
            {
                long l1 = Math.max(Math.min(((System.currentTimeMillis() - h) * 1000L) / e, 1000L), 0L);
                int i1 = Math.round((float)(d - c) * b.getInterpolation((float)l1 / 1000F));
                i = d - i1;
                a.scrollTo(0, i);
                float f1 = (float)(-i) / (float)PullToRevealView.f();
                a.a(f1);
            }
            if (!g || c == i) goto _L2; else goto _L1
_L1:
            if (android.os.Build.VERSION.SDK_INT < 16) goto _L4; else goto _L3
_L3:
            a.postOnAnimation(this);
_L6:
            return;
_L4:
            a.postDelayed(this, 16L);
            return;
_L2:
            if (f != null)
            {
                b b1 = f;
                if (!g)
                {
                    flag = true;
                }
                b1.a(flag);
                return;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public c(int i1, int j1, long l1, b b1)
        {
            a = PullToRevealView.this;
            super();
            g = true;
            h = -1L;
            i = -1;
            d = i1;
            c = j1;
            b = PullToRevealView.c(PullToRevealView.this);
            e = l1;
            f = b1;
        }
    }


    private Interpolator a;
    private c b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private ListView g;
    private View h;
    private a i;
    private boolean j;
    private GestureDetectorCompat k;
    private boolean l;
    private boolean m;

    public PullToRevealView(Context context)
    {
        this(context, null);
    }

    public PullToRevealView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(1);
        c = ViewConfiguration.get(context).getScaledTouchSlop();
        k = new GestureDetectorCompat(context, this);
    }

    private int a(MotionEvent motionevent)
    {
        int i1;
        int j1;
        int k1;
        i1 = (int)motionevent.getY();
        j1 = e;
        k1 = KikApplication.a(130);
        if (k1 != 0) goto _L2; else goto _L1
_L1:
        double d1 = 0.0D;
_L4:
        return (int)(d1 * (double)KikApplication.a(130));
_L2:
        double d2 = (double)(j1 - i1) / (double)k1;
        d1 = d2;
        if (d2 < 0.0D)
        {
            d2 /= 3D;
            d1 = d2;
            if (d2 < -1D)
            {
                d1 = -1D;
            }
            d1 = -1D - d1;
            d1 = -1D - d1 * (d1 * d1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static View a(PullToRevealView pulltorevealview)
    {
        return pulltorevealview.h;
    }

    private final void a(int i1, long l1, long l2, b b1)
    {
label0:
        {
            if (b != null)
            {
                b.a();
            }
            int j1 = getScrollY();
            if (j1 != i1)
            {
                if (a == null)
                {
                    a = new DecelerateInterpolator();
                }
                b = new c(j1, i1, l1, b1);
                if (l2 <= 0L)
                {
                    break label0;
                }
                postDelayed(b, l2);
            }
            return;
        }
        post(b);
    }

    static void a(PullToRevealView pulltorevealview, b b1)
    {
        pulltorevealview.a(0, 200L, 2000L, b1);
    }

    static boolean b(PullToRevealView pulltorevealview)
    {
        pulltorevealview.l = false;
        return false;
    }

    static Interpolator c(PullToRevealView pulltorevealview)
    {
        return pulltorevealview.a;
    }

    public static int f()
    {
        return KikApplication.a(130);
    }

    private boolean g()
    {
        return ViewCompat.canScrollVertically(g, -1);
    }

    private boolean h()
    {
        return getContext().getResources().getConfiguration().orientation == 1;
    }

    public final void a(float f1)
    {
        if (i != null)
        {
            i.a(f1);
        }
    }

    public final void a(View view)
    {
        h = view;
    }

    public final void a(ListView listview)
    {
        g = listview;
    }

    public final void a(a a1)
    {
        i = a1;
    }

    public final boolean a()
    {
        return j;
    }

    public final void b()
    {
        m = true;
    }

    public final void c()
    {
        if (!j)
        {
            return;
        }
        j = false;
        if (i != null)
        {
            i.d();
        }
        scrollTo(0, 0);
    }

    public final void d()
    {
        if (!j)
        {
            return;
        }
        j = false;
        if (i != null)
        {
            i.d();
        }
        a(0, 200L, 0L, new de(this));
    }

    public final void e()
    {
        a((int)((double)KikApplication.a(130) * 0.69999999999999996D - 1.0D) * -1, 200L, 1000L, new df(this));
        l = true;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (configuration != null && configuration.orientation != 1)
        {
            e = -1;
            d = false;
            scrollTo(0, 0);
        }
    }

    public boolean onDown(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (j && f2 < (float)(-getHeight() * 2))
        {
            d();
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1 = MotionEventCompat.getActionMasked(motionevent);
        if (h() && !m) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1;
        int k1;
        int l1;
        int i2;
        j1 = (int)motionevent.getY();
        k1 = e - j1;
        l1 = a(motionevent);
        i2 = f;
        if (g()) goto _L1; else goto _L3
_L3:
        if (i1 != 0) goto _L5; else goto _L4
_L4:
        d = false;
        e = j1;
        f = getScrollY();
_L7:
        return d;
_L5:
        if (i1 == 2)
        {
            if (l && Math.abs(k1) > c)
            {
                if (b != null)
                {
                    b.a();
                    b = null;
                }
                l = false;
                d = true;
            } else
            if (!g())
            {
                if (l1 + i2 > 0)
                {
                    d = false;
                }
                if (-k1 > c && e != -1)
                {
                    d = true;
                }
            } else
            {
                d = false;
            }
        } else
        if (i1 == 1 || i1 == 3)
        {
            e = -1;
            d = false;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return false;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = true;
        if (motionevent != null && !m) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        float f1;
        int i1;
        int j1;
        i1 = MotionEventCompat.getActionMasked(motionevent);
        j1 = Math.max(a(motionevent) + f, -KikApplication.a(130));
        f1 = (float)(-j1) / (float)KikApplication.a(130);
        if (j)
        {
            k.onTouchEvent(motionevent);
            return super.onTouchEvent(motionevent);
        }
        if (g())
        {
            return false;
        }
        flag = flag1;
        if (!d) goto _L4; else goto _L3
_L3:
        if (i1 == 2)
        {
            if (d && j1 <= 0)
            {
                a(f1);
                scrollTo(0, j1);
                return true;
            } else
            {
                scrollTo(0, 0);
                return true;
            }
        }
        if (i1 == 1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (i1 != 3) goto _L4; else goto _L5
_L5:
        flag = d;
        e = -1;
        d = false;
        if (h()) goto _L7; else goto _L6
_L6:
        scrollTo(0, 0);
_L9:
        return false;
_L7:
        if (flag && (double)f1 > 0.69999999999999996D)
        {
            if (!j)
            {
                j = true;
                h.setVisibility(4);
                if (i != null)
                {
                    i.c();
                }
                a(-getHeight(), 300L, 0L, null);
            }
        } else
        if (!j)
        {
            a(0, 200L, 0L, null);
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
    }
}
