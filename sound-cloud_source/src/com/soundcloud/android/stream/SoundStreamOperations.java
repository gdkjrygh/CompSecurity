// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.api.legacy.model.ContentStats;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.StreamNotificationEvent;
import com.soundcloud.android.facebookinvites.FacebookInvitesItem;
import com.soundcloud.android.facebookinvites.FacebookInvitesOperations;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.stations.StationsOperations;
import com.soundcloud.android.sync.SyncContent;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.sync.timeline.TimelineOperations;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import rx.R;
import rx.b;
import rx.b.f;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamItem, RemoveStalePromotedItemsCommand, SoundStreamStorage, MarkPromotedItemAsStaleCommand

class SoundStreamOperations extends TimelineOperations
{

    private static final f TO_STREAM_ITEMS = new _cls1();
    private final EventBus eventBus;
    private final FacebookInvitesOperations facebookInvites;
    private final FeatureFlags featureFlags;
    private final MarkPromotedItemAsStaleCommand markPromotedItemAsStaleCommand;
    private final f prependStationsOnboardingItem = new _cls3();
    private final rx.b.b promotedImpressionAction = new _cls2();
    private final RemoveStalePromotedItemsCommand removeStalePromotedItemsCommand;
    private final R scheduler;
    private final SoundStreamStorage soundStreamStorage;
    private final StationsOperations stationsOperations;

    SoundStreamOperations(SoundStreamStorage soundstreamstorage, SyncInitiator syncinitiator, ContentStats contentstats, RemoveStalePromotedItemsCommand removestalepromoteditemscommand, MarkPromotedItemAsStaleCommand markpromoteditemasstalecommand, EventBus eventbus, R r, 
            FacebookInvitesOperations facebookinvitesoperations, StationsOperations stationsoperations, FeatureFlags featureflags)
    {
        super(SyncContent.MySoundStream, soundstreamstorage, syncinitiator, contentstats, r);
        soundStreamStorage = soundstreamstorage;
        removeStalePromotedItemsCommand = removestalepromoteditemscommand;
        markPromotedItemAsStaleCommand = markpromoteditemasstalecommand;
        scheduler = r;
        eventBus = eventbus;
        facebookInvites = facebookinvitesoperations;
        stationsOperations = stationsoperations;
        featureFlags = featureflags;
    }

    private boolean canAddNotification(List list)
    {
        return list.size() > 0 && getFirstOfKind(list, StreamItem.Kind.NOTIFICATION) == null;
    }

    private boolean containsOnlyPromotedTrack(List list)
    {
        return list.size() == 1 && ((StreamItem)list.get(0)).getKind() == StreamItem.Kind.PROMOTED;
    }

    private StreamItem getFirstOfKind(List list, StreamItem.Kind kind)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            StreamItem streamitem = (StreamItem)list.next();
            if (kind.equals(streamitem.getKind()))
            {
                return streamitem;
            }
        }

        return null;
    }

    private StreamItem getLastOfKind(List list, StreamItem.Kind kind)
    {
        for (list = list.listIterator(list.size()); list.hasPrevious();)
        {
            StreamItem streamitem = (StreamItem)list.previous();
            if (kind.equals(streamitem.getKind()))
            {
                return streamitem;
            }
        }

        return null;
    }

    private g prependFacebookInvites()
    {
        return new _cls4();
    }

    private void publishFacebookInvitesShown(FacebookInvitesItem facebookinvitesitem)
    {
        eventBus.publish(EventQueue.TRACKING, StreamNotificationEvent.forFacebookInviteShown(facebookinvitesitem));
    }

    protected Date getFirstItemTimestamp(List list)
    {
        list = getFirstOfKind(list, StreamItem.Kind.PLAYABLE);
        if (list != null)
        {
            return list.getCreatedAt();
        } else
        {
            return null;
        }
    }

    protected Date getLastItemTimestamp(List list)
    {
        list = getLastOfKind(list, StreamItem.Kind.PLAYABLE);
        if (list != null)
        {
            return list.getCreatedAt();
        } else
        {
            return null;
        }
    }

    public b initialStreamItems()
    {
        return initialTimelineItems(false).doOnNext(promotedImpressionAction);
    }

    protected b initialTimelineItems(boolean flag)
    {
        return removeStalePromotedItemsCommand.toObservable(null).subscribeOn(scheduler).flatMap(RxUtils.continueWith(super.initialTimelineItems(flag))).zipWith(facebookInvites.loadWithPictures(), prependFacebookInvites()).map(prependStationsOnboardingItem);
    }

    protected boolean isEmptyResult(List list)
    {
        return list.isEmpty() || containsOnlyPromotedTrack(list);
    }

    protected f toViewModels()
    {
        return TO_STREAM_ITEMS;
    }

    public b trackUrnsForPlayback()
    {
        return soundStreamStorage.tracksForPlayback().subscribeOn(scheduler).toList();
    }

    public b updatedStreamItems()
    {
        return super.updatedTimelineItems().subscribeOn(scheduler).doOnNext(promotedImpressionAction);
    }









    private class _cls2
        implements rx.b.b
    {

        final SoundStreamOperations this$0;

        private void publishTrackingEvent(PromotedListItem promotedlistitem)
        {
            eventBus.publish(EventQueue.TRACKING, PromotedTrackingEvent.forImpression(promotedlistitem, Screen.STREAM.get()));
        }

        public volatile void call(Object obj)
        {
            call((List)obj);
        }

        public void call(List list)
        {
            list = (PromotedListItem)getFirstOfKind(list, StreamItem.Kind.PROMOTED);
            if (list != null)
            {
                markPromotedItemAsStaleCommand.call(list);
                publishTrackingEvent(list);
            }
        }

        _cls2()
        {
            this$0 = SoundStreamOperations.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final SoundStreamOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public List call(List list)
        {
            if (featureFlags.isEnabled(Flag.STATIONS_SOFT_LAUNCH) && stationsOperations.shouldDisplayOnboardingStreamItem() && canAddNotification(list))
            {
                list.add(0, new StationOnboardingStreamItem());
            }
            return list;
        }

        _cls3()
        {
            this$0 = SoundStreamOperations.this;
            super();
        }
    }


    private class _cls4
        implements g
    {

        final SoundStreamOperations this$0;

        public volatile Object call(Object obj, Object obj1)
        {
            return call((List)obj, (Optional)obj1);
        }

        public List call(List list, Optional optional)
        {
            if (optional.isPresent() && canAddNotification(list))
            {
                list.add(0, optional.get());
                publishFacebookInvitesShown((FacebookInvitesItem)optional.get());
            }
            return list;
        }

        _cls4()
        {
            this$0 = SoundStreamOperations.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public final List call(List list)
        {
            ArrayList arraylist = new ArrayList(list.size());
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                PropertySet propertyset = (PropertySet)list.next();
                if (((Urn)propertyset.get(EntityProperty.URN)).isPlayable())
                {
                    arraylist.add(PlayableItem.from(propertyset));
                }
            } while (true);
            return arraylist;
        }

        _cls1()
        {
        }
    }

}
