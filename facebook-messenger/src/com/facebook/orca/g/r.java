// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import com.facebook.common.w.e;
import com.facebook.common.w.n;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.p;
import com.facebook.user.UserKey;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;
import java.util.List;

public class r
{

    private final ObjectMapper a;

    public r(ObjectMapper objectmapper)
    {
        a = objectmapper;
    }

    private ParticipantInfo a(JsonNode jsonnode)
    {
        return new ParticipantInfo(UserKey.a(e.b(jsonnode.path("user_key"))), e.b(jsonnode.path("name")), e.b(jsonnode.path("email")));
    }

    private JsonNode a(ThreadParticipant threadparticipant)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("email", threadparticipant.e());
        if (threadparticipant.d() != null)
        {
            objectnode.put("user_key", threadparticipant.d().c());
        }
        objectnode.put("name", threadparticipant.f());
        if (threadparticipant.h() != null)
        {
            objectnode.put("mute", threadparticipant.h().d());
        }
        objectnode.put("lastReadReceiptTimestampMs", threadparticipant.i());
        if (!n.a(threadparticipant.j()))
        {
            objectnode.put("lastDeliveredReceiptMsgId", threadparticipant.j());
        }
        return objectnode;
    }

    private ThreadParticipant b(JsonNode jsonnode)
    {
        ParticipantInfo participantinfo = a(jsonnode);
        NotificationSetting notificationsetting = null;
        if (jsonnode.has("mute"))
        {
            notificationsetting = NotificationSetting.b(e.c(jsonnode.get("mute")));
        }
        return (new p()).a(participantinfo).a(notificationsetting).a(e.c(jsonnode.get("lastReadReceiptTimestampMs"))).b(e.b(jsonnode.get("lastDeliveredReceiptMsgId"))).f();
    }

    private JsonNode b(ParticipantInfo participantinfo)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("email", participantinfo.a());
        if (participantinfo.e() != null)
        {
            objectnode.put("user_key", participantinfo.e().c());
        }
        objectnode.put("name", participantinfo.d());
        return objectnode;
    }

    public ParticipantInfo a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return a(a.readTree(s));
        }
    }

    String a(ParticipantInfo participantinfo)
    {
        if (participantinfo == null)
        {
            return null;
        } else
        {
            return b(participantinfo).toString();
        }
    }

    String a(List list)
    {
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        for (list = list.iterator(); list.hasNext(); arraynode.add(b((ParticipantInfo)list.next()))) { }
        return arraynode.toString();
    }

    es b(String s)
    {
        Object obj = a.readTree(s);
        s = es.e();
        for (obj = ((JsonNode) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.b(a((JsonNode)((Iterator) (obj)).next()))) { }
        return s.b();
    }

    String b(List list)
    {
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        for (list = list.iterator(); list.hasNext(); arraynode.add(a((ThreadParticipant)list.next()))) { }
        return arraynode.toString();
    }

    es c(String s)
    {
        Object obj = a.readTree(s);
        s = es.e();
        for (obj = ((JsonNode) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.b(b((JsonNode)((Iterator) (obj)).next()))) { }
        return s.b();
    }
}
