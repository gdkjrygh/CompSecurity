// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import com.a.a.c.g;
import com.kik.cache.ad;
import com.kik.g.f;
import com.kik.g.k;
import com.kik.g.l;
import com.kik.j.m;
import com.kik.j.o;
import com.kik.j.q;
import com.kik.j.s;
import com.kik.j.u;
import com.kik.j.y;
import com.kik.sdkutils.ab;
import com.mixpanel.android.mpmetrics.v;
import java.io.File;
import java.security.Security;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.Vector;
import kik.a.a;
import kik.a.d.aa;
import kik.a.d.n;
import kik.a.e.i;
import kik.a.e.r;
import kik.a.e.w;
import kik.a.x;
import kik.a.z;
import kik.android.HeadphoneUnpluggedReceiver;
import kik.android.KikDataProvider;
import kik.android.KikNotificationHandler;
import kik.android.a.b;
import kik.android.chat.activity.FragmentWrapperActivity;
import kik.android.chat.fragment.KikChatFragment;
import kik.android.d.d;
import kik.android.gifs.b.e;
import kik.android.h.h;
import kik.android.j;
import kik.android.net.communicator.CommunicatorService;
import kik.android.util.DeviceUtils;
import kik.android.util.ae;
import kik.android.util.am;
import kik.android.util.bg;
import kik.android.util.bj;
import kik.android.util.bo;
import kik.android.util.bx;
import kik.android.util.by;
import kik.android.util.ce;
import kik.android.util.cj;
import kik.android.util.ck;
import kik.android.util.p;
import org.c.c;
import org.spongycastle.jce.provider.BouncyCastleProvider;

// Referenced classes of package kik.android.chat:
//            a, b, m, y, 
//            z, ab, ad, af, 
//            ah, ai, c, d, 
//            e, f, g, h, 
//            i, j, w, p, 
//            r, s, t, o, 
//            x, k, v, l, 
//            n

