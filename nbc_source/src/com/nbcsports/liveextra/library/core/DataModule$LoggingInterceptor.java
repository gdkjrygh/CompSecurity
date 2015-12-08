// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.core:
//            DataModule

class this._cls0
    implements Interceptor
{

    final DataModule this$0;

    public Response intercept(com.squareup.okhttp.ggingInterceptor gginginterceptor)
        throws IOException
    {
        Request request = gginginterceptor.ggingInterceptor();
        long l = System.nanoTime();
        Timber.i("Sending request %s on %s%n%s", new Object[] {
            request.url(), gginginterceptor.ggingInterceptor(), request.headers()
        });
        gginginterceptor = gginginterceptor.ggingInterceptor(request);
        long l1 = System.nanoTime();
        Timber.i("Received response for %s in %.1fms%n%s", new Object[] {
            gginginterceptor.request().url(), Double.valueOf((double)(l1 - l) / 1000000D), gginginterceptor.headers()
        });
        return gginginterceptor;
    }

    ()
    {
        this$0 = DataModule.this;
        super();
    }
}
