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
//            cj, cd, gu, gr, 
//            l, k, gp, gs, 
//            dp, g

public final class cc
{

    public static final cd pQ = new cd() {

        public void a(gu gu, Map map)
        {
        }

    };
    public static final cd pR = new cd() {

        public void a(gu gu1, Map map)
        {
            map = (String)map.get("urls");
            if (TextUtils.isEmpty(map))
            {
                gr.W("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = gu1.getContext().getPackageManager();
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
            gu1.a("openableURLs", hashmap);
        }

    };
    public static final cd pS = new cd() {

        public void a(gu gu1, Map map)
        {
            PackageManager packagemanager = gu1.getContext().getPackageManager();
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
                gu1.b("openableIntents", new JSONObject());
                return;
            }
            try
            {
                map = map.getJSONArray("intents");
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                gu1.b("openableIntents", new JSONObject());
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
                        gr.b("Error parsing the intent data.", jsonexception);
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
                        gr.b("Error constructing openable urls response.", jsonexception1);
                    }
                }
                i++;
            } while (true);
            gu1.b("openableIntents", jsonobject);
        }

    };
    public static final cd pT = new cd() {

        public void a(gu gu1, Map map)
        {
            String s;
            s = (String)map.get("u");
            if (s == null)
            {
                gr.W("URL missing from click GMSG.");
                return;
            }
            map = Uri.parse(s);
            Object obj = gu1.dF();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            if (!((k) (obj)).b(map))
            {
                break MISSING_BLOCK_LABEL_59;
            }
            obj = ((k) (obj)).a(map, gu1.getContext());
            map = ((Map) (obj));
_L2:
            map = map.toString();
            (new gp(gu1.getContext(), gu1.dG().wS, map)).start();
            return;
            l l1;
            l1;
            gr.W((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
            if (true) goto _L2; else goto _L1
_L1:
        }

    };
    public static final cd pU = new cd() {

        public void a(gu gu1, Map map)
        {
            gu1 = gu1.dC();
            if (gu1 == null)
            {
                gr.W("A GMSG tried to close something that wasn't an overlay.");
                return;
            } else
            {
                gu1.close();
                return;
            }
        }

    };
    public static final cd pV = new cd() {

        public void a(gu gu1, Map map)
        {
            gu1.q("1".equals(map.get("custom_close")));
        }

    };
    public static final cd pW = new cd() {

        public void a(gu gu1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                gr.W("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new gp(gu1.getContext(), gu1.dG().wS, map)).start();
                return;
            }
        }

    };
    public static final cd pX = new cd() {

        public void a(gu gu, Map map)
        {
            gr.U((new StringBuilder()).append("Received log message: ").append((String)map.get("string")).toString());
        }

    };
    public static final cd pY = new cd() {

        public void a(gu gu1, Map map)
        {
            String s = (String)map.get("tx");
            String s1 = (String)map.get("ty");
            map = (String)map.get("td");
            int i;
            int j;
            int l;
            try
            {
                i = Integer.parseInt(s);
                j = Integer.parseInt(s1);
                l = Integer.parseInt(map);
                gu1 = gu1.dF();
            }
            // Misplaced declaration of an exception variable
            catch (gu gu1)
            {
                gr.W("Could not parse touch parameters from gmsg.");
                return;
            }
            if (gu1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            gu1.C().a(i, j, l);
        }

    };
    public static final cd pZ = new cj();

}
