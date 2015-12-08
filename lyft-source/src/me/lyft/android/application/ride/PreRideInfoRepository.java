// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import java.util.ArrayList;
import java.util.List;
import me.lyft.android.domain.ride.PickupOffset;
import me.lyft.android.domain.ride.PreRideInfo;
import me.lyft.android.persistence.ISimpleStorage;
import rx.Observable;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.application.ride:
//            IPreRideInfoRepository

public class PreRideInfoRepository
    implements IPreRideInfoRepository
{

    private static final int DEFAULT_PICKUP_OFFSET = 20;
    private static final int PICKUP_OFFSETS_MINUTES[] = {
        10, 20, 40, 60
    };
    public static final String PRERIDEINFO_KEY = "prerideinfo";
    final PickupOffset defaultPickupOffset = new PickupOffset(20);
    final List pickupOffsets;
    final BehaviorSubject preRideInfoSubject;
    final ISimpleStorage simpleStorage;

    public PreRideInfoRepository(ISimpleStorage isimplestorage)
    {
        simpleStorage = isimplestorage;
        preRideInfoSubject = BehaviorSubject.create(isimplestorage.getOrDefault("prerideinfo", me/lyft/android/domain/ride/PreRideInfo, PreRideInfo.empty()));
        pickupOffsets = new ArrayList(PICKUP_OFFSETS_MINUTES.length);
        isimplestorage = PICKUP_OFFSETS_MINUTES;
        int j = isimplestorage.length;
        for (int i = 0; i < j; i++)
        {
            int k = isimplestorage[i];
            pickupOffsets.add(new PickupOffset(k));
        }

    }

    public PickupOffset getDefaultPickupOffset()
    {
        return defaultPickupOffset;
    }

    public List getPickupOffsets()
    {
        return pickupOffsets;
    }

    public PreRideInfo getPreRideInfo()
    {
        return (PreRideInfo)preRideInfoSubject.getValue();
    }

    public Observable observePreRideInfo()
    {
        return preRideInfoSubject.asObservable();
    }

    public void update(PreRideInfo prerideinfo)
    {
        preRideInfoSubject.onNext(prerideinfo);
        simpleStorage.put("prerideinfo", prerideinfo);
    }

}
