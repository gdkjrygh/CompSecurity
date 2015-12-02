// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import com.facebook.common.w.n;
import com.facebook.orca.compose.MessageDraft;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.List;

// Referenced classes of package com.facebook.orca.g:
//            o

public class g
{

    private final o a;
    private final ObjectMapper b;

    public g(o o1, ObjectMapper objectmapper)
    {
        a = o1;
        b = objectmapper;
    }

    MessageDraft a(String s)
    {
        Object obj = null;
        if (n.a(s))
        {
            return null;
        }
        JsonNode jsonnode = b.readTree(s);
        String s2 = jsonnode.get("text").textValue();
        int i = 0;
        if (jsonnode.has("cursorPosition"))
        {
            i = jsonnode.get("cursorPosition").intValue();
        }
        s = obj;
        if (jsonnode.has("offlineMessageId"))
        {
            s = jsonnode.get("offlineMessageId").textValue();
        }
        if (jsonnode.has("attachmentData"))
        {
            String s1 = jsonnode.get("attachmentData").textValue();
            return new MessageDraft(s2, i, a.a(s1), s);
        } else
        {
            return new MessageDraft(s2, i, s);
        }
    }

    String a(MessageDraft messagedraft)
    {
        if (messagedraft == null)
        {
            return null;
        }
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("text", messagedraft.a());
        objectnode.put("cursorPosition", messagedraft.b());
        if (!messagedraft.c().isEmpty())
        {
            objectnode.put("attachmentData", a.a(messagedraft.c()));
        }
        if (!n.a(messagedraft.d()))
        {
            objectnode.put("offlineMessageId", messagedraft.d());
        }
        return objectnode.toString();
    }
}
