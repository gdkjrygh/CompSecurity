// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appconfig;

import com.facebook.config.a.a;
import com.facebook.http.e.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.appconfig:
//            AppConfig

public class o
    implements f
{

    private final String a = "client_config";
    private final String b;
    private final com.facebook.common.time.a c;

    public o(a a1, com.facebook.common.time.a a2)
    {
        b = (new StringBuilder()).append("SELECT client_config FROM application WHERE app_id='").append(a1.b()).append("'").toString();
        c = a2;
    }

    public AppConfig a(Void void1, r r1)
    {
        Object obj = null;
        void1 = (new b(r1.c())).a("info");
        if (void1 == null || void1.size() != 1)
        {
            throw new Exception("Invalid api response - missing row");
        }
        r1 = void1.get(0);
        void1 = obj;
        if (r1.has("client_config"))
        {
            void1 = obj;
            if (r1.get("client_config").isObject())
            {
                r1 = r1.get("client_config");
                long l = c.a();
                void1 = obj;
                if (r1 != null)
                {
                    void1 = new AppConfig(r1, l);
                }
            }
        }
        return void1;
    }

    public volatile n a(Object obj)
    {
        return a((Void)obj);
    }

    public n a(Void void1)
    {
        void1 = new com.facebook.http.e.a();
        void1.a("info", b);
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("queries", void1.a().toString()));
        return new n("fetchAppInfo", "GET", "method/fql.multiquery", arraylist, t.JSON);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((Void)obj, r1);
    }
}
