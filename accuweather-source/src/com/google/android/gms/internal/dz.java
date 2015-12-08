// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ep, ev, dv, dt, 
//            ew, dy, am, ed, 
//            aj, em, ax

public final class dz
{

    private static final SimpleDateFormat qx = new SimpleDateFormat("yyyyMMdd");

    public static dv a(Context context, dt dt1, String s)
    {
        String s1;
        Object obj;
        String s2;
        String s3;
        JSONObject jsonobject;
        int i;
        int j;
        long l;
        long l1;
        Object obj1;
        try
        {
            jsonobject = new JSONObject(s);
            s = jsonobject.optString("ad_base_url", null);
            obj = jsonobject.optString("ad_url", null);
            s2 = jsonobject.optString("ad_size", null);
            s1 = jsonobject.optString("ad_html", null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ev.D((new StringBuilder()).append("Could not parse the mediation config: ").append(context.getMessage()).toString());
            return new dv(0);
        }
        l1 = -1L;
        s3 = jsonobject.optString("debug_dialog", null);
        if (!jsonobject.has("interstitial_timeout")) goto _L2; else goto _L1
_L1:
        l = (long)(jsonobject.getDouble("interstitial_timeout") * 1000D);
_L41:
        obj1 = jsonobject.optString("orientation", null);
        i = -1;
        if (!"portrait".equals(obj1)) goto _L4; else goto _L3
_L3:
        i = ep.bN();
_L7:
        if (TextUtils.isEmpty(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s))
        {
            ev.D("Could not parse the mediation config: Missing required ad_base_url field");
            return new dv(0);
        }
          goto _L5
_L4:
        if ("landscape".equals(obj1))
        {
            i = ep.bM();
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L9; else goto _L8
_L8:
        obj = dy.a(context, dt1.kO.st, ((String) (obj)), null, null);
        s = ((dv) (obj)).oy;
        s1 = ((dv) (obj)).qb;
        l1 = ((dv) (obj)).qh;
_L40:
        obj1 = jsonobject.optJSONArray("click_urls");
        if (obj != null) goto _L11; else goto _L10
_L10:
        context = null;
_L19:
        if (obj1 == null) goto _L13; else goto _L12
_L12:
        dt1 = context;
        if (context != null) goto _L15; else goto _L14
_L14:
        dt1 = new LinkedList();
          goto _L15
_L18:
        if (j >= ((JSONArray) (obj1)).length()) goto _L17; else goto _L16
_L16:
        dt1.add(((JSONArray) (obj1)).getString(j));
        j++;
          goto _L18
_L9:
        ev.D("Could not parse the mediation config: Missing required ad_html or ad_url field.");
        context = new dv(0);
        return context;
_L11:
        context = ((dv) (obj)).nr;
          goto _L19
_L39:
        Object obj3 = jsonobject.optJSONArray("impression_urls");
        if (obj != null) goto _L21; else goto _L20
_L20:
        context = null;
_L29:
        if (obj3 == null) goto _L23; else goto _L22
_L22:
        dt1 = context;
        if (context != null) goto _L25; else goto _L24
_L24:
        dt1 = new LinkedList();
          goto _L25
_L28:
        if (j >= ((JSONArray) (obj3)).length()) goto _L27; else goto _L26
_L26:
        dt1.add(((JSONArray) (obj3)).getString(j));
        j++;
          goto _L28
_L21:
        context = ((dv) (obj)).ns;
          goto _L29
_L38:
        JSONArray jsonarray = jsonobject.optJSONArray("manual_impression_urls");
        if (obj != null) goto _L31; else goto _L30
_L30:
        context = null;
_L37:
        if (jsonarray == null) goto _L33; else goto _L32
_L32:
        dt1 = context;
        if (context != null) goto _L35; else goto _L34
_L34:
        dt1 = new LinkedList();
          goto _L35
_L36:
        if (j >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_687;
        }
        dt1.add(jsonarray.getString(j));
        j++;
          goto _L36
_L31:
        context = ((dv) (obj)).qf;
          goto _L37
_L33:
        long l2;
        l2 = l;
        j = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_554;
        }
        if (((dv) (obj)).orientation != -1)
        {
            i = ((dv) (obj)).orientation;
        }
        l2 = l;
        j = i;
        if (((dv) (obj)).qc <= 0L)
        {
            break MISSING_BLOCK_LABEL_554;
        }
        l2 = ((dv) (obj)).qc;
        j = i;
        obj = jsonobject.optString("active_view");
        dt1 = null;
        boolean flag = jsonobject.optBoolean("ad_is_javascript", false);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_589;
        }
        dt1 = jsonobject.optString("ad_passback_url", null);
        Object obj2;
        context = new dv(s, s1, ((List) (obj2)), ((List) (obj3)), l2, false, -1L, context, -1L, j, s2, l1, s3, flag, dt1, ((String) (obj)));
        return context;
_L23:
        obj3 = context;
          goto _L38
_L13:
        obj2 = context;
          goto _L39
_L5:
        obj = null;
          goto _L40
_L2:
        l = -1L;
          goto _L41
_L15:
        j = 0;
          goto _L18
_L17:
        obj2 = dt1;
          goto _L39
_L25:
        j = 0;
          goto _L28
_L27:
        obj3 = dt1;
          goto _L38
_L35:
        j = 0;
          goto _L36
        context = dt1;
          goto _L33
    }

