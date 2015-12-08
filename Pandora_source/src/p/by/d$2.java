// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.by;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package p.by:
//            d, c

class .Object
    implements com.google.android.gms.common.api.leApiClient.ConnectionCallbacks
{

    final d a;

    public void onConnected(Bundle bundle)
    {
        d.a("onConnected");
        if (d.a(a) != null && d.a(a).isConnected())
        {
            d.a("Connected to Client - creating cast connection");
            d.b(a).a(d.a(a));
            d.a(a, 0);
            return;
        }
        d.a("Not connected to Client");
        StringBuilder stringbuilder = (new StringBuilder()).append("Client is NULL: ");
        if (d.a(a) == null)
        {
            bundle = "TRUE";
        } else
        {
            bundle = "FALSE";
        }
        d.a(stringbuilder.append(bundle).toString());
        d.a("onConnected");
        if (d.a(a) != null && d.c(a) < 3)
        {
            d.a(a).connect();
            return;
        } else
        {
            d.a(a, false);
            d.a(a, 0);
            return;
        }
    }

    public void onConnectionSuspended(int i)
    {
        d.a((new StringBuilder()).append("onConnectionSuspended ").append(i).toString());
    }

    s.Bundle(d d1)
    {
        a = d1;
        super();
    }
}
