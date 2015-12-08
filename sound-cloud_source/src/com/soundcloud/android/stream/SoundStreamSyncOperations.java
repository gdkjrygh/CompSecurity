// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.content.Context;
import com.soundcloud.android.api.legacy.model.ContentStats;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.java.collections.Iterables;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;
import java.util.Date;
import java.util.List;
import rx.b;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamStorage, StreamNotificationBuilder, RichStreamNotificationBuilder

public class SoundStreamSyncOperations
{

    static final int MAX_NOTIFICATION_ITEMS = 3;
    private final Context appContext;
    private final ContentStats contentStats;
    private final DefaultSubscriber notificationSubscriber = new _cls1();
    private final SoundStreamStorage soundStreamStorage;
    private final StreamNotificationBuilder streamNotificationBuilder;

    SoundStreamSyncOperations(SoundStreamStorage soundstreamstorage, Context context, RichStreamNotificationBuilder richstreamnotificationbuilder, ContentStats contentstats)
    {
        soundStreamStorage = soundstreamstorage;
        appContext = context;
        streamNotificationBuilder = richstreamnotificationbuilder;
        contentStats = contentstats;
    }

    private long getNewestStreamItemCreatedAt(List list)
    {
        return ((Date)((PropertySet)list.get(0)).get(PlayableProperty.CREATED_AT)).getTime();
    }

    private boolean hasItemNewerThan(List list, final long lastNotified)
    {
        return Iterables.tryFind(list, new _cls2()).isPresent();
    }

    private void setLastNotifiedTimes(List list)
    {
        contentStats.setLastNotified(Content.ME_SOUND_STREAM, System.currentTimeMillis());
        contentStats.setLastNotifiedItem(Content.ME_SOUND_STREAM, getNewestStreamItemCreatedAt(list));
    }

    public boolean createNotificationForUnseenItems()
    {
        long l = contentStats.getLastSeen(Content.ME_SOUND_STREAM);
        List list = soundStreamStorage.loadStreamItemsSince(l, 3);
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && hasItemNewerThan(list, contentStats.getLastNotifiedItem(Content.ME_SOUND_STREAM)))
        {
            streamNotificationBuilder.notification(list).subscribe(notificationSubscriber);
            setLastNotifiedTimes(list);
            return true;
        } else
        {
            return false;
        }
    }


    private class _cls1 extends DefaultSubscriber
    {

        final SoundStreamSyncOperations this$0;

        public void onNext(Notification notification)
        {
            ((NotificationManager)appContext.getSystemService("notification")).notify(4, notification);
        }

        public volatile void onNext(Object obj)
        {
            onNext((Notification)obj);
        }

        _cls1()
        {
            this$0 = SoundStreamSyncOperations.this;
            super();
        }
    }


    private class _cls2
        implements Predicate
    {

        final SoundStreamSyncOperations this$0;
        final long val$lastNotified;

        public boolean apply(PropertySet propertyset)
        {
            return ((Date)propertyset.get(PlayableProperty.CREATED_AT)).getTime() > lastNotified;
        }

        public volatile boolean apply(Object obj)
        {
            return apply((PropertySet)obj);
        }

        _cls2()
        {
            this$0 = SoundStreamSyncOperations.this;
            lastNotified = l;
            super();
        }
    }

}
