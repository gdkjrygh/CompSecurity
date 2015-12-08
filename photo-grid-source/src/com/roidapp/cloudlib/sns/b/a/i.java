// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b.a;

import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.sns.b.f;
import com.roidapp.cloudlib.sns.b.x;
import java.util.ArrayList;
import org.json.JSONArray;

public final class i extends ArrayList
{

    public boolean a;

    public i()
    {
    }

    public static i a(JSONArray jsonarray, boolean flag)
    {
        boolean flag1 = false;
        if (jsonarray == null || jsonarray.length() == 0)
        {
            return null;
        }
        i j = new i();
        for (int k = 0; k < jsonarray.length(); k++)
        {
            org.json.JSONObject jsonobject = jsonarray.optJSONObject(k);
            f f1 = new f();
            f1.a = x.a(jsonobject, null, flag);
            f1.b = n.a(jsonobject, "time");
            j.add(f1);
        }

        flag = flag1;
        if (!j.isEmpty())
        {
            flag = true;
        }
        j.a = flag;
        return j;
    }
}
