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
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.a;
import com.google.android.gms.appdatasearch.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.g;
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
//            gn, fn, gh, fs, 
//            ar, ay, ax, gm

public final class fo
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
        int l;
        long l1;
        long l2;
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
            b.c((new StringBuilder("Could not parse the mediation config: ")).append(context.getMessage()).toString());
            return new AdResponseParcel(0);
        }
        if (adrequestinfoparcel == null) goto _L2; else goto _L1
_L1:
        if (adrequestinfoparcel.m == 0) goto _L2; else goto _L3
_L3:
        flag = true;
_L49:
        if (!flag) goto _L5; else goto _L4
_L4:
        s = jsonobject.optString("ad_json", null);
_L13:
        l2 = -1L;
        s4 = jsonobject.optString("debug_dialog", null);
        if (!jsonobject.has("interstitial_timeout")) goto _L7; else goto _L6
_L6:
        l1 = (long)(jsonobject.getDouble("interstitial_timeout") * 1000D);
_L50:
        obj = jsonobject.optString("orientation", null);
        i = -1;
        if (!"portrait".equals(obj)) goto _L9; else goto _L8
_L8:
        i = p.g().b();
_L15:
        if (TextUtils.isEmpty(s)) goto _L11; else goto _L10
_L10:
        if (TextUtils.isEmpty(s1))
        {
            b.c("Could not parse the mediation config: Missing required ad_base_url field");
            return new AdResponseParcel(0);
        }
          goto _L12
_L5:
        s = jsonobject.optString("ad_html", null);
          goto _L13
_L9:
        if (!"landscape".equals(obj)) goto _L15; else goto _L14
_L14:
        i = p.g().a();
          goto _L15
_L11:
        if (TextUtils.isEmpty(s2)) goto _L17; else goto _L16
_L16:
        obj = com.google.android.gms.internal.fn.a(adrequestinfoparcel, context, adrequestinfoparcel.k.b, s2, null, null);
        s1 = ((AdResponseParcel) (obj)).b;
        s2 = ((AdResponseParcel) (obj)).c;
        l2 = ((AdResponseParcel) (obj)).n;
_L48:
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
        if (l >= ((JSONArray) (obj1)).length()) goto _L25; else goto _L24
_L24:
        s.add(((JSONArray) (obj1)).getString(l));
        l++;
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
        b.c(adrequestinfoparcel.append(context).append(" or ad_url field.").toString());
        context = new AdResponseParcel(0);
        return context;
_L19:
        context = ((AdResponseParcel) (obj)).d;
          goto _L27
_L47:
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
        if (l >= ((JSONArray) (obj2)).length()) goto _L35; else goto _L34
_L34:
        s.add(((JSONArray) (obj2)).getString(l));
        l++;
          goto _L36
_L29:
        context = ((AdResponseParcel) (obj)).f;
          goto _L37
_L46:
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
        if (l >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_852;
        }
        s.add(jsonarray.getString(l));
        l++;
          goto _L44
_L39:
        context = ((AdResponseParcel) (obj)).j;
          goto _L45
_L41:
        long l3;
        l3 = l1;
        l = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_625;
        }
        if (((AdResponseParcel) (obj)).l != -1)
        {
            i = ((AdResponseParcel) (obj)).l;
        }
        l3 = l1;
        l = i;
        if (((AdResponseParcel) (obj)).g <= 0L)
        {
            break MISSING_BLOCK_LABEL_625;
        }
        l3 = ((AdResponseParcel) (obj)).g;
        l = i;
        obj = jsonobject.optString("active_view");
        s = null;
        boolean flag1 = jsonobject.optBoolean("ad_is_javascript", false);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_660;
        }
        s = jsonobject.optString("ad_passback_url", null);
        boolean flag2 = jsonobject.optBoolean("mediation", false);
        boolean flag3 = jsonobject.optBoolean("custom_render_allowed", false);
        boolean flag4 = jsonobject.optBoolean("content_url_opted_out", true);
        boolean flag5 = jsonobject.optBoolean("prefetch", false);
        int j = jsonobject.optInt("oauth2_token_status", 0);
        l1 = jsonobject.optLong("refresh_interval_milliseconds", -1L);
        context = new AdResponseParcel(adrequestinfoparcel, s1, s2, ((List) (obj1)), ((List) (obj2)), l3, flag2, jsonobject.optLong("mediation_config_cache_time_milliseconds", -1L), context, l1, l, s3, l2, s4, flag1, s, ((String) (obj)), flag3, flag, adrequestinfoparcel.p, flag4, flag5, j);
        return context;
