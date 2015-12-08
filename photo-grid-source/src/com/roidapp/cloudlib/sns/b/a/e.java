// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b.a;

import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.v;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class e extends ArrayList
    implements v
{

    public boolean a;

    public e()
    {
    }

    public static e a(JSONArray jsonarray, e e1, boolean flag)
    {
        boolean flag1 = false;
        if (jsonarray == null || jsonarray.length() == 0)
        {
            return null;
        }
        e e2 = e1;
        if (e1 == null)
        {
            e2 = new e();
        }
        for (int i = 0; i < jsonarray.length(); i++)
        {
            e1 = jsonarray.optJSONObject(i);
            if (e1 == null)
            {
                continue;
            }
            e1 = n.a(e1, null, flag);
            if (e1 != null)
            {
                e2.add(e1);
            }
        }

        flag = flag1;
        if (!e2.isEmpty())
        {
            flag = true;
        }
        e2.a = flag;
        return e2;
    }

    public final void a(JSONObject jsonobject, boolean flag)
    {
        a(jsonobject.optJSONArray("data"), this, flag);
    }
}
