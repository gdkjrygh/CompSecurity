// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.AlertDialog;
import android.os.Handler;
import android.os.Looper;
import com.github.nkzawa.b.a;
import com.github.nkzawa.socketio.client.b;
import com.github.nkzawa.socketio.client.d;
import java.net.URISyntaxException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hq, ci, bd, bc, 
//            gs, fk, fl, fi, 
//            fj, dp, ox, shelduck, 
//            hi, fg, fe, fc, 
//            fa, ey, ew, eu, 
//            es, eq, eo, fw, 
//            fu, ft, fs, fr, 
//            fq, fp, fh, en, 
//            fy, fm, fo

public final class em
{

    private static final em d = new em();
    public boolean a;
    public boolean b;
    hq c;
    private d e;
    private String f;
    private JSONObject g;
    private boolean h;
    private int i;
    private AlertDialog j;

    private em()
    {
        e = null;
        f = null;
        a = false;
        b = false;
        h = false;
        i = 0;
        c = new hq();
        j = null;
    }

    public static em a()
    {
        return d;
    }

    static hq a(em em1)
    {
        return em1.c;
    }

    static hq a(em em1, hq hq1)
    {
        em1.c = hq1;
        return hq1;
    }

    static String a(em em1, String s)
    {
        em1.f = s;
        return s;
    }

    static void a(em em1, JSONObject jsonobject)
    {
        if (jsonobject == null || em1.j == null) goto _L2; else goto _L1
_L1:
        Object obj1 = com.taplytics.ci.b().t;
        jsonobject = jsonobject.getString("project_id");
        Object obj = jsonobject;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        obj = jsonobject;
        if (((bd) (obj1)).c == null) goto _L4; else goto _L5
_L5:
        obj = ((bd) (obj1)).c.getString("_id");
        obj1 = jsonobject;
        jsonobject = ((JSONObject) (obj));
_L6:
        if (obj1 != null && jsonobject != null && ((String) (obj1)).equals(jsonobject))
        {
            em1.j.dismiss();
            em1.j = null;
        }
_L2:
        return;
        obj;
        jsonobject = null;
_L7:
        com.taplytics.gs.b("hideTestDeviceAlert get project_id", ((Exception) (obj)));
        obj = jsonobject;
_L4:
        jsonobject = null;
        obj1 = obj;
          goto _L6
        obj;
          goto _L7
    }

    static int b(em em1)
    {
        return em1.i;
    }

