// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesStatusCodes;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class mIsMuted
    implements com.google.android.gms.games.sultImpl
{

    private final String mExternalGameId;
    private final boolean mIsMuted;
    private final Status mStatus;

    public final String getExternalGameId()
    {
        return mExternalGameId;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public final boolean isMuted()
    {
        return mIsMuted;
    }

    public (int i, String s, boolean flag)
    {
        mStatus = GamesStatusCodes.create(i);
        mExternalGameId = s;
        mIsMuted = flag;
    }
}
