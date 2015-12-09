// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.ai;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ab;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.af;
import com.pandora.radio.data.o;
import com.pandora.radio.data.y;
import com.pandora.radio.util.NetworkUtil;
import com.pandora.radio.util.k;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;
import p.by.d;
import p.by.e;
import p.by.f;
import p.by.g;
import p.by.h;
import p.dd.ag;
import p.dd.ap;
import p.dd.at;
import p.dd.au;
import p.dd.ay;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;
import p.dd.be;
import p.dd.bg;
import p.dd.bh;
import p.dd.x;
import p.dg.a;
import p.dg.j;
import p.di.u;
import p.di.z;

// Referenced classes of package com.pandora.android.eureka:
//            f, a

public class c
    implements com.pandora.android.util.ai.a, p.by.f.a, p.by.f.b, p.dg.a
{
    private class a
        implements Runnable
    {

        final c a;
        private final y b;
        private final String c;
        private final boolean d;
        private final p.cw.b.b e;
        private final Object f;

        public void run()
        {
            boolean flag = a.a(b);
            com.pandora.android.eureka.c.a(a).x().a("CURRENT_STATION_TOKEN", b.c());
            a.c(a.t());
            a.b(b);
            c.c("PandoraService.stationStart(): starting station");
            p.dd.ay.a a1;
            if (flag)
            {
                a1 = p.dd.ay.a.b;
            } else
            {
                a1 = p.dd.ay.a.a;
            }
            com.pandora.android.eureka.c.a(a).a(new ay(b, a1, f));
            com.pandora.android.eureka.c.a(a).a(new at(b));
            a.a(p.cw.b.a.b);
            if (!flag && a.E())
            {
                if (a.a != null)
                {
                    a.a.a(com.pandora.android.eureka.c.a(a).l().f(), b, null, e, com.pandora.android.eureka.c.a(a).d().getTrackElapsedTimeEvent().a, com.pandora.android.eureka.c.a(a).l().g());
                }
                return;
            }
            c.c("Waiting to see if we reconnect");
            if (com.pandora.android.eureka.c.d(a) != null)
            {
                a.b = com.pandora.android.eureka.c.d(a).f();
            }
            if (a.b != null)
            {
                String s2 = a.b.d();
                a.b.a(true);
                p.cw.c c1 = com.pandora.android.eureka.c.a(a);
                StringBuilder stringbuilder = (new StringBuilder()).append("Attempting to reconnect to ");
                String s1 = s2;
                if (s2 == null)
                {
                    s1 = "Chromecast";
                }
                c1.a(new p.dd.j(stringbuilder.append(s1).toString()));
                (new Timer()).schedule(new TimerTask(this) {

                    final a a;

                    public void run()
                    {
                        if (!com.pandora.android.eureka.c.e(a.a))
                        {
                            c.c("session didn't connect - disconnect");
                            a.a.d(false);
                            a.a.j();
                        }
                    }

            
            {
                a = a1;
                super();
            }
                }, 5000L);
                return;
            } else
            {
                a.j();
                return;
            }
        }

        public a(y y1, String s1, boolean flag, p.cw.b.b b1, Object obj)
        {
            a = c.this;
            super();
            b = y1;
            c = s1;
            d = flag;
            e = b1;
            f = obj;
        }
    }


    protected com.pandora.android.eureka.f a;
    protected e b;
    protected String c;
    private Handler d;
    private boolean e;
    private f f;
    private h g;
    private p.cw.c h;
    private aa i;
    private int j;
    private double k;
    private boolean l;
    private y m;
    private y n;
    private Timer o;
    private int p;
    private double q;
    private j r;
    private boolean s;

    public c(p.cw.c c1, Context context)
    {
        a = null;
        f = null;
        g = null;
        i = null;
        l = false;
        m = null;
        n = null;
        p = 0;
        q = 0.050000000000000003D;
        s = false;
        c = null;
        h = c1;
        d = Z();
        r = new j(c1);
        f = new d(P(), c1.k(), context);
        b = new e(c1.k());
    }

    private Handler Z()
    {
        return new Handler(Looper.getMainLooper());
    }

    static int a(c c1, int i1)
    {
        c1.p = i1;
        return i1;
    }

    static Timer a(c c1, Timer timer)
    {
        c1.o = timer;
        return timer;
    }

    static p.cw.c a(c c1)
    {
        return c1.h;
    }

    private void aa()
    {
        i();
        if (o == null)
        {
            o = new Timer();
            o.schedule(new TimerTask() {

                final c a;

                public void run()
                {
                    com.pandora.android.eureka.c.b(a).cancel();
                    com.pandora.android.eureka.c.a(a, null);
                    if (c.c(a) < 2)
                    {
                        if (!a.E())
                        {
                            c.c("haven't gotten a status update - trying again");
                            (new Handler(Looper.getMainLooper())).post(new Runnable(this) {

                                final _cls2 a;

                                public void run()
                                {
                                    a.a.a(false);
                                }

            
            {
                a = _pcls2;
                super();
            }
                            });
                        }
                        return;
                    } else
                    {
                        com.pandora.android.eureka.c.a(a, 0);
                        c.c("never got any status updates - disconnecting");
                        com.pandora.android.eureka.c.d(a).d();
                        return;
                    }
                }

            
            {
                a = c.this;
                super();
            }
            }, 6000L);
        }
    }

    private boolean ab()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (f == null)
            {
                break label0;
            }
            e e1 = f.f();
            flag = flag1;
            if (e1 == null)
            {
                break label0;
            }
            flag = flag1;
            if (e1.e() == null)
            {
                break label0;
            }
            flag = flag1;
            if (e1.e().isEmpty())
            {
                break label0;
            }
            if (!f.b())
            {
                flag = flag1;
                if (!f.c())
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    private static double b(double d1)
    {
        return (new BigDecimal(d1)).setScale(2, 4).doubleValue();
    }

    static Timer b(c c1)
    {
        return c1.o;
    }

    static int c(c c1)
    {
        int i1 = c1.p;
        c1.p = i1 + 1;
        return i1;
    }

    static void c(String s1)
    {
        d(s1);
    }

    private void c(JSONObject jsonobject)
    {
        if (!jsonobject.has("volume"))
        {
            break MISSING_BLOCK_LABEL_43;
        }
        jsonobject = jsonobject.getJSONObject("volume");
        q = jsonobject.optDouble("increment", q);
        k = b(jsonobject.getDouble("level"));
        return;
        jsonobject;
        p.df.a.b("EurekaPlayer", "Problem handling volume from status: ", jsonobject);
        return;
    }

    static f d(c c1)
    {
        return c1.f;
    }

    private static void d(String s1)
    {
        p.df.a.c("EurekaPlayer", (new StringBuilder()).append("PANDCAST PLAYER: ").append(s1).toString());
    }

    static boolean e(c c1)
    {
        return c1.ab();
    }

    public boolean A()
    {
        return true;
    }

    public void B()
    {
        if (!e)
        {
            e = true;
            h.b(this);
            if (!s)
            {
                s = true;
                a(p.cw.b.a.a);
                return;
            }
        }
    }

    public void C()
    {
        if (!e)
        {
            return;
        } else
        {
            e = false;
            h.c(this);
            return;
        }
    }

    public boolean D()
    {
        return e;
    }

    public boolean E()
    {
        if (f != null)
        {
            return f.b();
        } else
        {
            return false;
        }
    }

    public boolean F()
    {
        if (f != null)
        {
            return f.c();
        } else
        {
            return false;
        }
    }

    public boolean G()
    {
        boolean flag = false;
        if (E())
        {
            a.e();
            flag = true;
        }
        return flag;
    }

    public void H()
    {
        if (E())
        {
            a.a();
        }
    }

    public void I()
    {
        if (E())
        {
            a.b();
        }
    }

    public void J()
    {
        if (E())
        {
            a.c();
        }
    }

    public boolean K()
    {
        if (E())
        {
            p.df.a.c("EurekaPlayer", "incrementing casting volume");
            double d1 = Math.min(k + q, 1.0D);
            a.a(d1);
            k = d1;
            L();
            return true;
        } else
        {
            return false;
        }
    }

    protected void L()
    {
        Object obj = b.a.b().j();
        long l1 = ((o) (obj)).A();
        long l2 = System.currentTimeMillis();
        if (com.pandora.android.eureka.a.a(l1, 0x2bf20L))
        {
            ((o) (obj)).b(l2);
            k k1 = h.o();
            com.pandora.radio.util.k.g g1 = com.pandora.radio.util.k.g.d;
            if (h.d().o())
            {
                obj = "play";
            } else
            {
                obj = "pause";
            }
            k1.a(g1, ((String) (obj)), null);
        }
    }

    public boolean M()
    {
        if (E())
        {
            p.df.a.c("EurekaPlayer", "decrementing casting volume");
            double d1 = Math.max(k - q, 0.0D);
            a.a(d1);
            k = d1;
            L();
            return true;
        } else
        {
            return false;
        }
    }

    protected boolean N()
    {
        return l;
    }

    protected y O()
    {
        return n;
    }

    public h P()
    {
        if (g == null)
        {
            g = new h() {

                final c a;

                public void a(g g1)
                {
                    c.c("Connection Succeeded - starting player");
                    c.c((new StringBuilder()).append("Was reconnect: ").append(g1.a).toString());
                    a.a(g1.a);
                    ai.a().a(a);
                    g1 = new PandoraIntent("hide_banner_ad");
                    b.a.C().a(g1);
                    b.a.e().a(new p.bz.f(true, a.R()));
                }

                public void b(g g1)
                {
                    if (com.pandora.android.eureka.c.a(a) == null)
                    {
                        return;
                    }
                    c.c("Connection Terminated");
                    if (com.pandora.android.eureka.c.d(a) != null && a.R() != null && !a.R().isEmpty())
                    {
                        com.pandora.android.eureka.c.a(a).a(new p.dd.j((new StringBuilder()).append("Your cast session with ").append(a.R()).append(" has ended.").toString()));
                    } else
                    {
                        com.pandora.android.eureka.c.a(a).a(new p.dd.j("Your cast session has ended."));
                    }
                    a.j();
                    ai.a().b(a);
                    a.d(false);
                    b.a.e().a(new p.bz.f(false, null));
                }

            
            {
                a = c.this;
                super();
            }
            };
        }
        return g;
    }

    public e Q()
    {
        if (f != null)
        {
            b = f.f();
        }
        return b;
    }

    public String R()
    {
        if (f != null)
        {
            return f.g();
        } else
        {
            return null;
        }
    }

    public void S()
    {
        if (f != null)
        {
            f.a();
        }
    }

    public void T()
    {
        if (f != null)
        {
            f.d();
        }
        a = null;
    }

    public boolean U()
    {
        if (f != null)
        {
            return f.h();
        } else
        {
            return true;
        }
    }

    public boolean V()
    {
        boolean flag1 = false;
        if (f != null)
        {
            b = f.f();
        }
        boolean flag = flag1;
        if (h.u().c())
        {
            flag = flag1;
            if (b != null)
            {
                e e1 = b;
                flag = flag1;
                if (e1 != null)
                {
                    flag = flag1;
                    if (!e1.f())
                    {
                        flag = flag1;
                        if (e1.e() != null)
                        {
                            flag = flag1;
                            if (!e1.e().isEmpty())
                            {
                                flag = flag1;
                                if ((new Date()).getTime() - e1.g() < 0x112a880L)
                                {
                                    flag = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        StringBuilder stringbuilder = (new StringBuilder()).append("session active: ");
        String s1;
        if (flag)
        {
            s1 = "TRUE";
        } else
        {
            s1 = "FALSE";
        }
        d(stringbuilder.append(s1).toString());
        return flag;
    }

    public boolean W()
    {
        return false;
    }

    public void X()
    {
    }

    public boolean Y()
    {
        return false;
    }

    public void a()
    {
    }

    public void a(double d1)
    {
        p.df.a.c("EurekaPlayer", (new StringBuilder()).append("overwriting currentDeviceVolume ").append(k).append(" with volume from chromecast").append(d1).toString());
        k = b(d1);
    }

    protected void a(com.pandora.android.eureka.f f1)
    {
        a = f1;
    }

    public void a(aa aa1)
    {
        if (s().w().equals(aa1.w()))
        {
            G();
            return;
        } else
        {
            h.a(new be(true));
            (new z()).doInBackground(new Object[] {
                aa1
            });
            return;
        }
    }

    public void a(ac ac)
    {
    }

    public void a(y y1, String s1, boolean flag, p.cw.b.b b1, Object obj)
    {
        if (!s)
        {
            d("Player.start() called after player shutdown");
            return;
        }
        com.pandora.android.eureka.a a1 = b.a.c();
        if (a1 != null && !a1.a(y1))
        {
            a1.b();
            return;
        } else
        {
            d.post(new a(y1, s1, flag, b1, obj));
            return;
        }
    }

    public void a(String s1)
    {
        try
        {
            s1 = new URI(s1);
            f = new p.by.a(P(), s1);
            f.a(this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            p.df.a.b("EurekaPlayer", s1.toString(), s1);
        }
    }

    public void a(String s1, String s2)
    {
    }

    public void a(String s1, String s2, Bundle bundle)
    {
        if (f != null)
        {
            f.a(s1, s2, bundle);
        }
    }

    public void a(JSONObject jsonobject)
    {
        Object obj;
        obj = null;
        i();
        p = 0;
        if (a != null)
        {
            a.b(jsonobject.toString());
        }
        if (!jsonobject.has("status"))
        {
            d("NOT STATUS");
            return;
        }
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        String s1;
        jsonobject1 = jsonobject.getJSONObject("status");
        if (!jsonobject1.has("content_info"))
        {
            break MISSING_BLOCK_LABEL_554;
        }
        jsonobject2 = jsonobject1.getJSONObject("content_info");
        c(jsonobject1);
        if (!jsonobject2.has("userId"))
        {
            break MISSING_BLOCK_LABEL_201;
        }
        s1 = jsonobject2.get("userId").toString();
        jsonobject = obj;
        long l1;
        long l2;
        if (b.a.d() != null)
        {
            jsonobject = b.a.d().d();
        }
        if (s1.equals(jsonobject))
        {
            break MISSING_BLOCK_LABEL_187;
        }
        l1 = System.currentTimeMillis();
        l2 = b.g();
        if (!N() || l1 - l2 > 6000L)
        {
            try
            {
                f.e();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                p.df.a.c("EurekaPlayer", jsonobject.getMessage(), jsonobject);
            }
            return;
        }
        break MISSING_BLOCK_LABEL_554;
        c(false);
        jsonobject2.remove("userId");
        if (jsonobject2.has("cast_message"))
        {
            h.a(new p.dd.j(jsonobject2.get("cast_message").toString()));
        }
        if (jsonobject2.has("cast_error_code") && jsonobject2.get("cast_error_code").toString().equals("1038") && O() != null)
        {
            h.a(new ay(O(), p.dd.ay.a.a));
            h.a(new at(O()));
            h.a(new bh(p.dd.bh.a.b, s(), true, null));
            b(O());
        }
        if (jsonobject2.has("skip_limit_triggered"))
        {
            h.a(new ap(p.cw.d.a.b, s(), "MOBILE"));
        }
        if (jsonobject2.has("listening_timeout_triggered"))
        {
            h.a(new x());
        }
        b(jsonobject2);
        int i1 = jsonobject1.getInt("state");
        if (i1 != j && s() != null)
        {
            j = i1;
            if (j != 2)
            {
                break MISSING_BLOCK_LABEL_522;
            }
            d("playing");
            h.a(new bh(p.dd.bh.a.c, s(), true, null));
        }
_L2:
        if (jsonobject1.getInt("duration") > 0)
        {
            h.a(new bg(jsonobject1.getInt("position"), jsonobject1.getInt("duration") * 1000));
            return;
        }
        break MISSING_BLOCK_LABEL_554;
        d("paused");
        h.a(new bh(p.dd.bh.a.d, s(), true, null));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a(f f1)
    {
        f = f1;
    }

    public void a(p.cw.b.a a1)
    {
        if (h != null && e)
        {
            d("setting state");
            h.a(new ag(a1, t()));
            return;
        } else
        {
            d("not setting state");
            return;
        }
    }

    public void a(p.cw.b.c c1)
    {
        I();
        a(p.cw.b.a.b);
    }

    public void a(boolean flag)
    {
        a(flag, ((f) (null)));
    }

    public void a(boolean flag, String s1)
    {
        f();
    }

    public void a(boolean flag, f f1)
    {
        if (!E())
        {
            return;
        }
        if (f1 != null)
        {
            a(f1);
        }
        a(h());
        f.a();
        aa();
        d("Casting Station");
        b(h.d().t());
        b(h.d().s());
        if (!flag && t() != null && s() != null && a != null)
        {
            c = s().w();
            a.a(h.l().f(), t(), s(), p.cw.b.b.c, h.d().getTrackElapsedTimeEvent().a, h.l().g());
            c(true);
        } else
        {
            c(false);
        }
        h.a(new p.dd.k(true));
        (new Handler(Looper.getMainLooper())).post(new Runnable(this) {

            final c a;
            final c b;

            public void run()
            {
                com.pandora.android.eureka.c.a(b).a(a);
            }

            
            {
                b = c.this;
                a = c2;
                super();
            }
        });
    }

    public boolean a(y y1)
    {
        return y1 != null && m != null && m.c().equals(y1.c());
    }

    public void b()
    {
        if (o())
        {
            b(p.cw.b.c.a);
            return;
        } else
        {
            a(p.cw.b.c.a);
            return;
        }
    }

    protected void b(aa aa1)
    {
        i = aa1;
    }

    public void b(ac ac)
    {
    }

    protected void b(y y1)
    {
        m = y1;
    }

    public void b(String s1)
    {
        H();
    }

    public void b(JSONObject jsonobject)
        throws JSONException
    {
label0:
        {
            long l1;
            if (t() != null)
            {
                l1 = t().b();
            } else
            {
                l1 = 0L;
            }
            if (jsonobject.optString("adToken", null) != null)
            {
                com.pandora.radio.data.d d1 = new com.pandora.radio.data.d(l1, jsonobject.optString("adToken", ""));
                d1.a(jsonobject.optString("title", ""), jsonobject.optString("companyName", ""), jsonobject.optString("artUrl", ""), jsonobject.optString("clickThroughUrl", ""), null, null, jsonobject.optString("trackGain", ""), null);
                jsonobject = d1;
            } else
            {
                jsonobject.put("stationId", t().h());
                jsonobject = com.pandora.radio.data.ab.a(l1, jsonobject);
            }
            if (c != null)
            {
                if (!jsonobject.w().equals(c))
                {
                    break label0;
                }
                c = null;
            }
            if (!jsonobject.equals(s()))
            {
                h.a(new bh(p.dd.bh.a.e, s(), true, null));
                b(((aa) (jsonobject)));
                h.a(new bh(p.dd.bh.a.b, s(), true, null));
                h.a(new bh(p.dd.bh.a.c, s(), true, null));
                if (!s().M())
                {
                    (new u()).execute(new Object[] {
                        s().w()
                    });
                }
            } else
            if (jsonobject.E() != s().E())
            {
                int i1 = jsonobject.E();
                s().b(i1);
                if (i1 == 1)
                {
                    h.a(new bd(p.cw.d.a.a, s(), false));
                    return;
                }
                if (i1 == -1)
                {
                    h.a(new bb(p.cw.d.a.a, s(), false));
                    return;
                }
                if (i1 == 0)
                {
                    h.a(new bc(s(), i1, false));
                    return;
                }
            }
        }
    }

    public void b(p.cw.b.a a1)
    {
    }

    public void b(p.cw.b.c c1)
    {
        d("pause?");
        J();
        a(p.cw.b.a.c);
    }

    public void b(boolean flag)
    {
    }

    public void c()
    {
label0:
        {
            if (E())
            {
                if (i == null || i.E() != 1)
                {
                    break label0;
                }
                a.g();
            }
            return;
        }
        a.d();
    }

    protected void c(y y1)
    {
        n = y1;
    }

    protected void c(boolean flag)
    {
        l = flag;
    }

    public void d()
    {
label0:
        {
            if (E())
            {
                if (i == null || i.E() != -1)
                {
                    break label0;
                }
                a.g();
            }
            return;
        }
        a.f();
    }

    public void d(y y1)
    {
        m = y1;
    }

    public void d(boolean flag)
    {
        if (f != null)
        {
            f.a(flag);
        }
    }

    public boolean e()
    {
        return false;
    }

    public void f()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        a.c();
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        illegalstateexception.printStackTrace();
        return;
    }

    public void g()
    {
        f = new d(P(), h.k(), b.a.h());
        f.a(this);
        f.a(this);
    }

    public bg getTrackElapsedTimeEvent()
    {
        if (a != null)
        {
            return new bg((int)a.j(), (int)a.k() * 1000);
        } else
        {
            return new bg(0, 0);
        }
    }

    protected com.pandora.android.eureka.f h()
    {
        return new com.pandora.android.eureka.f(f, this);
    }

    protected void i()
    {
        if (o != null)
        {
            o.cancel();
            o = null;
        }
    }

    public void j()
    {
        d("stop cast");
        h.a(new p.dd.k(false));
    }

    public void k()
    {
        if (e)
        {
            h.c(this);
        }
        r.a();
        s = false;
        h = null;
        r = null;
    }

    public void l()
    {
    }

    public boolean m()
    {
        return o();
    }

    public boolean n()
    {
        return false;
    }

    public boolean o()
    {
        return a != null && a.i() != 0 && a.i() == 2;
    }

    public void onStationPersonalizationChanged(au au1)
    {
        a.h();
        if (au1.a != null && au1.a.h().equals(m.h()))
        {
            au1.a.a(m.b());
            m = au1.a;
            h.a(new at(m));
        }
    }

    public boolean p()
    {
        return a != null && a.i() != 0 && a.i() == 3;
    }

    public p.bz.f produceChromecastConnectedAppEvent()
    {
        return new p.bz.f(f.b(), R());
    }

    public at produceStationDataEvent()
    {
        y y1;
        if (t() == null)
        {
            y1 = null;
        } else
        {
            y1 = t();
        }
        return new at(y1);
    }

    public bh produceTrackStateEvent()
    {
        if (s() == null)
        {
            return new bh(p.dd.bh.a.a, s(), false, null);
        }
        if (j == 2)
        {
            return new bh(p.dd.bh.a.c, s(), true, null);
        } else
        {
            return new bh(p.dd.bh.a.d, s(), true, null);
        }
    }

    public boolean q()
    {
        return false;
    }

    public void r()
    {
    }

    public aa s()
    {
        return i;
    }

    public y t()
    {
        return m;
    }

    public p.cw.b.a u()
    {
        if (o())
        {
            return p.cw.b.a.b;
        }
        if (p())
        {
            return p.cw.b.a.c;
        } else
        {
            return p.cw.b.a.e;
        }
    }

    public p.cw.b.a v()
    {
        return null;
    }

    public int w()
    {
        return 0;
    }

    public void x()
    {
    }

    public void y()
    {
    }

    public boolean z()
    {
        return true;
    }
}
