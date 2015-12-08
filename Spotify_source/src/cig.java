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
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
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

public final class cig
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
        int i;
        int j;
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
            bka.e((new StringBuilder("Could not parse the mediation config: ")).append(context.getMessage()).toString());
            return new AdResponseParcel(0);
        }
        if (adrequestinfoparcel == null) goto _L2; else goto _L1
_L1:
        if (adrequestinfoparcel.m == 0) goto _L2; else goto _L3
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
        i = -1;
        if (!"portrait".equals(obj)) goto _L9; else goto _L8
_L8:
        i = bkv.g().b();
_L15:
        if (TextUtils.isEmpty(s)) goto _L11; else goto _L10
_L10:
        if (TextUtils.isEmpty(s1))
        {
            bka.e("Could not parse the mediation config: Missing required ad_base_url field");
            return new AdResponseParcel(0);
        }
          goto _L12
_L5:
        s = jsonobject.optString("ad_html", null);
          goto _L13
_L9:
        if (!"landscape".equals(obj)) goto _L15; else goto _L14
_L14:
        i = bkv.g().a();
          goto _L15
_L11:
        if (TextUtils.isEmpty(s2)) goto _L17; else goto _L16
_L16:
        obj = cif.a(adrequestinfoparcel, context, adrequestinfoparcel.k.b, s2, null, null, null);
        s1 = ((AdResponseParcel) (obj)).b;
        s2 = ((AdResponseParcel) (obj)).c;
        l1 = ((AdResponseParcel) (obj)).n;
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
        if (j >= ((JSONArray) (obj1)).length()) goto _L25; else goto _L24
_L24:
        s.add(((JSONArray) (obj1)).getString(j));
        j++;
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
        bka.e(adrequestinfoparcel.append(context).append(" or ad_url field.").toString());
        context = new AdResponseParcel(0);
        return context;
_L19:
        context = ((AdResponseParcel) (obj)).d;
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
        if (j >= ((JSONArray) (obj2)).length()) goto _L35; else goto _L34
_L34:
        s.add(((JSONArray) (obj2)).getString(j));
        j++;
          goto _L36
_L29:
        context = ((AdResponseParcel) (obj)).f;
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
        if (j >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_883;
        }
        s.add(jsonarray.getString(j));
        j++;
          goto _L44
_L39:
        context = ((AdResponseParcel) (obj)).j;
          goto _L45
_L41:
        j = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_808;
        }
        if (((AdResponseParcel) (obj)).l != -1)
        {
            i = ((AdResponseParcel) (obj)).l;
        }
        j = i;
        if (((AdResponseParcel) (obj)).g <= 0L)
        {
            break MISSING_BLOCK_LABEL_808;
        }
        l = ((AdResponseParcel) (obj)).g;
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
        j = jsonobject.optInt("oauth2_token_status", 0);
        long l2 = jsonobject.optLong("refresh_interval_milliseconds", -1L);
        long l3 = jsonobject.optLong("mediation_config_cache_time_milliseconds", -1L);
        String s5 = jsonobject.optString("gws_query_id", "");
        boolean flag6 = "height".equals(jsonobject.optString("fluid", ""));
        context = new AdResponseParcel(adrequestinfoparcel, s1, s2, ((List) (obj1)), ((List) (obj2)), l, flag2, l3, context, l2, i, s3, l1, s4, flag1, s, ((String) (obj)), flag3, flag, adrequestinfoparcel.p, flag4, flag5, j, s5, flag6);
        return context;
        i = j;
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
        j = 0;
          goto _L26
_L25:
        obj1 = s;
          goto _L48
_L33:
        j = 0;
          goto _L36
_L35:
        obj2 = s;
          goto _L47
