// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.core.internal;

import com.spotify.mobile.android.util.logging.Logger;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.spotify.mobile.android.core.internal:
//            HttpConnection

class this._cls0 extends Thread
{

    final HttpConnection this$0;

    public void run()
    {
        try
        {
            HttpConnection.access$002(HttpConnection.this, HttpConnection.access$200(HttpConnection.this).execute(HttpConnection.access$100(HttpConnection.this)));
            mResultData = getResultData();
        }
        catch (Exception exception)
        {
            Logger.b(exception, "Exception on getting result data", new Object[0]);
            HttpConnection.access$302(HttpConnection.this, 309);
        }
        HttpConnection.access$400(HttpConnection.this);
    }

    ()
    {
        this$0 = HttpConnection.this;
        super();
    }
}
