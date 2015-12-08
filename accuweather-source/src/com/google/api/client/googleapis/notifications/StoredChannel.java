// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.notifications;

import com.google.api.client.util.Objects;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.DataStoreFactory;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.api.client.googleapis.notifications:
//            NotificationUtils, UnparsedNotificationCallback

public final class StoredChannel
    implements Serializable
{

    public static final String DEFAULT_DATA_STORE_ID = com/google/api/client/googleapis/notifications/StoredChannel.getSimpleName();
    private static final long serialVersionUID = 1L;
    private String clientToken;
    private Long expiration;
    private final String id;
    private final Lock lock;
    private final UnparsedNotificationCallback notificationCallback;
    private String topicId;

    public StoredChannel(UnparsedNotificationCallback unparsednotificationcallback)
    {
        this(unparsednotificationcallback, NotificationUtils.randomUuidString());
    }

    public StoredChannel(UnparsedNotificationCallback unparsednotificationcallback, String s)
    {
        lock = new ReentrantLock();
        notificationCallback = (UnparsedNotificationCallback)Preconditions.checkNotNull(unparsednotificationcallback);
        id = (String)Preconditions.checkNotNull(s);
    }

    public static DataStore getDefaultDataStore(DataStoreFactory datastorefactory)
        throws IOException
    {
        return datastorefactory.getDataStore(DEFAULT_DATA_STORE_ID);
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof StoredChannel))
        {
            return false;
        } else
        {
            obj = (StoredChannel)obj;
            return getId().equals(((StoredChannel) (obj)).getId());
        }
    }

    public String getClientToken()
    {
        lock.lock();
        String s = clientToken;
        lock.unlock();
        return s;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Long getExpiration()
    {
        lock.lock();
        Long long1 = expiration;
        lock.unlock();
        return long1;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public String getId()
    {
        lock.lock();
        String s = id;
        lock.unlock();
        return s;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public UnparsedNotificationCallback getNotificationCallback()
    {
        lock.lock();
        UnparsedNotificationCallback unparsednotificationcallback = notificationCallback;
        lock.unlock();
        return unparsednotificationcallback;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public String getTopicId()
    {
        lock.lock();
        String s = topicId;
        lock.unlock();
        return s;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public int hashCode()
    {
        return getId().hashCode();
    }

    public StoredChannel setClientToken(String s)
    {
        lock.lock();
        clientToken = s;
        lock.unlock();
        return this;
        s;
        lock.unlock();
        throw s;
    }

    public StoredChannel setExpiration(Long long1)
    {
        lock.lock();
        expiration = long1;
        lock.unlock();
        return this;
        long1;
        lock.unlock();
        throw long1;
    }

    public StoredChannel setTopicId(String s)
    {
        lock.lock();
        topicId = s;
        lock.unlock();
        return this;
        s;
        lock.unlock();
        throw s;
    }

    public StoredChannel store(DataStore datastore)
        throws IOException
    {
        lock.lock();
        datastore.set(getId(), this);
        lock.unlock();
        return this;
        datastore;
        lock.unlock();
        throw datastore;
    }

    public StoredChannel store(DataStoreFactory datastorefactory)
        throws IOException
    {
        return store(getDefaultDataStore(datastorefactory));
    }

    public String toString()
    {
        return Objects.toStringHelper(com/google/api/client/googleapis/notifications/StoredChannel).add("notificationCallback", getNotificationCallback()).add("clientToken", getClientToken()).add("expiration", getExpiration()).add("id", getId()).add("topicId", getTopicId()).toString();
    }

}
