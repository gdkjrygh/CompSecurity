// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.request.OnRequestReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class Jo extends com.google.android.gms.internal.lback
{

    final GamesClientImpl IJ;
    private final String Jo;

    protected void a(Object obj)
    {
        b((OnRequestReceivedListener)obj);
    }

    protected void b(OnRequestReceivedListener onrequestreceivedlistener)
    {
        onrequestreceivedlistener.onRequestRemoved(Jo);
    }

    protected void dx()
    {
    }

    (GamesClientImpl gamesclientimpl, OnRequestReceivedListener onrequestreceivedlistener, String s)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, onrequestreceivedlistener);
        Jo = s;
    }
}
