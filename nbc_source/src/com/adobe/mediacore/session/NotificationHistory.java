// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.session;

import com.adobe.mediacore.MediaPlayerNotification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NotificationHistory
{
    static interface EventListener
    {

        public abstract void onNewItemAdded(Item item);
    }

    public class Item
    {

        private final long _index;
        private final MediaPlayerNotification _notification;
        private final long _timeStamp;
        final NotificationHistory this$0;

        public long getIndex()
        {
            return _index;
        }

        public MediaPlayerNotification getNotification()
        {
            return _notification;
        }

        public long getTimeStamp()
        {
            return _timeStamp;
        }

        public String toString()
        {
            StringBuffer stringbuffer = new StringBuffer("{");
            stringbuffer.append("\"index\":").append(_index).append(",");
            stringbuffer.append("\"timestamp\":").append(_timeStamp).append(",");
            if (_notification != null)
            {
                stringbuffer.append("\"notification\":").append(_notification);
            } else
            {
                stringbuffer.append("\"notification\":null");
            }
            return stringbuffer.append("}").toString();
        }

        public Item(long l, long l1, MediaPlayerNotification mediaplayernotification)
        {
            this$0 = NotificationHistory.this;
            super();
            _index = l;
            _timeStamp = l1;
            _notification = mediaplayernotification;
        }
    }


    private static final int DEFAULT_SIZE = 100;
    private long _index;
    private List _listeners;
    private List _notifications;
    private long _size;

    public NotificationHistory()
    {
        this(100L);
    }

    public NotificationHistory(long l)
    {
        _listeners = new ArrayList();
        _notifications = new ArrayList();
        _size = l;
        _index = 0L;
    }

    private void dispatchNewItemAddedEvent(Item item)
    {
        for (Iterator iterator = _listeners.iterator(); iterator.hasNext(); ((EventListener)iterator.next()).onNewItemAdded(item)) { }
    }

    public void addListener(EventListener eventlistener)
    {
        _listeners.add(eventlistener);
    }

    public void addNotification(MediaPlayerNotification mediaplayernotification)
    {
        if ((long)_notifications.size() >= _size)
        {
            _notifications.remove(_notifications.size() - 1);
        }
        long l = _index;
        _index = 1L + l;
        mediaplayernotification = new Item(l, System.currentTimeMillis(), mediaplayernotification);
        _notifications.add(0, mediaplayernotification);
        dispatchNewItemAddedEvent(mediaplayernotification);
    }

    public void clear()
    {
        _notifications.clear();
    }

    public List getNotifications()
    {
        return Collections.unmodifiableList(_notifications);
    }

    public void removeAllListeners()
    {
        _listeners.clear();
    }

    public void removeListener(EventListener eventlistener)
    {
        Iterator iterator = _listeners.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (eventlistener == (EventListener)iterator.next())
            {
                _listeners.remove(eventlistener);
            }
        } while (true);
    }

    public void setSize(long l)
    {
        if (l < 1L)
        {
            throw new IllegalArgumentException("Player session size must a positive integer value.");
        }
        if (l < _size)
        {
            ArrayList arraylist = new ArrayList();
            for (int i = 0; (long)i < l; i++)
            {
                arraylist.add(_notifications.get(i));
            }

            _notifications = arraylist;
        }
        _size = l;
    }
}
