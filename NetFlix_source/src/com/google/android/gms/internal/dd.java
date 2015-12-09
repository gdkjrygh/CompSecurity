// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
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
//            dq, dw, cz, cx, 
//            dx, dc, ak, dg, 
//            ah, dn, av

public final class dd
{

    private static final SimpleDateFormat pH = new SimpleDateFormat("yyyyMMdd");

    public static cz a(Context context, cx cx1, String s)
    {
        String s1;
        Object obj;
        String s2;
        String s3;
        JSONObject jsonobject;
        int i;
        int j;
        long l1;
        long l2;
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
            dw.z((new StringBuilder()).append("Could not parse the mediation config: ").append(context.getMessage()).toString());
            return new cz(0);
        }
        l2 = -1L;
        s3 = jsonobject.optString("debug_dialog", null);
        if (!jsonobject.has("interstitial_timeout")) goto _L2; else goto _L1
_L1:
        l1 = (long)(jsonobject.getDouble("interstitial_timeout") * 1000D);
_L41:
        obj1 = jsonobject.optString("orientation", null);
        i = -1;
        if (!"portrait".equals(obj1)) goto _L4; else goto _L3
_L3:
        i = dq.bA();
_L7:
        if (TextUtils.isEmpty(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s))
        {
            dw.z("Could not parse the mediation config: Missing required ad_base_url field");
            return new cz(0);
        }
          goto _L5
_L4:
        if ("landscape".equals(obj1))
        {
            i = dq.bz();
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L9; else goto _L8
_L8:
        obj = dc.a(context, cx1.kK.rq, ((String) (obj)));
        s = ((cz) (obj)).ol;
        s1 = ((cz) (obj)).pm;
        l2 = ((cz) (obj)).ps;
_L40:
        obj1 = jsonobject.optJSONArray("click_urls");
        if (obj != null) goto _L11; else goto _L10
_L10:
        context = null;
_L19:
        if (obj1 == null) goto _L13; else goto _L12
_L12:
        cx1 = context;
        if (context != null) goto _L15; else goto _L14
_L14:
        cx1 = new LinkedList();
          goto _L15
_L18:
        if (j >= ((JSONArray) (obj1)).length()) goto _L17; else goto _L16
_L16:
        cx1.add(((JSONArray) (obj1)).getString(j));
        j++;
          goto _L18
_L9:
        dw.z("Could not parse the mediation config: Missing required ad_html or ad_url field.");
        context = new cz(0);
        return context;
_L11:
        context = ((cz) (obj)).ne;
          goto _L19
_L39:
        Object obj3 = jsonobject.optJSONArray("impression_urls");
        if (obj != null) goto _L21; else goto _L20
_L20:
        context = null;
_L29:
        if (obj3 == null) goto _L23; else goto _L22
_L22:
        cx1 = context;
        if (context != null) goto _L25; else goto _L24
_L24:
        cx1 = new LinkedList();
          goto _L25
_L28:
        if (j >= ((JSONArray) (obj3)).length()) goto _L27; else goto _L26
_L26:
        cx1.add(((JSONArray) (obj3)).getString(j));
        j++;
          goto _L28
_L21:
        context = ((cz) (obj)).nf;
          goto _L29
_L38:
        JSONArray jsonarray = jsonobject.optJSONArray("manual_impression_urls");
        if (obj != null) goto _L31; else goto _L30
_L30:
        context = null;
_L37:
        if (jsonarray == null) goto _L33; else goto _L32
_L32:
        cx1 = context;
        if (context != null) goto _L35; else goto _L34
_L34:
        cx1 = new LinkedList();
          goto _L35
_L36:
        if (j >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_685;
        }
        cx1.add(jsonarray.getString(j));
        j++;
          goto _L36
_L31:
        context = ((cz) (obj)).pq;
          goto _L37
_L33:
        long l3;
        l3 = l1;
        j = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_552;
        }
        if (((cz) (obj)).orientation != -1)
        {
            i = ((cz) (obj)).orientation;
        }
        l3 = l1;
        j = i;
        if (((cz) (obj)).pn <= 0L)
        {
            break MISSING_BLOCK_LABEL_552;
        }
        l3 = ((cz) (obj)).pn;
        j = i;
        obj = jsonobject.optString("active_view");
        cx1 = null;
        boolean flag = jsonobject.optBoolean("ad_is_javascript", false);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_587;
        }
        cx1 = jsonobject.optString("ad_passback_url", null);
        Object obj2;
        context = new cz(s, s1, ((List) (obj2)), ((List) (obj3)), l3, false, -1L, context, -1L, j, s2, l2, s3, flag, cx1, ((String) (obj)));
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
        l1 = -1L;
          goto _L41
