// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ahq
{

    private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd");

    public static AdResponseParcel a(Context context, AdRequestInfoParcel adrequestinfoparcel, String s)
    {
        String s1;
        String s2;
        Object obj;
        JSONObject jsonobject;
        String s3;
        String s4;
        int i;
        int k;
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
            of.e((new StringBuilder("Could not parse the mediation config: ")).append(context.getMessage()).toString());
            return new AdResponseParcel(0);
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
        i = ot.g().b();
_L7:
        if (TextUtils.isEmpty(s2))
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s1))
        {
            of.e("Could not parse the mediation config: Missing required ad_base_url field");
            return new AdResponseParcel(0);
        }
          goto _L5
_L4:
        if ("landscape".equals(obj))
        {
            i = ot.g().a();
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (TextUtils.isEmpty(s)) goto _L9; else goto _L8
_L8:
        obj = ahp.a(adrequestinfoparcel, context, adrequestinfoparcel.k.b, s, null);
        s1 = ((AdResponseParcel) (obj)).b;
        s2 = ((AdResponseParcel) (obj)).c;
        l1 = ((AdResponseParcel) (obj)).n;
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
        if (k >= jsonarray.length()) goto _L17; else goto _L16
_L16:
        s.add(jsonarray.getString(k));
        k++;
          goto _L18
_L9:
        of.e("Could not parse the mediation config: Missing required ad_html or ad_url field.");
        context = new AdResponseParcel(0);
        return context;
_L11:
        context = ((AdResponseParcel) (obj)).d;
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
        if (k >= ((JSONArray) (obj2)).length()) goto _L27; else goto _L26
_L26:
        s.add(((JSONArray) (obj2)).getString(k));
        k++;
          goto _L28
_L21:
        context = ((AdResponseParcel) (obj)).f;
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
        if (k >= jsonarray1.length())
        {
            break MISSING_BLOCK_LABEL_785;
        }
        s.add(jsonarray1.getString(k));
        k++;
          goto _L36
_L31:
        context = ((AdResponseParcel) (obj)).j;
          goto _L37
_L33:
        long l2;
        l2 = l;
        k = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_557;
        }
        if (((AdResponseParcel) (obj)).l != -1)
        {
            i = ((AdResponseParcel) (obj)).l;
        }
        l2 = l;
        k = i;
        if (((AdResponseParcel) (obj)).g <= 0L)
        {
            break MISSING_BLOCK_LABEL_557;
        }
        l2 = ((AdResponseParcel) (obj)).g;
        k = i;
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
        boolean flag4 = jsonobject.optBoolean("content_url_opted_out", true);
        boolean flag5 = jsonobject.optBoolean("prefetch", false);
        int j = jsonobject.optInt("oauth2_token_status", 0);
        l = jsonobject.optLong("refresh_interval_milliseconds", -1L);
        context = new AdResponseParcel(adrequestinfoparcel, s1, s2, ((List) (obj1)), ((List) (obj2)), l2, flag1, jsonobject.optLong("mediation_config_cache_time_milliseconds", -1L), context, l, k, s3, l1, s4, flag, s, ((String) (obj)), flag2, flag3, adrequestinfoparcel.p, flag4, flag5, j);
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
        k = 0;
          goto _L18
_L17:
        obj1 = s;
          goto _L39
_L25:
        k = 0;
          goto _L28
_L27:
        obj2 = s;
          goto _L38
