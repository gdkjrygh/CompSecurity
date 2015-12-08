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
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdb, zzcv, zzic, zzhx, 
//            zzl, zzk, zzhu, zzhy, 
//            zzel, zzg

public final class zzcu
{

    public static final zzcv zzrA = new zzcv() {

        public final void zza(zzic zzic1, Map map)
        {
            map = (String)map.get("urls");
            if (TextUtils.isEmpty(map))
            {
                zzhx.zzac("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = zzic1.getContext().getPackageManager();
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
            zzic1.zzb("openableURLs", hashmap);
        }

    };
    public static final zzcv zzrB = new zzcv() {

        public final void zza(zzic zzic1, Map map)
        {
            PackageManager packagemanager = zzic1.getContext().getPackageManager();
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
                zzic1.zzb("openableIntents", new JSONObject());
                return;
            }
            try
            {
                map = map.getJSONArray("intents");
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                zzic1.zzb("openableIntents", new JSONObject());
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
                        zzhx.zzb("Error parsing the intent data.", jsonexception);
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
                        zzhx.zzb("Error constructing openable urls response.", jsonexception1);
                    }
                }
                i++;
            } while (true);
            zzic1.zzb("openableIntents", jsonobject);
        }

    };
    public static final zzcv zzrC = new zzcv() {

        public final void zza(zzic zzic1, Map map)
        {
            String s;
            s = (String)map.get("u");
            if (s == null)
            {
                zzhx.zzac("URL missing from click GMSG.");
                return;
            }
            map = Uri.parse(s);
            Object obj = zzic1.zzeI();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            if (!((zzk) (obj)).zzb(map))
            {
                break MISSING_BLOCK_LABEL_63;
            }
            obj = ((zzk) (obj)).zza(map, zzic1.getContext());
            map = ((Map) (obj));
_L2:
            map = map.toString();
            (new zzhu(zzic1.getContext(), zzic1.zzeJ().zzzH, map)).start();
            return;
            zzl zzl1;
            zzl1;
            zzhx.zzac((new StringBuilder("Unable to append parameter to URL: ")).append(s).toString());
            if (true) goto _L2; else goto _L1
_L1:
        }

    };
    public static final zzcv zzrD = new zzcv() {

        public final void zza(zzic zzic1, Map map)
        {
            zzic1 = zzic1.zzeF();
            if (zzic1 == null)
            {
                zzhx.zzac("A GMSG tried to close something that wasn't an overlay.");
                return;
            } else
            {
                zzic1.close();
                return;
            }
        }

    };
    public static final zzcv zzrE = new zzcv() {

        public final void zza(zzic zzic1, Map map)
        {
            zzic1.zzB("1".equals(map.get("custom_close")));
        }

    };
    public static final zzcv zzrF = new zzcv() {

        public final void zza(zzic zzic1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                zzhx.zzac("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new zzhu(zzic1.getContext(), zzic1.zzeJ().zzzH, map)).start();
                return;
            }
        }

    };
    public static final zzcv zzrG = new zzcv() {

        public final void zza(zzic zzic, Map map)
        {
            zzhx.zzaa((new StringBuilder("Received log message: ")).append((String)map.get("string")).toString());
        }

    };
    public static final zzcv zzrH = new zzcv() {

        public final void zza(zzic zzic1, Map map)
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
                zzic1 = zzic1.zzeI();
            }
            // Misplaced declaration of an exception variable
            catch (zzic zzic1)
            {
                zzhx.zzac("Could not parse touch parameters from gmsg.");
                return;
            }
            if (zzic1 == null)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            zzic1.zzC().zza(i, j, k);
        }

    };
    public static final zzcv zzrI = new zzdb();
    public static final zzcv zzrz = new zzcv() {

        public final void zza(zzic zzic, Map map)
        {
        }

    };

}
