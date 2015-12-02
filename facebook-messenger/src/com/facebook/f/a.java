// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.f;

import android.os.Bundle;
import com.facebook.common.w.e;
import com.facebook.common.w.k;
import com.facebook.http.e.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.f:
//            b, c

public class a
    implements f
{

    public a()
    {
    }

    public Bundle a(com.facebook.f.b b1, r r1)
    {
        b1 = (new b(r1.c())).a("gk");
        r1 = new Bundle();
        for (int i = 0; i < b1.size(); i++)
        {
            JsonNode jsonnode = b1.get(i);
            r1.putBoolean(e.b(jsonnode.get("project_name")), jsonnode.get("result").booleanValue());
        }

        return r1;
    }

    public n a(com.facebook.f.b b1)
    {
        Object obj = b1.a;
        java.util.ArrayList arraylist;
        boolean flag;
        if (b1.b == c.IS_SESSIONLESS)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b1 = new com.facebook.http.e.a();
        b1.a("gk", (new StringBuilder()).append("SELECT project_name, result FROM project_gating WHERE project_name IN ").append(k.b(((Iterable) (obj)))).toString());
        arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("queries", b1.a().toString()));
        if (flag)
        {
            b1 = "fetchSessionlessAppInfo";
        } else
        {
            b1 = "fetchAppInfo";
        }
        if (flag)
        {
            obj = "POST";
        } else
        {
            obj = "GET";
        }
        return new n(b1, ((String) (obj)), "method/fql.multiquery", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((com.facebook.f.b)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((com.facebook.f.b)obj, r1);
    }
}
