// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzfm, zzeq, zzev, zzal, 
//            zzat, zzap, zzfl, zzfg

public final class zzer
{

    private static final SimpleDateFormat zzAt = new SimpleDateFormat("yyyyMMdd");

    private static String zzA(int i)
    {
        return String.format(Locale.US, "#%06x", new Object[] {
            Integer.valueOf(0xffffff & i)
        });
    }

    public static AdResponseParcel zza(Context context, AdRequestInfoParcel adrequestinfoparcel, String s)
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
            zzb.zzan((new StringBuilder()).append("Could not parse the mediation config: ").append(context.getMessage()).toString());
            return new AdResponseParcel(0);
        }
        l1 = -1L;
        s4 = jsonobject.optString("debug_dialog", null);
        if (!jsonobject.has("interstitial_timeout")) goto _L2; else goto _L1
_L1:
        l = (long)(jsonobject.getDouble("interstitial_timeout") * 1000D);
_L42:
        obj = jsonobject.optString("orientation", null);
        i = -1;
        if (!"portrait".equals(obj)) goto _L4; else goto _L3
_L3:
        i = zzh.zzaS().zzff();
_L7:
        if (TextUtils.isEmpty(s2))
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s1))
        {
            zzb.zzan("Could not parse the mediation config: Missing required ad_base_url field");
            return new AdResponseParcel(0);
        }
          goto _L5
_L4:
        if ("landscape".equals(obj))
        {
            i = zzh.zzaS().zzfe();
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (TextUtils.isEmpty(s)) goto _L9; else goto _L8
_L8:
        obj = zzeq.zza(adrequestinfoparcel, context, adrequestinfoparcel.zzmJ.zzCI, s, null, null, null);
        s1 = ((AdResponseParcel) (obj)).zzwB;
        s2 = ((AdResponseParcel) (obj)).zzzr;
        l1 = ((AdResponseParcel) (obj)).zzzx;
_L41:
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
        zzb.zzan("Could not parse the mediation config: Missing required ad_html or ad_url field.");
        context = new AdResponseParcel(0);
        return context;
_L11:
        context = ((AdResponseParcel) (obj)).zzuC;
          goto _L19
_L40:
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
        context = ((AdResponseParcel) (obj)).zzuD;
          goto _L29
_L39:
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
            break MISSING_BLOCK_LABEL_785;
        }
        s.add(jsonarray1.getString(j));
        j++;
          goto _L36
_L31:
        context = ((AdResponseParcel) (obj)).zzzv;
          goto _L37
_L33:
        j = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_719;
        }
        if (((AdResponseParcel) (obj)).orientation != -1)
        {
            i = ((AdResponseParcel) (obj)).orientation;
        }
        j = i;
        if (((AdResponseParcel) (obj)).zzzs <= 0L)
        {
            break MISSING_BLOCK_LABEL_719;
        }
        l = ((AdResponseParcel) (obj)).zzzs;
_L38:
        obj = jsonobject.optString("active_view");
        s = null;
        boolean flag = jsonobject.optBoolean("ad_is_javascript", false);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_585;
        }
        s = jsonobject.optString("ad_passback_url", null);
        Object obj1;
        boolean flag1 = jsonobject.optBoolean("mediation", false);
        boolean flag2 = jsonobject.optBoolean("custom_render_allowed", false);
        boolean flag3 = jsonobject.optBoolean("native", false);
        boolean flag4 = jsonobject.optBoolean("content_url_opted_out", true);
        boolean flag5 = jsonobject.optBoolean("prefetch", false);
        j = jsonobject.optInt("oauth2_token_status", 0);
        long l2 = jsonobject.optLong("refresh_interval_milliseconds", -1L);
        context = new AdResponseParcel(adrequestinfoparcel, s1, s2, ((List) (obj1)), ((List) (obj2)), l, flag1, jsonobject.optLong("mediation_config_cache_time_milliseconds", -1L), context, l2, i, s3, l1, s4, flag, s, ((String) (obj)), flag2, flag3, adrequestinfoparcel.zzze, flag4, flag5, j);
        return context;
        i = j;
          goto _L38
