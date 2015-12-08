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
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            fz, ry

final class ft
    implements fz
{

    ft()
    {
    }

    public final void zza(ry ry1, Map map)
    {
        PackageManager packagemanager = ry1.getContext().getPackageManager();
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
            ry1.a("openableIntents", new JSONObject());
            return;
        }
        try
        {
            map = map.getJSONArray("intents");
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            ry1.a("openableIntents", new JSONObject());
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
        ry1.a("openableIntents", jsonobject);
    }
}
