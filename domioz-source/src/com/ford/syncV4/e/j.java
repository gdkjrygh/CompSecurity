// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ford.syncV4.a.a;
import com.ford.syncV4.c.b;
import com.ford.syncV4.c.c;
import com.ford.syncV4.c.d;
import com.ford.syncV4.c.e;
import com.ford.syncV4.d.a.f;
import com.ford.syncV4.e.c.a.m;
import com.ford.syncV4.e.c.a.n;
import com.ford.syncV4.e.c.a.q;
import com.ford.syncV4.e.c.a.r;
import com.ford.syncV4.e.c.a.t;
import com.ford.syncV4.e.c.ab;
import com.ford.syncV4.e.c.ac;
import com.ford.syncV4.e.c.ad;
import com.ford.syncV4.e.c.ae;
import com.ford.syncV4.e.c.af;
import com.ford.syncV4.e.c.ag;
import com.ford.syncV4.e.c.ah;
import com.ford.syncV4.e.c.ai;
import com.ford.syncV4.e.c.aj;
import com.ford.syncV4.e.c.ak;
import com.ford.syncV4.e.c.am;
import com.ford.syncV4.e.c.an;
import com.ford.syncV4.e.c.ao;
import com.ford.syncV4.e.c.ap;
import com.ford.syncV4.e.c.aq;
import com.ford.syncV4.e.c.ar;
import com.ford.syncV4.e.c.at;
import com.ford.syncV4.e.c.au;
import com.ford.syncV4.e.c.aw;
import com.ford.syncV4.e.c.ax;
import com.ford.syncV4.e.c.ay;
import com.ford.syncV4.e.c.az;
import com.ford.syncV4.e.c.ba;
import com.ford.syncV4.e.c.bb;
import com.ford.syncV4.e.c.bd;
import com.ford.syncV4.e.c.bf;
import com.ford.syncV4.e.c.bg;
import com.ford.syncV4.e.c.bh;
import com.ford.syncV4.e.c.bj;
import com.ford.syncV4.e.c.bk;
import com.ford.syncV4.e.c.bo;
import com.ford.syncV4.e.c.bp;
import com.ford.syncV4.e.c.br;
import com.ford.syncV4.e.c.bs;
import com.ford.syncV4.e.c.bt;
import com.ford.syncV4.e.c.bu;
import com.ford.syncV4.e.c.bw;
import com.ford.syncV4.e.c.bx;
import com.ford.syncV4.e.c.by;
import com.ford.syncV4.e.c.bz;
import com.ford.syncV4.e.c.cb;
import com.ford.syncV4.e.c.g;
import com.ford.syncV4.e.c.i;
import com.ford.syncV4.e.c.k;
import com.ford.syncV4.e.c.l;
import com.ford.syncV4.e.c.p;
import com.ford.syncV4.e.c.u;
import com.ford.syncV4.e.c.w;
import com.ford.syncV4.e.c.x;
import com.ford.syncV4.e.c.z;
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

// Referenced classes of package com.ford.syncV4.e:
//            bw, k, v, ag, 
//            c, e, g, bu, 
//            bv, l, m, n, 
//            o, p, q, r, 
//            s, t, u, w, 
//            x, y, z, aa, 
//            ab, ac, ad, ae, 
//            af, ah, ai, aj, 
//            ak, al, am, an, 
//            ao, ap, aq, as, 
//            at, au, av, aw, 
//            ax, d, b, ay, 
//            az, ba, bb, bd, 
//            be, bf, bg, bh, 
//            bi, bj, bk, bl, 
//            bm, bo, bp, bq, 
//            br, f, bs, ar, 
//            bt, bc, bn

public abstract class j
{

    private static final Object K = new Object();
    private static final Object L = new Object();
    private static final Object M = new Object();
    private static final Object N = new Object();
    private static Object ap = new Object();
    protected Vector A;
    protected Boolean B;
    protected String C;
    protected Boolean D;
    protected byte E;
    private com.ford.syncV4.g.d F;
    private com.ford.syncV4.e.b.b G;
    private final int H;
    private final int I;
    private final int J;
    private Object O;
    private com.ford.syncV4.h.g P;
    private e Q;
    private e R;
    private e S;
    private Boolean T;
    private Handler U;
    private String V;
    private long W;
    private String X;
    private Vector Y;
    private String Z;
    protected Service a;
    private Boolean aa;
    private com.ford.syncV4.e.c.a.j ab;
    private com.ford.syncV4.e.c.a.j ac;
    private Vector ad;
    private String ae;
    private String af;
    private String ag;
    private bs ah;
    private Vector ai;
    private boolean aj;
    private com.ford.syncV4.i.f ak;
    private Boolean al;
    private com.ford.syncV4.e.c.a.e am;
    private com.ford.syncV4.e.c.a.b an;
    private com.ford.syncV4.e.bw ao;
    private boolean aq;
    final int b;
    protected Boolean c;
    protected Boolean d;
    protected Boolean e;
    protected Boolean f;
    protected Boolean g;
    protected Boolean h;
    protected int i;
    protected int j;
    protected com.ford.syncV4.e.c.a.e k;
    protected com.ford.syncV4.e.c.a.b l;
    protected com.ford.syncV4.e.c.a.u m;
    protected bs n;
    protected String o;
    protected com.ford.syncV4.e.c.a.j p;
    protected com.ford.syncV4.e.c.a.j q;
    protected com.ford.syncV4.e.c.q r;
    protected Vector s;
    protected Vector t;
    protected au u;
    protected Vector v;
    protected Vector w;
    protected Vector x;
    protected Vector y;
    protected cb z;

