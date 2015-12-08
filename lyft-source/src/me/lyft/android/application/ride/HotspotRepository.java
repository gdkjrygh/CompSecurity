// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import java.util.List;
import me.lyft.android.persistence.ISimpleStorage;
import rx.Observable;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.application.ride:
//            IHotspotRepository

public class HotspotRepository
    implements IHotspotRepository
{

    private static final String HOTSPOTS_KEY = "hotspots";
    private final BehaviorSubject hotspotObservable = BehaviorSubject.create();
    private final ISimpleStorage simpleStorage;

    public HotspotRepository(ISimpleStorage isimplestorage)
    {
        simpleStorage = isimplestorage;
        isimplestorage = (HotspotsList)isimplestorage.getOrDefault("hotspots", me/lyft/android/application/ride/HotspotRepository$HotspotsList, new HotspotsList());
        hotspotObservable.onNext(isimplestorage);
    }

    public Observable observeHotspotLocations()
    {
        return hotspotObservable.asObservable();
    }

    public void update(List list)
    {
        simpleStorage.put("hotspots", list);
        hotspotObservable.onNext(list);
    }

    private class HotspotsList extends ArrayList
    {

        private HotspotsList()
        {
        }

    }

}
