// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;


public interface LeaderboardMetadataProvider
{

    public abstract int getCollection();

    public abstract String getGameId();

    public abstract String getGameName();

    public abstract String getGamePackageName();

    public abstract String getLeaderboardId();

    public abstract int getTimeSpan();
}
