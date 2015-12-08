// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.a;
import com.google.android.gms.appdatasearch.e;
import com.google.android.gms.appdatasearch.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            qd, nj, pi, ny, 
//            cn, cy, cx, qa, 
//            wf

public final class ns
{

    private static final SimpleDateFormat a;

    public static AdResponseParcel a(Context context, AdRequestInfoParcel adrequestinfoparcel, String s)
    {
        String s1;
        String s2;
        Object obj;
        Object obj1;
        JSONObject jsonobject;
        String s3;
        String s4;
        int j;
        int k;
        long l;
        long l1;
        boolean flag;
        try
        {
            jsonobject = new JSONObject(s);
            s1 = jsonobject.optString("ad_base_url", null);
            s2 = jsonobject.optString("ad_url", null);
            s3 = jsonobject.optString("ad_size", null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzaH((new StringBuilder("Could not parse the mediation config: ")).append(context.getMessage()).toString());
            return new AdResponseParcel(0);
        }
        if (adrequestinfoparcel == null) goto _L2; else goto _L1
_L1:
        if (adrequestinfoparcel.zzEt == 0) goto _L2; else goto _L3
_L3:
        flag = true;
_L50:
        if (!flag) goto _L5; else goto _L4
_L4:
        s = jsonobject.optString("ad_json", null);
_L13:
        l1 = -1L;
        s4 = jsonobject.optString("debug_dialog", null);
        if (!jsonobject.has("interstitial_timeout")) goto _L7; else goto _L6
_L6:
        l = (long)(jsonobject.getDouble("interstitial_timeout") * 1000D);
_L51:
        obj = jsonobject.optString("orientation", null);
        j = -1;
        if (!"portrait".equals(obj)) goto _L9; else goto _L8
_L8:
        j = zzp.zzbx().b();
_L15:
        if (TextUtils.isEmpty(s)) goto _L11; else goto _L10
_L10:
        if (TextUtils.isEmpty(s1))
        {
            zzb.zzaH("Could not parse the mediation config: Missing required ad_base_url field");
            return new AdResponseParcel(0);
        }
          goto _L12
_L5:
        s = jsonobject.optString("ad_html", null);
          goto _L13
_L9:
        if (!"landscape".equals(obj)) goto _L15; else goto _L14
_L14:
        j = zzp.zzbx().a();
          goto _L15
_L11:
        if (TextUtils.isEmpty(s2)) goto _L17; else goto _L16
_L16:
        obj = com.google.android.gms.internal.nj.a(adrequestinfoparcel, context, adrequestinfoparcel.zzqj.zzJu, s2, null, null, null);
        s1 = ((AdResponseParcel) (obj)).zzBF;
        s2 = ((AdResponseParcel) (obj)).body;
        l1 = ((AdResponseParcel) (obj)).zzEO;
_L49:
        obj1 = jsonobject.optJSONArray("click_urls");
        if (obj != null) goto _L19; else goto _L18
_L18:
        context = null;
_L27:
        if (obj1 == null) goto _L21; else goto _L20
_L20:
        s = context;
        if (context != null) goto _L23; else goto _L22
_L22:
        s = new LinkedList();
          goto _L23
_L26:
        if (k >= ((JSONArray) (obj1)).length()) goto _L25; else goto _L24
_L24:
        s.add(((JSONArray) (obj1)).getString(k));
        k++;
          goto _L26
_L17:
        adrequestinfoparcel = new StringBuilder("Could not parse the mediation config: Missing required ");
        if (flag)
        {
            context = "ad_json";
        } else
        {
            context = "ad_html";
        }
        zzb.zzaH(adrequestinfoparcel.append(context).append(" or ad_url field.").toString());
        context = new AdResponseParcel(0);
        return context;
_L19:
        context = ((AdResponseParcel) (obj)).zzyY;
          goto _L27
_L48:
        Object obj2 = jsonobject.optJSONArray("impression_urls");
        if (obj != null) goto _L29; else goto _L28
_L28:
        context = null;
_L37:
        if (obj2 == null) goto _L31; else goto _L30
_L30:
        s = context;
        if (context != null) goto _L33; else goto _L32
_L32:
        s = new LinkedList();
          goto _L33
_L36:
        if (k >= ((JSONArray) (obj2)).length()) goto _L35; else goto _L34
_L34:
        s.add(((JSONArray) (obj2)).getString(k));
        k++;
          goto _L36
_L29:
        context = ((AdResponseParcel) (obj)).zzyZ;
          goto _L37
_L47:
        JSONArray jsonarray = jsonobject.optJSONArray("manual_impression_urls");
        if (obj != null) goto _L39; else goto _L38
_L38:
        context = null;
_L45:
        if (jsonarray == null) goto _L41; else goto _L40
_L40:
        s = context;
        if (context != null) goto _L43; else goto _L42
_L42:
        s = new LinkedList();
          goto _L43
_L44:
        if (k >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_883;
        }
        s.add(jsonarray.getString(k));
        k++;
          goto _L44
_L39:
        context = ((AdResponseParcel) (obj)).zzEM;
          goto _L45
_L41:
        k = j;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_808;
        }
        if (((AdResponseParcel) (obj)).orientation != -1)
        {
            j = ((AdResponseParcel) (obj)).orientation;
        }
        k = j;
        if (((AdResponseParcel) (obj)).zzEJ <= 0L)
        {
            break MISSING_BLOCK_LABEL_808;
        }
        l = ((AdResponseParcel) (obj)).zzEJ;
_L46:
        obj = jsonobject.optString("active_view");
        s = null;
        boolean flag1 = jsonobject.optBoolean("ad_is_javascript", false);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_649;
        }
        s = jsonobject.optString("ad_passback_url", null);
        boolean flag2 = jsonobject.optBoolean("mediation", false);
        boolean flag3 = jsonobject.optBoolean("custom_render_allowed", false);
        boolean flag4 = jsonobject.optBoolean("content_url_opted_out", true);
        boolean flag5 = jsonobject.optBoolean("prefetch", false);
        k = jsonobject.optInt("oauth2_token_status", 0);
        long l2 = jsonobject.optLong("refresh_interval_milliseconds", -1L);
        long l3 = jsonobject.optLong("mediation_config_cache_time_milliseconds", -1L);
        String s5 = jsonobject.optString("gws_query_id", "");
        boolean flag6 = "height".equals(jsonobject.optString("fluid", ""));
        context = new AdResponseParcel(adrequestinfoparcel, s1, s2, ((List) (obj1)), ((List) (obj2)), l, flag2, l3, context, l2, j, s3, l1, s4, flag1, s, ((String) (obj)), flag3, flag, adrequestinfoparcel.zzEv, flag4, flag5, k, s5, flag6);
        return context;
        j = k;
          goto _L46
_L31:
        obj2 = context;
          goto _L47
_L21:
        obj1 = context;
          goto _L48
_L12:
        obj = null;
        s2 = s;
          goto _L49
_L2:
        flag = false;
          goto _L50
_L7:
        l = -1L;
          goto _L51
_L23:
        k = 0;
          goto _L26
_L25:
        obj1 = s;
          goto _L48
_L33:
        k = 0;
          goto _L36
_L35:
        obj2 = s;
          goto _L47
_L43:
        k = 0;
          goto _L44
        context = s;
          goto _L41
    }

    private static UsageInfo a(Context context, String s)
    {
        context = (new i(context)).a(e.b).b();
        context.b();
        s = (new a()).a().a(s).b();
        s = (com.google.android.gms.appdatasearch.GetRecentContextCall.Response)e.c.a(context, s).a(TimeUnit.SECONDS);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (s.a().e())
        {
            break MISSING_BLOCK_LABEL_86;
        }
        zzb.zzaG("Fail to obtain recent context call");
        context.c();
        return null;
        if (((com.google.android.gms.appdatasearch.GetRecentContextCall.Response) (s)).b != null && !((com.google.android.gms.appdatasearch.GetRecentContextCall.Response) (s)).b.isEmpty())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        zzb.zzaG("Fail to obtain recent context");
        context.c();
        return null;
        s = (UsageInfo)((com.google.android.gms.appdatasearch.GetRecentContextCall.Response) (s)).b.get(0);
        context.c();
        context = s;
_L1:
        return context;
        context;
        context = null;
_L4:
        zzb.zzaH("Fail to get recent context");
        if (context != null)
        {
            context.c();
            context = null;
        } else
        {
            context = null;
        }
          goto _L1
        s;
        context = null;
_L3:
        if (context != null)
        {
            context.c();
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L3; else goto _L2
_L2:
        s;
          goto _L4
    }

    private static Integer a(boolean flag)
    {
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        return Integer.valueOf(j);
    }

    private static String a(int j)
    {
        return String.format(Locale.US, "#%06x", new Object[] {
            Integer.valueOf(0xffffff & j)
        });
    }

    public static JSONObject a(Context context, AdRequestInfoParcel adrequestinfoparcel, ny ny1, cn cn1, String s, List list)
    {
        HashMap hashmap;
        int j;
        float f;
        AdRequestParcel adrequestparcel;
        AdSizeParcel aadsizeparcel[];
        Object obj;
        int k;
        int l;
        long l1;
        long l2;
        long l3;
        boolean flag;
        try
        {
            hashmap = new HashMap();
            if (list.size() > 0)
            {
                hashmap.put("eid", TextUtils.join(",", list));
            }
            if (adrequestinfoparcel.zzEm != null)
            {
                hashmap.put("ad_pos", adrequestinfoparcel.zzEm);
            }
            adrequestparcel = adrequestinfoparcel.zzEn;
            list = com.google.android.gms.internal.pi.a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzaH((new StringBuilder("Problem serializing ad request to JSON: ")).append(context.getMessage()).toString());
            return null;
        }
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        hashmap.put("abf", list);
        if (adrequestparcel.zzsB != -1L)
        {
            hashmap.put("cust_age", a.format(new Date(adrequestparcel.zzsB)));
        }
        if (adrequestparcel.extras != null)
        {
            hashmap.put("extras", adrequestparcel.extras);
        }
        if (adrequestparcel.zzsC != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(adrequestparcel.zzsC));
        }
        if (adrequestparcel.zzsD != null)
        {
            hashmap.put("kw", adrequestparcel.zzsD);
        }
        if (adrequestparcel.zzsF != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(adrequestparcel.zzsF));
        }
        if (adrequestparcel.zzsE)
        {
            hashmap.put("adtest", "on");
        }
        if (adrequestparcel.versionCode < 2) goto _L2; else goto _L1
