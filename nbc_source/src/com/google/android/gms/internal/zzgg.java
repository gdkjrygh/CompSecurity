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
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
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
//            zzhm, zzgf, zzgk, zzbr, 
//            zzbz, zzbv, zzhl, zzhg

public final class zzgg
{

    private static final SimpleDateFormat zzDJ = new SimpleDateFormat("yyyyMMdd");

    private static String zzG(int i)
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
            zzb.zzaC((new StringBuilder()).append("Could not parse the mediation config: ").append(context.getMessage()).toString());
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
        i = zzo.zzbx().zzgr();
_L7:
        if (TextUtils.isEmpty(s2))
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s1))
        {
            zzb.zzaC("Could not parse the mediation config: Missing required ad_base_url field");
            return new AdResponseParcel(0);
        }
          goto _L5
_L4:
        if ("landscape".equals(obj))
        {
            i = zzo.zzbx().zzgq();
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (TextUtils.isEmpty(s)) goto _L9; else goto _L8
_L8:
        obj = zzgf.zza(adrequestinfoparcel, context, adrequestinfoparcel.zzpJ.zzGG, s, null, null, null);
        s1 = ((AdResponseParcel) (obj)).zzzG;
        s2 = ((AdResponseParcel) (obj)).zzCI;
        l1 = ((AdResponseParcel) (obj)).zzCO;
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
        zzb.zzaC("Could not parse the mediation config: Missing required ad_html or ad_url field.");
        context = new AdResponseParcel(0);
        return context;
_L11:
        context = ((AdResponseParcel) (obj)).zzxF;
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
        context = ((AdResponseParcel) (obj)).zzxG;
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
        context = ((AdResponseParcel) (obj)).zzCM;
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
        if (((AdResponseParcel) (obj)).zzCJ <= 0L)
        {
            break MISSING_BLOCK_LABEL_719;
        }
        l = ((AdResponseParcel) (obj)).zzCJ;
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
        context = new AdResponseParcel(adrequestinfoparcel, s1, s2, ((List) (obj1)), ((List) (obj2)), l, flag1, jsonobject.optLong("mediation_config_cache_time_milliseconds", -1L), context, l2, i, s3, l1, s4, flag, s, ((String) (obj)), flag2, flag3, adrequestinfoparcel.zzCu, flag4, flag5, j);
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

    public static JSONObject zza(AdRequestInfoParcel adrequestinfoparcel, zzgk zzgk1, Location location, zzbr zzbr1, String s, String s1, List list)
    {
        AdSizeParcel aadsizeparcel[];
        int k;
        location = new HashMap();
        if (list.size() > 0)
        {
            location.put("eid", TextUtils.join(",", list));
        }
        if (adrequestinfoparcel.zzCl != null)
        {
            location.put("ad_pos", adrequestinfoparcel.zzCl);
        }
        zza(((HashMap) (location)), adrequestinfoparcel.zzCm);
        location.put("format", adrequestinfoparcel.zzpN.zzsm);
        if (adrequestinfoparcel.zzpN.width == -1)
        {
            location.put("smart_w", "full");
        }
        if (adrequestinfoparcel.zzpN.height == -2)
        {
            location.put("smart_h", "auto");
        }
        if (adrequestinfoparcel.zzpN.zzso == null)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        list = new StringBuilder();
        aadsizeparcel = adrequestinfoparcel.zzpN.zzso;
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
        int j = (int)((float)adsizeparcel.widthPixels / zzgk1.zzCy);
_L4:
        list.append(j);
        list.append("x");
        if (adsizeparcel.height != -2)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        j = (int)((float)adsizeparcel.heightPixels / zzgk1.zzCy);
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
            zzb.zzaC((new StringBuilder()).append("Problem serializing ad request to JSON: ").append(adrequestinfoparcel.getMessage()).toString());
            return null;
        }
          goto _L4
        j = adsizeparcel.height;
          goto _L5
        location.put("sz", list);
        if (adrequestinfoparcel.zzCs != 0)
        {
            location.put("native_version", Integer.valueOf(adrequestinfoparcel.zzCs));
            location.put("native_templates", adrequestinfoparcel.zzqd);
            location.put("native_image_orientation", zzc(adrequestinfoparcel.zzqb));
            if (!adrequestinfoparcel.zzCG.isEmpty())
            {
                location.put("native_custom_templates", adrequestinfoparcel.zzCG);
            }
        }
        location.put("slotname", adrequestinfoparcel.zzpG);
        location.put("pn", adrequestinfoparcel.applicationInfo.packageName);
        if (adrequestinfoparcel.zzCn != null)
        {
            location.put("vc", Integer.valueOf(adrequestinfoparcel.zzCn.versionCode));
        }
        location.put("ms", s1);
        location.put("seq_num", adrequestinfoparcel.zzCp);
        location.put("session_id", adrequestinfoparcel.zzCq);
        location.put("js", adrequestinfoparcel.zzpJ.zzGG);
        zza(((HashMap) (location)), zzgk1);
        location.put("fdz", new Integer(zzbr1.zzcX()));
        location.put("platform", Build.MANUFACTURER);
        location.put("submodel", Build.MODEL);
        if (adrequestinfoparcel.zzCm.versionCode >= 2 && adrequestinfoparcel.zzCm.zzsf != null)
        {
            zza(((HashMap) (location)), adrequestinfoparcel.zzCm.zzsf);
        }
        if (adrequestinfoparcel.versionCode >= 2)
        {
            location.put("quality_signals", adrequestinfoparcel.zzCr);
        }
        if (adrequestinfoparcel.versionCode >= 4 && adrequestinfoparcel.zzCu)
        {
            location.put("forceHttps", Boolean.valueOf(adrequestinfoparcel.zzCu));
        }
        if (adrequestinfoparcel.versionCode >= 4 && adrequestinfoparcel.zzCt != null)
        {
            location.put("content_info", adrequestinfoparcel.zzCt);
        }
        if (adrequestinfoparcel.versionCode < 5) goto _L7; else goto _L6
_L6:
        location.put("u_sd", Float.valueOf(adrequestinfoparcel.zzCy));
        location.put("sh", Integer.valueOf(adrequestinfoparcel.zzCx));
        location.put("sw", Integer.valueOf(adrequestinfoparcel.zzCw));
_L10:
        if (adrequestinfoparcel.versionCode < 6) goto _L9; else goto _L8
_L8:
        flag = TextUtils.isEmpty(adrequestinfoparcel.zzCz);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_723;
        }
        location.put("view_hierarchy", new JSONObject(adrequestinfoparcel.zzCz));
