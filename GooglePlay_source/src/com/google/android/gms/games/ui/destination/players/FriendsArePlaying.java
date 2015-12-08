// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.logging.LogflowDocument;
import java.util.ArrayList;

public final class FriendsArePlaying
    implements LogflowDocument
{

    public final MostRecentGameInfo mostRecentGameInfo;
    public final ArrayList playerList = new ArrayList();

    public FriendsArePlaying(MostRecentGameInfo mostrecentgameinfo)
    {
        mostRecentGameInfo = mostrecentgameinfo;
    }

    public final String getDocumentId()
    {
        return mostRecentGameInfo.getGameId();
    }
}
