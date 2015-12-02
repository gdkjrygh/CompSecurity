// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.a;

import android.telephony.SmsMessage;
import com.facebook.common.w.e;
import com.facebook.messages.model.threads.GroupMessageInfo;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.messages.model.threads.c;
import com.facebook.orca.protocol.methods.bb;
import com.facebook.orca.sms.bk;
import com.facebook.orca.sms.bn;
import com.facebook.orca.threads.a;
import com.facebook.orca.threads.m;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.base.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class b
{

    private static final Class a = com/facebook/orca/push/a/b;
    private final com.facebook.orca.k.a b;
    private final bb c;
    private final bn d;
    private final bk e;
    private final a f;
    private final ObjectMapper g;
    private final javax.inject.a h;

    public b(com.facebook.orca.k.a a1, bb bb1, bn bn1, bk bk1, a a2, ObjectMapper objectmapper, javax.inject.a a3)
    {
        b = a1;
        c = bb1;
        d = bn1;
        e = bk1;
        f = a2;
        g = objectmapper;
        h = a3;
    }

    private long a(long l, JsonNode jsonnode)
    {
        if (jsonnode.has("action_id"))
        {
            return com.facebook.common.w.e.c(jsonnode.get("action_id"));
        } else
        {
            return f.a(l);
        }
    }

    private es a(JsonNode jsonnode, JsonNode jsonnode1)
    {
        et et1 = es.e();
        int j = jsonnode.size();
        for (int i = 0; i < j; i++)
        {
            long l = com.facebook.common.w.e.c(jsonnode.get(i));
            String s = com.facebook.common.w.e.b(jsonnode1.get(i));
            et1.b(new ParticipantInfo(new UserKey(n.FACEBOOK, Long.toString(l)), s));
        }

        return et1.b();
    }

    private String a(String s)
    {
        if (s != null && s.startsWith("fbid:"))
        {
            if ((s = s.split(":")).length == 2)
            {
                return s[1];
            }
        }
        return null;
    }

    private Message c(JsonNode jsonnode)
    {
        Object obj = jsonnode.get("log_message_data");
        if (obj == null || !((JsonNode) (obj)).isObject())
        {
            return null;
        }
        boolean flag = com.facebook.common.w.e.a(((JsonNode) (obj)).get("answered"), false);
        obj = a(com.facebook.common.w.e.b(((JsonNode) (obj)).get("caller")));
        if (obj == null)
        {
            return null;
        }
        boolean flag1 = ((String) (obj)).equals(h.b());
        byte byte0;
        if (!flag)
        {
            byte0 = 101;
        } else
        if (flag1)
        {
            byte0 = 102;
        } else
        {
            byte0 = 100;
        }
        obj = a(com.facebook.common.w.e.b(jsonnode.get("author")));
        if (obj == null)
        {
            return null;
        } else
        {
            obj = new ParticipantInfo(new UserKey(n.FACEBOOK, ((String) (obj))), null);
            String s = com.facebook.common.w.e.b(jsonnode.get("log_message_body"));
            long l = com.facebook.common.w.e.a(jsonnode.get("timestamp"), 0L);
            long l1 = com.facebook.common.w.e.a(jsonnode.get("action_id"), 0L);
            String s1 = com.facebook.common.w.e.b(jsonnode.get("message_id"));
            jsonnode = com.facebook.common.w.e.b(jsonnode.get("thread_id"));
            return (new com.facebook.messages.model.threads.e()).a(byte0).a(((ParticipantInfo) (obj))).d(s).a(Long.valueOf(l).longValue()).c(Long.valueOf(l1).longValue()).a(s1).b(jsonnode).B();
        }
    }

    private GroupMessageInfo d(JsonNode jsonnode)
    {
        if (!jsonnode.has("gpc"))
        {
            return null;
        }
        com.facebook.debug.log.b.b(a, "Deserializing GroupMessageInfo for C2DM.");
        int i = com.facebook.common.w.e.d(jsonnode.get("gpc"));
        Object obj1 = com.facebook.common.w.e.b(jsonnode.get("gpi"));
        Object obj = com.facebook.common.w.e.b(jsonnode.get("gpn"));
        String s = com.facebook.common.w.e.b(jsonnode.get("gn"));
        jsonnode = com.facebook.common.w.e.b(jsonnode.get("gp"));
        try
        {
            obj1 = g.readTree(((String) (obj1)));
            obj = g.readTree(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (JsonNode jsonnode)
        {
            com.facebook.debug.log.b.e(a, "Error deserializing ids and names. Return no group info.");
            return null;
        }
        return new GroupMessageInfo(i, a(((JsonNode) (obj1)), ((JsonNode) (obj))), s, jsonnode);
    }

    private GroupMessageInfo e(JsonNode jsonnode)
    {
        Object obj;
        if (jsonnode.has("group_thread_info"))
        {
            if (((JsonNode) (obj = jsonnode.get("group_thread_info"))).has("participant_total_count"))
            {
                com.facebook.debug.log.b.b(a, "Deserializing GroupMessageInfo for MQTT.");
                int i = com.facebook.common.w.e.d(((JsonNode) (obj)).get("participant_total_count"));
                jsonnode = ((JsonNode) (obj)).get("participant_ids");
                JsonNode jsonnode1 = ((JsonNode) (obj)).get("participant_names");
                String s = com.facebook.common.w.e.b(((JsonNode) (obj)).get("name"));
                obj = com.facebook.common.w.e.b(((JsonNode) (obj)).get("pic_hash"));
                return new GroupMessageInfo(i, a(jsonnode, jsonnode1), s, ((String) (obj)));
            }
        }
        return null;
    }

    public Message a(SmsMessage smsmessage, long l, String s, long l1)
    {
        Object obj = smsmessage.getOriginatingAddress();
        String s1 = smsmessage.getPseudoSubject().trim();
        long l2 = d.a(l);
        obj = e.a(((String) (obj)));
        obj = e.a(((com.facebook.user.User) (obj)));
        String s2 = m.a(l2);
        String s3 = m.b(l);
        l = smsmessage.getTimestampMillis();
        l = f.a(l);
        return (new com.facebook.messages.model.threads.e()).a(s3).b(s2).c(s1).d(s).a(l1).d(l1).c(l).a(((ParticipantInfo) (obj))).a(true).a(c.SMS).f("sms").B();
    }

    public Message a(JsonNode jsonnode)
    {
        String s = null;
        Object obj = com.facebook.common.w.e.b(jsonnode.get("sender_fbid"));
        if (Objects.equal(obj, "0"))
        {
            return null;
        }
        String s1 = com.facebook.common.w.e.b(jsonnode.get("body"));
        String s2 = com.facebook.common.w.e.b(jsonnode.get("tid"));
        String s3 = com.facebook.common.w.e.b(jsonnode.get("mid"));
        String s4 = com.facebook.common.w.n.b(com.facebook.common.w.e.b(jsonnode.get("offline_threading_id")));
        Object obj1 = com.facebook.common.w.e.b(jsonnode.path("sender_name"));
        obj1 = new ParticipantInfo(new UserKey(n.FACEBOOK, ((String) (obj))), ((String) (obj1)), (new StringBuilder()).append(((String) (obj))).append("@facebook.com").toString());
        obj = s;
        if (jsonnode.has("coordinates"))
        {
            obj = s;
            if (!jsonnode.get("coordinates").isNull())
            {
                obj = s;
                if (jsonnode.get("coordinates").isObject())
                {
                    obj = b.a(jsonnode.get("coordinates"));
                }
            }
        }
        s = c.a(jsonnode.get("api_tags"));
        long l = com.facebook.common.w.e.c(jsonnode.get("timestamp"));
        long l1 = a(l, jsonnode);
        return (new com.facebook.messages.model.threads.e()).a(s3).b(s2).e(s4).d(s1).a(l).c(l1).a(((ParticipantInfo) (obj1))).a(((com.facebook.location.Coordinates) (obj))).a(true).f(s).a(c.MQTT).a(e(jsonnode)).B();
    }

    public Message a(String s, JsonNode jsonnode)
    {
        String s2 = com.facebook.common.w.e.b(jsonnode.get("uid"));
        if (Objects.equal(s2, "0") || s2 == null)
        {
            return null;
        }
        String s1;
        Object obj;
        if (s != null)
        {
            String as[] = s.split(":", 2);
            String s3;
            String s4;
            long l;
            long l1;
            if (as.length == 2)
            {
                obj = as[0].trim();
                s1 = as[1].trim();
            } else
            {
                obj = "";
                s1 = s;
            }
        } else
        {
            obj = "";
            s1 = "";
        }
        s3 = m.a(com.facebook.common.w.e.b(jsonnode.get("unified_tid")));
        s4 = m.b(com.facebook.common.w.e.b(jsonnode.get("n")));
        obj = new ParticipantInfo(new UserKey(n.FACEBOOK, s2), ((String) (obj)), (new StringBuilder()).append(s2).append("@facebook.com").toString());
        if (!jsonnode.has("o")) goto _L2; else goto _L1
_L1:
        com.facebook.common.w.e.d(jsonnode.get("o"));
        JVM INSTR tableswitch 1 3: default 184
    //                   1 291
    //                   2 298
    //                   3 305;
           goto _L2 _L3 _L4 _L5
_L2:
        s = null;
_L7:
        l = com.facebook.common.w.e.c(jsonnode.get("s"));
        l1 = a(l, jsonnode);
        return (new com.facebook.messages.model.threads.e()).a(s4).b(s3).d(s1).a(l).c(l1).a(((ParticipantInfo) (obj))).a(true).a(c.C2DM).a(d(jsonnode)).f(s).B();
_L3:
        s = "web";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "mobile";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "messenger";
        if (true) goto _L7; else goto _L6
_L6:
    }

    public List b(JsonNode jsonnode)
    {
        jsonnode = jsonnode.get("actions");
        if (jsonnode == null || !jsonnode.isArray())
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonnode.size(); i++)
        {
            JsonNode jsonnode1 = jsonnode.get(i);
            if ("log:phone-call".equals(com.facebook.common.w.e.b(jsonnode1.get("log_message_type"))))
            {
                arraylist.add(c(jsonnode1));
            }
        }

        return arraylist;
    }

}
