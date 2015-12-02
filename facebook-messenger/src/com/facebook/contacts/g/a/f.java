// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g.a;

import com.facebook.common.w.m;
import com.facebook.contacts.server.FetchMobileAppDataResult;
import com.facebook.fbservice.c.b;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.user.ac;
import com.facebook.user.n;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class f
    implements com.facebook.http.protocol.f
{

    private final ac a;

    public f(ac ac1)
    {
        a = ac1;
    }

    private String b(Integer integer)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SELECT uid, mobile_app_data FROM user WHERE ");
        stringbuilder.append(m.a("uid in (SELECT uid2 FROM  friend WHERE uid1=me() order by communication_rank desc LIMIT %d)", new Object[] {
            integer
        }));
        return stringbuilder.toString();
    }

    public FetchMobileAppDataResult a(Integer integer, r r1)
    {
        r1.f();
        integer = (ArrayNode)r1.c();
        integer = a.a(n.FACEBOOK, integer);
        return new FetchMobileAppDataResult(b.FROM_SERVER, integer, System.currentTimeMillis());
    }

    public com.facebook.http.protocol.n a(Integer integer)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("query", b(integer)));
        return new com.facebook.http.protocol.n("fetchMobileAppDataMethod", "GET", "method/fql.query", arraylist, t.JSON);
    }

    public volatile com.facebook.http.protocol.n a(Object obj)
    {
        return a((Integer)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((Integer)obj, r1);
    }
}
