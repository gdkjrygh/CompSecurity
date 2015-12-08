// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ch;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.j;
import com.getpebble.android.kit.PebbleKit;
import com.pandora.android.PandoraService;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.provider.b;
import com.pandora.android.util.aj;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.f;
import com.pandora.radio.provider.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p.bz.m;
import p.bz.t;
import p.cw.c;
import p.cx.l;
import p.cx.p;
import p.cx.x;
import p.dd.an;
import p.dd.ap;
import p.dd.as;
import p.dd.au;
import p.dd.ay;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;
import p.dd.bh;
import p.dd.e;

public class a
    implements com.pandora.android.util.aj.a, l
{

    protected static Integer i = Integer.valueOf(5000);
    protected static int l = 2;
    protected static int m = 1;
    private static Integer u = Integer.valueOf(116);
    private static String w = "pebble://appstore/52de169ee43bba335500003f";
    protected com.getpebble.android.kit.PebbleKit.PebbleAckReceiver a;
    protected long b;
    protected aa c;
    protected p.cw.b.a d;
    protected boolean e;
    protected boolean f;
    protected boolean g;
    protected y h;
    protected Runnable j;
    protected Handler k;
    private Context n;
    private UUID o;
    private com.getpebble.android.kit.PebbleKit.PebbleDataReceiver p;
    private com.getpebble.android.kit.PebbleKit.PebbleNackReceiver q;
    private List r;
    private boolean s;
    private p.cx.e.a t;
    private HashMap v;
    private BroadcastReceiver x;

    public a(Context context)
    {
        o = null;
        p = null;
        a = null;
        q = null;
        r = new ArrayList();
        b = 0L;
        s = true;
        c = null;
        d = null;
        t = null;
        e = false;
        f = false;
        g = false;
        h = null;
        x = new BroadcastReceiver() {

            final a a;

            public void onReceive(Context context1, Intent intent)
            {
                context1 = intent.getAction();
                if (context1.equals(PandoraIntent.a("show_no_station_selected")))
                {
                    a.c = null;
                    a.a(a, (byte)1);
                    p.ch.a.b("PLAYING_STATUS_NO_ACTIVE_STATION");
                } else
                if (context1.equals(PandoraIntent.a("show_no_stations")))
                {
                    a.c = null;
                    a.a(a, (byte)7);
                    p.ch.a.b("PLAYING_STATUS_NO_STATIONS");
                    return;
                }
            }

            
            {
                a = a.this;
                super();
            }
        };
        n = context;
        if (b.a.b().k().z())
        {
            s = false;
        }
    }

    protected static String a(String s1)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        s1 = "";
_L4:
        return s1;
_L2:
        String s2 = s1;
        if (s1.length() > 32)
        {
            s2 = s1.substring(0, 32);
        }
        do
        {
            s1 = s2;
            if (s2.getBytes().length <= 32)
            {
                continue;
            }
            s2 = s2.substring(0, s2.length() - 1);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(byte byte0)
    {
        if (!l())
        {
            return;
        } else
        {
            p.bo.a a1 = new p.bo.a();
            a1.a(0, byte0);
            a1.a(1, "");
            a1.a(2, "");
            a1.a(3, "");
            a1.a(4, (byte)0);
            a1.a(5, (byte)n());
            d(a1);
            k();
            return;
        }
    }

    static void a(a a1)
    {
        a1.u();
    }

    static void a(a a1, byte byte0)
    {
        a1.a(byte0);
    }

    static void a(a a1, p.bo.a a2)
    {
        a1.d(a2);
    }

    static HashMap b(a a1)
    {
        return a1.v;
    }

    private void b(int i1)
    {
        p.bo.a a1 = new p.bo.a();
        a1.b(32, i1);
        d(a1);
        k();
    }

    private void b(aa aa1)
    {
        if (l()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1;
        p.bo.a a1;
        p.bo.a a2;
        if (com.pandora.android.ads.VideoAdManager.c.a().l())
        {
            s();
            return;
        }
        if (b.a.b().C())
        {
            a((byte)8);
            return;
        }
        a2 = new p.bo.a();
        a1 = null;
        s1 = null;
        if (aa1 != null) goto _L4; else goto _L3
_L3:
        if (h == null)
        {
            if (v == null)
            {
                u();
            }
            if (t == null || t == p.cx.e.a.a)
            {
                a((byte)5);
                return;
            }
            if (t == p.cx.e.a.d || t == p.cx.e.a.c)
            {
                a((byte)6);
                return;
            }
            if (v.size() == 0)
            {
                a((byte)7);
                c("PLAYING_STATUS_NO_STATIONS");
                return;
            } else
            {
                a((byte)1);
                c("PLAYING_STATUS_NO_ACTIVE_STATION");
                return;
            }
        }
        if (r.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        aa1 = (p.bo.a)r.get(0);
        if (aa1.a(0) && aa1.b(0).longValue() == 5L) goto _L1; else goto _L5
_L5:
        a2.a(0, (byte)5);
        String s2 = "PLAYING_STATUS_LOADING";
        aa1 = "";
        a1 = s1;
        s1 = s2;
_L7:
        c((new StringBuilder()).append(s1).append(aa1).toString());
        d(a2);
        if (a1 != null)
        {
            d(a1);
        }
        k();
        return;
_L4:
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        if (d == p.cw.b.a.b)
        {
            s1 = "PLAYING_STATUS_IS_PLAYING";
            a2.a(0, (byte)3);
        } else
        {
            s1 = "PLAYING_STATUS_IS_PAUSED";
            a2.a(0, (byte)4);
        }
        c = aa1;
        s5 = a(aa1.s());
        s6 = a(aa1.t());
        s7 = a(aa1.u());
        s4 = (new StringBuilder()).append(": [").append(s5).append("],[").append(s6).append("],[").append(s7).append("]").toString();
        s3 = s5;
        if (aa1.M())
        {
            s3 = s5;
            if (com.pandora.android.util.s.a(s5))
            {
                s3 = "Audio Ad";
            }
        }
        if (s6.getBytes().length + s3.getBytes().length + s3.getBytes().length > 50)
        {
            a1 = new p.bo.a();
            a1.a(1, s6);
            a1.a(3, s7);
        } else
        {
            a2.a(1, s6);
            a2.a(3, s7);
        }
        a2.a(2, s3);
        a2.a(4, (byte)aa1.E());
        a2.a(5, (byte)n());
        a2.a(7, (byte)aj.a());
        a2.b(6, a(aa1));
        aa1 = s4;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void b(String s1)
    {
        c(s1);
    }

    private void b(p.bo.a a1)
    {
        c c1;
        p.cw.b b1;
        c1 = b.a.b();
        b1 = c1.d();
        (int)a1.c(0).longValue();
        JVM INSTR lookupswitch 7: default 88
    //                   16: 96
    //                   17: 107
    //                   18: 121
    //                   19: 135
    //                   20: 168
    //                   32: 180
    //                   33: 187;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        c1.z().a();
        return;
_L2:
        t();
        q();
        continue; /* Loop/switch isn't completed */
_L3:
        f = true;
        b1.c();
        continue; /* Loop/switch isn't completed */
_L4:
        f = true;
        b1.d();
        continue; /* Loop/switch isn't completed */
_L5:
        if (b1.o())
        {
            b1.b(p.cw.b.c.a);
        } else
        {
            b1.a(p.cw.b.c.a);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        b1.b("WATCH");
        continue; /* Loop/switch isn't completed */
_L7:
        g();
        continue; /* Loop/switch isn't completed */
_L8:
        h();
        if (true) goto _L1; else goto _L9
_L9:
    }

    static Context c(a a1)
    {
        return a1.n;
    }

    private static void c(String s1)
    {
        p.df.a.a("WatchManager", (new StringBuilder()).append("PEBBLE - ").append(s1).toString());
    }

    private void c(p.bo.a a1)
    {
        int i1 = (int)a1.c(1).longValue();
        if (c == null || n() == -1 || n() != i1)
        {
            (new AsyncTask(i1) {

                final int a;
                final a b;

                protected transient Void a(Void avoid[])
                {
                    avoid = (y)b.i().get(a);
                    b.a.b().d().a(avoid, null, false, p.cw.b.b.a, new com.pandora.android.data.c(true));
                    return null;
                }

                protected Object doInBackground(Object aobj[])
                {
                    return a((Void[])aobj);
                }

            
            {
                b = a.this;
                a = i1;
                super();
            }
            }).execute(new Void[0]);
        }
    }

    private static void d(String s1)
    {
        p.df.a.c("WatchManager", (new StringBuilder()).append("PEBBLE - ").append(s1).toString());
    }

    private void d(p.bo.a a1)
    {
        r.add(a1);
    }

    static void d(a a1)
    {
        a1.w();
    }

    static Integer p()
    {
        return u;
    }

    private void q()
    {
        b(c);
        j();
        r();
    }

    private void r()
    {
        if (!l())
        {
            return;
        } else
        {
            p.bo.a a1 = new p.bo.a();
            a1.a(16, (byte)l);
            a1.a(17, (byte)m);
            d(a1);
            a(true);
            return;
        }
    }

    private void s()
    {
        e = true;
        p.bo.a a1 = new p.bo.a();
        d(a1);
        a1.a(1, "");
        a1.a(2, "Video Ad");
        a1.a(3, "");
        a1.a(4, (byte)0);
        a1.a(5, (byte)n());
        a1.b(6, (byte)4);
        a1.a(7, (byte)aj.a());
        k();
    }

    private void t()
    {
        boolean flag;
        if (com.pandora.android.provider.b.a() && b.a.g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable() {

                final a a;

                public void run()
                {
                    b.a.a(p.ch.a.c(a), new Intent(p.ch.a.c(a), com/pandora/android/PandoraService));
                }

            
            {
                a = a.this;
                super();
            }
            });
        }
    }

    private void u()
    {
        List list = i();
        v = new HashMap();
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            v.put(((y)list.get(i1)).h(), Integer.valueOf(i1));
        }

    }

    private void v()
    {
        (new AsyncTask() {

            final a a;

            protected transient Void a(Void avoid[])
            {
                if (a.k != null)
                {
                    a.k.removeCallbacks(a.j);
                }
                a.k = new Handler(Looper.getMainLooper());
                a.j = new Runnable(this) {

                    final _cls3 a;

                    public void run()
                    {
                        a.d(a.a);
                    }

            
            {
                a = _pcls3;
                super();
            }
                };
                a.k.postDelayed(a.j, a.m());
                return null;
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            
            {
                a = a.this;
                super();
            }
        }).execute(new Void[0]);
    }

    private void w()
    {
        d("executing checkForPebbleWatchResponse");
        if (s)
        {
            b = 0L;
            String s1 = b.a.h().getString(0x7f08020b);
            String s2 = b.a.h().getString(0x7f08020c);
            PandoraIntent pandoraintent = new PandoraIntent("show_yes_no_dialog");
            pandoraintent.putExtra("intent_message", s2);
            pandoraintent.putExtra("intent_title", s1);
            pandoraintent.putExtra("intent_followon_intent", new Intent("android.intent.action.VIEW", Uri.parse(w)));
            b.a.C().a(pandoraintent);
            s = false;
            b.a.b().k().c(true);
        }
    }

    protected byte a(aa aa1)
    {
        byte byte0 = 0;
        if (aa1.B())
        {
            byte0 = (byte)1;
        }
        byte byte1 = byte0;
        if (!aa1.M())
        {
            byte1 = (byte)(byte0 | 2);
        }
        return byte1;
    }

    public void a()
    {
        b.a.b().c(this);
        b.a.e().b(this);
        n.unregisterReceiver(p);
        n.unregisterReceiver(a);
        n.unregisterReceiver(q);
        b.a.C().a(x);
        PebbleKit.b(n, o);
        aj.b(this);
    }

    public void a(int i1)
    {
        b(c);
    }

    protected void a(int i1, p.bo.a a1)
    {
        g = true;
        if (s)
        {
            s = false;
            b.a.b().k().c(true);
        }
        if (!a1.a(0)) goto _L2; else goto _L1
_L1:
        b(a1);
_L4:
        PebbleKit.a(n, i1);
        return;
_L2:
        if (a1.a(1))
        {
            c(a1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void a(p.bo.a a1)
    {
        PebbleKit.a(n, o, a1);
        c((new StringBuilder()).append("Data Sent: ").append(a1.b()).toString());
    }

    protected boolean a(boolean flag)
    {
        boolean flag1;
        if (System.currentTimeMillis() - b < 1000L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!l() || flag1 || r.size() == 0)
        {
            return false;
        } else
        {
            a((p.bo.a)r.remove(0));
            b = System.currentTimeMillis();
            return true;
        }
    }

    public void b()
    {
        o = new UUID(0x7b3f5649f03a42f9L, 0x9d86be21b04749a5L);
        p = new com.getpebble.android.kit.PebbleKit.PebbleDataReceiver(o) {

            final a a;

            public void a(Context context, int i1, p.bo.a a1)
            {
                a.a(i1, a1);
            }

            
            {
                a = a.this;
                super(uuid);
            }
        };
        a = new com.getpebble.android.kit.PebbleKit.PebbleAckReceiver(o) {

            final a a;

            public void a(Context context, int i1)
            {
                a.b = 0L;
                a.k();
            }

            
            {
                a = a.this;
                super(uuid);
            }
        };
        q = new com.getpebble.android.kit.PebbleKit.PebbleNackReceiver(o) {

            final a a;

            public void a(Context context, int i1)
            {
                a.b = 0L;
                a.k();
            }

            
            {
                a = a.this;
                super(uuid);
            }
        };
        b.a.b().b(this);
        b.a.e().c(this);
        b.a.b().e().a(this);
        PebbleKit.a(n, new BroadcastReceiver() {

            final a a;

            public void onReceive(Context context, Intent intent)
            {
                a.c();
            }

            
            {
                a = a.this;
                super();
            }
        });
        PebbleKit.b(n, new BroadcastReceiver() {

            final a a;

            public void onReceive(Context context, Intent intent)
            {
                a.d();
            }

            
            {
                a = a.this;
                super();
            }
        });
        PebbleKit.a(n, p);
        PebbleKit.a(n, a);
        PebbleKit.a(n, q);
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("show_no_stations");
        pandoraintentfilter.a("show_no_station_selected");
        b.a.C().a(x, pandoraintentfilter);
        aj.a(this);
    }

    protected void c()
    {
        d("Pebble connected");
        q();
        b.a.e().a(new m(true));
    }

    protected void d()
    {
        d("Pebble disconnected");
        if (k != null)
        {
            k.removeCallbacks(j);
        }
        g = false;
        f = false;
        b.a.e().a(new m(false));
    }

    protected void e()
    {
        if (!b.a.b().k().A())
        {
            PebbleKit.a(n, o);
            if (s && l())
            {
                v();
            }
        }
    }

    protected void f()
    {
        (new AsyncTask() {

            final a a;

            protected transient Void a(Void avoid[])
            {
                a.a(a);
                return null;
            }

            protected void a(Void void1)
            {
                a.j();
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            protected void onPostExecute(Object obj)
            {
                a((Void)obj);
            }

            
            {
                a = a.this;
                super();
            }
        }).execute(new Void[0]);
    }

    protected void g()
    {
        aj.a(aj.a() + 1);
    }

    protected void h()
    {
        aj.a(aj.a() - 1);
    }

    protected List i()
    {
        return b.a.b().y().b(b.a.b().x().b("SORT_PREFERENCE"));
    }

    protected void j()
    {
        if (!l())
        {
            return;
        } else
        {
            (new AsyncTask() {

                final a a;

                protected transient Void a(Void avoid[])
                {
                    Object obj;
                    avoid = new ByteArrayOutputStream(p.ch.a.p().intValue());
                    obj = new p.bo.a();
                    byte byte0 = 64;
                    List list;
                    list = a.i();
                    avoid.write(list.size());
                    int i1 = 0;
_L3:
                    if (i1 >= list.size()) goto _L2; else goto _L1
_L1:
                    byte abyte0[];
                    abyte0 = ((y)list.get(i1)).d().getBytes("UTF-8");
                    if (abyte0.length + 2 + avoid.size() <= p.ch.a.p().intValue() - 6)
                    {
                        break MISSING_BLOCK_LABEL_220;
                    }
                    ((p.bo.a) (obj)).a(byte0, avoid.toByteArray());
                    a.a(a, ((p.bo.a) (obj)));
                    obj = new ByteArrayOutputStream(p.ch.a.p().intValue());
                    avoid = new p.bo.a();
                    byte0 = 65;
_L4:
                    ((ByteArrayOutputStream) (obj)).write(i1);
                    ((ByteArrayOutputStream) (obj)).write(abyte0);
                    ((ByteArrayOutputStream) (obj)).write(0);
                    i1++;
                    Object obj1 = obj;
                    obj = avoid;
                    avoid = ((Void []) (obj1));
                      goto _L3
_L2:
                    try
                    {
                        ((p.bo.a) (obj)).a(byte0, avoid.toByteArray());
                        a.a(a, ((p.bo.a) (obj)));
                        a.k();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Void avoid[])
                    {
                        p.df.a.e("WatchManager", "PEBBLE - Error occurring in sendStations.", avoid);
                    }
                    return null;
                    Void avoid1[] = avoid;
                    avoid = ((Void []) (obj));
                    obj = avoid1;
                      goto _L4
                }

                protected Object doInBackground(Object aobj[])
                {
                    return a((Void[])aobj);
                }

            
            {
                a = a.this;
                super();
            }
            }).execute(new Void[0]);
            return;
        }
    }

    protected void k()
    {
        a(false);
    }

    protected boolean l()
    {
        boolean flag;
        try
        {
            flag = PebbleKit.a(n);
        }
        catch (SecurityException securityexception)
        {
            p.df.a.c("WatchManager", "Failed to detect watch connection status", securityexception);
            return false;
        }
        return flag;
    }

    protected int m()
    {
        return i.intValue();
    }

    protected int n()
    {
        if (h != null && v != null)
        {
            Integer integer = (Integer)v.get(h.h());
            if (integer != null)
            {
                return integer.intValue();
            }
        }
        h = null;
        return -1;
    }

    public Map o()
    {
        if (l())
        {
            Hashtable hashtable = new Hashtable();
            hashtable.put("firmwareVersion", PebbleKit.b(n).a());
            Hashtable hashtable1;
            boolean flag;
            if (!b.a.b().k().A())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hashtable.put("autoLaunchEnabled", Boolean.valueOf(flag));
            hashtable.put("appDetected", Boolean.valueOf(g));
            if (f)
            {
                hashtable.put("triggeredApiCall", Boolean.valueOf(true));
                f = false;
            }
            hashtable1 = new Hashtable();
            hashtable1.put("pebbleInfo", hashtable);
            return hashtable1;
        } else
        {
            return null;
        }
    }

    public void onAutomotiveAccessory(e e1)
    {
        if (e1.a == p.dd.e.a.a)
        {
            PebbleKit.b(n, o);
            return;
        } else
        {
            e();
            q();
            return;
        }
    }

    public void onDeleteStation(p.dd.p p1)
    {
        (new AsyncTask() {

            final a a;

            protected transient Void a(Void avoid[])
            {
                a.a(a);
                return null;
            }

            protected void a(Void void1)
            {
label0:
                {
                    if (p.ch.a.b(a).size() != 0)
                    {
                        a.j();
                    }
                    if (a.c != null && a.n() == -1)
                    {
                        a.c = null;
                        if (p.ch.a.b(a).size() != 0)
                        {
                            break label0;
                        }
                        a.a(a, (byte)7);
                        p.ch.a.b("PLAYING_STATUS_NO_STATIONS");
                    }
                    return;
                }
                a.a(a, (byte)1);
                p.ch.a.b("PLAYING_STATUS_NO_ACTIVE_STATION");
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            protected void onPostExecute(Object obj)
            {
                a((Void)obj);
            }

            
            {
                a = a.this;
                super();
            }
        }).execute(new Void[0]);
    }

    public void onPlayerStateEvent(p.dd.ag ag1)
    {
        d = ag1.a;
        if (ag1.a != p.cw.b.a.e && ag1.a != p.cw.b.a.d)
        {
            q();
        }
        if (ag1.a == p.cw.b.a.d)
        {
            q();
            b(3);
        }
        if (ag1.a == p.cw.b.a.b)
        {
            e();
        }
    }

    public void onShutdownAppEvent(p.bz.p p1)
    {
        g = false;
        f = false;
        PebbleKit.b(n, o);
    }

    public void onSignInState(an an1)
    {
        t = an1.b;
        static class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[p.cx.e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.e.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls5.a[t.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(t).toString());

        case 3: // '\003'
            if (l())
            {
                e();
                q();
                f();
            }
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            return;

        case 4: // '\004'
            c = null;
            a((byte)6);
            c("PLAYING_STATUS_NO_USER_LOGGED_IN");
            return;
        }
    }

    public void onSkipTrack(ap ap1)
    {
        if (ap1.c == p.cw.d.a.b && ap1.b.equals("WATCH"))
        {
            b(0);
        }
    }

    public void onStationCreatedEvent(as as)
    {
        f();
    }

    public void onStationListSortedEvent(t t1)
    {
        f();
    }

    public void onStationPersonalizationChange(au au)
    {
        b(c);
    }

    public void onStationStateChange(ay ay1)
    {
        h = ay1.a;
        if (ay1.b == p.dd.ay.a.b || ay1.b == p.dd.ay.a.a)
        {
            ay1 = new p.bo.a();
            ay1.a(80, (byte)80);
            d(ay1);
            k();
        }
    }

    public void onThumbDown(bb bb1)
    {
        b(bb1.b);
    }

    public void onThumbRevert(bc bc)
    {
        b(1);
    }

    public void onThumbUp(bd bd1)
    {
        b(bd1.b);
    }

    public void onTrackStateEvent(bh bh1)
    {
        if (bh1.a == p.dd.bh.a.b || e)
        {
            e = false;
            b(bh1.b);
        }
    }

    public m producePebbleWatchConnectedAppEvent()
    {
        p.df.a.c("WatchManager", (new StringBuilder()).append("PEBBLE HERE2 - ").append(l()).toString());
        return new m(l());
    }

}
