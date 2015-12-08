// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.device.data;

import android.content.Context;
import com.vungle.publisher.bt;
import com.vungle.publisher.protocol.message.BaseJsonObject;
import javax.inject.Provider;
import org.json.JSONException;
import org.json.JSONObject;

public class AppFingerprint extends BaseJsonObject
{
    public static class Factory
    {

        bt a;
        Context b;
        Provider c;

        public Factory()
        {
        }
    }


    JSONObject a;
    long b;
    String c;
    String d;
    boolean e;

    public AppFingerprint()
    {
    }

    public final JSONObject a()
        throws JSONException
    {
        JSONObject jsonobject = super.a();
        jsonobject.put("last_polled", b);
        jsonobject.put("ifa", c);
        jsonobject.put("isu", d);
        jsonobject.put("app_store_ids", a);
        jsonobject.put("is_tracking_enabled", e);
        jsonobject.put("platform", "android");
        return jsonobject;
    }

    public final Object b()
        throws JSONException
    {
        return a();
    }
}
