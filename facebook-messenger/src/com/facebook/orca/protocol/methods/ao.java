// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import android.content.Context;
import com.facebook.fbservice.c.b;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.a.j;
import com.facebook.orca.f.n;
import com.facebook.orca.server.NewMessageResult;
import com.facebook.push.mqtt.bw;
import com.facebook.push.mqtt.bx;
import com.facebook.user.UserKey;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            at, ar, an, ap

public class ao
{

    private final Context a;
    private final bx b;
    private final n c;
    private final an d;
    private final a e;
    private final ObjectMapper f;
    private final com.facebook.c.j g;

    public ao(Context context, bx bx1, n n1, an an1, a a1, ObjectMapper objectmapper, com.facebook.c.j j1)
    {
        a = context;
        b = bx1;
        c = n1;
        d = an1;
        e = a1;
        f = objectmapper;
        g = j1;
    }

    static Context a(ao ao1)
    {
        return ao1.a;
    }

    static com.facebook.c.j b(ao ao1)
    {
        return ao1.g;
    }

    static ObjectMapper c(ao ao1)
    {
        return ao1.f;
    }

    public ar a(Message message, UserKey userkey)
    {
        bw bw1;
        j j1;
        try
        {
            j1 = (j)e.b();
            bw1 = b.a();
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            return com.facebook.orca.protocol.methods.ar.a(message, -1);
        }
        if (!message.C())
        {
            break MISSING_BLOCK_LABEL_42;
        }
        message = com.facebook.orca.protocol.methods.ar.a(at.SEND_SKIPPED_ATTACHMENT);
        bw1.c();
        return message;
        if (bw1.a())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        message = com.facebook.orca.protocol.methods.ar.a(at.SEND_SKIPPED_NOT_CONNECTED);
        bw1.c();
        return message;
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        if (userkey == null)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        userkey = userkey.b();
_L1:
        long l;
        objectnode.put("to", userkey);
        objectnode.put("body", message.k());
        l = Long.parseLong(message.w());
        objectnode.put("msgid", l);
        if (message.r())
        {
            objectnode.put("coordinates", d.b(message));
        }
        if (message.I())
        {
            objectnode.put("client_tags", d.a(message));
        }
        if (message.E() != null)
        {
            objectnode.put("object_attachment", message.E());
        }
        userkey = new ap(this, l);
        userkey.a();
        long l1;
        long l2;
        long l3;
        l1 = j1.b;
        l2 = j1.c;
        l3 = System.currentTimeMillis();
        if (bw1.a("/send_message2", objectnode, l1))
        {
            break MISSING_BLOCK_LABEL_271;
        }
        message = com.facebook.orca.protocol.methods.ar.a(at.SEND_FAILED_PUBLISH_FAILED, com.facebook.orca.protocol.methods.ap.a(userkey));
        userkey.b();
        bw1.c();
        return message;
        userkey = message.e();
          goto _L1
        l1 = (l1 + l2) - (System.currentTimeMillis() - l3);
        if (com.facebook.orca.protocol.methods.ap.b(userkey) || l1 >= 0L)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        message = com.facebook.orca.protocol.methods.ar.a(at.SEND_FAILED_TIMED_OUT_AFTER_PUBLISH, com.facebook.orca.protocol.methods.ap.a(userkey));
        userkey.b();
        bw1.c();
        return message;
        if (userkey.a(l1))
        {
            break MISSING_BLOCK_LABEL_350;
        }
        message = com.facebook.orca.protocol.methods.ar.a(at.SEND_FAILED_TIMED_OUT_WAITING_FOR_RESPONSE, com.facebook.orca.protocol.methods.ap.a(userkey));
        userkey.b();
        bw1.c();
        return message;
        if (com.facebook.orca.protocol.methods.ap.b(userkey))
        {
            break MISSING_BLOCK_LABEL_378;
        }
        message = com.facebook.orca.protocol.methods.ar.a(at.SEND_FAILED_SERVER_RETURNED_FAILURE, com.facebook.orca.protocol.methods.ap.a(userkey));
        userkey.b();
        bw1.c();
        return message;
        userkey.b();
        userkey = c.a(0, message.e(), Long.toString(l), message.k(), -1L, message.h(), message.n(), null);
        message = com.facebook.orca.protocol.methods.ar.a(new NewMessageResult(b.FROM_SERVER, message.e(), userkey, null, System.currentTimeMillis()));
        bw1.c();
        return message;
        message;
        userkey.b();
        throw message;
        message;
        bw1.c();
        throw message;
    }
}
