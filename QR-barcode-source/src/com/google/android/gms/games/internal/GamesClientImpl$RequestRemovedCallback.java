// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.request.OnRequestReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class XC extends com.google.android.gms.common.internal.C
{

    final GamesClientImpl WC;
    private final String XC;

    protected void b(OnRequestReceivedListener onrequestreceivedlistener)
    {
        onrequestreceivedlistener.onRequestRemoved(XC);
    }

    protected void g(Object obj)
    {
        b((OnRequestReceivedListener)obj);
    }

    protected void gT()
    {
    }

    (GamesClientImpl gamesclientimpl, OnRequestReceivedListener onrequestreceivedlistener, String s)
    {
        WC = gamesclientimpl;
        super(gamesclientimpl, onrequestreceivedlistener);
        XC = s;
    }
}
