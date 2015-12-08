// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client.games;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import java.util.ArrayList;
import java.util.List;

public interface GameFirstParty
    extends Parcelable, Freezable
{

    public abstract int getAchievementUnlockedCount();

    public abstract int getAvailability();

    public abstract ArrayList getBadges();

    public abstract String getFormattedFullPrice();

    public abstract String getFormattedPrice();

    public abstract long getFullPriceMicros();

    public abstract Game getGame();

    public abstract long getLastPlayedServerTimestamp();

    public abstract long getPriceMicros();

    public abstract List getScreenshotImageUris();

    public abstract SnapshotMetadata getSnapshot();

    public abstract String getVideoUrl();

    public abstract boolean isOwned();
}