_L15:
        j = 0;
          goto _L18
_L17:
        obj2 = cx1;
          goto _L39
_L25:
        j = 0;
          goto _L28
_L27:
        obj3 = cx1;
          goto _L38
_L35:
        j = 0;
          goto _L36
        context = cx1;
          goto _L33
    }

    public static String a(cx cx1, dg dg1, Location location, String s)
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
        if (cx1.pf != null)
        {
            location.put("ad_pos", cx1.pf);
        }
        a(((HashMap) (location)), cx1.pg);
        location.put("format", cx1.kN.lS);
        if (cx1.kN.width == -1)
        {
            location.put("smart_w", "full");
        }
        if (cx1.kN.height == -2)
        {
            location.put("smart_h", "auto");
        }
        if (cx1.kN.lU == null) goto _L2; else goto _L1
_L1:
        ak aak[];
        int k;
        s = new StringBuilder();
        aak = cx1.kN.lU;
        k = aak.length;
        int i = 0;
_L8:
        ak ak1;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        ak1 = aak[i];
        if (s.length() != 0)
        {
            s.append("|");
        }
        if (ak1.width != -1) goto _L4; else goto _L3
_L3:
        int j = (int)((float)ak1.widthPixels / dg1.qp);
_L5:
        s.append(j);
        s.append("x");
        if (ak1.height != -2)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        j = (int)((float)ak1.heightPixels / dg1.qp);
_L6:
        s.append(j);
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        j = ak1.width;
          goto _L5
        j = ak1.height;
          goto _L6
        location.put("sz", s);
