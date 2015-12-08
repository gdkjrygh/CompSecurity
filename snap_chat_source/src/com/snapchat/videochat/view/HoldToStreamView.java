// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import Rm;
import Su;
import VC;
import Vj;
import Vk;
import Vn;
import Vp;
import Vs;
import Vt;
import Vu;
import Vw;
import Vy;
import Vz;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import cS;
import cT;
import cV;
import cZ;
import java.security.GeneralSecurityException;

// Referenced classes of package com.snapchat.videochat.view:
//            StreamView, ConnectingRippleView, QuickSnapOnboardingOverlay, LockToStreamView

public class HoldToStreamView extends StreamView
{

    private static HoldToStreamView B;
    private static final String j = com/snapchat/videochat/view/HoldToStreamView.getSimpleName();
    private boolean A;
    private boolean C;
    private boolean D;
    private boolean E;
    private float F;
    private boolean G;
    private boolean H;
    private long I;
    private boolean J;
    private cT K;
    private cT L;
    private boolean M;
    private byte N[];
    private boolean O;
    private Activity P;
    private int Q;
    private final Runnable R;
    protected Vw a;
    protected boolean b;
    protected View c;
    protected LockToStreamView d;
    protected View e;
    Vt f;
    private int k;
    private boolean l;
    private Vp m;
    private long n;
    private float o;
    private MotionEvent p;
    private MotionEvent q;
    private ViewPropertyAnimator r;
    private GestureDetector s;
    private int t;
    private int u;
    private ConnectingRippleView v;
    private QuickSnapOnboardingOverlay w;
    private boolean x;
    private final Handler y;
    private float z;

    public HoldToStreamView(Context context)
    {
        super(context);
        k = 1000;
        l = false;
        m = Vn.f();
        b = false;
        x = false;
        y = new Handler();
        H = false;
        I = 0L;
        J = false;
        M = false;
        O = false;
        Q = 5000;
        R = new Runnable() {

            private HoldToStreamView a;

            public final void run()
            {
                while (a.e.getVisibility() != 0 || a.c.getScaleX() > 0.35F) 
                {
                    return;
                }
                HoldToStreamView.b(a);
            }

            
            {
                a = HoldToStreamView.this;
                super();
            }
        };
        a(context);
    }

