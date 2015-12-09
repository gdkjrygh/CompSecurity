// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.Player;

public abstract class BaseAchievementComparisonItem
{

    public final long date;
    public final String description;
    public final String gameId;
    public final int myAchievementState;
    public final String name;
    public final Player playerMe;
    public final Player playerThem;
    public final Uri revealedUri;
    public final int theirAchievementState;
    public final Uri unlockedUri;
    public final long xp;

    protected BaseAchievementComparisonItem(Parcel parcel)
    {
        name = parcel.readString();
        description = parcel.readString();
        gameId = parcel.readString();
        xp = parcel.readLong();
        date = parcel.readLong();
        unlockedUri = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        revealedUri = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        playerMe = (Player)parcel.readParcelable(com/google/android/gms/games/Player.getClassLoader());
        myAchievementState = parcel.readInt();
        playerThem = (Player)parcel.readParcelable(com/google/android/gms/games/Player.getClassLoader());
        theirAchievementState = parcel.readInt();
    }

    protected BaseAchievementComparisonItem(String s, String s1, String s2, long l, long l1, 
            Uri uri, Uri uri1, Player player, int i, Player player1, int j)
    {
        name = s;
        description = s1;
        gameId = s2;
        xp = l;
        date = l1;
        unlockedUri = uri;
        revealedUri = uri1;
        playerMe = player;
        myAchievementState = i;
        playerThem = player1;
        theirAchievementState = j;
    }
}