_L11:
        if (((Boolean)zzbz.zzun.get()).booleanValue() && adrequestinfoparcel.zzCA)
        {
            location.put("ga_hid", Integer.valueOf(adrequestinfoparcel.zzCB));
            location.put("ga_cid", adrequestinfoparcel.zzCC);
        }
        location.put("correlation_id", Long.valueOf(adrequestinfoparcel.zzCD));
_L9:
        if (adrequestinfoparcel.versionCode >= 7)
        {
            location.put("request_id", adrequestinfoparcel.zzCE);
        }
        zza(((HashMap) (location)), s);
        if (zzb.zzL(2))
        {
            adrequestinfoparcel = zzo.zzbv().zzy(location).toString(2);
            zzb.zzaB((new StringBuilder()).append("Ad Request JSON: ").append(adrequestinfoparcel).toString());
        }
        return zzo.zzbv().zzy(location);
_L7:
        location.put("u_sd", Float.valueOf(zzgk1.zzCy));
        location.put("sh", Integer.valueOf(zzgk1.zzCx));
        location.put("sw", Integer.valueOf(zzgk1.zzCw));
          goto _L10
        zzgk1;
        zzb.zzd("Problem serializing view hierarchy to JSON", zzgk1);
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
        String s = zzhg.zzgh();
        if (s != null)
        {
            hashmap.put("abf", s);
        }
        if (adrequestparcel.zzrX != -1L)
        {
            hashmap.put("cust_age", zzDJ.format(new Date(adrequestparcel.zzrX)));
        }
        if (adrequestparcel.extras != null)
        {
            hashmap.put("extras", adrequestparcel.extras);
        }
        if (adrequestparcel.zzrY != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(adrequestparcel.zzrY));
        }
        if (adrequestparcel.zzrZ != null)
        {
            hashmap.put("kw", adrequestparcel.zzrZ);
        }
        if (adrequestparcel.zzsb != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(adrequestparcel.zzsb));
        }
        if (adrequestparcel.zzsa)
        {
            hashmap.put("adtest", "on");
        }
        if (adrequestparcel.versionCode >= 2)
        {
            if (adrequestparcel.zzsc)
            {
                hashmap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(adrequestparcel.zzsd))
            {
                hashmap.put("ppid", adrequestparcel.zzsd);
            }
            if (adrequestparcel.zzse != null)
            {
                zza(hashmap, adrequestparcel.zzse);
            }
        }
        if (adrequestparcel.versionCode >= 3 && adrequestparcel.zzsg != null)
        {
            hashmap.put("url", adrequestparcel.zzsg);
        }
        if (adrequestparcel.versionCode >= 5)
        {
            if (adrequestparcel.zzsi != null)
            {
                hashmap.put("custom_targeting", adrequestparcel.zzsi);
            }
            if (adrequestparcel.zzsj != null)
            {
                hashmap.put("category_exclusions", adrequestparcel.zzsj);
            }
            if (adrequestparcel.zzsk != null)
            {
                hashmap.put("request_agent", adrequestparcel.zzsk);
            }
        }
    }

    private static void zza(HashMap hashmap, SearchAdRequestParcel searchadrequestparcel)
    {
        Object obj;
        obj = null;
        if (Color.alpha(searchadrequestparcel.zzth) != 0)
        {
            hashmap.put("acolor", zzG(searchadrequestparcel.zzth));
        }
        if (Color.alpha(searchadrequestparcel.backgroundColor) != 0)
        {
            hashmap.put("bgcolor", zzG(searchadrequestparcel.backgroundColor));
        }
        if (Color.alpha(searchadrequestparcel.zzti) != 0 && Color.alpha(searchadrequestparcel.zztj) != 0)
        {
            hashmap.put("gradientto", zzG(searchadrequestparcel.zzti));
            hashmap.put("gradientfrom", zzG(searchadrequestparcel.zztj));
        }
        if (Color.alpha(searchadrequestparcel.zztk) != 0)
        {
            hashmap.put("bcolor", zzG(searchadrequestparcel.zztk));
        }
        hashmap.put("bthick", Integer.toString(searchadrequestparcel.zztl));
        searchadrequestparcel.zztm;
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
        searchadrequestparcel.zztn;
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
        if (searchadrequestparcel.zzto != null)
        {
            hashmap.put("channel", searchadrequestparcel.zzto);
        }
        if (Color.alpha(searchadrequestparcel.zztp) != 0)
        {
            hashmap.put("dcolor", zzG(searchadrequestparcel.zztp));
        }
        if (searchadrequestparcel.zztq != null)
        {
            hashmap.put("font", searchadrequestparcel.zztq);
        }
        if (Color.alpha(searchadrequestparcel.zztr) != 0)
        {
            hashmap.put("hcolor", zzG(searchadrequestparcel.zztr));
        }
        hashmap.put("headersize", Integer.toString(searchadrequestparcel.zzts));
        if (searchadrequestparcel.zztt != null)
        {
            hashmap.put("q", searchadrequestparcel.zztt);
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

    private static void zza(HashMap hashmap, zzgk zzgk1)
    {
        hashmap.put("am", Integer.valueOf(zzgk1.zzEn));
        hashmap.put("cog", zzx(zzgk1.zzEo));
        hashmap.put("coh", zzx(zzgk1.zzEp));
        if (!TextUtils.isEmpty(zzgk1.zzEq))
        {
            hashmap.put("carrier", zzgk1.zzEq);
        }
        hashmap.put("gl", zzgk1.zzEr);
        if (zzgk1.zzEs)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        hashmap.put("ma", zzx(zzgk1.zzEt));
        hashmap.put("sp", zzx(zzgk1.zzEu));
        hashmap.put("hl", zzgk1.zzEv);
        if (!TextUtils.isEmpty(zzgk1.zzEw))
        {
            hashmap.put("mv", zzgk1.zzEw);
        }
        hashmap.put("muv", Integer.valueOf(zzgk1.zzEx));
        if (zzgk1.zzEy != -2)
        {
            hashmap.put("cnt", Integer.valueOf(zzgk1.zzEy));
        }
        hashmap.put("gnt", Integer.valueOf(zzgk1.zzEz));
        hashmap.put("pt", Integer.valueOf(zzgk1.zzEA));
        hashmap.put("rm", Integer.valueOf(zzgk1.zzEB));
        hashmap.put("riv", Integer.valueOf(zzgk1.zzEC));
        Bundle bundle = new Bundle();
        bundle.putInt("active_network_state", zzgk1.zzEG);
        bundle.putBoolean("active_network_metered", zzgk1.zzEF);
        hashmap.put("connectivity", bundle);
        bundle = new Bundle();
        bundle.putBoolean("is_charging", zzgk1.zzEE);
        bundle.putDouble("battery_level", zzgk1.zzED);
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

    private static String zzc(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        int i;
        if (nativeadoptionsparcel != null)
        {
            i = nativeadoptionsparcel.zzvD;
        } else
        {
            i = 0;
        }
        switch (i)
        {
        default:
            return "any";

        case 1: // '\001'
            return "portrait";

        case 2: // '\002'
            return "landscape";
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
