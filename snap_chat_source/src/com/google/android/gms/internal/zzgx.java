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
//            zzab, zzhp, zzhx, zzgq, 
//            zzgo, zzhy, zzgw, zzbv, 
//            zzba, zzhb, zzax, zzca, 
//            zzbx, zzho, zzhk, zzbs

public final class zzgx
{

    private static final SimpleDateFormat zzxu = new SimpleDateFormat("yyyyMMdd");

    public static zzgq zza(Context context, zzgo zzgo1, String s)
    {
        String s1;
        String s2;
        Object obj;
        JSONObject jsonobject;
        String s3;
        String s4;
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
            zzhx.zzac((new StringBuilder("Could not parse the mediation config: ")).append(context.getMessage()).toString());
            return new zzgq(0);
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
        i = zzab.zzaO().zzey();
_L7:
        if (TextUtils.isEmpty(s2))
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s1))
        {
            zzhx.zzac("Could not parse the mediation config: Missing required ad_base_url field");
            return new zzgq(0);
        }
          goto _L5
_L4:
        if ("landscape".equals(obj))
        {
            i = zzab.zzaO().zzex();
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (TextUtils.isEmpty(s)) goto _L9; else goto _L8
_L8:
        obj = zzgw.zza(context, zzgo1.zzlP.zzzH, s, null, null);
        s1 = ((zzgq) (obj)).zzus;
        s2 = ((zzgq) (obj)).zzwG;
        l1 = ((zzgq) (obj)).zzwM;
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
        zzhx.zzac("Could not parse the mediation config: Missing required ad_html or ad_url field.");
        context = new zzgq(0);
        return context;
_L11:
        context = ((zzgq) (obj)).zzst;
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
        context = ((zzgq) (obj)).zzsu;
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
            break MISSING_BLOCK_LABEL_772;
        }
        s.add(jsonarray1.getString(j));
        j++;
          goto _L36
_L31:
        context = ((zzgq) (obj)).zzwK;
          goto _L37
