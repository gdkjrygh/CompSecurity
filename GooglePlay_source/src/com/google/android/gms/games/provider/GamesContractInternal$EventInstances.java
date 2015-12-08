// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.net.Uri;
import android.provider.BaseColumns;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.broker.GamesClientContext;

// Referenced classes of package com.google.android.gms.games.provider:
//            GamesContractInternal

public static final class 
    implements BaseColumns, com.google.android.gms.games.internal.
{

    public static Uri getContentUri(ClientContext clientcontext)
    {
        return ilder(clientcontext, "event_instances").ext();
    }

    public static Uri getUriForExternalEventId(ClientContext clientcontext, String s)
    {
        return ilder(clientcontext, "event_instances").ext("ext_event").ext(s).ext();
    }

    public static Uri getUriForExternalPlayerAndGameId(ClientContext clientcontext, String s, String s1)
    {
        return ilder(clientcontext, "event_instances").ext("ext_player").ext(s).ext("external_game_id", s1).ext();
    }

    public static Uri getUriForExternalPlayerAndGameId(GamesClientContext gamesclientcontext)
    {
        boolean flag;
        if (gamesclientcontext.mExternalCurrentPlayerId != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The current player must be set before calling this method.");
        return getUriForExternalPlayerAndGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalCurrentPlayerId, gamesclientcontext.mExternalTargetGameId);
    }
}
