// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.parser;

import com.spotify.cosmos.router.Response;
import cuf;
import hfw;

// Referenced classes of package com.spotify.mobile.android.cosmos.parser:
//            JacksonResponseParser, JsonParser

class this._cls0
    implements hfw
{

    final JacksonResponseParser this$0;

    public Object call(Response response)
    {
        try
        {
            response = ((Response) (JacksonResponseParser.access$000(JacksonResponseParser.this).parseResponse(response)));
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw cuf.a(response);
        }
        return response;
    }

    public volatile Object call(Object obj)
    {
        return call((Response)obj);
    }

    xception()
    {
        this$0 = JacksonResponseParser.this;
        super();
    }
}
