// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.session;

import com.adobe.mediacore.MediaPlayerNotification;

// Referenced classes of package com.adobe.mediacore.session:
//            NotificationHistory

public class _notification
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

    public (long l, long l1, MediaPlayerNotification mediaplayernotification)
    {
        this$0 = NotificationHistory.this;
        super();
        _index = l;
        _timeStamp = l1;
        _notification = mediaplayernotification;
    }
}