_L23:
        obj2 = context;
          goto _L39
_L13:
        obj1 = context;
          goto _L40
_L5:
        obj = null;
          goto _L41
_L2:
        l = -1L;
          goto _L42
_L15:
        j = 0;
          goto _L18
_L17:
        obj1 = s;
          goto _L40
_L25:
        j = 0;
          goto _L28
_L27:
        obj2 = s;
          goto _L39
_L35:
        j = 0;
          goto _L36
        context = s;
          goto _L33
    }

    public static JSONObject zza(AdRequestInfoParcel adrequestinfoparcel, zzev zzev1, Location location, zzal zzal1, String s, String s1, List list)
    {
        AdSizeParcel aadsizeparcel[];
        int k;
        location = new HashMap();
        if (list.size() > 0)
        {
            location.put("eid", TextUtils.join(",", list));
        }
        if (adrequestinfoparcel.zzyV != null)
        {
            location.put("ad_pos", adrequestinfoparcel.zzyV);
        }
        zza(((HashMap) (location)), adrequestinfoparcel.zzyW);
        location.put("format", adrequestinfoparcel.zzmP.zzpX);
        if (adrequestinfoparcel.zzmP.width == -1)
        {
            location.put("smart_w", "full");
        }
        if (adrequestinfoparcel.zzmP.height == -2)
        {
            location.put("smart_h", "auto");
        }
        if (adrequestinfoparcel.zzmP.zzpZ == null)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        list = new StringBuilder();
        aadsizeparcel = adrequestinfoparcel.zzmP.zzpZ;
        k = aadsizeparcel.length;
        int i = 0;
_L3:
        AdSizeParcel adsizeparcel;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_289;
        }
        adsizeparcel = aadsizeparcel[i];
        if (list.length() != 0)
        {
            list.append("|");
        }
        if (adsizeparcel.width != -1) goto _L2; else goto _L1
_L1:
        int j = (int)((float)adsizeparcel.widthPixels / zzev1.zzzi);
_L4:
        list.append(j);
        list.append("x");
        if (adsizeparcel.height != -2)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        j = (int)((float)adsizeparcel.heightPixels / zzev1.zzzi);
_L5:
        list.append(j);
        i++;
          goto _L3
_L2:
        boolean flag;
        try
        {
            j = adsizeparcel.width;
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            zzb.zzan((new StringBuilder()).append("Problem serializing ad request to JSON: ").append(adrequestinfoparcel.getMessage()).toString());
            return null;
        }
          goto _L4
        j = adsizeparcel.height;
          goto _L5
        location.put("sz", list);
        if (adrequestinfoparcel.zzzc != 0)
        {
            location.put("native_version", Integer.valueOf(adrequestinfoparcel.zzzc));
            location.put("native_templates", adrequestinfoparcel.zzmZ);
        }
        location.put("slotname", adrequestinfoparcel.zzmG);
        location.put("pn", adrequestinfoparcel.applicationInfo.packageName);
        if (adrequestinfoparcel.zzyX != null)
        {
            location.put("vc", Integer.valueOf(adrequestinfoparcel.zzyX.versionCode));
        }
        location.put("ms", s1);
        location.put("seq_num", adrequestinfoparcel.zzyZ);
        location.put("session_id", adrequestinfoparcel.zzza);
        location.put("js", adrequestinfoparcel.zzmJ.zzCI);
        zza(((HashMap) (location)), zzev1);
        location.put("fdz", new Integer(zzal1.zzcc()));
        location.put("platform", Build.MANUFACTURER);
        location.put("submodel", Build.MODEL);
        if (adrequestinfoparcel.zzyW.versionCode >= 2 && adrequestinfoparcel.zzyW.zzpQ != null)
        {
            zza(((HashMap) (location)), adrequestinfoparcel.zzyW.zzpQ);
        }
        if (adrequestinfoparcel.versionCode >= 2)
        {
            location.put("quality_signals", adrequestinfoparcel.zzzb);
        }
        if (adrequestinfoparcel.versionCode >= 4 && adrequestinfoparcel.zzze)
        {
            location.put("forceHttps", Boolean.valueOf(adrequestinfoparcel.zzze));
        }
        if (adrequestinfoparcel.versionCode >= 4 && adrequestinfoparcel.zzzd != null)
        {
            location.put("content_info", adrequestinfoparcel.zzzd);
        }
        if (adrequestinfoparcel.versionCode < 5) goto _L7; else goto _L6
