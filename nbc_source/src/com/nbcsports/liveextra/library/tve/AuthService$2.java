// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            AuthService

class val.channel
    implements Callback
{

    final AuthService this$0;
    final String val$channel;

    public void onFailure(Request request, IOException ioexception)
    {
        AuthService.access$000(AuthService.this).checkAuthorization(val$channel);
    }

    public void onResponse(Response response)
        throws IOException
    {
        AuthService.access$802(AuthService.this, response.body().string());
        AuthService.access$900(AuthService.this, val$channel);
    }

    r()
    {
        this$0 = final_authservice;
        val$channel = String.this;
        super();
    }
}