_L31:
        obj2 = context;
          goto _L46
_L21:
        obj1 = context;
          goto _L47
_L12:
        obj = null;
        s2 = s;
          goto _L48
_L2:
        flag = false;
          goto _L49
_L7:
        l1 = -1L;
          goto _L50
_L23:
        l = 0;
          goto _L26
_L25:
        obj1 = s;
          goto _L47
_L33:
        l = 0;
          goto _L36
_L35:
        obj2 = s;
          goto _L46
_L43:
        l = 0;
          goto _L44
        context = s;
          goto _L41
    }

    private static UsageInfo a(Context context, String s)
    {
        context = (new com.google.android.gms.common.api.c.a(context)).a(a.b).b();
        context.b();
        s = (new com.google.android.gms.appdatasearch.GetRecentContextCall.Request.a()).a().a(s).b();
        s = (com.google.android.gms.appdatasearch.GetRecentContextCall.Response)a.c.a(context, s).a(TimeUnit.SECONDS);
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.getStatus().d()) goto _L3; else goto _L2
_L2:
        b.b("Fail to obtain recent context call");
        if (context != null)
        {
            context.c();
        }
_L5:
        return null;
_L3:
        if (((com.google.android.gms.appdatasearch.GetRecentContextCall.Response) (s)).b != null && !((com.google.android.gms.appdatasearch.GetRecentContextCall.Response) (s)).b.isEmpty())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        b.b("Fail to obtain recent context");
        if (context == null) goto _L5; else goto _L4
_L4:
        context.c();
        return null;
        UsageInfo usageinfo = (UsageInfo)((com.google.android.gms.appdatasearch.GetRecentContextCall.Response) (s)).b.get(0);
        s = usageinfo;
        if (context != null)
        {
            context.c();
            s = usageinfo;
        }
_L6:
        return s;
        context;
        context = null;
_L9:
        b.c("Fail to get recent context");
        if (context != null)
        {
            context.c();
            s = null;
        } else
        {
            s = null;
        }
          goto _L6
        s;
        context = null;
