// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b.a;

import android.graphics.Color;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.sns.b.u;
import com.roidapp.cloudlib.sns.b.v;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class f extends ArrayList
    implements v
{

    public f()
    {
    }

    public final void a(JSONObject jsonobject, boolean flag)
    {
        JSONArray jsonarray = jsonobject.optJSONArray("data");
        if (jsonarray != null && jsonarray.length() > 0)
        {
            int i = 0;
            while (i < jsonarray.length()) 
            {
                JSONObject jsonobject1 = jsonarray.optJSONObject(i);
                if (jsonobject1 != null)
                {
                    if (jsonobject1 == null)
                    {
                        jsonobject = null;
                    } else
                    {
                        jsonobject = new u();
                        jsonobject.a = jsonobject1.optString("tagname");
                        jsonobject.b = jsonobject1.optString("picUrl");
                        jsonobject.c = jsonobject1.optInt("position");
                        jsonobject.d = n.a(jsonobject1, "createTime");
                        jsonobject.e = n.a(jsonobject1, "startTime");
                        jsonobject.f = n.a(jsonobject1, "endTime");
                        jsonobject.g = Color.parseColor(jsonobject1.optString("tagColor", "#ff0000"));
                    }
                    add(jsonobject);
                }
                i++;
            }
        }
    }
}
