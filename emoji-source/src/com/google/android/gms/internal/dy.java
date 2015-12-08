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
//            eo, eu, du, ds, 
//            ev, dx, al, ec, 
//            ai, el, aw

public final class dy
{

    private static final SimpleDateFormat qA = new SimpleDateFormat("yyyyMMdd");

    public static du a(Context context, ds ds1, String s)
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
            eu.D((new StringBuilder()).append("Could not parse the mediation config: ").append(context.getMessage()).toString());
            return new du(0);
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
        i = eo.bS();
_L7:
        if (TextUtils.isEmpty(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s))
        {
            eu.D("Could not parse the mediation config: Missing required ad_base_url field");
            return new du(0);
        }
          goto _L5
_L4:
        if ("landscape".equals(obj1))
        {
            i = eo.bR();
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L9; else goto _L8
_L8:
        obj = dx.a(context, ds1.kQ.sw, ((String) (obj)), null, null);
        s = ((du) (obj)).oA;
        s1 = ((du) (obj)).qe;
        l1 = ((du) (obj)).qk;
_L40:
        obj1 = jsonobject.optJSONArray("click_urls");
        if (obj != null) goto _L11; else goto _L10
_L10:
        context = null;
_L19:
        if (obj1 == null) goto _L13; else goto _L12
_L12:
        ds1 = context;
        if (context != null) goto _L15; else goto _L14
_L14:
        ds1 = new LinkedList();
          goto _L15
_L18:
        if (j >= ((JSONArray) (obj1)).length()) goto _L17; else goto _L16
_L16:
        ds1.add(((JSONArray) (obj1)).getString(j));
        j++;
          goto _L18
_L9:
        eu.D("Could not parse the mediation config: Missing required ad_html or ad_url field.");
        context = new du(0);
        return context;
_L11:
        context = ((du) (obj)).nt;
          goto _L19
_L39:
        Object obj3 = jsonobject.optJSONArray("impression_urls");
        if (obj != null) goto _L21; else goto _L20
_L20:
        context = null;
_L29:
        if (obj3 == null) goto _L23; else goto _L22
_L22:
        ds1 = context;
        if (context != null) goto _L25; else goto _L24
_L24:
        ds1 = new LinkedList();
          goto _L25
_L28:
        if (j >= ((JSONArray) (obj3)).length()) goto _L27; else goto _L26
_L26:
        ds1.add(((JSONArray) (obj3)).getString(j));
        j++;
          goto _L28
_L21:
        context = ((du) (obj)).nu;
          goto _L29
_L38:
        JSONArray jsonarray = jsonobject.optJSONArray("manual_impression_urls");
        if (obj != null) goto _L31; else goto _L30
_L30:
        context = null;
_L37:
        if (jsonarray == null) goto _L33; else goto _L32
_L32:
        ds1 = context;
        if (context != null) goto _L35; else goto _L34
_L34:
        ds1 = new LinkedList();
          goto _L35
_L36:
        if (j >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_687;
        }
        ds1.add(jsonarray.getString(j));
        j++;
          goto _L36
_L31:
        context = ((du) (obj)).qi;
          goto _L37
_L33:
        long l2;
        l2 = l;
        j = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_554;
        }
        if (((du) (obj)).orientation != -1)
        {
            i = ((du) (obj)).orientation;
        }
        l2 = l;
        j = i;
        if (((du) (obj)).qf <= 0L)
        {
            break MISSING_BLOCK_LABEL_554;
        }
        l2 = ((du) (obj)).qf;
        j = i;
        obj = jsonobject.optString("active_view");
        ds1 = null;
        boolean flag = jsonobject.optBoolean("ad_is_javascript", false);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_589;
        }
        ds1 = jsonobject.optString("ad_passback_url", null);
        Object obj2;
        context = new du(s, s1, ((List) (obj2)), ((List) (obj3)), l2, false, -1L, context, -1L, j, s2, l1, s3, flag, ds1, ((String) (obj)));
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
        obj2 = ds1;
          goto _L39
_L25:
        j = 0;
          goto _L28
_L27:
        obj3 = ds1;
          goto _L38
_L35:
        j = 0;
          goto _L36
        context = ds1;
          goto _L33
    }

    public static String a(ds ds1, ec ec1, Location location, String s)
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
        if (ds1.pW != null)
        {
            location.put("ad_pos", ds1.pW);
        }
        a(((HashMap) (location)), ds1.pX);
        location.put("format", ds1.kT.me);
        if (ds1.kT.width == -1)
        {
            location.put("smart_w", "full");
        }
        if (ds1.kT.height == -2)
        {
            location.put("smart_h", "auto");
        }
        if (ds1.kT.mg == null) goto _L2; else goto _L1
_L1:
        al aal[];
        int k;
        s = new StringBuilder();
        aal = ds1.kT.mg;
        k = aal.length;
        int i = 0;
_L8:
        al al1;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        al1 = aal[i];
        if (s.length() != 0)
        {
            s.append("|");
        }
        if (al1.width != -1) goto _L4; else goto _L3
_L3:
        int j = (int)((float)al1.widthPixels / ec1.rr);
_L5:
        s.append(j);
        s.append("x");
        if (al1.height != -2)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        j = (int)((float)al1.heightPixels / ec1.rr);
_L6:
        s.append(j);
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        j = al1.width;
          goto _L5
        j = al1.height;
          goto _L6
        location.put("sz", s);