_L8:
        if (context != null)
        {
            context.c();
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L8; else goto _L7
_L7:
        s;
          goto _L9
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

    public static JSONObject a(Context context, AdRequestInfoParcel adrequestinfoparcel, fs fs1, ar ar1, String s, List list)
    {
        HashMap hashmap;
        int i;
        float f;
        AdRequestParcel adrequestparcel;
        AdSizeParcel aadsizeparcel[];
        Object obj;
        int j;
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
            if (adrequestinfoparcel.b != null)
            {
                hashmap.put("ad_pos", adrequestinfoparcel.b);
            }
            adrequestparcel = adrequestinfoparcel.c;
            list = com.google.android.gms.internal.gh.a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            b.c((new StringBuilder("Problem serializing ad request to JSON: ")).append(context.getMessage()).toString());
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
        JVM INSTR tableswitch 0 3: default 2565
    //                   0 2577
    //                   1 2585
    //                   2 2593
    //                   3 2601;
           goto _L4 _L5 _L6 _L7 _L8
_L57:
        if (list == null) goto _L10; else goto _L9
_L9:
        hashmap.put("btype", list);
_L10:
        ((SearchAdRequestParcel) (obj)).i;
        JVM INSTR tableswitch 0 2: default 2571
    //                   0 2617
    //                   1 2625
    //                   2 2609;
           goto _L11 _L12 _L13 _L14
_L58:
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
        if (adrequestinfoparcel.d.h == null) goto _L18; else goto _L17
_L17:
        list = new StringBuilder();
        aadsizeparcel = adrequestinfoparcel.d.h;
        l = aadsizeparcel.length;
        i = 0;
_L25:
        if (i >= l) goto _L20; else goto _L19
_L19:
        obj = aadsizeparcel[i];
        if (list.length() != 0)
        {
            list.append("|");
        }
        if (((AdSizeParcel) (obj)).f != -1) goto _L22; else goto _L21
_L21:
        j = (int)((float)((AdSizeParcel) (obj)).g / fs1.r);
_L26:
        list.append(j);
        list.append("x");
        if (((AdSizeParcel) (obj)).c != -2) goto _L24; else goto _L23
_L23:
        j = (int)((float)((AdSizeParcel) (obj)).d / fs1.r);
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
        list = adrequestinfoparcel.C;
        if (list == null) goto _L31; else goto _L30
_L30:
        i = ((NativeAdOptionsParcel) (list)).c;
          goto _L32
_L63:
        hashmap.put("native_image_orientation", list);
        if (!adrequestinfoparcel.D.isEmpty())
        {
            hashmap.put("native_custom_templates", adrequestinfoparcel.D);
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
        hashmap.put("am", Integer.valueOf(fs1.a));
        hashmap.put("cog", a(fs1.b));
        hashmap.put("coh", a(fs1.c));
        if (!TextUtils.isEmpty(fs1.d))
        {
            hashmap.put("carrier", fs1.d);
        }
        hashmap.put("gl", fs1.e);
        if (fs1.f)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        if (fs1.g)
        {
            hashmap.put("is_sidewinder", Integer.valueOf(1));
        }
        hashmap.put("ma", a(fs1.h));
        hashmap.put("sp", a(fs1.i));
        hashmap.put("hl", fs1.j);
        if (!TextUtils.isEmpty(fs1.k))
        {
            hashmap.put("mv", fs1.k);
        }
        hashmap.put("muv", Integer.valueOf(fs1.l));
        if (fs1.m != -2)
        {
            hashmap.put("cnt", Integer.valueOf(fs1.m));
        }
        hashmap.put("gnt", Integer.valueOf(fs1.n));
        hashmap.put("pt", Integer.valueOf(fs1.o));
        hashmap.put("rm", Integer.valueOf(fs1.p));
        hashmap.put("riv", Integer.valueOf(fs1.q));
        s = new Bundle();
        s.putString("build", fs1.y);
        list = new Bundle();
        list.putBoolean("is_charging", fs1.v);
        list.putDouble("battery_level", fs1.u);
        s.putBundle("battery", list);
        list = new Bundle();
        list.putInt("active_network_state", fs1.x);
        list.putBoolean("active_network_metered", fs1.w);
        s.putBundle("network", list);
        hashmap.put("device", s);
        hashmap.put("fdz", Integer.valueOf(ar1.b()));
        hashmap.put("platform", Build.MANUFACTURER);
        hashmap.put("submodel", Build.MODEL);
        if (adrequestinfoparcel.c.a >= 2 && adrequestinfoparcel.c.k != null)
        {
            ar1 = adrequestinfoparcel.c.k;
            s = new HashMap();
            f = ar1.getAccuracy();
            l1 = ar1.getTime();
            l2 = (long)(ar1.getLatitude() * 10000000D);
            l3 = (long)(ar1.getLongitude() * 10000000D);
            s.put("radius", Float.valueOf(f * 1000F));
            s.put("lat", Long.valueOf(l2));
            s.put("long", Long.valueOf(l3));
            s.put("time", Long.valueOf(l1 * 1000L));
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
        ar1 = adrequestinfoparcel.o;
        s = ay.P;
        if (((Boolean)p.n().a(s)).booleanValue()) goto _L36; else goto _L35
_L35:
        b.b("App index is not enabled");
_L43:
        hashmap.put("content_info", ar1);
_L34:
        if (adrequestinfoparcel.a < 5) goto _L38; else goto _L37
_L37:
        hashmap.put("u_sd", Float.valueOf(adrequestinfoparcel.t));
        hashmap.put("sh", Integer.valueOf(adrequestinfoparcel.s));
        hashmap.put("sw", Integer.valueOf(adrequestinfoparcel.r));
_L55:
        if (adrequestinfoparcel.a < 6) goto _L40; else goto _L39
_L39:
        flag = TextUtils.isEmpty(adrequestinfoparcel.u);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2095;
        }
        hashmap.put("view_hierarchy", new JSONObject(adrequestinfoparcel.u));
_L56:
        context = ay.V;
        if (((Boolean)p.n().a(context)).booleanValue() && adrequestinfoparcel.v)
        {
            hashmap.put("ga_hid", Integer.valueOf(adrequestinfoparcel.w));
            hashmap.put("ga_cid", adrequestinfoparcel.x);
        }
        hashmap.put("correlation_id", Long.valueOf(adrequestinfoparcel.y));
_L40:
        if (adrequestinfoparcel.a >= 7)
        {
            hashmap.put("request_id", adrequestinfoparcel.z);
        }
        if (adrequestinfoparcel.a >= 11 && adrequestinfoparcel.F != null)
        {
            context = adrequestinfoparcel.F;
            adrequestinfoparcel = new Bundle();
            adrequestinfoparcel.putBoolean("iap_supported", ((CapabilityParcel) (context)).b);
            adrequestinfoparcel.putBoolean("default_iap_supported", ((CapabilityParcel) (context)).c);
            hashmap.put("capability", adrequestinfoparcel);
        }
        if (b.a(2))
        {
            p.e().a(hashmap).toString(2);
            b.a(2);
        }
        return p.e().a(hashmap);
_L36:
        if (g.a) goto _L42; else goto _L41
_L41:
        b.b("Not on package side, return");
          goto _L43
_L42:
        n.a();
        if (!com.google.android.gms.ads.internal.util.client.a.b()) goto _L45; else goto _L44
_L44:
        b.b("Cannot invoked on UI thread");
          goto _L43
_L45:
        if (adrequestinfoparcel == null) goto _L47; else goto _L46
_L46:
        if (adrequestinfoparcel.g != null) goto _L48; else goto _L47
_L47:
        b.c("Invalid ad request info");
          goto _L43
_L48:
        s = adrequestinfoparcel.g.packageName;
        if (!TextUtils.isEmpty(s)) goto _L50; else goto _L49
_L49:
        b.c("Fail to get package name");
          goto _L43
_L50:
        context = a(context, s);
        if (context == null) goto _L43; else goto _L51
_L51:
        if (context.a() == null) goto _L43; else goto _L52
_L52:
        context = context.a();
        list = context.a();
        if (!TextUtils.isEmpty(list))
        {
            ar1.putString("web_url", list);
        }
        context = context.a("intent_data");
        if (context == null) goto _L43; else goto _L53
_L53:
        if (TextUtils.isEmpty(((DocumentSection) (context)).c)) goto _L43; else goto _L54
_L54:
        ar1.putString("app_uri", com.google.android.gms.a.a.a(s, Uri.parse(((DocumentSection) (context)).c)).toString());
          goto _L43
        context;
        b.c("Failed to parse the third-party Android App URI");
          goto _L43
        context;
        b.b("Fail to add app index to content info");
          goto _L43
_L38:
        hashmap.put("u_sd", Float.valueOf(fs1.r));
        hashmap.put("sh", Integer.valueOf(fs1.t));
        hashmap.put("sw", Integer.valueOf(fs1.s));
          goto _L55
        context;
        b.b("Problem serializing view hierarchy to JSON", context);
          goto _L56
_L4:
        list = null;
          goto _L57
_L11:
        list = null;
          goto _L58
_L5:
        list = "none";
          goto _L57
_L6:
        list = "dashed";
          goto _L57
_L7:
        list = "dotted";
          goto _L57
_L8:
        list = "solid";
          goto _L57
_L14:
        list = "dark";
          goto _L58
_L12:
        list = "light";
          goto _L58
_L13:
        list = "medium";
          goto _L58
_L32:
        i;
        JVM INSTR tableswitch 1 2: default 2656
    //                   1 2670
    //                   2 2677;
           goto _L59 _L60 _L61
_L65:
        if (true) goto _L63; else goto _L62
_L62:
_L67:
        if (true) goto _L65; else goto _L64
_L64:
_L69:
        if (true) goto _L67; else goto _L66
_L66:
_L71:
        if (true) goto _L69; else goto _L68
_L68:
_L73:
        if (true) goto _L71; else goto _L70
_L70:
_L75:
        if (true) goto _L73; else goto _L72
_L72:
_L77:
        if (true) goto _L75; else goto _L74
_L74:
        if (true) goto _L77; else goto _L76
_L76:
_L59:
        list = "any";
          goto _L63
_L31:
        i = 0;
          goto _L32
_L60:
        list = "portrait";
          goto _L63
_L61:
        list = "landscape";
          goto _L63
    }

    static 
    {
        a = new SimpleDateFormat("yyyyMMdd", Locale.US);
    }
}
