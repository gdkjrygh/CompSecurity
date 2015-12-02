// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.e;
import com.facebook.orca.k.a;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.gg;
import com.google.common.a.hq;
import com.google.common.a.jr;
import java.util.List;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            aa, c, ba, bb

public class x
{

    private final aa a;
    private final ba b;
    private final c c;
    private final a d;
    private final bb e;

    public x(aa aa1, ba ba1, c c1, a a1, bb bb1)
    {
        a = aa1;
        b = ba1;
        c = c1;
        d = a1;
        e = bb1;
    }

    private Message b(JsonNode jsonnode)
    {
        e e1 = new e();
        long l = com.facebook.common.w.e.c(jsonnode.get("action_id"));
        e1.a((new StringBuilder()).append("a_").append(Long.toString(l)).toString());
        e1.b(com.facebook.common.w.e.b(jsonnode.get("thread_id")));
        e1.c(l);
        int i = com.facebook.common.w.e.d(jsonnode.get("type"));
        JsonNode jsonnode1;
        if (i == 1)
        {
            e1.a(1);
        } else
        if (i == 2)
        {
            e1.a(2);
        } else
        {
            e1.a(1000);
        }
        jsonnode1 = jsonnode.get("actor");
        e1.a(com.facebook.common.w.e.c(jsonnode.get("timestamp")));
        e1.a(a.b(jsonnode1));
        e1.d(a.a(jsonnode.get("users")));
        e1.d(com.facebook.common.w.e.b(jsonnode.get("body")));
        return e1.B();
    }

    public Message a(JsonNode jsonnode)
    {
        e e1;
        byte byte1;
        byte1 = 101;
        e1 = new e();
        e1.a(com.facebook.common.w.e.b(jsonnode.get("message_id")));
        e1.b(com.facebook.common.w.e.b(jsonnode.get("thread_id")));
        e1.d(com.facebook.common.w.e.b(jsonnode.get("body")));
        e1.a(com.facebook.common.w.e.c(jsonnode.get("timestamp")));
        e1.c(com.facebook.common.w.e.c(jsonnode.get("action_id")));
        if (!jsonnode.has("log_message") || !jsonnode.get("log_message").isObject()) goto _L2; else goto _L1
_L1:
        Object obj = jsonnode.get("log_message");
        if (!((JsonNode) (obj)).has("threadPic")) goto _L4; else goto _L3
_L3:
        byte byte0;
        if (((JsonNode) (obj)).get("threadPic").path("deleted").asBoolean(false))
        {
            byte0 = 7;
        } else
        {
            byte0 = 4;
        }
_L6:
        e1.a(byte0);
        obj = jsonnode.get("sender");
        e1.a(a.b(((JsonNode) (obj))));
        if (jsonnode.has("attachment_map") && jsonnode.get("attachment_map").isObject())
        {
            e1.b(c.a(jsonnode.get("attachment_map")));
        }
        if (jsonnode.has("share_map") && jsonnode.get("share_map").isObject())
        {
            e1.c(b.a(jsonnode.get("share_map")));
        }
        if (jsonnode.has("coordinates") && !jsonnode.get("coordinates").isNull() && jsonnode.get("coordinates").isObject())
        {
            e1.a(d.a(jsonnode.get("coordinates")));
        }
        e1.e(com.facebook.common.w.e.b(jsonnode.get("offline_threading_id")));
        e1.f(e.a(jsonnode.get("tags")));
        return e1.B();
_L4:
        if (((JsonNode) (obj)).has("threadName"))
        {
            byte0 = 3;
            continue; /* Loop/switch isn't completed */
        }
        if (((JsonNode) (obj)).has("callLog"))
        {
            obj = ((JsonNode) (obj)).get("callLog").get("type").asText();
            byte0 = byte1;
            if (!((String) (obj)).equals("missed"))
            {
                if (((String) (obj)).equals("incoming"))
                {
                    byte0 = 100;
                } else
                {
                    byte0 = byte1;
                    if (((String) (obj)).equals("outgoing"))
                    {
                        byte0 = 102;
                    }
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        if (((JsonNode) (obj)).has("videoCallLog"))
        {
            if (((JsonNode) (obj)).get("videoCallLog").get("answered").asBoolean())
            {
                byte0 = 5;
            } else
            {
                byte0 = 6;
            }
            continue; /* Loop/switch isn't completed */
        }
_L2:
        byte0 = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public es a(JsonNode jsonnode, JsonNode jsonnode1, int i)
    {
        boolean flag = false;
        Object obj = hq.a();
        for (int j = 0; j < jsonnode.size(); j++)
        {
            ((List) (obj)).add(a(jsonnode.get(j)));
        }

        jsonnode = hq.a();
        for (int k = 0; k < jsonnode1.size(); k++)
        {
            jsonnode.add(b(jsonnode1.get(k)));
        }

        obj = gg.g(((List) (obj)).iterator());
        jr jr1 = gg.g(jsonnode.iterator());
        et et1 = es.e();
        int l = ((flag) ? 1 : 0);
        do
        {
            if (!((jr) (obj)).hasNext() && !jr1.hasNext() || l >= i)
            {
                break;
            }
            if (((jr) (obj)).hasNext())
            {
                jsonnode = (Message)((jr) (obj)).a();
            } else
            {
                jsonnode = null;
            }
            if (jr1.hasNext())
            {
                jsonnode1 = (Message)jr1.a();
            } else
            {
                jsonnode1 = null;
            }
            if (jsonnode != null && jsonnode1 != null)
            {
                if (jsonnode.f() > jsonnode1.f())
                {
                    et1.b(jsonnode);
                    ((jr) (obj)).next();
                    l++;
                } else
                {
                    et1.b(jsonnode1);
                    jr1.next();
                    l++;
                }
            } else
            if (jsonnode != null)
            {
                et1.b(jsonnode);
                ((jr) (obj)).next();
                l++;
            } else
            if (jsonnode1 != null)
            {
                et1.b(jsonnode1);
                jr1.next();
                l++;
            }
        } while (true);
        return et1.b();
    }
}
