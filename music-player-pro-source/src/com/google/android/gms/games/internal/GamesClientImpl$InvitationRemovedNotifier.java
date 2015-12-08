// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class YG
    implements com.google.android.gms.common.api.ier
{

    private final String YG;

    public void a(OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        oninvitationreceivedlistener.onInvitationRemoved(YG);
    }

    public void c(Object obj)
    {
        a((OnInvitationReceivedListener)obj);
    }

    public void gG()
    {
    }

    (String s)
    {
        YG = s;
    }
}
