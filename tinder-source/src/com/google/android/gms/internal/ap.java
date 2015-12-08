// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            av, az, ao, aq, 
//            cw, e, v, u, 
//            zzao, cq

public final class ap
{

    public static final aq a = new aq() {

        public final void a(cw cw, Map map)
        {
        }

    };
    public static final aq b = new aq() {

        public final void a(cw cw1, Map map)
        {
            map = (String)map.get("urls");
            if (TextUtils.isEmpty(map))
            {
                com.google.android.gms.ads.internal.util.client.b.e("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = cw1.getContext().getPackageManager();
            int j1 = as.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                String s = as[i1];
                map = s.split(";", 2);
                String s1 = map[0].trim();
                boolean flag;
                if (map.length > 1)
                {
                    map = map[1].trim();
                } else
                {
                    map = "android.intent.action.VIEW";
                }
                if (packagemanager.resolveActivity(new Intent(map, Uri.parse(s1)), 0x10000) != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                hashmap.put(s, Boolean.valueOf(flag));
                i1++;
            }
            cw1.a("openableURLs", hashmap);
        }

    };
    public static final aq c = new aq() {

        public final void a(cw cw1, Map map)
        {
            PackageManager packagemanager = cw1.getContext().getPackageManager();
            map = (String)map.get("data");
            JSONObject jsonobject;
            int i1;
            try
            {
                map = new JSONObject(map);
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                cw1.a("openableIntents", new JSONObject());
                return;
            }
            try
            {
                map = map.getJSONArray("intents");
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                cw1.a("openableIntents", new JSONObject());
                return;
            }
            jsonobject = new JSONObject();
            i1 = 0;
label0:
            do
            {
label1:
                {
                    if (i1 >= map.length())
                    {
                        break label0;
                    }
                    String s;
                    String s1;
                    String s2;
                    String s3;
                    String s4;
                    String s5;
                    Object obj;
                    boolean flag;
                    try
                    {
                        obj = map.getJSONObject(i1);
                    }
                    catch (JSONException jsonexception)
                    {
                        com.google.android.gms.ads.internal.util.client.b.b("Error parsing the intent data.", jsonexception);
                        break label1;
                    }
                    s = ((JSONObject) (obj)).optString("id");
                    s1 = ((JSONObject) (obj)).optString("u");
                    s2 = ((JSONObject) (obj)).optString("i");
                    s3 = ((JSONObject) (obj)).optString("m");
                    s4 = ((JSONObject) (obj)).optString("p");
                    s5 = ((JSONObject) (obj)).optString("c");
                    ((JSONObject) (obj)).optString("f");
                    ((JSONObject) (obj)).optString("e");
                    obj = new Intent();
                    if (!TextUtils.isEmpty(s1))
                    {
                        ((Intent) (obj)).setData(Uri.parse(s1));
                    }
                    if (!TextUtils.isEmpty(s2))
                    {
                        ((Intent) (obj)).setAction(s2);
                    }
                    if (!TextUtils.isEmpty(s3))
                    {
                        ((Intent) (obj)).setType(s3);
                    }
                    if (!TextUtils.isEmpty(s4))
                    {
                        ((Intent) (obj)).setPackage(s4);
                    }
                    if (!TextUtils.isEmpty(s5))
                    {
                        String as[] = s5.split("/", 2);
                        if (as.length == 2)
                        {
                            ((Intent) (obj)).setComponent(new ComponentName(as[0], as[1]));
                        }
                    }
                    if (packagemanager.resolveActivity(((Intent) (obj)), 0x10000) != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    try
                    {
                        jsonobject.put(s, flag);
                    }
                    catch (JSONException jsonexception1)
                    {
                        com.google.android.gms.ads.internal.util.client.b.b("Error constructing openable urls response.", jsonexception1);
                    }
                }
                i1++;
            } while (true);
            cw1.a("openableIntents", jsonobject);
        }

    };
    public static final aq d = new aq() {

        public final void a(cw cw1, Map map)
        {
            String s;
            s = (String)map.get("u");
            if (s == null)
            {
                com.google.android.gms.ads.internal.util.client.b.e("URL missing from click GMSG.");
                return;
            }
            map = Uri.parse(s);
            Object obj = cw1.k();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_64;
            }
            if (!((e) (obj)).a(map))
            {
                break MISSING_BLOCK_LABEL_64;
            }
            cw1.getContext();
            obj = ((e) (obj)).b(map);
            map = ((Map) (obj));
_L2:
            map = map.toString();
            (new cq(cw1.getContext(), cw1.l().b, map)).b();
            return;
            zzao zzao1;
            zzao1;
            com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Unable to append parameter to URL: ")).append(s).toString());
            if (true) goto _L2; else goto _L1
_L1:
        }

    };
    public static final aq e = new aq() {

        public final void a(cw cw1, Map map)
        {
            map = cw1.f();
            if (map != null)
            {
                map.a();
                return;
            }
            cw1 = cw1.g();
            if (cw1 != null)
            {
                cw1.a();
                return;
            } else
            {
                com.google.android.gms.ads.internal.util.client.b.e("A GMSG tried to close something that wasn't an overlay.");
                return;
            }
        }

    };
    public static final aq f = new aq() {

        public final void a(cw cw1, Map map)
        {
            cw1.b("1".equals(map.get("custom_close")));
        }

    };
    public static final aq g = new aq() {

        public final void a(cw cw1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                com.google.android.gms.ads.internal.util.client.b.e("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new cq(cw1.getContext(), cw1.l().b, map)).b();
                return;
            }
        }

    };
    public static final aq h = new aq() {

        public final void a(cw cw, Map map)
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Received log message: ")).append((String)map.get("string")).toString());
        }

    };
    public static final aq i = new aq() {

        public final void a(cw cw1, Map map)
        {
            String s = (String)map.get("tx");
            String s1 = (String)map.get("ty");
            map = (String)map.get("td");
            try
            {
                Integer.parseInt(s);
                Integer.parseInt(s1);
                Integer.parseInt(map);
                cw1 = cw1.k();
            }
            // Misplaced declaration of an exception variable
            catch (cw cw1)
            {
                com.google.android.gms.ads.internal.util.client.b.e("Could not parse touch parameters from gmsg.");
                return;
            }
            if (cw1 == null)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            cw1 = ((e) (cw1)).b;
        }

    };
    public static final aq j = new aq() {

        public final void a(cw cw1, Map map)
        {
            r r = v.ai;
            if (!((Boolean)com.google.android.gms.ads.internal.d.i().a(r)).booleanValue())
            {
                return;
            }
            boolean flag;
            if (!Boolean.parseBoolean((String)map.get("disabled")))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cw1.c(flag);
        }

    };
    public static final aq k = new av();
    public static final aq l = new az();
    public static final aq m = new ao();

}
