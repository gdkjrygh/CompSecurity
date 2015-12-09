// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.parser.ResponseParser;

// Referenced classes of package com.spotify.mobile.android.cosmos:
//            ParsingCallbackReceiver

public abstract class DelegableParsingCallbackReceiver extends ParsingCallbackReceiver
{

    private final ResponseParser mParser;

    public DelegableParsingCallbackReceiver(Handler handler, ResponseParser responseparser)
    {
        super(handler);
        mParser = responseparser;
    }

    protected Object parseResponse(Response response)
    {
        return mParser.parseResponse(response);
    }
}
