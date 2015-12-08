// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MojiPlaybackStateHolder
{
    private static final class a
    {

        int currentPosition;
        int incomingMessagesCount;
        int mediaDocumentId;
        int messageObjectId;
        int sizeDownloaded;
        int totalSize;

        public a(int i, int j)
        {
            messageObjectId = i;
            mediaDocumentId = j;
        }
    }


    private a currentlyPlaying;
    private Set playedMessageObjectIds;

    public MojiPlaybackStateHolder()
    {
        playedMessageObjectIds = new HashSet();
    }

    private boolean isCurrentlyPlaying(int i)
    {
        return currentlyPlaying != null && currentlyPlaying.mediaDocumentId == i;
    }

    public int getCurrentPosition(int i)
    {
        if (isCurrentlyPlayingMessage(i))
        {
            return currentlyPlaying.currentPosition;
        } else
        {
            return -1;
        }
    }

    public ArrayList getPlayedArrayList()
    {
        return new ArrayList(playedMessageObjectIds);
    }

    public int getSizeDownloaded(int i)
    {
        if (isCurrentlyPlaying(i))
        {
            return currentlyPlaying.sizeDownloaded;
        } else
        {
            return -1;
        }
    }

    public int getTotalSize(int i)
    {
        if (isCurrentlyPlaying(i))
        {
            return currentlyPlaying.totalSize;
        } else
        {
            return -1;
        }
    }

    public boolean hasPlayed(int i)
    {
        return playedMessageObjectIds.contains(Integer.valueOf(i));
    }

    public boolean isCurrentlyPlayingMessage(int i)
    {
        return currentlyPlaying != null && currentlyPlaying.messageObjectId == i;
    }

    public void onChatViewStateRestored(ArrayList arraylist)
    {
        Integer integer;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); playedMessageObjectIds.add(integer))
        {
            integer = (Integer)arraylist.next();
        }

    }

    public void onMojiSelectedForPlayback(int i, int j)
    {
        if (currentlyPlaying == null || currentlyPlaying.messageObjectId != i)
        {
            currentlyPlaying = new a(i, j);
        }
    }

    public void onNewSkypeMessage()
    {
        if (currentlyPlaying != null)
        {
            a a1 = currentlyPlaying;
            a1.incomingMessagesCount = a1.incomingMessagesCount + 1;
        }
    }

    public void onPlaybackCompletion(int i, String s, Analytics analytics)
    {
        reportAnalytics(i, s, analytics);
        resetCurrentlyPlaying();
        playedMessageObjectIds.add(Integer.valueOf(i));
    }

    public void onProgressUpdate(int i, int j, int k)
    {
        if (isCurrentlyPlaying(i))
        {
            currentlyPlaying.sizeDownloaded = j;
            currentlyPlaying.totalSize = k;
        }
    }

    public void reportAnalytics(int i, String s, Analytics analytics)
    {
        if (currentlyPlaying != null && currentlyPlaying.messageObjectId == i && currentlyPlaying.incomingMessagesCount > 0)
        {
            SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.R);
            skypetelemetryevent.put(LogAttributeName.F, s);
            skypetelemetryevent.put(LogAttributeName.a, String.valueOf(currentlyPlaying.incomingMessagesCount));
            analytics.a(skypetelemetryevent);
        }
    }

    public void resetCurrentlyPlaying()
    {
        currentlyPlaying = null;
    }

    public void setCurrentPosition(int i, int j)
    {
        if (isCurrentlyPlayingMessage(i))
        {
            currentlyPlaying.currentPosition = j;
        }
    }
}
