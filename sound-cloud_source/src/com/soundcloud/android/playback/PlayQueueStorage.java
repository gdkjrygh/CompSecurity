// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.ContentValues;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.schema.Table;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.b;

// Referenced classes of package com.soundcloud.android.playback:
//            TrackQueueItem, PlayQueue, PlayQueueItem

class PlayQueueStorage
{

    private static final Table TABLE;
    private final PropellerRx propellerRx;

    public PlayQueueStorage(PropellerRx propellerrx)
    {
        propellerRx = propellerrx;
    }

    private boolean hasRelatedEntity(CursorReader cursorreader)
    {
        return cursorreader.isNotNull(com.soundcloud.android.storage.Tables.PlayQueue.RELATED_ENTITY);
    }

    private boolean hasReposter(CursorReader cursorreader)
    {
        return cursorreader.isNotNull(com.soundcloud.android.storage.Tables.PlayQueue.REPOSTER_ID) && cursorreader.getLong(com.soundcloud.android.storage.Tables.PlayQueue.REPOSTER_ID) > 0L;
    }

    private ContentValues trackItemContentValues(TrackQueueItem trackqueueitem)
    {
        ContentValuesBuilder contentvaluesbuilder = ContentValuesBuilder.values(4).put(com.soundcloud.android.storage.Tables.PlayQueue.TRACK_ID, trackqueueitem.getTrackUrn().getNumericId()).put(com.soundcloud.android.storage.Tables.PlayQueue.SOURCE, trackqueueitem.getSource()).put(com.soundcloud.android.storage.Tables.PlayQueue.SOURCE_VERSION, trackqueueitem.getSourceVersion());
        if (!trackqueueitem.getRelatedEntity().equals(Urn.NOT_SET))
        {
            contentvaluesbuilder.put(com.soundcloud.android.storage.Tables.PlayQueue.RELATED_ENTITY, trackqueueitem.getRelatedEntity().toString());
        }
        if (trackqueueitem.getReposter().isUser())
        {
            contentvaluesbuilder.put(com.soundcloud.android.storage.Tables.PlayQueue.REPOSTER_ID, trackqueueitem.getReposter().getNumericId());
        }
        return contentvaluesbuilder.get();
    }

    public b clearAsync()
    {
        return propellerRx.truncate(TABLE);
    }

    public b loadAsync()
    {
        return propellerRx.query(Query.from(new String[] {
            TABLE.name()
        })).map(new _cls2());
    }

    public b storeAsync(PlayQueue playqueue)
    {
        final ArrayList newItems = new ArrayList(playqueue.size());
        playqueue = playqueue.iterator();
        do
        {
            if (!playqueue.hasNext())
            {
                break;
            }
            PlayQueueItem playqueueitem = (PlayQueueItem)playqueue.next();
            if (playqueueitem.shouldPersist())
            {
                if (playqueueitem.isTrack())
                {
                    newItems.add(trackItemContentValues((TrackQueueItem)playqueueitem));
                } else
                {
                    ErrorUtils.handleSilentException(new IllegalStateException("Tried to persist an unsupported play queue item"));
                }
            }
        } while (true);
        return clearAsync().flatMap(new _cls1());
    }

    static 
    {
        TABLE = com.soundcloud.android.storage.Tables.PlayQueue.TABLE;
    }





    private class _cls2 extends RxResultMapper
    {

        final PlayQueueStorage this$0;

        public PlayQueueItem map(CursorReader cursorreader)
        {
            Urn urn;
            Urn urn1;
            String s;
            String s1;
            if (hasRelatedEntity(cursorreader))
            {
                urn = new Urn(cursorreader.getString(com.soundcloud.android.storage.Tables.PlayQueue.RELATED_ENTITY));
            } else
            {
                urn = Urn.NOT_SET;
            }
            if (hasReposter(cursorreader))
            {
                urn1 = Urn.forUser(cursorreader.getLong(com.soundcloud.android.storage.Tables.PlayQueue.REPOSTER_ID));
            } else
            {
                urn1 = Urn.NOT_SET;
            }
            s = cursorreader.getString(com.soundcloud.android.storage.Tables.PlayQueue.SOURCE);
            s1 = cursorreader.getString(com.soundcloud.android.storage.Tables.PlayQueue.SOURCE_VERSION);
            return (new TrackQueueItem.Builder(Urn.forTrack(cursorreader.getLong(com.soundcloud.android.storage.Tables.PlayQueue.TRACK_ID)), urn1)).relatedEntity(urn).fromSource(s, s1).build();
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        _cls2()
        {
            this$0 = PlayQueueStorage.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        final PlayQueueStorage this$0;
        final List val$newItems;

        public volatile Object call(Object obj)
        {
            return call((ChangeResult)obj);
        }

        public b call(ChangeResult changeresult)
        {
            return propellerRx.bulkInsert(PlayQueueStorage.TABLE, newItems);
        }

        _cls1()
        {
            this$0 = PlayQueueStorage.this;
            newItems = list;
            super();
        }
    }

}
