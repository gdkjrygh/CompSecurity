// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            MvpdLookups, Channel

class this._cls0
    implements Callback
{

    final MvpdLookups this$0;

    public void onFailure(Request request, IOException ioexception)
    {
        if (MvpdLookups.access$200(MvpdLookups.this) != null)
        {
            MvpdLookups.access$200(MvpdLookups.this).onError(ioexception);
        }
    }

    public void onResponse(Response response)
        throws IOException
    {
        if (!response.isSuccessful())
        {
            onFailure(response.request(), new IOException("Cannot retrieve channels"));
        }
        if (response.isSuccessful() && response.code() != 304)
        {
            Object obj = Channel.parse(response.body().byteStream());
            if (((List) (obj)).size() == 0)
            {
                onFailure(response.request(), new IOException("Channels were empty"));
                return;
            }
            for (response = ((List) (obj)).iterator(); response.hasNext(); MvpdLookups.access$300(MvpdLookups.this).put(((Channel) (obj)).getResourceId().toLowerCase(), obj))
            {
                obj = (Channel)response.next();
            }

        }
        areLookupsReady();
    }

    ()
    {
        this$0 = MvpdLookups.this;
        super();
    }
}
