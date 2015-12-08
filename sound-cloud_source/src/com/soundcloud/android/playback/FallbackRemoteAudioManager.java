// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback:
//            AudioFocusManager, IRemoteAudioManager, RemoteControlReceiver

public class FallbackRemoteAudioManager extends AudioFocusManager
    implements IRemoteAudioManager
{

    protected final Class RECEIVER = com/soundcloud/android/playback/RemoteControlReceiver;
    protected final ComponentName receiverComponent;

    public FallbackRemoteAudioManager(Context context)
    {
        super(context);
        receiverComponent = new ComponentName(context, RECEIVER);
    }

    public boolean isTrackChangeSupported()
    {
        return false;
    }

    public void onFocusAbandoned()
    {
        super.onFocusAbandoned();
        getAudioManager().unregisterMediaButtonEventReceiver(receiverComponent);
    }

    public void onFocusObtained()
    {
        super.onFocusObtained();
        getAudioManager().registerMediaButtonEventReceiver(receiverComponent);
    }

    public void onTrackChanged(PropertySet propertyset, Bitmap bitmap)
    {
    }

    public void setPlaybackState(boolean flag)
    {
    }
}