_L1:
        if (adrequestparcel.zzsG)
        {
            hashmap.put("d_imp_hdr", Integer.valueOf(1));
        }
        if (!TextUtils.isEmpty(adrequestparcel.zzsH))
        {
            hashmap.put("ppid", adrequestparcel.zzsH);
        }
        if (adrequestparcel.zzsI == null) goto _L2; else goto _L3
_L3:
        obj = adrequestparcel.zzsI;
        if (Color.alpha(((SearchAdRequestParcel) (obj)).zztP) != 0)
        {
            hashmap.put("acolor", a(((SearchAdRequestParcel) (obj)).zztP));
        }
        if (Color.alpha(((SearchAdRequestParcel) (obj)).backgroundColor) != 0)
        {
            hashmap.put("bgcolor", a(((SearchAdRequestParcel) (obj)).backgroundColor));
        }
        if (Color.alpha(((SearchAdRequestParcel) (obj)).zztQ) != 0 && Color.alpha(((SearchAdRequestParcel) (obj)).zztR) != 0)
        {
            hashmap.put("gradientto", a(((SearchAdRequestParcel) (obj)).zztQ));
            hashmap.put("gradientfrom", a(((SearchAdRequestParcel) (obj)).zztR));
        }
        if (Color.alpha(((SearchAdRequestParcel) (obj)).zztS) != 0)
        {
            hashmap.put("bcolor", a(((SearchAdRequestParcel) (obj)).zztS));
        }
        hashmap.put("bthick", Integer.toString(((SearchAdRequestParcel) (obj)).zztT));
        ((SearchAdRequestParcel) (obj)).zztU;
        JVM INSTR tableswitch 0 3: default 2557
    //                   0 2569
    //                   1 2577
    //                   2 2585
    //                   3 2593;
           goto _L4 _L5 _L6 _L7 _L8
