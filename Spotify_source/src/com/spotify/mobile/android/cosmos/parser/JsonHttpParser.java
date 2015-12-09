// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;

// Referenced classes of package com.spotify.mobile.android.cosmos.parser:
//            JsonParser

public class JsonHttpParser extends JsonParser
{

    public JsonHttpParser(Class class1)
    {
        super(class1);
    }

    public JsonHttpParser(Class class1, ObjectMapper objectmapper)
    {
        super(class1, objectmapper);
    }

    public Object parseResponse(Response response)
    {
        HttpCallbackReceiver.defaultVerifyResponse(response);
        return super.parseResponse(response);
    }
}
