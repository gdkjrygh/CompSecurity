// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import java.io.IOException;
import java.util.List;
import javax.inject.Provider;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.net.http:
//            FireAndForgetHttpResponseHandler, HttpTransaction, HttpResponse

public class ReportExceptionsHttpResponseHandler extends FireAndForgetHttpResponseHandler
{
    public static class Factory
    {

        Provider a;

        public Factory()
        {
        }
    }


    List a;
    com.vungle.publisher.db.model.LoggedException.Factory b;

    public ReportExceptionsHttpResponseHandler()
    {
    }

    protected final void a(HttpTransaction httptransaction, HttpResponse httpresponse)
        throws IOException, JSONException
    {
        super.a(httptransaction, httpresponse);
        b.a(a);
    }
}
