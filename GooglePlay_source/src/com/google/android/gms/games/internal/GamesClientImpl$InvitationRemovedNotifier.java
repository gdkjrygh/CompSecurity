// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class mInvitationId
    implements com.google.android.gms.common.api.internal.tationId
{

    private final String mInvitationId;

    public final volatile void notifyListener(Object obj)
    {
        ((OnInvitationReceivedListener)obj).onInvitationRemoved$552c4e01();
    }

    public final void onNotifyListenerFailed()
    {
    }

    (String s)
    {
        mInvitationId = s;
    }
}
