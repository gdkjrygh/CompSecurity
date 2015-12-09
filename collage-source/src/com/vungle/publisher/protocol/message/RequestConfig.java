// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.bt;
import com.vungle.publisher.bv;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            BaseJsonObject

public class RequestConfig extends BaseJsonObject
{

    bt a;
    bv b;

    public RequestConfig()
    {
    }

    public final JSONObject a()
        throws JSONException
    {
        JSONObject jsonobject = super.a();
        jsonobject.putOpt("pubAppId", b.b());
        jsonobject.putOpt("ifa", a.a());
        jsonobject.putOpt("isu", a.c());
        return jsonobject;
    }

    public final Object b()
        throws JSONException
    {
        return a();
    }
}