    public static String a(dt dt1, ed ed1, Location location, String s)
    {
        location = new HashMap();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        if (s.trim() != "")
        {
            location.put("eid", s);
        }
        if (dt1.pU != null)
        {
            location.put("ad_pos", dt1.pU);
        }
        a(((HashMap) (location)), dt1.pV);
        location.put("format", dt1.kR.mc);
        if (dt1.kR.width == -1)
        {
            location.put("smart_w", "full");
        }
        if (dt1.kR.height == -2)
        {
            location.put("smart_h", "auto");
        }
        if (dt1.kR.me == null) goto _L2; else goto _L1
_L1:
        am aam[];
        int k;
        s = new StringBuilder();
        aam = dt1.kR.me;
        k = aam.length;
        int i = 0;
_L8:
        am am1;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        am1 = aam[i];
        if (s.length() != 0)
        {
            s.append("|");
        }
        if (am1.width != -1) goto _L4; else goto _L3
_L3:
        int j = (int)((float)am1.widthPixels / ed1.ro);
_L5:
        s.append(j);
        s.append("x");
        if (am1.height != -2)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        j = (int)((float)am1.heightPixels / ed1.ro);
_L6:
        s.append(j);
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        j = am1.width;
          goto _L5
        j = am1.height;
          goto _L6
        location.put("sz", s);
_L2:
        location.put("slotname", dt1.kL);
        location.put("pn", dt1.applicationInfo.packageName);
        if (dt1.pW != null)
        {
            location.put("vc", Integer.valueOf(dt1.pW.versionCode));
        }
        location.put("ms", dt1.pX);
        location.put("seq_num", dt1.pY);
        location.put("session_id", dt1.pZ);
        location.put("js", dt1.kO.st);
        a(((HashMap) (location)), ed1);
        if (dt1.pV.versionCode >= 2 && dt1.pV.lY != null)
        {
            a(((HashMap) (location)), dt1.pV.lY);
        }
        if (dt1.versionCode >= 2)
        {
            location.put("quality_signals", dt1.qa);
        }
        if (ev.p(2))
        {
            dt1 = ep.o(location).toString(2);
            ev.C((new StringBuilder()).append("Ad Request JSON: ").append(dt1).toString());
        }
        dt1 = ep.o(location).toString();
        return dt1;
        dt1;
        ev.D((new StringBuilder()).append("Problem serializing ad request to JSON: ").append(dt1.getMessage()).toString());
        return null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void a(HashMap hashmap, Location location)
    {
        HashMap hashmap1 = new HashMap();
        float f = location.getAccuracy();
        long l = location.getTime();
        long l1 = (long)(location.getLatitude() * 10000000D);
        long l2 = (long)(location.getLongitude() * 10000000D);
        hashmap1.put("radius", Float.valueOf(f * 1000F));
        hashmap1.put("lat", Long.valueOf(l1));
        hashmap1.put("long", Long.valueOf(l2));
        hashmap1.put("time", Long.valueOf(l * 1000L));
        hashmap.put("uule", hashmap1);
    }

    private static void a(HashMap hashmap, aj aj1)
    {
        String s = em.bK();
        if (s != null)
        {
            hashmap.put("abf", s);
        }
        if (aj1.lQ != -1L)
        {
            hashmap.put("cust_age", qx.format(new Date(aj1.lQ)));
        }
        if (aj1.extras != null)
        {
            hashmap.put("extras", aj1.extras);
        }
        if (aj1.lR != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(aj1.lR));
        }
        if (aj1.lS != null)
        {
            hashmap.put("kw", aj1.lS);
        }
        if (aj1.lU != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(aj1.lU));
        }
        if (aj1.lT)
        {
            hashmap.put("adtest", "on");
        }
        if (aj1.versionCode >= 2)
        {
            if (aj1.lV)
            {
                hashmap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(aj1.lW))
            {
                hashmap.put("ppid", aj1.lW);
            }
            if (aj1.lX != null)
            {
                a(hashmap, aj1.lX);
            }
        }
        if (aj1.versionCode >= 3 && aj1.lZ != null)
        {
            hashmap.put("url", aj1.lZ);
        }
    }

    private static void a(HashMap hashmap, ax ax1)
    {
        Object obj;
        obj = null;
        if (Color.alpha(ax1.mB) != 0)
        {
            hashmap.put("acolor", o(ax1.mB));
        }
        if (Color.alpha(ax1.backgroundColor) != 0)
        {
            hashmap.put("bgcolor", o(ax1.backgroundColor));
        }
        if (Color.alpha(ax1.mC) != 0 && Color.alpha(ax1.mD) != 0)
        {
            hashmap.put("gradientto", o(ax1.mC));
            hashmap.put("gradientfrom", o(ax1.mD));
        }
        if (Color.alpha(ax1.mE) != 0)
        {
            hashmap.put("bcolor", o(ax1.mE));
        }
        hashmap.put("bthick", Integer.toString(ax1.mF));
        ax1.mG;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 358
    //                   1 365
    //                   2 372
    //                   3 379;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        String s = null;
_L10:
        if (s != null)
        {
            hashmap.put("btype", s);
        }
        ax1.mH;
        JVM INSTR tableswitch 0 2: default 220
    //                   0 393
    //                   1 400
    //                   2 386;
           goto _L6 _L7 _L8 _L9
_L8:
        break MISSING_BLOCK_LABEL_400;
_L6:
        s = obj;
_L11:
        if (s != null)
        {
            hashmap.put("callbuttoncolor", s);
        }
        if (ax1.mI != null)
        {
            hashmap.put("channel", ax1.mI);
        }
        if (Color.alpha(ax1.mJ) != 0)
        {
            hashmap.put("dcolor", o(ax1.mJ));
        }
        if (ax1.mK != null)
        {
            hashmap.put("font", ax1.mK);
        }
        if (Color.alpha(ax1.mL) != 0)
        {
            hashmap.put("hcolor", o(ax1.mL));
        }
        hashmap.put("headersize", Integer.toString(ax1.mM));
        if (ax1.mN != null)
        {
            hashmap.put("q", ax1.mN);
        }
        return;
_L2:
        s = "none";
          goto _L10
_L3:
        s = "dashed";
          goto _L10
_L4:
        s = "dotted";
          goto _L10
_L5:
        s = "solid";
          goto _L10
_L9:
        s = "dark";
          goto _L11
_L7:
        s = "light";
          goto _L11
        s = "medium";
          goto _L11
    }

    private static void a(HashMap hashmap, ed ed1)
    {
        hashmap.put("am", Integer.valueOf(ed1.qY));
        hashmap.put("cog", m(ed1.qZ));
        hashmap.put("coh", m(ed1.ra));
        if (!TextUtils.isEmpty(ed1.rb))
        {
            hashmap.put("carrier", ed1.rb);
        }
        hashmap.put("gl", ed1.rc);
        if (ed1.rd)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        hashmap.put("ma", m(ed1.re));
        hashmap.put("sp", m(ed1.rf));
        hashmap.put("hl", ed1.rg);
        if (!TextUtils.isEmpty(ed1.rh))
        {
            hashmap.put("mv", ed1.rh);
        }
        hashmap.put("muv", Integer.valueOf(ed1.ri));
        if (ed1.rj != -2)
        {
            hashmap.put("cnt", Integer.valueOf(ed1.rj));
        }
        hashmap.put("gnt", Integer.valueOf(ed1.rk));
        hashmap.put("pt", Integer.valueOf(ed1.rl));
        hashmap.put("rm", Integer.valueOf(ed1.rm));
        hashmap.put("riv", Integer.valueOf(ed1.rn));
        hashmap.put("u_sd", Float.valueOf(ed1.ro));
        hashmap.put("sh", Integer.valueOf(ed1.rq));
        hashmap.put("sw", Integer.valueOf(ed1.rp));
        Bundle bundle = new Bundle();
        bundle.putInt("active_network_state", ed1.ru);
        bundle.putBoolean("active_network_metered", ed1.rt);
        hashmap.put("connectivity", bundle);
        bundle = new Bundle();
        bundle.putBoolean("is_charging", ed1.rs);
        bundle.putDouble("battery_level", ed1.rr);
        hashmap.put("battery", bundle);
    }

    private static Integer m(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    private static String o(int i)
    {
        return String.format(Locale.US, "#%06x", new Object[] {
            Integer.valueOf(0xffffff & i)
        });
    }

}
