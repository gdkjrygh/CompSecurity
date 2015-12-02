// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.os.Bundle;
import com.facebook.auth.credentials.UserTokenCredentials;
import com.facebook.common.w.e;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.mqtt.x;
import com.facebook.orca.server.aq;
import com.facebook.push.mqtt.v;
import com.facebook.webrtc.IWebrtcSignalingMessageInterface;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.d.a.i;
import java.io.IOException;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            ba, ag

public class az
    implements IWebrtcSignalingMessageInterface
{

    private static final Class a = com/facebook/orca/fbwebrtc/az;
    private final ObjectMapper b;
    private final k c;
    private final v d;
    private final a e;
    private ag f;

    public az(ObjectMapper objectmapper, k k1, v v1, a a1)
    {
        b = objectmapper;
        c = k1;
        d = v1;
        e = a1;
    }

    private int a(ServiceException serviceexception)
    {
label0:
        {
            byte byte0 = -1;
            int j = byte0;
            if (serviceexception.a() == t.API_ERROR)
            {
                j = byte0;
                if (serviceexception.b() != null)
                {
                    j = byte0;
                    if (serviceexception.b().g() != null)
                    {
                        j = byte0;
                        if (serviceexception.b().g().get("result") instanceof ApiErrorResult)
                        {
                            serviceexception = (ApiErrorResult)serviceexception.b().g().get("result");
                            if (serviceexception.a() == 1212 && serviceexception.c() != null)
                            {
                                break label0;
                            }
                            j = serviceexception.a();
                        }
                    }
                }
            }
            return j;
        }
        int l = com.facebook.common.w.e.a(b.readTree(serviceexception.c()).get("webrtc_error_code"), -1);
        return l;
        Object obj;
        obj;
_L2:
        return serviceexception.a();
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static int a(az az1, ServiceException serviceexception)
    {
        return az1.a(serviceexception);
    }

    static ag a(az az1)
    {
        return az1.f;
    }

    static Class a()
    {
        return a;
    }

    private void b(long l, long l1, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("sendWebrtcMessageParams", new com.facebook.orca.protocol.methods.SendWebrtcMessageMethod.Params(l, Long.toString(l1), s));
        i.a(c.a(aq.z, bundle).a(), new ba(this, l1));
    }

    void a(ag ag)
    {
        f = ag;
    }

    public boolean a(long l, long l1, String s)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("to", l);
        objectnode.put("payload", s);
        objectnode.put("id", l1);
        if (d.a("/webrtc", objectnode, x.FIRE_AND_FORGET) == -1)
        {
            b(l, l1, s);
        }
        return true;
    }

    public boolean sendToPeer(long l, long l1, String s)
    {
        com.facebook.debug.log.b.a(a, "Sending to peer peerId=%d messageId=%d", new Object[] {
            Long.valueOf(l), Long.valueOf(l1)
        });
        com.facebook.debug.log.b.a(a, s);
        return a(l, l1, s);
    }

    public boolean sendToSelf(long l, String s)
    {
        com.facebook.debug.log.b.a(a, "Sending to self messageId=%d", new Object[] {
            Long.valueOf(l)
        });
        com.facebook.debug.log.b.a(a, s);
        UserTokenCredentials usertokencredentials = (UserTokenCredentials)e.b();
        if (usertokencredentials == null)
        {
            return false;
        } else
        {
            return a(Long.parseLong(usertokencredentials.a()), l, s);
        }
    }

}