_L58:
        if (list == null) goto _L10; else goto _L9
_L9:
        hashmap.put("btype", list);
_L10:
        ((SearchAdRequestParcel) (obj)).zztV;
        JVM INSTR tableswitch 0 2: default 2563
    //                   0 2609
    //                   1 2617
    //                   2 2601;
           goto _L11 _L12 _L13 _L14
_L59:
        if (list == null) goto _L16; else goto _L15
_L15:
        hashmap.put("callbuttoncolor", list);
_L16:
        if (((SearchAdRequestParcel) (obj)).zztW != null)
        {
            hashmap.put("channel", ((SearchAdRequestParcel) (obj)).zztW);
        }
        if (Color.alpha(((SearchAdRequestParcel) (obj)).zztX) != 0)
        {
            hashmap.put("dcolor", a(((SearchAdRequestParcel) (obj)).zztX));
        }
        if (((SearchAdRequestParcel) (obj)).zztY != null)
        {
            hashmap.put("font", ((SearchAdRequestParcel) (obj)).zztY);
        }
        if (Color.alpha(((SearchAdRequestParcel) (obj)).zztZ) != 0)
        {
            hashmap.put("hcolor", a(((SearchAdRequestParcel) (obj)).zztZ));
        }
        hashmap.put("headersize", Integer.toString(((SearchAdRequestParcel) (obj)).zzua));
        if (((SearchAdRequestParcel) (obj)).zzub != null)
        {
            hashmap.put("q", ((SearchAdRequestParcel) (obj)).zzub);
        }
