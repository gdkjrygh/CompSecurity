// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.location;

import com.phunware.nbc.sochi.content.GeoRequestResponse;
import com.phunware.nbc.sochi.system.NBCSystem;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import timber.log.Timber;

// Referenced classes of package com.phunware.nbc.sochi.location:
//            TotalCastAsyncRequest, TotalCastResponseListener

class this._cls0
    implements Callback
{

    final TotalCastAsyncRequest this$0;

    public void onFailure(Request request, IOException ioexception)
    {
        TotalCastAsyncRequest.access$000(TotalCastAsyncRequest.this).onResponse(new GeoRequestResponse(null));
        Timber.d(ioexception, ioexception.getMessage(), new Object[0]);
    }

    public void onResponse(Response response)
        throws IOException
    {
        response = response.body().string();
        response = TotalCastAsyncRequest.access$100(TotalCastAsyncRequest.this, response);
        if (TotalCastAsyncRequest.access$000(TotalCastAsyncRequest.this) != null)
        {
            TotalCastAsyncRequest.access$000(TotalCastAsyncRequest.this).onResponse(response);
        }
        NBCSystem.debugLog("TotalCastAsyncRequest", (new StringBuilder()).append("Response: ").append(((GeoRequestResponse) (response)).ZipCode).append(" ").append(((GeoRequestResponse) (response)).NielsonDMA).toString());
    }

    r()
    {
        this$0 = TotalCastAsyncRequest.this;
        super();
    }
}
