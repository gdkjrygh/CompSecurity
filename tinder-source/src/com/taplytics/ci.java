// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.taplytics.a.c;
import com.taplytics.a.e;
import com.taplytics.a.i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            bn, be, hq, bc, 
//            gs, bd, hi, bl, 
//            d, z, t, cs, 
//            shelduck, j, bp, hk, 
//            em, cv, ca, gj, 
//            bb, co, cm, ee, 
//            bm, cl, eh, dp, 
//            ba

public final class ci
    implements bn
{

    private static final ci A = new ci();
    public static final be a = new be("1.6.13");
    private boolean B;
    private boolean C;
    private Date D;
    private Integer E;
    private boolean F;
    private bl G;
    private List H;
    public dp b;
    public ba c;
    public j d;
    public cs e;
    public String f;
    boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    boolean k;
    boolean l;
    boolean m;
    public boolean n;
    boolean o;
    public e p;
    boolean q;
    boolean r;
    hq s;
    bd t;
    public Context u;
    Activity v;
    String w;
    public d x;
    public ArrayList y;
    AlertDialog z;

    private ci()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = false;
        h = false;
        i = false;
        j = true;
        k = false;
        B = false;
        l = false;
        m = false;
        C = false;
        n = false;
        o = false;
        D = null;
        E = Integer.valueOf(10);
        F = false;
        p = null;
        q = false;
        r = true;
        s = new hq();
        t = null;
        u = null;
        v = null;
        w = null;
        G = null;
        H = new ArrayList();
        z = null;
    }

    static bd a(ci ci1)
    {
        return ci1.t;
    }

    private static Map a(JSONObject jsonobject, JSONArray jsonarray)
        throws JSONException
    {
        HashMap hashmap;
        int i1;
        hashmap = new HashMap();
        i1 = 0;
_L7:
        if (i1 >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        String s1;
        Object obj;
        obj = new bc(jsonarray.getJSONObject(i1));
        if (!((bc) (obj)).a("_id"))
        {
            break MISSING_BLOCK_LABEL_143;
        }
        s1 = ((bc) (obj)).optString("_id");
_L8:
        if (!((bc) (obj)).a("name")) goto _L4; else goto _L3
_L3:
        obj = ((bc) (obj)).optString("name");
_L6:
        if (s1 == null || obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            if (!s1.equals("") && !((String) (obj)).equals("") && jsonobject.has(s1))
            {
                hashmap.put(obj, jsonobject.get(s1));
            }
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            gs.b("Getting vars", jsonobject);
        }
          goto _L2
_L4:
        obj = "";
        if (true) goto _L6; else goto _L5
_L2:
        return hashmap;
_L5:
        i1++;
          goto _L7
        s1 = "";
          goto _L8
    }

    private boolean a(bd bd1)
    {
        if (bd1 == null) goto _L2; else goto _L1
_L1:
        bd1 = bd1.c;
        if (bd1 == null) goto _L2; else goto _L3
_L3:
        Object obj;
        int j1;
        bd1 = bd1.optJSONObject("settings").optJSONArray("killForBuilds");
        j1 = hi.b();
        obj = hi.a();
        if (bd1 == null) goto _L2; else goto _L4
_L4:
        int i1 = 0;
_L8:
        String s1;
        String s2;
        if (i1 >= bd1.length())
        {
            break MISSING_BLOCK_LABEL_358;
        }
        s1 = ((JSONObject)bd1.get(i1)).optString("appBuild");
        s2 = ((JSONObject)bd1.get(i1)).optString("appVersion");
        if (!String.valueOf(j1).equals(s1) && !((String) (obj)).equals(s2)) goto _L6; else goto _L5
_L5:
        j = false;
        if (gs.b())
        {
            gs.a("TAPLYTICS IS NOW DISABLED");
        }
        if (G != null)
        {
            bd1 = G;
            ((bl) (bd1)).a.unregisterListener(bd1);
        }
        if (x != null)
        {
            com.taplytics.d.a(x);
        }
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_259;
        }
        bd1 = com.taplytics.z.a();
        obj = ((z) (bd1)).i;
        if (obj != null)
        {
            try
            {
                ((AlarmManager)A.u.getSystemService("alarm")).cancel(((z) (bd1)).i);
            }
            catch (Exception exception) { }
        }
        if (((z) (bd1)).a != null)
        {
            bd1 = ((z) (bd1)).a;
            if (((t) (bd1)).f != null)
            {
                A.u.getSharedPreferences((new StringBuilder("com.amplitude.api.")).append(A.u.getPackageName()).toString(), 0).unregisterOnSharedPreferenceChangeListener(((t) (bd1)).f);
            }
        }
        if (e != null && e.a.booleanValue())
        {
            bd1 = e;
            bd1.e = null;
            if (((cs) (bd1)).b != null)
            {
                ((cs) (bd1)).b.clear();
            }
            bd1.c = null;
        }
_L7:
        return !j;
        bd1;
        gs.b("error unregistering things for killswitch", bd1);
          goto _L7
_L2:
        return !j;
_L6:
        i1++;
          goto _L8
        try
        {
            j = true;
        }
        // Misplaced declaration of an exception variable
        catch (bd bd1)
        {
            gs.b("error checking kill builds", bd1);
        }
          goto _L2
    }

    static boolean a(be be1)
    {
        return b(be1);
    }

    static boolean a(ci ci1, bd bd1)
    {
        return ci1.a(bd1);
    }

    static boolean a(ci ci1, String s1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (ci1.u != null)
        {
            PackageManager packagemanager = ci1.u.getPackageManager();
            ci1 = s1;
            if (s1 != null)
            {
                ci1 = (new StringBuilder("tl-")).append(s1).append("://").toString();
            }
            flag = flag1;
            if (packagemanager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(ci1)), 0x10020).size() > 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    static boolean a(ci ci1, boolean flag)
    {
        ci1.m = flag;
        return flag;
    }

    static bd b(ci ci1, bd bd1)
    {
        ci1.t = bd1;
        return bd1;
    }

    public static ci b()
    {
        return A;
    }

    static void b(ci ci1)
    {
        boolean flag = false;
        if (ci1.H.size() <= 0) goto _L2; else goto _L1
        Object obj1;
        Object obj2;
        obj1 = "baseline";
        break MISSING_BLOCK_LABEL_173;
_L27:
        Object obj6;
        if (obj6 == null) goto _L4; else goto _L3
_L3:
        if (ci1.t.j == null) goto _L4; else goto _L5
_L5:
        obj2 = ((bc) (obj6)).optString("_id");
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        if (!((bc) (obj6)).has("customVariableNames")) goto _L7; else goto _L6
_L6:
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        obj3 = ((bc) (obj6)).optJSONArray("customVariableNames");
_L26:
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        obj7 = ((bc) (obj6)).b("baseline");
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        if (!((bc) (obj7)).a("customVariables"))
        {
            break MISSING_BLOCK_LABEL_358;
        }
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        a(((bc) (obj7)).optJSONObject("customVariables"), ((JSONArray) (obj3)));
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        obj7 = ((bc) (obj6)).optJSONArray("variations");
        if (obj7 == null) goto _L9; else goto _L8
_L8:
        i1 = 0;
_L19:
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        if (i1 >= ((JSONArray) (obj7)).length()) goto _L9; else goto _L10
_L10:
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        obj6 = new bc(((JSONArray) (obj7)).optJSONObject(i1));
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        if (!((bc) (obj6)).a("_id")) goto _L12; else goto _L11
_L11:
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        if (!ci1.t.j.toString().contains((new StringBuilder("\"")).append(((bc) (obj6)).optString("_id")).append("\"").toString())) goto _L12; else goto _L13
_L13:
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        obj1 = ((bc) (obj6)).getString("_id");
_L20:
        if (obj6 == null) goto _L15; else goto _L14
_L14:
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        if (!((bc) (obj6)).a("customVariables")) goto _L17; else goto _L16
_L16:
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        obj7 = ((bc) (obj6)).b("customVariables");
_L21:
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        obj6 = ((bc) (obj6)).optString("name");
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        if (((String) (obj6)).equals("")) goto _L15; else goto _L18
_L18:
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        if (!gs.b())
        {
            break MISSING_BLOCK_LABEL_692;
        }
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        gs.a((new StringBuilder("Show var: ")).append(((String) (obj6))).append(", for exp: ").append(s3).toString());
        s1 = ((String) (obj1));
        obj4 = obj2;
        s2 = ((String) (obj1));
        obj5 = obj2;
        a(((JSONObject) (obj7)), ((JSONArray) (obj3)));
        flag2 = true;
        flag3 = true;
        flag1 = true;
        i1 = ((flag1) ? 1 : 0);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_802;
        }
        i1 = ((flag1) ? 1 : 0);
        obj5 = obj1;
        obj3 = obj2;
        j1 = ((flag3) ? 1 : 0);
        if (((String) (obj2)).equals(""))
        {
            break MISSING_BLOCK_LABEL_802;
        }
        i1 = ((flag1) ? 1 : 0);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_802;
        }
        i1 = ((flag1) ? 1 : 0);
        obj5 = obj1;
        obj3 = obj2;
        j1 = ((flag3) ? 1 : 0);
        if (((String) (obj1)).equals(""))
        {
            break MISSING_BLOCK_LABEL_802;
        }
        obj5 = obj1;
        obj3 = obj2;
        j1 = ((flag3) ? 1 : 0);
        ci1.d.a(((String) (obj2)), ((String) (obj1)));
        i1 = ((flag1) ? 1 : 0);
