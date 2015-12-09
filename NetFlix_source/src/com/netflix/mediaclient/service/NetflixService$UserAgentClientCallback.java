// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.INetflixServiceCallback;

// Referenced classes of package com.netflix.mediaclient.service:
//            NetflixService

private class requestId
    implements com.netflix.mediaclient.service.user.stId
{

    private final int clientId;
    private final int requestId;
    final NetflixService this$0;

    public void onConnectWithFacebook(int i, String s)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onConnectWithFacebook");
            return;
        } else
        {
            Log.d("NetflixService", "Notified onConnectWithFacebook");
            inetflixservicecallback.onConnectWithFacebookComplete(requestId, i, s);
            return;
        }
    }

    public void onLoginComplete(int i, String s)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onLoginComplete");
            return;
        } else
        {
            Log.d("NetflixService", "Notified onLoginComplete");
            inetflixservicecallback.onLoginComplete(requestId, i, s);
            return;
        }
    }

    public void onLogoutComplete(int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onLogoutComplete");
            return;
        } else
        {
            Log.d("NetflixService", "Notified onLogoutComplete");
            inetflixservicecallback.onLogoutComplete(requestId, i);
            return;
        }
    }

    public void onPinVerified(boolean flag, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onPinVerified");
            return;
        } else
        {
            Log.d("NetflixService", "Notified onPinVerified");
            inetflixservicecallback.onPinVerified(requestId, flag, i);
            return;
        }
    }

    (int i, int j)
    {
        this$0 = NetflixService.this;
        super();
        clientId = i;
        requestId = j;
    }
}
