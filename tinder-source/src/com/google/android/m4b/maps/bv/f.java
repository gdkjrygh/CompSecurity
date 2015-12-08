// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.view.x;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Toast;
import com.google.android.m4b.maps.aq.b;
import com.google.android.m4b.maps.aq.e;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.bw.g;
import com.google.android.m4b.maps.cg.ab;
import com.google.android.m4b.maps.cg.ap;
import com.google.android.m4b.maps.cg.ar;
import com.google.android.m4b.maps.cg.av;
import com.google.android.m4b.maps.cg.ay;
import com.google.android.m4b.maps.cg.bj;
import com.google.android.m4b.maps.cg.bt;
import com.google.android.m4b.maps.df.c;
import com.google.android.m4b.maps.df.d;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.model.StreetViewPanoramaLocation;
import com.google.android.m4b.maps.model.StreetViewPanoramaOrientation;
import com.google.android.m4b.maps.y.j;
import java.io.File;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            aj, d, ac, e, 
//            r, ae, s, ah, 
//            ab, t, q, l, 
//            v, y, ai, b, 
//            ad, af, o, h

public final class f extends SurfaceView
    implements android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnGestureListener, ae.b, ah.g, aj, av
{
    final class a
        implements Runnable
    {

        private final boolean a;
        private float b;
        private final boolean c;
        private float d;
        private f e;

        final void a()
        {
            synchronized (f.a(e))
            {
                b = 0.0F;
                d = 0.0F;
                f.a(e).notify();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void run()
        {
            Object obj = f.a(e);
            obj;
            JVM INSTR monitorenter ;
_L7:
            float f1;
            float f2;
            f f3;
            Exception exception;
            try
            {
                f.a(e).wait(30L);
            }
            catch (InterruptedException interruptedexception) { }
            if (com.google.android.m4b.maps.bv.f.b(e) == null || b <= 0.0F && d <= 0.0F) goto _L2; else goto _L1
_L1:
            f3 = e;
            if (!a) goto _L4; else goto _L3
_L3:
            f1 = b;
_L8:
            if (!c) goto _L6; else goto _L5
_L5:
            f2 = d;
_L9:
            f3.a(10F * f1, f2);
            b = Math.max(b * 0.87F - 0.005F, 0.0F);
            d = Math.max(d * 0.87F - 0.005F, 0.0F);
              goto _L7
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
_L4:
            f1 = -b;
              goto _L8
_L6:
            f2 = -d;
              goto _L9
_L2:
            obj;
            JVM INSTR monitorexit ;
              goto _L8
        }

        a(float f2, float f3)
        {
            boolean flag1 = true;
            e = f.this;
            super();
            boolean flag;
            if (f2 > 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
            if (!a)
            {
                f2 = -f2;
            }
            b = f2;
            if (f3 > 0.0F)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            c = flag;
            if (!c)
            {
                f3 = -f3;
            }
            d = f3;
        }
    }

    public static final class b
    {

        public boolean a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;

        public b()
        {
        }
    }


    private r A;
    private b B;
    private int C;
    private Integer D;
    private int E;
    private float F;
    private float G;
    private float H;
    private String I;
    private Toast J;
    private boolean K;
    private boolean L;
    private boolean M;
    private final Handler N = new Handler();
    private Runnable O;
    private final Handler P = new Handler() {

        private f a;

        public final void handleMessage(Message message)
        {
            boolean flag = false;
            message.what;
            JVM INSTR tableswitch 0 3: default 36
        //                       0 70
        //                       1 99
        //                       2 105
        //                       3 286;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            int j1 = message.what;
            throw new IllegalArgumentException((new StringBuilder(30)).append("Unknown message id ").append(j1).toString());
_L2:
            f f2 = a;
            if (message.arg1 != 0)
            {
                flag = true;
            }
            f.a(f2, flag, (q)message.obj);
_L7:
            return;
_L3:
            int k1 = message.arg1;
            return;
_L4:
            f f3 = a;
            if (message.arg1 != -2) goto _L7; else goto _L6
_L6:
            if (!ab.a(f3.getContext())) goto _L9; else goto _L8
_L8:
            if (f3.a != null && f3.a.j != null) goto _L11; else goto _L10
_L10:
            f3.setContentDescription(String.valueOf(f3.i.getString(com.google.android.m4b.maps.h.h.maps_YOUR_LOCATION)).concat(": invalid point"));
_L9:
            if (f3.d == null) goto _L13; else goto _L12
_L12:
            if (f3.a == null) goto _L15; else goto _L14
_L14:
            message = f3.a.l;
_L16:
            f3.d.a(message, f3.d());
_L13:
            if (f3.c != null)
            {
                f3.c.a(f3.d());
            }
            f3.g = false;
            return;
_L11:
            try
            {
                message = new ap(f3.a.j, 21F);
                message.a = f3. new com.google.android.m4b.maps.cg.ap.a() {

                    private f a;

                    public final void a(ap ap1)
                    {
                        if (ap1.i() > 0)
                        {
                            Object obj = ap1.h();
                            ap1 = String.valueOf(com.google.android.m4b.maps.bv.f.c(a).getString(com.google.android.m4b.maps.h.h.maps_YOUR_LOCATION));
                            obj = ((com.google.android.m4b.maps.cg.ap.b) (obj)).a();
                            ap1 = (new StringBuilder(String.valueOf(ap1).length() + 2 + String.valueOf(obj).length())).append(ap1).append(": ").append(((String) (obj))).toString();
                            a.setContentDescription(ap1);
                        }
                    }

            
            {
                a = f.this;
                super();
            }
                };
                f3.h.c(message);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                throw new RuntimeRemoteException(message);
            }
              goto _L9
_L15:
            message = "";
              goto _L16
_L5:
            message = a;
            if (((f) (message)).e == null || !((f) (message)).f) goto _L18; else goto _L17
_L17:
            ((f) (message)).e.a(com.google.android.m4b.maps.aq.b.a(((f) (message)).b));
_L18:
            message.f = true;
            return;
            message;
            throw new RuntimeRemoteException(message);
              goto _L9
        }

            
            {
                a = f.this;
                super();
            }
    };
    private final Object Q = new Object();
    private a R;
    private float S;
    private float T;
    private float U;
    private float V;
    private boolean W;
    q a;
    ay b;
    c c;
    com.google.android.m4b.maps.cg.at.a d;
    com.google.android.m4b.maps.df.b e;
    boolean f;
    boolean g;
    final m h;
    final Resources i;
    private float j;
    private final h k = null;
    private ah l;
    private ae m;
    private String n;
    private y o;
    private t p;
    private boolean q;
    private ac r;
    private ay s;
    private LatLng t;
    private float u;
    private float v;
    private com.google.android.m4b.maps.bv.e w;
    private d x;
    private com.google.android.m4b.maps.df.e y;
    private int z;

    private f(Context context, Resources resources, m m1)
    {
        super(context);
        f = true;
        z = 0;
        g = false;
        K = true;
        L = true;
        M = true;
        R = null;
        h = m1;
        i = resources;
        resources = i.getDisplayMetrics();
        j = ((DisplayMetrics) (resources)).density;
        float f1 = j;
        int i1 = ((DisplayMetrics) (resources)).densityDpi;
        com.google.android.m4b.maps.bv.d.a((new StringBuilder(51)).append("SV ScreenDensity: ").append(f1).append(", DPI: ").append(i1).toString());
        b = new ay();
        r = new ac();
        B = new b();
        w = new com.google.android.m4b.maps.bv.e(context, this, this, this);
        A = new r();
    }

    public static f a(bj bj1)
    {
        Context context = bj1.a;
        bt bt1 = bj1.d;
        Runnable runnable = new Runnable() {

            public final void run()
            {
                com.google.android.m4b.maps.ay.ab.a("Failed to load map. Error contacting Google servers. This is probably an authentication issue (but could be due to network errors).");
            }

        };
        com.google.android.m4b.maps.aq.e.a(bj1, new g(context, bt1.a(), runnable, bj1.i, bt1));
        bj1 = new f(context, bj1.b, bt1.a());
        bj1.m = new ae(new s(context.getCacheDir().getAbsolutePath()), bt1.a());
        bj1.W = false;
        bj1.setFocusable(true);
        bj1.setFocusableInTouchMode(true);
        bj1.setClickable(true);
        if (((f) (bj1)).l != null)
        {
            throw new IllegalArgumentException("mRenderer already exists");
        } else
        {
            bj1.l = new ah(((f) (bj1)).m, ((f) (bj1)).h);
            ((f) (bj1)).l.a(bj1.getContext(), ((f) (bj1)).i, bj1.getHolder(), bj1, bj1);
            ((f) (bj1)).l.b = null;
            r r1 = ((f) (bj1)).A;
            r1.d = ((f) (bj1)).l;
            r1.a();
            android.support.v4.view.x.a(bj1, ((f) (bj1)).l.a);
            bj1.g = true;
            return bj1;
        }
    }

    static Object a(f f1)
    {
        return f1.Q;
    }

    private void a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        b(f1, 0.0F);
        l();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(MotionEvent motionevent)
    {
        t t1;
label0:
        {
            int i1 = A.a(motionevent.getX(), motionevent.getY());
            if (i1 != -1 && i1 != -2)
            {
                z = 0;
                t1 = l.a.b(i1);
                if (t1 != null)
                {
                    if (t1.c != null && t1.c.length() != 0)
                    {
                        break label0;
                    }
                    motionevent = i.getString(com.google.android.m4b.maps.h.h.maps_panorama_disabled);
                    Toast.makeText(getContext(), motionevent, 0).show();
                }
            }
            return;
        }
        q = false;
        n = null;
        o = null;
        p = t1;
        motionevent = String.valueOf(p.c);
        if (motionevent.length() != 0)
        {
            motionevent = "SV step to panorama ".concat(motionevent);
        } else
        {
            motionevent = new String("SV step to panorama ");
        }
        com.google.android.m4b.maps.bv.d.b(motionevent);
        I = null;
        l.a(14, -1, -1);
        a.z.a();
        motionevent = a.z.a(t1.c);
        if (motionevent != null)
        {
            motionevent = new ah.i(((l.b) (motionevent)).a, ((l.b) (motionevent)).b, b);
            motionevent.a(a.z);
            l.a(18, motionevent);
        } else
        {
            g = true;
        }
        a(t1.c, null, null, b);
    }

    static void a(f f1, boolean flag, q q1)
    {
        if (flag)
        {
            com.google.android.m4b.maps.bv.d.a("SV panorama config request was interrupted");
        } else
        if (q1 == null)
        {
            String s1 = String.valueOf(q1);
            com.google.android.m4b.maps.bv.d.a((new StringBuilder(String.valueOf(s1).length() + 21)).append("SV received panorama ").append(s1).toString());
        }
        if (!flag || f1.g)
        {
            boolean flag1;
            if (q1 == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            f1.q = flag1;
            f1.a(q1);
        }
        if (!flag)
        {
            f1.invalidate();
        }
    }

    private void a(q q1)
    {
        if (q1 != null && g)
        {
            Object obj = q1.i;
            if (a != null && a.z != null && !a.i.equals(obj))
            {
                g = false;
                a.z.a();
                obj = a.z.a(((String) (obj)));
                if (obj != null && l != null)
                {
                    obj = new ah.i(((l.b) (obj)).a, ((l.b) (obj)).b, m());
                    ((ah.i) (obj)).a(a.z);
                    l.a(18, obj);
                }
            }
        }
        a = q1;
        if (a != null && a.z != null)
        {
            a.z.a();
        }
        if (l != null)
        {
            l.a(3, new ah.h(a));
        }
        if (a != null)
        {
            r.a.a(q1.i, q1);
            n();
            p = null;
            n = null;
            o = null;
        }
    }

    static q b(f f1)
    {
        return f1.a;
    }

    private void b(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        e(f1);
        l();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void b(float f1, float f2)
    {
        if (!L)
        {
            return;
        } else
        {
            b.a(ar.b(b.a + b.c() * f1));
            e(f2);
            return;
        }
    }

    private final void b(int i1, int j1)
    {
        P.sendMessage(Message.obtain(P, i1, j1, 0));
    }

    private void b(String s1, LatLng latlng, Integer integer, ay ay1)
    {
        q = false;
        p = null;
        n = s1;
        if (latlng != null)
        {
            s1 = new y(latlng.b, latlng.c);
        } else
        {
            s1 = null;
        }
        o = s1;
        D = integer;
        t = null;
        s = ay1;
        invalidate();
    }

    static Resources c(f f1)
    {
        return f1.i;
    }

    private void c(float f1)
    {
        d(f1);
        l();
    }

    static Handler d(f f1)
    {
        return f1.N;
    }

    private void d(float f1)
    {
        float f2 = 0.0F;
        if (K)
        {
            ay ay1 = b;
            int i1 = E;
            f1 = ar.a(ay1.c + f1, 0.0F, i1 - 1);
            if (f1 < 0.05F)
            {
                f1 = f2;
            }
            ay1.c = f1;
        }
    }

    static Runnable e(f f1)
    {
        return f1.O;
    }

    private void e(float f1)
    {
        if (!L)
        {
            return;
        }
        float f6 = b.c() * 0.125F;
        float f4 = f6 + (0.5F - a.x * 0.005555556F);
        float f5 = 0.5F - a.w * 0.005555556F - f6;
        float f3 = f5;
        float f2 = f4;
        if (f4 > f5)
        {
            f3 = (f5 + f4) * 0.5F;
            f2 = f3;
        }
        f4 = b.b;
        b.b(ar.a(f6 * f1 + f4, f2, f3));
    }

    static Runnable f(f f1)
    {
        f1.O = null;
        return null;
    }

    private void l()
    {
        if (l != null)
        {
            l.a(5, new ay(b));
            P.sendMessage(Message.obtain(P, 3));
        }
    }

    private ay m()
    {
        if (b == null)
        {
            return s;
        } else
        {
            return b;
        }
    }

    private void n()
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        b = s;
        s = null;
_L6:
        float f1 = getWidth();
        float f4 = getHeight();
        F = f1 / f4;
        G = ah.a(F);
        H = com.google.android.m4b.maps.bv.ah.b(F);
        f1 = ar.e(((float)a.f / f4) * G * 0.005555556F);
        E = Math.min(a.k, Math.max(0, (int)f1) + 2);
        if (l != null)
        {
            l.b(4, E);
        }
        f = false;
        b(0.0F, 0.0F);
        c(0.0F);
_L4:
        return;
_L2:
        if (g) goto _L4; else goto _L3
_L3:
        float f3;
        float f6;
label0:
        {
            if (p == null)
            {
                break; /* Loop/switch isn't completed */
            }
            float f5 = (1.0F / 0.0F);
            float f8 = p.a;
            if (a != null)
            {
                t at[] = a.y;
                if (at != null)
                {
                    int j1 = at.length;
                    int i1 = 0;
                    float f2 = 0.0F;
                    do
                    {
                        f6 = f2;
                        if (i1 >= j1)
                        {
                            break;
                        }
                        f6 = (at[i1].a - f8) + 180F;
                        f6 = f6 - (float)Math.floor(0.002777778F * f6) * 360F - 180F;
                        float f7 = Math.abs(f6);
                        if (f7 <= 25F && f7 <= f5)
                        {
                            f5 = f7;
                            f2 = f6;
                        }
                        i1++;
                    } while (true);
                    break label0;
                }
            }
            f6 = 0.0F;
        }
        f3 = b.a + f6;
_L7:
        b = new ay(f3, 0.5F, b.c);
        if (true) goto _L6; else goto _L5
_L5:
        if (a != null)
        {
            f3 = a.t;
        } else
        {
            f3 = 0.0F;
        }
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    private CharSequence o()
    {
        Object obj = null;
        String s1;
        if (a == null)
        {
            s1 = "";
        } else
        {
            s1 = obj;
            if (!a.b)
            {
                s1 = obj;
                if (!a.a())
                {
                    s1 = a.n;
                    String s2 = a.m;
                    if (s1 == null)
                    {
                        s1 = s2;
                        if (s2 == null)
                        {
                            return "";
                        }
                    } else
                    if (s2 == null)
                    {
                        return s1;
                    } else
                    {
                        return String.format(i.getString(com.google.android.m4b.maps.h.h.maps_street_range_name_format), new Object[] {
                            s1, s2
                        });
                    }
                }
            }
        }
        return s1;
    }

    private boolean p()
    {
        return a != null && l != null;
    }

    public final Point a(StreetViewPanoramaOrientation streetviewpanoramaorientation)
    {
        if (a != null)
        {
            if ((streetviewpanoramaorientation = l.b(ar.m(streetviewpanoramaorientation.c), ar.m(streetviewpanoramaorientation.b + 90F))) != null)
            {
                return new Point((int)streetviewpanoramaorientation[0], (int)streetviewpanoramaorientation[1]);
            }
        }
        return null;
    }

    public final StreetViewPanoramaOrientation a(int i1, int j1)
    {
        float af1[];
        if (a != null)
        {
            if ((af1 = l.a(i1, j1)) != null)
            {
                return new StreetViewPanoramaOrientation(ar.n(af1[1]) - 90F, ar.n(af1[0]));
            }
        }
        return null;
    }

    public final void a()
    {
        if (l != null)
        {
            l.a(8);
        }
    }

    public final void a(float f1, float f2)
    {
        this;
        JVM INSTR monitorenter ;
        b(f1, f2);
        l();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i1)
    {
        b(1, (int)(2000D + 0.80000000000000004D * (double)i1));
    }

    public final void a(com.google.android.m4b.maps.cg.at.a a1)
    {
        d = a1;
    }

    public final void a(ay ay1)
    {
        if (b != null)
        {
            boolean flag;
            if (!b.equals(ay1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = flag;
        }
        b = ay1;
        l();
    }

    public final void a(com.google.android.m4b.maps.df.b b1)
    {
        e = b1;
    }

    public final void a(c c1)
    {
        c = c1;
    }

    public final void a(d d1)
    {
        x = d1;
    }

    public final void a(com.google.android.m4b.maps.df.e e1)
    {
        y = e1;
    }

    public final void a(LatLng latlng)
    {
        g = true;
        b(null, latlng, null, m());
    }

    public final void a(LatLng latlng, int i1)
    {
        g = true;
        b(null, latlng, Integer.valueOf(i1), m());
    }

    public final void a(StreetViewPanoramaCamera streetviewpanoramacamera, long l1)
    {
        streetviewpanoramacamera = ay.a(streetviewpanoramacamera);
        if (O != null)
        {
            N.removeCallbacks(O);
        }
        streetviewpanoramacamera.c = ar.a(((ay) (streetviewpanoramacamera)).c, 0.0F, E);
        if (l1 == 0L)
        {
            a(((ay) (streetviewpanoramacamera)));
            return;
        } else
        {
            ay ay1 = m();
            float f1 = ar.a(((ay) (streetviewpanoramacamera)).a, ay1.a);
            float f2 = ((ay) (streetviewpanoramacamera)).b;
            float f3 = ay1.b;
            float f4 = ((ay) (streetviewpanoramacamera)).c;
            float f5 = ay1.c;
            O = new Runnable(SystemClock.uptimeMillis(), new AccelerateDecelerateInterpolator(), l1, ay1, f2 - f3, f1, f4 - f5) {

                private long a;
                private Interpolator b;
                private long c;
                private ay d;
                private float e;
                private float f;
                private float g;
                private f h;

                public final void run()
                {
                    long l2 = SystemClock.uptimeMillis() - a;
                    float f6 = b.getInterpolation((float)l2 / (float)c);
                    float f7 = ar.d(d.b + e * f6);
                    float f8 = ar.b(d.a + f * f6);
                    float f9 = d.c;
                    ay ay2 = new ay(f8, f7, f6 * g + f9);
                    h.a(ay2);
                    if (l2 < c)
                    {
                        com.google.android.m4b.maps.bv.f.d(h).postDelayed(this, 16L);
                        return;
                    } else
                    {
                        com.google.android.m4b.maps.bv.f.d(h).removeCallbacks(com.google.android.m4b.maps.bv.f.e(h));
                        f.f(h);
                        return;
                    }
                }

            
            {
                h = f.this;
                a = l1;
                b = interpolator;
                c = l2;
                d = ay1;
                e = f2;
                f = f3;
                g = f4;
                super();
            }
            };
            N.post(O);
            return;
        }
    }

    public final void a(StreetViewPanoramaCamera streetviewpanoramacamera, String s1)
    {
        if (!s1.equals(""))
        {
            a(s1, null, null, ay.a(streetviewpanoramacamera));
            return;
        } else
        {
            a(ay.a(streetviewpanoramacamera));
            return;
        }
    }

    public final void a(String s1)
    {
        g = true;
        b(s1, null, null, m());
    }

    public final void a(String s1, LatLng latlng, Integer integer, ay ay1)
    {
        b(s1, latlng, integer, ay1);
    }

    public final void a(boolean flag)
    {
        K = flag;
    }

    public final void a(boolean flag, q q1)
    {
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        P.sendMessage(Message.obtain(P, 0, i1, 0, q1));
        if (q1 == null && g)
        {
            b(2, -2);
        }
    }

    public final boolean a(ai ai1)
    {
        if (K)
        {
            float af1[] = l.a(ai1.a.b, ai1.a.c);
            if (af1 == null)
            {
                return false;
            }
            float f1 = af1[0];
            float f2 = af1[1];
            float f3 = ar.m(b.a);
            float f4 = b.b / 2.0F;
            float f5 = b.c();
            U = f1;
            V = f2;
            S = ar.g(ar.b(f3, f1)) / ar.g(ar.m(H / 2.0F) * f5);
            T = ar.g(ar.b(f4, f2)) / ar.g(ar.m(G / 2.0F) * f5);
            d((ai1.a.d - ai1.a.e) / 180F / j);
            f4 = b.c();
            f1 = U;
            f2 = ar.h(S * ar.g(ar.m(H / 2.0F) * f4));
            f3 = V;
            f5 = T;
            f4 = ar.h(ar.g(f4 * ar.m(G / 2.0F)) * f5);
            b.a(ar.n(f1 + f2));
            b.b((f4 + f3) * 2.0F);
            l();
        }
        return true;
    }

    public final void b()
    {
        if (l != null)
        {
            l.a(9);
        }
    }

    public final void b(boolean flag)
    {
        L = flag;
    }

    public final void c()
    {
        b(2, -2);
    }

    public final void c(boolean flag)
    {
        M = flag;
        if (l != null)
        {
            l.a.v = flag;
            l.a(7);
        }
    }

    public final boolean canScrollHorizontally(int i1)
    {
        return L;
    }

    public final boolean canScrollVertically(int i1)
    {
        return L;
    }

    public final StreetViewPanoramaLocation d()
    {
        if (a == null)
        {
            return null;
        } else
        {
            q q1 = a;
            return new StreetViewPanoramaLocation(com.google.android.m4b.maps.aq.b.a(q1.y), q1.j, q1.i);
        }
    }

    public final void d(boolean flag)
    {
        if (l != null)
        {
            l.a.u = flag;
            l.a(7);
        }
    }

    public final boolean dispatchHoverEvent(MotionEvent motionevent)
    {
        if (l.a.a(motionevent))
        {
            return true;
        } else
        {
            return super.dispatchHoverEvent(motionevent);
        }
    }

    public final StreetViewPanoramaCamera e()
    {
        return com.google.android.m4b.maps.aq.b.a(m());
    }

    public final void f()
    {
        int i1 = 0;
_L2:
        if (i1 >= 5)
        {
            break; /* Loop/switch isn't completed */
        }
        c(-0.2F);
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            wait(30L);
        }
        catch (InterruptedException interruptedexception) { }
        this;
        JVM INSTR monitorexit ;
        i1++;
        if (true) goto _L2; else goto _L1
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
    }

    public final boolean g()
    {
        return K;
    }

    public final boolean h()
    {
        return L;
    }

    public final boolean i()
    {
        return M;
    }

    public final void invalidate()
    {
        boolean flag1 = false;
        super.invalidate();
        if (l != null)
        {
            if (J != null)
            {
                J.cancel();
                J = null;
            }
            Object obj;
            Object obj1;
            if (p != null)
            {
                obj1 = p.c;
            } else
            {
                obj1 = n;
            }
            int j1;
            if (obj1 != null || o != null)
            {
                Object obj2 = r;
                if (obj1 == null)
                {
                    obj = null;
                } else
                {
                    obj = (q)((ac) (obj2)).a.b(obj1);
                    if (obj != null)
                    {
                        boolean flag;
                        if (System.currentTimeMillis() - ((q) (obj)).C > q.a)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (flag)
                        {
                            ((ac) (obj2)).a.c(obj1);
                            obj = null;
                        }
                    }
                }
                if (obj != null)
                {
                    obj.p = true;
                    m.c = ((q) (obj)).i;
                    a(((q) (obj)));
                    int k1 = ((q) (obj)).s.size();
                    int i1 = 0;
                    while (i1 < k1) 
                    {
                        obj1 = m;
                        obj2 = l;
                        ad ad1 = (ad)((q) (obj)).s.get(i1);
                        boolean flag2;
                        if (i1 == k1 - 1)
                        {
                            flag2 = true;
                        } else
                        {
                            flag2 = false;
                        }
                        ((ae) (obj1)).a(((ae.c) (obj2)), ad1, flag2);
                        i1++;
                    }
                    o();
                } else
                {
                    obj = m;
                    Object obj3 = o;
                    Object obj4 = D;
                    boolean flag3;
                    boolean flag4;
                    if (obj1 == null)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    flag4 = g;
                    if (obj1 != null)
                    {
                        com.google.android.m4b.maps.y.j.a(this, "listener");
                        com.google.android.m4b.maps.y.j.a(obj1, "panoId");
                        obj3 = com.google.android.m4b.maps.bv.q.a(((String) (obj1)));
                        obj.c = obj1;
                        if (!((ae) (obj)).a(obj3))
                        {
                            if (((ae) (obj)).b.a(((String) (obj3)), ae.a))
                            {
                                (new Thread(new ae.a(((ae) (obj)), this, ((String) (obj3)), flag4), "Config-loader")).start();
                            } else
                            {
                                obj = (new af(new ae.d(((ae) (obj)), this, null, obj1, flag4), ((String) (obj1)), ((ae) (obj)).d)).h();
                                obj.d = flag3;
                                ((af) (obj)).i();
                            }
                        }
                    } else
                    if (obj4 != null)
                    {
                        j1 = ((Integer) (obj4)).intValue();
                        com.google.android.m4b.maps.y.j.a(this, "listener");
                        com.google.android.m4b.maps.y.j.a(obj3, "mapPoint");
                        obj4 = new Pair(obj3, Integer.valueOf(j1));
                        obj.c = obj4;
                        if (!((ae) (obj)).a(obj4))
                        {
                            obj = (new af(new ae.d(((ae) (obj)), this, null, obj4, true), ((y) (obj3)), j1, ((ae) (obj)).d)).h();
                            obj.d = flag3;
                            ((af) (obj)).i();
                        }
                    } else
                    {
                        com.google.android.m4b.maps.y.j.a(this, "listener");
                        com.google.android.m4b.maps.y.j.a(obj3, "mapPoint");
                        obj.c = obj3;
                        if (!((ae) (obj)).a(obj3))
                        {
                            obj = (new af(new ae.d(((ae) (obj)), this, null, obj3, true), ((y) (obj3)), ((ae) (obj)).d)).h();
                            obj.d = flag3;
                            ((af) (obj)).i();
                        }
                    }
                    if (obj1 != null)
                    {
                        m.a(l, ((String) (obj1)), 1, false);
                        m.a(l, ((String) (obj1)), 2, false);
                        m.a(l, ((String) (obj1)), 3, false);
                        m.a(l, ((String) (obj1)), 4, false);
                        m.a(l, ((String) (obj1)), 5, false);
                        m.a(l, ((String) (obj1)), 6, false);
                        m.a(l, ((String) (obj1)), -1, true);
                    }
                }
            } else
            if (a != null)
            {
                o();
            }
            obj = B;
            obj.a = true;
            obj.b = false;
            obj.c = q;
            obj.d = false;
            obj.e = false;
            if (a != null && p == null)
            {
                obj.b = true;
                obj.d = a.b();
                obj.e = a.b;
            }
            obj = B;
            if (((b) (obj)).c || ((b) (obj)).d || ((b) (obj)).e)
            {
                j1 = 10000;
            } else
            {
                j1 = ((flag1) ? 1 : 0);
                if (((b) (obj)).a)
                {
                    if (!((b) (obj)).b)
                    {
                        j1 = 1000;
                    } else
                    {
                        j1 = 2000;
                    }
                }
            }
            if (j1 != C)
            {
                C = j1;
            }
        }
    }

    public final boolean j()
    {
        if (l == null)
        {
            return false;
        } else
        {
            return l.a.u;
        }
    }

    public final View k()
    {
        return this;
    }

    protected final void onDetachedFromWindow()
    {
    }

    public final boolean onDoubleTap(MotionEvent motionevent)
    {
        if (a.z != null && M)
        {
            float f1 = motionevent.getX();
            float f3 = motionevent.getY();
            if (a.z != null)
            {
                motionevent = l.a(f1, f3);
                a.a(motionevent[0], motionevent[1], motionevent);
                float af1[] = new float[2];
                a.z.a();
                Object obj = a.z;
                f1 = motionevent[0];
                f3 = motionevent[1];
                ((l) (obj)).c();
                int i1 = ((l) (obj)).a(f1);
                int i2 = ((l) (obj)).b(f3);
                i2 = ((l) (obj)).c[i1 + i2 * ((l) (obj)).f] & 0xff;
                if (i2 > 0)
                {
                    l.a a1 = ((l) (obj)).a(f1, f3);
                    if (a1 != null)
                    {
                        float af2[] = new float[3];
                        ar.a(f1, f3, af2);
                        f1 = a1.a(af2[0], -af2[2], af2[1]);
                        for (int j1 = 0; j1 < 3; j1++)
                        {
                            af2[j1] = af2[j1] * f1;
                        }

                        ar.a(af2[0] - ((l) (obj)).e[i2].a, af2[1], af2[2] + ((l) (obj)).e[i2].b, af1);
                    }
                }
                obj = ((l) (obj)).d[i2];
                if (obj != null && !((String) (obj)).equals(a.i))
                {
                    q q1 = a;
                    float f4 = af1[0];
                    float f2 = af1[1];
                    af1[0] = f4 + ar.m(q1.t) + 0.5F;
                    f4 = (float)Math.cos(ar.l(af1[0]) - ar.p(q1.u));
                    af1[1] = ar.k(q1.A) * f4 + f2;
                    if (!a.z.a(motionevent[0], motionevent[1]).a())
                    {
                        b.a(ar.n(ar.c(af1[0])));
                        b.b(ar.c(af1[1]) * 2.0F);
                    }
                    l l1 = a.z;
                    f2 = motionevent[0];
                    f4 = motionevent[1];
                    l1.c();
                    int k1 = l1.a(f2);
                    int j2 = l1.b(f4);
                    k1 = l1.c[k1 + j2 * l1.f];
                    l1.c();
                    motionevent = l1.e[k1 & 0xff];
                    motionevent = new ah.i(((l.b) (motionevent)).a, ((l.b) (motionevent)).b, b);
                    motionevent.a(a.z);
                    l.a(18, motionevent);
                    a(((String) (obj)), null, null, b);
                }
            }
        }
        return true;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        return false;
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        synchronized (Q)
        {
            if (R != null)
            {
                R.a();
            }
        }
        obj = A;
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        if (((r) (obj)).b())
        {
            int i1 = ((r) (obj)).d.a((int)f1, (int)f2);
            if (i1 == -1)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            obj.a = true;
            obj.b = i1;
            ((r) (obj)).d.b(10, ((r) (obj)).b);
            obj.c = true;
        }
        return true;
        motionevent;
        obj;
        JVM INSTR monitorexit ;
        throw motionevent;
        ((r) (obj)).a();
        return true;
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (A.a)
        {
            return false;
        }
        if (L)
        {
            f1 = ar.a(u, -2.5F, 2.5F);
            f2 = ar.a(v, -2.5F, 2.5F);
            synchronized (Q)
            {
                if (R != null)
                {
                    R.a();
                }
                R = new a(f1 * 0.8F, f2 * 0.5F);
                (new Thread(R, "Flinger")).start();
            }
        }
        break MISSING_BLOCK_LABEL_119;
        motionevent1;
        motionevent;
        JVM INSTR monitorexit ;
        throw motionevent1;
        return true;
    }

    public final boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        float f1;
        boolean flag;
        boolean flag1;
        f1 = 1.0F;
        flag = true;
        flag1 = p();
        i1;
        JVM INSTR lookupswitch 10: default 104
    //                   4: 140
    //                   19: 149
    //                   20: 172
    //                   21: 197
    //                   22: 222
    //                   23: 245
    //                   35: 300
    //                   45: 333
    //                   48: 245
    //                   62: 300;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L7 _L8
_L1:
        flag = false;
        flag1 = false;
_L12:
        if (flag1)
        {
            if (flag && l != null)
            {
                l.b(11, 0);
            }
            return flag1;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
_L2:
        flag = false;
        flag1 = false;
        continue; /* Loop/switch isn't completed */
_L3:
        if (flag1 && L)
        {
            b(1.0F);
            flag1 = true;
            continue; /* Loop/switch isn't completed */
        }
          goto _L10
_L4:
        if (flag1 && L)
        {
            b(-1F);
            flag1 = true;
            continue; /* Loop/switch isn't completed */
        }
          goto _L10
_L5:
        if (flag1 && L)
        {
            a(-1F);
            flag1 = true;
            continue; /* Loop/switch isn't completed */
        }
          goto _L10
_L6:
        if (flag1 && L)
        {
            a(1.0F);
            flag1 = true;
            continue; /* Loop/switch isn't completed */
        }
          goto _L10
_L7:
        if (flag1 && K)
        {
            float f2 = b.c;
            if (f2 >= (float)(E - 1))
            {
                f1 = -f2;
            }
            c(f1);
            flag1 = true;
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
          goto _L10
_L8:
        if (flag1 && K)
        {
            c(-1F);
            b(0.0F);
            flag1 = true;
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
          goto _L10
_L9:
        if (flag1)
        {
            n();
            flag1 = true;
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
_L10:
        flag1 = true;
        flag = false;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final void onLongPress(MotionEvent motionevent)
    {
        for (int i1 = A.a(motionevent.getX(), motionevent.getY()); i1 != -1 && i1 != -2 || y == null;)
        {
            return;
        }

        try
        {
            y.a(a((int)motionevent.getX(), (int)motionevent.getY()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw new RuntimeRemoteException(motionevent);
        }
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (p())
        {
            motionevent = A;
            float f3 = motionevent1.getX();
            float f4 = motionevent1.getY();
            if (motionevent.b() && ((r) (motionevent)).a)
            {
                boolean flag;
                if (((r) (motionevent)).d.a((int)f3, (int)f4) == ((r) (motionevent)).b)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag != ((r) (motionevent)).c)
                {
                    motionevent.c = flag;
                    if (flag)
                    {
                        ((r) (motionevent)).d.b(10, ((r) (motionevent)).b);
                    } else
                    {
                        ((r) (motionevent)).d.b(10, -1);
                    }
                }
            }
            if (!((r) (motionevent)).a && L)
            {
                u = 0.02F * f1;
                v = -0.01F * f2;
                a((H * f1) / (float)getWidth(), (G * f2) / (-22.5F * (float)getHeight()));
                return true;
            }
        }
        return true;
    }

    public final void onShowPress(MotionEvent motionevent)
    {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        z = z + 1;
        if (x != null && z == 3)
        {
            try
            {
                x.a(a((int)motionevent.getX(), (int)motionevent.getY()));
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw new RuntimeRemoteException(motionevent);
            }
            z = 0;
        }
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        a(motionevent);
        return true;
    }

    protected final void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        float f1;
        float f2;
        Object obj;
        o o1;
        int i1;
        int j1;
        int l1;
        int i2;
        int k2;
        int l2;
        int i3;
        boolean flag1;
        boolean flag4;
        boolean flag5;
        z = 0;
        if (!p())
        {
            break MISSING_BLOCK_LABEL_2210;
        }
        if (O != null)
        {
            N.removeCallbacks(O);
        }
        l.b(11, 1);
        obj = w;
        o1 = ((com.google.android.m4b.maps.bv.e) (obj)).b;
        k2 = motionevent.getAction();
        if (o1.x == null)
        {
            o1.x = VelocityTracker.obtain();
        }
        o1.x.addMovement(motionevent);
        boolean flag;
        if ((k2 & 0xff) == 6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            j1 = motionevent.getActionIndex();
        } else
        {
            j1 = -1;
        }
        i2 = motionevent.getPointerCount();
        f1 = 0.0F;
        f2 = 0.0F;
        for (int k1 = 0; k1 < i2;)
        {
            float f8 = f1;
            float f3 = f2;
            if (j1 != k1)
            {
                f3 = f2 + motionevent.getX(k1);
                f8 = f1 + motionevent.getY(k1);
            }
            k1++;
            f1 = f8;
            f2 = f3;
        }

        float f4;
        float f9;
        if (flag)
        {
            i1 = i2 - 1;
        } else
        {
            i1 = i2;
        }
        f2 /= i1;
        f1 /= i1;
        j1 = 0;
        flag4 = false;
        flag5 = false;
        flag1 = false;
        i3 = ((flag1) ? 1 : 0);
        k2 & 0xff;
        JVM INSTR tableswitch 0 6: default 276
    //                   0 725
    //                   1 1368
    //                   2 1102
    //                   3 1628
    //                   4 280
    //                   5 467
    //                   6 561;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L5:
        break MISSING_BLOCK_LABEL_1628;
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        i3 = ((flag1) ? 1 : 0);
_L9:
        obj = ((com.google.android.m4b.maps.bv.e) (obj)).a;
        l2 = motionevent.getActionMasked();
        float f5;
        float f10;
        MotionEvent motionevent1;
        Object obj1;
        if (l2 == 1 || l2 == 3)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (l2 == 0 || i1 != 0)
        {
            if (((com.google.android.m4b.maps.bv.b) (obj)).k)
            {
                ((com.google.android.m4b.maps.bv.b) (obj)).a.c(((com.google.android.m4b.maps.bv.b) (obj)));
                obj.k = false;
                obj.f = 0.0F;
            }
            if (i1 != 0)
            {
                break MISSING_BLOCK_LABEL_2178;
            }
        }
        if (l2 == 6 || l2 == 5)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (l2 == 6)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (l1 != 0)
        {
            j1 = motionevent.getActionIndex();
        } else
        {
            j1 = -1;
        }
        k2 = motionevent.getPointerCount();
        f1 = 0.0F;
        f2 = 0.0F;
        for (i2 = 0; i2 < k2;)
        {
            f9 = f1;
            f4 = f2;
            if (j1 != i2)
            {
                f4 = f2 + motionevent.getX(i2);
                f9 = f1 + motionevent.getY(i2);
            }
            i2++;
            f1 = f9;
            f2 = f4;
        }

        break MISSING_BLOCK_LABEL_1742;
_L7:
        o1.s = f2;
        o1.u = f2;
        o1.t = f1;
        o1.v = f1;
        o1.i.removeMessages(1);
        o1.i.removeMessages(2);
        o1.i.removeMessages(3);
        o1.r = false;
        o1.n = false;
        o1.o = false;
        i3 = ((flag1) ? 1 : 0);
        if (o1.m)
        {
            o1.m = false;
            i3 = ((flag1) ? 1 : 0);
        }
          goto _L9
_L8:
        o1.s = f2;
        o1.u = f2;
        o1.t = f1;
        o1.v = f1;
        o1.x.computeCurrentVelocity(1000, o1.e);
        j1 = motionevent.getActionIndex();
        i1 = motionevent.getPointerId(j1);
        f1 = o1.x.getXVelocity(i1);
        f2 = o1.x.getYVelocity(i1);
        i1 = 0;
_L10:
        i3 = ((flag1) ? 1 : 0);
        if (i1 < i2)
        {
label0:
            {
                if (i1 == j1)
                {
                    break label0;
                }
                l1 = motionevent.getPointerId(i1);
                f5 = o1.x.getXVelocity(l1);
                if (o1.x.getYVelocity(l1) * f2 + f5 * f1 >= 0.0F)
                {
                    break label0;
                }
                o1.x.clear();
                i3 = ((flag1) ? 1 : 0);
            }
        }
          goto _L9
        i1++;
          goto _L10
_L2:
        i1 = j1;
        if (o1.k == null) goto _L12; else goto _L11
_L11:
        i3 = o1.i.hasMessages(3);
        if (i3 != 0)
        {
            o1.i.removeMessages(3);
        }
        if (o1.p == null || o1.q == null || i3 == 0)
        {
            break MISSING_BLOCK_LABEL_1081;
        }
        motionevent1 = o1.p;
        obj1 = o1.q;
        if (!o1.o || motionevent.getEventTime() - ((MotionEvent) (obj1)).getEventTime() > (long)o.h) goto _L14; else goto _L13
_L13:
        i1 = (int)motionevent1.getX() - (int)motionevent.getX();
        l1 = (int)motionevent1.getY() - (int)motionevent.getY();
        if (l1 * l1 + i1 * i1 >= o1.c) goto _L14; else goto _L15
_L15:
        i1 = 1;
_L16:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_1081;
        }
        o1.r = true;
        i1 = o1.k.onDoubleTap(o1.p) | false | o1.k.onDoubleTapEvent(motionevent);
_L12:
        o1.s = f2;
        o1.u = f2;
        o1.t = f1;
        o1.v = f1;
        if (o1.p != null)
        {
            o1.p.recycle();
        }
        o1.p = MotionEvent.obtain(motionevent);
        o1.n = true;
        o1.o = true;
        o1.l = true;
        o1.m = false;
        if (o1.w)
        {
            o1.i.removeMessages(2);
            o1.i.sendEmptyMessageAtTime(2, o1.p.getDownTime() + (long)com.google.android.m4b.maps.bv.o.g + (long)o.f);
        }
        o1.i.sendEmptyMessageAtTime(1, o1.p.getDownTime() + (long)com.google.android.m4b.maps.bv.o.g);
        i3 = i1 | o1.j.onDown(motionevent);
          goto _L9
_L14:
        i1 = 0;
          goto _L16
        o1.i.sendEmptyMessageDelayed(3, o.h);
        i1 = j1;
          goto _L12
_L4:
        i3 = ((flag1) ? 1 : 0);
        if (!o1.m)
        {
            f5 = o1.s - f2;
            f10 = o1.t - f1;
            if (o1.r)
            {
                i3 = o1.k.onDoubleTapEvent(motionevent) | false;
            } else
            {
label1:
                {
                    if (!o1.n)
                    {
                        break label1;
                    }
                    i1 = (int)(f2 - o1.u);
                    j1 = (int)(f1 - o1.v);
                    i1 = i1 * i1 + j1 * j1;
                    flag1 = flag4;
                    if (i1 > o1.a)
                    {
                        flag1 = o1.j.onScroll(o1.p, motionevent, f5, f10);
                        o1.s = f2;
                        o1.t = f1;
                        o1.n = false;
                        o1.i.removeMessages(3);
                        o1.i.removeMessages(1);
                        o1.i.removeMessages(2);
                    }
                    i3 = ((flag1) ? 1 : 0);
                    if (i1 > o1.b)
                    {
                        o1.o = false;
                        i3 = ((flag1) ? 1 : 0);
                    }
                }
            }
        }
          goto _L9
        if (Math.abs(f5) >= 1.0F) goto _L18; else goto _L17
_L17:
        i3 = ((flag1) ? 1 : 0);
        if (Math.abs(f10) < 1.0F) goto _L9; else goto _L18
_L18:
        i3 = o1.j.onScroll(o1.p, motionevent, f5, f10);
        o1.s = f2;
        o1.t = f1;
          goto _L9
_L3:
        o1.l = false;
        motionevent1 = MotionEvent.obtain(motionevent);
        if (o1.r)
        {
            i3 = o1.k.onDoubleTapEvent(motionevent) | false;
        } else
        if (o1.m)
        {
            o1.i.removeMessages(3);
            o1.m = false;
            i3 = ((flag5) ? 1 : 0);
        } else
        {
label2:
            {
                if (!o1.n)
                {
                    break label2;
                }
                i3 = o1.j.onSingleTapUp(motionevent);
            }
        }
_L21:
        if (o1.q != null)
        {
            o1.q.recycle();
        }
        o1.q = motionevent1;
        if (o1.x != null)
        {
            o1.x.recycle();
            o1.x = null;
        }
        o1.r = false;
        o1.i.removeMessages(1);
        o1.i.removeMessages(2);
          goto _L9
        obj1 = o1.x;
        i1 = motionevent.getPointerId(0);
        ((VelocityTracker) (obj1)).computeCurrentVelocity(1000, o1.e);
        f1 = ((VelocityTracker) (obj1)).getYVelocity(i1);
        f2 = ((VelocityTracker) (obj1)).getXVelocity(i1);
        if (Math.abs(f1) > (float)o1.d) goto _L20; else goto _L19
_L19:
        i3 = ((flag5) ? 1 : 0);
        if (Math.abs(f2) <= (float)o1.d) goto _L21; else goto _L20
_L20:
        i3 = o1.j.onFling(o1.p, motionevent, f2, f1);
          goto _L21
        o1.i.removeMessages(1);
        o1.i.removeMessages(2);
        o1.i.removeMessages(3);
        o1.x.recycle();
        o1.x = null;
        o1.r = false;
        o1.l = false;
        o1.n = false;
        o1.o = false;
        i3 = ((flag1) ? 1 : 0);
        if (o1.m)
        {
            o1.m = false;
            i3 = ((flag1) ? 1 : 0);
        }
          goto _L9
        float f12;
        float f13;
        if (l1 != 0)
        {
            l1 = k2 - 1;
        } else
        {
            l1 = k2;
        }
        f12 = f2 / (float)l1;
        f13 = f1 / (float)l1;
        f1 = 0.0F;
        f2 = 0.0F;
        for (int j2 = 0; j2 < k2;)
        {
            float f11 = f1;
            float f6 = f2;
            if (j1 != j2)
            {
                f6 = f2 + Math.abs(motionevent.getX(j2) - f12);
                f11 = f1 + Math.abs(motionevent.getY(j2) - f13);
            }
            j2++;
            f1 = f11;
            f2 = f6;
        }

        f2 /= l1;
        float f7 = f1 / (float)l1;
        f1 = f2 * 2.0F;
        f2 = f7 * 2.0F;
        f7 = (float)Math.sqrt(f1 * f1 + f2 * f2);
        boolean flag2 = ((com.google.android.m4b.maps.bv.b) (obj)).k;
        obj.b = f12;
        obj.c = f13;
        if (((com.google.android.m4b.maps.bv.b) (obj)).k && (f7 == 0.0F || i1 != 0))
        {
            ((com.google.android.m4b.maps.bv.b) (obj)).a.c(((com.google.android.m4b.maps.bv.b) (obj)));
            obj.k = false;
            obj.f = f7;
        }
        if (i1 != 0)
        {
            obj.g = f1;
            obj.i = f1;
            obj.h = f2;
            obj.j = f2;
            obj.d = f7;
            obj.e = f7;
            obj.f = f7;
        }
        if (!((com.google.android.m4b.maps.bv.b) (obj)).k && f7 != 0.0F && (flag2 || Math.abs(f7 - ((com.google.android.m4b.maps.bv.b) (obj)).f) > -1F))
        {
            obj.g = f1;
            obj.i = f1;
            obj.h = f2;
            obj.j = f2;
            obj.d = f7;
            obj.e = f7;
            obj.k = ((com.google.android.m4b.maps.bv.b) (obj)).a.b(((com.google.android.m4b.maps.bv.b) (obj)));
        }
        if (l2 == 2)
        {
            obj.g = f1;
            obj.h = f2;
            obj.d = f7;
            boolean flag3 = true;
            if (((com.google.android.m4b.maps.bv.b) (obj)).k)
            {
                flag3 = ((com.google.android.m4b.maps.bv.b) (obj)).a.a(((com.google.android.m4b.maps.bv.b) (obj)));
            }
            if (flag3)
            {
                obj.i = ((com.google.android.m4b.maps.bv.b) (obj)).g;
                obj.j = ((com.google.android.m4b.maps.bv.b) (obj)).h;
                obj.e = ((com.google.android.m4b.maps.bv.b) (obj)).d;
            }
        }
        if ((i3 | 1) != 0)
        {
            if (motionevent.getAction() == 1)
            {
                z = z + 1;
                a(motionevent);
            }
            return true;
        }
        return true;
    }
}
