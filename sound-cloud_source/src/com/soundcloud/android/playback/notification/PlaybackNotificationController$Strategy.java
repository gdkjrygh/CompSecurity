// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import com.soundcloud.android.playback.PlaybackService;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            PlaybackNotificationController

static interface 
{

    public abstract void clear(PlaybackService playbackservice);

    public abstract void notifyIdleState(PlaybackService playbackservice);

    public abstract void notifyPlaying(PlaybackService playbackservice);

    public abstract void setTrack(PlaybackService playbackservice, PropertySet propertyset);
}
