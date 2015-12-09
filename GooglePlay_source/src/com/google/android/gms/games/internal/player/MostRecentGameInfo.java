// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public interface MostRecentGameInfo
    extends Parcelable, Freezable
{

    public abstract long getActivityTimestampMillis();

    public abstract Uri getGameFeaturedImageUri();

    public abstract Uri getGameHiResImageUri();

    public abstract Uri getGameIconImageUri();

    public abstract String getGameId();

    public abstract String getGameName();
}
