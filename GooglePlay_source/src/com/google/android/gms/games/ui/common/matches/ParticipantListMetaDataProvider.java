// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.net.Uri;
import com.google.android.gms.games.multiplayer.Participant;

public interface ParticipantListMetaDataProvider
{

    public abstract String getAccountName();

    public abstract String getApplicationId();

    public abstract String getCurrentPlayerId();

    public abstract Uri getFeaturedUri();

    public abstract Participant[] getParticipants();
}
