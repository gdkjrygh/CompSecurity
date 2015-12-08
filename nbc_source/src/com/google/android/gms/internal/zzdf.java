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
//            zzdo, zzds, zzdg, zzid, 
//            zzao, zzan, zzhp, zzaj

public final class zzdf
{

    public static final zzdg zzvV = new zzdg() {

        public void zza(zzid zzid, Map map)
        {
        }

    };
    public static final zzdg zzvW = new zzdg() {

        public void zza(zzid zzid1, Map map)
        {
            map = (String)map.get("urls");
            if (TextUtils.isEmpty(map))
            {
                zzb.zzaC("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = zzid1.getContext().getPackageManager();
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
            zzid1.zzc("openableURLs", hashmap);
        }

    };
    public static final zzdg zzvX = new zzdg() {

        public void zza(zzid zzid1, Map map)
        {
            PackageManager packagemanager = zzid1.getContext().getPackageManager();
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
                zzid1.zzb("openableIntents", new JSONObject());
                return;
            }
            try
            {
                map = map.getJSONArray("intents");
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                zzid1.zzb("openableIntents", new JSONObject());
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
            zzid1.zzb("openableIntents", jsonobject);
        }

    };
    public static final zzdg zzvY = new zzdg() {

        public void zza(zzid zzid1, Map map)
        {
            String s;
            s = (String)map.get("u");
            if (s == null)
            {
                zzb.zzaC("URL missing from click GMSG.");
                return;
            }
            map = Uri.parse(s);
            Object obj = zzid1.zzgH();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            if (!((zzan) (obj)).zzb(map))
            {
                break MISSING_BLOCK_LABEL_63;
            }
            obj = ((zzan) (obj)).zza(map, zzid1.getContext());
            map = ((Map) (obj));
_L2:
            map = map.toString();
            (new zzhp(zzid1.getContext(), zzid1.zzgI().zzGG, map)).zzgi();
            return;
            zzao zzao1;
            zzao1;
            zzb.zzaC((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
            if (true) goto _L2; else goto _L1
_L1:
        }

    };
    public static final zzdg zzvZ = new zzdg() {

        public void zza(zzid zzid1, Map map)
        {
            map = zzid1.zzgD();
            if (map != null)
            {
                map.close();
                return;
            }
            zzid1 = zzid1.zzgE();
            if (zzid1 != null)
            {
                zzid1.close();
                return;
            } else
            {
                zzb.zzaC("A GMSG tried to close something that wasn't an overlay.");
                return;
            }
        }

    };
    public static final zzdg zzwa = new zzdg() {

        public void zza(zzid zzid1, Map map)
        {
            zzid1.zzC("1".equals(map.get("custom_close")));
        }

    };
    public static final zzdg zzwb = new zzdg() {

        public void zza(zzid zzid1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                zzb.zzaC("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new zzhp(zzid1.getContext(), zzid1.zzgI().zzGG, map)).zzgi();
                return;
            }
        }

    };
    public static final zzdg zzwc = new zzdg() {

        public void zza(zzid zzid, Map map)
        {
            zzb.zzaA((new StringBuilder()).append("Received log message: ").append((String)map.get("string")).toString());
        }

    };
    public static final zzdg zzwd = new zzdg() {

        public void zza(zzid zzid1, Map map)
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
                zzid1 = zzid1.zzgH();
            }
            // Misplaced declaration of an exception variable
            catch (zzid zzid1)
            {
                zzb.zzaC("Could not parse touch parameters from gmsg.");
                return;
            }
            if (zzid1 == null)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            zzid1.zzab().zza(i, j, k);
        }

    };
    public static final zzdg zzwe = new zzdo();
    public static final zzdg zzwf = new zzds();

}
