// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

public final class MultiplayerImpl
    implements Multiplayer
{

    public MultiplayerImpl()
    {
    }

    public final Intent getParticipantListIntentRestricted(GoogleApiClient googleapiclient, ParticipantEntity aparticipantentity[], String s, String s1, String s2, Uri uri, Uri uri1)
    {
        return Games.getConnectedClientImpl(googleapiclient).getParticipantListIntentRestricted(aparticipantentity, s, s1, s2, uri, uri1);
    }
}