_L2:
        if (adrequestparcel.versionCode >= 3 && adrequestparcel.zzsK != null)
        {
            hashmap.put("url", adrequestparcel.zzsK);
        }
        if (adrequestparcel.versionCode >= 5)
        {
            if (adrequestparcel.zzsM != null)
            {
                hashmap.put("custom_targeting", adrequestparcel.zzsM);
            }
            if (adrequestparcel.zzsN != null)
            {
                hashmap.put("category_exclusions", adrequestparcel.zzsN);
            }
            if (adrequestparcel.zzsO != null)
            {
                hashmap.put("request_agent", adrequestparcel.zzsO);
            }
        }
        if (adrequestparcel.versionCode >= 6 && adrequestparcel.zzsP != null)
        {
            hashmap.put("request_pkg", adrequestparcel.zzsP);
        }
        hashmap.put("format", adrequestinfoparcel.zzqn.zzte);
        if (adrequestinfoparcel.zzqn.width == -1)
        {
            hashmap.put("smart_w", "full");
        }
        if (adrequestinfoparcel.zzqn.height == -2)
        {
            hashmap.put("smart_h", "auto");
        }
        if (adrequestinfoparcel.zzqn.zzti)
        {
            hashmap.put("fluid", "height");
        }
        if (adrequestinfoparcel.zzqn.zztg == null) goto _L18; else goto _L17
_L17:
        list = new StringBuilder();
        aadsizeparcel = adrequestinfoparcel.zzqn.zztg;
        l = aadsizeparcel.length;
        j = 0;
_L25:
        if (j >= l) goto _L20; else goto _L19
_L19:
        obj = aadsizeparcel[j];
        if (list.length() != 0)
        {
            list.append("|");
        }
        if (((AdSizeParcel) (obj)).width != -1) goto _L22; else goto _L21
_L21:
        k = (int)((float)((AdSizeParcel) (obj)).widthPixels / ny1.r);
_L26:
        list.append(k);
        list.append("x");
        if (((AdSizeParcel) (obj)).height != -2) goto _L24; else goto _L23
_L23:
        k = (int)((float)((AdSizeParcel) (obj)).heightPixels / ny1.r);
_L27:
        list.append(k);
        j++;
          goto _L25
_L22:
        k = ((AdSizeParcel) (obj)).width;
          goto _L26
_L24:
        k = ((AdSizeParcel) (obj)).height;
          goto _L27
_L20:
        hashmap.put("sz", list);
_L18:
        if (adrequestinfoparcel.zzEt == 0) goto _L29; else goto _L28
_L28:
        hashmap.put("native_version", Integer.valueOf(adrequestinfoparcel.zzEt));
        hashmap.put("native_templates", adrequestinfoparcel.zzqD);
        list = adrequestinfoparcel.zzqB;
        if (list == null) goto _L31; else goto _L30
_L30:
        j = ((NativeAdOptionsParcel) (list)).zzwS;
          goto _L32
_L64:
        hashmap.put("native_image_orientation", list);
        if (!adrequestinfoparcel.zzEE.isEmpty())
        {
            hashmap.put("native_custom_templates", adrequestinfoparcel.zzEE);
        }
