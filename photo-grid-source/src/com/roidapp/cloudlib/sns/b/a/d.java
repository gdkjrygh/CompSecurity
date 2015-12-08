// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b.a;

import com.roidapp.cloudlib.sns.b.v;
import com.roidapp.cloudlib.sns.b.x;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class d extends ArrayList
    implements v
{

    public String a;

    public d()
    {
    }

    public final void a(JSONObject jsonobject, boolean flag)
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("data");
        if (jsonobject1 != null)
        {
            a = jsonobject1.optString("banner");
            jsonobject = jsonobject1.optJSONArray("user");
        } else
        {
            jsonobject = jsonobject.optJSONArray("data");
        }
        if (jsonobject != null && jsonobject.length() > 0)
        {
            for (int i = 0; i < jsonobject.length(); i++)
            {
                JSONObject jsonobject2 = jsonobject.optJSONObject(i);
                if (jsonobject2 != null)
                {
                    add(x.a(jsonobject2, null, flag));
                }
            }

        }
    }
}