_L2:
        location.put("slotname", ds1.kN);
        location.put("pn", ds1.applicationInfo.packageName);
        if (ds1.pY != null)
        {
            location.put("vc", Integer.valueOf(ds1.pY.versionCode));
        }
        location.put("ms", ds1.pZ);
        location.put("ms2", ds1.qd);
        location.put("seq_num", ds1.qa);
        location.put("session_id", ds1.qb);
        location.put("js", ds1.kQ.sw);
        a(((HashMap) (location)), ec1);
        if (ds1.pX.versionCode >= 2 && ds1.pX.ma != null)
        {
            a(((HashMap) (location)), ds1.pX.ma);
        }
        if (ds1.versionCode >= 2)
        {
            location.put("quality_signals", ds1.qc);
        }
        if (eu.p(2))
        {
            ds1 = eo.o(location).toString(2);
            eu.C((new StringBuilder()).append("Ad Request JSON: ").append(ds1).toString());
        }
        ds1 = eo.o(location).toString();
        return ds1;
        ds1;
        eu.D((new StringBuilder()).append("Problem serializing ad request to JSON: ").append(ds1.getMessage()).toString());
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

    private static void a(HashMap hashmap, ai ai1)
    {
        String s = el.bP();
        if (s != null)
        {
            hashmap.put("abf", s);
        }
        if (ai1.lS != -1L)
        {
            hashmap.put("cust_age", qA.format(new Date(ai1.lS)));
        }
        if (ai1.extras != null)
        {
            hashmap.put("extras", ai1.extras);
        }
        if (ai1.lT != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(ai1.lT));
        }
        if (ai1.lU != null)
        {
            hashmap.put("kw", ai1.lU);
        }
        if (ai1.lW != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(ai1.lW));
        }
        if (ai1.lV)
        {
            hashmap.put("adtest", "on");
        }
        if (ai1.versionCode >= 2)
        {
            if (ai1.lX)
            {
                hashmap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(ai1.lY))
            {
                hashmap.put("ppid", ai1.lY);
            }
            if (ai1.lZ != null)
            {
                a(hashmap, ai1.lZ);
            }
        }
        if (ai1.versionCode >= 3 && ai1.mb != null)
        {
            hashmap.put("url", ai1.mb);
        }
    }

    private static void a(HashMap hashmap, aw aw1)
    {
        Object obj;
        obj = null;
        if (Color.alpha(aw1.mD) != 0)
        {
            hashmap.put("acolor", o(aw1.mD));
        }
        if (Color.alpha(aw1.backgroundColor) != 0)
        {
            hashmap.put("bgcolor", o(aw1.backgroundColor));
        }
        if (Color.alpha(aw1.mE) != 0 && Color.alpha(aw1.mF) != 0)
        {
            hashmap.put("gradientto", o(aw1.mE));
            hashmap.put("gradientfrom", o(aw1.mF));
        }
        if (Color.alpha(aw1.mG) != 0)
        {
            hashmap.put("bcolor", o(aw1.mG));
        }
        hashmap.put("bthick", Integer.toString(aw1.mH));
        aw1.mI;
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
        aw1.mJ;
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
        if (aw1.mK != null)
        {
            hashmap.put("channel", aw1.mK);
        }
        if (Color.alpha(aw1.mL) != 0)
        {
            hashmap.put("dcolor", o(aw1.mL));
        }
        if (aw1.mM != null)
        {
            hashmap.put("font", aw1.mM);
        }
        if (Color.alpha(aw1.mN) != 0)
        {
            hashmap.put("hcolor", o(aw1.mN));
        }
        hashmap.put("headersize", Integer.toString(aw1.mO));
        if (aw1.mP != null)
        {
            hashmap.put("q", aw1.mP);
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

    private static void a(HashMap hashmap, ec ec1)
    {
        hashmap.put("am", Integer.valueOf(ec1.rb));
        hashmap.put("cog", m(ec1.rc));
        hashmap.put("coh", m(ec1.rd));
        if (!TextUtils.isEmpty(ec1.re))
        {
            hashmap.put("carrier", ec1.re);
        }
        hashmap.put("gl", ec1.rf);
        if (ec1.rg)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        hashmap.put("ma", m(ec1.rh));
        hashmap.put("sp", m(ec1.ri));
        hashmap.put("hl", ec1.rj);
        if (!TextUtils.isEmpty(ec1.rk))
        {
            hashmap.put("mv", ec1.rk);
        }
        hashmap.put("muv", Integer.valueOf(ec1.rl));
        if (ec1.rm != -2)
        {
            hashmap.put("cnt", Integer.valueOf(ec1.rm));
        }
        hashmap.put("gnt", Integer.valueOf(ec1.rn));
        hashmap.put("pt", Integer.valueOf(ec1.ro));
        hashmap.put("rm", Integer.valueOf(ec1.rp));
        hashmap.put("riv", Integer.valueOf(ec1.rq));
        hashmap.put("u_sd", Float.valueOf(ec1.rr));
        hashmap.put("sh", Integer.valueOf(ec1.rt));
        hashmap.put("sw", Integer.valueOf(ec1.rs));
        Bundle bundle = new Bundle();
        bundle.putInt("active_network_state", ec1.rx);
        bundle.putBoolean("active_network_metered", ec1.rw);
        hashmap.put("connectivity", bundle);
        bundle = new Bundle();
        bundle.putBoolean("is_charging", ec1.rv);
        bundle.putDouble("battery_level", ec1.ru);
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
