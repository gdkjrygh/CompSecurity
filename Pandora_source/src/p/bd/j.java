// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bd;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.ax.a;
import p.bg.aa;
import p.bg.ac;
import p.bg.ad;
import p.bg.ae;
import p.bg.af;
import p.bg.ag;
import p.bg.ah;
import p.bg.ai;
import p.bg.aj;
import p.bg.ak;
import p.bg.al;
import p.bg.an;
import p.bg.ao;
import p.bg.ap;
import p.bg.aq;
import p.bg.ar;
import p.bg.as;
import p.bg.au;
import p.bg.av;
import p.bg.ax;
import p.bg.ay;
import p.bg.az;
import p.bg.ba;
import p.bg.bb;
import p.bg.bc;
import p.bg.be;
import p.bg.bf;
import p.bg.bh;
import p.bg.bj;
import p.bg.bl;
import p.bg.bm;
import p.bg.bq;
import p.bg.bt;
import p.bg.bu;
import p.bg.bv;
import p.bg.bx;
import p.bg.bz;
import p.bg.ca;
import p.bg.cb;
import p.bg.cc;
import p.bg.cd;
import p.bg.f;
import p.bg.i;
import p.bg.l;
import p.bg.m;
import p.bg.o;
import p.bg.q;
import p.bg.r;
import p.bg.t;
import p.bg.u;
import p.bg.x;
import p.bg.y;
import p.bh.g;
import p.bh.h;
import p.bh.n;
import p.bh.s;
import p.bh.v;
import p.bh.w;
import p.bj.c;
import p.bk.e;
import p.bl.b;
import p.bn.d;

// Referenced classes of package p.bd:
//            c, g, a, d, 
//            b, k, f, e

public abstract class j
{
    private class a
        implements p.bj.a
    {

        final j a;

        public void a(byte byte0)
        {
            p.bn.d.c("Heartbeat timeout");
            Intent intent = p.bd.j.a(a);
            p.bd.j.a(a, intent, "FUNCTION_NAME", "onHeartbeatTimedOut");
            p.bd.j.a(a, intent, "COMMENT1", (new StringBuilder()).append("Heartbeat timeout for SessionID: ").append(byte0).toString());
            p.bd.j.a(a, intent);
            a.a("Heartbeat timeout", new p.ax.a("Heartbeat timeout", p.ax.b.d), w.o);
        }

        public void a(String s1)
        {
            if (a.c.booleanValue())
            {
                return;
            } else
            {
                a.a(s1, new p.ax.a("Transport disconnected.", p.ax.b.o), w.n);
                return;
            }
        }

        public void a(String s1, Exception exception)
        {
            p.bn.d.a((new StringBuilder()).append("Transport failure: ").append(s1).toString(), exception);
            if (a.c.booleanValue())
            {
                a.a(w.k);
                return;
            } else
            {
                a.a(s1, exception, w.k);
                return;
            }
        }

        public void a(p.ba.f f1)
        {
            if (f1.c() != null && f1.c().length > 0 || f1.d() != null && f1.d().length > 0)
            {
                p.bd.j.a(a, f1);
            }
        }

        public void a(p.bb.e e1, byte byte0, byte byte1, String s1)
        {
            Intent intent = p.bd.j.a(a);
            p.bd.j.a(a, intent, "FUNCTION_NAME", "onProtocolSessionStarted");
            p.bd.j.a(a, intent, "COMMENT1", (new StringBuilder()).append("SessionID: ").append(byte0).toString());
            p.bd.j.a(a, intent, "COMMENT2", (new StringBuilder()).append(" SessionType: ").append(e1.b()).toString());
            p.bd.j.a(a, intent);
            p.bd.j.a(a, byte1);
            if (p.bd.j.b(a).d() != 0x7fffffff && byte1 > 2)
            {
                p.bc.a a1 = new p.bc.a();
                a1.a(p.bd.j.b(a).d());
                p.bd.j.c(a).c(a1);
            }
            if (e1.b(p.bb.e.c))
            {
                p.bd.j.a(a, byte0, s1);
            } else
            if (a.F > 1)
            {
                p.bd.j.a(a, byte0, s1);
                return;
            }
        }

        public void a(p.bb.e e1, byte byte0, String s1)
        {
        }

        public void b(String s1, Exception exception)
        {
            p.bd.j.a(a, s1, exception);
        }

        private a()
        {
            a = j.this;
            super();
        }

    }


    private static final Object L = new Object();
    private static final Object M = new Object();
    private static final Object N = new Object();
    private static final Object O = new Object();
    private static Object aq = new Object();
    protected Vector A;
    protected Vector B;
    protected Boolean C;
    protected String D;
    protected Boolean E;
    protected byte F;
    private c G;
    private p.bf.b H;
    private final int I = 65529;
    private final int J = 65530;
    private final int K = 65535;
    private Object P;
    private p.bk.f Q;
    private p.az.e R;
    private p.az.e S;
    private p.az.e T;
    private Boolean U;
    private Handler V;
    private String W;
    private long X;
    private String Y;
    private Vector Z;
    protected Service a;
    private String aa;
    private Boolean ab;
    private n ac;
    private n ad;
    private Vector ae;
    private String af;
    private String ag;
    private String ah;
    private bv ai;
    private Vector aj;
    private boolean ak;
    private p.bm.c al;
    private Boolean am;
    private p.bh.i an;
    private p.bh.b ao;
    private a ap;
    private boolean ar;
    final int b = 65531;
    protected Boolean c;
    protected Boolean d;
    protected Boolean e;
    protected Boolean f;
    protected Boolean g;
    protected Boolean h;
    protected v i;
    protected p.bh.x j;
    protected p.bh.i k;
    protected p.bh.b l;
    protected p.bh.y m;
    protected bv n;
    protected String o;
    protected n p;
    protected n q;
    protected t r;
    protected Vector s;
    protected Vector t;
    protected av u;
    protected Vector v;
    protected Vector w;
    protected Vector x;
    protected Vector y;
    protected cd z;

    protected j(p.bf.b b1, k k1, boolean flag, String s1, Vector vector, String s2, Vector vector1, 
            Boolean boolean1, bv bv1, n n1, n n2, Vector vector2, String s3, String s4, 
            boolean flag1, boolean flag2, p.bm.c c1)
        throws p.ax.a
    {
        G = null;
        H = null;
        a = null;
        P = new Object();
        Q = null;
        U = Boolean.valueOf(false);
        V = null;
        c = Boolean.valueOf(false);
        W = null;
        X = System.currentTimeMillis();
        Y = "N/A";
        Z = null;
        aa = null;
        ab = null;
        ac = null;
        ad = null;
        ae = null;
        af = null;
        ag = null;
        ah = null;
        ai = null;
        aj = null;
        ak = false;
        al = null;
        d = Boolean.valueOf(false);
        e = Boolean.valueOf(false);
        am = Boolean.valueOf(false);
        f = Boolean.valueOf(false);
        g = Boolean.valueOf(false);
        h = Boolean.valueOf(false);
        i = null;
        j = null;
        k = null;
        an = null;
        l = null;
        ao = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        C = Boolean.valueOf(true);
        D = null;
        E = Boolean.valueOf(false);
        F = 1;
        ap = null;
        ar = false;
        a(b1, k1, flag, s1, vector, s2, vector1, boolean1, bv1, n1, n2, vector2, s3, s4, flag1, Boolean.valueOf(flag2), null, null, c1);
    }

    private Intent a()
    {
        Intent intent = new Intent();
        intent.setAction("com.ford.syncV4.broadcast");
        intent.putExtra("APP_NAME", W);
        intent.putExtra("APP_ID", af);
        intent.putExtra("RPC_NAME", "");
        intent.putExtra("TYPE", "");
        intent.putExtra("SUCCESS", true);
        intent.putExtra("CORRID", 0);
        intent.putExtra("FUNCTION_NAME", "");
        intent.putExtra("COMMENT1", "");
        intent.putExtra("COMMENT2", "");
        intent.putExtra("COMMENT3", "");
        intent.putExtra("COMMENT4", "");
        intent.putExtra("COMMENT5", "");
        intent.putExtra("COMMENT6", "");
        intent.putExtra("COMMENT7", "");
        intent.putExtra("COMMENT8", "");
        intent.putExtra("COMMENT9", "");
        intent.putExtra("COMMENT10", "");
        intent.putExtra("DATA", "");
        intent.putExtra("SHOW_ON_UI", true);
        return intent;
    }

