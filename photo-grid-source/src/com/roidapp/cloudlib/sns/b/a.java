// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;

import com.roidapp.baselib.c.n;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns.b:
//            v, x

public class a
    implements v
{

    public long a;
    public long b;
    public String c;
    public x d;
    public int e;

    public a()
    {
    }

    public static a a(JSONObject jsonobject, a a1, boolean flag)
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            a a2 = a1;
            if (a1 == null)
            {
                a2 = new a();
            }
            a2.a = n.a(jsonobject, "cid");
            a2.b = n.a(jsonobject, "createTime");
            a2.c = jsonobject.optString("content");
            a1 = jsonobject.optJSONObject("user");
            jsonobject = a2;
            if (a1 != null)
            {
                a2.d = x.a(a1, null, flag);
                return a2;
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

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (a)obj;
            if (a != ((a) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (int)(a ^ a >>> 32);
    }
}
