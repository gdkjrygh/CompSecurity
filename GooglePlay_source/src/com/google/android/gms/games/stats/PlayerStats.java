// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public interface PlayerStats
    extends Parcelable, Freezable
{

    public abstract float getAverageSessionLength();

    public abstract float getChurnProbability();

    public abstract int getDaysSinceLastPlayed();

    public abstract int getNumberOfPurchases();

    public abstract int getNumberOfSessions();

    public abstract Bundle getRawValues();

    public abstract float getSessionPercentile();

    public abstract float getSpendPercentile();
}
