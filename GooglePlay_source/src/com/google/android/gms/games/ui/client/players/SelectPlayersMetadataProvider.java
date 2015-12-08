// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import java.util.ArrayList;

public interface SelectPlayersMetadataProvider
{

    public abstract boolean allowAutoMatch();

    public abstract boolean allowNearbySearch();

    public abstract int getBottomPadding();

    public abstract int getMaxParticipants();

    public abstract int getMinParticipants();

    public abstract ArrayList getPreselectedPlayerIds();

    public abstract int getRecentPlayersType();

    public abstract boolean showIdentitySharingCard();

    public abstract boolean updateSubtitle();
}