_L33:
        long l2;
        l2 = l;
        j = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_557;
        }
        if (((zzgq) (obj)).orientation != -1)
        {
            i = ((zzgq) (obj)).orientation;
        }
        l2 = l;
        j = i;
        if (((zzgq) (obj)).zzwH <= 0L)
        {
            break MISSING_BLOCK_LABEL_557;
        }
        l2 = ((zzgq) (obj)).zzwH;
        j = i;
        obj = jsonobject.optString("active_view");
        s = null;
        boolean flag = jsonobject.optBoolean("ad_is_javascript", false);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_592;
        }
        s = jsonobject.optString("ad_passback_url", null);
        Object obj1;
        boolean flag1 = jsonobject.optBoolean("mediation", false);
        boolean flag2 = jsonobject.optBoolean("custom_render_allowed", false);
        boolean flag3 = jsonobject.optBoolean("native", false);
        boolean flag4 = jsonobject.optBoolean("content_url_opted_out", false);
        boolean flag5 = jsonobject.optBoolean("prefetch", false);
        l = jsonobject.optLong("refresh_interval_milliseconds", -1L);
        context = new zzgq(s1, s2, ((List) (obj1)), ((List) (obj2)), l2, flag1, jsonobject.optLong("mediation_config_cache_time_milliseconds", -1L), context, l, j, s3, l1, s4, flag, s, ((String) (obj)), flag2, flag3, zzgo1.zzwv, flag4, flag5);
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

    public static JSONObject zza(zzgo zzgo1, zzhb zzhb1, Location location, zzbv zzbv1)
    {
        Object obj;
        zzba azzba[];
        int k;
        location = new HashMap();
        obj = zzbv1.zzbW();
        if (((List) (obj)).size() > 0)
        {
            location.put("eid", TextUtils.join(",", ((Iterable) (obj))));
        }
        if (zzgo1.zzwm != null)
        {
            location.put("ad_pos", zzgo1.zzwm);
        }
        zza(((HashMap) (location)), zzgo1.zzwn);
        location.put("format", zzgo1.zzlV.zzpa);
        if (zzgo1.zzlV.width == -1)
        {
            location.put("smart_w", "full");
        }
        if (zzgo1.zzlV.height == -2)
        {
            location.put("smart_h", "auto");
        }
        if (zzgo1.zzlV.zzpc == null)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        obj = new StringBuilder();
        azzba = zzgo1.zzlV.zzpc;
        k = azzba.length;
        int i = 0;
_L3:
        zzba zzba1;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        zzba1 = azzba[i];
        if (((StringBuilder) (obj)).length() != 0)
        {
            ((StringBuilder) (obj)).append("|");
        }
        if (zzba1.width != -1) goto _L2; else goto _L1
_L1:
        int j = (int)((float)zzba1.widthPixels / zzhb1.zzwz);
_L4:
        ((StringBuilder) (obj)).append(j);
        ((StringBuilder) (obj)).append("x");
        if (zzba1.height != -2)
        {
            break MISSING_BLOCK_LABEL_283;
        }
        j = (int)((float)zzba1.heightPixels / zzhb1.zzwz);
_L5:
        ((StringBuilder) (obj)).append(j);
        i++;
          goto _L3
_L2:
        boolean flag;
        try
        {
            j = zzba1.width;
        }
        // Misplaced declaration of an exception variable
        catch (zzgo zzgo1)
        {
            zzhx.zzac((new StringBuilder("Problem serializing ad request to JSON: ")).append(zzgo1.getMessage()).toString());
            return null;
        }
          goto _L4
        j = zzba1.height;
          goto _L5
        location.put("sz", obj);
        if (zzgo1.zzwt != 0)
        {
            location.put("native_version", Integer.valueOf(zzgo1.zzwt));
            location.put("native_templates", zzgo1.zzmf);
        }
        location.put("slotname", zzgo1.zzlM);
        location.put("pn", zzgo1.applicationInfo.packageName);
        if (zzgo1.zzwo != null)
        {
            location.put("vc", Integer.valueOf(zzgo1.zzwo.versionCode));
        }
        location.put("ms", zzgo1.zzwp);
        location.put("seq_num", zzgo1.zzwq);
        location.put("session_id", zzgo1.zzwr);
        location.put("js", zzgo1.zzlP.zzzH);
        zza(((HashMap) (location)), zzhb1);
        location.put("fdz", new Integer(zzbv1.zzbX()));
        if (zzgo1.zzwn.versionCode >= 2 && zzgo1.zzwn.zzoT != null)
        {
            zza(((HashMap) (location)), zzgo1.zzwn.zzoT);
        }
        if (zzgo1.versionCode >= 2)
        {
            location.put("quality_signals", zzgo1.zzws);
        }
        if (zzgo1.versionCode >= 4 && zzgo1.zzwv)
        {
            location.put("forceHttps", Boolean.valueOf(zzgo1.zzwv));
        }
        if (zzgo1.versionCode >= 4 && zzgo1.zzwu != null)
        {
            location.put("content_info", zzgo1.zzwu);
        }
        if (zzgo1.versionCode < 5) goto _L7; else goto _L6
_L6:
        location.put("u_sd", Float.valueOf(zzgo1.zzwz));
        location.put("sh", Integer.valueOf(zzgo1.zzwy));
        location.put("sw", Integer.valueOf(zzgo1.zzwx));
_L10:
        if (zzgo1.versionCode < 6) goto _L9; else goto _L8
_L8:
        flag = TextUtils.isEmpty(zzgo1.zzwA);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_668;
        }
        location.put("view_hierarchy", new JSONObject(zzgo1.zzwA));
_L11:
        if (((Boolean)zzca.zzqL.get()).booleanValue() && zzgo1.zzwB)
        {
            location.put("ga_hid", Integer.valueOf(zzgo1.zzwC));
            location.put("ga_cid", zzgo1.zzwD);
        }
        location.put("correlation_id", Long.valueOf(zzgo1.zzwE));
_L9:
        if (zzgo1.versionCode >= 7)
        {
            location.put("request_id", zzgo1.zzwF);
        }
        if (zzhx.zzA(2))
        {
            zzgo1 = zzab.zzaM().zzw(location).toString(2);
            zzhx.zzab((new StringBuilder("Ad Request JSON: ")).append(zzgo1).toString());
        }
        return zzab.zzaM().zzw(location);
