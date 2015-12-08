// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.graphics.Bitmap;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback:
//            IAudioManager

public interface IRemoteAudioManager
    extends IAudioManager
{

    public abstract boolean isTrackChangeSupported();

    public abstract void onTrackChanged(PropertySet propertyset, Bitmap bitmap);

    public abstract void setPlaybackState(boolean flag);
}
