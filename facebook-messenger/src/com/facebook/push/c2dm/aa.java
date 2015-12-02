// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import com.facebook.common.w.e;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.push.c2dm:
//            RegisterPushTokenParams, z, RegisterPushTokenResult

public class aa
    implements f
{

    public aa()
    {
    }

    public n a(RegisterPushTokenParams registerpushtokenparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("return_structure", "1"));
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        if (registerpushtokenparams.a() == z.GCM)
        {
            objectnode.put("url", "https://android.googleapis.com/gcm/send");
        }
        objectnode.put("token", registerpushtokenparams.b());
        objectnode.put("device_id", registerpushtokenparams.c());
        objectnode.put("is_initial_reg", registerpushtokenparams.d());
        ObjectNode objectnode1 = new ObjectNode(JsonNodeFactory.instance);
        objectnode1.put("android_build", registerpushtokenparams.e());
        objectnode1.put("android_setting_mask", registerpushtokenparams.f());
        objectnode.put("extra_data", objectnode1);
        arraylist.add(new BasicNameValuePair("protocol_params", objectnode.toString()));
        return new n("registerPush", "POST", "method/user.registerPushCallback", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((RegisterPushTokenParams)obj);
    }

    public RegisterPushTokenResult a(RegisterPushTokenParams registerpushtokenparams, r r1)
    {
        registerpushtokenparams = r1.c();
        return new RegisterPushTokenResult(e.g(registerpushtokenparams.get("success")), e.g(registerpushtokenparams.get("previously_disabled")), System.currentTimeMillis());
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((RegisterPushTokenParams)obj, r1);
    }
}