_L43:
        j = 0;
          goto _L44
        context = s;
          goto _L41
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

    public static JSONObject a(AdRequestInfoParcel adrequestinfoparcel, cik cik1, cau cau1, String s, List list)
    {
        HashMap hashmap;
        int i;
        float f;
        AdRequestParcel adrequestparcel;
        AdSizeParcel aadsizeparcel[];
        Object obj;
        int j;
        int k;
        long l;
        long l1;
        long l2;
        boolean flag;
        try
        {
            hashmap = new HashMap();
            if (list.size() > 0)
            {
                hashmap.put("eid", TextUtils.join(",", list));
            }
            if (adrequestinfoparcel.b != null)
            {
                hashmap.put("ad_pos", adrequestinfoparcel.b);
            }
            adrequestparcel = adrequestinfoparcel.c;
            list = cjb.a();
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            bka.e((new StringBuilder("Problem serializing ad request to JSON: ")).append(adrequestinfoparcel.getMessage()).toString());
            return null;
        }
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        hashmap.put("abf", list);
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
        if (adrequestparcel.a < 2) goto _L2; else goto _L1
_L1:
        if (adrequestparcel.h)
        {
            hashmap.put("d_imp_hdr", Integer.valueOf(1));
        }
        if (!TextUtils.isEmpty(adrequestparcel.i))
        {
            hashmap.put("ppid", adrequestparcel.i);
        }
        if (adrequestparcel.j == null) goto _L2; else goto _L3
_L3:
        obj = adrequestparcel.j;
        if (Color.alpha(((SearchAdRequestParcel) (obj)).b) != 0)
        {
            hashmap.put("acolor", a(((SearchAdRequestParcel) (obj)).b));
        }
        if (Color.alpha(((SearchAdRequestParcel) (obj)).c) != 0)
        {
            hashmap.put("bgcolor", a(((SearchAdRequestParcel) (obj)).c));
        }
        if (Color.alpha(((SearchAdRequestParcel) (obj)).d) != 0 && Color.alpha(((SearchAdRequestParcel) (obj)).e) != 0)
        {
            hashmap.put("gradientto", a(((SearchAdRequestParcel) (obj)).d));
            hashmap.put("gradientfrom", a(((SearchAdRequestParcel) (obj)).e));
        }
        if (Color.alpha(((SearchAdRequestParcel) (obj)).f) != 0)
        {
            hashmap.put("bcolor", a(((SearchAdRequestParcel) (obj)).f));
        }
        hashmap.put("bthick", Integer.toString(((SearchAdRequestParcel) (obj)).g));
        ((SearchAdRequestParcel) (obj)).h;
        JVM INSTR tableswitch 0 3: default 2389
    //                   0 2401
    //                   1 2409
    //                   2 2417
    //                   3 2425;
           goto _L4 _L5 _L6 _L7 _L8
_L45:
        if (list == null) goto _L10; else goto _L9
_L9:
        hashmap.put("btype", list);
_L10:
        ((SearchAdRequestParcel) (obj)).i;
        JVM INSTR tableswitch 0 2: default 2395
    //                   0 2441
    //                   1 2449
    //                   2 2433;
           goto _L11 _L12 _L13 _L14
_L46:
        if (list == null) goto _L16; else goto _L15
_L15:
        hashmap.put("callbuttoncolor", list);
_L16:
        if (((SearchAdRequestParcel) (obj)).j != null)
        {
            hashmap.put("channel", ((SearchAdRequestParcel) (obj)).j);
        }
        if (Color.alpha(((SearchAdRequestParcel) (obj)).k) != 0)
        {
            hashmap.put("dcolor", a(((SearchAdRequestParcel) (obj)).k));
        }
        if (((SearchAdRequestParcel) (obj)).l != null)
        {
            hashmap.put("font", ((SearchAdRequestParcel) (obj)).l);
        }
        if (Color.alpha(((SearchAdRequestParcel) (obj)).m) != 0)
        {
            hashmap.put("hcolor", a(((SearchAdRequestParcel) (obj)).m));
        }
        hashmap.put("headersize", Integer.toString(((SearchAdRequestParcel) (obj)).n));
        if (((SearchAdRequestParcel) (obj)).o != null)
        {
            hashmap.put("q", ((SearchAdRequestParcel) (obj)).o);
        }
_L2:
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
        if (adrequestparcel.a >= 6 && adrequestparcel.q != null)
        {
            hashmap.put("request_pkg", adrequestparcel.q);
        }
        hashmap.put("format", adrequestinfoparcel.d.b);
        if (adrequestinfoparcel.d.f == -1)
        {
            hashmap.put("smart_w", "full");
        }
        if (adrequestinfoparcel.d.c == -2)
        {
            hashmap.put("smart_h", "auto");
        }
        if (adrequestinfoparcel.d.j)
        {
            hashmap.put("fluid", "height");
        }
        if (adrequestinfoparcel.d.h == null) goto _L18; else goto _L17
_L17:
        list = new StringBuilder();
        aadsizeparcel = adrequestinfoparcel.d.h;
        k = aadsizeparcel.length;
        i = 0;
_L25:
        if (i >= k) goto _L20; else goto _L19
_L19:
        obj = aadsizeparcel[i];
        if (list.length() != 0)
        {
            list.append("|");
        }
        if (((AdSizeParcel) (obj)).f != -1) goto _L22; else goto _L21
_L21:
        j = (int)((float)((AdSizeParcel) (obj)).g / cik1.r);
_L26:
        list.append(j);
        list.append("x");
        if (((AdSizeParcel) (obj)).c != -2) goto _L24; else goto _L23
_L23:
        j = (int)((float)((AdSizeParcel) (obj)).d / cik1.r);
_L27:
        list.append(j);
        i++;
          goto _L25
_L22:
        j = ((AdSizeParcel) (obj)).f;
          goto _L26
_L24:
        j = ((AdSizeParcel) (obj)).c;
          goto _L27
_L20:
        hashmap.put("sz", list);
_L18:
        if (adrequestinfoparcel.m == 0) goto _L29; else goto _L28
_L28:
        hashmap.put("native_version", Integer.valueOf(adrequestinfoparcel.m));
        hashmap.put("native_templates", adrequestinfoparcel.n);
        list = adrequestinfoparcel.z;
        if (list == null) goto _L31; else goto _L30
_L30:
        i = ((NativeAdOptionsParcel) (list)).c;
          goto _L32
_L51:
        hashmap.put("native_image_orientation", list);
        if (!adrequestinfoparcel.A.isEmpty())
        {
            hashmap.put("native_custom_templates", adrequestinfoparcel.A);
        }
_L29:
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
        hashmap.put("am", Integer.valueOf(cik1.a));
        hashmap.put("cog", a(cik1.b));
        hashmap.put("coh", a(cik1.c));
        if (!TextUtils.isEmpty(cik1.d))
        {
            hashmap.put("carrier", cik1.d);
        }
        hashmap.put("gl", cik1.e);
        if (cik1.f)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        if (cik1.g)
        {
            hashmap.put("is_sidewinder", Integer.valueOf(1));
        }
        hashmap.put("ma", a(cik1.h));
        hashmap.put("sp", a(cik1.i));
        hashmap.put("hl", cik1.j);
        if (!TextUtils.isEmpty(cik1.k))
        {
            hashmap.put("mv", cik1.k);
        }
        hashmap.put("muv", Integer.valueOf(cik1.l));
        if (cik1.m != -2)
        {
            hashmap.put("cnt", Integer.valueOf(cik1.m));
        }
        hashmap.put("gnt", Integer.valueOf(cik1.n));
        hashmap.put("pt", Integer.valueOf(cik1.o));
        hashmap.put("rm", Integer.valueOf(cik1.p));
        hashmap.put("riv", Integer.valueOf(cik1.q));
        s = new Bundle();
        s.putString("build", cik1.y);
        list = new Bundle();
        list.putBoolean("is_charging", cik1.v);
        list.putDouble("battery_level", cik1.u);
        s.putBundle("battery", list);
        list = new Bundle();
        list.putInt("active_network_state", cik1.x);
        list.putBoolean("active_network_metered", cik1.w);
        s.putBundle("network", list);
        hashmap.put("device", s);
        hashmap.put("fdz", Integer.valueOf(cau1.b));
        hashmap.put("platform", Build.MANUFACTURER);
        hashmap.put("submodel", Build.MODEL);
        if (adrequestinfoparcel.c.a >= 2 && adrequestinfoparcel.c.k != null)
        {
            cau1 = adrequestinfoparcel.c.k;
            s = new HashMap();
            f = cau1.getAccuracy();
            l = cau1.getTime();
            l1 = (long)(cau1.getLatitude() * 10000000D);
            l2 = (long)(cau1.getLongitude() * 10000000D);
            s.put("radius", Float.valueOf(f * 1000F));
            s.put("lat", Long.valueOf(l1));
            s.put("long", Long.valueOf(l2));
            s.put("time", Long.valueOf(l * 1000L));
            hashmap.put("uule", s);
        }
        if (adrequestinfoparcel.a >= 2)
        {
            hashmap.put("quality_signals", adrequestinfoparcel.l);
        }
        if (adrequestinfoparcel.a >= 4 && adrequestinfoparcel.p)
        {
            hashmap.put("forceHttps", Boolean.valueOf(adrequestinfoparcel.p));
        }
        if (adrequestinfoparcel.a < 4 || adrequestinfoparcel.o == null) goto _L34; else goto _L33
_L33:
        cau1 = adrequestinfoparcel.o;
_L41:
        s = cbb.D;
        if (((Boolean)bkv.n().a(s)).booleanValue()) goto _L36; else goto _L35
_L35:
        bka.c("App index is not enabled");
_L42:
        hashmap.put("content_info", cau1);
        if (adrequestinfoparcel.a < 5) goto _L38; else goto _L37
_L37:
        hashmap.put("u_sd", Float.valueOf(adrequestinfoparcel.t));
        hashmap.put("sh", Integer.valueOf(adrequestinfoparcel.s));
        hashmap.put("sw", Integer.valueOf(adrequestinfoparcel.r));
_L43:
        if (adrequestinfoparcel.a < 6) goto _L40; else goto _L39
_L39:
        flag = TextUtils.isEmpty(adrequestinfoparcel.u);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2101;
        }
        hashmap.put("view_hierarchy", new JSONObject(adrequestinfoparcel.u));
