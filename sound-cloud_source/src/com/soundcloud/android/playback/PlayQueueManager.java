// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.analytics.OriginProvider;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayQueueEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.policies.PolicyOperations;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.AndroidUtils;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.collections.Pair;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.functions.Predicate;
import com.soundcloud.java.strings.Strings;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.a.b.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueue, PlaySessionSource, PlayQueueOperations, PlayQueueItem, 
//            TrackSourceInfo, TrackQueueItem

public class PlayQueueManager
    implements OriginProvider
{
    public static class InsertAudioOperation
        implements QueueUpdateOperation
    {

        private final PropertySet metaData;
        private final int position;
        private final boolean shouldPersist;
        private final Urn trackUrn;

        public void execute(PlayQueue playqueue)
        {
            playqueue.insertTrack(position, trackUrn, metaData, shouldPersist);
        }

        public InsertAudioOperation(int i, Urn urn, PropertySet propertyset, boolean flag)
        {
            position = i;
            trackUrn = urn;
            metaData = propertyset;
            shouldPersist = flag;
        }
    }

    public static class InsertVideoOperation
        implements QueueUpdateOperation
    {

        private final PropertySet metaData;
        private final int position;

        public void execute(PlayQueue playqueue)
        {
            playqueue.insertVideo(position, metaData);
        }

        public InsertVideoOperation(int i, PropertySet propertyset)
        {
            position = i;
            metaData = propertyset;
        }
    }

    public static interface QueueUpdateOperation
    {

        public abstract void execute(PlayQueue playqueue);
    }

    public static class SetMetadataOperation
        implements QueueUpdateOperation
    {

        private final PropertySet metadata;
        private final int position;

        public void execute(PlayQueue playqueue)
        {
            playqueue.setMetaData(position, metadata);
        }

        public SetMetadataOperation(int i, PropertySet propertyset)
        {
            position = i;
            metadata = propertyset;
        }
    }


    private static final String UI_ASSERTION_MESSAGE = "Play queues must be set from the main thread only.";
    private boolean currentItemIsUserTriggered;
    private int currentPosition;
    private final EventBus eventBus;
    private Pair lastPlayedTrackAndPosition;
    private PlayQueue playQueue;
    private final PlayQueueOperations playQueueOperations;
    private PlaySessionSource playSessionSource;
    private final PolicyOperations policyOperations;

    public PlayQueueManager(PlayQueueOperations playqueueoperations, EventBus eventbus, PolicyOperations policyoperations)
    {
        playQueue = PlayQueue.empty();
        playSessionSource = PlaySessionSource.EMPTY;
        lastPlayedTrackAndPosition = Pair.of(Urn.NOT_SET, Long.valueOf(-1L));
        playQueueOperations = playqueueoperations;
        eventBus = eventbus;
        policyOperations = policyoperations;
    }

    private void broadcastNewPlayQueue()
    {
        eventBus.publish(EventQueue.PLAY_QUEUE, PlayQueueEvent.fromNewQueue(getCollectionUrn()));
        if (playQueue.hasItems())
        {
            eventBus.publish(EventQueue.CURRENT_PLAY_QUEUE_ITEM, CurrentPlayQueueItemEvent.fromNewQueue(getCurrentPlayQueueItem(), getCollectionUrn(), getCurrentPosition()));
        }
    }

    private int getNextPosition()
    {
        return getCurrentPosition() + 1;
    }

    private int getPositionToBeSaved()
    {
        int j = currentPosition;
        for (int i = 0; i < currentPosition;)
        {
            int k = j;
            if (!playQueue.shouldPersistItemAt(i))
            {
                k = j - 1;
            }
            i++;
            j = k;
        }

        return j;
    }

    private long getProgressToBeSaved(long l)
    {
        if (playQueue.shouldPersistItemAt(currentPosition))
        {
            return l;
        } else
        {
            return 0L;
        }
    }

    private void logEmptyPlayQueues(PlayQueue playqueue, PlaySessionSource playsessionsource)
    {
        if (playqueue.isEmpty())
        {
            ErrorUtils.handleSilentException(new IllegalStateException("Setting empty play queue"), "PlaySessionSource", playsessionsource.toString());
        }
    }

    private boolean nextItemInternal(boolean flag)
    {
        if (playQueue.hasNextItem(currentPosition))
        {
            currentPosition = currentPosition + 1;
            currentItemIsUserTriggered = flag;
            publishPositionUpdate();
            return true;
        } else
        {
            return false;
        }
    }

    private void publishPositionUpdate()
    {
        eventBus.publish(EventQueue.CURRENT_PLAY_QUEUE_ITEM, CurrentPlayQueueItemEvent.fromPositionChanged(getCurrentPlayQueueItem(), getCollectionUrn(), getCurrentPosition()));
    }

    private void publishQueueUpdate()
    {
        eventBus.publish(EventQueue.PLAY_QUEUE, PlayQueueEvent.fromQueueUpdate(getCollectionUrn()));
    }

    private void saveQueue()
    {
        if (playQueue.hasItems())
        {
            playQueueOperations.saveQueue(playQueue.copy());
        }
    }

    private void setLastPlayedTrackAndPosition(Urn urn, long l)
    {
        lastPlayedTrackAndPosition = Pair.of(urn, Long.valueOf(l));
    }

    private void setNewPlayQueueInternal(PlayQueue playqueue, PlaySessionSource playsessionsource)
    {
        AndroidUtils.assertOnUiThread("Play queues must be set from the main thread only.");
        playQueue = (PlayQueue)Preconditions.checkNotNull(playqueue, "Playqueue to update should not be null");
        currentItemIsUserTriggered = true;
        playSessionSource = playsessionsource;
        broadcastNewPlayQueue();
    }

    void appendPlayQueueItems(Iterable iterable)
    {
        playQueue.addAllPlayQueueItems(iterable);
        publishQueueUpdate();
        saveQueue();
    }

    void appendUniquePlayQueueItems(Iterable iterable)
    {
        List list = playQueue.getQueueHashes();
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            PlayQueueItem playqueueitem = (PlayQueueItem)iterable.next();
            if (!list.contains(Integer.valueOf(playqueueitem.hashCode())))
            {
                playQueue.addPlayQueueItem(playqueueitem);
            }
        } while (true);
        publishQueueUpdate();
        saveQueue();
    }

    public boolean autoNextItem()
    {
        return nextItemInternal(false);
    }

    public void clearAll()
    {
        AndroidUtils.assertOnUiThread("Play queues must be set from the main thread only.");
        playQueueOperations.clear();
        playQueue = PlayQueue.empty();
        playSessionSource = PlaySessionSource.EMPTY;
    }

    public List filterQueueItemsWithMetadata(Predicate predicate)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = playQueue.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PlayQueueItem playqueueitem = (PlayQueueItem)iterator.next();
            if (predicate.apply(playqueueitem.getMetaData()))
            {
                arraylist.add(playqueueitem);
            }
        } while (true);
        return arraylist;
    }

    public Urn getCollectionUrn()
    {
        return playSessionSource.getCollectionUrn();
    }

    public PlayQueueItem getCurrentPlayQueueItem()
    {
        return getPlayQueueItemAtPosition(currentPosition);
    }

    public PlaySessionSource getCurrentPlaySessionSource()
    {
        return playSessionSource;
    }

    public int getCurrentPosition()
    {
        return currentPosition;
    }

    public PromotedSourceInfo getCurrentPromotedSourceInfo(Urn urn)
    {
        if (isTrackFromCurrentPromotedItem(urn))
        {
            urn = getCurrentTrackSourceInfo();
            if (urn != null)
            {
                return urn.getPromotedSourceInfo();
            }
        }
        return null;
    }

    public List getCurrentQueueTrackUrns()
    {
        return playQueue.getTrackItemUrns();
    }

    public TrackSourceInfo getCurrentTrackSourceInfo()
    {
        if (playQueue.isEmpty())
        {
            return null;
        }
        TrackSourceInfo tracksourceinfo = new TrackSourceInfo(playSessionSource.getOriginScreen(), currentItemIsUserTriggered);
        Object obj = getCurrentPlayQueueItem();
        if (((PlayQueueItem) (obj)).isTrack())
        {
            obj = (TrackQueueItem)obj;
            tracksourceinfo.setSource(((TrackQueueItem) (obj)).getSource(), ((TrackQueueItem) (obj)).getSourceVersion());
            tracksourceinfo.setReposter(((TrackQueueItem) (obj)).getReposter());
        }
        if (playSessionSource.isFromQuery())
        {
            tracksourceinfo.setSearchQuerySourceInfo(playSessionSource.getSearchQuerySourceInfo());
        }
        if (playSessionSource.isFromPromotedItem())
        {
            tracksourceinfo.setPromotedSourceInfo(playSessionSource.getPromotedSourceInfo());
        }
        if (playSessionSource.isFromStations())
        {
            tracksourceinfo.setOriginStation(playSessionSource.getCollectionUrn());
        }
        obj = playSessionSource.getCollectionUrn();
        if (((Urn) (obj)).isPlaylist())
        {
            tracksourceinfo.setOriginPlaylist(((Urn) (obj)), getCurrentPosition(), playSessionSource.getCollectionOwnerUrn());
        }
        return tracksourceinfo;
    }

    public PlayQueueItem getLastPlayQueueItem()
    {
        return getPlayQueueItemAtPosition(getQueueSize() - 1);
    }

    public long getLastSavedPosition()
    {
        return ((Long)lastPlayedTrackAndPosition.second()).longValue();
    }

    public PlayQueueItem getNextPlayQueueItem()
    {
        return getPlayQueueItemAtPosition(getNextPosition());
    }

    public PlayQueueItem getPlayQueueItemAtPosition(int i)
    {
        if (i >= 0 && i < getQueueSize())
        {
            return playQueue.getPlayQueueItem(i);
        } else
        {
            return PlayQueueItem.EMPTY;
        }
    }

    public int getPositionForUrn(Urn urn)
    {
        return playQueue.indexOfTrackUrn(urn);
    }

    public int getQueueSize()
    {
        return playQueue.size();
    }

    public String getScreenTag()
    {
        return playSessionSource.getOriginScreen();
    }

    public int getUpcomingPositionForUrn(Urn urn)
    {
        return playQueue.indexOfTrackUrn(currentPosition, urn);
    }

    public boolean hasNextItem()
    {
        return playQueue.hasNextItem(currentPosition);
    }

    public boolean hasSameTrackList(List list)
    {
        return playQueue.getTrackItemUrns().equals(list);
    }

    public boolean isCurrentCollection(Urn urn)
    {
        return getCollectionUrn().equals(urn) && (playQueue.isEmpty() || isTrackQueueItemSourceEmpty(getCurrentPlayQueueItem()));
    }

    public boolean isCurrentCollectionOrRecommendation(Urn urn)
    {
        return getCollectionUrn().equals(urn);
    }

    public boolean isCurrentPosition(int i)
    {
        return i == getCurrentPosition();
    }

    public boolean isCurrentTrack(Urn urn)
    {
        return isTrackAt(urn, getCurrentPosition());
    }

    public boolean isQueueEmpty()
    {
        return playQueue.isEmpty();
    }

    public boolean isTrackAt(Urn urn, int i)
    {
        return i < getQueueSize() && getPlayQueueItemAtPosition(i).isTrack() && getPlayQueueItemAtPosition(i).getUrn().equals(urn);
    }

    public boolean isTrackFromCurrentPromotedItem(Urn urn)
    {
        TrackSourceInfo tracksourceinfo;
        tracksourceinfo = getCurrentTrackSourceInfo();
        break MISSING_BLOCK_LABEL_5;
        if (tracksourceinfo != null && tracksourceinfo.isFromPromoted())
        {
            PromotedSourceInfo promotedsourceinfo = tracksourceinfo.getPromotedSourceInfo();
            if (tracksourceinfo.isFromPlaylist() && tracksourceinfo.getPlaylistPosition() < playSessionSource.getCollectionSize())
            {
                return tracksourceinfo.getCollectionUrn().equals(promotedsourceinfo.getPromotedItemUrn());
            }
            if (isCurrentPosition(0))
            {
                return urn.equals(promotedsourceinfo.getPromotedItemUrn());
            }
        }
        return false;
    }

    public boolean isTrackQueueItemSourceEmpty(PlayQueueItem playqueueitem)
    {
        return playqueueitem.isTrack() && Strings.isBlank(((TrackQueueItem)playqueueitem).getSource());
    }

    public b loadPlayQueueAsync()
    {
        AndroidUtils.assertOnUiThread("Play queues must be set from the main thread only.");
        b b1 = playQueueOperations.getLastStoredPlayQueue();
        if (b1 != null)
        {
            return b1.doOnSubscribe(new _cls2()).observeOn(a.a()).doOnNext(new _cls1());
        } else
        {
            return b.empty();
        }
    }

    public void moveToPreviousItem()
    {
        if (playQueue.hasPreviousItem(currentPosition))
        {
            currentPosition = currentPosition - 1;
            currentItemIsUserTriggered = true;
            publishPositionUpdate();
        }
    }

    public boolean nextItem()
    {
        return nextItemInternal(true);
    }

    public transient void performPlayQueueUpdateOperations(QueueUpdateOperation aqueueupdateoperation[])
    {
        AndroidUtils.assertOnUiThread("Play queues must be set from the main thread only.");
        int j = aqueueupdateoperation.length;
        for (int i = 0; i < j; i++)
        {
            aqueueupdateoperation[i].execute(playQueue);
        }

        publishQueueUpdate();
    }

    public void removeItemsWithMetaData(Predicate predicate)
    {
        removeItemsWithMetaData(predicate, PlayQueueEvent.fromQueueUpdate(getCollectionUrn()));
    }

    public void removeItemsWithMetaData(Predicate predicate, PlayQueueEvent playqueueevent)
    {
        Iterator iterator;
        int i;
        int j;
        iterator = playQueue.iterator();
        j = 0;
        i = 0;
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (predicate.apply(((PlayQueueItem)iterator.next()).getMetaData()))
        {
            iterator.remove();
            if (j > currentPosition)
            {
                break MISSING_BLOCK_LABEL_123;
            }
            currentPosition = currentPosition - 1;
            i = 1;
            continue; /* Loop/switch isn't completed */
        }
        int k = j + 1;
        j = i;
        i = k;
_L3:
        int l = j;
        j = i;
        i = l;
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 0)
        {
            eventBus.publish(EventQueue.PLAY_QUEUE, playqueueevent);
        }
        return;
        boolean flag = true;
        i = j;
        j = ((flag) ? 1 : 0);
          goto _L3
    }

    public void saveCurrentProgress(long l)
    {
        if (playQueue.hasItems() && getCurrentPlayQueueItem().isTrack())
        {
            int i = getPositionToBeSaved();
            l = getProgressToBeSaved(l);
            Urn urn = getCurrentPlayQueueItem().getUrn();
            playQueueOperations.savePositionInfo(i, urn, playSessionSource, l);
            setLastPlayedTrackAndPosition(urn, l);
        }
    }

    public void setNewPlayQueue(PlayQueue playqueue, PlaySessionSource playsessionsource)
    {
        setNewPlayQueue(playqueue, playsessionsource, 0);
    }

    public void setNewPlayQueue(PlayQueue playqueue, PlaySessionSource playsessionsource, int i)
    {
        AndroidUtils.assertOnUiThread("Play queues must be set from the main thread only.");
        logEmptyPlayQueues(playqueue, playsessionsource);
        if (playQueue.equals(playqueue) && playSessionSource.equals(playsessionsource))
        {
            currentPosition = i;
            eventBus.publish(EventQueue.CURRENT_PLAY_QUEUE_ITEM, CurrentPlayQueueItemEvent.fromNewQueue(getCurrentPlayQueueItem(), getCollectionUrn(), getCurrentPosition()));
        } else
        {
            currentPosition = i;
            setNewPlayQueueInternal(playqueue, playsessionsource);
        }
        saveQueue();
        saveCurrentProgress(0L);
        DefaultSubscriber.fireAndForget(policyOperations.updatePolicies(playqueue.getTrackItemUrns()));
    }

    public void setPosition(int i)
    {
        if (i != currentPosition && i < playQueue.size())
        {
            currentPosition = i;
            currentItemIsUserTriggered = true;
            publishPositionUpdate();
        }
    }

    public boolean wasLastSavedTrack(Urn urn)
    {
        return ((Urn)lastPlayedTrackAndPosition.first()).equals(urn);
    }


/*
    static int access$002(PlayQueueManager playqueuemanager, int i)
    {
        playqueuemanager.currentPosition = i;
        return i;
    }

*/




    private class _cls2
        implements rx.b.a
    {

        final PlayQueueManager this$0;

        public void call()
        {
            setLastPlayedTrackAndPosition(Urn.forTrack(playQueueOperations.getLastStoredPlayingTrackId()), playQueueOperations.getLastStoredSeekPosition());
        }

        _cls2()
        {
            this$0 = PlayQueueManager.this;
            super();
        }
    }


    private class _cls1
        implements rx.b.b
    {

        final PlayQueueManager this$0;

        public void call(PlayQueue playqueue)
        {
            currentPosition = playQueueOperations.getLastStoredPlayPosition();
            setNewPlayQueueInternal(playqueue, playQueueOperations.getLastStoredPlaySessionSource());
        }

        public volatile void call(Object obj)
        {
            call((PlayQueue)obj);
        }

        _cls1()
        {
            this$0 = PlayQueueManager.this;
            super();
        }
    }

}
