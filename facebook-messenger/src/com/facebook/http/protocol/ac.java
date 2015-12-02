// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import com.facebook.common.w.e;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.client.HttpResponseException;
import org.apache.http.message.BasicHeader;

// Referenced classes of package com.facebook.http.protocol:
//            s

public class ac
{

    private final s a;
    private int b;
    private List c;

    public ac(s s1)
    {
        a = s1;
    }

    private List b(JsonNode jsonnode)
    {
        java.util.ArrayList arraylist = hq.a();
        for (int i = 0; i < jsonnode.size(); i++)
        {
            JsonNode jsonnode1 = jsonnode.get(i);
            arraylist.add(new BasicHeader(e.b(jsonnode1.get("name")), e.b(jsonnode1.get("value"))));
        }

        return arraylist;
    }

    public String a(JsonNode jsonnode)
    {
        c = b(jsonnode.get("headers"));
        b = e.d(jsonnode.get("code"));
        jsonnode = e.b(jsonnode.get("body"));
        if (b >= 300)
        {
            if (b == 400)
            {
                a.a(jsonnode);
            }
            throw new HttpResponseException(b, null);
        } else
        {
            return jsonnode;
        }
    }

    public List a()
    {
        return c;
    }

    public int b()
    {
        return b;
    }
}