_L44:
        hashmap.put("correlation_id", Long.valueOf(adrequestinfoparcel.v));
_L40:
        if (adrequestinfoparcel.a >= 7)
        {
            hashmap.put("request_id", adrequestinfoparcel.w);
        }
        if (adrequestinfoparcel.a >= 11 && adrequestinfoparcel.C != null)
        {
            cik1 = adrequestinfoparcel.C;
            cau1 = new Bundle();
            cau1.putBoolean("iap_supported", ((CapabilityParcel) (cik1)).b);
            cau1.putBoolean("default_iap_supported", ((CapabilityParcel) (cik1)).c);
            hashmap.put("capability", cau1);
        }
        if (adrequestinfoparcel.a >= 12 && !TextUtils.isEmpty(adrequestinfoparcel.D))
        {
            hashmap.put("anchor", adrequestinfoparcel.D);
        }
        if (bka.a(2))
        {
            adrequestinfoparcel = bkv.e().a(hashmap).toString(2);
            bka.d((new StringBuilder("Ad Request JSON: ")).append(adrequestinfoparcel).toString());
        }
        return bkv.e().a(hashmap);
_L34:
        cau1 = new Bundle();
          goto _L41
_L36:
        bka.c("Not on service, return");
          goto _L42
_L38:
        hashmap.put("u_sd", Float.valueOf(cik1.r));
        hashmap.put("sh", Integer.valueOf(cik1.t));
        hashmap.put("sw", Integer.valueOf(cik1.s));
          goto _L43
        cik1;
        bka.c("Problem serializing view hierarchy to JSON", cik1);
          goto _L44
