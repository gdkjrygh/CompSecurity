// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;

// Referenced classes of package com.spotify.mobile.android.cosmos:
//            JsonCallbackReceiver, HttpCallbackReceiver

public abstract class JsonHttpCallbackReceiver extends JsonCallbackReceiver
{

    public JsonHttpCallbackReceiver(Handler handler, Class class1)
    {
        super(handler, class1);
    }

    public JsonHttpCallbackReceiver(Handler handler, Class class1, ObjectMapper objectmapper)
    {
        super(handler, class1, objectmapper);
    }

    protected void verifyResponse(Response response)
    {
        HttpCallbackReceiver.defaultVerifyResponse(response);
    }
}
