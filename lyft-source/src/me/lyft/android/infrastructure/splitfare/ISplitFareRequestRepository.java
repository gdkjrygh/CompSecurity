// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.splitfare;

import me.lyft.android.domain.splitfare.SplitFareRequest;
import rx.Observable;

public interface ISplitFareRequestRepository
{

    public abstract SplitFareRequest getPendingSplitFareRequest();

    public abstract boolean hasPendingRequest();

    public abstract Observable observeSplitFareRequest();

    public abstract void update(SplitFareRequest splitfarerequest);
}