_L35:
        k = 0;
          goto _L36
        context = s;
          goto _L33
    }

    private static Integer a(boolean flag)
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

    private static String a(int i)
    {
        return String.format(Locale.US, "#%06x", new Object[] {
            Integer.valueOf(0xffffff & i)
        });
    }

    public static JSONObject a(AdRequestInfoParcel adrequestinfoparcel, ahu ahu1, abf abf1, String s, List list)
    {
        HashMap hashmap;
        AdSizeParcel aadsizeparcel[];
        int k;
        hashmap = new HashMap();
        if (list.size() > 0)
        {
            hashmap.put("eid", TextUtils.join(",", list));
        }
        if (adrequestinfoparcel.b != null)
        {
            hashmap.put("ad_pos", adrequestinfoparcel.b);
        }
        a(hashmap, adrequestinfoparcel.c);
        hashmap.put("format", adrequestinfoparcel.d.b);
        if (adrequestinfoparcel.d.f == -1)
        {
            hashmap.put("smart_w", "full");
        }
        if (adrequestinfoparcel.d.c == -2)
        {
            hashmap.put("smart_h", "auto");
        }
        if (adrequestinfoparcel.d.h == null)
        {
            break MISSING_BLOCK_LABEL_307;
        }
        list = new StringBuilder();
        aadsizeparcel = adrequestinfoparcel.d.h;
        k = aadsizeparcel.length;
        int i = 0;
_L3:
        AdSizeParcel adsizeparcel;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        adsizeparcel = aadsizeparcel[i];
        if (list.length() != 0)
        {
            list.append("|");
        }
        if (adsizeparcel.f != -1) goto _L2; else goto _L1
_L1:
        int j = (int)((float)adsizeparcel.g / ahu1.q);
_L4:
        list.append(j);
        list.append("x");
        if (adsizeparcel.c != -2)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        j = (int)((float)adsizeparcel.d / ahu1.q);
_L5:
        list.append(j);
        i++;
          goto _L3
_L2:
        boolean flag;
        try
        {
            j = adsizeparcel.f;
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            of.e((new StringBuilder("Problem serializing ad request to JSON: ")).append(adrequestinfoparcel.getMessage()).toString());
            return null;
        }
          goto _L4
        j = adsizeparcel.c;
          goto _L5
        hashmap.put("sz", list);
        if (adrequestinfoparcel.m != 0)
        {
            hashmap.put("native_version", Integer.valueOf(adrequestinfoparcel.m));
            hashmap.put("native_templates", adrequestinfoparcel.n);
        }
        hashmap.put("slotname", adrequestinfoparcel.e);
        hashmap.put("pn", adrequestinfoparcel.f.packageName);
        if (adrequestinfoparcel.g != null)
        {
            hashmap.put("vc", Integer.valueOf(adrequestinfoparcel.g.versionCode));
        }
        hashmap.put("ms", s);
        hashmap.put("seq_num", adrequestinfoparcel.i);
        hashmap.put("session_id", adrequestinfoparcel.j);
        hashmap.put("js", adrequestinfoparcel.k.b);
        a(hashmap, ahu1);
        hashmap.put("fdz", new Integer(abf1.b()));
        hashmap.put("platform", Build.MANUFACTURER);
        hashmap.put("submodel", Build.MODEL);
        if (adrequestinfoparcel.c.a >= 2 && adrequestinfoparcel.c.k != null)
        {
            a(hashmap, adrequestinfoparcel.c.k);
        }
        if (adrequestinfoparcel.a >= 2)
        {
            hashmap.put("quality_signals", adrequestinfoparcel.l);
        }
        if (adrequestinfoparcel.a >= 4 && adrequestinfoparcel.p)
        {
            hashmap.put("forceHttps", Boolean.valueOf(adrequestinfoparcel.p));
        }
        if (adrequestinfoparcel.a >= 4 && adrequestinfoparcel.o != null)
        {
            hashmap.put("content_info", adrequestinfoparcel.o);
        }
        if (adrequestinfoparcel.a < 5) goto _L7; else goto _L6
_L6:
        hashmap.put("u_sd", Float.valueOf(adrequestinfoparcel.t));
        hashmap.put("sh", Integer.valueOf(adrequestinfoparcel.s));
        hashmap.put("sw", Integer.valueOf(adrequestinfoparcel.r));
_L10:
        if (adrequestinfoparcel.a < 6) goto _L9; else goto _L8
_L8:
        flag = TextUtils.isEmpty(adrequestinfoparcel.u);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_712;
        }
        hashmap.put("view_hierarchy", new JSONObject(adrequestinfoparcel.u));
_L11:
        if (((Boolean)abn.K.c()).booleanValue() && adrequestinfoparcel.v)
        {
            hashmap.put("ga_hid", Integer.valueOf(adrequestinfoparcel.w));
            hashmap.put("ga_cid", adrequestinfoparcel.x);
        }
        hashmap.put("correlation_id", Long.valueOf(adrequestinfoparcel.y));
_L9:
        if (adrequestinfoparcel.a >= 7)
        {
            hashmap.put("request_id", adrequestinfoparcel.z);
        }
        if (of.a(2))
        {
            adrequestinfoparcel = ot.e().a(hashmap).toString(2);
            of.d((new StringBuilder("Ad Request JSON: ")).append(adrequestinfoparcel).toString());
        }
        return ot.e().a(hashmap);
