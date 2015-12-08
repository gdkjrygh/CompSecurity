// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.request.OnRequestReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Zt
    implements com.google.android.gms.common.api.ier
{

    private final String Zt;

    public void a(OnRequestReceivedListener onrequestreceivedlistener)
    {
        onrequestreceivedlistener.onRequestRemoved(Zt);
    }

    public void c(Object obj)
    {
        a((OnRequestReceivedListener)obj);
    }

    public void gG()
    {
    }

    (String s)
    {
        Zt = s;
    }
}
