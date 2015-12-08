// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.parser;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.spotify.mobile.android.cosmos.parser:
//            ResponseParser

public class JsonObjectParser
    implements ResponseParser
{

    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    public JsonObjectParser()
    {
    }

    public volatile Object parseResponse(Response response)
    {
        return parseResponse(response);
    }

    public JSONObject parseResponse(Response response)
    {
        try
        {
            HttpCallbackReceiver.defaultVerifyResponse(response);
            response = new JSONObject(new String(response.getBody(), DEFAULT_CHARSET));
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw new com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ParserException(response);
        }
        return response;
    }

}
