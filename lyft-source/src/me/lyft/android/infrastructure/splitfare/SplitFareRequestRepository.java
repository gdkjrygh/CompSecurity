// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.splitfare;

import me.lyft.android.common.Objects;
import me.lyft.android.domain.splitfare.SplitFareRequest;
import me.lyft.android.persistence.ISimpleStorage;
import rx.Observable;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.infrastructure.splitfare:
//            ISplitFareRequestRepository

public class SplitFareRequestRepository
    implements ISplitFareRequestRepository
{

    private static final String KEY = "split_fare_pending_request";
    final BehaviorSubject fareRequestBehaviorSubject;
    final ISimpleStorage simpleStorage;

    public SplitFareRequestRepository(ISimpleStorage isimplestorage)
    {
        simpleStorage = isimplestorage;
        fareRequestBehaviorSubject = BehaviorSubject.create(isimplestorage.getOrDefault("split_fare_pending_request", me/lyft/android/domain/splitfare/SplitFareRequest, SplitFareRequest.empty()));
    }

    public SplitFareRequest getPendingSplitFareRequest()
    {
        return (SplitFareRequest)Objects.firstNonNull(fareRequestBehaviorSubject.getValue(), SplitFareRequest.empty());
    }

    public boolean hasPendingRequest()
    {
        return getPendingSplitFareRequest().isPending();
    }

    public Observable observeSplitFareRequest()
    {
        return fareRequestBehaviorSubject.asObservable();
    }

    public void update(SplitFareRequest splitfarerequest)
    {
        fareRequestBehaviorSubject.onNext(splitfarerequest);
        simpleStorage.put("split_fare_pending_request", splitfarerequest);
    }
}
