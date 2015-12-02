// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.m;
import com.facebook.http.e.a;
import com.facebook.http.e.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.server.FetchMessageResult;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            p, q

public class j
    implements f
{

    private final p a;

    public j(p p1)
    {
        a = p1;
    }

    private String b(String s)
    {
        a a1 = new a();
        a.b(a1, m.a("message_id='%1s'", new Object[] {
            s
        }), "timestamp DESC", 1);
        return a1.a().toString();
    }

    public volatile n a(Object obj)
    {
        return a((String)obj);
    }

    public n a(String s)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("q", b(s)));
        return new n("fetchMoreMessages", "GET", "fql", arraylist, t.JSON);
    }

    public FetchMessageResult a(String s, r r1)
    {
        s = new b(r1.c());
        s = a.b(s, 1);
        r1 = com.facebook.fbservice.c.b.FROM_SERVER;
        if (((q) (s)).a.isEmpty())
        {
            s = null;
        } else
        {
            s = (Message)((q) (s)).a.get(0);
        }
        return new FetchMessageResult(r1, s, System.currentTimeMillis());
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((String)obj, r1);
    }
}