    static Intent a(j j1)
    {
        return j1.a();
    }

    static String a(j j1, String s1)
    {
        j1.ah = s1;
        return s1;
    }

    private HttpURLConnection a(y y1, String s1, int i1, int j1)
    {
        String s2;
        String s3;
        int k1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (y1 != null)
        {
            s3 = y1.a();
            k1 = y1.b().intValue();
            flag = y1.c().booleanValue();
            flag1 = y1.d().booleanValue();
            flag2 = y1.e().booleanValue();
            s2 = y1.f();
            i1 = y1.i().intValue();
            flag3 = y1.j().booleanValue();
            String s4 = y1.k();
            j1 = y1.l().intValue();
            k1 *= 1000;
            i1 *= 1000;
            y1 = s4;
        } else
        {
            k1 = i1 * 1000;
            int l1 = i1 * 1000;
            s3 = "application/json";
            flag2 = false;
            flag1 = true;
            flag = true;
            s2 = "POST";
            flag3 = false;
            y1 = "utf-8";
            i1 = k1;
            k1 = l1;
        }
        try
        {
            s1 = (HttpURLConnection)(new URL(s1)).openConnection();
            s1.setConnectTimeout(k1);
            s1.setDoOutput(flag);
            s1.setDoInput(flag1);
            s1.setRequestMethod(s2);
            s1.setReadTimeout(i1);
            s1.setInstanceFollowRedirects(flag3);
            s1.setRequestProperty("Content-Type", s3);
            s1.setRequestProperty("charset", y1);
            s1.setRequestProperty("Content-Length", (new StringBuilder()).append("").append(Integer.toString(j1)).toString());
            s1.setUseCaches(flag2);
        }
        // Misplaced declaration of an exception variable
        catch (y y1)
        {
            return null;
        }
        finally
        {
            throw y1;
        }
        return s1;
    }

    private void a(byte byte0)
    {
        F = byte0;
    }

    private void a(byte byte0, String s1)
    {
        if (c.booleanValue())
        {
            try
            {
                a(ai, W, Z, aa, aj, ab, ac, ad, ae, af, ag, Integer.valueOf(65529));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                a("Failed to register application interface with SYNC. Check parameter values given to SyncProxy constructor.", ((Exception) (s1)), w.r);
            }
            return;
        } else
        {
            b(new p.be.a("OnProxyOpened"));
            return;
        }
    }