_L7:
        hashmap.put("u_sd", Float.valueOf(ahu1.q));
        hashmap.put("sh", Integer.valueOf(ahu1.s));
        hashmap.put("sw", Integer.valueOf(ahu1.r));
          goto _L10
        ahu1;
        of.d("Problem serializing view hierarchy to JSON", ahu1);
          goto _L11
    }

    private static void a(HashMap hashmap, ahu ahu1)
    {
        hashmap.put("am", Integer.valueOf(ahu1.a));
        hashmap.put("cog", a(ahu1.b));
        hashmap.put("coh", a(ahu1.c));
        if (!TextUtils.isEmpty(ahu1.d))
        {
            hashmap.put("carrier", ahu1.d);
        }
        hashmap.put("gl", ahu1.e);
        if (ahu1.f)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        hashmap.put("ma", a(ahu1.g));
        hashmap.put("sp", a(ahu1.h));
        hashmap.put("hl", ahu1.i);
        if (!TextUtils.isEmpty(ahu1.j))
        {
            hashmap.put("mv", ahu1.j);
        }
        hashmap.put("muv", Integer.valueOf(ahu1.k));
        if (ahu1.l != -2)
        {
            hashmap.put("cnt", Integer.valueOf(ahu1.l));
        }
        hashmap.put("gnt", Integer.valueOf(ahu1.m));
        hashmap.put("pt", Integer.valueOf(ahu1.n));
        hashmap.put("rm", Integer.valueOf(ahu1.o));
        hashmap.put("riv", Integer.valueOf(ahu1.p));
        Bundle bundle = new Bundle();
        bundle.putInt("active_network_state", ahu1.w);
        bundle.putBoolean("active_network_metered", ahu1.v);
        hashmap.put("connectivity", bundle);
        bundle = new Bundle();
        bundle.putBoolean("is_charging", ahu1.u);
        bundle.putDouble("battery_level", ahu1.t);
        hashmap.put("battery", bundle);
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

    private static void a(HashMap hashmap, AdRequestParcel adrequestparcel)
    {
        String s = aiv.a();
        if (s != null)
        {
            hashmap.put("abf", s);
        }
        if (adrequestparcel.b != -1L)
        {
            hashmap.put("cust_age", a.format(new Date(adrequestparcel.b)));
        }
        if (adrequestparcel.c != null)
        {
            hashmap.put("extras", adrequestparcel.c);
        }
        if (adrequestparcel.d != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(adrequestparcel.d));
        }
        if (adrequestparcel.e != null)
        {
            hashmap.put("kw", adrequestparcel.e);
        }
        if (adrequestparcel.g != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(adrequestparcel.g));
        }
        if (adrequestparcel.f)
        {
            hashmap.put("adtest", "on");
        }
        if (adrequestparcel.a >= 2)
        {
            if (adrequestparcel.h)
            {
                hashmap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(adrequestparcel.i))
            {
                hashmap.put("ppid", adrequestparcel.i);
            }
            if (adrequestparcel.j != null)
            {
                a(hashmap, adrequestparcel.j);
            }
        }
        if (adrequestparcel.a >= 3 && adrequestparcel.l != null)
        {
            hashmap.put("url", adrequestparcel.l);
        }
        if (adrequestparcel.a >= 5)
        {
            if (adrequestparcel.n != null)
            {
                hashmap.put("custom_targeting", adrequestparcel.n);
            }
            if (adrequestparcel.o != null)
            {
                hashmap.put("category_exclusions", adrequestparcel.o);
            }
            if (adrequestparcel.p != null)
            {
                hashmap.put("request_agent", adrequestparcel.p);
            }
        }
    }

    private static void a(HashMap hashmap, SearchAdRequestParcel searchadrequestparcel)
    {
        Object obj;
        obj = null;
        if (Color.alpha(searchadrequestparcel.b) != 0)
        {
            hashmap.put("acolor", a(searchadrequestparcel.b));
        }
        if (Color.alpha(searchadrequestparcel.c) != 0)
        {
            hashmap.put("bgcolor", a(searchadrequestparcel.c));
        }
        if (Color.alpha(searchadrequestparcel.d) != 0 && Color.alpha(searchadrequestparcel.e) != 0)
        {
            hashmap.put("gradientto", a(searchadrequestparcel.d));
            hashmap.put("gradientfrom", a(searchadrequestparcel.e));
        }
        if (Color.alpha(searchadrequestparcel.f) != 0)
        {
            hashmap.put("bcolor", a(searchadrequestparcel.f));
        }
        hashmap.put("bthick", Integer.toString(searchadrequestparcel.g));
        searchadrequestparcel.h;
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
        searchadrequestparcel.i;
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
        if (searchadrequestparcel.j != null)
        {
            hashmap.put("channel", searchadrequestparcel.j);
        }
        if (Color.alpha(searchadrequestparcel.k) != 0)
        {
            hashmap.put("dcolor", a(searchadrequestparcel.k));
        }
        if (searchadrequestparcel.l != null)
        {
            hashmap.put("font", searchadrequestparcel.l);
        }
        if (Color.alpha(searchadrequestparcel.m) != 0)
        {
            hashmap.put("hcolor", a(searchadrequestparcel.m));
        }
        hashmap.put("headersize", Integer.toString(searchadrequestparcel.n));
        if (searchadrequestparcel.o != null)
        {
            hashmap.put("q", searchadrequestparcel.o);
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

}
