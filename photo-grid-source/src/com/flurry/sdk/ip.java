// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.flurry.sdk:
//            kx, hp, hs, hm, 
//            hr, hw, hv, hz, 
//            kc

public class ip
    implements kx
{

    private static final String a = com/flurry/sdk/ip.getSimpleName();

    public ip()
    {
    }

    private void a(JSONObject jsonobject, String s, String s1)
    {
        if (jsonobject == null)
        {
            throw new IOException("Null Json object");
        }
        if (s1 != null)
        {
            jsonobject.put(s, s1);
            return;
        } else
        {
            jsonobject.put(s, JSONObject.NULL);
            return;
        }
    }

    public hp a(InputStream inputstream)
    {
        throw new IOException("Deserialize not supported for request");
    }

    public void a(OutputStream outputstream, hp hp1)
    {
        _cls1 _lcls1;
        JSONObject jsonobject;
        if (outputstream == null || hp1 == null)
        {
            return;
        }
        _lcls1 = new _cls1(outputstream);
        jsonobject = new JSONObject();
        a(jsonobject, "project_key", hp1.a);
        a(jsonobject, "bundle_id", hp1.b);
        a(jsonobject, "app_version", hp1.c);
        jsonobject.put("sdk_version", hp1.d);
        jsonobject.put("platform", hp1.e);
        a(jsonobject, "platform_version", hp1.f);
        jsonobject.put("limit_ad_tracking", hp1.g);
        if (hp1.h == null || hp1.h.a == null) goto _L2; else goto _L1
_L1:
        outputstream = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        a(jsonobject1, "model", hp1.h.a.a);
        a(jsonobject1, "brand", hp1.h.a.b);
        a(jsonobject1, "id", hp1.h.a.c);
        a(jsonobject1, "device", hp1.h.a.d);
        a(jsonobject1, "product", hp1.h.a.e);
        a(jsonobject1, "version_release", hp1.h.a.f);
        outputstream.put("com.flurry.proton.generated.avro.v2.AndroidTags", jsonobject1);
_L12:
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        jsonobject.put("device_tags", outputstream);
_L3:
        outputstream = new JSONArray();
        JSONObject jsonobject3;
        for (Iterator iterator = hp1.i.iterator(); iterator.hasNext(); outputstream.put(jsonobject3))
        {
            hr hr1 = (hr)iterator.next();
            jsonobject3 = new JSONObject();
            jsonobject3.put("type", hr1.a);
            a(jsonobject3, "id", hr1.b);
        }

        break MISSING_BLOCK_LABEL_395;
        outputstream;
        throw new IOException("Invalid Json", outputstream);
        outputstream;
        _lcls1.close();
        throw outputstream;
        jsonobject.put("device_tags", JSONObject.NULL);
          goto _L3
        jsonobject.put("device_ids", outputstream);
        if (hp1.j == null || hp1.j.a == null) goto _L5; else goto _L4
_L4:
        outputstream = new JSONObject();
        JSONObject jsonobject2 = new JSONObject();
        jsonobject2.putOpt("latitude", Double.valueOf(hp1.j.a.a));
        jsonobject2.putOpt("longitude", Double.valueOf(hp1.j.a.b));
        jsonobject2.putOpt("accuracy", Float.valueOf(hp1.j.a.c));
        outputstream.put("com.flurry.proton.generated.avro.v2.Geolocation", jsonobject2);
_L10:
        if (outputstream == null) goto _L7; else goto _L6
_L6:
        jsonobject.put("geo", outputstream);
_L8:
        outputstream = new JSONObject();
        if (hp1.k == null)
        {
            break MISSING_BLOCK_LABEL_623;
        }
        a(((JSONObject) (outputstream)), "string", hp1.k.a);
        jsonobject.put("publisher_user_id", outputstream);
_L9:
        kc.a(5, a, (new StringBuilder("Proton Request String: ")).append(jsonobject.toString()).toString());
        _lcls1.write(jsonobject.toString().getBytes());
        _lcls1.flush();
        _lcls1.close();
        return;
_L7:
        jsonobject.put("geo", JSONObject.NULL);
          goto _L8
        jsonobject.put("publisher_user_id", JSONObject.NULL);
          goto _L9
_L5:
        outputstream = null;
        if (true) goto _L10; else goto _L2
_L2:
        outputstream = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public volatile void a(OutputStream outputstream, Object obj)
    {
        a(outputstream, (hp)obj);
    }

    public Object b(InputStream inputstream)
    {
        return a(inputstream);
    }


    private class _cls1 extends DataOutputStream
    {

        final ip a;

        public void close()
        {
        }

        _cls1(OutputStream outputstream)
        {
            a = ip.this;
            super(outputstream);
        }
    }

}
