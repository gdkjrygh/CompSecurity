// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class mRoomId
    implements com.google.android.gms.common.api.internal.Id
{

    private final String mRoomId;
    private final int mStatusCode;

    public final volatile void notifyListener(Object obj)
    {
        ((RoomUpdateListener)obj).onLeftRoom$4f708078(mRoomId);
    }

    public final void onNotifyListenerFailed()
    {
    }

    (int i, String s)
    {
        mStatusCode = i;
        mRoomId = s;
    }
}
