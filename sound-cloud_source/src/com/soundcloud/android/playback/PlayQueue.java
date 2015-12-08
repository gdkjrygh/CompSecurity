// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.collections.Iterables;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.functions.Function;
import com.soundcloud.java.functions.Predicate;
import com.soundcloud.java.objects.MoreObjects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.playback:
//            RecommendedTracksCollection, PlayQueueItem, VideoQueueItem, PlaySessionSource

public class PlayQueue
    implements Iterable
{

    public static final String DEFAULT_SOURCE_VERSION = "default";
    private final List playQueueItems;
    private final Function toHashes = new _cls1();

    public PlayQueue(List list)
    {
        playQueueItems = list;
    }

    public static PlayQueue empty()
    {
        return new PlayQueue(Collections.emptyList());
    }

    public static PlayQueue fromRecommendations(Urn urn, RecommendedTracksCollection recommendedtrackscollection)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator1 = recommendedtrackscollection.iterator(); iterator1.hasNext(); arraylist.add((new TrackQueueItem.Builder(((ApiTrack)iterator1.next()).getUrn())).relatedEntity(urn).fromSource(PlaySessionSource.DiscoverySource.RECOMMENDER.value(), recommendedtrackscollection.getSourceVersion()).build())) { }
        return new PlayQueue(arraylist);
    }

    public static PlayQueue fromRecommendationsWithPrependedSeed(Urn urn, RecommendedTracksCollection recommendedtrackscollection)
    {
        recommendedtrackscollection = fromRecommendations(urn, recommendedtrackscollection);
        ((PlayQueue) (recommendedtrackscollection)).playQueueItems.add(0, (new TrackQueueItem.Builder(urn)).build());
        return recommendedtrackscollection;
    }

    public static PlayQueue fromStation(Urn urn, List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add((new TrackQueueItem.Builder((Urn)list.next())).relatedEntity(urn).fromSource(PlaySessionSource.DiscoverySource.STATIONS.value(), "default").build())) { }
        return new PlayQueue(arraylist);
    }

    public static PlayQueue fromTrackList(List list, PlaySessionSource playsessionsource)
    {
        return new PlayQueue(playQueueItemsFromTracks(list, playsessionsource));
    }

    public static PlayQueue fromTrackUrnList(List list, PlaySessionSource playsessionsource)
    {
        return new PlayQueue(playQueueItemsFromIds(list, playsessionsource));
    }

    private Predicate isMatchingItem(final Urn urn)
    {
        return new _cls2();
    }

    private static List playQueueItemsFromIds(List list, final PlaySessionSource playSessionSource)
    {
        return Lists.newArrayList(Lists.transform(list, new _cls3()));
    }

    private static List playQueueItemsFromTracks(List list, final PlaySessionSource playSessionSource)
    {
        return Lists.newArrayList(Lists.transform(list, new _cls4()));
    }

    public static PlayQueue shuffled(List list, PlaySessionSource playsessionsource)
    {
        list = Lists.newArrayList(list);
        Collections.shuffle(list);
        return fromTrackUrnList(list, playsessionsource);
    }

    void addAllPlayQueueItems(Iterable iterable)
    {
        Iterables.addAll(playQueueItems, iterable);
    }

    void addPlayQueueItem(PlayQueueItem playqueueitem)
    {
        playQueueItems.add(playqueueitem);
    }

    public PlayQueue copy()
    {
        return new PlayQueue(new ArrayList(playQueueItems));
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (PlayQueue)obj;
            return MoreObjects.equal(playQueueItems, ((PlayQueue) (obj)).playQueueItems);
        }
    }

    public PropertySet getMetaData(int i)
    {
        Preconditions.checkElementIndex(i, size());
        return ((PlayQueueItem)playQueueItems.get(i)).getMetaData();
    }

    public PlayQueueItem getPlayQueueItem(int i)
    {
        Preconditions.checkElementIndex(i, size());
        return (PlayQueueItem)playQueueItems.get(i);
    }

    List getQueueHashes()
    {
        return Lists.transform(playQueueItems, toHashes);
    }

    public List getTrackItemUrns()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator1 = playQueueItems.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            PlayQueueItem playqueueitem = (PlayQueueItem)iterator1.next();
            if (playqueueitem.isTrack())
            {
                arraylist.add(playqueueitem.getUrn());
            }
        } while (true);
        return arraylist;
    }

    public Urn getUrn(int i)
    {
        Preconditions.checkElementIndex(i, size());
        PlayQueueItem playqueueitem = (PlayQueueItem)playQueueItems.get(i);
        if (playqueueitem.isTrack())
        {
            return playqueueitem.getUrn();
        } else
        {
            return Urn.NOT_SET;
        }
    }

    public boolean hasItems()
    {
        return !playQueueItems.isEmpty();
    }

    public boolean hasNextItem(int i)
    {
        return i < playQueueItems.size() - 1;
    }

    public boolean hasPreviousItem(int i)
    {
        return i > 0 && !playQueueItems.isEmpty();
    }

    public int hashCode()
    {
        return playQueueItems.hashCode();
    }

    public int indexOfTrackUrn(int i, Urn urn)
    {
        int k = Iterables.indexOf(playQueueItems.subList(i, playQueueItems.size()), isMatchingItem(urn));
        int j = k;
        if (k >= 0)
        {
            j = k + i;
        }
        return j;
    }

    public int indexOfTrackUrn(Urn urn)
    {
        return Iterables.indexOf(playQueueItems, isMatchingItem(urn));
    }

    void insertPlayQueueItem(int i, PlayQueueItem playqueueitem)
    {
        boolean flag;
        if (i >= 0 && i <= size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, String.format("Cannot insert item at position:%d, size:%d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(playQueueItems.size())
        }));
        playQueueItems.add(i, playqueueitem);
    }

    public void insertTrack(int i, Urn urn, PropertySet propertyset, boolean flag)
    {
        insertPlayQueueItem(i, (new TrackQueueItem.Builder(urn)).withAdData(propertyset).persist(flag).build());
    }

    public void insertVideo(int i, PropertySet propertyset)
    {
        insertPlayQueueItem(i, new VideoQueueItem(propertyset));
    }

    public boolean isEmpty()
    {
        return playQueueItems.isEmpty();
    }

    public Iterator iterator()
    {
        return playQueueItems.iterator();
    }

    public void setMetaData(int i, PropertySet propertyset)
    {
        Preconditions.checkElementIndex(i, size());
        ((PlayQueueItem)playQueueItems.get(i)).setMetaData(propertyset);
    }

    public boolean shouldPersistItemAt(int i)
    {
        return i >= 0 && i < playQueueItems.size() && ((PlayQueueItem)playQueueItems.get(i)).shouldPersist();
    }

    public int size()
    {
        return playQueueItems.size();
    }

    private class _cls1
        implements Function
    {

        final PlayQueue this$0;

        public Integer apply(PlayQueueItem playqueueitem)
        {
            return Integer.valueOf(playqueueitem.hashCode());
        }

        public volatile Object apply(Object obj)
        {
            return apply((PlayQueueItem)obj);
        }

        _cls1()
        {
            this$0 = PlayQueue.this;
            super();
        }
    }


    private class _cls2
        implements Predicate
    {

        final PlayQueue this$0;
        final Urn val$urn;

        public boolean apply(PlayQueueItem playqueueitem)
        {
            return playqueueitem.isTrack() && playqueueitem.getUrn().equals(urn);
        }

        public volatile boolean apply(Object obj)
        {
            return apply((PlayQueueItem)obj);
        }

        _cls2()
        {
            this$0 = PlayQueue.this;
            urn = urn1;
            super();
        }
    }


    private class _cls3
        implements Function
    {

        final PlaySessionSource val$playSessionSource;

        public final PlayQueueItem apply(Urn urn)
        {
            return (new TrackQueueItem.Builder(urn)).fromSource(playSessionSource.getInitialSource(), playSessionSource.getInitialSourceVersion()).build();
        }

        public final volatile Object apply(Object obj)
        {
            return apply((Urn)obj);
        }

        _cls3()
        {
            playSessionSource = playsessionsource;
            super();
        }
    }


    private class _cls4
        implements Function
    {

        final PlaySessionSource val$playSessionSource;

        public final PlayQueueItem apply(PropertySet propertyset)
        {
            return (new TrackQueueItem.Builder(propertyset)).fromSource(playSessionSource.getInitialSource(), playSessionSource.getInitialSourceVersion()).build();
        }

        public final volatile Object apply(Object obj)
        {
            return apply((PropertySet)obj);
        }

        _cls4()
        {
            playSessionSource = playsessionsource;
            super();
        }
    }

}
