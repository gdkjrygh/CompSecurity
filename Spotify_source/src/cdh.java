// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzao;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class cdh
{

    public static final cdi a = new cdi() {

        public final void a(ckw ckw1, Map map)
        {
            map = (String)map.get("urls");
            if (TextUtils.isEmpty(map))
            {
                bka.e("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = ckw1.getContext().getPackageManager();
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
            ckw1.a("openableURLs", hashmap);
        }

    };
    public static final cdi b = new cdi() {

        public final void a(ckw ckw1, Map map)
        {
            PackageManager packagemanager = ckw1.getContext().getPackageManager();
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
                ckw1.a("openableIntents", new JSONObject());
                return;
            }
            try
            {
                map = map.getJSONArray("intents");
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                ckw1.a("openableIntents", new JSONObject());
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
                        bka.b("Error parsing the intent data.", jsonexception);
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
                        bka.b("Error constructing openable urls response.", jsonexception1);
                    }
                }
                i1++;
            } while (true);
            ckw1.a("openableIntents", jsonobject);
        }

    };
    public static final cdi c = new cdi() {

        public final void a(ckw ckw1, Map map)
        {
            String s;
            s = (String)map.get("u");
            if (s == null)
            {
                bka.e("URL missing from click GMSG.");
                return;
            }
            map = Uri.parse(s);
            Object obj = ckw1.m();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            if (!((bzm) (obj)).a(map))
            {
                break MISSING_BLOCK_LABEL_63;
            }
            obj = ((bzm) (obj)).a(map, ckw1.getContext());
            map = ((Map) (obj));
_L2:
            map = map.toString();
            (new ckc(ckw1.getContext(), ckw1.n().b, map)).e();
            return;
            zzao zzao1;
            zzao1;
            bka.e((new StringBuilder("Unable to append parameter to URL: ")).append(s).toString());
            if (true) goto _L2; else goto _L1
_L1:
        }

    };
    public static final cdi d = new cdi() {

        public final void a(ckw ckw1, Map map)
        {
            map = ckw1.h();
            if (map != null)
            {
                map.a();
                return;
            }
            ckw1 = ckw1.i();
            if (ckw1 != null)
            {
                ckw1.a();
                return;
            } else
            {
                bka.e("A GMSG tried to close something that wasn't an overlay.");
                return;
            }
        }

    };
    public static final cdi e = new cdi() {

        public final void a(ckw ckw1, Map map)
        {
            ckw1.b("1".equals(map.get("custom_close")));
        }

    };
    public static final cdi f = new cdi() {

        public final void a(ckw ckw1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                bka.e("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new ckc(ckw1.getContext(), ckw1.n().b, map)).e();
                return;
            }
        }

    };
    public static final cdi g = new cdi() {

        public final void a(ckw ckw, Map map)
        {
            bka.c((new StringBuilder("Received log message: ")).append((String)map.get("string")).toString());
        }

    };
    public static final cdi h = new cdi() {

        public final void a(ckw ckw1, Map map)
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
                ckw1 = ckw1.m();
            }
            // Misplaced declaration of an exception variable
            catch (ckw ckw1)
            {
                bka.e("Could not parse touch parameters from gmsg.");
                return;
            }
            if (ckw1 == null)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            ((bzm) (ckw1)).b.a(i1, j1, k1);
        }

    };
    public static final cdi i = new cdi() {

        public final void a(ckw ckw1, Map map)
        {
            cax cax = cbb.Q;
            if (!((Boolean)bkv.n().a(cax)).booleanValue())
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
            ckw1.c(flag);
        }

    };
    public static final cdi j = new cdw();
    public static final cdi k = new cea();
    public static final cdi l = new cdg();

    static 
    {
        new cdi() {

            public final void a(ckw ckw, Map map)
            {
            }

        };
    }
}