_L7:
        location.put("u_sd", Float.valueOf(zzhb1.zzwz));
        location.put("sh", Integer.valueOf(zzhb1.zzwy));
        location.put("sw", Integer.valueOf(zzhb1.zzwx));
          goto _L10
        zzhb1;
        zzhx.zzd("Problem serializing view hierarchy to JSON", zzhb1);
          goto _L11
    }

    private static void zza(HashMap hashmap, Location location)
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

    private static void zza(HashMap hashmap, zzax zzax1)
    {
        String s = zzhk.zzep();
        if (s != null)
        {
            hashmap.put("abf", s);
        }
        if (zzax1.zzoL != -1L)
        {
            hashmap.put("cust_age", zzxu.format(new Date(zzax1.zzoL)));
        }
        if (zzax1.extras != null)
        {
            hashmap.put("extras", zzax1.extras);
        }
        if (zzax1.zzoM != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(zzax1.zzoM));
        }
        if (zzax1.zzoN != null)
        {
            hashmap.put("kw", zzax1.zzoN);
        }
        if (zzax1.zzoP != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(zzax1.zzoP));
        }
        if (zzax1.zzoO)
        {
            hashmap.put("adtest", "on");
        }
        if (zzax1.versionCode >= 2)
        {
            if (zzax1.zzoQ)
            {
                hashmap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(zzax1.zzoR))
            {
                hashmap.put("ppid", zzax1.zzoR);
            }
            if (zzax1.zzoS != null)
            {
                zza(hashmap, zzax1.zzoS);
            }
        }
        if (zzax1.versionCode >= 3 && zzax1.zzoU != null)
        {
            hashmap.put("url", zzax1.zzoU);
        }
        if (zzax1.versionCode >= 5)
        {
            if (zzax1.zzoW != null)
            {
                hashmap.put("custom_targeting", zzax1.zzoW);
            }
            if (zzax1.zzoX != null)
            {
                hashmap.put("category_exclusions", zzax1.zzoX);
            }
            if (zzax1.zzoY != null)
            {
                hashmap.put("request_agent", zzax1.zzoY);
            }
        }
    }

    private static void zza(HashMap hashmap, zzbs zzbs1)
    {
        Object obj;
        obj = null;
        if (Color.alpha(zzbs1.zzpN) != 0)
        {
            hashmap.put("acolor", zzy(zzbs1.zzpN));
        }
        if (Color.alpha(zzbs1.backgroundColor) != 0)
        {
            hashmap.put("bgcolor", zzy(zzbs1.backgroundColor));
        }
        if (Color.alpha(zzbs1.zzpO) != 0 && Color.alpha(zzbs1.zzpP) != 0)
        {
            hashmap.put("gradientto", zzy(zzbs1.zzpO));
            hashmap.put("gradientfrom", zzy(zzbs1.zzpP));
        }
        if (Color.alpha(zzbs1.zzpQ) != 0)
        {
            hashmap.put("bcolor", zzy(zzbs1.zzpQ));
        }
        hashmap.put("bthick", Integer.toString(zzbs1.zzpR));
        zzbs1.zzpS;
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
        zzbs1.zzpT;
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
        if (zzbs1.zzpU != null)
        {
            hashmap.put("channel", zzbs1.zzpU);
        }
        if (Color.alpha(zzbs1.zzpV) != 0)
        {
            hashmap.put("dcolor", zzy(zzbs1.zzpV));
        }
        if (zzbs1.zzpW != null)
        {
            hashmap.put("font", zzbs1.zzpW);
        }
        if (Color.alpha(zzbs1.zzpX) != 0)
        {
            hashmap.put("hcolor", zzy(zzbs1.zzpX));
        }
        hashmap.put("headersize", Integer.toString(zzbs1.zzpY));
        if (zzbs1.zzpZ != null)
        {
            hashmap.put("q", zzbs1.zzpZ);
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

    private static void zza(HashMap hashmap, zzhb zzhb1)
    {
        hashmap.put("am", Integer.valueOf(zzhb1.zzxY));
        hashmap.put("cog", zzw(zzhb1.zzxZ));
        hashmap.put("coh", zzw(zzhb1.zzya));
        if (!TextUtils.isEmpty(zzhb1.zzyb))
        {
            hashmap.put("carrier", zzhb1.zzyb);
        }
        hashmap.put("gl", zzhb1.zzyc);
        if (zzhb1.zzyd)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        hashmap.put("ma", zzw(zzhb1.zzye));
        hashmap.put("sp", zzw(zzhb1.zzyf));
        hashmap.put("hl", zzhb1.zzyg);
        if (!TextUtils.isEmpty(zzhb1.zzyh))
        {
            hashmap.put("mv", zzhb1.zzyh);
        }
        hashmap.put("muv", Integer.valueOf(zzhb1.zzyi));
        if (zzhb1.zzyj != -2)
        {
            hashmap.put("cnt", Integer.valueOf(zzhb1.zzyj));
        }
        hashmap.put("gnt", Integer.valueOf(zzhb1.zzyk));
        hashmap.put("pt", Integer.valueOf(zzhb1.zzyl));
        hashmap.put("rm", Integer.valueOf(zzhb1.zzym));
        hashmap.put("riv", Integer.valueOf(zzhb1.zzyn));
        Bundle bundle = new Bundle();
        bundle.putInt("active_network_state", zzhb1.zzyr);
        bundle.putBoolean("active_network_metered", zzhb1.zzyq);
        hashmap.put("connectivity", bundle);
        bundle = new Bundle();
        bundle.putBoolean("is_charging", zzhb1.zzyp);
        bundle.putDouble("battery_level", zzhb1.zzyo);
        hashmap.put("battery", bundle);
    }

    private static Integer zzw(boolean flag)
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

    private static String zzy(int i)
    {
        return String.format(Locale.US, "#%06x", new Object[] {
            Integer.valueOf(0xffffff & i)
        });
    }

}
