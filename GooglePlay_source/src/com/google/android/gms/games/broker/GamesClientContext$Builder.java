// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

// Referenced classes of package com.google.android.gms.games.broker:
//            GamesClientContext

public static final class mForceReload
{

    boolean mBackground;
    final ClientContext mClientContext;
    private final Context mContext;
    public String mExternalCurrentPlayerId;
    public String mExternalOwningGameId;
    public String mExternalTargetGameId;
    public String mExternalTargetPlayerId;
    public boolean mForceReload;

    public final GamesClientContext build()
    {
        return new GamesClientContext(mContext, mClientContext, mExternalOwningGameId, mExternalTargetGameId, mExternalCurrentPlayerId, mExternalTargetPlayerId, mForceReload, mBackground, (byte)0);
    }

    public (Context context, ClientContext clientcontext)
    {
        mContext = context;
        mClientContext = clientcontext;
        mExternalCurrentPlayerId = null;
        mExternalOwningGameId = null;
        mExternalTargetGameId = null;
        mExternalTargetPlayerId = null;
        mBackground = false;
        mForceReload = false;
    }
}
