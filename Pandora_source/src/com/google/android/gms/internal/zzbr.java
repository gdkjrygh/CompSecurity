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
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzca, zzce, zzbs, zzgd, 
//            zzl, zzk, zzfp, zzbo, 
//            zzg

public final class zzbr
{

    public static final zzbs zzti = new zzbs() {

        public void zza(zzgd zzgd, Map map)
        {
        }

    };
    public static final zzbs zztj = new zzbs() {

        public void zza(zzgd zzgd1, Map map)
        {
            map = (String)map.get("urls");
            if (TextUtils.isEmpty(map))
            {
                zzb.zzan("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = zzgd1.getContext().getPackageManager();
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s = as[i];
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
                i++;
            }
            zzgd1.zzb("openableURLs", hashmap);
        }

    };
    public static final zzbs zztk = new zzbs() {

        public void zza(zzgd zzgd1, Map map)
        {
            PackageManager packagemanager = zzgd1.getContext().getPackageManager();
            map = (String)map.get("data");
            JSONObject jsonobject;
            int i;
            try
            {
                map = new JSONObject(map);
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                zzgd1.zzb("openableIntents", new JSONObject());
                return;
            }
            try
            {
                map = map.getJSONArray("intents");
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                zzgd1.zzb("openableIntents", new JSONObject());
                return;
            }
            jsonobject = new JSONObject();
            i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= map.length())
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
                        obj = map.getJSONObject(i);
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
                i++;
            } while (true);
            zzgd1.zzb("openableIntents", jsonobject);
        }

    };
    public static final zzbs zztl = new zzbs() {

        public void zza(zzgd zzgd1, Map map)
        {
            String s;
            s = (String)map.get("u");
            if (s == null)
            {
                zzb.zzan("URL missing from click GMSG.");
                return;
            }
            map = Uri.parse(s);
            Object obj = zzgd1.zzfv();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            if (!((zzk) (obj)).zzb(map))
            {
                break MISSING_BLOCK_LABEL_63;
            }
            obj = ((zzk) (obj)).zza(map, zzgd1.getContext());
            map = ((Map) (obj));
_L2:
            map = map.toString();
            (new zzfp(zzgd1.getContext(), zzgd1.zzfw().zzCI, map)).zzeW();
            return;
            zzl zzl1;
            zzl1;
            zzb.zzan((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
            if (true) goto _L2; else goto _L1
_L1:
        }

    };
    public static final zzbs zztm = new zzbs() {

        public void zza(zzgd zzgd1, Map map)
        {
            map = zzgd1.zzfr();
            if (map != null)
            {
                map.close();
                return;
            }
            zzgd1 = zzgd1.zzfs();
            if (zzgd1 != null)
            {
                zzgd1.close();
                return;
            } else
            {
                zzb.zzan("A GMSG tried to close something that wasn't an overlay.");
                return;
            }
        }

    };
    public static final zzbs zztn = new zzbo() {

        public void zzb(zzgd zzgd1, Map map)
        {
            zzgd1.zzC("1".equals(map.get("custom_close")));
        }

    };
    public static final zzbs zzto = new zzbs() {

        public void zza(zzgd zzgd1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                zzb.zzan("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new zzfp(zzgd1.getContext(), zzgd1.zzfw().zzCI, map)).zzeW();
                return;
            }
        }

    };
    public static final zzbs zztp = new zzbs() {

        public void zza(zzgd zzgd, Map map)
        {
            zzb.zzal((new StringBuilder()).append("Received log message: ").append((String)map.get("string")).toString());
        }

    };
    public static final zzbs zztq = new zzbs() {

        public void zza(zzgd zzgd1, Map map)
        {
            String s = (String)map.get("tx");
            String s1 = (String)map.get("ty");
            map = (String)map.get("td");
            int i;
            int j;
            int k;
            try
            {
                i = Integer.parseInt(s);
                j = Integer.parseInt(s1);
                k = Integer.parseInt(map);
                zzgd1 = zzgd1.zzfv();
            }
            // Misplaced declaration of an exception variable
            catch (zzgd zzgd1)
            {
                zzb.zzan("Could not parse touch parameters from gmsg.");
                return;
            }
            if (zzgd1 == null)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            zzgd1.zzC().zza(i, j, k);
        }

    };
    public static final zzbs zztr = new zzca();
    public static final zzbs zzts = new zzce();

}
