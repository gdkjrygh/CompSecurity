// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.OnRequestReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class mRequest
    implements com.google.android.gms.common.api.internal.est
{

    private final GameRequest mRequest;

    public final volatile void notifyListener(Object obj)
    {
        ((OnRequestReceivedListener)obj).onRequestReceived(mRequest);
    }

    public final void onNotifyListenerFailed()
    {
    }

    (GameRequest gamerequest)
    {
        mRequest = gamerequest;
    }
}
