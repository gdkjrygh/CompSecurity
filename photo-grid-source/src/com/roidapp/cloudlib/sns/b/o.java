// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;

import com.roidapp.baselib.c.n;
import org.json.JSONArray;
import org.json.JSONObject;

public final class o
{

    public int a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public String m;
    public String n;

    public o()
    {
    }

    public static o a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            o o1 = new o();
            JSONObject jsonobject1 = jsonobject.optJSONObject("thrumbNail");
            if (jsonobject1 != null)
            {
                o1.e = jsonobject1.optString("small");
                o1.f = jsonobject1.optString("middle");
            }
            if (jsonobject.optBoolean("isRecommend", false))
            {
                JSONArray jsonarray = jsonobject.optJSONArray("extraThumbnail");
                jsonobject = o1;
                if (jsonarray != null)
                {
                    if (jsonarray.length() == 1)
                    {
                        o1.m = jsonarray.optJSONObject(0).optString("small");
                        return o1;
                    }
                    jsonobject = o1;
                    if (jsonarray.length() == 2)
                    {
                        o1.m = jsonarray.optJSONObject(0).optString("small");
                        o1.n = jsonarray.optJSONObject(1).optString("small");
                        return o1;
                    }
                }
            } else
            {
                o1.a = jsonobject.optInt("pid");
                o1.b = com.roidapp.baselib.c.n.a(jsonobject, "uid");
                o1.c = jsonobject.optString("image");
                o1.g = jsonobject.optString("type");
                o1.h = jsonobject.optInt("likeCount");
                o1.i = jsonobject.optInt("commentCount");
                o1.j = com.roidapp.baselib.c.n.a(jsonobject, "createTime");
                o1.k = jsonobject.optBoolean("enable");
                o1.d = jsonobject.optString("txturl");
                o1.l = jsonobject.optBoolean("isUrl");
                return o1;
            }
        }
        return jsonobject;
    }
}
