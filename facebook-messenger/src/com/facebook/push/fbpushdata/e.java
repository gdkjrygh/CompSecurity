// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.fbpushdata;

import android.content.Context;
import com.facebook.analytics.cn;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.mqtt.x;
import com.facebook.push.c2dm.y;
import com.facebook.push.g;
import com.facebook.push.mqtt.av;
import com.facebook.push.mqtt.v;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.facebook.push.fbpushdata:
//            FbPushDataHandlerService

public class e
    implements av
{

    private static final Class a = com/facebook/push/fbpushdata/e;
    private final ObjectMapper b;
    private final v c;
    private final y d;
    private final cn e;
    private final Context f;

    public e(ObjectMapper objectmapper, v v1, y y1, cn cn1, Context context)
    {
        b = objectmapper;
        c = v1;
        d = y1;
        e = cn1;
        f = context;
    }

    private void a(JsonNode jsonnode)
    {
        Object obj = com.facebook.common.w.e.b(jsonnode.get("token"));
        if (!Objects.equal(obj, d.a()))
        {
            com.facebook.debug.log.b.b(a, "Ignoring MQTT push for other token");
            a(((String) (obj)));
            return;
        }
        com.facebook.debug.log.b.b(a, "Received MQTT push");
        obj = com.facebook.common.w.e.b(jsonnode.get("async_job"));
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("async_job", ((String) (obj)));
        if (c.a("/send_push_notification_ack", objectnode, x.FIRE_AND_FORGET) == -1)
        {
            com.facebook.debug.log.b.d(a, "Failed to send push notification ack");
        }
        jsonnode = jsonnode.get("fbpushnotif").textValue();
        try
        {
            obj = b.readTree(jsonnode);
        }
        catch (IOException ioexception)
        {
            com.facebook.debug.log.b.c(a, "IOException", ioexception);
            a(((String) (jsonnode)), ioexception);
            return;
        }
        FbPushDataHandlerService.a(f, ((JsonNode) (obj)).toString(), g.C2DM_OVER_MQTT);
    }

    private void a(String s)
    {
        java.util.HashMap hashmap = ik.a();
        hashmap.put("registration_id", s);
        s = g.C2DM_OVER_MQTT.toString();
        e.a((new StringBuilder()).append("messaging_push_notif_").append(s).toString(), "mqtt_other_token", hashmap, null, null);
    }

    private void a(String s, IOException ioexception)
    {
        java.util.HashMap hashmap = ik.a();
        hashmap.put("fbpushnotif", s);
        hashmap.put("exception", ioexception.toString());
        e.a((new StringBuilder()).append("messaging_push_notif_").append(g.MQTT.toString()).toString(), "MqttParseException", hashmap, null, null);
    }

    public void a(String s, byte abyte0[])
    {
        try
        {
            abyte0 = b.readTree(n.a(abyte0));
            if ("/push_notification".equals(s))
            {
                a(((JsonNode) (abyte0)));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.facebook.debug.log.b.c(a, "IOException", s);
        }
    }

}
