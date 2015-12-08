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

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            MvpdLookups, Logo

class this._cls0
    implements Callback
{

    final MvpdLookups this$0;

    public void onFailure(Request request, IOException ioexception)
    {
    }

    public void onResponse(Response response)
        throws IOException
    {
        if (!response.isSuccessful())
        {
            onFailure(response.request(), new IOException("Cannot retrieve logos"));
        }
        if (response.isSuccessful() && response.code() != 304)
        {
            response = Logo.parse(response.body().byteStream()).iterator();
            do
            {
                if (!response.hasNext())
                {
                    break;
                }
                Logo logo = (Logo)response.next();
                if (logo.getId() != null)
                {
                    MvpdLookups.access$400(MvpdLookups.this).put(logo.getId().toLowerCase(), logo);
                }
            } while (true);
        }
    }

    ()
    {
        this$0 = MvpdLookups.this;
        super();
    }
}