    public HoldToStreamView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        k = 1000;
        l = false;
        m = Vn.f();
        b = false;
        x = false;
        y = new Handler();
        H = false;
        I = 0L;
        J = false;
        M = false;
        O = false;
        Q = 5000;
        R = new _cls10();
        a(context);
    }

    public HoldToStreamView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = 1000;
        l = false;
        m = Vn.f();
        b = false;
        x = false;
        y = new Handler();
        H = false;
        I = 0L;
        J = false;
        M = false;
        O = false;
        Q = 5000;
        R = new _cls10();
        a(context);
    }

    static int a(HoldToStreamView holdtostreamview, int i1)
    {
        holdtostreamview.t = i1;
        return i1;
    }

    private void a(Context context)
    {
        if (isInEditMode())
        {
            return;
        } else
        {
            B = this;
            z = ViewConfiguration.get(context).getScaledTouchSlop();
            v = new ConnectingRippleView(context);
            addView(v);
            c = h.a(context);
            addView(c);
            w = new QuickSnapOnboardingOverlay(context);
            addView(w);
            w.setVisibility(8);
            cV cv = new cV(320D, 24D);
            cZ cz = Vy.a();
            K = cz.a();
            K.a(cv);
            K.a(new cS() {

                private HoldToStreamView a;

                public final void a(cT ct)
                {
                    if (!a.b)
                    {
                        return;
                    } else
                    {
                        a.c.setX((float)ct.d.a - (float)(a.c.getWidth() / 2));
                        a.d.setX((float)ct.d.a - (float)(a.d.getWidth() / 2));
                        a.d.b();
                        HoldToStreamView.a(a);
                        return;
                    }
                }

            
            {
                a = HoldToStreamView.this;
                super();
            }
            });
            L = cz.a();
            L.a(cv);
            L.a(new cS() {

                private HoldToStreamView a;

                public final void a(cT ct)
                {
                    while (!a.b || a.d.c) 
                    {
                        return;
                    }
                    a.c.setY((float)ct.d.a);
                    HoldToStreamView.a(a);
                }

            
            {
                a = HoldToStreamView.this;
                super();
            }
            });
            d = new LockToStreamView(context, c, f);
            d.setY(getResources().getDimension(Vl.b.here_lock_to_stream_y_location));
            addView(d, 0, 0);
            s = new GestureDetector(getContext(), new android.view.GestureDetector.SimpleOnGestureListener());
            s.setOnDoubleTapListener(new android.view.GestureDetector.SimpleOnGestureListener() {

                private HoldToStreamView a;

                public final boolean onDoubleTap(MotionEvent motionevent)
                {
                    if (HoldToStreamView.j(a))
                    {
                        return true;
                    }
                    if (HoldToStreamView.k(a) == 2)
                    {
                        HoldToStreamView.a(a, 1);
                    } else
                    {
                        HoldToStreamView.a(a, 2);
                    }
                    HoldToStreamView.l(a);
                    return true;
                }

            
            {
                a = HoldToStreamView.this;
                super();
            }
            });
            setWillNotDraw(false);
            return;
        }
    }

    static void a(HoldToStreamView holdtostreamview)
    {
        holdtostreamview.i();
    }

    static void b(HoldToStreamView holdtostreamview)
    {
        if (!holdtostreamview.x)
        {
            holdtostreamview.r = holdtostreamview.c.animate();
            if (holdtostreamview.r == null)
            {
                throw new NullPointerException();
            }
            float f1 = 0.0F;
            if (holdtostreamview.d.c)
            {
                f1 = 0.2F;
            }
            holdtostreamview.r.alpha(f1);
            holdtostreamview.r.setInterpolator(new AccelerateDecelerateInterpolator());
            holdtostreamview.l();
            holdtostreamview.x = true;
            holdtostreamview.d.a((int)(f1 * 255F));
        }
    }

    private void c(String s1)
    {
        if (l)
        {
            l = false;
            if (!d.c)
            {
                j();
                f.a(s1);
                return;
            }
        }
    }

    static boolean c(HoldToStreamView holdtostreamview)
    {
        holdtostreamview.x = false;
        return false;
    }

    static void d(HoldToStreamView holdtostreamview)
    {
        holdtostreamview.o();
    }

    static void e(HoldToStreamView holdtostreamview)
    {
        holdtostreamview.p();
    }

    static void f(HoldToStreamView holdtostreamview)
    {
        holdtostreamview.k();
    }

    public static HoldToStreamView g()
    {
        return B;
    }

    static void g(HoldToStreamView holdtostreamview)
    {
        holdtostreamview.n();
    }

    static Vt h(HoldToStreamView holdtostreamview)
    {
        return holdtostreamview.f;
    }

    static String h()
    {
        return j;
    }

    private void i()
    {
        float f1 = c.getX();
        float f2 = c.getWidth() / 2;
        float f3 = c.getY();
        float f4 = c.getHeight() / 2;
        v.setRippleCenter(f1 + f2, f3 + f4);
    }

    static void i(HoldToStreamView holdtostreamview)
    {
        int i1 = holdtostreamview.getResources().getDimensionPixelSize(Vl.b.here_lock_icon_locked_y_offset);
        ViewPropertyAnimator viewpropertyanimator;
        ViewPropertyAnimator viewpropertyanimator1;
        if (holdtostreamview.t == 1)
        {
            holdtostreamview.d.setY(holdtostreamview.getHeight() - i1);
        } else
        {
            holdtostreamview.d.setY(i1);
        }
        holdtostreamview.d.b();
        viewpropertyanimator = holdtostreamview.c.animate();
        viewpropertyanimator1 = holdtostreamview.d.animate();
        viewpropertyanimator.alpha(1.0F);
        viewpropertyanimator1.alpha(1.0F);
        viewpropertyanimator.setListener(holdtostreamview. new AnimatorListenerAdapter() {

            private HoldToStreamView a;

            public final void onAnimationEnd(Animator animator)
            {
                if (a.e.getVisibility() != 4)
                {
                    HoldToStreamView.e(a);
                }
            }

            
            {
                a = HoldToStreamView.this;
                super();
            }
        });
    }

    private void j()
    {
        m.b(r());
        J = false;
        l = false;
        d.a();
        if (r != null)
        {
            r.cancel();
        }
        c.setVisibility(4);
        b = false;
        o();
        a.g(false);
        a.e(false);
        a.d(false);
        n();
        v.setRipplesEnabled(false);
        w.setVisibility(8);
        a.h(true);
    }

    static boolean j(HoldToStreamView holdtostreamview)
    {
        return holdtostreamview.G;
    }

    static int k(HoldToStreamView holdtostreamview)
    {
        return holdtostreamview.t;
    }

    private void k()
    {
        if (x)
        {
            return;
        }
        r = c.animate();
        if (r == null)
        {
            throw new NullPointerException();
        } else
        {
            r.alpha(1.0F);
            l();
            x = true;
            d.a(255);
            return;
        }
    }

    private void l()
    {
        r.setDuration(250L);
        r.setListener(new AnimatorListenerAdapter() {

            private HoldToStreamView a;

            public final void onAnimationEnd(Animator animator)
            {
                HoldToStreamView.c(a);
            }

            
            {
                a = HoldToStreamView.this;
                super();
            }
        });
    }

    static void l(HoldToStreamView holdtostreamview)
    {
        ViewPropertyAnimator viewpropertyanimator = holdtostreamview.c.animate();
        ViewPropertyAnimator viewpropertyanimator1 = holdtostreamview.d.animate();
        viewpropertyanimator.alpha(0.0F);
        viewpropertyanimator1.alpha(0.0F);
        viewpropertyanimator1.setListener(holdtostreamview. new AnimatorListenerAdapter() {

            final HoldToStreamView a;

            public final void onAnimationEnd(Animator animator)
            {
                a.postDelayed(new Runnable(this) {

                    private _cls3 a;

                    public final void run()
                    {
                        a.a.a.b(HoldToStreamView.k(a.a));
                        HoldToStreamView.m(a.a);
                    }

            
            {
                a = _pcls3;
                super();
            }
                }, 1000L);
            }

            
            {
                a = HoldToStreamView.this;
                super();
            }
        });
    }

    private void m()
    {
        if (e != null)
        {
            return;
        } else
        {
            e = m.d();
            o();
            e.setOnClickListener(new android.view.View.OnClickListener() {

                private HoldToStreamView a;

                public final void onClick(View view)
                {
                    a.a.u();
                }

            
            {
                a = HoldToStreamView.this;
                super();
            }
            });
            e.setOnTouchListener(new android.view.View.OnTouchListener() {

                private HoldToStreamView a;

                public final boolean onTouch(View view, MotionEvent motionevent)
                {
                    return a.onTouchEvent(motionevent);
                }

            
            {
                a = HoldToStreamView.this;
                super();
            }
            });
            addView(e);
            d.bringToFront();
            v.bringToFront();
            c.bringToFront();
            return;
        }
    }

    static boolean m(HoldToStreamView holdtostreamview)
    {
        holdtostreamview.H = true;
        return true;
    }

    private void n()
    {
        boolean flag2 = true;
        boolean flag;
        boolean flag1;
        if (e != null && e.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l || d.c)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || !flag1)
        {
            flag2 = false;
        }
        if (flag2 == A)
        {
            return;
        } else
        {
            a.a(this, flag2);
            A = flag2;
            postDelayed(new Runnable() {

                public final void run()
                {
                    StreamView.h.a();
                }

            }, getResources().getInteger(Vl.e.title_bar_update_delay));
            return;
        }
    }

    private void o()
    {
        boolean flag1 = false;
        if (e == null || c == null)
        {
            return;
        }
        boolean flag;
        if (e.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || b)
        {
            flag1 = true;
        }
        setKeepScreenOn(flag1);
    }

    private void p()
    {
        y.removeCallbacks(R);
        long l1;
        if (d.c)
        {
            l1 = 5000L;
        } else
        {
            l1 = 2000L;
        }
        y.postDelayed(R, l1);
    }

    private Vs q()
    {
        return new Vs() {

            private HoldToStreamView a;

            public final void a()
            {
                HoldToStreamView.h();
                a.b("SWIPE_OUT");
            }

            public final void b()
            {
                HoldToStreamView.h();
            }

            
            {
                a = HoldToStreamView.this;
                super();
            }
        };
    }

    private Vs r()
    {
        return new Vs() {

            private HoldToStreamView a;

            public final void a()
            {
                HoldToStreamView.h(a).d("HERE_PUBLISHED");
            }

            public final void b()
            {
            }

            
            {
                a = HoldToStreamView.this;
                super();
            }
        };
    }

    public final void a()
    {
        if (!O)
        {
            return;
        } else
        {
            m.a(q(), m.c(), Q);
            j();
            P = null;
            O = false;
            return;
        }
    }

    public final void a(Rm rm, String s1, Su su)
    {
        if (O) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        obj = m;
        Activity activity = P;
        new Vs() {

            public final void a()
            {
                HoldToStreamView.h();
            }

            public final void b()
            {
                HoldToStreamView.h();
            }

        };
        ((Vp) (obj)).a(activity, this, f);
        obj = rm;
        if (rm != null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new Rm();
        ((Rm) (obj)).a(Vz.a(s1));
        if (su == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            ((Rm) (obj)).b(su.a());
            ((Rm) (obj)).c(su.b());
        }
        // Misplaced declaration of an exception variable
        catch (Rm rm)
        {
            (new StringBuilder("Error generating scope for conversation: ")).append(s1).append(" ").append(rm.getMessage());
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        rm = m;
        s1 = new Vs() {

            private HoldToStreamView a;

            public final void a()
            {
                HoldToStreamView.h();
                a.f.c();
            }

            public final void b()
            {
                HoldToStreamView.h();
            }

            
            {
                a = HoldToStreamView.this;
                super();
            }
        };
        su = new Vj();
        su.e = ((Rm) (obj)).b();
        su.f = ((Rm) (obj)).d();
        su.i = ((Rm) (obj)).f();
        su.j = ((Rm) (obj)).g();
        su.g = ((Rm) (obj)).c();
        su.d = ((Rm) (obj)).a();
        su.h = ((Rm) (obj)).e();
        su.a = 24;
        su.c = 640;
        su.b = 320;
        rm.a(s1, su);
        D = true;
        return;
    }

    public final void a(Activity activity, Vw vw, Vt vt)
    {
        P = activity;
        a = vw;
        f = vt;
        d.setAnalytics(f);
        O = true;
    }

    public final void a(MotionEvent motionevent)
    {
        p = MotionEvent.obtainNoHistory(motionevent);
        if (e != null && c != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (d != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!l)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        int i1 = motionevent.getActionMasked();
        if (i1 != 1 && i1 != 3 && i1 != 5 && i1 != 6)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        c("HERE_BTN_RELEASED");
        if (d.c)
        {
            a.h(true);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!l && !d.c)
        {
            return;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
        int j1;
        float f4;
        float f6;
        ViewPropertyAnimator viewpropertyanimator;
        long l1;
        if (motionevent.getRawY() > o)
        {
            w.setUpperRegionHighlight(false);
            j1 = 1;
        } else
        {
            w.setUpperRegionHighlight(true);
            j1 = 2;
        }
        l1 = System.currentTimeMillis() - I;
        if (u != j1)
        {
            if (l1 < (long)k)
            {
                I = System.currentTimeMillis();
            }
            u = j1;
        }
        if (u != t)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0 && (l1 > (long)k || d.c))
        {
            a.b(u);
            t = u;
            I = System.currentTimeMillis();
        }
        if (q != null) goto _L7; else goto _L6
_L6:
        q = MotionEvent.obtain(p);
_L9:
        j1 = 0;
_L10:
        if (j1 != 0)
        {
            p();
            k();
        }
        motionevent = d;
        Object obj = p;
        if (!((LockToStreamView) (motionevent)).d)
        {
            boolean flag;
            if (((LockToStreamView) (motionevent)).b == null && motionevent.getWidth() != 0 && motionevent.getHeight() != 0)
            {
                motionevent.b = new Paint();
                ((LockToStreamView) (motionevent)).b.setStyle(android.graphics.Paint.Style.FILL);
                ((LockToStreamView) (motionevent)).b.setAntiAlias(true);
                int k1 = motionevent.getWidth() - (int)(2.0F * ((LockToStreamView) (motionevent)).a.getStrokeWidth());
                Bitmap bitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(motionevent.getResources(), Vl.c.here_lock_button), k1, k1, true);
                ((LockToStreamView) (motionevent)).b.setShader(new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
                motionevent.h = (float)motionevent.getResources().getDimensionPixelSize(Vl.b.here_lock_icon_size_max) / (float)motionevent.getWidth();
                motionevent.g = ((LockToStreamView) (motionevent)).h * 0.5F;
                motionevent.invalidate();
            }
            if (!((LockToStreamView) (motionevent)).c && !((LockToStreamView) (motionevent)).d)
            {
                float f1 = motionevent.c();
                float f2 = ((MotionEvent) (obj)).getRawY();
                float f3 = motionevent.c() / 2;
                f4 = motionevent.getResources().getDimension(Vl.b.here_lock_to_stream_visibility_margin);
                f6 = motionevent.getResources().getDimension(Vl.b.here_lock_icon_show_margin_bottom);
                boolean flag1;
                boolean flag2;
                if (Math.abs(f2 - f3) < f4)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (motionevent.getVisibility() == 4)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (((LockToStreamView) (motionevent)).e || Math.abs(f2 - (float)motionevent.c()) > f6)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                motionevent.e = flag2;
                if (((LockToStreamView) (motionevent)).e && flag != flag1)
                {
                    float f5 = motionevent.getResources().getDimension(Vl.b.here_lock_to_stream_y_location_off_screen);
                    if (flag)
                    {
                        if (f2 < f3)
                        {
                            f1 = -f5;
                        } else
                        {
                            f1 = f5 + f1;
                        }
                    } else
                    {
                        if (f2 < f3)
                        {
                            motionevent.setY(-f5);
                        } else
                        {
                            motionevent.setY(f5 + f1);
                        }
                        motionevent.setVisibility(0);
                        if (((LockToStreamView) (motionevent)).b != null)
                        {
                            ((LockToStreamView) (motionevent)).b.setAlpha(255);
                        }
                        f1 = motionevent.a(f2, f3);
                    }
                    viewpropertyanimator = motionevent.animate();
                    viewpropertyanimator.translationY(f1);
                    viewpropertyanimator.setListener(new LockToStreamView._cls1(motionevent, flag));
                    viewpropertyanimator.setDuration(150L);
                    motionevent.d = true;
                }
            }
            motionevent.a(((MotionEvent) (obj)), false);
            flag = motionevent.a(((MotionEvent) (obj)));
            if (flag != ((LockToStreamView) (motionevent)).c)
            {
                motionevent.c = flag;
                if (flag)
                {
                    f1 = ((LockToStreamView) (motionevent)).f.getWidth();
                    f2 = ((LockToStreamView) (motionevent)).f.getScaleX();
                    f3 = (float)(motionevent.getResources().getDimensionPixelSize(Vl.b.here_lock_to_stream_ring_width) * 2) + f1 * f2;
                    j1 = motionevent.getResources().getDimensionPixelOffset(Vl.b.here_lock_icon_locked_y_offset);
                    f5 = motionevent.c();
                    f6 = f5 / 2.0F;
                    f2 = (float)j1 + f3 / 2.0F;
                    f1 = f2;
                    if (((MotionEvent) (obj)).getRawY() > f6)
                    {
                        f1 = f5 - f2;
                    }
                    obj = ((LockToStreamView) (motionevent)).f.animate();
                    ((ViewPropertyAnimator) (obj)).translationX((motionevent.getX() + (float)(motionevent.getWidth() / 2)) - (float)(((LockToStreamView) (motionevent)).f.getWidth() / 2));
                    ((ViewPropertyAnimator) (obj)).translationY(f1 - (float)(((LockToStreamView) (motionevent)).f.getHeight() / 2));
                    ((ViewPropertyAnimator) (obj)).setDuration(300L);
                    obj = motionevent.animate();
                    f2 = f3 / (float)motionevent.getHeight();
                    ((ViewPropertyAnimator) (obj)).scaleX(f3 / (float)motionevent.getWidth());
                    ((ViewPropertyAnimator) (obj)).scaleY(f2);
                    ((ViewPropertyAnimator) (obj)).translationY(f1 - f3 / 2.0F);
                    ((ViewPropertyAnimator) (obj)).setListener(new LockToStreamView._cls2(motionevent));
                    ((ViewPropertyAnimator) (obj)).setDuration(300L);
                    motionevent.a(255, 0);
                    motionevent.d = true;
                    motionevent.invalidate();
                    obj = ((LockToStreamView) (motionevent)).i;
                    if (motionevent.getY() > (float)(motionevent.c() / 2))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    ((Vt) (obj)).c(flag);
                } else
                {
                    motionevent.a(0, 255);
                    motionevent.a(((MotionEvent) (obj)), true);
                    motionevent.invalidate();
                }
            }
            motionevent.bringToFront();
        }
        invalidate();
        return;
_L7:
        f1 = q.getRawX() - p.getRawX();
        f2 = q.getRawY() - p.getRawY();
        if ((float)Math.sqrt(f1 * f1 + f2 * f2) <= z) goto _L9; else goto _L8
_L8:
        q = MotionEvent.obtain(p);
        j1 = 1;
          goto _L10
    }

    public final void a(String s1)
    {
        D = false;
        f.c(s1);
        setCanStreamVideo(false, s1);
        a.A();
    }

    public final void a(boolean flag)
    {
    }

    public final void a(boolean flag, String s1)
    {
        m();
        if (e == null)
        {
            return;
        } else
        {
            post(new Runnable(flag) {

                private boolean a;
                private HoldToStreamView b;

                public final void run()
                {
                    b.a.i(a);
                    b.a.v();
                    b.a.d(a);
                    HoldToStreamView.d(b);
                    if (a)
                    {
                        HoldToStreamView.e(b);
                        b.a.u();
                        b.a.c(true);
                    } else
                    {
                        HoldToStreamView.f(b);
                    }
                    HoldToStreamView.g(b);
                    HoldToStreamView.h(b).a(a);
                    b.invalidate();
                }

            
            {
                b = HoldToStreamView.this;
                a = flag;
                super();
            }
            });
            return;
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (flag && !flag1)
        {
            n = SystemClock.elapsedRealtime();
            return;
        }
        if (flag && flag1)
        {
            N = null;
        }
        G = true;
    }

    public final void a(byte abyte0[])
    {
        if (g.c == null)
        {
            throw new IllegalStateException("Must call setCameraInfo() first.");
        }
        if (g.a == 0 || g.b == 0)
        {
            throw new IllegalStateException("Must call setCameraPreviewSize() first.");
        }
        break MISSING_BLOCK_LABEL_49;
        if (abyte0 != null && (l || d != null && d.c))
        {
            if (H)
            {
                H = false;
                post(new Runnable() {

                    private HoldToStreamView a;

                    public final void run()
                    {
                        HoldToStreamView.i(a);
                    }

            
            {
                a = HoldToStreamView.this;
                super();
            }
                });
            }
            m.a(abyte0, g);
            h.a(g.a, g.b, c.getMeasuredWidth(), c.getMeasuredHeight(), g.c);
            if (N != null)
            {
                h.a(N);
            } else
            {
                h.a(abyte0);
            }
            if (M)
            {
                N = (byte[])abyte0.clone();
                a.g(true);
                M = false;
                return;
            }
        }
        return;
    }

    public final void b()
    {
        if (!O)
        {
            return;
        } else
        {
            m.a(q(), m.c(), Q);
            j();
            o();
            a.d(false);
            return;
        }
    }

    public final void b(String s1)
    {
        D = false;
        f.c(s1);
        setCanStreamVideo(false, s1);
        a.b("onDisconnected");
    }

    public final void b(boolean flag)
    {
        if (!flag)
        {
            setCanStreamVideo(false, "REMOTE_PEER_LEFT");
        } else
        {
            f.d("HERE_ADL_REMOTE_PEER_JOINED");
        }
        a.b("onUserEvent");
    }

    public final void c()
    {
        m();
        M = true;
        u = 1;
        t = 1;
        a.b(u);
        I = System.currentTimeMillis();
        if (l)
        {
            return;
        }
        l = true;
        h.a(1.0F);
        c.setScaleX(0.0F);
        c.setScaleY(0.0F);
        int i1 = getResources().getDimensionPixelSize(Vl.b.here_lock_to_stream_ring_width);
        float f1 = c.getWidth();
        f1 = (float)(i1 * 2) + f1 * 0.4F;
        updateViewLayout(d, new android.widget.FrameLayout.LayoutParams((int)f1, (int)f1));
        K.a(getMeasuredWidth());
        L.a(getMeasuredHeight());
        m.a(r());
        if (r != null)
        {
            r.cancel();
        }
        b = true;
        if (p != null)
        {
            c.setX(p.getRawX() - (float)(c.getWidth() / 2));
            c.setY(p.getRawY() - (float)(c.getHeight() / 2));
            i();
        }
        c.setVisibility(0);
        d.bringToFront();
        o();
        a.u();
        a.e(true);
        n();
        ConnectingRippleView connectingrippleview = v;
        boolean flag;
        if (l && !C)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        connectingrippleview.setRipplesEnabled(flag);
        F = 1.0F;
        E = true;
        o = a.B();
        if (Camera.getNumberOfCameras() > 1)
        {
            w.setHeightThreshold((int)o);
            w.setVisibility(0);
            w.bringToFront();
            flag = a.C();
            QuickSnapOnboardingOverlay quicksnaponboardingoverlay = w;
            QuickSnapOnboardingOverlay.a a1;
            if (flag)
            {
                a1 = QuickSnapOnboardingOverlay.a.c;
            } else
            {
                a1 = QuickSnapOnboardingOverlay.a.a;
            }
            quicksnaponboardingoverlay.setOverlayMode(a1);
        }
        a.h(false);
        invalidate();
        f.a();
    }

    public final void c(boolean flag)
    {
    }

    public final void d(boolean flag)
    {
        C = flag;
        ConnectingRippleView connectingrippleview = v;
        boolean flag1;
        if (l && !C)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        connectingrippleview.setRipplesEnabled(flag1);
        if (flag)
        {
            f.b();
        }
    }

    public final boolean d()
    {
        return A;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        boolean flag = false;
        float f3 = 0.0F;
        if (p != null && c != null && b)
        {
            float f4 = (float)(SystemClock.elapsedRealtime() - n) / 400F - 1.0F;
            float f1;
            if (!d.c && -1F < f4 && f4 < 1.0F)
            {
                f1 = (float)Math.abs(Math.sin(((double)f4 * 3.1415926535897931D) / 2D));
            } else
            {
                f1 = 1.0F;
            }
            if (f4 > 0.0F)
            {
                G = false;
            }
            f4 = F;
            if (E)
            {
                f3 = 1.0F;
            }
            F = VC.a(f4, f3, 0.04F);
            if (F < 0.01F)
            {
                c("CONNECTION_LOST");
            }
            if (e != null && e.getVisibility() == 0)
            {
                f3 = F * VC.a(c.getScaleX(), 0.3F, 0.08F);
            } else
            {
                f3 = F * VC.a(c.getScaleX(), 0.4F, 0.08F);
            }
            if (c.getScaleX() != f3)
            {
                flag = true;
            }
            c.setScaleX(f3);
            c.setScaleY(f1 * f3);
            if (flag)
            {
                d.b();
            }
            f1 = ((float)c.getWidth() * c.getScaleX()) / 2.0F;
            v.setRippleScale(f1);
            h.a(1.0F);
            K.b(p.getRawX());
            if (d.c)
            {
                i();
            } else
            {
                float f2 = c.getWidth();
                L.b(p.getRawY() - (float)(c.getHeight() / 2) - f3 * (0.9F * f2));
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final boolean e()
    {
        return b;
    }

    public final boolean f()
    {
        return m.g();
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        if (l || d.c)
        {
            LockToStreamView locktostreamview = d;
            if (!locktostreamview.c && !locktostreamview.d && locktostreamview.getVisibility() == 0)
            {
                locktostreamview.setY(locktostreamview.a(locktostreamview.getY(), locktostreamview.c() / 2));
            }
            d.b();
            h.a();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        if (d != null) goto _L2; else goto _L1
_L1:
        flag = super.onTouchEvent(motionevent);
_L8:
        return flag;
_L2:
        int i1;
        if (d.c)
        {
            k();
            p();
        }
        i1 = motionevent.getActionMasked();
        if ((!d.c || !d.a(motionevent) || i1 != 0) && !J) goto _L4; else goto _L3
_L3:
        i1;
        JVM INSTR lookupswitch 2: default 100
    //                   0: 138
    //                   5: 138;
           goto _L5 _L6 _L6
_L5:
        J = true;
        l = true;
        a(motionevent);
        if (i1 == 3 || i1 == 1 || i1 == 6)
        {
            J = false;
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        a.h(false);
        if (true) goto _L5; else goto _L4
_L4:
        s.onTouchEvent(motionevent);
        if (d.c)
        {
            ((View)getParent()).onTouchEvent(motionevent);
        }
        return d.c;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void setCanStreamVideo(boolean flag, String s1)
    {
        boolean flag1;
        if (flag && D)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        E = flag1;
        if (!flag)
        {
            f.b(s1);
            j();
        }
        f.b(flag);
    }

    public void setDeferDisconnectTimeoutMs(int i1)
    {
        Q = i1;
    }

}
