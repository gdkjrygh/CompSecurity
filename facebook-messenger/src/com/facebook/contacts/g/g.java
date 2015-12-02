// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g;

import com.facebook.common.time.a;
import com.facebook.common.w.e;
import com.facebook.contacts.server.FetchChatContextParams;
import com.facebook.contacts.server.FetchChatContextResult;
import com.facebook.contacts.server.w;
import com.facebook.contacts.server.x;
import com.facebook.debug.log.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.user.ChatContext;
import com.facebook.user.UserKey;
import com.facebook.user.d;
import com.facebook.user.n;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.hq;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class g
    implements f
{

    private static final Class a = com/facebook/contacts/g/g;
    private static final EnumSet b;
    private static final ev c;
    private final a d;
    private final w e;

    public g(a a1, w w1)
    {
        d = a1;
        e = w1;
    }

    private ChatContext a(JsonNode jsonnode)
    {
        if (jsonnode == null)
        {
            return null;
        }
        if (!jsonnode.has("type") || !jsonnode.has("subtext"))
        {
            return null;
        }
        String s = com.facebook.common.w.e.b(jsonnode.get("type"));
        d d1 = (d)c.get(s);
        if (d1 == null)
        {
            com.facebook.debug.log.b.d(a, (new StringBuilder()).append("Invalid chat context type: ").append(s).toString());
            return null;
        } else
        {
            return new ChatContext(com.facebook.common.w.e.b(jsonnode.get("subtext")), d1, com.facebook.common.w.e.f(jsonnode.get("distance")));
        }
    }

    public FetchChatContextResult a(FetchChatContextParams fetchchatcontextparams, r r1)
    {
        r1.f();
        r1 = (ArrayNode)r1.c();
        fetchchatcontextparams = ev.k();
        r1 = r1.iterator();
        do
        {
            if (!r1.hasNext())
            {
                break;
            }
            Object obj = (JsonNode)r1.next();
            String s = com.facebook.common.w.e.b(((JsonNode) (obj)).get("uid"));
            obj = a(((JsonNode) (obj)).get("chat_context"));
            if (obj != null)
            {
                com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Adding chat context: ").append(obj).append(" for uid ").append(s).toString());
                fetchchatcontextparams.b(new UserKey(n.FACEBOOK, s), obj);
            }
        } while (true);
        return new FetchChatContextResult(com.facebook.fbservice.c.b.FROM_SERVER, d.a(), fetchchatcontextparams.b());
    }

    public com.facebook.http.protocol.n a(FetchChatContextParams fetchchatcontextparams)
    {
        fetchchatcontextparams = hq.a();
        fetchchatcontextparams.add(new BasicNameValuePair("format", "json"));
        fetchchatcontextparams.add(new BasicNameValuePair("query", e.b(b, 300)));
        return new com.facebook.http.protocol.n("fetchChatContextMethod", "GET", "method/fql.query", fetchchatcontextparams, t.JSON);
    }

    public volatile com.facebook.http.protocol.n a(Object obj)
    {
        return a((FetchChatContextParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchChatContextParams)obj, r1);
    }

    static 
    {
        b = EnumSet.of(x.TOP_FRIENDS, x.FAVORITE_FRIENDS);
        c = ev.k().b("nearby", d.NEARBY).b("visiting", d.VISITING).b("birthday", d.BIRTHDAY).b("checkin", d.CHECKIN).b("celebration", d.CELEBRATION).b("neighbourhood", d.NEIGHBORHOOD).b("listening", d.LISTENING).b("presence", d.PRESENCE).b("other", d.OTHER).b();
    }
}