public class KikApplication extends Application
    implements kik.android.chat.a
{

    public static final String a = UUID.randomUUID().toString();
    private static final org.c.b j = org.c.c.a("KikApplication");
    private static KikApplication k;
    private static KikNotificationHandler l;
    private static float m;
    private static String n;
    private static long o;
    private kik.a.e.v A;
    private com.kik.l.ab B;
    private kik.a.e.f C;
    private kik.a.f.k D;
    private w E;
    private kik.a.e.b F;
    private com.kik.e.a G;
    private kik.a.ab H;
    private kik.a.e.k I;
    private kik.a.e.j J;
    private x K;
    private int L;
    private int M;
    private Activity N;
    private com.kik.cards.util.a O;
    private volatile String P;
    private Timer Q;
    private TimerTask R;
    private bo S;
    private b T;
    private kik.android.b.j U;
    private kik.android.b.a V;
    private l W;
    private Handler X;
    private k Y;
    private com.kik.g.p Z;
    private k aa;
    private boolean ab;
    private ce ac;
    private kik.a.e.q ad;
    private final com.kik.g.i ae = new kik.android.chat.b(this);
    private final com.kik.g.i af = new kik.android.chat.m(this);
    private com.kik.g.i ag;
    private com.kik.g.i ah;
    private com.kik.g.i ai;
    private com.kik.g.i aj;
    private com.kik.g.i ak;
    private com.kik.g.i al;
    private com.kik.g.i am;
    private com.kik.g.i an;
    private com.kik.g.i ao;
    private com.kik.g.i ap;
    private com.kik.g.i aq;
    private com.kik.g.i ar;
    private com.kik.g.i as;
    private com.kik.g.r at;
    private TimerTask au;
    protected com.kik.android.a b;
    protected com.kik.android.c.f c;
    protected kik.android.chat.b.d d;
    protected ck e;
    protected ad f;
    protected bj g;
    protected kik.a.c.c h;
    kik.a.a.c i;
    private final f p = new f();
    private final Object q = new Object();
    private i r;
    private r s;
    private HandlerThread t;
    private Timer u;
    private boolean v;
    private boolean w;
    private boolean x;
    private Activity y;
    private boolean z;

    public KikApplication()
    {
        t = new HandlerThread("MetricsHandler");
        u = new Timer("TeardownFail");
        v = true;
        w = true;
        x = true;
        y = null;
        z = false;
        L = 0;
        M = 0;
        P = null;
        Q = new Timer("BackgroundTimer");
        R = null;
        Y = new k(this);
        aa = new k(this);
        ab = true;
        ag = new kik.android.chat.y(this);
        ah = new kik.android.chat.z(this);
        ai = new kik.android.chat.ab(this);
        aj = new kik.android.chat.ad(this);
        ak = new af(this);
        al = new ah(this);
        am = new ai(this);
        an = new kik.android.chat.c(this);
        ao = new kik.android.chat.d(this);
        ap = new kik.android.chat.e(this);
        aq = new kik.android.chat.f(this);
        ar = new kik.android.chat.g(this);
        as = new kik.android.chat.h(this);
        at = new kik.android.chat.i(this);
        au = new kik.android.chat.j(this);
        k = this;
    }

    public static int a(int i1)
    {
        return (int)((float)i1 * m);
    }

    public static transient String a(int i1, Object aobj[])
    {
        return k.getApplicationContext().getResources().getString(i1, aobj);
    }

    public static final String a(String s1)
    {
        return String.format("Kik/%s (Android %s) %s", new Object[] {
            n, android.os.Build.VERSION.RELEASE, s1
        });
    }

    static i a(KikApplication kikapplication)
    {
        return kikapplication.r;
    }

    private void a(Context context, a a1)
    {
        a a2;
        boolean flag;
        long l1;
label0:
        {
            l1 = com.kik.sdkutils.ab.a();
            flag = false;
            if (a1 != null)
            {
                a2 = a1;
                if (a1.g())
                {
                    break label0;
                }
            }
            a2 = K.c();
            flag = true;
        }
        ac = new ce(k, K.b());
        L = DeviceUtils.c(this);
        M = ac.b().getInt("kik.version.number", 0);
        if (t())
        {
            if (M == 0)
            {
                a1 = getApplicationContext().getSharedPreferences("KikPreferences", 0);
                if (a1 != null)
                {
                    M = a1.getInt("kik.version.number", 0);
                }
            }
            ac.b().edit().putInt("kik.version.number", L).commit();
        }
        if (M < 152)
        {
            ac.e();
            (new kik.android.chat.w(this)).start();
        }
        Object obj1 = new q(K.b(), new File(getApplicationInfo().dataDir), getExternalCacheDir());
        ad = ((q) (obj1)).a();
        com.kik.m.k.a(context, ad);
        if (flag)
        {
            a2.a(new j(k, ac, K.b(), ad));
            o = com.kik.sdkutils.ab.a() - l1;
        }
        kik.android.widget.ce.a(ac);
        a1 = a2.l().d().c;
        com.a.a.a.d().c.b(a1);
        a1 = new bg(getBaseContext());
        com.a.a.a.d().c.b("Version", a1.a());
        com.a.a.a.d().c.b("BuildDate", a1.d());
        com.a.a.a.d().c.b("CommitHash", a1.f());
        H = a2;
        r = a2.o();
        T = (b)a2.n();
        A = a2.k();
        B = (com.kik.l.ab)a2.k();
        C = a2.h();
        D = a2.j();
        s = a2.q();
        E = a2.l();
        F = a2.m();
        I = a2.z();
        kik.android.d.d.a(this).a(A, B, ac);
        kik.android.util.am.a(context, ac);
        kik.android.util.p.a().a(E);
        kik.android.gifs.b.e.a(B);
        kik.android.gifs.a.a(this);
        Object obj = a2.s();
        KikDataProvider.a(A, B, E);
        kik.android.net.a.e.a(context, C);
        U = new kik.android.b.j(context, ad);
        boolean flag1 = DeviceUtils.d(context);
        Object obj2 = new kik.android.chat.a.a(a2.x(), a2.d(), A);
        Object obj3;
        Object obj4;
        y y1;
        com.kik.j.w w1;
        com.kik.j.c c1;
        u u1;
        m m1;
        s s1;
        com.kik.j.k k1;
        com.kik.j.g g1;
        Object obj5;
        if (flag1)
        {
            a1 = "8065366a28436dbe178c68361639d705";
        } else
        {
            a1 = "36e42d002f7142d1dad9d50f4298db43";
        }
        obj4 = com.mixpanel.android.mpmetrics.v.a(context, a1);
        a1 = new kik.a.d(a2);
        obj3 = new com.kik.j.e(B);
        obj4 = new o(((v) (obj4)), a2.x(), C, A, E, ac.c(), this);
        y1 = new y(A, B, E, a2.r(), kik.android.d.d.a(getApplicationContext()), flag1, android.os.Build.VERSION.SDK_INT, ac);
        w1 = new com.kik.j.w(context, a2.x(), A, a2.d(), E, a2.i(), ac, ad);
        c1 = new com.kik.j.c(context, ((kik.android.chat.a.a) (obj2)), A);
        u1 = new u(ac);
        m1 = new m(C, aa.a(), A);
        s1 = new s(a2.x(), a2.j(), a2.d(), a2.h(), a2.o().v(), a2.q());
        k1 = new com.kik.j.k(new bj());
        g1 = new com.kik.j.g(B, U);
        obj5 = new kik.a.a.j(C, T, a2.x(), A);
        obj5 = new com.kik.j.a(new com.kik.l.a(A, context, ac), ((kik.a.a.l) (obj5)), a2.z());
        G = com.kik.e.b.a().a(a1).a(((o) (obj4))).a(y1).a(w1).a(c1).a(g1).a(new com.kik.j.aa(((kik.android.chat.a.a) (obj2)))).a(((com.kik.j.e) (obj3))).a(k1).a(((q) (obj1))).a(m1).a(s1).a(u1).a(((com.kik.j.a) (obj5))).a();
        j();
        G.a(this);
        kik.android.f.a.f.a().a(A, B, D, a2.i(), f, ad, ac);
        ((kik.android.net.communicator.a)C).a(b);
        ((kik.android.net.communicator.a)C).a(H);
        a1 = kik.android.i.i.a();
        G.a(a1);
        X = new Handler(t.getLooper());
        flag1 = DeviceUtils.d(context);
        b.a(flag1);
        b.a("50% Core Setup Time", (float)o / 1000F, 0.5F);
        b.a("95% Core Setup Time", (float)o / 1000F, 0.95F);
        b.g("Received New People in Last 7 Days", null);
        b.g("Messages Received in Last 7 Days", null);
        b.g("Messaging Partners in Last 7 Days", null);
        b.a("Chat List Size", 0L);
        b.a("New Chat List Size", 0L);
        b.a("Block List Size", 0L);
        b.c("Is Wear Installed", kik.android.g.c.a(this));
        b.c("Is Wear Installed", kik.android.g.c.a(this));
        b.a("Bubble Colour", d.c().e());
        a1 = System.getProperty("os.arch");
        obj1 = b;
        if (a1 == null)
        {
            a1 = "Unknown";
        }
        ((com.kik.android.a) (obj1)).a("OS Architecture", a1);
        Z = new com.kik.g.p();
        b.a("App Opened");
        a1 = ac.c();
        obj1 = a1.getString("kik.install_referrer", null);
        if (obj1 != null)
        {
            b.f("Install Referrer", ((String) (obj1)));
        }
        l1 = a1.getLong("kik.install_date", -1L);
        if (l1 != -1L)
        {
            b.a("Install Date", l1);
        }
        b.a("Registrations Since Install", a1.getInt("kik.registration_count", 0));
        b.a("Logins Since Install", a1.getInt("kik.install_count", 0));
        Z.a(new kik.android.chat.p(this));
        kik.android.gifs.b.a(this, B, b);
        l.a(E, r, A, G);
        S = new bo(this, r, A, b, D, ((kik.a.e.n) (obj)), a2.i(), H);
        T.c().d("CAN");
        T.c().b(k.s());
        T.c().e(DeviceUtils.b(this));
        obj = a2.t();
        a1 = kik.android.d.d.a(context);
        if (DeviceUtils.d(getApplicationContext()))
        {
            obj1 = new kik.android.chat.r(this);
            obj2 = ac;
            a1.a(new kik.android.chat.s(this, context, "messageEncryptionPublicKeyCorruptType", "none", new String[] {
                "none", "corrupt public", "corrupt public private", "corrupt private"
            }, ((Runnable) (obj1)), ((kik.android.util.ar) (obj2)), ((kik.a.e.o) (obj))));
        }
        a1.a(new kik.android.d.a(context, "content-preload", true, null, ac));
        a1.a(new kik.android.d.a(context, "group-size-fifty-members", false, null, ac));
        obj = new Boolean(false);
        obj1 = new Boolean(false);
        obj2 = new Boolean(true);
        obj3 = ac;
        a1.a(new t(this, context, "force-roster-update", ((Boolean) (obj)), new Boolean[] {
            obj1, obj2
        }, ((kik.android.util.ar) (obj3)), context));
        r.x();
        a1 = kik.a.z.b(A);
        if (a1 != null)
        {
            a1 = a1.a().c();
            T.c().a(a1);
            T.a();
        }
        a1 = ac.c();
        flag1 = a1.getBoolean("kik.has-kik-ever-run", false);
        if (a1.getInt("kik.version.number.eula", -1) != -1)
        {
            flag1 = true;
        }
        if (!flag1)
        {
            a1 = a1.edit();
            a1.putBoolean("kik.has-kik-ever-run", true);
            if (a1.commit())
            {
                k.T.c().b();
            }
        }
        com.kik.cards.web.iap.b.a().a(context, C, A);
        V = new kik.android.b.a(a2.x(), A, a2.v());
        p.a(C.d(), ae);
        p.a(r.r(), ah);
        p.a(r.s(), ai);
        p.a(r.t(), ak);
        p.a(r.u(), aj);
        p.a(r.a(), ag);
        p.a(s.a(), ar);
        p.a(E.b(), as);
        p.a(r.e(), am);
        p.a(r.f(), al);
        p.a(r.j(), an);
        p.a(H.a(), ao);
        p.a(E.a(), aq);
        E.h().a(at);
        e.a(s, b);
        a2.d().a(new kik.android.chat.o(this));
        W = new l();
        kik.android.util.a.a(this, A, B, ac);
        HeadphoneUnpluggedReceiver.a(this);
        g.a(b);
        if (!t()) goto _L2; else goto _L1
_L1:
        if (M != 0) goto _L4; else goto _L3
_L3:
        if (A.n("kik.led.color") == null)
        {
            A.c("kik.led.color", "ff00ff00");
            A.a("kik.vibrate", Boolean.valueOf(true));
            A.a("kik.sound", Boolean.valueOf(true));
            A.a("kik.developer.mode", Boolean.valueOf(false));
            A.a("kik.new.people.notify", Boolean.valueOf(true));
            A.c("kik.chat.video.prefetch", f(0x7f090368));
            A.c("kik.chat.video.autoplay", f(0x7f090367));
        }
_L2:
        if (kik.a.z.a(A))
        {
            r();
        }
        kik.android.util.s.b();
        return;
_L4:
        A.a(Integer.valueOf(M));
        if (M < 11)
        {
            A.a(E.d());
            r.E();
        }
        if (M < 41 && F.b())
        {
            F.d();
        }
        if (M < 48)
        {
            a1 = A;
            kik.a.e.f f1;
            boolean flag2;
            if (!"false".equals(a1.n("user_profile_listening_by_default")))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if ((new Boolean(flag2)).booleanValue())
            {
                context = "true";
            } else
            {
                context = "false";
            }
            a1.c("notify_new_people", context);
            context = kik.a.d.aa.a(a1);
            E.a(context);
            a1 = new f();
            f1 = C;
            if (f1 != null)
            {
                a1.a(f1.b(), new kik.android.chat.x(this, a1, f1, context));
            }
        }
        if (M < 101)
        {
            try
            {
                (new kik.android.b.ab(getApplicationContext(), A.m())).a();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                bx.a(context);
            }
        }
        if (M < 132)
        {
            A.a("kik.scan.hint.display", Boolean.valueOf(true));
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static void a(KikApplication kikapplication, Context context, a a1)
    {
        kikapplication.a(context, a1);
    }

    private boolean a(File file)
    {
        if (file != null && file.isDirectory())
        {
            String as1[] = file.list();
            for (int i1 = 0; i1 < as1.length; i1++)
            {
                if (!a(new File(file, as1[i1])))
                {
                    return false;
                }
            }

        }
        return file.delete();
    }

    static boolean a(KikApplication kikapplication, File file)
    {
        return kikapplication.a(file);
    }

    public static int b(int i1)
    {
        return (int)((float)i1 / m);
    }

    public static String b()
    {
        return k.s();
    }

    static r b(KikApplication kikapplication)
    {
        return kikapplication.s;
    }

    public static void b(String s1)
    {
        if (k.N != null)
        {
            k.N.runOnUiThread(new kik.android.chat.k(s1));
        }
    }

    public static Bitmap c(int i1)
    {
        android.graphics.drawable.Drawable drawable = k.getApplicationContext().getResources().getDrawable(i1);
        if (drawable != null)
        {
            return ((BitmapDrawable)drawable).getBitmap();
        } else
        {
            return null;
        }
    }

    public static String c()
    {
        return DeviceUtils.b(k);
    }

    static b c(KikApplication kikapplication)
    {
        return kikapplication.T;
    }

    public static int d(int i1)
    {
        return k.getApplicationContext().getResources().getDimensionPixelSize(i1);
    }

    static Handler d(KikApplication kikapplication)
    {
        return kikapplication.X;
    }

    public static bo d()
    {
        return k.S;
    }

    public static int e(int i1)
    {
        return k.getApplicationContext().getResources().getColor(i1);
    }

    public static void e()
    {
        if (l != null)
        {
            l.a();
        }
    }

    static boolean e(KikApplication kikapplication)
    {
        return kikapplication.x;
    }

    public static String f(int i1)
    {
        return k.getApplicationContext().getResources().getString(i1);
    }

    static boolean f(KikApplication kikapplication)
    {
        kikapplication.x = false;
        return false;
    }

    static kik.a.f.k g(KikApplication kikapplication)
    {
        return kikapplication.D;
    }

    public static void g()
    {
        if (l != null)
        {
            l.a(true);
        }
    }

    static kik.a.e.f h(KikApplication kikapplication)
    {
        return kikapplication.C;
    }

    public static void h()
    {
        if (l != null)
        {
            l.c();
        }
    }

    static kik.a.e.v i(KikApplication kikapplication)
    {
        return kikapplication.A;
    }

    public static b i()
    {
        return k.T;
    }

    static com.kik.l.ab j(KikApplication kikapplication)
    {
        return kikapplication.B;
    }

    static bo k(KikApplication kikapplication)
    {
        return kikapplication.S;
    }

    static kik.a.ab l(KikApplication kikapplication)
    {
        return kikapplication.H;
    }

    static com.kik.g.i m(KikApplication kikapplication)
    {
        return kikapplication.ap;
    }

    static f n(KikApplication kikapplication)
    {
        return kikapplication.p;
    }

    static TimerTask o(KikApplication kikapplication)
    {
        return kikapplication.au;
    }

    static Timer p(KikApplication kikapplication)
    {
        return kikapplication.u;
    }

    static KikNotificationHandler p()
    {
        return l;
    }

    static KikApplication q()
    {
        return k;
    }

    static void q(KikApplication kikapplication)
    {
        kikapplication.K.d();
    }

    static w r(KikApplication kikapplication)
    {
        return kikapplication.E;
    }

    private void r()
    {
        if (K != null && E != null)
        {
            K.a(E.d().c);
        }
    }

    private String s()
    {
        if (P == null)
        {
            synchronized (q)
            {
                if (P == null)
                {
                    P = ac.c().getString("kik.deviceid", null);
                    if (P == null)
                    {
                        P = UUID.randomUUID().toString().replace("-", "");
                        android.content.SharedPreferences.Editor editor = ac.c().edit();
                        editor.putString("kik.deviceid", P);
                        editor.commit();
                    }
                }
            }
        }
        return P;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static x s(KikApplication kikapplication)
    {
        return kikapplication.K;
    }

    static void t(KikApplication kikapplication)
    {
        kikapplication.r();
    }

    private boolean t()
    {
        return M != L;
    }

    static k u(KikApplication kikapplication)
    {
        return kikapplication.Y;
    }

    static kik.android.b.a v(KikApplication kikapplication)
    {
        return kikapplication.V;
    }

    static k w(KikApplication kikapplication)
    {
        return kikapplication.aa;
    }

    static boolean x(KikApplication kikapplication)
    {
        kikapplication.v = true;
        return true;
    }

    static ce y(KikApplication kikapplication)
    {
        return kikapplication.ac;
    }

    public final com.kik.e.a a()
    {
        return G;
    }

    public final void a(Activity activity)
    {
        y = activity;
    }

    protected final void a(kik.a.d.s s1)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        boolean flag6 = c(s1.i());
        obj = s.a(s1.h(), true);
        Object obj2 = s.a(s1.i(), false);
        Object obj1 = r.a(s1.i());
        boolean flag5 = ((kik.a.d.k) (obj)).l();
        double d1;
        double d2;
        kik.a.d.a.a a1;
        int i1;
        boolean flag;
        boolean flag1;
        boolean flag3;
        boolean flag4;
        boolean flag7;
        if (obj2 != null && (obj2 instanceof n))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (obj1 == null || ((kik.a.d.f) (obj1)).c().size() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag7 = s1.i().startsWith("kikteam@");
        if (obj1 != null && ((kik.a.d.f) (obj1)).n())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (obj2 != null && ((kik.a.d.k) (obj2)).i())
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        obj = s1.a();
        if (obj != null)
        {
            i1 = kik.a.h.i.f(((String) (obj)));
        } else
        {
            i1 = 0;
        }
        d2 = 0.0D;
        d1 = d2;
        if (obj1 != null)
        {
            d1 = d2;
            if (((kik.a.d.f) (obj1)).c().size() > 0)
            {
                d1 = (double)(kik.a.h.j.b() - ((kik.a.d.s)((kik.a.d.f) (obj1)).c().lastElement()).e()) / 1000D;
            }
        }
        obj2 = b.b("Message Received");
        obj1 = by.a(((com.kik.android.a.f) (obj2)), flag7, flag1, flag3, flag4, d1, i1).a("Is Contact", flag5).a("Is Chat Open", flag6).a("Is First Message in Chat", flag);
        if (s1.o() != null || s1.k())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((com.kik.android.a.f) (obj1)).a("Is Encrypted", flag1).a("Is Decryption Failure", s1.k());
        a1 = (kik.a.d.a.a)kik.a.d.a.g.a(s1, kik/a/d/a/a);
        if (a1 == null)
        {
            if (obj != null)
            {
                by.a(((com.kik.android.a.f) (obj2)), ((String) (obj)));
            }
        } else
        {
            String s2;
            String s4;
            boolean flag2;
            if (obj != null && ((String) (obj)).trim().length() != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            s2 = a1.t().a();
            s4 = kik.android.util.ae.c(a1);
            obj = s2;
            if (s2.length() == 0)
            {
                if (s4.equals("Camera") || s4.equals("Gallery"))
                {
                    obj = kik.a.d.a.a.b.b.a();
                } else
                {
                    obj = kik.a.d.a.a.b.c.a();
                }
            }
            by.a(((com.kik.android.a.f) (obj2)), s4, flag2, ((String) (obj)), a1);
        }
        if (s1.o() != null)
        {
            ((com.kik.android.a.f) (obj2)).a("Decryption Time", (double)s1.p() / 1000D);
        }
        ((com.kik.android.a.f) (obj2)).b();
        b.b("App Session Ended").a("Messages Received");
        b.g("Messages Received in Last 7 Days", s1.b());
        if (s1 != null)
        {
            obj = (kik.a.d.a.a)kik.a.d.a.g.a(s1, kik/a/d/a/a);
            if (obj != null)
            {
                if (!((kik.a.d.a.a) (obj)).n())
                {
                    break; /* Loop/switch isn't completed */
                }
                b.g("Stickers Received in Last 7 Days", s1.b());
            }
        }
_L4:
        if (!flag5 && flag)
        {
            b.g("Received New People in Last 7 Days", s1.h());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        String s3 = ((kik.a.d.a.a) (obj)).u();
        if (s3 != null)
        {
            if ("com.kik.ext.camera".equals(s3))
            {
                b.g("Camera Pictures Received in Last 7 Days", s1.b());
            } else
            if ("com.kik.ext.gallery".equals(s3))
            {
                b.g("Gallery Pics Received in Last 7 Days", s1.b());
            } else
            if ("com.kik.ext.video-camera".equals(s3))
            {
                b.g("Camera Videos Received In Last 7 Days", s1.b());
            } else
            if ("com.kik.ext.video-gallery".equals(s3))
            {
                b.g("Gallery Videos Received In Last 7 Days", s1.b());
            } else
            if ("com.kik.cards".equals(s3))
            {
                if (((kik.a.d.a.a) (obj)).m().isEmpty())
                {
                    b.g("Web Pages Received in Last 7 Days", s1.b());
                } else
                {
                    b.g("Cards Received in Last 7 Days", s1.b());
                }
            } else
            {
                b.g("Native Sdk Content Received in Last 7 Days", s1.b());
            }
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void b(Activity activity)
    {
        if (y == activity)
        {
            y = null;
        }
    }

    public final void c(Activity activity)
    {
        if (N == activity)
        {
            if (R != null)
            {
                R.cancel();
                R = null;
            }
            N = null;
            R = new kik.android.chat.v(this);
            Q.schedule(R, 20000L);
        }
    }

    public final boolean c(String s1)
    {
        Object obj = N;
        if (obj != null && (obj instanceof FragmentWrapperActivity) && ((Activity) (obj)).hasWindowFocus())
        {
            obj = ((FragmentWrapperActivity)obj).a();
            if ((obj instanceof KikChatFragment) && ((KikChatFragment)obj).i().b().equals(s1))
            {
                return true;
            }
        }
        return false;
    }

    public final void d(Activity activity)
    {
        if (N == null && v)
        {
            long l2 = kik.a.h.j.b();
            long l1 = kik.a.h.j.c();
            HashMap hashmap = new HashMap();
            if (Long.valueOf(l1).longValue() == -1L)
            {
                hashmap.put("ctime", "true");
            }
            HashMap hashmap1 = new HashMap();
            if (w)
            {
                l1 = 1L;
            } else
            {
                l1 = 0L;
            }
            hashmap1.put("s", Long.valueOf(l1));
            T.c().a(com.kik.d.b.a.k.k, hashmap, null, hashmap1, Long.valueOf(l2).longValue());
            if (!z)
            {
                z = true;
                b.b("App Opened").a("Cold Start", ab).b();
                ab = false;
                if (!b.e("App Session Ended", ""))
                {
                    b.b("App Opened", true);
                    b.b("App Session Started").b();
                } else
                {
                    b.b("App Opened", false);
                }
            }
            I.c();
            v = false;
            w = false;
        }
        if (N == null)
        {
            Z.a(Boolean.valueOf(true));
        }
        N = activity;
        if (R != null)
        {
            R.cancel();
            R = null;
        }
    }

    public final void f()
    {
        Y.a(null);
    }

    public final void j()
    {
        startService(new Intent(this, kik/android/net/communicator/CommunicatorService));
    }

    protected final void k()
    {
        long l1 = A.o("kik.registrationtime").longValue();
        if (l1 != 0L)
        {
            long l2 = kik.a.h.j.b();
            b.a("Time Since Registration", (double)(l2 - l1) / 1000D);
        }
    }

    protected final void l()
    {
        boolean flag1 = true;
        if (!z)
        {
            return;
        }
        z = false;
        boolean flag2 = kik.a.z.a(A);
        com.kik.android.a.f f2 = b.b("App Closed");
        float f1;
        boolean flag;
        if (!flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f2.a("Before Registration", flag).b();
        b.b("App Closed", true);
        f1 = (float)b.b("App Opened", "App Closed") / 1000F;
        f2 = b.c("App Session Ended").b("Messages Received", 0L);
        if (!flag2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        f2.a("Before Registration", flag).a("Total Time", f1).b();
        T.c().a(com.kik.d.b.a.k.Y, kik.a.h.j.b());
    }

    public final l m()
    {
        return W;
    }

    public final boolean n()
    {
        return v;
    }

    public final com.kik.g.e o()
    {
        return aa.a();
    }

    public void onCreate()
    {
        super.onCreate();
        kik.android.util.s.a();
        b.a.a.a.d.a(this, new b.a.a.a.l[] {
            new com.a.a.a()
        });
        Security.addProvider(new BouncyCastleProvider());
        new kik.android.chat.l(this);
        Context context = getApplicationContext();
        DeviceUtils.a(context);
        cj.a(context);
        t.start();
        new kik.android.chat.n(this);
        O = new com.kik.cards.util.a();
        p.a(O.a(), af);
        n = DeviceUtils.b(k);
        float f1 = getResources().getDisplayMetrics().density;
        m = f1;
        if (f1 == 0.0F)
        {
            m = 1.0F;
        }
        l = new KikNotificationHandler(this);
        J = new h(this);
        K = new x(J);
        a(context, K.a());
    }

}
