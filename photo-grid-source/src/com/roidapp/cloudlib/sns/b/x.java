// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;

import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.sns.g.b;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns.b:
//            v, c

public class x
    implements v
{

    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public long o;
    public long p;
    public c q;
    public boolean r;

    public x()
    {
    }

    public static x a(JSONObject jsonobject, x x1, boolean flag)
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            x x2 = x1;
            if (x1 == null)
            {
                x2 = new x();
            }
            x2.a = com.roidapp.baselib.c.n.a(jsonobject, "uid");
            x2.b = jsonobject.optString("nickname");
            x2.c = jsonobject.optString("name");
            x2.d = jsonobject.optString("gender");
            x2.e = jsonobject.optString("birthDay");
            x2.f = jsonobject.optString("email");
            x2.g = jsonobject.optString("locale");
            x2.h = jsonobject.optString("avatar");
            x2.i = jsonobject.optInt("postCount");
            x2.j = jsonobject.optInt("fansCount");
            x2.k = jsonobject.optInt("followsCount");
            x2.l = jsonobject.optInt("likeCount");
            x2.m = jsonobject.optInt("commentCount");
            x2.n = com.roidapp.baselib.c.n.a(jsonobject, "createTime");
            x2.o = com.roidapp.baselib.c.n.a(jsonobject, "activeTime");
            x2.p = com.roidapp.baselib.c.n.a(jsonobject, "modifyTime");
            if (jsonobject.optBoolean("followed", false))
            {
                x1 = com.roidapp.cloudlib.sns.b.c.b;
            } else
            {
                x1 = c.c;
            }
            x2.q = x1;
            x2.r = jsonobject.optBoolean("isReg", false);
            jsonobject = x2;
            if (flag)
            {
                com.roidapp.cloudlib.sns.g.b.a();
                com.roidapp.cloudlib.sns.g.b.b(x2);
                return x2;
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
            obj = (x)obj;
            if (a != ((x) (obj)).a)
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
