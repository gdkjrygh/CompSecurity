// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            BlackoutService

class this._cls0
    implements Callback
{

    final BlackoutService this$0;

    public void onFailure(Request request, IOException ioexception)
    {
        Timber.i((new StringBuilder()).append("Server request failed: ").append(ioexception.getMessage()).toString(), new Object[0]);
        BlackoutService.access$000(BlackoutService.this).onNext(Boolean.valueOf(true));
        BlackoutService.access$000(BlackoutService.this).onCompleted();
    }

    public void onResponse(Response response)
        throws IOException
    {
        if (!response.isSuccessful())
        {
            Timber.i((new StringBuilder()).append("Bad response from server: ").append(response.message()).toString(), new Object[0]);
            BlackoutService.access$000(BlackoutService.this).onNext(Boolean.valueOf(true));
            BlackoutService.access$000(BlackoutService.this).onCompleted();
            return;
        }
        response = response.body().string();
        try
        {
            ackout ackout = (ackout)BlackoutService.access$200(BlackoutService.this).fromJson(response, com/nbcsports/liveextra/library/tve/BlackoutService$Blackout);
            Timber.d((new StringBuilder()).append("Blackout response: ").append(response).toString(), new Object[0]);
            BlackoutService.access$000(BlackoutService.this).onNext(Boolean.valueOf(ackout.isAuthenticated()));
            BlackoutService.access$000(BlackoutService.this).onCompleted();
            return;
        }
        catch (JsonSyntaxException jsonsyntaxexception)
        {
            Timber.i((new StringBuilder()).append("Blackout service failed to deserialize json: ").append(response).toString(), new Object[0]);
        }
        BlackoutService.access$000(BlackoutService.this).onNext(Boolean.valueOf(true));
        BlackoutService.access$000(BlackoutService.this).onCompleted();
    }

    ackout()
    {
        this$0 = BlackoutService.this;
        super();
    }
}
