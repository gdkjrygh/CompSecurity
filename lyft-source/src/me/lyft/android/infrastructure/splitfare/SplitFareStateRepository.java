// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.splitfare;

import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.domain.splitfare.SplitFareState;
import me.lyft.android.persistence.ISimpleStorage;

public class SplitFareStateRepository
    implements ISplitFareStateRepository
{

    private static final String KEY = "split_fare_state";
    private final ISimpleStorage simpleStorage;
    private SplitFareState splitFareState;

    public SplitFareStateRepository(ISimpleStorage isimplestorage)
    {
        simpleStorage = isimplestorage;
        splitFareState = (SplitFareState)isimplestorage.getOrDefault("split_fare_state", me/lyft/android/domain/splitfare/SplitFareState, SplitFareState.empty());
    }

    public SplitFareState getSplitFareState()
    {
        return splitFareState;
    }

    public void update(SplitFareState splitfarestate)
    {
        splitFareState = splitfarestate;
        simpleStorage.put("split_fare_state", splitfarestate);
    }
}
