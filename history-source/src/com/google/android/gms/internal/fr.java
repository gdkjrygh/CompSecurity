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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gi, gr, fj, fh, 
//            gs, fq, ay, fv, 
//            av, ge, bj

public final class fr
{

    private static final SimpleDateFormat uD = new SimpleDateFormat("yyyyMMdd");

    public static fj a(Context context, fh fh1, String s)
    {
        String s1;
        String s2;
        Object obj;
        String s3;
        String s4;
        JSONObject jsonobject;
        int i;
        int j;
        long l;
        long l1;
        JSONArray jsonarray;
        try
        {
            jsonobject = new JSONObject(s);
            s1 = jsonobject.optString("ad_base_url", null);
            s = jsonobject.optString("ad_url", null);
            s3 = jsonobject.optString("ad_size", null);
            s2 = jsonobject.optString("ad_html", null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gr.W((new StringBuilder()).append("Could not parse the mediation config: ").append(context.getMessage()).toString());
            return new fj(0);
        }
        l1 = -1L;
        s4 = jsonobject.optString("debug_dialog", null);
        if (!jsonobject.has("interstitial_timeout")) goto _L2; else goto _L1
_L1:
        l = (long)(jsonobject.getDouble("interstitial_timeout") * 1000D);
_L41:
        obj = jsonobject.optString("orientation", null);
        i = -1;
        if (!"portrait".equals(obj)) goto _L4; else goto _L3
_L3:
        i = gi.dv();
_L7:
        if (TextUtils.isEmpty(s2))
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s1))
        {
            gr.W("Could not parse the mediation config: Missing required ad_base_url field");
            return new fj(0);
        }
          goto _L5
_L4:
        if ("landscape".equals(obj))
        {
            i = gi.du();
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (TextUtils.isEmpty(s)) goto _L9; else goto _L8
_L8:
        obj = fq.a(context, fh1.lO.wS, s, null, null);
        s1 = ((fj) (obj)).sg;
        s2 = ((fj) (obj)).tU;
        l1 = ((fj) (obj)).ua;
_L40:
        jsonarray = jsonobject.optJSONArray("click_urls");
        if (obj != null) goto _L11; else goto _L10
_L10:
        context = null;
_L19:
        if (jsonarray == null) goto _L13; else goto _L12
_L12:
        s = context;
        if (context != null) goto _L15; else goto _L14
_L14:
        s = new LinkedList();
          goto _L15
_L18:
        if (j >= jsonarray.length()) goto _L17; else goto _L16
_L16:
        s.add(jsonarray.getString(j));
        j++;
          goto _L18
_L9:
        gr.W("Could not parse the mediation config: Missing required ad_html or ad_url field.");
        context = new fj(0);
        return context;
_L11:
        context = ((fj) (obj)).qw;
          goto _L19
_L39:
        Object obj2 = jsonobject.optJSONArray("impression_urls");
        if (obj != null) goto _L21; else goto _L20
_L20:
        context = null;
_L29:
        if (obj2 == null) goto _L23; else goto _L22
_L22:
        s = context;
        if (context != null) goto _L25; else goto _L24
_L24:
        s = new LinkedList();
          goto _L25
_L28:
        if (j >= ((JSONArray) (obj2)).length()) goto _L27; else goto _L26
_L26:
        s.add(((JSONArray) (obj2)).getString(j));
        j++;
          goto _L28
_L21:
        context = ((fj) (obj)).qx;
          goto _L29
_L38:
        JSONArray jsonarray1 = jsonobject.optJSONArray("manual_impression_urls");
        if (obj != null) goto _L31; else goto _L30
_L30:
        context = null;
_L37:
        if (jsonarray1 == null) goto _L33; else goto _L32
_L32:
        s = context;
        if (context != null) goto _L35; else goto _L34
_L34:
        s = new LinkedList();
          goto _L35
_L36:
        if (j >= jsonarray1.length())
        {
            break MISSING_BLOCK_LABEL_695;
        }
        s.add(jsonarray1.getString(j));
        j++;
          goto _L36
_L31:
        context = ((fj) (obj)).tY;
          goto _L37
_L33:
        long l2;
        l2 = l;
        j = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_554;
        }
        if (((fj) (obj)).orientation != -1)
        {
            i = ((fj) (obj)).orientation;
        }
        l2 = l;
        j = i;
        if (((fj) (obj)).tV <= 0L)
        {
            break MISSING_BLOCK_LABEL_554;
        }
        l2 = ((fj) (obj)).tV;
        j = i;
        obj = jsonobject.optString("active_view");
        s = null;
        boolean flag = jsonobject.optBoolean("ad_is_javascript", false);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_589;
        }
        s = jsonobject.optString("ad_passback_url", null);
        Object obj1;
        context = new fj(s1, s2, ((List) (obj1)), ((List) (obj2)), l2, false, -1L, context, -1L, j, s3, l1, s4, flag, s, ((String) (obj)), false, false, fh1.tT, false);
        return context;
