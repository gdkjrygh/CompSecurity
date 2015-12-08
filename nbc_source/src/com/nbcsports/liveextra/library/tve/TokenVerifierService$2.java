// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            TokenVerifierService

class this._cls0
    implements Callback
{

    final TokenVerifierService this$0;

    public void onFailure(Request request, IOException ioexception)
    {
        TokenVerifierService.access$000(TokenVerifierService.this).onError(ioexception);
    }

    public void onResponse(Response response)
        throws IOException
    {
        if (!response.isSuccessful())
        {
            TokenVerifierService.access$000(TokenVerifierService.this).onError(new Exception(response.message()));
        }
        response = response.body().string();
        TokenVerifierService.access$000(TokenVerifierService.this).onNext(response);
        TokenVerifierService.access$000(TokenVerifierService.this).onCompleted();
    }

    ()
    {
        this$0 = TokenVerifierService.this;
        super();
    }
}
