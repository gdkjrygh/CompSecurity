// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.net.Uri;
import android.provider.BaseColumns;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.GamesClientContext;

// Referenced classes of package com.google.android.gms.games.provider:
//            GamesContractInternal

public static final class Q
    implements BaseColumns, com.google.android.gms.games.internal.Q
{

    public static Uri getContentUri(ClientContext clientcontext)
    {
        return lder(clientcontext, "event_pending_ops").xt();
    }

    public static Uri getUriForExternalEventId(ClientContext clientcontext, String s)
    {
        return lder(clientcontext, "event_pending_ops").xt("ext_event").xt(s).xt();
    }

    public static Uri getUriForExternalPlayerAndGameId(GamesClientContext gamesclientcontext)
    {
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        String s = gamesclientcontext.mExternalCurrentPlayerId;
        gamesclientcontext = gamesclientcontext.mExternalTargetGameId;
        return lder(clientcontext, "event_pending_ops").xt("ext_player").xt(s).xt("external_game_id", gamesclientcontext).xt();
    }

    public static Uri getUriForId(ClientContext clientcontext, long l)
    {
        return lder(clientcontext, "event_pending_ops").xt(String.valueOf(l)).xt();
    }
}
