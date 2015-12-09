// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import java.nio.charset.Charset;

// Referenced classes of package com.spotify.mobile.android.cosmos:
//            ParsingCallbackReceiver

public abstract class HttpCallbackReceiver extends ParsingCallbackReceiver
{

    public HttpCallbackReceiver(Handler handler)
    {
        super(handler);
    }

    public static void defaultVerifyResponse(Response response)
    {
        int i = response.getStatus();
        if (i < 200 || i > 299)
        {
            StringBuilder stringbuilder = new StringBuilder("HTTP status code ");
            stringbuilder.append(i);
            stringbuilder.append(", uri: ").append(response.getUri());
            if (response.getBody() != null && response.getBody().length > 0)
            {
                try
                {
                    response = new String(response.getBody(), Charset.forName("UTF-8"));
                    stringbuilder.append(", body: ").append(response);
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    throw new HttpException(stringbuilder.toString());
                }
            }
            throw new HttpException(stringbuilder.toString());
        } else
        {
            return;
        }
    }

    protected void verifyResponse(Response response)
    {
        defaultVerifyResponse(response);
    }

    private class HttpException extends ParsingCallbackReceiver.ParserException
    {

        private static final long serialVersionUID = 0xb30599a6985b36e6L;

        public HttpException(String s)
        {
            super(s);
        }

        public HttpException(String s, Throwable throwable)
        {
            super(s, throwable);
        }

        public HttpException(Throwable throwable)
        {
            super(throwable);
        }
    }

}
