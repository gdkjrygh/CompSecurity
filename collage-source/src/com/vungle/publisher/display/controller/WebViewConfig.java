// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.display.controller;

import com.vungle.publisher.protocol.message.BaseJsonObject;
import org.json.JSONException;
import org.json.JSONObject;

public class WebViewConfig extends BaseJsonObject
{

    public WebViewConfig()
    {
    }

    public final JSONObject a()
        throws JSONException
    {
        JSONObject jsonobject = super.a();
        jsonobject.put("privacyPolicyEnabled", true);
        return jsonobject;
    }

    public final Object b()
        throws JSONException
    {
        return a();
    }
}
