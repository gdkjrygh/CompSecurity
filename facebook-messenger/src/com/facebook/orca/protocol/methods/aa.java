// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.e;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;

public class aa
{

    public aa()
    {
    }

    private static String a(String s)
    {
        String s1 = s;
        if ("0".equals(s))
        {
            s1 = null;
        }
        return s1;
    }

    public es a(JsonNode jsonnode)
    {
        et et1 = es.e();
        for (jsonnode = jsonnode.iterator(); jsonnode.hasNext(); et1.b(b((JsonNode)jsonnode.next()))) { }
        return et1.b();
    }

    public ParticipantInfo b(JsonNode jsonnode)
    {
        String s = e.b(jsonnode.get("email"));
        Object obj;
        if (jsonnode.has("user_id"))
        {
            obj = a(e.b(jsonnode.get("user_id")));
            if (obj != null)
            {
                obj = new UserKey(n.FACEBOOK, ((String) (obj)));
            } else
            {
                obj = new UserKey(n.EMAIL, s);
            }
        } else
        {
            obj = e.b(jsonnode.get("id"));
            obj = new UserKey(n.FACEBOOK_OBJECT, ((String) (obj)));
        }
        return new ParticipantInfo(((UserKey) (obj)), e.b(jsonnode.get("name")), s);
    }
}
