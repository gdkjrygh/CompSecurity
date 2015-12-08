// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b.a;

import com.roidapp.cloudlib.sns.b.v;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class a extends ArrayList
    implements v
{

    public boolean a;

    public a()
    {
    }

    public static a a(JSONArray jsonarray, a a1, boolean flag)
    {
        boolean flag1 = false;
        if (jsonarray == null || jsonarray.length() == 0)
        {
            return null;
        }
        a a2 = a1;
        if (a1 == null)
        {
            a2 = new a();
        }
        for (int i = 0; i < jsonarray.length(); i++)
        {
            a1 = jsonarray.optJSONObject(i);
            if (a1 != null)
            {
                a2.add(com.roidapp.cloudlib.sns.b.a.a(a1, null, flag));
            }
        }

        flag = flag1;
        if (!a2.isEmpty())
        {
            flag = true;
        }
        a2.a = flag;
        return a2;
    }

    public final void a(JSONObject jsonobject, boolean flag)
    {
        jsonobject = jsonobject.optJSONArray("data");
        if (jsonobject != null && jsonobject.length() > 0)
        {
            a(((JSONArray) (jsonobject)), this, flag);
        }
    }
}