_L6:
        location.put("u_sd", Float.valueOf(adrequestinfoparcel.zzzi));
        location.put("sh", Integer.valueOf(adrequestinfoparcel.zzzh));
        location.put("sw", Integer.valueOf(adrequestinfoparcel.zzzg));
_L10:
        if (adrequestinfoparcel.versionCode < 6) goto _L9; else goto _L8
_L8:
        flag = TextUtils.isEmpty(adrequestinfoparcel.zzzj);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_684;
        }
        location.put("view_hierarchy", new JSONObject(adrequestinfoparcel.zzzj));
_L11:
        if (((Boolean)zzat.zzrQ.get()).booleanValue() && adrequestinfoparcel.zzzk)
        {
            location.put("ga_hid", Integer.valueOf(adrequestinfoparcel.zzzl));
            location.put("ga_cid", adrequestinfoparcel.zzzm);
        }
        location.put("correlation_id", Long.valueOf(adrequestinfoparcel.zzzn));
_L9:
        if (adrequestinfoparcel.versionCode >= 7)
        {
            location.put("request_id", adrequestinfoparcel.zzzo);
        }
        zza(((HashMap) (location)), s);
        if (zzb.zzC(2))
        {
            adrequestinfoparcel = zzh.zzaQ().zzx(location).toString(2);
            zzb.zzam((new StringBuilder()).append("Ad Request JSON: ").append(adrequestinfoparcel).toString());
        }
        return zzh.zzaQ().zzx(location);
