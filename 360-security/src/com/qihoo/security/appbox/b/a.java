// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.b;

import android.content.Context;
import com.qihoo.security.appbox.core.c;
import com.qihoo360.mobilesafe.b.i;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{

    private static float a(String s)
    {
        float f;
        try
        {
            f = Float.valueOf(s).floatValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0.0F;
        }
        return f;
    }

    public static c a(Context context, JSONObject jsonobject)
    {
        c c1 = new c();
        c1.e = jsonobject.optString("picks_pic_url");
        c1.d = jsonobject.optString("banner_pic_url");
        c1.f = jsonobject.optString("googleplay_url");
        c1.g = jsonobject.optInt("gp_url_type", 1);
        c1.h = jsonobject.optString("icon_url");
        c1.i = jsonobject.optString("id");
        c1.j = jsonobject.optString("name");
        c1.k = jsonobject.optString("pkg_name");
        c1.l = jsonobject.optInt("size", 0);
        c1.m = a(jsonobject.optString("star_level"));
        c1.b = jsonobject.optString("summary");
        c1.n = jsonobject.optString("type");
        c1.c = i.a(context, c1.k);
        return c1;
    }

    public static ArrayList a(Context context, JSONObject jsonobject, String s, int j)
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONArray(s);
        int l = jsonobject.length();
        for (int k = 0; k < l; k++)
        {
            c c1 = a(context, jsonobject.optJSONObject(k));
            c1.a = j + k;
            arraylist.add(c1);
        }

        if (!"banner".equals(s))
        {
            Collections.sort(arraylist);
        }
        return arraylist;
    }

    public static JSONObject a(c c1)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("picks_pic_url", c1.e);
            jsonobject.put("banner_pic_url", c1.d);
            jsonobject.put("googleplay_url", c1.f);
            jsonobject.put("gp_url_type", c1.g);
            jsonobject.put("icon_url", c1.h);
            jsonobject.put("id", c1.i);
            jsonobject.put("name", c1.j);
            jsonobject.put("pkg_name", c1.k);
            jsonobject.put("size", c1.l);
            jsonobject.put("star_level", c1.m);
            jsonobject.put("summary", c1.b);
            jsonobject.put("type", c1.n);
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            c1.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }
}
