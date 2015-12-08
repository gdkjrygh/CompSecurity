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
//            ea, ek, cf, cd, 
//            db, df, du, z, 
//            am, ab, dn

public final class dh
{

    private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd");

    public static cf a(Context context, cd cd1, String s)
    {
        String s1;
        Object obj;
        String s2;
        Object obj4;
        int i;
        int j;
        long l;
        long l1;
        Object obj1;
        try
        {
            obj4 = new JSONObject(s);
            s = ((JSONObject) (obj4)).optString("ad_base_url", null);
            obj = ((JSONObject) (obj4)).optString("ad_url", null);
            s2 = ((JSONObject) (obj4)).optString("ad_size", null);
            s1 = ((JSONObject) (obj4)).optString("ad_html", null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ek.d((new StringBuilder("Could not parse the mediation config: ")).append(context.getMessage()).toString());
            return new cf(0);
        }
        l1 = -1L;
        if (!((JSONObject) (obj4)).has("interstitial_timeout")) goto _L2; else goto _L1
_L1:
        l = (long)(((JSONObject) (obj4)).getDouble("interstitial_timeout") * 1000D);
_L41:
        obj1 = ((JSONObject) (obj4)).optString("orientation", null);
        i = -1;
        if (!"portrait".equals(obj1)) goto _L4; else goto _L3
_L3:
        i = ea.c();
_L7:
        if (TextUtils.isEmpty(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s))
        {
            ek.d("Could not parse the mediation config: Missing required ad_base_url field");
            return new cf(0);
        }
          goto _L5
_L4:
        if ("landscape".equals(obj1))
        {
            i = ea.b();
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L9; else goto _L8
_L8:
        obj = df.a(context, cd1.l.c, ((String) (obj)));
        s = ((cf) (obj)).c;
        s1 = ((cf) (obj)).d;
        l1 = ((cf) (obj)).o;
_L40:
        obj1 = ((JSONObject) (obj4)).optJSONArray("click_urls");
        if (obj != null) goto _L11; else goto _L10
_L10:
        context = null;
_L19:
        if (obj1 == null) goto _L13; else goto _L12
_L12:
        cd1 = context;
        if (context != null) goto _L15; else goto _L14
_L14:
        cd1 = new LinkedList();
          goto _L15
_L18:
        if (j >= ((JSONArray) (obj1)).length()) goto _L17; else goto _L16
_L16:
        cd1.add(((JSONArray) (obj1)).getString(j));
        j++;
          goto _L18
_L9:
        ek.d("Could not parse the mediation config: Missing required ad_html or ad_url field.");
        context = new cf(0);
        return context;
_L11:
        context = ((cf) (obj)).e;
          goto _L19
_L39:
        Object obj3 = ((JSONObject) (obj4)).optJSONArray("impression_urls");
        if (obj != null) goto _L21; else goto _L20
_L20:
        context = null;
_L29:
        if (obj3 == null) goto _L23; else goto _L22
_L22:
        cd1 = context;
        if (context != null) goto _L25; else goto _L24
_L24:
        cd1 = new LinkedList();
          goto _L25
_L28:
        if (j >= ((JSONArray) (obj3)).length()) goto _L27; else goto _L26
_L26:
        cd1.add(((JSONArray) (obj3)).getString(j));
        j++;
          goto _L28
_L21:
        context = ((cf) (obj)).g;
          goto _L29
_L38:
        obj4 = ((JSONObject) (obj4)).optJSONArray("manual_impression_urls");
        if (obj != null) goto _L31; else goto _L30
_L30:
        context = null;
_L37:
        if (obj4 == null) goto _L33; else goto _L32
_L32:
        cd1 = context;
        if (context != null) goto _L35; else goto _L34
_L34:
        cd1 = new LinkedList();
          goto _L35
_L36:
        if (j >= ((JSONArray) (obj4)).length())
        {
            break MISSING_BLOCK_LABEL_627;
        }
        cd1.add(((JSONArray) (obj4)).getString(j));
        j++;
          goto _L36
_L31:
        context = ((cf) (obj)).k;
          goto _L37
_L33:
        long l2;
        l2 = l;
        j = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_539;
        }
        if (((cf) (obj)).m != -1)
        {
            i = ((cf) (obj)).m;
        }
        l2 = l;
        j = i;
        if (((cf) (obj)).h <= 0L)
        {
            break MISSING_BLOCK_LABEL_539;
        }
        l2 = ((cf) (obj)).h;
        j = i;
        Object obj2;
        context = new cf(s, s1, ((List) (obj2)), ((List) (obj3)), l2, false, context, -1L, j, s2, l1);
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
        obj2 = cd1;
          goto _L39
_L25:
        j = 0;
          goto _L28
_L27:
        obj3 = cd1;
          goto _L38
_L35:
        j = 0;
          goto _L36
        context = cd1;
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

    public static String a(cd cd1, dn dn1)
    {
        Object obj;
        float f;
        HashMap hashmap;
        z z1;
        ab aab[];
        Object obj1;
        int i;
        int j;
        int k;
        long l;
        long l1;
        long l2;
        try
        {
            hashmap = new HashMap();
            if (cd1.c != null)
            {
                hashmap.put("ad_pos", cd1.c);
            }
            z1 = cd1.d;
            obj = du.a();
        }
        // Misplaced declaration of an exception variable
        catch (cd cd1)
        {
            ek.d((new StringBuilder("Problem serializing ad request to JSON: ")).append(cd1.getMessage()).toString());
            return null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        hashmap.put("abf", obj);
        if (z1.c != -1L)
        {
            hashmap.put("cust_age", a.format(new Date(z1.c)));
        }
        if (z1.d != null)
        {
            hashmap.put("extras", z1.d);
        }
        if (z1.e != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(z1.e));
        }
        if (z1.f != null)
        {
            hashmap.put("kw", z1.f);
        }
        if (z1.h != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(z1.h));
        }
        if (z1.g)
        {
            hashmap.put("adtest", "on");
        }
        if (z1.b < 2) goto _L2; else goto _L1
_L1:
        if (z1.i)
        {
            hashmap.put("d_imp_hdr", Integer.valueOf(1));
        }
        if (!TextUtils.isEmpty(z1.j))
        {
            hashmap.put("ppid", z1.j);
        }
        if (z1.k == null) goto _L2; else goto _L3
_L3:
        obj1 = z1.k;
        if (Color.alpha(((am) (obj1)).c) != 0)
        {
            hashmap.put("acolor", a(((am) (obj1)).c));
        }
        if (Color.alpha(((am) (obj1)).d) != 0)
        {
            hashmap.put("bgcolor", a(((am) (obj1)).d));
        }
        if (Color.alpha(((am) (obj1)).e) != 0 && Color.alpha(((am) (obj1)).f) != 0)
        {
            hashmap.put("gradientto", a(((am) (obj1)).e));
            hashmap.put("gradientfrom", a(((am) (obj1)).f));
        }
        if (Color.alpha(((am) (obj1)).g) != 0)
        {
            hashmap.put("bcolor", a(((am) (obj1)).g));
        }
        hashmap.put("bthick", Integer.toString(((am) (obj1)).h));
        ((am) (obj1)).i;
        JVM INSTR tableswitch 0 3: default 1596
    //                   0 1606
    //                   1 1613
    //                   2 1620
    //                   3 1627;
           goto _L4 _L5 _L6 _L7 _L8
_L28:
        if (obj == null) goto _L10; else goto _L9
_L9:
        hashmap.put("btype", obj);
_L10:
        ((am) (obj1)).j;
        JVM INSTR tableswitch 0 2: default 1601
    //                   0 1641
    //                   1 1648
    //                   2 1634;
           goto _L11 _L12 _L13 _L14
_L29:
        if (obj == null) goto _L16; else goto _L15
_L15:
        hashmap.put("callbuttoncolor", obj);
_L16:
        if (((am) (obj1)).k != null)
        {
            hashmap.put("channel", ((am) (obj1)).k);
        }
        if (Color.alpha(((am) (obj1)).l) != 0)
        {
            hashmap.put("dcolor", a(((am) (obj1)).l));
        }
        if (((am) (obj1)).m != null)
        {
            hashmap.put("font", ((am) (obj1)).m);
        }
        if (Color.alpha(((am) (obj1)).n) != 0)
        {
            hashmap.put("hcolor", a(((am) (obj1)).n));
        }
        hashmap.put("headersize", Integer.toString(((am) (obj1)).o));
        if (((am) (obj1)).p != null)
        {
            hashmap.put("q", ((am) (obj1)).p);
        }
_L2:
        if (z1.b >= 3 && z1.m != null)
        {
            hashmap.put("url", z1.m);
        }
        hashmap.put("format", cd1.e.c);
        if (cd1.e.g == -1)
        {
            hashmap.put("smart_w", "full");
        }
        if (cd1.e.d == -2)
        {
            hashmap.put("smart_h", "auto");
        }
        if (cd1.e.i == null) goto _L18; else goto _L17
_L17:
        obj = new StringBuilder();
        aab = cd1.e.i;
        k = aab.length;
        i = 0;
_L25:
        if (i >= k) goto _L20; else goto _L19
_L19:
        obj1 = aab[i];
        if (((StringBuilder) (obj)).length() != 0)
        {
            ((StringBuilder) (obj)).append("|");
        }
        if (((ab) (obj1)).g != -1) goto _L22; else goto _L21
_L21:
        j = (int)((float)((ab) (obj1)).h / dn1.q);
_L26:
        ((StringBuilder) (obj)).append(j);
        ((StringBuilder) (obj)).append("x");
        if (((ab) (obj1)).d != -2) goto _L24; else goto _L23
_L23:
        j = (int)((float)((ab) (obj1)).e / dn1.q);
_L27:
        ((StringBuilder) (obj)).append(j);
        i++;
          goto _L25
_L22:
        j = ((ab) (obj1)).g;
          goto _L26
_L24:
        j = ((ab) (obj1)).d;
          goto _L27
_L20:
        hashmap.put("sz", obj);
_L18:
        hashmap.put("slotname", cd1.f);
        hashmap.put("pn", cd1.g.packageName);
        if (cd1.h != null)
        {
            hashmap.put("vc", Integer.valueOf(cd1.h.versionCode));
        }
        hashmap.put("ms", cd1.i);
        hashmap.put("seq_num", cd1.j);
        hashmap.put("session_id", cd1.k);
        hashmap.put("js", cd1.l.c);
        hashmap.put("am", Integer.valueOf(dn1.a));
        hashmap.put("cog", a(dn1.b));
        hashmap.put("coh", a(dn1.c));
        if (!TextUtils.isEmpty(dn1.d))
        {
            hashmap.put("carrier", dn1.d);
        }
        hashmap.put("gl", dn1.e);
        if (dn1.f)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        hashmap.put("ma", a(dn1.g));
        hashmap.put("sp", a(dn1.h));
        hashmap.put("hl", dn1.i);
        if (!TextUtils.isEmpty(dn1.j))
        {
            hashmap.put("mv", dn1.j);
        }
        hashmap.put("muv", Integer.valueOf(dn1.k));
        if (dn1.l != -2)
        {
            hashmap.put("cnt", Integer.valueOf(dn1.l));
        }
        hashmap.put("gnt", Integer.valueOf(dn1.m));
        hashmap.put("pt", Integer.valueOf(dn1.n));
        hashmap.put("rm", Integer.valueOf(dn1.o));
        hashmap.put("riv", Integer.valueOf(dn1.p));
        hashmap.put("u_sd", Float.valueOf(dn1.q));
        hashmap.put("sh", Integer.valueOf(dn1.s));
        hashmap.put("sw", Integer.valueOf(dn1.r));
        if (cd1.d.b >= 2 && cd1.d.l != null)
        {
            dn1 = cd1.d.l;
            obj = new HashMap();
            f = dn1.getAccuracy();
            l = dn1.getTime();
            l1 = (long)(dn1.getLatitude() * 10000000D);
            l2 = (long)(dn1.getLongitude() * 10000000D);
            ((HashMap) (obj)).put("radius", Float.valueOf(f * 1000F));
            ((HashMap) (obj)).put("lat", Long.valueOf(l1));
            ((HashMap) (obj)).put("long", Long.valueOf(l2));
            ((HashMap) (obj)).put("time", Long.valueOf(l * 1000L));
            hashmap.put("uule", obj);
        }
        if (cd1.b >= 2)
        {
            hashmap.put("quality_signals", cd1.m);
        }
        if (ek.a(2))
        {
            cd1 = ea.a(hashmap).toString(2);
            ek.c((new StringBuilder("Ad Request JSON: ")).append(cd1).toString());
        }
        cd1 = ea.a(hashmap).toString();
        return cd1;
_L4:
        obj = null;
          goto _L28
_L11:
        obj = null;
          goto _L29
_L5:
        obj = "none";
          goto _L28
_L6:
        obj = "dashed";
          goto _L28
_L7:
        obj = "dotted";
          goto _L28
_L8:
        obj = "solid";
          goto _L28
_L14:
        obj = "dark";
          goto _L29
_L12:
        obj = "light";
          goto _L29
_L13:
        obj = "medium";
          goto _L29
    }

}
