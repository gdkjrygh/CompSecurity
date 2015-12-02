// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.protocol;

import com.facebook.http.e.a;
import com.facebook.http.e.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.user.User;
import com.facebook.user.ac;
import com.facebook.user.n;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.auth.protocol:
//            j, GetLoggedInUserResult

public class h
    implements f
{

    private final j a;
    private final ac b;
    private final com.facebook.common.time.a c;

    public h(j j1, ac ac1, com.facebook.common.time.a a1)
    {
        a = j1;
        b = ac1;
        c = a1;
    }

    private String a()
    {
        a a1 = new a();
        a1.a("user", "SELECT uid, first_name, last_name, contact_email, phones, is_pushable, affiliations FROM user WHERE uid=me()");
        a1.a("profile", "SELECT id, name, type, pic_big, pic_square, pic_crop FROM profile WHERE id=me()");
        return a1.a().toString();
    }

    public GetLoggedInUserResult a(Void void1, r r1)
    {
        r1 = new b(r1.c());
        void1 = r1.a("user");
        r1 = r1.a("profile");
        void1 = a.a(void1, r1);
        void1 = b.a(n.FACEBOOK, void1);
        if (void1.size() != 1)
        {
            throw new Exception("Invalid api response - multiple result users");
        } else
        {
            void1 = (User)void1.get(0);
            return new GetLoggedInUserResult(com.facebook.fbservice.c.b.FROM_SERVER, void1, c.a());
        }
    }

    public volatile com.facebook.http.protocol.n a(Object obj)
    {
        return a((Void)obj);
    }

    public com.facebook.http.protocol.n a(Void void1)
    {
        void1 = hq.a();
        void1.add(new BasicNameValuePair("format", "json"));
        void1.add(new BasicNameValuePair("queries", a()));
        return new com.facebook.http.protocol.n("meUser", "GET", "method/fql.multiquery", void1, t.JSON);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((Void)obj, r1);
    }
}