_L29:
        hashmap.put("slotname", adrequestinfoparcel.zzqh);
        hashmap.put("pn", adrequestinfoparcel.applicationInfo.packageName);
        if (adrequestinfoparcel.zzEo != null)
        {
            hashmap.put("vc", Integer.valueOf(adrequestinfoparcel.zzEo.versionCode));
        }
        hashmap.put("ms", s);
        hashmap.put("seq_num", adrequestinfoparcel.zzEq);
        hashmap.put("session_id", adrequestinfoparcel.zzEr);
        hashmap.put("js", adrequestinfoparcel.zzqj.zzJu);
        hashmap.put("am", Integer.valueOf(ny1.a));
        hashmap.put("cog", a(ny1.b));
        hashmap.put("coh", a(ny1.c));
        if (!TextUtils.isEmpty(ny1.d))
        {
            hashmap.put("carrier", ny1.d);
        }
        hashmap.put("gl", ny1.e);
        if (ny1.f)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        if (ny1.g)
        {
            hashmap.put("is_sidewinder", Integer.valueOf(1));
        }
        hashmap.put("ma", a(ny1.h));
        hashmap.put("sp", a(ny1.i));
        hashmap.put("hl", ny1.j);
        if (!TextUtils.isEmpty(ny1.k))
        {
            hashmap.put("mv", ny1.k);
        }
        hashmap.put("muv", Integer.valueOf(ny1.l));
        if (ny1.m != -2)
        {
            hashmap.put("cnt", Integer.valueOf(ny1.m));
        }
        hashmap.put("gnt", Integer.valueOf(ny1.n));
        hashmap.put("pt", Integer.valueOf(ny1.o));
        hashmap.put("rm", Integer.valueOf(ny1.p));
        hashmap.put("riv", Integer.valueOf(ny1.q));
        s = new Bundle();
        s.putString("build", ny1.y);
        list = new Bundle();
        list.putBoolean("is_charging", ny1.v);
        list.putDouble("battery_level", ny1.u);
        s.putBundle("battery", list);
        list = new Bundle();
        list.putInt("active_network_state", ny1.x);
        list.putBoolean("active_network_metered", ny1.w);
        s.putBundle("network", list);
        hashmap.put("device", s);
        hashmap.put("fdz", Integer.valueOf(cn1.b()));
        hashmap.put("platform", Build.MANUFACTURER);
        hashmap.put("submodel", Build.MODEL);
        if (adrequestinfoparcel.zzEn.versionCode >= 2 && adrequestinfoparcel.zzEn.zzsJ != null)
        {
            cn1 = adrequestinfoparcel.zzEn.zzsJ;
            s = new HashMap();
            f = cn1.getAccuracy();
            l1 = cn1.getTime();
            l2 = (long)(cn1.getLatitude() * 10000000D);
            l3 = (long)(cn1.getLongitude() * 10000000D);
            s.put("radius", Float.valueOf(f * 1000F));
            s.put("lat", Long.valueOf(l2));
            s.put("long", Long.valueOf(l3));
            s.put("time", Long.valueOf(l1 * 1000L));
            hashmap.put("uule", s);
        }
        if (adrequestinfoparcel.versionCode >= 2)
        {
            hashmap.put("quality_signals", adrequestinfoparcel.zzEs);
        }
        if (adrequestinfoparcel.versionCode >= 4 && adrequestinfoparcel.zzEv)
        {
            hashmap.put("forceHttps", Boolean.valueOf(adrequestinfoparcel.zzEv));
        }
        if (adrequestinfoparcel.versionCode < 4 || adrequestinfoparcel.zzEu == null) goto _L34; else goto _L33
_L33:
        cn1 = adrequestinfoparcel.zzEu;
_L41:
        s = cy.P;
        if (((Boolean)zzp.zzbE().a(s)).booleanValue()) goto _L36; else goto _L35
_L35:
        zzb.zzaG("App index is not enabled");
_L44:
        hashmap.put("content_info", cn1);
        if (adrequestinfoparcel.versionCode < 5) goto _L38; else goto _L37
_L37:
        hashmap.put("u_sd", Float.valueOf(adrequestinfoparcel.zzEz));
        hashmap.put("sh", Integer.valueOf(adrequestinfoparcel.zzEy));
        hashmap.put("sw", Integer.valueOf(adrequestinfoparcel.zzEx));
_L56:
        if (adrequestinfoparcel.versionCode < 6) goto _L40; else goto _L39
_L39:
        flag = TextUtils.isEmpty(adrequestinfoparcel.zzEA);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2115;
        }
        hashmap.put("view_hierarchy", new JSONObject(adrequestinfoparcel.zzEA));
_L57:
        hashmap.put("correlation_id", Long.valueOf(adrequestinfoparcel.zzEB));
