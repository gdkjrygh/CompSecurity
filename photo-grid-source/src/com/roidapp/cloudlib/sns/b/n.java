// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;

import com.roidapp.cloudlib.sns.b.a.a;
import com.roidapp.cloudlib.sns.b.a.i;
import com.roidapp.cloudlib.sns.g.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns.b:
//            v, o, x, g

public class n
    implements v
{

    public o a;
    public x b;
    public a c;
    public i d;
    public List e;
    public g f;
    public boolean g;

    public n()
    {
    }

    public static n a(JSONObject jsonobject, n n1, boolean flag)
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            n n2 = n1;
            if (n1 == null)
            {
                n2 = new n();
            }
            n2.g = jsonobject.optBoolean("isRecommend", false);
            n2.a = com.roidapp.cloudlib.sns.b.o.a(jsonobject);
            n2.b = com.roidapp.cloudlib.sns.b.x.a(jsonobject.optJSONObject("user"), null, flag);
            if (!n2.g)
            {
                n2.c = com.roidapp.cloudlib.sns.b.a.a.a(jsonobject.optJSONArray("commentlist"), null, flag);
                n2.d = i.a(jsonobject.optJSONArray("likelist"), flag);
                if (jsonobject.optBoolean("liked", false))
                {
                    n1 = com.roidapp.cloudlib.sns.b.g.b;
                } else
                {
                    n1 = g.c;
                }
                n2.f = n1;
                jsonobject = jsonobject.optJSONArray("taglist");
                if (jsonobject != null && jsonobject.length() > 0)
                {
                    n2.e = new ArrayList();
                    for (int j = 0; j < jsonobject.length(); j++)
                    {
                        n2.e.add(jsonobject.optString(j));
                    }

                }
            }
            jsonobject = n2;
            if (flag)
            {
                com.roidapp.cloudlib.sns.g.b.a();
                com.roidapp.cloudlib.sns.g.b.a(n2);
                return n2;
            }
        }
        return jsonobject;
    }

    public final void a(JSONObject jsonobject, boolean flag)
    {
        jsonobject = jsonobject.optJSONObject("data");
        if (jsonobject != null)
        {
            a(jsonobject, this, flag);
        }
    }
}