_L4:
        list = null;
          goto _L45
_L11:
        list = null;
          goto _L46
_L5:
        list = "none";
          goto _L45
_L6:
        list = "dashed";
          goto _L45
_L7:
        list = "dotted";
          goto _L45
_L8:
        list = "solid";
          goto _L45
_L14:
        list = "dark";
          goto _L46
_L12:
        list = "light";
          goto _L46
_L13:
        list = "medium";
          goto _L46
_L32:
        i;
        JVM INSTR tableswitch 1 2: default 2480
    //                   1 2494
    //                   2 2501;
           goto _L47 _L48 _L49
_L53:
        if (true) goto _L51; else goto _L50
_L50:
_L55:
        if (true) goto _L53; else goto _L52
_L52:
_L57:
        if (true) goto _L55; else goto _L54
_L54:
_L59:
        if (true) goto _L57; else goto _L56
_L56:
_L61:
        if (true) goto _L59; else goto _L58
_L58:
_L63:
        if (true) goto _L61; else goto _L60
_L60:
_L65:
        if (true) goto _L63; else goto _L62
_L62:
        if (true) goto _L65; else goto _L64
_L64:
_L47:
        list = "any";
          goto _L51
_L31:
        i = 0;
          goto _L32
_L48:
        list = "portrait";
          goto _L51
_L49:
        list = "landscape";
          goto _L51
    }

    static 
    {
        a = new SimpleDateFormat("yyyyMMdd", Locale.US);
    }
}