    private void a(Intent intent)
    {
        if (H == null || !(H instanceof Service)) goto _L2; else goto _L1
_L1:
        Object obj = (Service)H;
_L6:
        obj = ((Service) (obj)).getApplicationContext();
        if (obj != null)
        {
            ((Context) (obj)).sendBroadcast(intent);
        }
_L4:
        return;
_L2:
        if (a == null) goto _L4; else goto _L3
_L3:
        obj = a;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(Intent intent, String s1, int i1)
    {
        intent.putExtra(s1, i1);
    }

    private void a(Intent intent, String s1, String s2)
    {
        String s3 = s2;
        if (s2 == null)
        {
            s3 = "";
        }
        intent.putExtra(s1, s3);
    }

    private void a(Intent intent, String s1, boolean flag)
    {
        intent.putExtra(s1, flag);
    }

    private void a(String s1, Exception exception)
    {
        d(s1, exception);
    }

    private void a(Hashtable hashtable)
    {
        String s1;
        boolean flag;
        flag = true;
        obj1 = new p.bd.c(hashtable);
        obj = ((p.bd.c) (obj1)).a();
        s1 = ((p.bd.c) (obj1)).b();
        if (!s1.equals("response")) goto _L2; else goto _L1
_L1:
        p.bk.e.a(b.b, new p.bd.g(((p.bd.c) (obj1))), "42baba60-eb57-11df-98cf-0800200c9a66");
        if (!b((new p.bd.g(hashtable)).c()))
        {
            break MISSING_BLOCK_LABEL_1130;
        }
        if ((new p.bd.g(hashtable)).c().intValue() != 65529 || !c.booleanValue() || !((String) (obj)).equals("RegisterAppInterface")) goto _L4; else goto _L3
_L3:
        hashtable = new ba(hashtable);
        if (hashtable.d().booleanValue())
        {
            d = Boolean.valueOf(true);
        }
        obj = a();
        a(((Intent) (obj)), "RPC_NAME", "RegisterAppInterface");
        a(((Intent) (obj)), "TYPE", "response");
        a(((Intent) (obj)), "SUCCESS", hashtable.d().booleanValue());
        a(((Intent) (obj)), "COMMENT1", hashtable.f());
        a(((Intent) (obj)), "COMMENT2", hashtable.e().toString());
        a(((Intent) (obj)), "DATA", a(((p.bd.c) (hashtable))));
        a(((Intent) (obj)), "CORRID", hashtable.c().intValue());
        a(((Intent) (obj)));
        o = "8675309";
        s = hashtable.m();
        r = hashtable.l();
        t = hashtable.n();
        u = hashtable.o();
        v = hashtable.p();
        w = hashtable.q();
        x = hashtable.r();
        p = hashtable.j();
        q = hashtable.k();
        n = hashtable.i();
        y = hashtable.s();
        z = hashtable.t();
        A = hashtable.u();
        D = hashtable.v();
        if (ak)
        {
            if (hashtable.e() == s.F || hashtable.e() != s.a)
            {
                E = Boolean.valueOf(false);
                ah = null;
            } else
            if (n.a().intValue() > 2 && ah != null && hashtable.e() == s.a)
            {
                E = Boolean.valueOf(true);
            }
        }
        B = hashtable.w();
        obj = (new StringBuilder()).append("SYNC Proxy Version: ").append(D).toString();
        if (!j())
        {
            h();
            p.bn.d.a(((String) (obj)), false);
            i();
        } else
        {
            p.bn.d.a(((String) (obj)), false);
        }
        obj1 = a();
        a(((Intent) (obj1)), "FUNCTION_NAME", "RAI_RESPONSE");
        a(((Intent) (obj1)), "COMMENT1", ((String) (obj)));
        a(((Intent) (obj1)));
        i = v.a;
        if (!hashtable.d().booleanValue())
        {
            a("Unable to register app interface. Review values passed to the SyncProxy constructor. RegisterAppInterface result code: ", ((Exception) (new p.ax.a((new StringBuilder()).append("Unable to register app interface. Review values passed to the SyncProxy constructor. RegisterAppInterface result code: ").append(hashtable.e()).toString(), p.ax.b.n))), w.r);
        }
        if (!U.booleanValue()) goto _L6; else goto _L5
_L5:
        V.post(new Runnable(hashtable) {

            final ba a;
            final j b;

            public void run()
            {
                if (p.bd.j.d(b) instanceof p.bd.a)
                {
                    ((p.bd.a)p.bd.j.d(b)).a(a);
                } else
                if (p.bd.j.d(b) instanceof p.bf.a)
                {
                    return;
                }
            }

            
            {
                b = j.this;
                a = ba1;
                super();
            }
        });
_L8:
        return;
_L6:
        if (H instanceof p.bd.a)
        {
            ((p.bd.a)H).a(hashtable);
            return;
        }
        if (H instanceof p.bf.a)
        {
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if ((new p.bd.g(hashtable)).c().intValue() != 65535 || !((String) (obj)).equals("OnEncodedSyncPData"))
        {
            break; /* Loop/switch isn't completed */
        }
        hashtable = new ao(hashtable);
        if (hashtable.i() != null)
        {
            (new Thread(hashtable) {

                final ao a;
                final j b;

                public void run()
                {
                    p.bd.j.a(b, a);
                }

            
            {
                b = j.this;
                a = ao1;
                super();
            }
            }).start();
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if ((new p.bd.g(hashtable)).c().intValue() == 65535 && ((String) (obj)).equals("EncodedSyncPData"))
        {
            hashtable = new bx(hashtable);
            obj = a();
            a(((Intent) (obj)), "RPC_NAME", "SystemRequest");
            a(((Intent) (obj)), "TYPE", "response");
            a(((Intent) (obj)), "SUCCESS", hashtable.d().booleanValue());
            a(((Intent) (obj)), "COMMENT1", hashtable.f());
            a(((Intent) (obj)), "COMMENT2", hashtable.e().toString());
            a(((Intent) (obj)), "CORRID", hashtable.c().intValue());
            a(((Intent) (obj)));
            return;
        }
        if ((new p.bd.g(hashtable)).c().intValue() == 65535 && ((String) (obj)).equals("SystemRequest"))
        {
            hashtable = new bx(hashtable);
            obj = a();
            a(((Intent) (obj)), "RPC_NAME", "SystemRequest");
            a(((Intent) (obj)), "TYPE", "response");
            a(((Intent) (obj)), "SUCCESS", hashtable.d().booleanValue());
            a(((Intent) (obj)), "COMMENT1", hashtable.f());
            a(((Intent) (obj)), "COMMENT2", hashtable.e().toString());
            a(((Intent) (obj)), "CORRID", hashtable.c().intValue());
            a(((Intent) (obj)), "DATA", a(((p.bd.c) (hashtable))));
            a(((Intent) (obj)));
            return;
        }
        if (!((String) (obj)).equals("UnregisterAppInterface")) goto _L8; else goto _L9
_L9:
        d = Boolean.valueOf(false);
        synchronized (P)
        {
            P.notify();
        }
        hashtable = new ca(hashtable);
        obj = a();
        a(((Intent) (obj)), "RPC_NAME", "UnregisterAppInterface");
        a(((Intent) (obj)), "TYPE", "response");
        a(((Intent) (obj)), "SUCCESS", hashtable.d().booleanValue());
        a(((Intent) (obj)), "COMMENT1", hashtable.f());
        a(((Intent) (obj)), "COMMENT2", hashtable.e().toString());
        a(((Intent) (obj)), "DATA", a(((p.bd.c) (hashtable))));
        a(((Intent) (obj)), "CORRID", hashtable.c().intValue());
        a(((Intent) (obj)));
        return;
        hashtable;
        obj;
        JVM INSTR monitorexit ;
        throw hashtable;
        if (((String) (obj)).equals("RegisterAppInterface"))
        {
            hashtable = new ba(hashtable);
            if (hashtable.d().booleanValue())
            {
                d = Boolean.valueOf(true);
            }
            o = "8675309";
            s = hashtable.m();
            r = hashtable.l();
            t = hashtable.n();
            u = hashtable.o();
            v = hashtable.p();
            w = hashtable.q();
            x = hashtable.r();
            p = hashtable.j();
            q = hashtable.k();
            n = hashtable.i();
            y = hashtable.s();
            z = hashtable.t();
            A = hashtable.u();
            D = hashtable.v();
            if (ak)
            {
                if (hashtable.e() == s.F || hashtable.e() != s.a)
                {
                    E = Boolean.valueOf(false);
                    ah = null;
                } else
                if (n.a().intValue() > 2 && ah != null && hashtable.e() == s.a)
                {
                    E = Boolean.valueOf(true);
                }
            }
            B = hashtable.w();
            if (!j())
            {
                h();
                p.bn.d.c((new StringBuilder()).append("SYNC Proxy Version: ").append(D).toString());
                i();
            } else
            {
                p.bn.d.c((new StringBuilder()).append("SYNC Proxy Version: ").append(D).toString());
            }
            if (c.booleanValue())
            {
                i = v.a;
                if (!hashtable.d().booleanValue())
                {
                    a("Unable to register app interface. Review values passed to the SyncProxy constructor. RegisterAppInterface result code: ", ((Exception) (new p.ax.a((new StringBuilder()).append("Unable to register app interface. Review values passed to the SyncProxy constructor. RegisterAppInterface result code: ").append(hashtable.e()).toString(), p.ax.b.n))), w.r);
                }
            } else
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final ba a;
                    final j b;

                    public void run()
                    {
                        if (p.bd.j.d(b) instanceof p.bd.a)
                        {
                            ((p.bd.a)p.bd.j.d(b)).a(a);
                        } else
                        if (p.bd.j.d(b) instanceof p.bf.a)
                        {
                            return;
                        }
                    }

            
            {
                b = j.this;
                a = ba1;
                super();
            }
                });
            } else
            if (H instanceof p.bd.a)
            {
                ((p.bd.a)H).a(hashtable);
            } else
            if (!(H instanceof p.bf.a));
        } else
        if (((String) (obj)).equals("Speak"))
        {
            hashtable = new bq(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final bq a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = bq1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("Alert"))
        {
            hashtable = new f(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final f a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = f1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("Show"))
        {
            hashtable = new bl(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final bl a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = bl1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("AddCommand"))
        {
            hashtable = new p.bg.b(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final p.bg.b a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = b1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("DeleteCommand"))
        {
            hashtable = new m(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final m a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = m1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("AddSubMenu"))
        {
            hashtable = new p.bg.d(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final p.bg.d a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = d1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("DeleteSubMenu"))
        {
            hashtable = new r(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final r a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = r1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("SubscribeButton"))
        {
            hashtable = new bt(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final bt a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = bt1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("UnsubscribeButton"))
        {
            hashtable = new cb(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final cb a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = cb1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("SetMediaClockTimer"))
        {
            hashtable = new bj(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final bj a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = bj1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("EncodedSyncPData"))
        {
            hashtable = new bx(hashtable);
            obj1 = a();
            a(((Intent) (obj1)), "RPC_NAME", "SystemRequest");
            a(((Intent) (obj1)), "TYPE", "response");
            a(((Intent) (obj1)), "SUCCESS", hashtable.d().booleanValue());
            a(((Intent) (obj1)), "COMMENT1", hashtable.f());
            a(((Intent) (obj1)), "COMMENT2", hashtable.e().toString());
            a(((Intent) (obj1)), "CORRID", hashtable.c().intValue());
            a(((Intent) (obj1)));
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final bx a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = bx1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("CreateInteractionChoiceSet"))
        {
            hashtable = new l(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final l a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = l1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("DeleteInteractionChoiceSet"))
        {
            hashtable = new q(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final q a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = q1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("PerformInteraction"))
        {
            hashtable = new au(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final au a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = au1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("SetGlobalProperties"))
        {
            hashtable = new bh(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final bh a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = bh1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("ResetGlobalProperties"))
        {
            hashtable = new bb(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final bb a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = bb1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("UnregisterAppInterface"))
        {
            d = Boolean.valueOf(false);
            synchronized (P)
            {
                P.notify();
            }
            hashtable = new ca(hashtable);
            obj1 = a();
            a(((Intent) (obj1)), "RPC_NAME", "UnregisterAppInterface");
            a(((Intent) (obj1)), "TYPE", "response");
            a(((Intent) (obj1)), "SUCCESS", hashtable.d().booleanValue());
            a(((Intent) (obj1)), "COMMENT1", hashtable.f());
            a(((Intent) (obj1)), "COMMENT2", hashtable.e().toString());
            a(((Intent) (obj1)), "DATA", a(((p.bd.c) (hashtable))));
            a(((Intent) (obj1)), "CORRID", hashtable.c().intValue());
            a(((Intent) (obj1)));
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final ca a;
                    final j b;

                    public void run()
                    {
                        if (p.bd.j.d(b) instanceof p.bd.a)
                        {
                            ((p.bd.a)p.bd.j.d(b)).a(a);
                        } else
                        if (p.bd.j.d(b) instanceof p.bf.a)
                        {
                            return;
                        }
                    }

            
            {
                b = j.this;
                a = ca1;
                super();
            }
                });
            } else
            if (H instanceof p.bd.a)
            {
                ((p.bd.a)H).a(hashtable);
            } else
            if (!(H instanceof p.bf.a));
            a("UnregisterAppInterfaceResponse", ((Exception) (null)), w.s);
        } else
        if (((String) (obj)).equals("GenericResponse"))
        {
            hashtable = new p.bg.v(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final p.bg.v a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = v1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("Slider"))
        {
            hashtable = new bm(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final bm a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = bm1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("PutFile"))
        {
            hashtable = new ax(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final ax a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = ax1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("DeleteFile"))
        {
            hashtable = new o(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final o a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = o1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("ListFiles"))
        {
            hashtable = new aa(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final aa a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = aa1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("SetAppIcon"))
        {
            hashtable = new be(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final be a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = be1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("ScrollableMessage"))
        {
            hashtable = new bc(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final bc a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = bc1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("ChangeRegistration"))
        {
            hashtable = new i(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final i a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = i1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("SetDisplayLayout"))
        {
            hashtable = new bf(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final bf a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = bf1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("PerformAudioPassThru"))
        {
            hashtable = new as(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final as a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = as1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("EndAudioPassThru"))
        {
            hashtable = new u(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final u a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = u1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("SubscribeVehicleData"))
        {
            hashtable = new bu(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final bu a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = bu1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("UnsubscribeVehicleData"))
        {
            hashtable = new cc(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final cc a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = cc1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("GetVehicleData"))
        {
            hashtable = new x(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final x a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = x1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("ReadDID"))
        {
            hashtable = new ay(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final ay a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = ay1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("GetDTCs"))
        {
            hashtable = new p.bg.w(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final p.bg.w a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = w1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("DiagnosticMessage"))
        {
            hashtable = new p.bg.s(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final p.bg.s a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = s1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (((String) (obj)).equals("SystemRequest"))
        {
            hashtable = new bx(hashtable);
            if (U.booleanValue())
            {
                V.post(new Runnable(hashtable) {

                    final bx a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a(a);
                    }

            
            {
                b = j.this;
                a = bx1;
                super();
            }
                });
            } else
            {
                H.a(hashtable);
            }
        } else
        if (n != null)
        {
            p.bn.d.a((new StringBuilder()).append("Unrecognized response Message: ").append(((String) (obj)).toString()).append("SYNC Message Version = ").append(n).toString());
        } else
        {
            p.bn.d.a((new StringBuilder()).append("Unrecognized response Message: ").append(((String) (obj)).toString()).toString());
        }
_L11:
        p.bk.e.a((new StringBuilder()).append("Proxy received RPC Message: ").append(((String) (obj))).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
        hashtable;
        obj1;
        JVM INSTR monitorexit ;
        throw hashtable;
_L2:
        if (s1.equals("notification"))
        {
            p.bk.e.a(b.b, new p.bd.d(((p.bd.c) (obj1))), "42baba60-eb57-11df-98cf-0800200c9a66");
            if (((String) (obj)).equals("OnHMIStatus"))
            {
                hashtable = new ai(hashtable);
                if (G != null)
                {
                    G.a().a(hashtable.c());
                }
                hashtable.a(Boolean.valueOf(C.booleanValue()));
                if (hashtable.c() == p.bh.i.a)
                {
                    C = Boolean.valueOf(false);
                }
                if (hashtable.c() != an && hashtable.d() != ao)
                {
                    if (U.booleanValue())
                    {
                        V.post(new Runnable(hashtable) {

                            final ai a;
                            final j b;

                            public void run()
                            {
                                p.bd.j.d(b).a(a);
                                p.bd.j.d(b).a(p.bd.j.c(b).a().a());
                            }

            
            {
                b = j.this;
                a = ai1;
                super();
            }
                        });
                    } else
                    {
                        H.a(hashtable);
                        H.a(G.a().a());
                    }
                }
            } else
            if (((String) (obj)).equals("OnCommand"))
            {
                hashtable = new ag(hashtable);
                if (U.booleanValue())
                {
                    V.post(new Runnable(hashtable) {

                        final ag a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.d(b).a(a);
                        }

            
            {
                b = j.this;
                a = ag1;
                super();
            }
                    });
                } else
                {
                    H.a(hashtable);
                }
            } else
            if (((String) (obj)).equals("OnDriverDistraction"))
            {
                hashtable = new ah(hashtable);
                if (G != null)
                {
                    if (hashtable.c() != g.a)
                    {
                        flag = false;
                    }
                    G.a().a(flag);
                }
                if (U.booleanValue())
                {
                    V.post(new Runnable(hashtable) {

                        final ah a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.d(b).a(a);
                            p.bd.j.d(b).a(p.bd.j.c(b).a().a());
                        }

            
            {
                b = j.this;
                a = ah1;
                super();
            }
                    });
                } else
                {
                    H.a(hashtable);
                    H.a(G.a().a());
                }
            } else
            if (((String) (obj)).equals("OnEncodedSyncPData"))
            {
                hashtable = new ao(hashtable);
                Intent intent = a();
                a(intent, "RPC_NAME", "OnSystemRequest");
                a(intent, "TYPE", "notification");
                if (hashtable.i() == null)
                {
                    a(intent, "COMMENT1", "URL is a null value (received)");
                    a(intent);
                    if (U.booleanValue())
                    {
                        V.post(new Runnable(hashtable) {

                            final ao a;
                            final j b;

                            public void run()
                            {
                                p.bd.j.d(b).a(a);
                            }

            
            {
                b = j.this;
                a = ao1;
                super();
            }
                        });
                    } else
                    {
                        H.a(hashtable);
                    }
                } else
                {
                    a(intent, "COMMENT1", (new StringBuilder()).append("Sending to cloud: ").append(hashtable.i()).toString());
                    a(intent);
                    Log.i("pt", "send to url");
                    if (hashtable.i() != null)
                    {
                        (new Thread(hashtable) {

                            final ao a;
                            final j b;

                            public void run()
                            {
                                p.bd.j.a(b, a);
                            }

            
            {
                b = j.this;
                a = ao1;
                super();
            }
                        }).start();
                    }
                }
            } else
            if (((String) (obj)).equals("OnPermissionsChange"))
            {
                hashtable = new an(hashtable);
                if (U.booleanValue())
                {
                    V.post(new Runnable(hashtable) {

                        final an a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.d(b).a(a);
                        }

            
            {
                b = j.this;
                a = an1;
                super();
            }
                    });
                } else
                {
                    H.a(hashtable);
                }
            } else
            if (((String) (obj)).equals("OnTBTClientState"))
            {
                hashtable = new ap(hashtable);
                if (U.booleanValue())
                {
                    V.post(new Runnable(hashtable) {

                        final ap a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.d(b).a(a);
                        }

            
            {
                b = j.this;
                a = ap1;
                super();
            }
                    });
                } else
                {
                    H.a(hashtable);
                }
            } else
            if (((String) (obj)).equals("OnButtonPress"))
            {
                hashtable = new af(hashtable);
                if (U.booleanValue())
                {
                    V.post(new Runnable(hashtable) {

                        final af a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.d(b).a(a);
                        }

            
            {
                b = j.this;
                a = af1;
                super();
            }
                    });
                } else
                {
                    H.a(hashtable);
                }
            } else
            if (((String) (obj)).equals("OnButtonEvent"))
            {
                hashtable = new ae(hashtable);
                if (U.booleanValue())
                {
                    V.post(new Runnable(hashtable) {

                        final ae a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.d(b).a(a);
                        }

            
            {
                b = j.this;
                a = ae1;
                super();
            }
                    });
                } else
                {
                    H.a(hashtable);
                }
            } else
            if (((String) (obj)).equals("OnLanguageChange"))
            {
                hashtable = new al(hashtable);
                if (U.booleanValue())
                {
                    V.post(new Runnable(hashtable) {

                        final al a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.d(b).a(a);
                        }

            
            {
                b = j.this;
                a = al1;
                super();
            }
                    });
                } else
                {
                    H.a(hashtable);
                }
            } else
            if (((String) (obj)).equals("OnHashChange"))
            {
                hashtable = new aj(hashtable);
                if (U.booleanValue())
                {
                    V.post(new Runnable(hashtable) {

                        final aj a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.d(b).a(a);
                            if (p.bd.j.e(b))
                            {
                                p.bd.j.a(b, a.c());
                            }
                        }

            
            {
                b = j.this;
                a = aj1;
                super();
            }
                    });
                } else
                {
                    H.a(hashtable);
                    if (ak)
                    {
                        ah = hashtable.c();
                    }
                }
            } else
            if (((String) (obj)).equals("OnSystemRequest"))
            {
                hashtable = new ao(hashtable);
                if (hashtable.i() != null && hashtable.f() == p.bh.r.f && hashtable.j() == h.h)
                {
                    (new Thread(hashtable) {

                        final ao a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.a(b, a);
                        }

            
            {
                b = j.this;
                a = ao1;
                super();
            }
                    }).start();
                }
                if (U.booleanValue())
                {
                    V.post(new Runnable(hashtable) {

                        final ao a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.d(b).a(a);
                        }

            
            {
                b = j.this;
                a = ao1;
                super();
            }
                    });
                } else
                {
                    H.a(hashtable);
                }
            } else
            if (((String) (obj)).equals("OnAudioPassThru"))
            {
                hashtable = new ad(hashtable);
                if (U.booleanValue())
                {
                    V.post(new Runnable(hashtable) {

                        final ad a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.d(b).a(a);
                        }

            
            {
                b = j.this;
                a = ad1;
                super();
            }
                    });
                } else
                {
                    H.a(hashtable);
                }
            } else
            if (((String) (obj)).equals("OnVehicleData"))
            {
                hashtable = new ar(hashtable);
                if (U.booleanValue())
                {
                    V.post(new Runnable(hashtable) {

                        final ar a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.d(b).a(a);
                        }

            
            {
                b = j.this;
                a = ar1;
                super();
            }
                    });
                } else
                {
                    H.a(hashtable);
                }
            } else
            if (((String) (obj)).equals("OnAppInterfaceUnregistered"))
            {
                d = Boolean.valueOf(false);
                synchronized (P)
                {
                    P.notify();
                }
                hashtable = new ac(hashtable);
                obj2 = a();
                a(((Intent) (obj2)), "RPC_NAME", "OnAppInterfaceUnregistered");
                a(((Intent) (obj2)), "TYPE", "notification");
                a(((Intent) (obj2)), "DATA", a(((p.bd.c) (hashtable))));
                a(((Intent) (obj2)));
                if (c.booleanValue())
                {
                    a(p.bh.w.a(hashtable.c()));
                } else
                {
                    if (U.booleanValue())
                    {
                        V.post(new Runnable(hashtable) {

                            final ac a;
                            final j b;

                            public void run()
                            {
                                ((p.bd.a)p.bd.j.d(b)).a(a);
                            }

            
            {
                b = j.this;
                a = ac1;
                super();
            }
                        });
                    } else
                    {
                        ((p.bd.a)H).a(hashtable);
                    }
                    a("OnAppInterfaceUnregistered", ((Exception) (null)), w.s);
                }
            } else
            if (((String) (obj)).equals("OnKeyboardInput"))
            {
                hashtable = new ak(hashtable);
                if (U.booleanValue())
                {
                    V.post(new Runnable(hashtable) {

                        final ak a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.d(b).a(a);
                        }

            
            {
                b = j.this;
                a = ak1;
                super();
            }
                    });
                } else
                {
                    H.a(hashtable);
                }
            } else
            if (((String) (obj)).equals("OnTouchEvent"))
            {
                hashtable = new aq(hashtable);
                if (U.booleanValue())
                {
                    V.post(new Runnable(hashtable) {

                        final aq a;
                        final j b;

                        public void run()
                        {
                            p.bd.j.d(b).a(a);
                        }

            
            {
                b = j.this;
                a = aq1;
                super();
            }
                    });
                } else
                {
                    H.a(hashtable);
                }
            } else
            if (n != null)
            {
                p.bn.d.c((new StringBuilder()).append("Unrecognized notification Message: ").append(((String) (obj)).toString()).append(" connected to SYNC using message version: ").append(n.a()).append(".").append(n.b()).toString());
            } else
            {
                p.bn.d.c((new StringBuilder()).append("Unrecognized notification Message: ").append(((String) (obj)).toString()).toString());
            }
        }
        if (true) goto _L11; else goto _L10
_L10:
        hashtable;
        obj2;
        JVM INSTR monitorexit ;
        throw hashtable;
    }

    private void a(p.ba.f f1)
    {
        boolean flag = f1.e().a(p.bb.e.c);
        if (!flag) goto _L2; else goto _L1
_L1:
        Hashtable hashtable1;
        if (F == 1 && f1.a() > 1)
        {
            a(f1.a());
        }
        hashtable1 = new Hashtable();
        if (F <= 1) goto _L4; else goto _L3
_L3:
        Hashtable hashtable;
        String s1;
        hashtable = new Hashtable();
        hashtable.put("correlationID", Integer.valueOf(f1.h()));
        if (f1.i() > 0)
        {
            hashtable.put("parameters", p.ay.a.a(f1.c()));
        }
        s1 = p.bb.c.a(f1.g());
        if (s1 == null) goto _L6; else goto _L5
_L5:
        hashtable.put("name", s1);
        if (f1.f() != 0) goto _L8; else goto _L7
_L7:
        hashtable1.put("request", hashtable);
_L11:
        hashtable = hashtable1;
        if (f1.d() == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        hashtable1.put("bulkData", f1.d());
        hashtable = hashtable1;
        break MISSING_BLOCK_LABEL_165;
_L6:
        p.bn.d.b((new StringBuilder()).append("Dispatch Incoming Message - function name is null unknown RPC.  FunctionID: ").append(f1.g()).toString());
        return;
_L9:
        try
        {
            a(hashtable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (p.ba.f f1) { }
        try
        {
            p.bn.d.a((new StringBuilder()).append("Failure handling protocol message: ").append(f1.toString()).toString(), f1);
            d("Error handing incoming protocol message.", f1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (p.ba.f f1)
        {
            p.bn.d.a("Error handing proxy event.", f1);
        }
        d("Error handing incoming protocol message.", f1);
        return;
_L8:
        if (f1.f() == 1)
        {
            hashtable1.put("response", hashtable);
            continue; /* Loop/switch isn't completed */
        }
        if (f1.f() == 2)
        {
            hashtable1.put("notification", hashtable);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        hashtable = p.ay.a.a(f1.c());
        if (true) goto _L9; else goto _L2
_L2:
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static void a(j j1, byte byte0)
    {
        j1.a(byte0);
    }

    static void a(j j1, byte byte0, String s1)
    {
        j1.a(byte0, s1);
    }

    static void a(j j1, Intent intent)
    {
        j1.a(intent);
    }

    static void a(j j1, Intent intent, String s1, String s2)
    {
        j1.a(intent, s1, s2);
    }

    static void a(j j1, String s1, Exception exception)
    {
        j1.d(s1, exception);
    }

    static void a(j j1, p.ba.f f1)
    {
        j1.c(f1);
    }

    static void a(j j1, ao ao1)
    {
        j1.a(ao1);
    }

    private void a(p.bf.b b1, k k1, boolean flag, String s1, Vector vector, String s2, Vector vector1, 
            Boolean boolean1, bv bv1, n n1, n n2, Vector vector2, String s3, String s4, 
            boolean flag1, Boolean boolean2, String s5, Boolean boolean3, p.bm.c c1)
        throws p.ax.a
    {
        a((byte)1);
        if (boolean2 != null && boolean2.booleanValue())
        {
            d = boolean2;
            e = boolean2;
        }
        if (boolean3 != null && boolean3.booleanValue())
        {
            ak = true;
            ah = s5;
        }
        ap = new a();
        U = Boolean.valueOf(flag1);
        if (U.booleanValue())
        {
            V = new Handler(Looper.getMainLooper());
        }
        c = Boolean.valueOf(flag);
        W = s1;
        Z = vector;
        aa = s2;
        ab = boolean1;
        ai = bv1;
        aj = vector1;
        ac = n1;
        ad = n2;
        ae = vector2;
        af = s3;
        ag = s4;
        al = c1;
        if (b1 == null)
        {
            throw new IllegalArgumentException("IProxyListener listener must be provided to instantiate SyncProxy object.");
        }
        if (c.booleanValue() && ab == null)
        {
            throw new IllegalArgumentException("isMediaApp must not be null when using SyncProxyALM.");
        }
        H = b1;
        b1 = null;
        if (k1 != null)
        {
            b1 = k1.a();
        }
        if (b1 != null && Q == null)
        {
            Q = new p.bk.f(k1.a());
        }
        synchronized (O)
        {
            if (T != null)
            {
                T.a();
                T = null;
            }
            T = new p.az.e("INTERNAL_MESSAGE_DISPATCHER", new p.az.c(), new p.az.a() {

                final j a;

                public volatile void a(Object obj)
                {
                    a((p.be.a)obj);
                }

                public void a(String s6, Exception exception)
                {
                    p.bd.j.b(a, s6, exception);
                }

                public void a(p.be.a a1)
                {
                    a.a(a1);
                }

                public void b(String s6, Exception exception)
                {
                    p.bd.j.b(a, s6, exception);
                }

            
            {
                a = j.this;
                super();
            }
            });
        }
        synchronized (M)
        {
            if (R != null)
            {
                R.a();
                R = null;
            }
            R = new p.az.e("INCOMING_MESSAGE_DISPATCHER", new p.az.b(), new p.az.a() {

                final j a;

                public volatile void a(Object obj)
                {
                    a((p.ba.f)obj);
                }

                public void a(String s6, Exception exception)
                {
                    p.bd.j.c(a, s6, exception);
                }

                public void a(p.ba.f f1)
                {
                    p.bd.j.b(a, f1);
                }

                public void b(String s6, Exception exception)
                {
                    p.bd.j.c(a, s6, exception);
                }

            
            {
                a = j.this;
                super();
            }
            });
        }
        synchronized (N)
        {
            if (S != null)
            {
                S.a();
                S = null;
            }
            S = new p.az.e("OUTGOING_MESSAGE_DISPATCHER", new p.az.d(), new p.az.a() {

                final j a;

                public volatile void a(Object obj)
                {
                    a((p.ba.f)obj);
                }

                public void a(String s6, Exception exception)
                {
                    p.bd.j.d(a, s6, exception);
                }

                public void a(p.ba.f f1)
                {
                    p.bd.j.c(a, f1);
                }

                public void b(String s6, Exception exception)
                {
                    p.bd.j.d(a, s6, exception);
                }

            
            {
                a = j.this;
                super();
            }
            });
        }
        try
        {
            c();
        }
        // Misplaced declaration of an exception variable
        catch (p.bf.b b1)
        {
            if (T != null)
            {
                T.a();
                T = null;
            }
            if (R != null)
            {
                R.a();
                R = null;
            }
            if (S != null)
            {
                S.a();
                S = null;
            }
            throw b1;
        }
        p.bk.e.a((new StringBuilder()).append("SyncProxy Created, instanceID=").append(toString()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
        k1;
        b1;
        JVM INSTR monitorexit ;
        throw k1;
        k1;
        b1;
        JVM INSTR monitorexit ;
        throw k1;
        k1;
        b1;
        JVM INSTR monitorexit ;
        throw k1;
    }

    private void a(ao ao1)
    {
        Object obj;
        ao ao2;
        ao ao3;
        ao ao4;
        ao ao5;
        ao ao6;
        ao ao7;
        ao ao8;
        Object obj1;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        String s1;
        y y1;
        obj4 = null;
        obj5 = null;
        obj6 = null;
        obj7 = null;
        obj8 = null;
        obj9 = null;
        obj10 = null;
        obj3 = null;
        s1 = ao1.i();
        obj = ao1.k();
        obj1 = obj;
        if (obj == null)
        {
            obj1 = Integer.valueOf(2000);
        }
        y1 = ao1.e();
        ao2 = ((ao) (obj3));
        ao3 = obj4;
        ao4 = obj5;
        ao5 = obj6;
        ao6 = obj7;
        ao7 = obj8;
        ao8 = obj9;
        obj = obj10;
        Object obj2 = ao1.d();
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        ao2 = ((ao) (obj3));
        ao3 = obj4;
        ao4 = obj5;
        ao5 = obj6;
        ao6 = obj7;
        ao7 = obj8;
        ao8 = obj9;
        obj = obj10;
        ao1 = new JSONArray(ao1.c());
        ao2 = ((ao) (obj3));
        ao3 = obj4;
        ao4 = obj5;
        ao5 = obj6;
        ao6 = obj7;
        ao7 = obj8;
        ao8 = obj9;
        obj = obj10;
        obj2 = new JSONObject();
        ao2 = ((ao) (obj3));
        ao3 = obj4;
        ao4 = obj5;
        ao5 = obj6;
        ao6 = obj7;
        ao7 = obj8;
        ao8 = obj9;
        obj = obj10;
        ((JSONObject) (obj2)).put("data", ao1);
        boolean flag;
        flag = true;
        ao2 = ((ao) (obj3));
        ao3 = obj4;
        ao4 = obj5;
        ao5 = obj6;
        ao6 = obj7;
        ao7 = obj8;
        ao8 = obj9;
        obj = obj10;
        obj2 = ((JSONObject) (obj2)).toString().replace("\\", "");
_L5:
        ao2 = ((ao) (obj3));
        ao3 = obj4;
        ao4 = obj5;
        ao5 = obj6;
        ao6 = obj7;
        ao7 = obj8;
        ao8 = obj9;
        obj = obj10;
        ao1 = a(y1, s1, ((Integer) (obj1)).intValue(), ((String) (obj2)).getBytes("UTF-8").length);
        if (ao1 != null) goto _L4; else goto _L3
_L3:
        if (ao1 != null)
        {
            ao1.disconnect();
        }
_L6:
        return;
_L2:
        ao2 = ((ao) (obj3));
        ao3 = obj4;
        ao4 = obj5;
        ao5 = obj6;
        ao6 = obj7;
        ao7 = obj8;
        ao8 = obj9;
        obj = obj10;
        obj2 = ((String) (obj2)).replace("\\", "");
        flag = false;
          goto _L5
_L4:
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        obj1 = new DataOutputStream(ao1.getOutputStream());
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        ((DataOutputStream) (obj1)).writeBytes(((String) (obj2)));
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        ((DataOutputStream) (obj1)).flush();
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        ((DataOutputStream) (obj1)).close();
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        System.currentTimeMillis();
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        ao1.getResponseMessage();
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        System.currentTimeMillis();
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        int i1 = ao1.getResponseCode();
label0:
        {
            if (i1 == 200)
            {
                break label0;
            }
            if (ao1 != null)
            {
                ao1.disconnect();
                return;
            }
        }
          goto _L6
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        obj2 = new BufferedReader(new InputStreamReader(ao1.getInputStream()));
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        obj1 = new StringBuffer();
_L8:
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        obj3 = ((BufferedReader) (obj2)).readLine();
        if (obj3 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        ((StringBuffer) (obj1)).append(((String) (obj3)));
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        ((StringBuffer) (obj1)).append('\r');
        if (true) goto _L8; else goto _L7
        ao1;
        obj = ao2;
        p.bn.d.a("sendOnSystemRequestToUrl: Could not get data from JSONObject received.", ao1);
        if (ao2 != null)
        {
            ao2.disconnect();
            return;
        }
          goto _L6
_L7:
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        ((BufferedReader) (obj2)).close();
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        obj2 = new Vector();
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        obj3 = new JSONObject(((StringBuffer) (obj1)).toString());
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        if (!(((JSONObject) (obj3)).get("data") instanceof JSONArray)) goto _L10; else goto _L9
_L9:
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        obj3 = ((JSONObject) (obj3)).getJSONArray("data");
        i1 = 0;
_L20:
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        if (i1 >= ((JSONArray) (obj3)).length()) goto _L12; else goto _L11
_L11:
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        if (!(((JSONArray) (obj3)).get(i1) instanceof String))
        {
            break MISSING_BLOCK_LABEL_1613;
        }
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        ((Vector) (obj2)).add(((JSONArray) (obj3)).getString(i1));
        break MISSING_BLOCK_LABEL_1613;
_L10:
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        if (!(((JSONObject) (obj3)).get("data") instanceof String)) goto _L14; else goto _L13
_L13:
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        ((Vector) (obj2)).add(((JSONObject) (obj3)).getString("data"));
_L12:
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        obj3 = ((Vector) (obj2)).toString();
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        if (((String) (obj3)).length() <= 512)
        {
            break MISSING_BLOCK_LABEL_1249;
        }
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        ((String) (obj3)).substring(0, 511);
        if (!flag) goto _L16; else goto _L15
_L15:
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        obj1 = p.bd.f.a(((Vector) (obj2)), Integer.valueOf(b()));
_L18:
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        if (!e().booleanValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        b(((p.bd.e) (obj1)));
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        Log.i("sendOnSystemRequestToUrl", "sent to sync");
        if (ao1 == null) goto _L6; else goto _L17
_L17:
        ao1.disconnect();
        return;
_L14:
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        p.bn.d.a("sendOnSystemRequestToUrl: Data in JSON Object neither an array nor a string.");
        if (ao1 != null)
        {
            ao1.disconnect();
            return;
        }
          goto _L6
_L16:
        ao2 = ao1;
        ao3 = ao1;
        ao4 = ao1;
        ao5 = ao1;
        ao6 = ao1;
        ao7 = ao1;
        ao8 = ao1;
        obj = ao1;
        obj1 = p.bd.f.a(((StringBuffer) (obj1)).toString(), Integer.valueOf(b()));
          goto _L18
        ao1;
        obj = ao3;
        p.bn.d.a("sendOnSystemRequestToUrl: JSONException: ", ao1);
        if (ao3 != null)
        {
            ao3.disconnect();
            return;
        }
          goto _L6
        ao1;
        obj = ao4;
        p.bn.d.a("sendOnSystemRequestToUrl: Could not encode string.", ao1);
        if (ao4 != null)
        {
            ao4.disconnect();
            return;
        }
          goto _L6
        ao1;
        obj = ao5;
        p.bn.d.a("sendOnSystemRequestToUrl: Could not set request method to post.", ao1);
        if (ao5 != null)
        {
            ao5.disconnect();
            return;
        }
          goto _L6
        ao1;
        obj = ao6;
        p.bn.d.a("sendOnSystemRequestToUrl: URL Exception when sending SystemRequest to an external server.", ao1);
        if (ao6 != null)
        {
            ao6.disconnect();
            return;
        }
          goto _L6
        ao1;
        obj = ao7;
        p.bn.d.a("sendOnSystemRequestToUrl: IOException: ", ao1);
        if (ao7 != null)
        {
            ao7.disconnect();
            return;
        }
          goto _L6
        ao1;
        obj = ao8;
        p.bn.d.a("sendOnSystemRequestToUrl: Unexpected Exception: ", ao1);
        if (ao8 == null) goto _L6; else goto _L19
_L19:
        ao8.disconnect();
        return;
        ao1;
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw ao1;
        i1++;
          goto _L20
    }

    private int b()
    {
        return 65535;
    }

    static p.bm.c b(j j1)
    {
        return j1.al;
    }

    private void b(String s1, Exception exception)
    {
        d(s1, exception);
    }

    private void b(p.ba.f f1)
    {
        synchronized (L)
        {
            if (G != null)
            {
                G.b(f1);
            }
        }
        p.bk.e.a((new StringBuilder()).append("SyncProxy sending Protocol Message: ").append(f1.toString()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
        f1;
        obj;
        JVM INSTR monitorexit ;
        throw f1;
    }

    private void b(p.bd.e e1)
        throws p.ax.a
    {
        Object obj;
        try
        {
            p.bk.e.a(b.a, e1, "42baba60-eb57-11df-98cf-0800200c9a66");
            byte abyte0[] = p.ay.a.a(e1, F);
            obj = new p.ba.f();
            ((p.ba.f) (obj)).a(abyte0);
            if (G != null)
            {
                ((p.ba.f) (obj)).b(G.b());
            }
            ((p.ba.f) (obj)).a(p.bb.d.c);
            ((p.ba.f) (obj)).a(p.bb.e.c);
            ((p.ba.f) (obj)).a(p.bb.c.a(e1.a()));
            if (e1.c() == null)
            {
                throw new p.ax.a((new StringBuilder()).append("CorrelationID cannot be null. RPC: ").append(e1.a()).toString(), p.ax.b.f);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            p.bk.e.a((new StringBuilder()).append("OutOfMemory exception while sending request ").append(e1.a()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new p.ax.a((new StringBuilder()).append("OutOfMemory exception while sending request ").append(e1.a()).toString(), ((Throwable) (obj)), p.ax.b.f);
        }
        ((p.ba.f) (obj)).b(e1.c().intValue());
        if (e1.h() != null)
        {
            ((p.ba.f) (obj)).b(e1.h());
        }
        synchronized (N)
        {
            if (S != null)
            {
                S.a(obj);
            }
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void b(j j1, String s1, Exception exception)
    {
        j1.c(s1, exception);
    }

    static void b(j j1, p.ba.f f1)
    {
        j1.a(f1);
    }

    private void b(p.be.a a1)
    {
        synchronized (O)
        {
            if (T != null)
            {
                T.a(a1);
            }
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private void b(w w1)
        throws p.ax.a
    {
        Boolean boolean1;
        if (!c.booleanValue())
        {
            break MISSING_BLOCK_LABEL_112;
        }
        i = v.b;
        C = Boolean.valueOf(true);
        boolean1 = Boolean.valueOf(false);
        Object obj = L;
        obj;
        JVM INSTR monitorenter ;
        w1 = boolean1;
        if (G == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        w1 = boolean1;
        if (!G.e())
        {
            break MISSING_BLOCK_LABEL_84;
        }
        w1 = boolean1;
        if (f().booleanValue())
        {
            w1 = Boolean.valueOf(true);
            a(Integer.valueOf(65530));
        }
        obj;
        JVM INSTR monitorexit ;
        if (w1.booleanValue())
        {
            synchronized (P)
            {
                try
                {
                    P.wait(3000L);
                }
                // Misplaced declaration of an exception variable
                catch (InterruptedException interruptedexception) { }
            }
        }
        synchronized (L)
        {
            if (G != null)
            {
                G.c();
            }
        }
        p.bk.e.a("SyncProxy cleaned.", "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
        w1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw w1;
        }
        // Misplaced declaration of an exception variable
        catch (w w1) { }
        finally
        {
            p.bk.e.a("SyncProxy cleaned.", "42baba60-eb57-11df-98cf-0800200c9a66");
        }
        throw w1;
        exception;
        w1;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        w1;
        JVM INSTR monitorexit ;
        InterruptedException interruptedexception;
        throw exception1;
    }

    private boolean b(Integer integer)
    {
        return integer != null && (65531 == integer.intValue() || 65529 == integer.intValue() || 65530 == integer.intValue() || 65535 == integer.intValue());
    }

    static c c(j j1)
    {
        return j1.G;
    }

    private void c()
        throws p.ax.a
    {
        am = Boolean.valueOf(false);
        f = Boolean.valueOf(false);
        g = Boolean.valueOf(false);
        if (e.booleanValue())
        {
            d = Boolean.valueOf(true);
        } else
        {
            d = Boolean.valueOf(false);
        }
        j = p.bh.x.b;
        synchronized (L)
        {
            G = p.bj.c.a(F, ap, al);
        }
        synchronized (L)
        {
            G.d();
            g();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private void c(String s1, Exception exception)
    {
        p.bn.d.a(s1, exception);
        p.bn.d.a("InternalMessageDispatcher failed.", exception);
        a("Proxy callback dispatcher is down. Proxy instance is invalid.", exception, w.t);
        H.a("Proxy callback dispatcher is down. Proxy instance is invalid.", exception);
    }

    private void c(p.ba.f f1)
    {
        synchronized (M)
        {
            if (R != null)
            {
                R.a(f1);
            }
        }
        return;
        f1;
        obj;
        JVM INSTR monitorexit ;
        throw f1;
    }

    static void c(j j1, String s1, Exception exception)
    {
        j1.a(s1, exception);
    }

    static void c(j j1, p.ba.f f1)
    {
        j1.b(f1);
    }

    private byte d()
    {
        return F;
    }

    static p.bf.b d(j j1)
    {
        return j1.H;
    }

    private void d(String s1, Exception exception)
    {
        b(new p.be.b(s1, exception));
    }

    static void d(j j1, String s1, Exception exception)
    {
        j1.b(s1, exception);
    }

    static boolean e(j j1)
    {
        return j1.ak;
    }

    public static void h()
    {
        p.bn.d.a();
    }

    public static void i()
    {
        p.bn.d.b();
    }

    public static boolean j()
    {
        return p.bn.d.c();
    }

    public String a(p.bd.c c1)
    {
        try
        {
            c1 = c1.a(d()).toString(2);
        }
        // Misplaced declaration of an exception variable
        catch (p.bd.c c1)
        {
            p.bn.d.a("Error handing proxy event.", c1);
            d("Error serializing message.", c1);
            return null;
        }
        return c1;
    }

    protected void a(Integer integer)
        throws p.ax.a
    {
        integer = p.bd.f.a(integer);
        Intent intent = a();
        a(intent, "RPC_NAME", "UnregisterAppInterface");
        a(intent, "TYPE", "request");
        a(intent, "CORRID", integer.c().intValue());
        a(intent, "DATA", a(((p.bd.c) (integer))));
        a(intent);
        b(integer);
    }

    protected void a(String s1, Exception exception, w w1)
    {
        p.bk.e.a("NotifyProxyClose", "42baba60-eb57-11df-98cf-0800200c9a66");
        b(new p.be.c(s1, exception, w1));
    }

    public void a(p.bd.e e1)
        throws p.ax.a
    {
        if (h.booleanValue())
        {
            throw new p.ax.a("This object has been disposed, it is no long capable of executing methods.", p.ax.b.l);
        }
        if (e1 == null)
        {
            p.bk.e.a("Application called sendRPCRequest method with a null RPCRequest.", "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new IllegalArgumentException("sendRPCRequest cannot be called with a null request.");
        }
        p.bk.e.a((new StringBuilder()).append("Application called sendRPCRequest method for RPCRequest: .").append(e1.a()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        Object obj = L;
        obj;
        JVM INSTR monitorenter ;
        if (G == null || !G.e())
        {
            p.bk.e.a("Application attempted to send and RPCRequest without a connected transport.", "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new p.ax.a("There is no valid connection to SYNC. sendRPCRequest cannot be called until SYNC has been connected.", p.ax.b.o);
        }
        break MISSING_BLOCK_LABEL_128;
        e1;
        obj;
        JVM INSTR monitorexit ;
        throw e1;
        obj;
        JVM INSTR monitorexit ;
        if (b(e1.c()))
        {
            p.bk.e.a((new StringBuilder()).append("Application attempted to use the reserved correlation ID, ").append(e1.c()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new p.ax.a((new StringBuilder()).append("Invalid correlation ID. The correlation ID, ").append(e1.c()).append(" , is a reserved correlation ID.").toString(), p.ax.b.i);
        }
        if (!d.booleanValue() && !e1.a().equals("RegisterAppInterface"))
        {
            p.bk.e.a("Application attempted to send an RPCRequest (non-registerAppInterface), before the interface was registerd.", "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new p.ax.a("SYNC is currently unavailable. RPC Requests cannot be sent.", p.ax.b.o);
        }
        if (c.booleanValue() && (e1.a().equals("RegisterAppInterface") || e1.a().equals("UnregisterAppInterface")))
        {
            p.bk.e.a("Application attempted to send a RegisterAppInterface or UnregisterAppInterface while using ALM.", "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new p.ax.a((new StringBuilder()).append("The RPCRequest, ").append(e1.a()).append(", is unallowed using the Advanced Lifecycle Management Model.").toString(), p.ax.b.e);
        } else
        {
            b(e1);
            return;
        }
    }

    void a(p.be.a a1)
    {
        if (!a1.a().equals("OnProxyError")) goto _L2; else goto _L1
_L1:
        p.be.b b1 = (p.be.b)a1;
        if (!U.booleanValue()) goto _L4; else goto _L3
_L3:
        V.post(new Runnable(b1) {

            final p.be.b a;
            final j b;

            public void run()
            {
                p.bd.j.d(b).a(a.b(), a.c());
            }

            
            {
                b = j.this;
                a = b1;
                super();
            }
        });
_L5:
        p.bk.e.a((new StringBuilder()).append("Proxy fired callback: ").append(a1.a()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
_L4:
        try
        {
            H.a(b1.b(), b1.c());
        }
        // Misplaced declaration of an exception variable
        catch (p.be.a a1)
        {
            p.bn.d.a("Error handing proxy event.", a1);
            p.be.c c1;
            if (U.booleanValue())
            {
                V.post(new Runnable(a1) {

                    final Exception a;
                    final j b;

                    public void run()
                    {
                        p.bd.j.d(b).a("Error handing proxy event.", a);
                    }

            
            {
                b = j.this;
                a = exception;
                super();
            }
                });
                return;
            } else
            {
                H.a("Error handing proxy event.", a1);
                return;
            }
        }
          goto _L5
_L2:
label0:
        {
            if (!a1.a().equals("OnProxyOpened"))
            {
                break MISSING_BLOCK_LABEL_188;
            }
            if (!U.booleanValue())
            {
                break label0;
            }
            V.post(new Runnable() {

                final j a;

                public void run()
                {
                    ((p.bd.a)p.bd.j.d(a)).a();
                }

            
            {
                a = j.this;
                super();
            }
            });
        }
          goto _L5
        ((p.bd.a)H).a();
          goto _L5
label1:
        {
            if (!a1.a().equals("OnProxyClosed"))
            {
                break MISSING_BLOCK_LABEL_260;
            }
            c1 = (p.be.c)a1;
            if (!U.booleanValue())
            {
                break label1;
            }
            V.post(new Runnable(c1) {

                final p.be.c a;
                final j b;

                public void run()
                {
                    p.bd.j.d(b).a(a.b(), a.d(), a.c());
                }

            
            {
                b = j.this;
                a = c1;
                super();
            }
            });
        }
          goto _L5
        H.a(c1.b(), c1.d(), c1.c());
          goto _L5
        p.bk.e.a("Unknown RPC Message encountered. Check for an updated version of the SYNC Proxy.", "42baba60-eb57-11df-98cf-0800200c9a66");
        p.bn.d.a("Unknown RPC Message encountered. Check for an updated version of the SYNC Proxy.");
          goto _L5
    }

    protected void a(bv bv1, String s1, Vector vector, String s2, Vector vector1, Boolean boolean1, n n1, 
            n n2, Vector vector2, String s3, String s4, Integer integer)
        throws p.ax.a
    {
        bv1 = p.bd.f.a(bv1, s1, vector, s2, vector1, boolean1, n1, n2, vector2, s3, integer);
        if (ak && ah != null)
        {
            bv1.c(ah);
        }
        s1 = a();
        a(((Intent) (s1)), "RPC_NAME", "RegisterAppInterface");
        a(((Intent) (s1)), "TYPE", "request");
        a(((Intent) (s1)), "CORRID", bv1.c().intValue());
        a(((Intent) (s1)), "DATA", a(((p.bd.c) (bv1))));
        a(((Intent) (s1)));
        b(bv1);
    }

    protected void a(w w1)
    {
        if (ar)
        {
            return;
        }
        Object obj = aq;
        obj;
        JVM INSTR monitorenter ;
        ar = true;
        b(w1);
        c();
        a("Sync Proxy Cycled", ((Exception) (new p.ax.a("Sync Proxy Cycled", p.ax.b.k))), w1);
_L7:
        ar = false;
        return;
        w1;
        obj;
        JVM INSTR monitorexit ;
        throw w1;
        w1;
        Intent intent = a();
        a(intent, "FUNCTION_NAME", "cycleProxy");
        a(intent, "COMMENT1", (new StringBuilder()).append("Proxy cycled, exception cause: ").append(w1.a()).toString());
        a(intent);
        static class _cls61
        {

            static final int a[];

            static 
            {
                a = new int[p.ax.b.values().length];
                try
                {
                    a[p.ax.b.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.ax.b.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        p.bd._cls61.a[w1.a().ordinal()];
        JVM INSTR tableswitch 1 2: default 229
    //                   1 162
    //                   2 188;
           goto _L1 _L2 _L3
_L1:
        if (false) goto _L5; else goto _L4
_L5:
        if (true) goto _L7; else goto _L6
_L6:
_L4:
        a("Cycling the proxy failed.", ((Exception) (w1)), w.t);
          goto _L7
_L2:
        a("Bluetooth is disabled. Bluetooth must be enabled to connect to SYNC. Reattempt a connection once Bluetooth is enabled.", ((Exception) (new p.ax.a("Bluetooth is disabled. Bluetooth must be enabled to connect to SYNC. Reattempt a connection once Bluetooth is enabled.", p.ax.b.b))), w.p);
          goto _L7
_L3:
        a("Cannot locate a Bluetooth adapater. A SYNC connection is impossible on this device until a Bluetooth adapter is added.", ((Exception) (new p.ax.a("Cannot locate a Bluetooth adapater. A SYNC connection is impossible on this device until a Bluetooth adapter is added.", p.ax.b.a))), w.q);
          goto _L7
        w1;
        a("Cycling the proxy failed.", ((Exception) (w1)), w.t);
          goto _L7
    }

    public Boolean e()
    {
        if (G == null)
        {
            return Boolean.valueOf(false);
        } else
        {
            return Boolean.valueOf(G.e());
        }
    }

    public Boolean f()
    {
        return d;
    }

    public void g()
    {
        String s1;
        if (G != null && al != null)
        {
            if ((s1 = G.a(al)) != null && !s1.equals(""))
            {
                Intent intent = a();
                a(intent, "FUNCTION_NAME", "initializeProxy");
                a(intent, "COMMENT1", s1);
                a(intent);
                return;
            }
        }
    }

    public void k()
        throws p.ax.a
    {
        if (h.booleanValue())
        {
            throw new p.ax.a("This object has been disposed, it is no long capable of executing methods.", p.ax.b.l);
        }
        h = Boolean.valueOf(true);
        p.bk.e.a("Application called dispose() method.", "42baba60-eb57-11df-98cf-0800200c9a66");
        b(w.l);
        synchronized (M)
        {
            if (R != null)
            {
                R.a();
                R = null;
            }
        }
        synchronized (N)
        {
            if (S != null)
            {
                S.a();
                S = null;
            }
        }
        synchronized (O)
        {
            if (T != null)
            {
                T.a();
                T = null;
            }
        }
        Q = null;
        p.bk.e.a("SyncProxy disposed.", "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            p.bk.e.a("SyncProxy disposed.", "42baba60-eb57-11df-98cf-0800200c9a66");
        }
        throw obj;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        obj;
        JVM INSTR monitorexit ;
        throw exception2;
    }

}