_L40:
        if (adrequestinfoparcel.versionCode >= 7)
        {
            hashmap.put("request_id", adrequestinfoparcel.zzEC);
        }
        if (adrequestinfoparcel.versionCode >= 11 && adrequestinfoparcel.zzEG != null)
        {
            hashmap.put("capability", adrequestinfoparcel.zzEG.toBundle());
        }
        if (adrequestinfoparcel.versionCode >= 12 && !TextUtils.isEmpty(adrequestinfoparcel.zzEH))
        {
            hashmap.put("anchor", adrequestinfoparcel.zzEH);
        }
        if (zzb.zzN(2))
        {
            context = zzp.zzbv().a(hashmap).toString(2);
            zzb.v((new StringBuilder("Ad Request JSON: ")).append(context).toString());
        }
        return zzp.zzbv().a(hashmap);
_L34:
        cn1 = new Bundle();
          goto _L41
_L36:
        if (com.google.android.gms.internal.wf.a()) goto _L43; else goto _L42
_L42:
        zzb.zzaG("Not on service, return");
          goto _L44
_L43:
        if (!zzl.zzcF().zzgT()) goto _L46; else goto _L45
_L45:
        zzb.zzaG("Cannot invoked on UI thread");
          goto _L44
_L46:
        if (adrequestinfoparcel == null) goto _L48; else goto _L47
_L47:
        if (adrequestinfoparcel.zzEo != null) goto _L49; else goto _L48
_L48:
        zzb.zzaH("Invalid ad request info");
          goto _L44
_L49:
        s = adrequestinfoparcel.zzEo.packageName;
        if (!TextUtils.isEmpty(s)) goto _L51; else goto _L50
_L50:
        zzb.zzaH("Fail to get package name");
          goto _L44
_L51:
        context = a(context, s);
        if (context == null) goto _L44; else goto _L52
_L52:
        if (context.a() == null) goto _L44; else goto _L53
_L53:
        context = context.a();
        list = context.a();
        if (!TextUtils.isEmpty(list))
        {
            cn1.putString("web_url", list);
        }
        context = context.a("intent_data");
        if (context == null) goto _L44; else goto _L54
_L54:
        if (TextUtils.isEmpty(((DocumentSection) (context)).c)) goto _L44; else goto _L55
_L55:
        cn1.putString("app_uri", com.google.android.gms.a.a.a(s, Uri.parse(((DocumentSection) (context)).c)).toString());
          goto _L44
        context;
        zzb.zzaH("Failed to parse the third-party Android App URI");
          goto _L44
        context;
        zzb.zzaG("Fail to add app index to content info");
          goto _L44
_L38:
        hashmap.put("u_sd", Float.valueOf(ny1.r));
        hashmap.put("sh", Integer.valueOf(ny1.t));
        hashmap.put("sw", Integer.valueOf(ny1.s));
          goto _L56
        context;
        zzb.zzd("Problem serializing view hierarchy to JSON", context);
          goto _L57
_L4:
        list = null;
          goto _L58
_L11:
        list = null;
          goto _L59
_L5:
        list = "none";
          goto _L58
_L6:
        list = "dashed";
          goto _L58
_L7:
        list = "dotted";
          goto _L58
_L8:
        list = "solid";
          goto _L58
_L14:
        list = "dark";
          goto _L59
_L12:
        list = "light";
          goto _L59
_L13:
        list = "medium";
          goto _L59
_L32:
        j;
        JVM INSTR tableswitch 1 2: default 2648
    //                   1 2662
    //                   2 2669;
           goto _L60 _L61 _L62
_L66:
        if (true) goto _L64; else goto _L63
_L63:
_L68:
        if (true) goto _L66; else goto _L65
_L65:
_L70:
        if (true) goto _L68; else goto _L67
_L67:
_L72:
        if (true) goto _L70; else goto _L69
_L69:
_L74:
        if (true) goto _L72; else goto _L71
_L71:
_L76:
        if (true) goto _L74; else goto _L73
_L73:
_L78:
        if (true) goto _L76; else goto _L75
_L75:
        if (true) goto _L78; else goto _L77
_L77:
_L60:
        list = "any";
          goto _L64
_L31:
        j = 0;
          goto _L32
_L61:
        list = "portrait";
          goto _L64
_L62:
        list = "landscape";
          goto _L64
    }

    static 
    {
        a = new SimpleDateFormat("yyyyMMdd", Locale.US);
    }
}
