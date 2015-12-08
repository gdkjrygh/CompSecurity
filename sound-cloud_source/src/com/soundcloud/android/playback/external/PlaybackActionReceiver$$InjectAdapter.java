// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.external;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.external:
//            PlaybackActionReceiver, PlaybackActionController

public final class  extends b
    implements a, Provider
{

    private b controller;

    public final void attach(l l1)
    {
        controller = l1.a("com.soundcloud.android.playback.external.PlaybackActionController", com/soundcloud/android/playback/external/PlaybackActionReceiver, getClass().getClassLoader());
    }

    public final PlaybackActionReceiver get()
    {
        PlaybackActionReceiver playbackactionreceiver = new PlaybackActionReceiver();
        injectMembers(playbackactionreceiver);
        return playbackactionreceiver;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(controller);
    }

    public final void injectMembers(PlaybackActionReceiver playbackactionreceiver)
    {
        playbackactionreceiver.controller = (PlaybackActionController)controller.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaybackActionReceiver)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playback.external.PlaybackActionReceiver", "members/com.soundcloud.android.playback.external.PlaybackActionReceiver", false, com/soundcloud/android/playback/external/PlaybackActionReceiver);
    }
}