_L25:
        if (i1 == 0)
        {
            if (gs.b())
            {
                gs.a((new StringBuilder("Show base var for exp: ")).append(s3).toString());
            }
            if (obj2 != null && obj1 != null)
            {
                ci1.d.a(((String) (obj2)), ((String) (obj1)));
            }
        }
          goto _L1
_L12:
        i1++;
          goto _L19
_L9:
        obj6 = null;
          goto _L20
_L4:
        if (obj6 == null)
        {
            break MISSING_BLOCK_LABEL_912;
        }
        if (gs.b())
        {
            gs.a((new StringBuilder("No exp found by name ")).append(s3).append(", disp baseline instead.").toString());
        }
        obj3 = null;
        obj6 = null;
        obj2 = null;
          goto _L20
_L17:
        obj7 = null;
          goto _L21
        obj4;
        obj2 = null;
        i1 = 0;
_L24:
        obj5 = obj1;
        obj3 = obj2;
        j1 = i1;
        gs.b("Get code exp", ((Exception) (obj4)));
        if (i1 == 0)
        {
            if (gs.b())
            {
                gs.a((new StringBuilder("Show base var for exp: ")).append(s3).toString());
            }
            if (obj2 != null && obj1 != null)
            {
                ci1.d.a(((String) (obj2)), ((String) (obj1)));
            }
        }
          goto _L1
        obj2;
        obj3 = null;
        i1 = ((flag) ? 1 : 0);
        obj5 = obj1;
        obj1 = obj2;
