// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.request.OnRequestReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class OB extends com.google.android.gms.internal.lback
{

    final GamesClientImpl NE;
    private final String OB;

    protected void b(OnRequestReceivedListener onrequestreceivedlistener)
    {
        onrequestreceivedlistener.onRequestRemoved(OB);
    }

    protected void d(Object obj)
    {
        b((OnRequestReceivedListener)obj);
    }

    protected void fu()
    {
    }

    (GamesClientImpl gamesclientimpl, OnRequestReceivedListener onrequestreceivedlistener, String s)
    {
        NE = gamesclientimpl;
        super(gamesclientimpl, onrequestreceivedlistener);
        OB = s;
    }
}
