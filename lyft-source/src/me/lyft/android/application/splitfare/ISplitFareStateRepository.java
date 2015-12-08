// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.splitfare;

import me.lyft.android.domain.splitfare.SplitFareState;

public interface ISplitFareStateRepository
{

    public abstract SplitFareState getSplitFareState();

    public abstract void update(SplitFareState splitfarestate);
}