_L23:
        if (i1 == 0)
        {
            if (gs.b())
            {
                gs.a((new StringBuilder("Show base var for exp: ")).append(s3).toString());
            }
            if (obj3 != null && obj5 != null)
            {
                ci1.d.a(((String) (obj3)), ((String) (obj5)));
            }
        }
        throw obj1;
_L1:
        Object obj7;
        String s3;
        boolean flag1;
        boolean flag3;
        for (Iterator iterator = ci1.H.iterator(); iterator.hasNext();)
        {
            Object obj = (Map)iterator.next();
            s3 = (String)((Map) (obj)).get("experiment");
            obj = (c)((Map) (obj)).get("listener");
            if (!hi.a(shelduck.u) && ci1.j)
            {
                if (s3 == null)
                {
                    com.taplytics.gs.c("Code experiment name null! running baseline variation!");
                } else
                if (obj == null)
                {
                    com.taplytics.gs.c("No TaplyticsCodeExperimentListener to run code experiment!");
                } else
                {
label0:
                    {
                        if (ci1.t != null)
                        {
                            break label0;
                        }
                        HashMap hashmap = new HashMap();
                        hashmap.put("experiment", s3);
                        hashmap.put("listener", obj);
                        ci1.H.add(hashmap);
                    }
                }
            }
        }

        ci1.H.clear();
_L2:
        return;
        obj1;
        obj5 = s1;
        obj3 = obj4;
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
        obj1;
        i1 = j1;
        if (true) goto _L23; else goto _L22