    static void b(em em1, JSONObject jsonobject)
    {
        Object obj = com.taplytics.ci.b();
        if (!((ci) (obj)).j || ((ci) (obj)).u == null || jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        android.app.AlertDialog.Builder builder;
        if (em1.j != null || !com.taplytics.ci.b().l || com.taplytics.ci.b().v == null || !com.taplytics.ci.b().l)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        builder = new android.app.AlertDialog.Builder(com.taplytics.ci.b().v);
        builder.setTitle("Connect Taplytics Test Device");
        obj = jsonobject.getString("user_name");
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        builder.setMessage((new StringBuilder("To User: ")).append(((String) (obj))).toString());
        builder.setCancelable(true);
        builder.setPositiveButton("Yes", new fk(em1, jsonobject));
        builder.setNegativeButton("No Thanks", new fl(em1));
        em1.j = builder.create();
        em1.j.show();
        return;
        JSONException jsonexception;
        jsonexception;
        com.taplytics.gs.b("Getting Test Device username", jsonexception);
        jsonexception = null;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject;
        com.taplytics.gs.b(em1.getClass().toString(), jsonobject);
    }

    static void c(em em1)
    {
        if (com.taplytics.gs.b())
        {
            com.taplytics.gs.a("Retrying Connecting SocketIO");
        }
        em1.b();
        em1.e = null;
        Executors.newSingleThreadScheduledExecutor().schedule(new fi(em1), 500L, TimeUnit.MILLISECONDS);
    }

    static void c(em em1, JSONObject jsonobject)
    {
        bd bd1 = com.taplytics.ci.b().t;
        if (bd1 != null && bd1.a != null && jsonobject != null)
        {
            if (com.taplytics.gs.b())
            {
                com.taplytics.gs.a("Send Connect Test Device Socket!");
            }
            try
            {
                jsonobject = new JSONObject(jsonobject.toString());
                jsonobject.put("session_id", bd1.a);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                com.taplytics.gs.b("sendConnectTestDeviceSocket creating JSON Object", jsonobject);
                jsonobject = null;
            }
            if (jsonobject != null)
            {
                em1.e.a("foundTestDevice", new Object[] {
                    jsonobject
                });
                if (com.taplytics.gs.b())
                {
                    com.taplytics.gs.a((new StringBuilder("Found test device: ")).append(jsonobject.toString()).toString());
                }
            }
        }
    }

    static int d(em em1)
    {
        em1.i = 0;
        return 0;
    }

    static JSONObject d(em em1, JSONObject jsonobject)
    {
        em1.g = jsonobject;
        return jsonobject;
    }

    static void e(em em1)
    {
        try
        {
            com.taplytics.ci.b().s.a(new fj(em1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (em em1)
        {
            return;
        }
    }

    static d f(em em1)
    {
        return em1.e;
    }

    static String g(em em1)
    {
        return em1.f;
    }

    static void h(em em1)
    {
        em1.j = null;
    }

    static JSONObject i(em em1)
    {
        return em1.g;
    }

    public final void a(fy fy1)
    {
        Object obj = com.taplytics.ci.b().b;
        Object obj1 = (new StringBuilder()).append(((dp) (obj)).e).append(((dp) (obj)).d).toString();
        boolean flag;
        if (((dp) (obj)).a != com.taplytics.ox.d)
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append(":443").toString();
        } else
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append(":3020").toString();
        }
        if (com.taplytics.gs.b())
        {
            com.taplytics.gs.a("connecting socket");
        }
        if (e != null && e.d) goto _L2; else goto _L1
_L1:
        flag = com.taplytics.hi.a(shelduck.o);
        if (flag) goto _L2; else goto _L3
_L3:
        try
        {
            b();
            obj1 = new com.github.nkzawa.socketio.client.b.a();
            obj1.q = true;
            obj1.s = true;
            obj1.u = 5000L;
            obj1.x = -1L;
            e = com.github.nkzawa.socketio.client.b.a(((String) (obj)), ((com.github.nkzawa.socketio.client.b.a) (obj1)));
        }
        catch (URISyntaxException urisyntaxexception)
        {
            try
            {
                com.taplytics.gs.b("Socket URI path error", urisyntaxexception);
            }
            // Misplaced declaration of an exception variable
            catch (fy fy1)
            {
                com.taplytics.gs.b("socketio problem", fy1);
                return;
            }
        }
_L6:
        b = false;
        e.a("connect", new fg(this, fy1)).a("connectTestDevice", new fe(this)).a("foundTestDevice", new fc(this)).a("clientShowExperiment", new fa(this)).a("clientHideExperiment", new ey(this)).a("clientPickElement", new ew(this)).a("highlightTapElement", new eu(this)).a("experimentUpdated", new es(this)).a("dataUpdated", new eq(this)).a("chooseView", new eo(this)).a("foundView", new fw(this)).a("pairTokenSuccessful", new fu(this)).a("pairTokenFailed", new ft(this)).a("disconnect", new fs(this, fy1)).a("error", new fr(this)).a("reconnect_attempt", new fq(this)).a("reconnect_failed", new fp(this)).a("connect_error", new fh(this)).a("subscribeFinished", new en(this));
        if (com.taplytics.gs.b())
        {
            com.taplytics.gs.a((new StringBuilder("Connect SocketIO with path: ")).append(((String) (obj))).toString());
        }
        com.github.nkzawa.f.a.a(new com.github.nkzawa.socketio.client.d._cls1(e));
_L5:
        return;
_L2:
        if (fy1 == null) goto _L5; else goto _L4
_L4:
        fy1.a(Boolean.valueOf(true));
        return;
          goto _L6
    }

    public final void a(String s)
    {
        if (!h) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (s != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (com.taplytics.gs.b())
        {
            com.taplytics.gs.a("Missing link to pair device");
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        bd bd1 = com.taplytics.ci.b().t;
        String s1;
        try
        {
            if (!a)
            {
                a(((fy) (new fm(this, s))));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        if (com.taplytics.ci.b().f == null || bd1 == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        if (bd1.c == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        s1 = bd1.a;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        try
        {
            if (g == null)
            {
                g = new JSONObject();
            }
            g.put("projectToken", com.taplytics.ci.b().f);
            s = s.substring(3);
            g.put("projectConnectToken", s.substring(0, s.indexOf("://")));
            g.put("deviceToken", s.substring(s.indexOf("://") + 3, s.length()));
            g.put("session_id", bd1.a);
            a("pairDeviceWithToken", g);
            h = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        com.taplytics.gs.b("Sending pairing device socket", s);
        return;
        (new Handler(Looper.getMainLooper())).postDelayed(new fo(this, s), 1000L);
        return;
    }

    public final void a(String s, Object obj)
    {
label0:
        {
            if (e != null)
            {
                if (com.taplytics.gs.b())
                {
                    com.taplytics.gs.a((new StringBuilder("Emit Socket Event: ")).append(s).append(", data: ").append(obj.toString()).toString());
                }
                if (obj == JSONObject.NULL)
                {
                    break label0;
                }
                e.a(s, new Object[] {
                    obj
                });
            }
            return;
        }
        e.a(s, new Object[0]);
    }

    public final void b()
    {
        if (e != null)
        {
            com.github.nkzawa.f.a.a(new com.github.nkzawa.socketio.client.d._cls4(e));
            a = false;
            b = false;
            e = null;
        }
    }

}
