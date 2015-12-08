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
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cp, ct, ch, hs, 
//            n, k, ay, au, 
//            o, gw, hd

public final class cg
{

    public static final ch a = new ch() {

        public void zza(hs hs, Map map)
        {
        }

    };
    public static final ch b = new ch() {

        public void zza(hs hs1, Map map)
        {
            map = (String)map.get("urls");
            if (TextUtils.isEmpty(map))
            {
                zzb.zzaE("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = hs1.getContext().getPackageManager();
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
            hs1.a("openableURLs", hashmap);
        }

    };
    public static final ch c = new ch() {

        public void zza(hs hs1, Map map)
        {
            PackageManager packagemanager = hs1.getContext().getPackageManager();
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
                hs1.a("openableIntents", new JSONObject());
                return;
            }
            try
            {
                map = map.getJSONArray("intents");
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                hs1.a("openableIntents", new JSONObject());
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
                        zzb.zzb("Error parsing the intent data.", jsonexception);
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
                        zzb.zzb("Error constructing openable urls response.", jsonexception1);
                    }
                }
                i1++;
            } while (true);
            hs1.a("openableIntents", jsonobject);
        }

    };
    public static final ch d = new ch() {

        public void zza(hs hs1, Map map)
        {
            Uri uri;
            String s;
            map = (String)map.get("u");
            if (map == null)
            {
                zzb.zzaE("URL missing from click GMSG.");
                return;
            }
            s = zzp.zzbx().b(hs1.getContext(), map, hs1.r());
            uri = Uri.parse(s);
            n n1 = hs1.k();
            map = uri;
            if (n1 != null)
            {
                map = uri;
                try
                {
                    if (n1.b(uri))
                    {
                        map = n1.a(uri, hs1.getContext());
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    zzb.zzaE((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
                    map = uri;
                }
            }
            map = map.toString();
            (new hd(hs1.getContext(), hs1.l().zzIz, map)).zzgn();
            return;
        }

    };
    public static final ch e = new ch() {

        public void zza(hs hs1, Map map)
        {
            map = hs1.f();
            if (map != null)
            {
                map.close();
                return;
            }
            hs1 = hs1.g();
            if (hs1 != null)
            {
                hs1.close();
                return;
            } else
            {
                zzb.zzaE("A GMSG tried to close something that wasn't an overlay.");
                return;
            }
        }

    };
    public static final ch f = new ch() {

        public void zza(hs hs1, Map map)
        {
            hs1.b("1".equals(map.get("custom_close")));
        }

    };
    public static final ch g = new ch() {

        public void zza(hs hs1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                zzb.zzaE("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new hd(hs1.getContext(), hs1.l().zzIz, map)).zzgn();
                return;
            }
        }

    };
    public static final ch h = new ch() {

        public void zza(hs hs, Map map)
        {
            zzb.zzaD((new StringBuilder()).append("Received log message: ").append((String)map.get("string")).toString());
        }

    };
    public static final ch i = new ch() {

        public void zza(hs hs1, Map map)
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
                hs1 = hs1.k();
            }
            // Misplaced declaration of an exception variable
            catch (hs hs1)
            {
                zzb.zzaE("Could not parse touch parameters from gmsg.");
                return;
            }
            if (hs1 == null)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            hs1.a().zza(i1, j1, k1);
        }

    };
    public static final ch j = new ch() {

        public void zza(hs hs1, Map map)
        {
            if (!((Boolean)ay.ai.c()).booleanValue())
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
            hs1.c(flag);
        }

    };
    public static final ch k = new cp();
    public static final ch l = new ct();

}
