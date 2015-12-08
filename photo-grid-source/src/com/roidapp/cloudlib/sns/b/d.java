// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;

import android.graphics.Color;
import com.roidapp.baselib.c.n;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns.b:
//            e

public final class d
{

    public int a;
    public String b;
    public String c;
    public String d;
    public long e;
    public long f;
    public boolean g;
    public e h;
    public int i[];

    public d()
    {
    }

    public static d a(JSONObject jsonobject)
    {
        d d1;
        int j;
        j = 0;
        if (jsonobject == null)
        {
            return null;
        }
        d1 = new d();
        d1.a = jsonobject.optInt("id");
        d1.b = jsonobject.optString("banner_url");
        d1.c = jsonobject.optString("tag");
        d1.d = jsonobject.optString("description");
        d1.e = n.a(jsonobject, "create_at");
        d1.f = n.a(jsonobject, "update_at");
        d1.g = jsonobject.optBoolean("is_valid");
        jsonobject = jsonobject.optJSONObject("bg_color");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        String s;
        s = jsonobject.optString("type");
        if (e.b.a().equals(s))
        {
            d1.h = e.b;
            d1.i = (new int[] {
                Color.parseColor(jsonobject.optString("color"))
            });
            break MISSING_BLOCK_LABEL_234;
        }
        if (!e.a.a().equals(s))
        {
            break MISSING_BLOCK_LABEL_234;
        }
        d1.h = e.a;
        jsonobject = jsonobject.optJSONArray("color");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        if (jsonobject.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        d1.i = new int[jsonobject.length()];
_L1:
        if (j >= jsonobject.length())
        {
            break MISSING_BLOCK_LABEL_234;
        }
        d1.i[j] = Color.parseColor(jsonobject.optString(j));
        j++;
          goto _L1
        jsonobject;
        d1.h = null;
        d1.i = null;
        return d1;
    }
}