_L22:
        obj4;
        i1 = 0;
        obj1 = s2;
        obj2 = obj5;
          goto _L24
        obj4;
        i1 = ((flag2) ? 1 : 0);
          goto _L24
_L15:
        i1 = 0;
          goto _L25
_L7:
        obj3 = null;
          goto _L26
        Object obj3;
        Object obj4;
        Object obj5;
        String s1;
        String s2;
        int i1;
        int j1;
        boolean flag2;
        if (ci1.t != null && ci1.t.e != null)
        {
            if (ci1.t.e.a(s3))
            {
                obj2 = ci1.t.e.b(s3);
                break MISSING_BLOCK_LABEL_1142;
            }
            obj2 = null;
            break MISSING_BLOCK_LABEL_1142;
        }
        obj6 = null;
          goto _L27
        obj6 = obj2;
          goto _L27
    }

    private static boolean b(be be1)
    {
        int i1;
        try
        {
            i1 = a.a(be1);
        }
        // Misplaced declaration of an exception variable
        catch (be be1)
        {
            return false;
        }
        switch (i1)
        {
        default:
            return false;

        case -1: 
            return true;
        }
    }

    static j c(ci ci1)
    {
        return ci1.d;
    }

    static boolean d(ci ci1)
    {
        return ci1.m;
    }

    static boolean e(ci ci1)
    {
        ci1.n = true;
        return true;
    }

    static void f(ci ci1)
    {
        if (ci1.y != null)
        {
            for (Iterator iterator = ci1.y.iterator(); iterator.hasNext(); ci1.a((i)iterator.next())) { }
            ci1.y = null;
        }
    }

    static e g(ci ci1)
    {
        return ci1.p;
    }

    static e h(ci ci1)
    {
        ci1.p = null;
        return null;
    }

    static boolean i(ci ci1)
    {
        return ci1.g;
    }

    static boolean j(ci ci1)
    {
        return ci1.q;
    }

    static Context k(ci ci1)
    {
        return ci1.u;
    }

    static boolean l(ci ci1)
    {
        return ci1.F;
    }

    static cs m(ci ci1)
    {
        return ci1.e;
    }

    static hq n(ci ci1)
    {
        return ci1.s;
    }

    static void o(ci ci1)
    {
        ci1.z = null;
    }

    public final void a()
    {
        if (gs.b())
        {
            gs.a("Shake Menu triggered");
        }
        bp bp1;
        if (G == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        bp1 = bp.a();
        Exception exception;
        boolean flag;
        if (!hk.b(bp1.a) && !hk.b(bp1.b) && !hk.b(bp1.c))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (!hi.a(shelduck.y) && g && l)
        {
            bp.a().b();
        }
        if (j && g && !em.a().a)
        {
            cv.a().e();
        }
        return;
        exception;
        gs.b("onshake", exception);
        return;
    }

    public final void a(Activity activity)
    {
        Object obj;
        try
        {
            if (!j)
            {
                v = null;
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.b("Error setting activity.", activity);
            return;
        }
        if (activity == v)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        obj = ca.a().c.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (((String)((Pair)entry.getValue()).first).equals(v.getClass().getSimpleName()))
            {
                gj.a(((Integer)entry.getKey()).intValue(), false);
            }
        } while (true);
        v = activity;
        l = true;
        w = v.getClass().getSimpleName();
        e();
        ca.a().c.clear();
        ca.a().b.clear();
        if (gs.b())
        {
            gs.a("Setting current activity");
        }
        obj = activity.getIntent().getExtras();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        j j1;
        if (!((Bundle) (obj)).getBoolean("tl_notif", false) || ((Bundle) (obj)).getString("tl_id") == null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        j1 = d;
        if (!A.j || hi.a(shelduck.b) || hi.a(shelduck.s))
        {
            break MISSING_BLOCK_LABEL_339;
        }
        if (gs.b())
        {
            gs.a("Push notification opened");
        }
        if (((Bundle) (obj)).getString("tl_id") == null || !A.j)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        if (((Bundle) (obj)).get("custom_keys") == null)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        activity = new JSONObject((String)((Bundle) (obj)).get("custom_keys"));
_L1:
        activity = j1.b("pushOpened", null, activity);
        if (activity != null)
        {
            try
            {
                activity.put("gn", ((Bundle) (obj)).getString("tl_id"));
                j1.a(activity);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                return;
            }
        }
        break MISSING_BLOCK_LABEL_339;
        activity = null;
          goto _L1
    }

    public final void a(i i1)
    {
        bb bb1 = null;
        if (t == null || t.h == null) goto _L2; else goto _L1
_L1:
        HashMap hashmap;
        JSONArray jsonarray;
        jsonarray = t.h;
        hashmap = new HashMap();
        if (t.i != null)
        {
            bb1 = new bb(t.i);
        }
          goto _L3
_L23:
        int j1;
        if (j1 >= jsonarray.length()) goto _L5; else goto _L4
_L4:
        Object obj = jsonarray.optJSONObject(j1);
        if (obj == null) goto _L7; else goto _L6
_L6:
        String s1;
        String s2;
        s1 = ((JSONObject) (obj)).optString("_id");
        s2 = ((JSONObject) (obj)).optString("status");
        if (bb1 == null || s1 == null) goto _L7; else goto _L8
_L8:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        if (!bb1.toString().contains(s1))
        {
            break MISSING_BLOCK_LABEL_414;
        }
        boolean flag = true;
_L24:
        if (!Boolean.valueOf(flag).booleanValue() || s2 == null) goto _L7; else goto _L9
_L9:
        if (!s2.equals("active")) goto _L7; else goto _L10
_L10:
        if (!((JSONObject) (obj)).has("name")) goto _L12; else goto _L11
_L11:
        s1 = ((JSONObject) (obj)).optString("name");
_L21:
        s2 = "baseline";
        JSONArray jsonarray1 = ((JSONObject) (obj)).optJSONArray("variations");
        obj = s2;
        if (jsonarray1 == null) goto _L14; else goto _L13
_L13:
        obj = s2;
        if (t.j == null) goto _L14; else goto _L15
_L15:
        int k1 = 0;
_L22:
        obj = s2;
        if (k1 >= jsonarray1.length()) goto _L14; else goto _L16
_L16:
        obj = new bc(jsonarray1.optJSONObject(k1));
        if (!((bc) (obj)).a("_id") || !t.j.toString().contains((new StringBuilder("\"")).append(((bc) (obj)).optString("_id")).append("\"").toString())) goto _L18; else goto _L17
_L17:
        if (!((bc) (obj)).has("name")) goto _L20; else goto _L19
_L19:
        obj = ((bc) (obj)).optString("name");
_L14:
        hashmap.put(s1, obj);
          goto _L7
_L12:
        s1 = ((JSONObject) (obj)).optString("_id");
          goto _L21
_L20:
        obj = ((bc) (obj)).optString("_id");
          goto _L14
_L18:
        k1++;
          goto _L22
_L5:
        i1.a(hashmap);
        return;
        Object obj1;
        obj1;
        gs.b("Getting running experiments and variations", ((Exception) (obj1)));
        i1.a(hashmap);
        return;
        obj1;
        i1.a(hashmap);
        throw obj1;
_L2:
        i1.a(null);
        return;
_L3:
        j1 = 0;
          goto _L23
_L7:
        j1++;
          goto _L23
        flag = false;
          goto _L24
    }

    public final void a(String s1, String s2, String s3, String s4)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("exp", s1);
        hashmap.put("var", s2);
        if (!cv.a().a || cv.a().f == null || cv.a().f.equals(s3)) goto _L2; else goto _L1
_L1:
        s1 = t.l;
        int i1 = 0;
_L6:
        if (i1 >= s1.length()) goto _L2; else goto _L3
_L3:
        s2 = (JSONObject)s1.get(i1);
        int j1 = s2.optJSONObject("initProperties").optInt("anID");
        if (!cv.a().c.containsKey(Integer.valueOf(j1)) || !((JSONObject)cv.a().c.get(Integer.valueOf(j1))).has("anProperties"))
        {
            s2.put("reset", true);
            cv.a().c.put(Integer.valueOf(j1), s2);
        }
          goto _L4
_L2:
        try
        {
            s1 = new hq();
            s1.a(new co(this, s3, s4));
            A.a(((Map) (hashmap)), ((hq) (s1)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            gs.b("error switching variations", s1);
        }
        return;
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(Map map, hq hq1)
    {
        if (j)
        {
            Object obj;
            if (s.c())
            {
                if (hq1 == null)
                {
                    obj = new hq();
                } else
                {
                    obj = hq1;
                }
            } else
            {
                obj = s;
            }
            s = ((hq) (obj));
            obj = b;
            hq1 = new cm(this, hq1);
            if (A.j)
            {
                (new ee(((dp) (obj)))).execute(new Object[] {
                    map, hq1
                });
                return;
            }
        }
    }

    public final void a(boolean flag)
    {
        l = flag;
        if (flag)
        {
            e();
        }
        if (o)
        {
            o = false;
        }
    }

    public final void b(Activity activity)
    {
        if (j && !q) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (gs.b())
        {
            gs.a("Checking for app link");
        }
        if (activity == null) goto _L1; else goto _L3
_L3:
        try
        {
            activity = activity.getIntent();
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.b("Error finding app link", activity);
            return;
        }
        if (activity == null) goto _L1; else goto _L4
_L4:
        if (activity.getAction() == null) goto _L1; else goto _L5
_L5:
        if (gs.b())
        {
            gs.a((new StringBuilder("Intent data string:")).append(activity.getDataString()).toString());
        }
        if (activity.getAction().equals("android.intent.action.VIEW") && activity.getDataString() != null && activity.getDataString().startsWith("tl-"))
        {
            if (gs.b())
            {
                gs.a("Found App Link!");
            }
            em.a().a(activity.getDataString());
            return;
        }
          goto _L1
    }

    public final void b(boolean flag)
    {
        JSONObject jsonobject;
        boolean flag1;
        boolean flag4;
        flag1 = true;
        JSONObject jsonobject1;
        boolean flag2;
        if ((u.getApplicationInfo().flags & 2) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (t == null || t.c == null) goto _L2; else goto _L1
_L1:
        jsonobject1 = t.c.optJSONObject("settings");
        if (jsonobject1 == null) goto _L2; else goto _L3
_L3:
        jsonobject = jsonobject1.optJSONObject("enabledForReleaseModes");
        flag4 = jsonobject1.optBoolean("setFromUserDevice", false);
_L5:
        boolean flag3 = flag2;
        if (jsonobject != null)
        {
            if (flag2)
            {
                flag3 = jsonobject.optBoolean("dev", true);
            } else
            {
                flag3 = jsonobject.optBoolean("appStore", false);
            }
        }
        if (!B)
        {
            if (flag4)
            {
                if (g == flag3)
                {
                    flag1 = false;
                }
                g = flag3;
                if (flag1 && !flag)
                {
                    a(((Map) (null)), ((hq) (null)));
                }
            } else
            {
                g = flag3;
            }
        }
        if (!g)
        {
            em.a().b();
        }
        c();
        return;
_L2:
        flag4 = false;
        jsonobject = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void c()
    {
        if (((u.getApplicationInfo().flags & 2) != 0 || g) && !hi.a(shelduck.y) && G == null)
        {
            G = new bl();
            G.c = this;
            bl bl1 = G;
            bl1.a = (SensorManager)u.getSystemService("sensor");
            bl1.b = bl1.a.getDefaultSensor(1);
            bl1.a.registerListener(bl1, bl1.b, 3);
            Executors.newSingleThreadScheduledExecutor().schedule(new bm(bl1), 200L, TimeUnit.MILLISECONDS);
        }
    }

    public final void d()
    {
        if (!C)
        {
            C = true;
            a(((Map) (null)), ((hq) (null)));
            d.a("appActive", null, null);
            if (g)
            {
                dp dp = b;
                cl cl1 = new cl(this);
                if (A.j)
                {
                    (new eh(dp)).execute(new Object[] {
                        cl1
                    });
                    return;
                }
            }
        }
    }

    public final void e()
    {
        if (D != null && o && (new Date()).getTime() - D.getTime() > (long)(E.intValue() * 60 * 1000))
        {
            C = false;
            t.a = null;
            a(((Map) (null)), ((hq) (null)));
        }
        D = new Date();
    }

    public final void f()
    {
        H.clear();
    }

}
