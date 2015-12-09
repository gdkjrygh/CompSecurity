// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.net.http.AndroidHttpClient;
import android.util.Log;
import org.apache.http.conn.ClientConnectionManager;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            ag

final class aj
    implements Runnable
{

    final AndroidHttpClient a;
    final ag b;

    aj(ag ag1, AndroidHttpClient androidhttpclient)
    {
        b = ag1;
        super();
        a = androidhttpclient;
    }

    public final void run()
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
            Log.e(ag.d(), "Swallowing", runtimeexception);
        }
    }
}
