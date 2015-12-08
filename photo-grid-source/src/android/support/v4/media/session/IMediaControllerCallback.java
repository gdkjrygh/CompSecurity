// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            PlaybackStateCompat, ParcelableVolumeInfo

public interface IMediaControllerCallback
    extends IInterface
{

    public abstract void onEvent(String s, Bundle bundle);

    public abstract void onExtrasChanged(Bundle bundle);

    public abstract void onMetadataChanged(MediaMetadataCompat mediametadatacompat);

    public abstract void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat);

    public abstract void onQueueChanged(List list);

    public abstract void onQueueTitleChanged(CharSequence charsequence);

    public abstract void onSessionDestroyed();

    public abstract void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo);
}
