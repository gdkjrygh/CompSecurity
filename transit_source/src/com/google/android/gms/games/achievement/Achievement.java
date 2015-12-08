// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Player;

public interface Achievement
{

    public static final int STATE_HIDDEN = 2;
    public static final int STATE_REVEALED = 1;
    public static final int STATE_UNLOCKED = 0;
    public static final int TYPE_INCREMENTAL = 1;
    public static final int TYPE_STANDARD = 0;

    public abstract String getAchievementId();

    public abstract int getCurrentSteps();

    public abstract String getDescription();

    public abstract void getDescription(CharArrayBuffer chararraybuffer);

    public abstract String getFormattedCurrentSteps();

    public abstract void getFormattedCurrentSteps(CharArrayBuffer chararraybuffer);

    public abstract String getFormattedTotalSteps();

    public abstract void getFormattedTotalSteps(CharArrayBuffer chararraybuffer);

    public abstract long getLastUpdatedTimestamp();

    public abstract String getName();

    public abstract void getName(CharArrayBuffer chararraybuffer);

    public abstract Player getPlayer();

    public abstract Uri getRevealedImageUri();

    public abstract int getState();

    public abstract int getTotalSteps();

    public abstract int getType();

    public abstract Uri getUnlockedImageUri();
}
