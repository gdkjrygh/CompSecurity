// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import android.os.Bundle;
import com.facebook.common.w.n;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.mqtt.x;
import com.facebook.orca.server.DeliveredReceiptParams;
import com.facebook.orca.server.ReadReceiptParams;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.push.mqtt.v;
import com.facebook.user.UserKey;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package com.facebook.orca.f:
//            k

public class l
{

    private final k a;
    private final com.facebook.orca.f.k b;
    private final v c;

    public l(k k1, com.facebook.orca.f.k k2, v v1)
    {
        a = k1;
        b = k2;
        c = v1;
    }

    public void a(Message message)
    {
        if (message == null || message.i() == null || message.i().e() == null || message.i().e().equals(b.b()))
        {
            return;
        } else
        {
            ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("msg_sender_id", message.i().e().b());
            objectnode.put("mid", message.d());
            objectnode.put("tid", message.e());
            c.a("/send_delivery_receipt", objectnode, x.FIRE_AND_FORGET);
            return;
        }
    }

    public void a(UserKey userkey, String s, long l1)
    {
        if (n.a(s))
        {
            s = b.c(userkey);
        } else
        {
            s = b.b(s);
        }
        if (s == null)
        {
            return;
        } else
        {
            userkey = new ReadReceiptParams(s.a(), userkey, l1);
            s = new Bundle();
            s.putParcelable("readReceiptParams", userkey);
            userkey = a.a(aq.q, s);
            userkey.a(true);
            userkey.a();
            return;
        }
    }

    public void a(UserKey userkey, String s, String s1)
    {
        if (n.a(s))
        {
            s = b.c(userkey);
        } else
        {
            s = b.b(s);
        }
        if (s == null)
        {
            return;
        } else
        {
            userkey = new DeliveredReceiptParams(s.a(), userkey, s1);
            s = new Bundle();
            s.putParcelable("deliveredReceiptParams", userkey);
            userkey = a.a(aq.r, s);
            userkey.a(true);
            userkey.a();
            return;
        }
    }
}
