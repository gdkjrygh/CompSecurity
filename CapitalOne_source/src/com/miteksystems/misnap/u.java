// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.miteksystems.misnap:
//            a, v, ae, af, 
//            ag, ah, ai, aj, 
//            ak, al, w, MiSnap, 
//            MiSnapAPI, i, x, r, 
//            y, z, ac, l, 
//            b, s, j, ab, 
//            MitekAnalyzer, ad, aa

public final class u extends RelativeLayout
    implements a
{

    static boolean a = false;
    private boolean A;
    private MiSnap B;
    private AlertDialog C;
    private int D;
    private Handler E;
    private MitekAnalyzer F;
    private final Paint G;
    private float H;
    private float I;
    private int J;
    private int K;
    private double L;
    private double M;
    private Path N;
    private List O;
    private List P;
    private ConcurrentHashMap Q;
    private boolean R;
    private boolean S;
    private Point T;
    private TextView U;
    private Bitmap V;
    private ImageView W;
    private ImageView Z;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private Runnable aE;
    private Runnable aF;
    private int aG;
    private Runnable aH;
    private Point aI;
    private ImageView aa;
    private ImageView ab;
    private ImageView ac;
    private ImageView ad;
    private b ae;
    private b af;
    private b ag;
    private b ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private float al;
    private float am;
    private float an;
    private long ao;
    private long ap;
    private Animation aq;
    private Animation ar;
    private Animation as;
    private Matrix at;
    private float au[];
    private RelativeLayout av;
    private RelativeLayout aw;
    private Button ax;
    private Button ay;
    private boolean az;
    Drawable b;
    ImageButton c;
    ImageButton d;
    ImageButton e;
    ImageButton f;
    ImageButton g;
    TextView h;
    Resources i;
    Handler j;
    s k;
    i l;
    Runnable m;
    Runnable n;
    Runnable o;
    Runnable p;
    Runnable q;
    final Runnable r;
    Runnable s;
    private float t;
    private float u;
    private boolean v;
    private Matrix w;
    private int x;
    private int y[];
    private long z;

    private u(MiSnap misnap, Handler handler, s s1, i i1)
    {
        super(misnap, null, 0);
        t = 0.0F;
        u = 0.0F;
        v = false;
        w = new Matrix();
        x = 0;
        y = (new int[] {
            R.drawable.gauge_fill_00, R.drawable.gauge_fill_05, R.drawable.gauge_fill_10, R.drawable.gauge_fill_15, R.drawable.gauge_fill_20, R.drawable.gauge_fill_25, R.drawable.gauge_fill_30, R.drawable.gauge_fill_35, R.drawable.gauge_fill_40, R.drawable.gauge_fill_45, 
            R.drawable.gauge_fill_50, R.drawable.gauge_fill_55, R.drawable.gauge_fill_60, R.drawable.gauge_fill_65, R.drawable.gauge_fill_70, R.drawable.gauge_fill_75, R.drawable.gauge_fill_80, R.drawable.gauge_fill_85, R.drawable.gauge_fill_90, R.drawable.gauge_fill_95, 
            R.drawable.gauge_fill_100
        });
        z = 0L;
        A = false;
        D = 0;
        L = 0.0D;
        M = 0.0D;
        O = new ArrayList();
        R = false;
        S = true;
        T = new Point();
        V = null;
        W = null;
        Z = null;
        aa = null;
        ab = null;
        ac = null;
        ad = null;
        al = 0.0F;
        am = 0.0F;
        an = 0.0F;
        ao = 0L;
        ap = 0L;
        at = new Matrix();
        au = new float[2];
        az = true;
        aA = false;
        aB = false;
        aC = false;
        aD = false;
        i = null;
        k = null;
        l = null;
        m = new v(this);
        n = new ae(this);
        o = new af(this);
        p = new ag(this);
        aE = new ah(this);
        q = new ai(this);
        r = new aj(this);
        aF = new ak(this);
        aG = 0;
        aH = new al(this);
        s = new w(this);
        aI = null;
        B = misnap;
        a = false;
        j = handler;
        k = s1;
        l = i1;
        int j1;
        boolean flag;
        if (B.a.n().toLowerCase(Locale.US).contains("license"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aB = flag;
        i1 = getResources();
        if (i1 == null)
        {
            break MISSING_BLOCK_LABEL_658;
        }
        handler = i1.getAssets();
        s1 = i1.getDisplayMetrics();
        i1 = new Configuration(i1.getConfiguration());
        if (B == null || B.a == null || B.a.x() == null)
        {
            break MISSING_BLOCK_LABEL_1390;
        }
        i1.locale = new Locale(B.a.x().toLowerCase());
        i = new Resources(handler, s1, i1);
_L1:
        N = new Path();
        Q = new ConcurrentHashMap();
        G = new Paint(1);
        G.setDither(true);
        G.setStyle(android.graphics.Paint.Style.STROKE);
        G.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        G.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        G.setPathEffect(new CornerPathEffect(B.a.q()));
        G.setAntiAlias(true);
        G.setStrokeWidth(B.a.p());
        j1 = B.a.r();
        G.setColor(j1 | 0xff000000);
        View.inflate(misnap, R.layout.lib_overlay, this);
        g = (ImageButton)findViewById(R.id.overlay_flash_toggle);
        c = (ImageButton)findViewById(R.id.misnap_overlay_mitek_logo);
        c.setAlpha(192);
        l.a(c);
        d = (ImageButton)findViewById(R.id.misnap_overlay_help_button);
        d.setOnClickListener(new x(this));
        U = (TextView)findViewById(R.id.misnap_check_text);
        int k1;
        if (B.a.ay())
        {
            if (B.a.ak())
            {
                misnap = B.getString(R.string.misnap_check_front_text);
            } else
            {
                misnap = B.a.Z();
            }
            U.setText(misnap);
        } else
        if (B.a.az())
        {
            if (B.a.al())
            {
                misnap = B.getString(R.string.misnap_check_back_text);
            } else
            {
                misnap = B.a.Y();
            }
            U.setText(misnap);
        }
        e = (ImageButton)findViewById(R.id.misnap_overlay_capture_button);
        f = (ImageButton)findViewById(R.id.overlay_cancel_button);
        b = i.getDrawable(R.drawable.misnap_doc_center);
        Z = (ImageView)findViewById(R.id.misnap_overlay_gauge);
        Z.setVisibility(4);
        aa = (ImageView)findViewById(R.id.misnap_balloon);
        aa.setVisibility(4);
        W = (ImageView)findViewById(R.id.misnap_bug);
        W.setVisibility(4);
        ac = (ImageView)findViewById(R.id.misnap_tutorial_overlay);
        ad = (ImageView)findViewById(R.id.misnap_vignette);
        w();
        ab = (ImageView)findViewById(R.id.misnap_ghost_image);
        aq = AnimationUtils.loadAnimation(B, R.anim.fadeout);
        ar = AnimationUtils.loadAnimation(B, R.anim.fadein);
        x();
        as = AnimationUtils.loadAnimation(B, R.anim.misnap_balloon_animation);
        h = (TextView)findViewById(R.id.misnap_overlay_test_text);
        if (r.a)
        {
            h.setVisibility(0);
        }
        setWillNotDraw(false);
        E = new Handler();
        k1 = B.e();
        if (aB)
        {
            if (k1 == 3)
            {
                k1 = R.drawable.icon_flash_on;
            } else
            {
                k1 = R.drawable.icon_flash_off;
            }
        } else
        if (k1 == 2)
        {
            k1 = R.drawable.icon_flash_on;
        } else
        {
            k1 = R.drawable.icon_flash_off;
        }
        g.setImageResource(k1);
        av = (RelativeLayout)findViewById(R.id.dialog_help_buttons);
        aw = (RelativeLayout)findViewById(R.id.rl_dialog_help);
        aw.setVisibility(4);
        ax = (Button)findViewById(R.id.btn_try_again);
        if (!B.a.b())
        {
            ax.setText(R.string.dialog_mitek_manual_capture);
            l.a(ax, R.string.dialog_mitek_manual_capture);
        }
        ax.setOnClickListener(new y(this));
        ay = (Button)findViewById(R.id.btn_cancel);
        ay.setOnClickListener(new z(this));
        postInvalidate();
        E.postDelayed(n, 1800L);
        return;
        try
        {
            i = B.getResources();
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            i = B.getResources();
        }
          goto _L1
    }

    private u(MiSnap misnap, Handler handler, s s1, i i1, byte byte0)
    {
        this(misnap, handler, s1, i1);
    }

    u(MiSnap misnap, Handler handler, s s1, i i1, char c1)
    {
        this(misnap, handler, s1, i1, (byte)0);
    }

    static RelativeLayout A(u u1)
    {
        return u1.aw;
    }

    private void A()
    {
        if (ab.isShown() && !aj)
        {
            ab.startAnimation(aq);
            aq.setAnimationListener(new ac(this));
        }
    }

    static RelativeLayout B(u u1)
    {
        return u1.av;
    }

    static int C(u u1)
    {
        return u1.d(48);
    }

    static ImageView D(u u1)
    {
        return u1.ac;
    }

    static Button E(u u1)
    {
        return u1.ay;
    }

    static Button F(u u1)
    {
        return u1.ax;
    }

    static void G(u u1)
    {
        u1.v();
    }

    static void H(u u1)
    {
        u1.b(false);
        u1.j.sendEmptyMessage(8);
    }

    static ImageView I(u u1)
    {
        return u1.aa;
    }

    static String J(u u1)
    {
        if (u1.x == R.drawable.error_more_light)
        {
            return u1.B.getString(R.string.more_light);
        }
        if (u1.x == R.drawable.error_center)
        {
            return u1.B.getString(R.string.hold_center);
        }
        if (u1.x == R.drawable.error_getcloser)
        {
            return u1.B.getString(R.string.get_close);
        }
        if (u1.x == R.drawable.error_hold_steady)
        {
            return u1.B.getString(R.string.hold_steady);
        } else
        {
            return null;
        }
    }

    static boolean K(u u1)
    {
        return u1.v;
    }

    static void L(u u1)
    {
        u1.ap = 0L;
    }

    private static float a(float f1, float f2)
    {
        return 0.5F * f2 + 0.5F * f1;
    }

    private int a(String s1)
    {
        return i.getIdentifier(s1, "drawable", getContext().getPackageName());
    }

    static List a(u u1, List list, float f1)
    {
        list = b(list);
        u1.T = u1.c(list);
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return list;
            }
            Point point = (Point)iterator.next();
            int i1 = point.x;
            int j1 = u1.T.x;
            int k1 = point.y;
            int l1 = u1.T.y;
            point.x = (int)((float)(i1 - j1) * f1 + (float)u1.T.x);
            point.y = (int)((float)(k1 - l1) * f1 + (float)u1.T.y);
        } while (true);
    }

    static void a(u u1, int i1)
    {
        u1.x = i1;
    }

    static void a(u u1, List list)
    {
        u1.P = list;
    }

    static void a(u u1, boolean flag)
    {
        u1.aD = flag;
    }

    private void a(List list)
    {
        N.reset();
        if (list == null || list.size() <= 3)
        {
            N.moveTo(0.0F, 0.0F);
            N.lineTo(0.0F, 0.0F);
            return;
        }
        N.moveTo(((Point)list.get(0)).x, ((Point)list.get(0)).y);
        int i1 = 1;
        do
        {
            if (i1 >= list.size())
            {
                N.close();
                return;
            }
            N.lineTo(((Point)list.get(i1)).x, ((Point)list.get(i1)).y);
            i1++;
        } while (true);
    }

    static boolean a(u u1)
    {
        return u1.p();
    }

    static b b(u u1)
    {
        return u1.ae;
    }

    private static List b(List list)
    {
        ArrayList arraylist = new ArrayList();
        int i1 = 0;
        do
        {
            if (i1 >= 4)
            {
                return arraylist;
            }
            Point point = (Point)list.get(i1);
            arraylist.add(new Point(point.x, point.y));
            i1++;
        } while (true);
    }

    static void b(u u1, int i1)
    {
        u1.D = i1;
    }

    static void b(u u1, boolean flag)
    {
        u1.c(flag);
    }

    private Point c(List list)
    {
        if (aI == null)
        {
            aI = new Point();
        }
        Point point = aI;
        int i1 = ((Point)list.get(0)).x;
        int j1 = ((Point)list.get(1)).x;
        int k1 = ((Point)list.get(2)).x;
        point.x = ((Point)list.get(3)).x + (i1 + j1 + k1) >> 2;
        point = aI;
        i1 = ((Point)list.get(0)).y;
        j1 = ((Point)list.get(1)).y;
        k1 = ((Point)list.get(2)).y;
        point.y = ((Point)list.get(3)).y + (i1 + j1 + k1) >> 2;
        return aI;
    }

    private void c(int i1)
    {
        Q.putIfAbsent(Integer.valueOf(i1), new AtomicInteger(0));
        ((AtomicInteger)Q.get(Integer.valueOf(i1))).incrementAndGet();
    }

    static void c(u u1)
    {
        if (u1.A && !u1.t() && !u1.p() && u1.B != null && u1.B.b != null && !u1.ak)
        {
            u1.ak = true;
            u1.ae = null;
            u1.af = null;
            u1.ag = null;
            u1.ah = null;
            u1.B.b.i();
        }
    }

    static void c(u u1, boolean flag)
    {
        u1.aj = flag;
    }

    private void c(boolean flag)
    {
        if (d != null)
        {
            d.setClickable(flag);
        }
        if (f != null)
        {
            f.setClickable(flag);
        }
        if (e != null)
        {
            e.setClickable(flag);
        }
        if (g != null && 8 != g.getVisibility())
        {
            g.setClickable(flag);
        }
        if (!flag)
        {
            l.a(d);
            l.a(g);
            l.a(f);
            l.a(e);
            l.a(ab);
            return;
        } else
        {
            l.b(d);
            l.b(g);
            l.b(f);
            l.b(e);
            l.b(ab);
            return;
        }
    }

    private int d(int i1)
    {
        return (int)TypedValue.applyDimension(1, i1, getResources().getDisplayMetrics());
    }

    static void d(u u1)
    {
        u1.az = false;
    }

    static void d(u u1, boolean flag)
    {
        u1.ai = flag;
    }

    static MitekAnalyzer e(u u1)
    {
        return u1.F;
    }

    static void f(u u1)
    {
        u1.v = true;
    }

    static b g(u u1)
    {
        return u1.af;
    }

    static b h(u u1)
    {
        return u1.ag;
    }

    static ImageView i(u u1)
    {
        return u1.Z;
    }

    static b j(u u1)
    {
        return u1.ah;
    }

    static boolean k(u u1)
    {
        return u1.A;
    }

    static boolean l(u u1)
    {
        return u1.az;
    }

    static Handler m(u u1)
    {
        return u1.E;
    }

    static MiSnap n(u u1)
    {
        return u1.B;
    }

    static ConcurrentHashMap o(u u1)
    {
        return u1.Q;
    }

    static ImageView p(u u1)
    {
        return u1.ab;
    }

    private boolean p()
    {
        return ae != null && ae.a();
    }

    private boolean q()
    {
        return af != null && af.a();
    }

    static boolean q(u u1)
    {
        return u1.aj;
    }

    static long r(u u1)
    {
        return u1.z;
    }

    private boolean r()
    {
        return ag != null && ag.a();
    }

    static Runnable s(u u1)
    {
        return u1.aF;
    }

    private boolean s()
    {
        return ah != null && ah.a();
    }

    static void t(u u1)
    {
        u1.R = true;
    }

    private boolean t()
    {
        return ai || q() || r() && s();
    }

    private int u()
    {
        if (S)
        {
            S = false;
            return B.a.L() * 1000;
        } else
        {
            return B.a.k() * 1000;
        }
    }

    static List u(u u1)
    {
        return u1.O;
    }

    private void v()
    {
        this;
        JVM INSTR monitorenter ;
        if (k != null)
        {
            k.a();
        }
        b(false);
        if (!aD) goto _L2; else goto _L1
_L1:
        aD = false;
        B.j();
        j.sendEmptyMessage(17);
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        B.a(R.string.uxp_timeout_help_end);
        if (!aA)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        j.obtainMessage(10).sendToTarget();
          goto _L3
        Exception exception;
        exception;
        throw exception;
        j.obtainMessage(2).sendToTarget();
          goto _L3
    }

    static void v(u u1)
    {
        if (!u1.r())
        {
            u1.v = false;
            u1.Z.setVisibility(0);
            u1.ag = com.miteksystems.misnap.j.a().e(u1.Z);
            u1.ag.b();
            u1.E.postDelayed(u1.aE, 750L);
        }
    }

    static int w(u u1)
    {
        return u1.D;
    }

    private void w()
    {
        if (B.a.b() && B.a.u() || !B.a.b() && B.a.v())
        {
            String s1 = B.a.n();
            getContext().getPackageName();
            int i1;
            int j1;
            if (s1.startsWith("REMITTANCE"))
            {
                i1 = a("mitek_vignette_remittance");
            } else
            if (s1.startsWith("CheckBack"))
            {
                i1 = a("mitek_vignette_checkback");
            } else
            if (s1.startsWith("CheckFront") || s1.startsWith("ACH"))
            {
                i1 = a("mitek_vignette_checkfront");
            } else
            if (s1.equals("BALANCE_TRANSFER"))
            {
                i1 = a("mitek_vignette_balance_transfer");
            } else
            if (s1.startsWith("DRIVER_LICENSE"))
            {
                i1 = a("mitek_vignette_driver_license");
            } else
            if (s1.equals("BUSINESS_CARD"))
            {
                i1 = a("mitek_vignette_business_card");
            } else
            if (s1.startsWith("AUTO_INSURANCE"))
            {
                i1 = a("mitek_vignette_auto_insurance");
            } else
            if (s1.startsWith("VIN"))
            {
                i1 = a("mitek_vignette_vin");
            } else
            if (s1.startsWith("W2"))
            {
                i1 = a("mitek_vignette_w2");
            } else
            {
                i1 = 0;
            }
            j1 = i1;
            if (i1 == 0)
            {
                j1 = a("mitek_vignette");
            }
            if (j1 != 0)
            {
                ad.setBackgroundResource(j1);
                ad.setVisibility(0);
            }
            return;
        } else
        {
            ad.setVisibility(4);
            return;
        }
    }

    static AlertDialog x(u u1)
    {
        return u1.C;
    }

    private void x()
    {
        if (B.a.y() || B.a.B())
        {
            String s1 = B.a.n();
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)ab.getLayoutParams();
            int j1 = d(40);
            int i1;
            if (s1.startsWith("REMITTANCE"))
            {
                if (B.a.b())
                {
                    i1 = R.drawable.ghost_remittance;
                } else
                {
                    i1 = R.drawable.manual_ghost_remittance;
                }
                j1 = d(50);
            } else
            if (s1.startsWith("CheckBack"))
            {
                if (B.a.b())
                {
                    i1 = R.drawable.ghost_checkback;
                } else
                {
                    i1 = R.drawable.manual_ghost_checkback;
                }
                j1 = d(60);
            } else
            if (s1.startsWith("CheckFront") || s1.startsWith("ACH"))
            {
                if (B.a.b())
                {
                    i1 = R.drawable.ghost_checkfront;
                } else
                {
                    i1 = R.drawable.manual_ghost_checkfront;
                }
                j1 = d(60);
            } else
            if (s1.equals("BALANCE_TRANSFER"))
            {
                if (B.a.b())
                {
                    i1 = R.drawable.ghost_balance_transfer;
                } else
                {
                    i1 = R.drawable.manual_ghost_balance_transfer;
                }
                j1 = d(50);
            } else
            if (s1.startsWith("DRIVER_LICENSE"))
            {
                if (B.a.b())
                {
                    i1 = R.drawable.ghost_driver_license_landscape;
                } else
                {
                    i1 = R.drawable.manual_ghost_driver_license_landscape;
                }
            } else
            if (s1.equals("BUSINESS_CARD"))
            {
                i1 = R.drawable.ghost_business_card;
            } else
            if (s1.startsWith("AUTO_INSURANCE"))
            {
                i1 = R.drawable.ghost_auto_insurance_card;
            } else
            if (s1.startsWith("VIN"))
            {
                i1 = R.drawable.manual_ghost_vin;
            } else
            if (s1.startsWith("W2"))
            {
                if (B.a.b())
                {
                    i1 = R.drawable.ghost_w2;
                } else
                {
                    i1 = R.drawable.manual_ghost_w2;
                }
            } else
            {
                i1 = R.drawable.ghost_check_blank;
                j1 = d(60);
            }
            if (ab.getId() != i1)
            {
                ab.setImageDrawable(i.getDrawable(i1));
            }
            marginlayoutparams.topMargin = j1;
            marginlayoutparams.bottomMargin = j1;
            ab.setLayoutParams(marginlayoutparams);
            s1 = y();
            if (s1 != null)
            {
                ab.setContentDescription(s1);
            }
            if (B.a.b())
            {
                z();
            }
        }
    }

    static Runnable y(u u1)
    {
        return u1.aH;
    }

    private String y()
    {
        String s1 = null;
        String s2 = B.a.n();
        int i1;
        if (s2.startsWith("REMITTANCE"))
        {
            if (B.a.b())
            {
                s1 = i.getString(R.string.ghost_image_remittance);
            } else
            {
                s1 = i.getString(R.string.ghost_image_remittance_manual);
            }
        } else
        if (s2.startsWith("CheckBack"))
        {
            if (B.a.b())
            {
                s1 = i.getString(R.string.ghost_image_check);
            } else
            {
                s1 = i.getString(R.string.ghost_image_check_manual);
            }
        } else
        if (s2.startsWith("CheckFront") || s2.startsWith("ACH"))
        {
            if (B.a.b())
            {
                s1 = i.getString(R.string.ghost_image_check);
            } else
            {
                s1 = i.getString(R.string.ghost_image_check_manual);
            }
        } else
        if (s2.equals("BALANCE_TRANSFER"))
        {
            if (B.a.b())
            {
                s1 = i.getString(R.string.ghost_image_remittance);
            } else
            {
                s1 = i.getString(R.string.ghost_image_remittance_manual);
            }
        } else
        if (s2.startsWith("DRIVER_LICENSE"))
        {
            if (B.a.b())
            {
                s1 = i.getString(R.string.ghost_image_drivers_license);
            } else
            {
                s1 = i.getString(R.string.ghost_image_drivers_license_manual);
            }
        } else
        if (s2.startsWith("AUTO_INSURANCE"))
        {
            s1 = i.getString(R.string.ghost_image_insurance_card);
        } else
        if (s2.startsWith("VIN"))
        {
            s1 = i.getString(R.string.ghost_image_vin_manual);
        } else
        if (s2.startsWith("W2"))
        {
            if (B.a.b())
            {
                s1 = i.getString(R.string.ghost_image_w2);
            } else
            {
                s1 = i.getString(R.string.ghost_image_w2_manual);
            }
        }
        i1 = B.a.T();
        if (i1 == 0)
        {
            return s1;
        } else
        {
            return i.getString(i1);
        }
    }

    static int z(u u1)
    {
        return u1.u();
    }

    private void z()
    {
        while (!B.a.y() || ab.isShown() || aj) 
        {
            return;
        }
        ab.startAnimation(ar);
        ar.setAnimationListener(new ab(this));
    }

    public final int a(MitekAnalyzer mitekanalyzer)
    {
        int i1;
        boolean flag;
        if (!B.a.b())
        {
            return 0;
        }
        if (F == null)
        {
            F = mitekanalyzer;
        }
        if (!F.d())
        {
            c(0);
        } else
        if (F.l() != null && F.l().size() == 5 && !t())
        {
            boolean flag1 = F.a();
            if (!F.b() && !F.c())
            {
                i1 = 0;
            } else
            {
                i1 = 1;
            }
            if (!flag1)
            {
                c(1);
            }
            if (i1 == 0)
            {
                c(2);
            }
            if (flag1 && i1 != 0 && !F.e())
            {
                c(3);
            }
        }
        if (!B.p && (!aB && B.a.F() != 0 || aB && 3 == B.a.F()))
        {
            long l1 = System.currentTimeMillis();
            float f1;
            if (ao == 0L)
            {
                ao = l1;
            } else
            if (!F.a(B.a.E()) && l1 - ao > (long)B.a.D())
            {
                if (B.b.e())
                {
                    B.b.b(true);
                    g.setImageResource(R.drawable.icon_flash_on);
                    B.a(R.string.uxp_flash_auto_on);
                    j.sendEmptyMessage(13);
                }
                B.p = true;
                Q.clear();
            }
        }
        mitekanalyzer = F.l();
        if (mitekanalyzer != null && mitekanalyzer.size() == 5)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        f1 = 0.0F;
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        f1 = Math.max((float)F.g() / (float)F.m() - 0.05F, (float)F.h() / (float)F.n() - 0.05F);
        L = (double)H / (double)J;
        M = (double)I / (double)K;
        if (O.size() != 0) goto _L4; else goto _L3
_L3:
        mitekanalyzer = mitekanalyzer.iterator();
_L9:
        if (mitekanalyzer.hasNext()) goto _L6; else goto _L5
_L5:
        T = c(O);
_L2:
        t = a(f1, t);
        u = t * t;
        Point point;
        if ((double)u > 0.94999999999999996D)
        {
            u = 1.0F;
        } else
        if (u < 0.0F)
        {
            u = 0.0F;
        }
        if (r.a)
        {
            a(((Integer) (null)));
        }
        f1 = (float)B.a.z() / 1000F;
        if ((float)B.a.j() * f1 < (float)F.g())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (f1 * (float)B.a.s() < (float)F.h())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (az || i1 == 0 && !flag) goto _L8; else goto _L7
_L7:
        if ((ab.isShown() || !Z.isShown() && !B.a.y()) && !t())
        {
            if (B.a.y())
            {
                A();
            }
            if (!q())
            {
                Z.setVisibility(0);
                af = com.miteksystems.misnap.j.a().c(Z);
                af.b();
                E.postDelayed(p, 1250L);
            }
        } else
        {
            ap = 0L;
        }
_L14:
        postInvalidate();
        return 1;
_L6:
        point = (Point)mitekanalyzer.next();
        O.add(new Point((int)((double)point.x * L), (int)((double)point.y * M)));
          goto _L9
_L4:
        i1 = 0;
        while (i1 < 4) 
        {
            point = (Point)mitekanalyzer.get(i1);
            if (point.x != 0 && point.y != 0)
            {
                ((Point)O.get(i1)).x = (int)a((float)((double)point.x * L), ((Point)O.get(i1)).x);
                ((Point)O.get(i1)).y = (int)a((float)((double)point.y * M), ((Point)O.get(i1)).y);
            }
            i1++;
        }
          goto _L5
_L8:
        long l2;
        if (u <= 0.1F)
        {
            v = false;
        } else
        if (!ab.isShown() && u > 0.1F)
        {
            v = true;
        }
        l2 = System.currentTimeMillis();
        if (ap == 0L) goto _L11; else goto _L10
_L10:
        if (l2 - ap <= (long)B.a.A() || t() || ab.isShown() || aj || i1 != 0 || flag) goto _L13; else goto _L12
_L12:
        ap = l2;
        v = false;
        if (Z.isShown() && !ai)
        {
            Z.startAnimation(aq);
            aq.setAnimationListener(new ad(this));
        }
        if (B.a.y())
        {
            z();
        }
          goto _L14
_L13:
        if (!ab.isShown() && !aj) goto _L14; else goto _L11
_L11:
        ap = l2;
          goto _L14
    }

    final void a()
    {
        A = true;
        E.removeCallbacks(aH);
        E.removeCallbacks(r);
        if (C != null)
        {
            Log.w("MiSnapUI", "auto-dismissing tutorial due to snapshotGood() call");
            C.dismiss();
        }
        if (B.a.b())
        {
            aa.clearAnimation();
            P = b(O);
            z = System.currentTimeMillis();
            E.post(aF);
            if (!s())
            {
                Z.setVisibility(0);
                ah = com.miteksystems.misnap.j.a().d(Z);
                ah.b();
                E.postDelayed(q, 400L);
            }
        } else
        {
            A();
        }
        v = false;
        if (!p())
        {
            W.setVisibility(0);
            E.postDelayed(m, 1600L);
            if (B.a.o())
            {
                ae = com.miteksystems.misnap.j.a().a(W);
            } else
            {
                ae = com.miteksystems.misnap.j.a().b(W);
            }
            ae.b();
        }
    }

    final void a(int i1)
    {
        if (i1 == 1 && c != null)
        {
            c.setVisibility(4);
        }
    }

    final void a(int i1, int j1)
    {
        J = i1;
        K = j1;
    }

    final void a(Integer integer)
    {
        StringBuilder stringbuilder;
        if (integer != null)
        {
            aG = 3;
        } else
        if (aG != 0)
        {
            aG = aG - 1;
            return;
        }
        stringbuilder = new StringBuilder();
        if (r.c || 1.0F < al)
        {
            long l1 = System.nanoTime();
            am = (float)(int)((float)l1 - an) + am;
            float f1 = am / al;
            stringbuilder.append((new StringBuilder("FPS=")).append(String.format("%.02f", new Object[] {
                Float.valueOf(1E+09F / f1)
            })).toString());
            al = al + 1.0F;
            an = l1;
        }
        if (r.d)
        {
            stringbuilder.append((new StringBuilder(String.valueOf(System.getProperty("line.separator")))).append("Light (target ").append(B.a.E() / 100).append("): ").append(String.format("%.01f", new Object[] {
                Float.valueOf((float)F.j() / 100F)
            })).toString());
        }
        if (r.e || r.f)
        {
            stringbuilder.append(System.getProperty("line.separator"));
        }
        if (r.e)
        {
            stringbuilder.append((new StringBuilder("Fill %: ")).append(String.format("%.01f", new Object[] {
                Float.valueOf((float)F.g() / 10F)
            })).toString());
        }
        if (r.e || r.f)
        {
            stringbuilder.append("\t");
        }
        if (r.f)
        {
            stringbuilder.append((new StringBuilder("Horiz Fill %: ")).append(String.format("%.01f", new Object[] {
                Float.valueOf((float)F.h() / 10F)
            })).toString());
        }
        if (r.e || r.f)
        {
            stringbuilder.append((new StringBuilder(String.valueOf(System.getProperty("line.separator")))).append("MetricAvg: ").append(String.format("%.01f", new Object[] {
                Float.valueOf(u)
            })).toString());
        }
        if (integer != null)
        {
            stringbuilder.append((new StringBuilder(" Focus: ")).append(integer).toString());
        }
        h.setText(stringbuilder);
    }

    final void a(boolean flag)
    {
        if (flag)
        {
            g.setVisibility(0);
            g.setClickable(true);
            return;
        } else
        {
            d.setLayoutParams(g.getLayoutParams());
            g.setClickable(false);
            g.setVisibility(8);
            return;
        }
    }

    final void b()
    {
        float f1 = H / 2.0F - (float)(aa.getWidth() / 2);
        if (v)
        {
            f1 = (float)(((double)(u * (float)(Z.getRight() - Z.getLeft())) * 0.55000000000000004D + (double)Z.getLeft()) - (double)(aa.getWidth() / 2));
            b.setVisible(false, false);
        }
        aa.setVisibility(0);
        aa.setImageResource(x);
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)aa.getLayoutParams();
        marginlayoutparams.leftMargin = (int)f1;
        aa.setLayoutParams(marginlayoutparams);
        as.setAnimationListener(new aa(this));
        aa.setAnimation(as);
        aa.startAnimation(as);
        Q.clear();
    }

    final void b(int i1)
    {
        String s1;
        int j1;
        j1 = 0xff000000;
        i();
        if (A || aw.isShown())
        {
            return;
        }
        B.h();
        b(true);
        c(false);
        s1 = null;
        i1;
        JVM INSTR tableswitch 0 3: default 76
    //                   0 132
    //                   1 1098
    //                   2 429
    //                   3 1098;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        i1 = j1;
_L8:
        aw.setBackgroundColor(i1);
        aw.setVisibility(0);
        av.setVisibility(0);
        if (k != null)
        {
            k.a(s1);
        }
        B.a(R.string.uxp_timeout_help_begin);
        postInvalidate();
        return;
_L2:
        aA = true;
        i1 = 0xff000000 | B.a.W();
        int k1 = B.a.R();
        if (B.a.aA())
        {
            ac.setImageResource(R.drawable.failover_check_tutorial_pic);
            if (k1 == 0)
            {
                s1 = i.getString(R.string.help_failover_check);
            } else
            {
                s1 = i.getString(k1);
            }
            l.a(ac, s1);
        } else
        {
            ac.setImageResource(R.drawable.failover_tutorial_pic);
            if (k1 == 0)
            {
                s1 = i.getString(R.string.help_failover_document);
            } else
            {
                s1 = i.getString(k1);
            }
            l.a(ac, s1);
        }
        if (B.a.au())
        {
            ay.setVisibility(8);
        } else
        {
            ay.setVisibility(0);
            ay.setText(B.a.ae());
            l.a(ay, B.a.ae());
        }
        if (B.a.as())
        {
            ax.setText(R.string.dialog_mitek_capture);
            l.a(ax, R.string.dialog_mitek_capture);
        } else
        {
            ax.setText(B.a.af());
            l.a(ax, B.a.af());
        }
          goto _L5
_L4:
        i1 = 0xff000000 | B.a.X();
        if (B.a.b() && !aA)
        {
            int l1 = B.a.Q();
            if (B.a.aA())
            {
                ac.setImageResource(R.drawable.check_tutorial_pic);
                if (l1 == 0)
                {
                    s1 = i.getString(R.string.help_check);
                } else
                {
                    s1 = i.getString(l1);
                }
                l.a(ac, s1);
            } else
            {
                ac.setImageResource(R.drawable.tutorial_pic);
                if (l1 == 0)
                {
                    s1 = i.getString(R.string.help_document);
                } else
                {
                    s1 = i.getString(l1);
                }
                l.a(ac, s1);
            }
            if (B.a.ao())
            {
                ay.setVisibility(8);
            } else
            {
                ay.setVisibility(0);
                if (B.a.am())
                {
                    ay.setText(R.string.dialog_mitek_cancel);
                    l.a(ay, R.string.dialog_mitek_cancel);
                } else
                {
                    ay.setText(B.a.aa());
                    l.a(ay, B.a.aa());
                }
            }
            if (B.a.an())
            {
                ax.setText(R.string.dialog_mitek_capture);
                l.a(ax, R.string.dialog_mitek_capture);
            } else
            {
                ax.setText(B.a.ab());
                l.a(ax, B.a.ab());
            }
        } else
        {
            int i2 = B.a.S();
            if (B.a.aA())
            {
                ac.setImageResource(R.drawable.manual_check_tutorial_pic);
                if (i2 == 0)
                {
                    s1 = i.getString(R.string.help_manual_check);
                } else
                {
                    s1 = i.getString(i2);
                }
                l.a(ac, s1);
            } else
            {
                ac.setImageResource(R.drawable.manual_tutorial_pic);
                if (i2 == 0)
                {
                    s1 = i.getString(R.string.help_manual_document);
                } else
                {
                    s1 = i.getString(i2);
                }
                l.a(ac, s1);
            }
            if (B.a.ax())
            {
                ay.setVisibility(8);
            } else
            {
                ay.setVisibility(0);
                if (B.a.av())
                {
                    ay.setText(R.string.dialog_mitek_cancel);
                    l.a(ay, R.string.dialog_mitek_cancel);
                } else
                {
                    ay.setText(B.a.ag());
                    l.a(ay, B.a.ag());
                }
            }
            if (B.a.aw())
            {
                ax.setText(R.string.dialog_mitek_manual_capture);
                l.a(ax, R.string.dialog_mitek_manual_capture);
            } else
            {
                ax.setText(B.a.ah());
                l.a(ax, B.a.ah());
            }
        }
          goto _L5
_L3:
        i1 = 0xff000000 | B.a.U();
        int j2 = B.a.Q();
        if (B.a.aA())
        {
            ac.setImageResource(R.drawable.check_tutorial_pic);
            if (j2 == 0)
            {
                s1 = i.getString(R.string.help_check);
            } else
            {
                s1 = i.getString(j2);
            }
            l.a(ac, s1);
        } else
        {
            ac.setImageResource(R.drawable.tutorial_pic);
            if (j2 == 0)
            {
                s1 = i.getString(R.string.help_document);
            } else
            {
                s1 = i.getString(j2);
            }
            l.a(ac, s1);
        }
        if (!B.a.ar()) goto _L7; else goto _L6
_L6:
        ay.setVisibility(8);
_L9:
        if (B.a.aq())
        {
            ax.setText(R.string.dialog_mitek_try_again);
            l.a(ax, R.string.dialog_mitek_try_again);
        } else
        {
            ax.setText(B.a.ad());
            l.a(ax, B.a.ad());
        }
_L5:
        if (true) goto _L8; else goto _L7
_L7:
        ay.setVisibility(0);
        if (B.a.ap())
        {
            ay.setText(R.string.dialog_mitek_cancel);
            l.a(ay, R.string.dialog_mitek_cancel);
        } else
        {
            ay.setText(B.a.ac());
            l.a(ay, B.a.ac());
        }
          goto _L9
    }

    final void b(boolean flag)
    {
        if (ay != null)
        {
            ay.setClickable(flag);
        }
        if (ax != null)
        {
            ax.setClickable(flag);
        }
        if (!flag)
        {
            l.a(ay);
            l.a(ax);
            return;
        } else
        {
            l.b(ay);
            l.b(ax);
            return;
        }
    }

    public final int c()
    {
        return D;
    }

    public final void d()
    {
        w();
        if (B.a.B())
        {
            ab.setVisibility(0);
            return;
        } else
        {
            ab.setVisibility(4);
            return;
        }
    }

    protected final void dispatchDraw(Canvas canvas)
    {
        canvas.rotate(B.k(), getWidth() / 2, getHeight() / 2);
        at = canvas.getMatrix();
        canvas.save();
        canvas.setMatrix(at);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        float af1[] = au;
        af1[0] = motionevent.getX();
        af1[1] = motionevent.getY();
        if (B.l())
        {
            motionevent.setLocation(af1[0], af1[1]);
        } else
        {
            motionevent.setLocation((float)getWidth() - af1[0], (float)getHeight() - af1[1]);
        }
        return super.dispatchTouchEvent(motionevent);
    }

    public final boolean e()
    {
        return aw.isShown();
    }

    public final boolean f()
    {
        return aA;
    }

    final void g()
    {
        c(false);
        if (k != null)
        {
            k.a();
        }
        int i1;
        if (B.a.b())
        {
            if (B.a.aA())
            {
                ac.setImageResource(R.drawable.check_tutorial_first_time_user_pic);
                i1 = R.string.misnap_tutorial_check;
            } else
            {
                ac.setImageResource(R.drawable.tutorial_first_time_user_pic);
                i1 = R.string.misnap_tutorial_document;
            }
        } else
        if (B.a.aA())
        {
            ac.setImageResource(R.drawable.manual_check_tutorial_first_time_user_pic);
            i1 = R.string.help_failover_check;
        } else
        {
            ac.setImageResource(R.drawable.manual_tutorial_first_time_user_pic);
            i1 = R.string.help_failover_document;
        }
        if (k != null)
        {
            Object obj;
            if (k.b.P() == 0)
            {
                obj = i.getString(i1);
            } else
            {
                obj = i.getString(k.b.P());
            }
            k.a(((String) (obj)));
            l.a(ac, ((String) (obj)));
        }
        obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(0, 0, 0, 0);
        ac.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        av.setVisibility(8);
        aw.setBackgroundColor(B.a.V() | 0xff000000);
        aw.setVisibility(0);
        E.postDelayed(s, B.a.M());
        a = true;
    }

    final void h()
    {
        aw.setVisibility(4);
        av.setVisibility(4);
        c(true);
        if (!B.a.b())
        {
            j.sendEmptyMessage(12);
            return;
        } else
        {
            j.sendEmptyMessage(15);
            return;
        }
    }

    final void i()
    {
        E.removeCallbacks(r);
        E.removeCallbacks(aH);
    }

    final void j()
    {
        if (B.a.k() != 0 && B.a.b())
        {
            E.postDelayed(aH, u());
        }
        if (!a)
        {
            if (aw != null)
            {
                aw.setVisibility(4);
            }
            c(true);
        }
    }

    final void k()
    {
        if (B.a.b() && B.a.I())
        {
            E.postDelayed(r, B.a.J());
        }
    }

    final void l()
    {
        x();
        e.setVisibility(0);
        e.setClickable(true);
        if (E != null)
        {
            E.removeCallbacks(r);
        }
        Z.setVisibility(4);
        v = false;
        t = 0.0F;
        if (B.a.B())
        {
            ab.setAlpha(B.a.C());
            ab.setVisibility(0);
        } else
        {
            ab.setVisibility(4);
        }
        if (!a)
        {
            if (aw != null)
            {
                aw.setVisibility(4);
            }
            c(true);
        }
    }

    public final void m()
    {
        if (k != null)
        {
            String s1 = y();
            if (s1 != null)
            {
                k.a(s1);
            }
        }
    }

    final void n()
    {
        postInvalidate();
        if (F != null)
        {
            F.i = true;
            E.postDelayed(o, B.a.w());
        }
    }

    final void o()
    {
        a = false;
        synchronized (B.g)
        {
            E.removeCallbacks(aH);
            E.removeCallbacks(r);
            E.removeCallbacks(m);
            E.removeCallbacks(p);
            E.removeCallbacks(aE);
            E.removeCallbacks(q);
            E.removeCallbacks(n);
            E.removeCallbacks(aF);
            E.removeCallbacks(s);
        }
        if (ab != null)
        {
            ab.setImageResource(0);
            ab.destroyDrawingCache();
        }
        if (ad != null)
        {
            ad.setBackgroundResource(0);
            ad.destroyDrawingCache();
        }
        if (ac != null)
        {
            ac.setImageResource(0);
            ac.destroyDrawingCache();
        }
        if (aa != null)
        {
            aa.setImageResource(0);
            aa.destroyDrawingCache();
        }
        if (Z != null)
        {
            Z.setImageResource(0);
            Z.destroyDrawingCache();
        }
        if (g != null)
        {
            g.setImageResource(0);
            g.destroyDrawingCache();
        }
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        H = getWidth();
        I = getHeight();
        if (V == null)
        {
            int i1 = (int)Math.min(H / 10F, 100F);
            b.setBounds(0, 0, i1, i1);
            V = Bitmap.createBitmap(i1, i1, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas1 = new Canvas(V);
            b.draw(canvas1);
        }
        if (F != null)
        {
            if (R)
            {
                a(P);
                canvas.drawPath(N, G);
            }
            if (v)
            {
                w.reset();
                w.postTranslate(T.x - V.getWidth() / 2, T.y - V.getHeight() / 2);
                canvas.drawBitmap(V, w, G);
            }
            if (v && !t())
            {
                int j1 = (int)(u * 20F);
                Z.setImageResource(y[j1]);
                return;
            }
        }
    }

}
