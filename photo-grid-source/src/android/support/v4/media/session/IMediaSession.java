// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            PlaybackStateCompat, ParcelableVolumeInfo, IMediaControllerCallback

public interface IMediaSession
    extends IInterface
{

    public abstract void adjustVolume(int i, int j, String s);

    public abstract void fastForward();

    public abstract Bundle getExtras();

    public abstract long getFlags();

    public abstract PendingIntent getLaunchPendingIntent();

    public abstract MediaMetadataCompat getMetadata();

    public abstract String getPackageName();

    public abstract PlaybackStateCompat getPlaybackState();

    public abstract List getQueue();

    public abstract CharSequence getQueueTitle();

    public abstract int getRatingType();

    public abstract String getTag();

    public abstract ParcelableVolumeInfo getVolumeAttributes();

    public abstract boolean isTransportControlEnabled();

    public abstract void next();

    public abstract void pause();

    public abstract void play();

    public abstract void playFromMediaId(String s, Bundle bundle);

    public abstract void playFromSearch(String s, Bundle bundle);

    public abstract void previous();

    public abstract void rate(RatingCompat ratingcompat);

    public abstract void registerCallbackListener(IMediaControllerCallback imediacontrollercallback);

    public abstract void rewind();

    public abstract void seekTo(long l);

    public abstract void sendCommand(String s, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultreceiverwrapper);

    public abstract void sendCustomAction(String s, Bundle bundle);

    public abstract boolean sendMediaButton(KeyEvent keyevent);

    public abstract void setVolumeTo(int i, int j, String s);

    public abstract void skipToQueueItem(long l);

    public abstract void stop();

    public abstract void unregisterCallbackListener(IMediaControllerCallback imediacontrollercallback);
}
