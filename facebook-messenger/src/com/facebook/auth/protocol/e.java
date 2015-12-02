// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.protocol;

import com.facebook.auth.credentials.FacebookCredentials;
import com.facebook.config.a.c;
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
//            AuthenticationResultImpl, f, AuthenticationResult

public class e
    implements f
{

    private final c a;

    public e(c c1)
    {
        a = c1;
    }

    public AuthenticationResult a(com.facebook.auth.protocol.f f1, r r1)
    {
        Object obj = r1.c();
        r1 = com.facebook.common.w.e.b(((JsonNode) (obj)).get("uid"));
        String s = com.facebook.common.w.e.b(((JsonNode) (obj)).get("access_token"));
        String s1 = com.facebook.common.w.e.b(((JsonNode) (obj)).get("machine_id"));
        f1 = (ArrayNode)((JsonNode) (obj)).get("session_cookies");
        String s2 = com.facebook.common.w.e.b(((JsonNode) (obj)).get("secret"));
        obj = com.facebook.common.w.e.b(((JsonNode) (obj)).get("session_key"));
        if (f1 == null)
        {
            f1 = null;
        } else
        {
            f1 = f1.toString();
        }
        return new AuthenticationResultImpl(r1, new FacebookCredentials(r1, s, 0L, f1, s2, ((String) (obj)), null), s1);
    }

    public n a(com.facebook.auth.protocol.f f1)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("access_token", f.a(f1)));
        arraylist.add(new BasicNameValuePair("new_app_id", a.b()));
        if (f.b(f1))
        {
            arraylist.add(new BasicNameValuePair("generate_session_cookies", "1"));
        }
        if (com.facebook.auth.protocol.f.c(f1) != null)
        {
            arraylist.add(new BasicNameValuePair("machine_id", com.facebook.auth.protocol.f.c(f1)));
        } else
        {
            arraylist.add(new BasicNameValuePair("generate_machine_id", "1"));
        }
        return new n("authenticate", "POST", "method/auth.getSessionForApp", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((com.facebook.auth.protocol.f)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((com.facebook.auth.protocol.f)obj, r1);
    }
}
