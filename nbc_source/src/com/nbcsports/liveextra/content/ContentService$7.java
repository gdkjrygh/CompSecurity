// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.nbcsports.liveextra.library.api.models.FeaturedContent;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.content:
//            ContentService

class val.subscriber
    implements Callback
{

    final ContentService this$0;
    final Subscriber val$subscriber;
    final String val$url;

    public void onFailure(Request request, IOException ioexception)
    {
        Timber.d(ioexception, (new StringBuilder()).append("Failure retrieving url: ").append(val$url).toString(), new Object[0]);
        val$subscriber.onError(ioexception);
    }

    public void onResponse(Response response)
        throws IOException
    {
        if (!response.isSuccessful())
        {
            onFailure(response.request(), new IOException(response.message()));
            return;
        }
        try
        {
            response = (FeaturedContent)ContentService.access$300(ContentService.this).fromJson(response.body().charStream(), com/nbcsports/liveextra/library/api/models/FeaturedContent);
            val$subscriber.onNext(response);
            val$subscriber.onCompleted();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            Timber.i(response, "Error deserializing featured content", new Object[0]);
            val$subscriber.onError(response);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            Timber.d(response, "Error deserializing featured content", new Object[0]);
        }
        val$subscriber.onError(response);
    }

    edContent()
    {
        this$0 = final_contentservice;
        val$url = s;
        val$subscriber = Subscriber.this;
        super();
    }
}
