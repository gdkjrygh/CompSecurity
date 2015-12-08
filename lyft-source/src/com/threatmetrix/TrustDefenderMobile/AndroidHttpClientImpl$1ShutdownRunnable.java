// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.net.http.AndroidHttpClient;
import android.util.Log;
import org.apache.http.conn.ClientConnectionManager;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            AndroidHttpClientImpl

final class a
    implements Runnable
{

    final AndroidHttpClient a;
    final AndroidHttpClientImpl b;

    public void run()
    {
        if (a == null)
        {
            return;
        }
        try
        {
            a.close();
            a.getConnectionManager().shutdown();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            Log.e(AndroidHttpClientImpl.a(), "Swallowing", runtimeexception);
        }
    }

    (AndroidHttpClientImpl androidhttpclientimpl, AndroidHttpClient androidhttpclient)
    {
        b = androidhttpclientimpl;
        super();
        a = androidhttpclient;
    }
}
