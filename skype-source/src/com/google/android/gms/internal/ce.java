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
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cn, cr, cf, hi, 
//            o, k, ay, ax, 
//            p, gm, gt

public final class ce
{

    public static final cf a = new cf() {

        public final void a(hi hi, Map map)
        {
        }

    };
    public static final cf b = new cf() {

        public final void a(hi hi1, Map map)
        {
            map = (String)map.get("urls");
            if (TextUtils.isEmpty(map))
            {
                com.google.android.gms.ads.internal.util.client.b.c("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = hi1.getContext().getPackageManager();
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
            hi1.a("openableURLs", hashmap);
        }

    };
    public static final cf c = new cf() {

        public final void a(hi hi1, Map map)
        {
            PackageManager packagemanager = hi1.getContext().getPackageManager();
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
                hi1.a("openableIntents", new JSONObject());
                return;
            }
            try
            {
                map = map.getJSONArray("intents");
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                hi1.a("openableIntents", new JSONObject());
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
                        com.google.android.gms.ads.internal.util.client.b.a("Error parsing the intent data.", jsonexception);
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
                        com.google.android.gms.ads.internal.util.client.b.a("Error constructing openable urls response.", jsonexception1);
                    }
                }
                i1++;
            } while (true);
            hi1.a("openableIntents", jsonobject);
        }

    };
    public static final cf d = new cf() {

        public final void a(hi hi1, Map map)
        {
            Uri uri;
            String s;
            map = (String)map.get("u");
            if (map == null)
            {
                com.google.android.gms.ads.internal.util.client.b.c("URL missing from click GMSG.");
                return;
            }
            p.e();
            s = com.google.android.gms.internal.gm.b(hi1.getContext(), map, hi1.u());
            uri = Uri.parse(s);
            o o1 = hi1.l();
            map = uri;
            if (o1 != null)
            {
                map = uri;
                try
                {
                    if (o1.a(uri))
                    {
                        map = o1.a(uri, hi1.getContext());
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Unable to append parameter to URL: ")).append(s).toString());
                    map = uri;
                }
            }
            map = map.toString();
            (new gt(hi1.getContext(), hi1.m().b, map)).e();
            return;
        }

    };
    public static final cf e = new cf() {

        public final void a(hi hi1, Map map)
        {
            map = hi1.g();
            if (map != null)
            {
                map.a();
                return;
            }
            hi1 = hi1.h();
            if (hi1 != null)
            {
                hi1.a();
                return;
            } else
            {
                com.google.android.gms.ads.internal.util.client.b.c("A GMSG tried to close something that wasn't an overlay.");
                return;
            }
        }

    };
    public static final cf f = new cf() {

        public final void a(hi hi1, Map map)
        {
            hi1.c("1".equals(map.get("custom_close")));
        }

    };
    public static final cf g = new cf() {

        public final void a(hi hi1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                com.google.android.gms.ads.internal.util.client.b.c("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new gt(hi1.getContext(), hi1.m().b, map)).e();
                return;
            }
        }

    };
    public static final cf h = new cf() {

        public final void a(hi hi, Map map)
        {
            com.google.android.gms.ads.internal.util.client.b.b((new StringBuilder("Received log message: ")).append((String)map.get("string")).toString());
        }

    };
    public static final cf i = new cf() {

        public final void a(hi hi1, Map map)
        {
            String s = (String)map.get("tx");
            String s1 = (String)map.get("ty");
            map = (String)map.get("td");
            int i1;
            int j1;
            int k1;
            try
            {
                i1 = Integer.parseInt(s);
                j1 = Integer.parseInt(s1);
                k1 = Integer.parseInt(map);
                hi1 = hi1.l();
            }
            // Misplaced declaration of an exception variable
            catch (hi hi1)
            {
                com.google.android.gms.ads.internal.util.client.b.c("Could not parse touch parameters from gmsg.");
                return;
            }
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            hi1.a().a(i1, j1, k1);
        }

    };
    public static final cf j = new cf() {

        public final void a(hi hi1, Map map)
        {
            au au = ay.ai;
            if (!((Boolean)p.n().a(au)).booleanValue())
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
            hi1.d(flag);
        }

    };
    public static final cf k = new cn();
    public static final cf l = new cr();

}