    protected j(com.ford.syncV4.e.b.b b1, String s1, String s2, Vector vector, Boolean boolean1, com.ford.syncV4.e.c.a.j j1, com.ford.syncV4.e.c.a.j j2, 
            String s3, com.ford.syncV4.i.f f1)
    {
        F = null;
        G = null;
        a = null;
        H = 65529;
        I = 65530;
        J = 65535;
        O = new Object();
        P = null;
        T = Boolean.valueOf(false);
        U = null;
        b = 65531;
        c = Boolean.valueOf(false);
        V = null;
        W = System.currentTimeMillis();
        X = "N/A";
        Y = null;
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
        aj = false;
        ak = null;
        d = Boolean.valueOf(false);
        e = Boolean.valueOf(false);
        al = Boolean.valueOf(false);
        f = Boolean.valueOf(false);
        g = Boolean.valueOf(false);
        h = Boolean.valueOf(false);
        i = 0;
        j = 0;
        k = null;
        am = null;
        l = null;
        an = null;
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
        B = Boolean.valueOf(true);
        C = null;
        D = Boolean.valueOf(false);
        E = 1;
        ao = null;
        aq = false;
        E = 1;
        ao = new com.ford.syncV4.e.bw(this, (byte)0);
        T = Boolean.valueOf(false);
        if (T.booleanValue())
        {
            U = new Handler(Looper.getMainLooper());
        }
        c = Boolean.valueOf(true);
        V = s1;
        Y = null;
        Z = s2;
        aa = boolean1;
        ah = null;
        ai = vector;
        ab = j1;
        ac = j2;
        ad = null;
        ae = s3;
        af = null;
        ak = f1;
        if (b1 == null)
        {
            throw new IllegalArgumentException("IProxyListener listener must be provided to instantiate SyncProxy object.");
        }
        if (c.booleanValue() && aa == null)
        {
            throw new IllegalArgumentException("isMediaApp must not be null when using SyncProxyALM.");
        }
        G = b1;
        synchronized (N)
        {
            if (S != null)
            {
                S.a();
                S = null;
            }
            S = new e("INTERNAL_MESSAGE_DISPATCHER", new c(), new com.ford.syncV4.e.k(this));
        }
        synchronized (L)
        {
            if (Q != null)
            {
                Q.a();
                Q = null;
            }
            Q = new e("INCOMING_MESSAGE_DISPATCHER", new b(), new v(this));
        }
        synchronized (M)
        {
            if (R != null)
            {
                R.a();
                R = null;
            }
            R = new e("OUTGOING_MESSAGE_DISPATCHER", new d(), new com.ford.syncV4.e.ag(this));
        }
        try
        {
            b();
        }
        // Misplaced declaration of an exception variable
        catch (com.ford.syncV4.e.b.b b1)
        {
            if (S != null)
            {
                S.a();
                S = null;
            }
            if (Q != null)
            {
                Q.a();
                Q = null;
            }
            if (R != null)
            {
                R.a();
                R = null;
            }
            throw b1;
        }
        com.ford.syncV4.h.e.a((new StringBuilder("SyncProxy Created, instanceID=")).append(toString()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
        s1;
        b1;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        b1;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        b1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private Intent a()
    {
        Intent intent = new Intent();
        intent.setAction("com.ford.syncV4.broadcast");
        intent.putExtra("APP_NAME", V);
        intent.putExtra("APP_ID", ae);
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

    private String a(com.ford.syncV4.e.c c1)
    {
        try
        {
            c1 = c1.a(E).toString(2);
        }
        // Misplaced declaration of an exception variable
        catch (com.ford.syncV4.e.c c1)
        {
            com.ford.syncV4.util.c.a("Error handing proxy event.", c1);
            a("Error serializing message.", ((Exception) (c1)));
            return null;
        }
        return c1;
    }

    static String a(j j1, String s1)
    {
        j1.ag = s1;
        return s1;
    }

    private static HttpURLConnection a(x x1, String s1, int i1, int j1)
    {
        String s2;
        String s3;
        int k1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (x1 != null)
        {
            s3 = x1.a();
            i1 = x1.b().intValue();
            flag = x1.c().booleanValue();
            flag1 = x1.d().booleanValue();
            flag2 = x1.e().booleanValue();
            s2 = x1.f();
            k1 = x1.i().intValue();
            flag3 = x1.j().booleanValue();
            String s4 = x1.k();
            j1 = x1.l().intValue();
            k1 *= 1000;
            i1 *= 1000;
            x1 = s4;
        } else
        {
            k1 = i1 * 1000;
            s3 = "application/json";
            int l1 = i1 * 1000;
            flag2 = false;
            flag1 = true;
            flag = true;
            s2 = "POST";
            flag3 = false;
            x1 = "utf-8";
            i1 = k1;
            k1 = l1;
        }
        try
        {
            s1 = (HttpURLConnection)(new URL(s1)).openConnection();
            s1.setConnectTimeout(i1);
            s1.setDoOutput(flag);
            s1.setDoInput(flag1);
            s1.setRequestMethod(s2);
            s1.setReadTimeout(k1);
            s1.setInstanceFollowRedirects(flag3);
            s1.setRequestProperty("Content-Type", s3);
            s1.setRequestProperty("charset", x1);
            s1.setRequestProperty("Content-Length", (new StringBuilder()).append(Integer.toString(j1)).toString());
            s1.setUseCaches(flag2);
        }
        // Misplaced declaration of an exception variable
        catch (x x1)
        {
            return null;
        }
        finally
        {
            throw x1;
        }
        return s1;
    }

    private void a(Intent intent)
    {
        if (G == null || !(G instanceof Service)) goto _L2; else goto _L1
_L1:
        Object obj = (Service)G;
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

    static void a(Intent intent, String s1, String s2)
    {
        b(intent, s1, s2);
    }

    static void a(j j1, byte byte0)
    {
        j1.E = byte0;
    }

    static void a(j j1, Intent intent)
    {
        j1.a(intent);
    }

    static void a(j j1, com.ford.syncV4.d.e e1)
    {
        synchronized (L)
        {
            if (j1.Q != null)
            {
                j1.Q.a(e1);
            }
        }
        return;
        j1;
        obj;
        JVM INSTR monitorexit ;
        throw j1;
    }

    static void a(j j1, an an1)
    {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        x x1;
        obj2 = null;
        obj3 = null;
        obj4 = an1.i();
        Integer integer = an1.k();
        obj = integer;
        if (integer == null)
        {
            obj = Integer.valueOf(2000);
        }
        x1 = an1.e();
        Object obj1 = an1.d();
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        an1 = new JSONArray(an1.c());
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("data", an1);
        obj1 = ((JSONObject) (obj1)).toString().replace("\\", "");
        boolean flag = true;
_L5:
        an1 = a(x1, ((String) (obj4)), ((Integer) (obj)).intValue(), ((String) (obj1)).getBytes("UTF-8").length);
        if (an1 != null) goto _L4; else goto _L3
_L3:
        if (an1 != null)
        {
            an1.disconnect();
        }
_L6:
        return;
_L2:
        obj1 = ((String) (obj1)).replace("\\", "");
        flag = false;
          goto _L5
_L4:
        obj = an1;
        obj3 = new DataOutputStream(an1.getOutputStream());
        obj = an1;
        ((DataOutputStream) (obj3)).writeBytes(((String) (obj1)));
        obj = an1;
        ((DataOutputStream) (obj3)).flush();
        obj = an1;
        ((DataOutputStream) (obj3)).close();
        obj = an1;
        System.currentTimeMillis();
        obj = an1;
        an1.getResponseMessage();
        obj = an1;
        System.currentTimeMillis();
        obj = an1;
        int i1 = an1.getResponseCode();
label0:
        {
            if (i1 == 200)
            {
                break label0;
            }
            if (an1 != null)
            {
                an1.disconnect();
                return;
            }
        }
          goto _L6
        obj = an1;
        obj3 = new BufferedReader(new InputStreamReader(an1.getInputStream()));
        obj = an1;
        obj1 = new StringBuffer();
_L8:
        obj = an1;
        obj4 = ((BufferedReader) (obj3)).readLine();
        if (obj4 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = an1;
        ((StringBuffer) (obj1)).append(((String) (obj4)));
        obj = an1;
        ((StringBuffer) (obj1)).append('\r');
        if (true) goto _L8; else goto _L7
        obj;
        j1 = an1;
        an1 = ((an) (obj));
_L29:
        com.ford.syncV4.util.c.a("sendOnSystemRequestToUrl: Could not get data from JSONObject received.", an1);
        if (j1 != null)
        {
            j1.disconnect();
            return;
        }
          goto _L6
_L7:
        obj = an1;
        ((BufferedReader) (obj3)).close();
        obj = an1;
        obj3 = new Vector();
        obj = an1;
        obj4 = new JSONObject(((StringBuffer) (obj1)).toString());
        obj = an1;
        if (!(((JSONObject) (obj4)).get("data") instanceof JSONArray)) goto _L10; else goto _L9
_L9:
        obj = an1;
        obj4 = ((JSONObject) (obj4)).getJSONArray("data");
        i1 = 0;
_L30:
        obj = an1;
        if (i1 >= ((JSONArray) (obj4)).length()) goto _L12; else goto _L11
_L11:
        obj = an1;
        if (!(((JSONArray) (obj4)).get(i1) instanceof String))
        {
            break MISSING_BLOCK_LABEL_819;
        }
        obj = an1;
        ((Vector) (obj3)).add(((JSONArray) (obj4)).getString(i1));
        break MISSING_BLOCK_LABEL_819;
_L10:
        obj = an1;
        if (!(((JSONObject) (obj4)).get("data") instanceof String)) goto _L14; else goto _L13
_L13:
        obj = an1;
        ((Vector) (obj3)).add(((JSONObject) (obj4)).getString("data"));
_L12:
        obj = an1;
        obj4 = ((Vector) (obj3)).toString();
        obj = an1;
        if (((String) (obj4)).length() <= 512)
        {
            break MISSING_BLOCK_LABEL_485;
        }
        obj = an1;
        ((String) (obj4)).substring(0, 511);
        if (!flag) goto _L16; else goto _L15
_L15:
        obj = an1;
        obj1 = new bt((byte)0);
        obj = an1;
        ((bt) (obj1)).a(Integer.valueOf(65535));
        obj = an1;
        ((bt) (obj1)).a(((Vector) (obj3)));
_L19:
        obj = an1;
        if (!j1.d().booleanValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = an1;
        j1.b(((com.ford.syncV4.e.e) (obj1)));
        obj = an1;
        Log.i("sendOnSystemRequestToUrl", "sent to sync");
        if (an1 == null) goto _L6; else goto _L17
_L17:
        an1.disconnect();
        return;
_L14:
        obj = an1;
        com.ford.syncV4.util.c.a("sendOnSystemRequestToUrl: Data in JSON Object neither an array nor a string.");
        if (an1 != null)
        {
            an1.disconnect();
            return;
        }
          goto _L6
_L16:
        obj = an1;
        obj3 = ((StringBuffer) (obj1)).toString();
        obj1 = obj2;
        if (obj3 == null) goto _L19; else goto _L18
_L18:
        obj = an1;
        obj1 = new bt();
        obj = an1;
        ((bt) (obj1)).a(m.f);
        obj = an1;
        ((bt) (obj1)).a(Integer.valueOf(65535));
        obj = an1;
        ((bt) (obj1)).a(((String) (obj3)).getBytes());
          goto _L19
        j1;
_L28:
        obj = an1;
        com.ford.syncV4.util.c.a("sendOnSystemRequestToUrl: JSONException: ", j1);
        if (an1 != null)
        {
            an1.disconnect();
            return;
        }
          goto _L6
        j1;
        an1 = null;
_L27:
        obj = an1;
        com.ford.syncV4.util.c.a("sendOnSystemRequestToUrl: Could not encode string.", j1);
        if (an1 != null)
        {
            an1.disconnect();
            return;
        }
          goto _L6
        j1;
        an1 = null;
_L26:
        obj = an1;
        com.ford.syncV4.util.c.a("sendOnSystemRequestToUrl: Could not set request method to post.", j1);
        if (an1 != null)
        {
            an1.disconnect();
            return;
        }
          goto _L6
        j1;
        an1 = null;
_L25:
        obj = an1;
        com.ford.syncV4.util.c.a("sendOnSystemRequestToUrl: URL Exception when sending SystemRequest to an external server.", j1);
        if (an1 != null)
        {
            an1.disconnect();
            return;
        }
          goto _L6
        j1;
        an1 = null;
_L24:
        obj = an1;
        com.ford.syncV4.util.c.a("sendOnSystemRequestToUrl: IOException: ", j1);
        if (an1 != null)
        {
            an1.disconnect();
            return;
        }
          goto _L6
        j1;
        an1 = null;
_L23:
        obj = an1;
        com.ford.syncV4.util.c.a("sendOnSystemRequestToUrl: Unexpected Exception: ", j1);
        if (an1 == null) goto _L6; else goto _L20
_L20:
        an1.disconnect();
        return;
        j1;
        obj = null;
_L22:
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw j1;
        j1;
        continue; /* Loop/switch isn't completed */
        an1;
        obj = j1;
        j1 = an1;
        if (true) goto _L22; else goto _L21
_L21:
        j1;
          goto _L23
        j1;
          goto _L24
        j1;
          goto _L25
        j1;
          goto _L26
        j1;
          goto _L27
        j1;
        an1 = null;
          goto _L28
        an1;
        j1 = ((j) (obj3));
          goto _L29
        i1++;
          goto _L30
    }

    static void a(j j1, String s1, Exception exception)
    {
        j1.a(s1, exception);
    }

    private void a(String s1, Exception exception)
    {
        b(new com.ford.syncV4.e.a.b(s1, exception));
    }

    private static boolean a(Integer integer)
    {
        return integer != null && (65531 == integer.intValue() || 65529 == integer.intValue() || 65530 == integer.intValue() || 65535 == integer.intValue());
    }

    static com.ford.syncV4.i.f b(j j1)
    {
        return j1.ak;
    }

    private void b()
    {
        al = Boolean.valueOf(false);
        f = Boolean.valueOf(false);
        g = Boolean.valueOf(false);
        if (e.booleanValue())
        {
            d = Boolean.valueOf(true);
        } else
        {
            d = Boolean.valueOf(false);
        }
        j = t.b;
        synchronized (K)
        {
            F = com.ford.syncV4.g.d.a(E, ao, ak);
        }
        obj = K;
        obj;
        JVM INSTR monitorenter ;
        F.f();
        if (F != null && ak != null) goto _L2; else goto _L1
_L1:
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        String s1 = F.a(ak);
        if (s1 == null) goto _L1; else goto _L3
_L3:
        if (s1.equals("")) goto _L1; else goto _L4
_L4:
        Intent intent = a();
        b(intent, "FUNCTION_NAME", "initializeProxy");
        b(intent, "COMMENT1", s1);
        a(intent);
          goto _L1
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private static void b(Intent intent, String s1, String s2)
    {
        String s3 = s2;
        if (s2 == null)
        {
            s3 = "";
        }
        intent.putExtra(s1, s3);
    }

    private void b(com.ford.syncV4.e.a.a a1)
    {
        synchronized (N)
        {
            if (S != null)
            {
                S.a(a1);
            }
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private void b(com.ford.syncV4.e.e e1)
    {
        Object obj;
        try
        {
            com.ford.syncV4.h.e.a(com.ford.syncV4.h.a.b.a, e1, "42baba60-eb57-11df-98cf-0800200c9a66");
            byte abyte0[] = com.ford.syncV4.b.a.a(e1, E);
            obj = new com.ford.syncV4.d.e();
            ((com.ford.syncV4.d.e) (obj)).a(abyte0);
            if (F != null)
            {
                ((com.ford.syncV4.d.e) (obj)).b(F.d());
            }
            ((com.ford.syncV4.d.e) (obj)).a(com.ford.syncV4.d.a.e.c);
            ((com.ford.syncV4.d.e) (obj)).a(f.c);
            ((com.ford.syncV4.d.e) (obj)).b(com.ford.syncV4.d.a.c.a(e1.a()));
            if (e1.c() == null)
            {
                throw new a((new StringBuilder("CorrelationID cannot be null. RPC: ")).append(e1.a()).toString(), com.ford.syncV4.a.b.f);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.ford.syncV4.h.e.a((new StringBuilder("OutOfMemory exception while sending request ")).append(e1.a()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new a((new StringBuilder("OutOfMemory exception while sending request ")).append(e1.a()).toString(), ((Throwable) (obj)), com.ford.syncV4.a.b.f);
        }
        ((com.ford.syncV4.d.e) (obj)).c(e1.c().intValue());
        if (e1.h() != null)
        {
            ((com.ford.syncV4.d.e) (obj)).b(e1.h());
        }
        synchronized (M)
        {
            if (R != null)
            {
                R.a(obj);
            }
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void b(j j1, com.ford.syncV4.d.e e1)
    {
        boolean flag = true;
        boolean flag1 = e1.e().a(f.c);
        if (!flag1) goto _L2; else goto _L1
_L1:
        if (j1.E == 1 && e1.a() > 1)
        {
            j1.E = e1.a();
        }
        obj1 = new Hashtable();
        if (j1.E <= 1) goto _L4; else goto _L3
_L3:
        String s1;
        obj = new Hashtable();
        ((Hashtable) (obj)).put("correlationID", Integer.valueOf(e1.h()));
        if (e1.i() > 0)
        {
            ((Hashtable) (obj)).put("parameters", com.ford.syncV4.b.a.a(e1.c()));
        }
        new com.ford.syncV4.d.a.c();
        s1 = com.ford.syncV4.d.a.c.a(e1.g());
        if (s1 == null) goto _L6; else goto _L5
_L5:
        ((Hashtable) (obj)).put("name", s1);
        if (e1.f() != 0) goto _L8; else goto _L7
_L7:
        ((Hashtable) (obj1)).put("request", obj);
_L43:
        obj = obj1;
        if (e1.d() == null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        ((Hashtable) (obj1)).put("bulkData", e1.d());
        obj = obj1;
_L21:
        obj1 = new com.ford.syncV4.e.c(((Hashtable) (obj)));
        e1 = ((com.ford.syncV4.e.c) (obj1)).a();
        s1 = ((com.ford.syncV4.e.c) (obj1)).b();
        if (!s1.equals("response")) goto _L10; else goto _L9
_L9:
        com.ford.syncV4.h.e.a(com.ford.syncV4.h.a.b.b, new com.ford.syncV4.e.g(((com.ford.syncV4.e.c) (obj1))), "42baba60-eb57-11df-98cf-0800200c9a66");
        if (!a((new com.ford.syncV4.e.g(((Hashtable) (obj)))).c())) goto _L12; else goto _L11
_L11:
        if ((new com.ford.syncV4.e.g(((Hashtable) (obj)))).c().intValue() != 65529 || !j1.c.booleanValue() || !e1.equals("RegisterAppInterface")) goto _L14; else goto _L13
_L13:
        e1 = new az(((Hashtable) (obj)));
        if (e1.d().booleanValue())
        {
            j1.d = Boolean.valueOf(true);
        }
        obj = j1.a();
        b(((Intent) (obj)), "RPC_NAME", "RegisterAppInterface");
        b(((Intent) (obj)), "TYPE", "response");
        ((Intent) (obj)).putExtra("SUCCESS", e1.d().booleanValue());
        b(((Intent) (obj)), "COMMENT1", e1.f());
        b(((Intent) (obj)), "COMMENT2", e1.e().toString());
        b(((Intent) (obj)), "DATA", j1.a(e1));
        ((Intent) (obj)).putExtra("CORRID", e1.c().intValue());
        j1.a(((Intent) (obj)));
        j1.o = "8675309";
        j1.s = e1.m();
        j1.r = e1.l();
        j1.t = e1.n();
        j1.u = e1.o();
        j1.v = e1.p();
        j1.w = e1.q();
        j1.x = e1.r();
        j1.p = e1.j();
        j1.q = e1.k();
        j1.n = e1.i();
        j1.y = e1.s();
        j1.z = e1.t();
        j1.C = "2.3";
        if (!j1.aj) goto _L16; else goto _L15
_L15:
        if (e1.e() != n.F && e1.e() == n.a) goto _L18; else goto _L17
_L17:
        j1.D = Boolean.valueOf(false);
        j1.ag = null;
_L16:
        j1.A = e1.u();
        obj = (new StringBuilder("SYNC Proxy Version: ")).append(j1.C).toString();
        if (com.ford.syncV4.util.c.c()) goto _L20; else goto _L19
_L19:
        com.ford.syncV4.util.c.a();
        com.ford.syncV4.util.c.d(((String) (obj)));
        com.ford.syncV4.util.c.b();
_L23:
        obj1 = j1.a();
        b(((Intent) (obj1)), "FUNCTION_NAME", "RAI_RESPONSE");
        b(((Intent) (obj1)), "COMMENT1", ((String) (obj)));
        j1.a(((Intent) (obj1)));
        j1.i = q.a;
        if (!e1.d().booleanValue())
        {
            j1.a("Unable to register app interface. Review values passed to the SyncProxy constructor. RegisterAppInterface result code: ", new a((new StringBuilder("Unable to register app interface. Review values passed to the SyncProxy constructor. RegisterAppInterface result code: ")).append(e1.e()).toString(), com.ford.syncV4.a.b.n), r.r);
        }
        if (j1.T.booleanValue())
        {
            j1.U.post(new com.ford.syncV4.e.bu(j1, e1));
            return;
        }
          goto _L2
_L6:
        try
        {
            com.ford.syncV4.util.c.b((new StringBuilder("Dispatch Incoming Message - function name is null unknown RPC.  FunctionID: ")).append(e1.g()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.ford.syncV4.d.e e1) { }
        try
        {
            com.ford.syncV4.util.c.a((new StringBuilder("Failure handling protocol message: ")).append(e1.toString()).toString(), e1);
            j1.a("Error handing incoming protocol message.", e1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.ford.syncV4.d.e e1)
        {
            com.ford.syncV4.util.c.a("Error handing proxy event.", e1);
        }
        j1.a("Error handing incoming protocol message.", e1);
        return;
_L8:
        if (e1.f() == 1)
        {
            ((Hashtable) (obj1)).put("response", obj);
            continue; /* Loop/switch isn't completed */
        }
        if (e1.f() == 2)
        {
            ((Hashtable) (obj1)).put("notification", obj);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = com.ford.syncV4.b.a.a(e1.c());
          goto _L21
_L18:
        if (j1.n.a().intValue() <= 2 || j1.ag == null || e1.e() != n.a) goto _L16; else goto _L22
_L22:
        j1.D = Boolean.valueOf(true);
          goto _L16
_L20:
        com.ford.syncV4.util.c.d(((String) (obj)));
          goto _L23
_L14:
        if ((new com.ford.syncV4.e.g(((Hashtable) (obj)))).c().intValue() != 65535 || !e1.equals("OnEncodedSyncPData")) goto _L25; else goto _L24
_L24:
        e1 = new an(((Hashtable) (obj)));
        if (e1.i() != null)
        {
            (new bv(j1, e1)).start();
            return;
        }
          goto _L2
_L25:
        if ((new com.ford.syncV4.e.g(((Hashtable) (obj)))).c().intValue() == 65535 && e1.equals("EncodedSyncPData"))
        {
            e1 = new bu(((Hashtable) (obj)));
            obj = j1.a();
            b(((Intent) (obj)), "RPC_NAME", "SystemRequest");
            b(((Intent) (obj)), "TYPE", "response");
            ((Intent) (obj)).putExtra("SUCCESS", e1.d().booleanValue());
            b(((Intent) (obj)), "COMMENT1", e1.f());
            b(((Intent) (obj)), "COMMENT2", e1.e().toString());
            ((Intent) (obj)).putExtra("CORRID", e1.c().intValue());
            j1.a(((Intent) (obj)));
            return;
        }
        if ((new com.ford.syncV4.e.g(((Hashtable) (obj)))).c().intValue() == 65535 && e1.equals("SystemRequest"))
        {
            e1 = new bu(((Hashtable) (obj)));
            obj = j1.a();
            b(((Intent) (obj)), "RPC_NAME", "SystemRequest");
            b(((Intent) (obj)), "TYPE", "response");
            ((Intent) (obj)).putExtra("SUCCESS", e1.d().booleanValue());
            b(((Intent) (obj)), "COMMENT1", e1.f());
            b(((Intent) (obj)), "COMMENT2", e1.e().toString());
            ((Intent) (obj)).putExtra("CORRID", e1.c().intValue());
            b(((Intent) (obj)), "DATA", j1.a(e1));
            j1.a(((Intent) (obj)));
            return;
        }
        if (!e1.equals("UnregisterAppInterface")) goto _L2; else goto _L26
_L26:
        j1.d = Boolean.valueOf(false);
        synchronized (j1.O)
        {
            j1.O.notify();
        }
        e1 = new bx(((Hashtable) (obj)));
        obj = j1.a();
        b(((Intent) (obj)), "RPC_NAME", "UnregisterAppInterface");
        b(((Intent) (obj)), "TYPE", "response");
        ((Intent) (obj)).putExtra("SUCCESS", e1.d().booleanValue());
        b(((Intent) (obj)), "COMMENT1", e1.f());
        b(((Intent) (obj)), "COMMENT2", e1.e().toString());
        b(((Intent) (obj)), "DATA", j1.a(e1));
        ((Intent) (obj)).putExtra("CORRID", e1.c().intValue());
        j1.a(((Intent) (obj)));
        return;
        obj;
        e1;
        JVM INSTR monitorexit ;
        throw obj;
_L12:
        if (!e1.equals("RegisterAppInterface")) goto _L28; else goto _L27
_L27:
        obj = new az(((Hashtable) (obj)));
        if (((az) (obj)).d().booleanValue())
        {
            j1.d = Boolean.valueOf(true);
        }
        j1.o = "8675309";
        j1.s = ((az) (obj)).m();
        j1.r = ((az) (obj)).l();
        j1.t = ((az) (obj)).n();
        j1.u = ((az) (obj)).o();
        j1.v = ((az) (obj)).p();
        j1.w = ((az) (obj)).q();
        j1.x = ((az) (obj)).r();
        j1.p = ((az) (obj)).j();
        j1.q = ((az) (obj)).k();
        j1.n = ((az) (obj)).i();
        j1.y = ((az) (obj)).s();
        j1.z = ((az) (obj)).t();
        j1.C = "2.3";
        if (!j1.aj) goto _L30; else goto _L29
_L29:
        if (((az) (obj)).e() != n.F && ((az) (obj)).e() == n.a) goto _L32; else goto _L31
_L31:
        j1.D = Boolean.valueOf(false);
        j1.ag = null;
_L30:
        j1.A = ((az) (obj)).u();
        if (com.ford.syncV4.util.c.c()) goto _L34; else goto _L33
_L33:
        com.ford.syncV4.util.c.a();
        com.ford.syncV4.util.c.c((new StringBuilder("SYNC Proxy Version: ")).append(j1.C).toString());
        com.ford.syncV4.util.c.b();
_L38:
        if (!j1.c.booleanValue()) goto _L36; else goto _L35
_L35:
        j1.i = q.a;
        if (!((az) (obj)).d().booleanValue())
        {
            j1.a("Unable to register app interface. Review values passed to the SyncProxy constructor. RegisterAppInterface result code: ", new a((new StringBuilder("Unable to register app interface. Review values passed to the SyncProxy constructor. RegisterAppInterface result code: ")).append(((az) (obj)).e()).toString(), com.ford.syncV4.a.b.n), r.r);
        }
_L40:
        com.ford.syncV4.h.e.a((new StringBuilder("Proxy received RPC Message: ")).append(e1).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
_L32:
        if (j1.n.a().intValue() <= 2 || j1.ag == null || ((az) (obj)).e() != n.a) goto _L30; else goto _L37
_L37:
        j1.D = Boolean.valueOf(true);
          goto _L30
_L34:
        com.ford.syncV4.util.c.c((new StringBuilder("SYNC Proxy Version: ")).append(j1.C).toString());
          goto _L38
_L36:
        if (!j1.T.booleanValue()) goto _L40; else goto _L39
_L39:
        j1.U.post(new com.ford.syncV4.e.l(j1, ((az) (obj))));
          goto _L40
_L28:
label0:
        {
            if (!e1.equals("Speak"))
            {
                break MISSING_BLOCK_LABEL_1832;
            }
            obj = new bo(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label0;
            }
            j1.U.post(new com.ford.syncV4.e.m(j1, ((bo) (obj))));
        }
          goto _L40
        j1.G.onSpeakResponse(((bo) (obj)));
          goto _L40
label1:
        {
            if (!e1.equals("Alert"))
            {
                break MISSING_BLOCK_LABEL_1894;
            }
            obj = new com.ford.syncV4.e.c.e(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label1;
            }
            j1.U.post(new com.ford.syncV4.e.n(j1, ((com.ford.syncV4.e.c.e) (obj))));
        }
          goto _L40
        j1.G.onAlertResponse(((com.ford.syncV4.e.c.e) (obj)));
          goto _L40
label2:
        {
            if (!e1.equals("Show"))
            {
                break MISSING_BLOCK_LABEL_1956;
            }
            obj = new bj(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label2;
            }
            j1.U.post(new o(j1, ((bj) (obj))));
        }
          goto _L40
        j1.G.onShowResponse(((bj) (obj)));
          goto _L40
label3:
        {
            if (!e1.equals("AddCommand"))
            {
                break MISSING_BLOCK_LABEL_2018;
            }
            obj = new com.ford.syncV4.e.c.b(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label3;
            }
            j1.U.post(new com.ford.syncV4.e.p(j1, ((com.ford.syncV4.e.c.b) (obj))));
        }
          goto _L40
        j1.G.onAddCommandResponse(((com.ford.syncV4.e.c.b) (obj)));
          goto _L40
label4:
        {
            if (!e1.equals("DeleteCommand"))
            {
                break MISSING_BLOCK_LABEL_2080;
            }
            obj = new k(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label4;
            }
            j1.U.post(new com.ford.syncV4.e.q(j1, ((k) (obj))));
        }
          goto _L40
        j1.G.onDeleteCommandResponse(((k) (obj)));
          goto _L40
label5:
        {
            if (!e1.equals("AddSubMenu"))
            {
                break MISSING_BLOCK_LABEL_2142;
            }
            obj = new com.ford.syncV4.e.c.c(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label5;
            }
            j1.U.post(new com.ford.syncV4.e.r(j1, ((com.ford.syncV4.e.c.c) (obj))));
        }
          goto _L40
        j1.G.onAddSubMenuResponse(((com.ford.syncV4.e.c.c) (obj)));
          goto _L40
label6:
        {
            if (!e1.equals("DeleteSubMenu"))
            {
                break MISSING_BLOCK_LABEL_2204;
            }
            obj = new com.ford.syncV4.e.c.n(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label6;
            }
            j1.U.post(new s(j1, ((com.ford.syncV4.e.c.n) (obj))));
        }
          goto _L40
        j1.G.onDeleteSubMenuResponse(((com.ford.syncV4.e.c.n) (obj)));
          goto _L40
label7:
        {
            if (!e1.equals("SubscribeButton"))
            {
                break MISSING_BLOCK_LABEL_2266;
            }
            obj = new bp(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label7;
            }
            j1.U.post(new com.ford.syncV4.e.t(j1, ((bp) (obj))));
        }
          goto _L40
        j1.G.onSubscribeButtonResponse(((bp) (obj)));
          goto _L40
label8:
        {
            if (!e1.equals("UnsubscribeButton"))
            {
                break MISSING_BLOCK_LABEL_2328;
            }
            obj = new by(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label8;
            }
            j1.U.post(new com.ford.syncV4.e.u(j1, ((by) (obj))));
        }
          goto _L40
        j1.G.onUnsubscribeButtonResponse(((by) (obj)));
          goto _L40
label9:
        {
            if (!e1.equals("SetMediaClockTimer"))
            {
                break MISSING_BLOCK_LABEL_2390;
            }
            obj = new bh(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label9;
            }
            j1.U.post(new com.ford.syncV4.e.w(j1, ((bh) (obj))));
        }
          goto _L40
        j1.G.onSetMediaClockTimerResponse(((bh) (obj)));
          goto _L40
label10:
        {
            if (!e1.equals("EncodedSyncPData"))
            {
                break MISSING_BLOCK_LABEL_2537;
            }
            obj = new bu(((Hashtable) (obj)));
            obj1 = j1.a();
            b(((Intent) (obj1)), "RPC_NAME", "SystemRequest");
            b(((Intent) (obj1)), "TYPE", "response");
            ((Intent) (obj1)).putExtra("SUCCESS", ((bu) (obj)).d().booleanValue());
            b(((Intent) (obj1)), "COMMENT1", ((bu) (obj)).f());
            b(((Intent) (obj1)), "COMMENT2", ((bu) (obj)).e().toString());
            ((Intent) (obj1)).putExtra("CORRID", ((bu) (obj)).c().intValue());
            j1.a(((Intent) (obj1)));
            if (!j1.T.booleanValue())
            {
                break label10;
            }
            j1.U.post(new com.ford.syncV4.e.x(j1, ((bu) (obj))));
        }
          goto _L40
        j1.G.onSystemRequestResponse(((bu) (obj)));
          goto _L40
label11:
        {
            if (!e1.equals("CreateInteractionChoiceSet"))
            {
                break MISSING_BLOCK_LABEL_2599;
            }
            obj = new com.ford.syncV4.e.c.j(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label11;
            }
            j1.U.post(new y(j1, ((com.ford.syncV4.e.c.j) (obj))));
        }
          goto _L40
        j1.G.onCreateInteractionChoiceSetResponse(((com.ford.syncV4.e.c.j) (obj)));
          goto _L40
label12:
        {
            if (!e1.equals("DeleteInteractionChoiceSet"))
            {
                break MISSING_BLOCK_LABEL_2661;
            }
            obj = new com.ford.syncV4.e.c.m(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label12;
            }
            j1.U.post(new com.ford.syncV4.e.z(j1, ((com.ford.syncV4.e.c.m) (obj))));
        }
          goto _L40
        j1.G.onDeleteInteractionChoiceSetResponse(((com.ford.syncV4.e.c.m) (obj)));
          goto _L40
label13:
        {
            if (!e1.equals("PerformInteraction"))
            {
                break MISSING_BLOCK_LABEL_2723;
            }
            obj = new at(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label13;
            }
            j1.U.post(new aa(j1, ((at) (obj))));
        }
          goto _L40
        j1.G.onPerformInteractionResponse(((at) (obj)));
          goto _L40
label14:
        {
            if (!e1.equals("SetGlobalProperties"))
            {
                break MISSING_BLOCK_LABEL_2785;
            }
            obj = new bg(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label14;
            }
            j1.U.post(new com.ford.syncV4.e.ab(j1, ((bg) (obj))));
        }
          goto _L40
        j1.G.onSetGlobalPropertiesResponse(((bg) (obj)));
          goto _L40
label15:
        {
            if (!e1.equals("ResetGlobalProperties"))
            {
                break MISSING_BLOCK_LABEL_2847;
            }
            obj = new ba(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label15;
            }
            j1.U.post(new com.ford.syncV4.e.ac(j1, ((ba) (obj))));
        }
          goto _L40
        j1.G.onResetGlobalPropertiesResponse(((ba) (obj)));
          goto _L40
        if (!e1.equals("UnregisterAppInterface"))
        {
            break MISSING_BLOCK_LABEL_3033;
        }
        j1.d = Boolean.valueOf(false);
        synchronized (j1.O)
        {
            j1.O.notify();
        }
        obj = new bx(((Hashtable) (obj)));
        obj1 = j1.a();
        b(((Intent) (obj1)), "RPC_NAME", "UnregisterAppInterface");
        b(((Intent) (obj1)), "TYPE", "response");
        ((Intent) (obj1)).putExtra("SUCCESS", ((bx) (obj)).d().booleanValue());
        b(((Intent) (obj1)), "COMMENT1", ((bx) (obj)).f());
        b(((Intent) (obj1)), "COMMENT2", ((bx) (obj)).e().toString());
        b(((Intent) (obj1)), "DATA", j1.a(((com.ford.syncV4.e.c) (obj))));
        ((Intent) (obj1)).putExtra("CORRID", ((bx) (obj)).c().intValue());
        j1.a(((Intent) (obj1)));
        if (j1.T.booleanValue())
        {
            j1.U.post(new com.ford.syncV4.e.ad(j1, ((bx) (obj))));
        }
        j1.a("UnregisterAppInterfaceResponse", ((Exception) (null)), r.s);
          goto _L40
        e1;
        obj1;
        JVM INSTR monitorexit ;
        throw e1;
        if (!e1.equals("GenericResponse"))
        {
            break MISSING_BLOCK_LABEL_3095;
        }
        obj = new com.ford.syncV4.e.c.t(((Hashtable) (obj)));
        if (!j1.T.booleanValue())
        {
            break MISSING_BLOCK_LABEL_3082;
        }
        j1.U.post(new com.ford.syncV4.e.ae(j1, ((com.ford.syncV4.e.c.t) (obj))));
          goto _L40
        j1.G.onGenericResponse(((com.ford.syncV4.e.c.t) (obj)));
          goto _L40
label16:
        {
            if (!e1.equals("Slider"))
            {
                break MISSING_BLOCK_LABEL_3157;
            }
            obj = new bk(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label16;
            }
            j1.U.post(new com.ford.syncV4.e.af(j1, ((bk) (obj))));
        }
          goto _L40
        j1.G.onSliderResponse(((bk) (obj)));
          goto _L40
label17:
        {
            if (!e1.equals("PutFile"))
            {
                break MISSING_BLOCK_LABEL_3219;
            }
            obj = new aw(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label17;
            }
            j1.U.post(new com.ford.syncV4.e.ah(j1, ((aw) (obj))));
        }
          goto _L40
        j1.G.onPutFileResponse(((aw) (obj)));
          goto _L40
label18:
        {
            if (!e1.equals("DeleteFile"))
            {
                break MISSING_BLOCK_LABEL_3281;
            }
            obj = new l(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label18;
            }
            j1.U.post(new com.ford.syncV4.e.ai(j1, ((l) (obj))));
        }
          goto _L40
        j1.G.onDeleteFileResponse(((l) (obj)));
          goto _L40
label19:
        {
            if (!e1.equals("ListFiles"))
            {
                break MISSING_BLOCK_LABEL_3343;
            }
            obj = new z(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label19;
            }
            j1.U.post(new com.ford.syncV4.e.aj(j1, ((z) (obj))));
        }
          goto _L40
        j1.G.onListFilesResponse(((z) (obj)));
          goto _L40
label20:
        {
            if (!e1.equals("SetAppIcon"))
            {
                break MISSING_BLOCK_LABEL_3405;
            }
            obj = new bd(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label20;
            }
            j1.U.post(new com.ford.syncV4.e.ak(j1, ((bd) (obj))));
        }
          goto _L40
        j1.G.onSetAppIconResponse(((bd) (obj)));
          goto _L40
label21:
        {
            if (!e1.equals("ScrollableMessage"))
            {
                break MISSING_BLOCK_LABEL_3467;
            }
            obj = new bb(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label21;
            }
            j1.U.post(new al(j1, ((bb) (obj))));
        }
          goto _L40
        j1.G.onScrollableMessageResponse(((bb) (obj)));
          goto _L40
label22:
        {
            if (!e1.equals("ChangeRegistration"))
            {
                break MISSING_BLOCK_LABEL_3529;
            }
            obj = new g(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label22;
            }
            j1.U.post(new com.ford.syncV4.e.am(j1, ((g) (obj))));
        }
          goto _L40
        j1.G.onChangeRegistrationResponse(((g) (obj)));
          goto _L40
label23:
        {
            if (!e1.equals("SetDisplayLayout"))
            {
                break MISSING_BLOCK_LABEL_3591;
            }
            obj = new bf(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label23;
            }
            j1.U.post(new com.ford.syncV4.e.an(j1, ((bf) (obj))));
        }
          goto _L40
        j1.G.onSetDisplayLayoutResponse(((bf) (obj)));
          goto _L40
label24:
        {
            if (!e1.equals("PerformAudioPassThru"))
            {
                break MISSING_BLOCK_LABEL_3653;
            }
            obj = new ar(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label24;
            }
            j1.U.post(new com.ford.syncV4.e.ao(j1, ((ar) (obj))));
        }
          goto _L40
        j1.G.onPerformAudioPassThruResponse(((ar) (obj)));
          goto _L40
label25:
        {
            if (!e1.equals("EndAudioPassThru"))
            {
                break MISSING_BLOCK_LABEL_3715;
            }
            obj = new com.ford.syncV4.e.c.r(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label25;
            }
            j1.U.post(new com.ford.syncV4.e.ap(j1, ((com.ford.syncV4.e.c.r) (obj))));
        }
          goto _L40
        j1.G.onEndAudioPassThruResponse(((com.ford.syncV4.e.c.r) (obj)));
          goto _L40
label26:
        {
            if (!e1.equals("SubscribeVehicleData"))
            {
                break MISSING_BLOCK_LABEL_3777;
            }
            obj = new br(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label26;
            }
            j1.U.post(new com.ford.syncV4.e.aq(j1, ((br) (obj))));
        }
          goto _L40
        j1.G.onSubscribeVehicleDataResponse(((br) (obj)));
          goto _L40
label27:
        {
            if (!e1.equals("UnsubscribeVehicleData"))
            {
                break MISSING_BLOCK_LABEL_3839;
            }
            obj = new bz(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label27;
            }
            j1.U.post(new as(j1, ((bz) (obj))));
        }
          goto _L40
        j1.G.onUnsubscribeVehicleDataResponse(((bz) (obj)));
          goto _L40
label28:
        {
            if (!e1.equals("GetVehicleData"))
            {
                break MISSING_BLOCK_LABEL_3901;
            }
            obj = new w(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label28;
            }
            j1.U.post(new com.ford.syncV4.e.at(j1, ((w) (obj))));
        }
          goto _L40
        j1.G.onGetVehicleDataResponse(((w) (obj)));
          goto _L40
label29:
        {
            if (!e1.equals("ReadDID"))
            {
                break MISSING_BLOCK_LABEL_3963;
            }
            obj = new ax(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label29;
            }
            j1.U.post(new com.ford.syncV4.e.au(j1, ((ax) (obj))));
        }
          goto _L40
        j1.G.onReadDIDResponse(((ax) (obj)));
          goto _L40
label30:
        {
            if (!e1.equals("GetDTCs"))
            {
                break MISSING_BLOCK_LABEL_4025;
            }
            obj = new u(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label30;
            }
            j1.U.post(new av(j1, ((u) (obj))));
        }
          goto _L40
        j1.G.onGetDTCsResponse(((u) (obj)));
          goto _L40
label31:
        {
            if (!e1.equals("DiagnosticMessage"))
            {
                break MISSING_BLOCK_LABEL_4087;
            }
            obj = new p(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label31;
            }
            j1.U.post(new com.ford.syncV4.e.aw(j1, ((p) (obj))));
        }
          goto _L40
        j1.G.onDiagnosticMessageResponse(((p) (obj)));
          goto _L40
label32:
        {
            if (!e1.equals("SystemRequest"))
            {
                break MISSING_BLOCK_LABEL_4149;
            }
            obj = new bu(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label32;
            }
            j1.U.post(new com.ford.syncV4.e.ax(j1, ((bu) (obj))));
        }
          goto _L40
        j1.G.onSystemRequestResponse(((bu) (obj)));
          goto _L40
label33:
        {
            if (j1.n == null)
            {
                break label33;
            }
            com.ford.syncV4.util.c.a((new StringBuilder("Unrecognized response Message: ")).append(e1.toString()).append("SYNC Message Version = ").append(j1.n).toString());
        }
          goto _L40
        com.ford.syncV4.util.c.a((new StringBuilder("Unrecognized response Message: ")).append(e1.toString()).toString());
          goto _L40
_L10:
        if (!s1.equals("notification")) goto _L40; else goto _L41
_L41:
        com.ford.syncV4.h.e.a(com.ford.syncV4.h.a.b.b, new com.ford.syncV4.e.d(((com.ford.syncV4.e.c) (obj1))), "42baba60-eb57-11df-98cf-0800200c9a66");
        if (!e1.equals("OnHMIStatus"))
        {
            break MISSING_BLOCK_LABEL_4409;
        }
        obj = new ah(((Hashtable) (obj)));
        if (j1.F != null)
        {
            j1.F.c().a(((ah) (obj)).c());
        }
        ((ah) (obj)).a(new Boolean(j1.B.booleanValue()));
        if (((ah) (obj)).c() == com.ford.syncV4.e.c.a.e.a)
        {
            j1.B = Boolean.valueOf(false);
        }
        if (((ah) (obj)).c() != j1.am && ((ah) (obj)).d() != j1.an)
        {
            if (!j1.T.booleanValue())
            {
                break MISSING_BLOCK_LABEL_4377;
            }
            j1.U.post(new com.ford.syncV4.e.ay(j1, ((ah) (obj))));
        }
          goto _L40
        j1.G.onOnHMIStatus(((ah) (obj)));
        j1.G.onOnLockScreenNotification(j1.F.c().a());
          goto _L40
label34:
        {
            if (!e1.equals("OnCommand"))
            {
                break MISSING_BLOCK_LABEL_4471;
            }
            obj = new af(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label34;
            }
            j1.U.post(new com.ford.syncV4.e.az(j1, ((af) (obj))));
        }
          goto _L40
        j1.G.onOnCommand(((af) (obj)));
          goto _L40
        if (!e1.equals("OnDriverDistraction"))
        {
            break MISSING_BLOCK_LABEL_4581;
        }
        obj = new ag(((Hashtable) (obj)));
        if (j1.F == null)
        {
            break MISSING_BLOCK_LABEL_4519;
        }
        ap ap1;
        Intent intent;
        if (((ag) (obj)).c() != com.ford.syncV4.e.c.a.c.a)
        {
            flag = false;
        }
        j1.F.c().a(flag);
        if (!j1.T.booleanValue())
        {
            break MISSING_BLOCK_LABEL_4549;
        }
        j1.U.post(new com.ford.syncV4.e.ba(j1, ((ag) (obj))));
          goto _L40
        j1.G.onOnDriverDistraction(((ag) (obj)));
        j1.G.onOnLockScreenNotification(j1.F.c().a());
          goto _L40
label35:
        {
            if (!e1.equals("OnEncodedSyncPData"))
            {
                break MISSING_BLOCK_LABEL_4754;
            }
            obj = new an(((Hashtable) (obj)));
            intent = j1.a();
            b(intent, "RPC_NAME", "OnSystemRequest");
            b(intent, "TYPE", "notification");
            if (((an) (obj)).i() != null)
            {
                break MISSING_BLOCK_LABEL_4690;
            }
            b(intent, "COMMENT1", "URL is a null value (received)");
            j1.a(intent);
            if (!j1.T.booleanValue())
            {
                break label35;
            }
            j1.U.post(new com.ford.syncV4.e.bb(j1, ((an) (obj))));
        }
          goto _L40
        j1.G.onOnSystemRequest(((an) (obj)));
          goto _L40
        b(intent, "COMMENT1", (new StringBuilder("Sending to cloud: ")).append(((an) (obj)).i()).toString());
        j1.a(intent);
        Log.i("pt", "send to url");
        if (((an) (obj)).i() != null)
        {
            (new com.ford.syncV4.e.bd(j1, ((an) (obj)))).start();
        }
          goto _L40
label36:
        {
            if (!e1.equals("OnPermissionsChange"))
            {
                break MISSING_BLOCK_LABEL_4816;
            }
            obj = new am(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label36;
            }
            j1.U.post(new be(j1, ((am) (obj))));
        }
          goto _L40
        j1.G.onOnPermissionsChange(((am) (obj)));
          goto _L40
label37:
        {
            if (!e1.equals("OnTBTClientState"))
            {
                break MISSING_BLOCK_LABEL_4878;
            }
            obj = new ao(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label37;
            }
            j1.U.post(new com.ford.syncV4.e.bf(j1, ((ao) (obj))));
        }
          goto _L40
        j1.G.onOnTBTClientState(((ao) (obj)));
          goto _L40
label38:
        {
            if (!e1.equals("OnButtonPress"))
            {
                break MISSING_BLOCK_LABEL_4940;
            }
            obj = new ae(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label38;
            }
            j1.U.post(new com.ford.syncV4.e.bg(j1, ((ae) (obj))));
        }
          goto _L40
        j1.G.onOnButtonPress(((ae) (obj)));
          goto _L40
label39:
        {
            if (!e1.equals("OnButtonEvent"))
            {
                break MISSING_BLOCK_LABEL_5002;
            }
            obj = new ad(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label39;
            }
            j1.U.post(new com.ford.syncV4.e.bh(j1, ((ad) (obj))));
        }
          goto _L40
        j1.G.onOnButtonEvent(((ad) (obj)));
          goto _L40
label40:
        {
            if (!e1.equals("OnLanguageChange"))
            {
                break MISSING_BLOCK_LABEL_5064;
            }
            obj = new ak(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label40;
            }
            j1.U.post(new bi(j1, ((ak) (obj))));
        }
          goto _L40
        j1.G.onOnLanguageChange(((ak) (obj)));
          goto _L40
label41:
        {
            if (!e1.equals("OnHashChange"))
            {
                break MISSING_BLOCK_LABEL_5141;
            }
            obj = new ai(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label41;
            }
            j1.U.post(new com.ford.syncV4.e.bj(j1, ((ai) (obj))));
        }
          goto _L40
        j1.G.onOnHashChange(((ai) (obj)));
        if (j1.aj)
        {
            j1.ag = ((ai) (obj)).c();
        }
          goto _L40
label42:
        {
            if (!e1.equals("OnSystemRequest"))
            {
                break MISSING_BLOCK_LABEL_5242;
            }
            obj = new an(((Hashtable) (obj)));
            if (((an) (obj)).i() != null && ((an) (obj)).f() == m.f && ((an) (obj)).j() == com.ford.syncV4.e.c.a.d.h)
            {
                (new com.ford.syncV4.e.bk(j1, ((an) (obj)))).start();
            }
            if (!j1.T.booleanValue())
            {
                break label42;
            }
            j1.U.post(new bl(j1, ((an) (obj))));
        }
          goto _L40
        j1.G.onOnSystemRequest(((an) (obj)));
          goto _L40
label43:
        {
            if (!e1.equals("OnAudioPassThru"))
            {
                break MISSING_BLOCK_LABEL_5304;
            }
            obj = new ac(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label43;
            }
            j1.U.post(new bm(j1, ((ac) (obj))));
        }
          goto _L40
        j1.G.onOnAudioPassThru(((ac) (obj)));
          goto _L40
label44:
        {
            if (!e1.equals("OnVehicleData"))
            {
                break MISSING_BLOCK_LABEL_5366;
            }
            obj = new aq(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label44;
            }
            j1.U.post(new com.ford.syncV4.e.bo(j1, ((aq) (obj))));
        }
          goto _L40
        j1.G.onOnVehicleData(((aq) (obj)));
          goto _L40
        if (!e1.equals("OnAppInterfaceUnregistered"))
        {
            break MISSING_BLOCK_LABEL_5521;
        }
        j1.d = Boolean.valueOf(false);
        synchronized (j1.O)
        {
            j1.O.notify();
        }
        obj = new ab(((Hashtable) (obj)));
        obj2 = j1.a();
        b(((Intent) (obj2)), "RPC_NAME", "OnAppInterfaceUnregistered");
        b(((Intent) (obj2)), "TYPE", "notification");
        b(((Intent) (obj2)), "DATA", j1.a(((com.ford.syncV4.e.c) (obj))));
        j1.a(((Intent) (obj2)));
        if (!j1.c.booleanValue())
        {
            break MISSING_BLOCK_LABEL_5480;
        }
        j1.a(com.ford.syncV4.e.c.a.r.a(((ab) (obj)).c()));
          goto _L40
        e1;
        obj2;
        JVM INSTR monitorexit ;
        throw e1;
        if (j1.T.booleanValue())
        {
            j1.U.post(new com.ford.syncV4.e.bp(j1, ((ab) (obj))));
        }
        j1.a("OnAppInterfaceUnregistered", ((Exception) (null)), r.s);
          goto _L40
label45:
        {
            if (!e1.equals("OnKeyboardInput"))
            {
                break MISSING_BLOCK_LABEL_5583;
            }
            obj = new aj(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label45;
            }
            j1.U.post(new bq(j1, ((aj) (obj))));
        }
          goto _L40
        j1.G.onOnKeyboardInput(((aj) (obj)));
          goto _L40
label46:
        {
            if (!e1.equals("OnTouchEvent"))
            {
                break MISSING_BLOCK_LABEL_5645;
            }
            ap1 = new ap(((Hashtable) (obj)));
            if (!j1.T.booleanValue())
            {
                break label46;
            }
            j1.U.post(new com.ford.syncV4.e.br(j1, ap1));
        }
          goto _L40
        j1.G.onOnTouchEvent(ap1);
          goto _L40
label47:
        {
            if (j1.n == null)
            {
                break label47;
            }
            com.ford.syncV4.util.c.c((new StringBuilder("Unrecognized notification Message: ")).append(e1.toString()).append(" connected to SYNC using message version: ").append(j1.n.a()).append(".").append(j1.n.b()).toString());
        }
          goto _L40
        com.ford.syncV4.util.c.c((new StringBuilder("Unrecognized notification Message: ")).append(e1.toString()).toString());
          goto _L40
_L2:
        return;
        if (true) goto _L43; else goto _L42
_L42:
    }

    static void b(j j1, String s1, Exception exception)
    {
        com.ford.syncV4.util.c.a(s1, exception);
        com.ford.syncV4.util.c.a("InternalMessageDispatcher failed.", exception);
        j1.a("Proxy callback dispatcher is down. Proxy instance is invalid.", exception, r.t);
        j1.G.onError("Proxy callback dispatcher is down. Proxy instance is invalid.", exception);
    }

    static com.ford.syncV4.g.d c(j j1)
    {
        return j1.F;
    }

    private void c()
    {
        Boolean boolean2;
        if (!c.booleanValue())
        {
            break MISSING_BLOCK_LABEL_187;
        }
        i = q.b;
        B = Boolean.valueOf(true);
        boolean2 = Boolean.valueOf(false);
        Object obj1 = K;
        obj1;
        JVM INSTR monitorenter ;
        Boolean boolean1 = boolean2;
        if (F == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        boolean1 = boolean2;
        if (!F.g())
        {
            break MISSING_BLOCK_LABEL_159;
        }
        boolean1 = boolean2;
        if (d.booleanValue())
        {
            boolean1 = Boolean.valueOf(true);
            bw bw1 = new bw();
            bw1.a(Integer.valueOf(65530));
            Intent intent = a();
            b(intent, "RPC_NAME", "UnregisterAppInterface");
            b(intent, "TYPE", "request");
            intent.putExtra("CORRID", bw1.c().intValue());
            b(intent, "DATA", a(bw1));
            a(intent);
            b(bw1);
        }
        obj1;
        JVM INSTR monitorexit ;
        if (boolean1.booleanValue())
        {
            synchronized (O)
            {
                try
                {
                    O.wait(3000L);
                }
                // Misplaced declaration of an exception variable
                catch (InterruptedException interruptedexception) { }
            }
        }
        synchronized (K)
        {
            if (F != null)
            {
                F.e();
            }
        }
        com.ford.syncV4.h.e.a("SyncProxy cleaned.", "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            com.ford.syncV4.h.e.a("SyncProxy cleaned.", "42baba60-eb57-11df-98cf-0800200c9a66");
        }
        throw obj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        InterruptedException interruptedexception;
        throw exception1;
    }

    static void c(j j1, com.ford.syncV4.d.e e1)
    {
        synchronized (K)
        {
            if (j1.F != null)
            {
                j1.F.b(e1);
            }
        }
        com.ford.syncV4.h.e.a((new StringBuilder("SyncProxy sending Protocol Message: ")).append(e1.toString()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
        j1;
        obj;
        JVM INSTR monitorexit ;
        throw j1;
    }

    static void c(j j1, String s1, Exception exception)
    {
        j1.a(s1, exception);
    }

    static void d(j j1)
    {
        if (j1.c.booleanValue())
        {
            try
            {
                ay ay1 = com.ford.syncV4.e.f.a(j1.ah, j1.V, j1.Y, j1.Z, j1.ai, j1.aa, j1.ab, j1.ac, j1.ad, j1.ae, Integer.valueOf(65529));
                if (j1.aj && j1.ag != null)
                {
                    ay1.c(j1.ag);
                }
                Intent intent = j1.a();
                b(intent, "RPC_NAME", "RegisterAppInterface");
                b(intent, "TYPE", "request");
                intent.putExtra("CORRID", ay1.c().intValue());
                b(intent, "DATA", j1.a(ay1));
                j1.a(intent);
                j1.b(ay1);
                return;
            }
            catch (Exception exception)
            {
                j1.a("Failed to register application interface with SYNC. Check parameter values given to SyncProxy constructor.", exception, r.r);
            }
            return;
        } else
        {
            j1.b(new com.ford.syncV4.e.a.a("OnProxyOpened"));
            return;
        }
    }

    static void d(j j1, String s1, Exception exception)
    {
        j1.a(s1, exception);
    }

    static com.ford.syncV4.e.b.b e(j j1)
    {
        return j1.G;
    }

    static boolean f(j j1)
    {
        return j1.aj;
    }

    protected final void a(int i1)
    {
        if (aq)
        {
            return;
        }
        Object obj = ap;
        obj;
        JVM INSTR monitorenter ;
        aq = true;
        c();
        b();
        a("Sync Proxy Cycled", ((Exception) (new a("Sync Proxy Cycled", com.ford.syncV4.a.b.k))), i1);
_L7:
        aq = false;
        return;
        Object obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        Intent intent = a();
        b(intent, "FUNCTION_NAME", "cycleProxy");
        b(intent, "COMMENT1", (new StringBuilder("Proxy cycled, exception cause: ")).append(((a) (obj1)).a()).toString());
        a(intent);
        com.ford.syncV4.e.bs.a[((a) (obj1)).a().ordinal()];
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
        a("Cycling the proxy failed.", ((Exception) (obj1)), r.t);
          goto _L7
_L2:
        a("Bluetooth is disabled. Bluetooth must be enabled to connect to SYNC. Reattempt a connection once Bluetooth is enabled.", ((Exception) (new a("Bluetooth is disabled. Bluetooth must be enabled to connect to SYNC. Reattempt a connection once Bluetooth is enabled.", com.ford.syncV4.a.b.b))), r.p);
          goto _L7
_L3:
        a("Cannot locate a Bluetooth adapater. A SYNC connection is impossible on this device until a Bluetooth adapter is added.", ((Exception) (new a("Cannot locate a Bluetooth adapater. A SYNC connection is impossible on this device until a Bluetooth adapter is added.", com.ford.syncV4.a.b.a))), r.q);
          goto _L7
        obj1;
        a("Cycling the proxy failed.", ((Exception) (obj1)), r.t);
          goto _L7
    }

    final void a(com.ford.syncV4.e.a.a a1)
    {
        if (!a1.a().equals("OnProxyError")) goto _L2; else goto _L1
_L1:
        com.ford.syncV4.e.a.b b1 = (com.ford.syncV4.e.a.b)a1;
        if (!T.booleanValue()) goto _L4; else goto _L3
_L3:
        U.post(new com.ford.syncV4.e.ar(this, b1));
_L5:
        com.ford.syncV4.h.e.a((new StringBuilder("Proxy fired callback: ")).append(a1.a()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
_L4:
        try
        {
            G.onError(b1.b(), b1.c());
        }
        // Misplaced declaration of an exception variable
        catch (com.ford.syncV4.e.a.a a1)
        {
            com.ford.syncV4.util.c.a("Error handing proxy event.", a1);
            com.ford.syncV4.e.a.c c1;
            if (T.booleanValue())
            {
                U.post(new com.ford.syncV4.e.bt(this, a1));
                return;
            } else
            {
                G.onError("Error handing proxy event.", a1);
                return;
            }
        }
          goto _L5
_L2:
label0:
        {
            if (!a1.a().equals("OnProxyOpened"))
            {
                break label0;
            }
            if (T.booleanValue())
            {
                U.post(new bc(this));
            }
        }
          goto _L5
label1:
        {
            if (!a1.a().equals("OnProxyClosed"))
            {
                break MISSING_BLOCK_LABEL_242;
            }
            c1 = (com.ford.syncV4.e.a.c)a1;
            if (!T.booleanValue())
            {
                break label1;
            }
            U.post(new bn(this, c1));
        }
          goto _L5
        G.onProxyClosed$41146304(c1.b(), c1.d(), c1.c());
          goto _L5
        com.ford.syncV4.h.e.a("Unknown RPC Message encountered. Check for an updated version of the SYNC Proxy.", "42baba60-eb57-11df-98cf-0800200c9a66");
        com.ford.syncV4.util.c.a("Unknown RPC Message encountered. Check for an updated version of the SYNC Proxy.");
          goto _L5
    }

    public final void a(com.ford.syncV4.e.e e1)
    {
        if (h.booleanValue())
        {
            throw new a("This object has been disposed, it is no long capable of executing methods.", com.ford.syncV4.a.b.l);
        }
        com.ford.syncV4.h.e.a((new StringBuilder("Application called sendRPCRequest method for RPCRequest: .")).append(e1.a()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        Object obj = K;
        obj;
        JVM INSTR monitorenter ;
        if (F == null || !F.g())
        {
            com.ford.syncV4.h.e.a("Application attempted to send and RPCRequest without a connected transport.", "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new a("There is no valid connection to SYNC. sendRPCRequest cannot be called until SYNC has been connected.", com.ford.syncV4.a.b.o);
        }
        break MISSING_BLOCK_LABEL_101;
        e1;
        obj;
        JVM INSTR monitorexit ;
        throw e1;
        obj;
        JVM INSTR monitorexit ;
        if (a(e1.c()))
        {
            com.ford.syncV4.h.e.a((new StringBuilder("Application attempted to use the reserved correlation ID, ")).append(e1.c()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new a((new StringBuilder("Invalid correlation ID. The correlation ID, ")).append(e1.c()).append(" , is a reserved correlation ID.").toString(), com.ford.syncV4.a.b.i);
        }
        if (!d.booleanValue() && !e1.a().equals("RegisterAppInterface"))
        {
            com.ford.syncV4.h.e.a("Application attempted to send an RPCRequest (non-registerAppInterface), before the interface was registerd.", "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new a("SYNC is currently unavailable. RPC Requests cannot be sent.", com.ford.syncV4.a.b.o);
        }
        if (c.booleanValue() && (e1.a().equals("RegisterAppInterface") || e1.a().equals("UnregisterAppInterface")))
        {
            com.ford.syncV4.h.e.a("Application attempted to send a RegisterAppInterface or UnregisterAppInterface while using ALM.", "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new a((new StringBuilder("The RPCRequest, ")).append(e1.a()).append(", is unallowed using the Advanced Lifecycle Management Model.").toString(), com.ford.syncV4.a.b.e);
        } else
        {
            b(e1);
            return;
        }
    }

    protected final void a(String s1, Exception exception, int i1)
    {
        com.ford.syncV4.h.e.a("NotifyProxyClose", "42baba60-eb57-11df-98cf-0800200c9a66");
        b(new com.ford.syncV4.e.a.c(s1, exception, i1));
    }

    public final void a(Vector vector, Integer integer, Integer integer1)
    {
        i i1 = new i();
        i1.a(vector);
        i1.b(integer);
        i1.a(integer1);
        a(((com.ford.syncV4.e.e) (i1)));
    }

    public final Boolean d()
    {
        if (F == null)
        {
            return Boolean.valueOf(false);
        } else
        {
            return Boolean.valueOf(F.g());
        }
    }

    public final void e()
    {
        if (h.booleanValue())
        {
            throw new a("This object has been disposed, it is no long capable of executing methods.", com.ford.syncV4.a.b.l);
        }
        h = Boolean.valueOf(true);
        com.ford.syncV4.h.e.a("Application called dispose() method.", "42baba60-eb57-11df-98cf-0800200c9a66");
        int i1 = r.l;
        c();
        synchronized (L)
        {
            if (Q != null)
            {
                Q.a();
                Q = null;
            }
        }
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
        P = null;
        com.ford.syncV4.h.e.a("SyncProxy disposed.", "42baba60-eb57-11df-98cf-0800200c9a66");
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
            com.ford.syncV4.h.e.a("SyncProxy disposed.", "42baba60-eb57-11df-98cf-0800200c9a66");
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