_L2:
        location.put("slotname", cx1.kH);
        location.put("pn", cx1.applicationInfo.packageName);
        if (cx1.ph != null)
        {
            location.put("vc", Integer.valueOf(cx1.ph.versionCode));
        }
        location.put("ms", cx1.pi);
        location.put("seq_num", cx1.pj);
        location.put("session_id", cx1.pk);
        location.put("js", cx1.kK.rq);
        a(((HashMap) (location)), dg1);
        if (cx1.pg.versionCode >= 2 && cx1.pg.lP != null)
        {
            a(((HashMap) (location)), cx1.pg.lP);
        }
        if (cx1.versionCode >= 2)
        {
            location.put("quality_signals", cx1.pl);
        }
        if (dw.n(2))
        {
            cx1 = dq.p(location).toString(2);
            dw.y((new StringBuilder()).append("Ad Request JSON: ").append(cx1).toString());
        }
        cx1 = dq.p(location).toString();
        return cx1;
        cx1;
        dw.z((new StringBuilder()).append("Problem serializing ad request to JSON: ").append(cx1.getMessage()).toString());
        return null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void a(HashMap hashmap, Location location)
    {
        HashMap hashmap1 = new HashMap();
        float f = location.getAccuracy();
        long l1 = location.getTime();
        long l2 = (long)(location.getLatitude() * 10000000D);
        long l3 = (long)(location.getLongitude() * 10000000D);
        hashmap1.put("radius", Float.valueOf(f * 1000F));
        hashmap1.put("lat", Long.valueOf(l2));
        hashmap1.put("long", Long.valueOf(l3));
        hashmap1.put("time", Long.valueOf(l1 * 1000L));
        hashmap.put("uule", hashmap1);
    }

    private static void a(HashMap hashmap, ah ah1)
    {
        String s = dn.bx();
        if (s != null)
        {
            hashmap.put("abf", s);
        }
        if (ah1.lH != -1L)
        {
            hashmap.put("cust_age", pH.format(new Date(ah1.lH)));
        }
        if (ah1.extras != null)
        {
            hashmap.put("extras", ah1.extras);
        }
        if (ah1.lI != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(ah1.lI));
        }
        if (ah1.lJ != null)
        {
            hashmap.put("kw", ah1.lJ);
        }
        if (ah1.lL != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(ah1.lL));
        }
        if (ah1.lK)
        {
            hashmap.put("adtest", "on");
        }
        if (ah1.versionCode >= 2)
        {
            if (ah1.lM)
            {
                hashmap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(ah1.lN))
            {
                hashmap.put("ppid", ah1.lN);
            }
            if (ah1.lO != null)
            {
                a(hashmap, ah1.lO);
            }
        }
        if (ah1.versionCode >= 3 && ah1.lQ != null)
        {
            hashmap.put("url", ah1.lQ);
        }
    }

    private static void a(HashMap hashmap, av av1)
    {
        Object obj;
        obj = null;
        if (Color.alpha(av1.mq) != 0)
        {
            hashmap.put("acolor", m(av1.mq));
        }
        if (Color.alpha(av1.backgroundColor) != 0)
        {
            hashmap.put("bgcolor", m(av1.backgroundColor));
        }
        if (Color.alpha(av1.mr) != 0 && Color.alpha(av1.ms) != 0)
        {
            hashmap.put("gradientto", m(av1.mr));
            hashmap.put("gradientfrom", m(av1.ms));
        }
        if (Color.alpha(av1.mt) != 0)
        {
            hashmap.put("bcolor", m(av1.mt));
        }
        hashmap.put("bthick", Integer.toString(av1.mu));
        av1.mv;
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
        av1.mw;
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
        if (av1.mx != null)
        {
            hashmap.put("channel", av1.mx);
        }
        if (Color.alpha(av1.my) != 0)
        {
            hashmap.put("dcolor", m(av1.my));
        }
        if (av1.mz != null)
        {
            hashmap.put("font", av1.mz);
        }
        if (Color.alpha(av1.mA) != 0)
        {
            hashmap.put("hcolor", m(av1.mA));
        }
        hashmap.put("headersize", Integer.toString(av1.mB));
        if (av1.mC != null)
        {
            hashmap.put("q", av1.mC);
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

    private static void a(HashMap hashmap, dg dg1)
    {
        hashmap.put("am", Integer.valueOf(dg1.pZ));
        hashmap.put("cog", l(dg1.qa));
        hashmap.put("coh", l(dg1.qb));
        if (!TextUtils.isEmpty(dg1.qc))
        {
            hashmap.put("carrier", dg1.qc);
        }
        hashmap.put("gl", dg1.qd);
        if (dg1.qe)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        hashmap.put("ma", l(dg1.qf));
        hashmap.put("sp", l(dg1.qg));
        hashmap.put("hl", dg1.qh);
        if (!TextUtils.isEmpty(dg1.qi))
        {
            hashmap.put("mv", dg1.qi);
        }
        hashmap.put("muv", Integer.valueOf(dg1.qj));
        if (dg1.qk != -2)
        {
            hashmap.put("cnt", Integer.valueOf(dg1.qk));
        }
        hashmap.put("gnt", Integer.valueOf(dg1.ql));
        hashmap.put("pt", Integer.valueOf(dg1.qm));
        hashmap.put("rm", Integer.valueOf(dg1.qn));
        hashmap.put("riv", Integer.valueOf(dg1.qo));
        hashmap.put("u_sd", Float.valueOf(dg1.qp));
        hashmap.put("sh", Integer.valueOf(dg1.qr));
        hashmap.put("sw", Integer.valueOf(dg1.qq));
    }

    private static Integer l(boolean flag)
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

    private static String m(int i)
    {
        return String.format(Locale.US, "#%06x", new Object[] {
            Integer.valueOf(0xffffff & i)
        });
    }

}