_L23:
        obj2 = context;
          goto _L38
_L13:
        obj1 = context;
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
        obj1 = s;
          goto _L39
_L25:
        j = 0;
          goto _L28
_L27:
        obj2 = s;
          goto _L38
_L35:
        j = 0;
          goto _L36
        context = s;
          goto _L33
    }

    public static String a(fh fh1, fv fv1, Location location, String s, String s1, String s2)
    {
        location = new HashMap();
        ArrayList arraylist = new ArrayList();
        if (!TextUtils.isEmpty(s))
        {
            arraylist.add(s);
        }
        if (!TextUtils.isEmpty(s1))
        {
            arraylist.add(s1);
        }
        if (!TextUtils.isEmpty(s2))
        {
            arraylist.add(s2);
        }
        if (arraylist.size() > 0)
        {
            location.put("eid", TextUtils.join(",", arraylist));
        }
        if (fh1.tK != null)
        {
            location.put("ad_pos", fh1.tK);
        }
        a(((HashMap) (location)), fh1.tL);
        location.put("format", fh1.lS.op);
        if (fh1.lS.width == -1)
        {
            location.put("smart_w", "full");
        }
        if (fh1.lS.height == -2)
        {
            location.put("smart_h", "auto");
        }
        if (fh1.lS.or == null) goto _L2; else goto _L1
_L1:
        int k;
        s = new StringBuilder();
        s1 = fh1.lS.or;
        k = s1.length;
        int i = 0;
_L8:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        s2 = s1[i];
        if (s.length() != 0)
        {
            s.append("|");
        }
        if (((ay) (s2)).width != -1) goto _L4; else goto _L3
_L3:
        int j = (int)((float)((ay) (s2)).widthPixels / fv1.vw);
_L5:
        s.append(j);
        s.append("x");
        if (((ay) (s2)).height != -2)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        j = (int)((float)((ay) (s2)).heightPixels / fv1.vw);
_L6:
        s.append(j);
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        j = ((ay) (s2)).width;
          goto _L5
        j = ((ay) (s2)).height;
          goto _L6
        location.put("sz", s);
_L2:
        if (fh1.tR != 0)
        {
            location.put("native_version", Integer.valueOf(fh1.tR));
            location.put("native_templates", fh1.mc);
        }
        location.put("slotname", fh1.lL);
        location.put("pn", fh1.applicationInfo.packageName);
        if (fh1.tM != null)
        {
            location.put("vc", Integer.valueOf(fh1.tM.versionCode));
        }
        location.put("ms", fh1.tN);
        location.put("seq_num", fh1.tO);
        location.put("session_id", fh1.tP);
        location.put("js", fh1.lO.wS);
        a(((HashMap) (location)), fv1);
        if (fh1.tL.versionCode >= 2 && fh1.tL.ol != null)
        {
            a(((HashMap) (location)), fh1.tL.ol);
        }
        if (fh1.versionCode >= 2)
        {
            location.put("quality_signals", fh1.tQ);
        }
        if (fh1.versionCode >= 4 && fh1.tT)
        {
            location.put("forceHttps", Boolean.valueOf(fh1.tT));
        }
        if (fh1.versionCode >= 3 && fh1.tS != null)
        {
            location.put("content_info", fh1.tS);
        }
        if (gr.v(2))
        {
            fh1 = gi.t(location).toString(2);
            gr.V((new StringBuilder()).append("Ad Request JSON: ").append(fh1).toString());
        }
        fh1 = gi.t(location).toString();
        return fh1;
        fh1;
        gr.W((new StringBuilder()).append("Problem serializing ad request to JSON: ").append(fh1.getMessage()).toString());
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

    private static void a(HashMap hashmap, av av1)
    {
        String s = ge.dr();
        if (s != null)
        {
            hashmap.put("abf", s);
        }
        if (av1.od != -1L)
        {
            hashmap.put("cust_age", uD.format(new Date(av1.od)));
        }
        if (av1.extras != null)
        {
            hashmap.put("extras", av1.extras);
        }
        if (av1.oe != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(av1.oe));
        }
        if (av1.of != null)
        {
            hashmap.put("kw", av1.of);
        }
        if (av1.oh != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(av1.oh));
        }
        if (av1.og)
        {
            hashmap.put("adtest", "on");
        }
        if (av1.versionCode >= 2)
        {
            if (av1.oi)
            {
                hashmap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(av1.oj))
            {
                hashmap.put("ppid", av1.oj);
            }
            if (av1.ok != null)
            {
                a(hashmap, av1.ok);
            }
        }
        if (av1.versionCode >= 3 && av1.om != null)
        {
            hashmap.put("url", av1.om);
        }
    }

    private static void a(HashMap hashmap, bj bj1)
    {
        Object obj;
        obj = null;
        if (Color.alpha(bj1.oQ) != 0)
        {
            hashmap.put("acolor", u(bj1.oQ));
        }
        if (Color.alpha(bj1.backgroundColor) != 0)
        {
            hashmap.put("bgcolor", u(bj1.backgroundColor));
        }
        if (Color.alpha(bj1.oR) != 0 && Color.alpha(bj1.oS) != 0)
        {
            hashmap.put("gradientto", u(bj1.oR));
            hashmap.put("gradientfrom", u(bj1.oS));
        }
        if (Color.alpha(bj1.oT) != 0)
        {
            hashmap.put("bcolor", u(bj1.oT));
        }
        hashmap.put("bthick", Integer.toString(bj1.oU));
        bj1.oV;
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
        bj1.oW;
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
        if (bj1.oX != null)
        {
            hashmap.put("channel", bj1.oX);
        }
        if (Color.alpha(bj1.oY) != 0)
        {
            hashmap.put("dcolor", u(bj1.oY));
        }
        if (bj1.oZ != null)
        {
            hashmap.put("font", bj1.oZ);
        }
        if (Color.alpha(bj1.pa) != 0)
        {
            hashmap.put("hcolor", u(bj1.pa));
        }
        hashmap.put("headersize", Integer.toString(bj1.pb));
        if (bj1.pc != null)
        {
            hashmap.put("q", bj1.pc);
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

    private static void a(HashMap hashmap, fv fv1)
    {
        hashmap.put("am", Integer.valueOf(fv1.vg));
        hashmap.put("cog", u(fv1.vh));
        hashmap.put("coh", u(fv1.vi));
        if (!TextUtils.isEmpty(fv1.vj))
        {
            hashmap.put("carrier", fv1.vj);
        }
        hashmap.put("gl", fv1.vk);
        if (fv1.vl)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        hashmap.put("ma", u(fv1.vm));
        hashmap.put("sp", u(fv1.vn));
        hashmap.put("hl", fv1.vo);
        if (!TextUtils.isEmpty(fv1.vp))
        {
            hashmap.put("mv", fv1.vp);
        }
        hashmap.put("muv", Integer.valueOf(fv1.vq));
        if (fv1.vr != -2)
        {
            hashmap.put("cnt", Integer.valueOf(fv1.vr));
        }
        hashmap.put("gnt", Integer.valueOf(fv1.vs));
        hashmap.put("pt", Integer.valueOf(fv1.vt));
        hashmap.put("rm", Integer.valueOf(fv1.vu));
        hashmap.put("riv", Integer.valueOf(fv1.vv));
        hashmap.put("u_sd", Float.valueOf(fv1.vw));
        hashmap.put("sh", Integer.valueOf(fv1.vy));
        hashmap.put("sw", Integer.valueOf(fv1.vx));
        Bundle bundle = new Bundle();
        bundle.putInt("active_network_state", fv1.vC);
        bundle.putBoolean("active_network_metered", fv1.vB);
        hashmap.put("connectivity", bundle);
        bundle = new Bundle();
        bundle.putBoolean("is_charging", fv1.vA);
        bundle.putDouble("battery_level", fv1.vz);
        hashmap.put("battery", bundle);
    }

    private static Integer u(boolean flag)
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

    private static String u(int i)
    {
        return String.format(Locale.US, "#%06x", new Object[] {
            Integer.valueOf(0xffffff & i)
        });
    }

}
