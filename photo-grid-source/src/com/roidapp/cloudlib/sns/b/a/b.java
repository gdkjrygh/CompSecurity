// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b.a;

import com.roidapp.cloudlib.sns.b.v;
import com.roidapp.cloudlib.sns.b.x;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class b extends ArrayList
    implements v
{

    public boolean a;

    public b()
    {
    }

    public final void a(JSONObject jsonobject, boolean flag)
    {
        boolean flag1 = false;
        jsonobject = jsonobject.optJSONArray("data");
        if (jsonobject != null && jsonobject.length() > 0)
        {
            for (int i = 0; i < jsonobject.length(); i++)
            {
                Object obj = jsonobject.optJSONObject(i);
                if (obj == null)
                {
                    continue;
                }
                obj = x.a(((JSONObject) (obj)), null, flag);
                if (obj != null)
                {
                    add(obj);
                }
            }

            flag = flag1;
            if (!isEmpty())
            {
                flag = true;
            }
            a = flag;
        }
    }
}
