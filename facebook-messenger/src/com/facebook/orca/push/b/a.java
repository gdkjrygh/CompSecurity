// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.b;

import com.facebook.analytics.cn;
import com.facebook.common.w.e;
import com.facebook.common.w.n;
import com.facebook.config.a.d;
import com.facebook.l.k;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.f.l;
import com.facebook.orca.fbwebrtc.ag;
import com.facebook.orca.push.a.b;
import com.facebook.push.g;
import com.facebook.push.mqtt.av;
import com.facebook.user.UserKey;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class a
    implements av
{

    private static final Class a = com/facebook/orca/push/b/a;
    private final com.facebook.orca.push.b b;
    private final b c;
    private final javax.inject.a d;
    private final k e;
    private final cn f;
    private final ObjectMapper g;
    private final ag h;
    private final com.facebook.auth.b.b i;
    private final com.facebook.config.a.a j;
    private final com.facebook.launcherbadges.a k;

    public a(com.facebook.orca.push.b b1, b b2, javax.inject.a a1, k k1, cn cn1, ObjectMapper objectmapper, ag ag1, 
            com.facebook.auth.b.b b3, com.facebook.launcherbadges.a a2, com.facebook.config.a.a a3)
    {
        b = b1;
        c = b2;
        d = a1;
        e = k1;
        f = cn1;
        g = objectmapper;
        h = ag1;
        i = b3;
        k = a2;
        j = a3;
    }

    private String a(Message message)
    {
        String s1 = message.i().d();
        String s = message.k();
        if (n.a(s1) || n.a(s))
        {
            return null;
        }
        message = s;
        if (s.length() > 120)
        {
            message = s.substring(0, 120);
        }
        return (new StringBuilder()).append(s1).append(": ").append(message).toString();
    }

    private void a(g g1)
    {
        f.a("", "", g1.toString(), "invalid_payload");
    }

    private void a(JsonNode jsonnode)
    {
        String s = com.facebook.common.w.e.b(jsonnode.get("type"));
        if (!"message".equals(s)) goto _L2; else goto _L1
_L1:
        jsonnode = c.a(jsonnode);
        if (jsonnode == null) goto _L4; else goto _L3
_L3:
        s = jsonnode.e();
        String s2 = a(((Message) (jsonnode)));
        e.a(jsonnode);
        b.a(s2, s, jsonnode, g.MQTT);
_L6:
        return;
_L4:
        a(g.MQTT);
        return;
_L2:
        if ("typ".equals(s))
        {
            String s1 = com.facebook.common.w.e.b(jsonnode.get("sender_fbid"));
            int i1 = com.facebook.common.w.e.d(jsonnode.get("state"));
            e.a(new UserKey(com.facebook.user.n.FACEBOOK, s1), i1);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void b(JsonNode jsonnode)
    {
        boolean flag = Objects.equal("full", com.facebook.common.w.e.b(jsonnode.get("list_type")));
        Object obj = jsonnode.get("list");
        jsonnode = ik.a();
        String s;
        int i1;
        for (obj = ((JsonNode) (obj)).iterator(); ((Iterator) (obj)).hasNext(); jsonnode.put(new UserKey(com.facebook.user.n.FACEBOOK, s), Integer.valueOf(i1)))
        {
            JsonNode jsonnode1 = (JsonNode)((Iterator) (obj)).next();
            s = Long.toString(com.facebook.common.w.e.c(jsonnode1.get("u")));
            i1 = com.facebook.common.w.e.d(jsonnode1.get("p"));
        }

        e.a(jsonnode, flag);
    }

    private void c(JsonNode jsonnode)
    {
        String s = com.facebook.common.w.e.b(jsonnode.get("event"));
        l l1 = (l)d.b();
        if ("delivery_receipt".equals(s))
        {
            s = com.facebook.common.w.e.b(jsonnode.get("from_fbid"));
            String s2 = com.facebook.common.w.e.b(jsonnode.get("mid"));
            jsonnode = com.facebook.common.w.e.b(jsonnode.get("tid"));
            com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Received delivery_receipt from ").append(s).toString());
            l1.a(new UserKey(com.facebook.user.n.FACEBOOK, s), jsonnode, s2);
        } else
        if ("read_receipt".equals(s))
        {
            String s1 = com.facebook.common.w.e.b(jsonnode.get("reader_fbid"));
            long l2 = com.facebook.common.w.e.c(jsonnode.get("timestamp"));
            jsonnode = com.facebook.common.w.e.b(jsonnode.get("tid"));
            com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Received read_recept from ").append(s1).toString());
            l1.a(new UserKey(com.facebook.user.n.FACEBOOK, s1), jsonnode, l2);
            return;
        }
    }

    private void d(JsonNode jsonnode)
    {
        if (!h.f())
        {
            return;
        } else
        {
            long l1 = com.facebook.common.w.e.c(jsonnode.get("from"));
            jsonnode = com.facebook.common.w.e.b(jsonnode.get("payload"));
            h.a(Long.valueOf(l1).longValue(), jsonnode);
            return;
        }
    }

    private void e(JsonNode jsonnode)
    {
        if (!h.f())
        {
            return;
        } else
        {
            long l1 = com.facebook.common.w.e.c(jsonnode.get("id"));
            String s = com.facebook.common.w.e.b(jsonnode.get("errStr"));
            int i1 = com.facebook.common.w.e.d(jsonnode.get("errno"));
            h.a(Long.valueOf(l1).longValue(), s, i1, "MQTT");
            return;
        }
    }

    private void f(JsonNode jsonnode)
    {
        jsonnode = c.b(jsonnode);
        if (jsonnode == null)
        {
            a(g.MQTT);
        } else
        {
            jsonnode = jsonnode.iterator();
            while (jsonnode.hasNext()) 
            {
                Message message = (Message)jsonnode.next();
                if (message == null)
                {
                    a(g.MQTT);
                } else
                {
                    b.a(message.k(), message.e(), message, g.MQTT);
                }
            }
        }
    }

    private void g(JsonNode jsonnode)
    {
        if (j.i() == d.MESSENGER)
        {
            int i1 = com.facebook.common.w.e.d(jsonnode.get("unread"));
            k.a(i1);
        }
    }

    public void a(String s, byte abyte0[])
    {
        try
        {
            abyte0 = g.readTree(n.a(abyte0));
            if (com.facebook.debug.log.b.b(2))
            {
                com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Publish:\n").append(abyte0.toString()).toString());
            }
            if (!i.b())
            {
                com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Not logged in: throwing out Mqtt message. ").append(s).toString());
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.facebook.debug.log.b.c(a, "IOException", s);
            return;
        }
        if ("/orca_message_notifications".equals(s) || "/orca_typing_notifications".equals(s))
        {
            a(((JsonNode) (abyte0)));
            return;
        }
        if ("/orca_presence".equals(s))
        {
            b(abyte0);
            return;
        }
        if ("/messaging_events".equals(s))
        {
            c(abyte0);
            return;
        }
        if ("/webrtc".equals(s))
        {
            d(abyte0);
            return;
        }
        if ("/webrtc_response".equals(s))
        {
            e(abyte0);
            return;
        }
        if ("/mercury".equals(s))
        {
            f(abyte0);
            return;
        }
        if ("/inbox".equals(s))
        {
            g(abyte0);
        }
        return;
    }

}