_L7:
        location.put("u_sd", Float.valueOf(zzev1.zzzi));
        location.put("sh", Integer.valueOf(zzev1.zzzh));
        location.put("sw", Integer.valueOf(zzev1.zzzg));
          goto _L10
        zzev1;
        zzb.zzd("Problem serializing view hierarchy to JSON", zzev1);
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

    private static void zza(HashMap hashmap, AdRequestParcel adrequestparcel)
    {
        String s = zzfg.zzeV();
        if (s != null)
        {
            hashmap.put("abf", s);
        }
        if (adrequestparcel.zzpI != -1L)
        {
            hashmap.put("cust_age", zzAt.format(new Date(adrequestparcel.zzpI)));
        }
        if (adrequestparcel.extras != null)
        {
            hashmap.put("extras", adrequestparcel.extras);
        }
        if (adrequestparcel.zzpJ != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(adrequestparcel.zzpJ));
        }
        if (adrequestparcel.zzpK != null)
        {
            hashmap.put("kw", adrequestparcel.zzpK);
        }
        if (adrequestparcel.zzpM != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(adrequestparcel.zzpM));
        }
        if (adrequestparcel.zzpL)
        {
            hashmap.put("adtest", "on");
        }
        if (adrequestparcel.versionCode >= 2)
        {
            if (adrequestparcel.zzpN)
            {
                hashmap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(adrequestparcel.zzpO))
            {
                hashmap.put("ppid", adrequestparcel.zzpO);
            }
            if (adrequestparcel.zzpP != null)
            {
                zza(hashmap, adrequestparcel.zzpP);
            }
        }
        if (adrequestparcel.versionCode >= 3 && adrequestparcel.zzpR != null)
        {
            hashmap.put("url", adrequestparcel.zzpR);
        }
        if (adrequestparcel.versionCode >= 5)
        {
            if (adrequestparcel.zzpT != null)
            {
                hashmap.put("custom_targeting", adrequestparcel.zzpT);
            }
            if (adrequestparcel.zzpU != null)
            {
                hashmap.put("category_exclusions", adrequestparcel.zzpU);
            }
            if (adrequestparcel.zzpV != null)
            {
                hashmap.put("request_agent", adrequestparcel.zzpV);
            }
        }
    }

    private static void zza(HashMap hashmap, SearchAdRequestParcel searchadrequestparcel)
    {
        Object obj;
        obj = null;
        if (Color.alpha(searchadrequestparcel.zzqL) != 0)
        {
            hashmap.put("acolor", zzA(searchadrequestparcel.zzqL));
        }
        if (Color.alpha(searchadrequestparcel.backgroundColor) != 0)
        {
            hashmap.put("bgcolor", zzA(searchadrequestparcel.backgroundColor));
        }
        if (Color.alpha(searchadrequestparcel.zzqM) != 0 && Color.alpha(searchadrequestparcel.zzqN) != 0)
        {
            hashmap.put("gradientto", zzA(searchadrequestparcel.zzqM));
            hashmap.put("gradientfrom", zzA(searchadrequestparcel.zzqN));
        }
        if (Color.alpha(searchadrequestparcel.zzqO) != 0)
        {
            hashmap.put("bcolor", zzA(searchadrequestparcel.zzqO));
        }
        hashmap.put("bthick", Integer.toString(searchadrequestparcel.zzqP));
        searchadrequestparcel.zzqQ;
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
        searchadrequestparcel.zzqR;
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
        if (searchadrequestparcel.zzqS != null)
        {
            hashmap.put("channel", searchadrequestparcel.zzqS);
        }
        if (Color.alpha(searchadrequestparcel.zzqT) != 0)
        {
            hashmap.put("dcolor", zzA(searchadrequestparcel.zzqT));
        }
        if (searchadrequestparcel.zzqU != null)
        {
            hashmap.put("font", searchadrequestparcel.zzqU);
        }
        if (Color.alpha(searchadrequestparcel.zzqV) != 0)
        {
            hashmap.put("hcolor", zzA(searchadrequestparcel.zzqV));
        }
        hashmap.put("headersize", Integer.toString(searchadrequestparcel.zzqW));
        if (searchadrequestparcel.zzqX != null)
        {
            hashmap.put("q", searchadrequestparcel.zzqX);
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

    private static void zza(HashMap hashmap, zzev zzev1)
    {
        hashmap.put("am", Integer.valueOf(zzev1.zzAY));
        hashmap.put("cog", zzx(zzev1.zzAZ));
        hashmap.put("coh", zzx(zzev1.zzBa));
        if (!TextUtils.isEmpty(zzev1.zzBb))
        {
            hashmap.put("carrier", zzev1.zzBb);
        }
        hashmap.put("gl", zzev1.zzBc);
        if (zzev1.zzBd)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        hashmap.put("ma", zzx(zzev1.zzBe));
        hashmap.put("sp", zzx(zzev1.zzBf));
        hashmap.put("hl", zzev1.zzBg);
        if (!TextUtils.isEmpty(zzev1.zzBh))
        {
            hashmap.put("mv", zzev1.zzBh);
        }
        hashmap.put("muv", Integer.valueOf(zzev1.zzBi));
        if (zzev1.zzBj != -2)
        {
            hashmap.put("cnt", Integer.valueOf(zzev1.zzBj));
        }
        hashmap.put("gnt", Integer.valueOf(zzev1.zzBk));
        hashmap.put("pt", Integer.valueOf(zzev1.zzBl));
        hashmap.put("rm", Integer.valueOf(zzev1.zzBm));
        hashmap.put("riv", Integer.valueOf(zzev1.zzBn));
        Bundle bundle = new Bundle();
        bundle.putInt("active_network_state", zzev1.zzBr);
        bundle.putBoolean("active_network_metered", zzev1.zzBq);
        hashmap.put("connectivity", bundle);
        bundle = new Bundle();
        bundle.putBoolean("is_charging", zzev1.zzBp);
        bundle.putDouble("battery_level", zzev1.zzBo);
        hashmap.put("battery", bundle);
    }

    private static void zza(HashMap hashmap, String s)
    {
        if (s != null)
        {
            HashMap hashmap1 = new HashMap();
            hashmap1.put("token", s);
            hashmap.put("pan", hashmap1);
        }
    }

    private static Integer zzx(boolean flag)
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

}
