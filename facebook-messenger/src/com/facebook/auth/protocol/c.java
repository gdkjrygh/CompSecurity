// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.protocol;

import com.facebook.auth.credentials.FacebookCredentials;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.common.w.e;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.auth.protocol:
//            d, AuthenticationResultImpl, AuthenticationResult

public class c
    implements f
{

    public c()
    {
    }

    public AuthenticationResult a(d d1, r r1)
    {
        Object obj = r1.c();
        r1 = e.b(((JsonNode) (obj)).get("uid"));
        String s = e.b(((JsonNode) (obj)).get("access_token"));
        String s1 = e.b(((JsonNode) (obj)).get("machine_id"));
        String s2 = e.b(((JsonNode) (obj)).get("secret"));
        ArrayNode arraynode = (ArrayNode)((JsonNode) (obj)).get("session_cookies");
        obj = e.b(((JsonNode) (obj)).get("session_key"));
        String s3 = d.a(d1).a();
        if (arraynode == null)
        {
            d1 = null;
        } else
        {
            d1 = arraynode.toString();
        }
        return new AuthenticationResultImpl(r1, new FacebookCredentials(r1, s, 0L, d1, s2, ((String) (obj)), s3), s1);
    }

    public n a(d d1)
    {
        PasswordCredentials passwordcredentials = d.a(d1);
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("email", passwordcredentials.a()));
        arraylist.add(new BasicNameValuePair("password", passwordcredentials.b()));
        if (d.b(d1))
        {
            arraylist.add(new BasicNameValuePair("generate_session_cookies", "1"));
        }
        if (d.c(d1) != null)
        {
            arraylist.add(new BasicNameValuePair("machine_id", d.c(d1)));
        } else
        {
            arraylist.add(new BasicNameValuePair("generate_machine_id", "1"));
        }
        return new n("authenticate", "POST", "method/auth.login", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((d)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((d)obj, r1);
    }
}
