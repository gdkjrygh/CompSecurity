// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.text.TextUtils;
import com.soundcloud.android.events.ConnectionType;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlaybackPerformanceEvent;
import com.soundcloud.android.events.PlayerType;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.playback:
//            UninterruptedPlaytimeStorage, PlaybackProtocol, PlaybackProgress

public class BufferUnderrunListener
{
    static class Detector
    {

        private boolean isStartingPlaybackAfterSeek;

        private boolean isStartingPlayback(Player.StateTransition statetransition)
        {
            return isStartingPlaybackAfterSeek || statetransition.getProgress().getPosition() == 0L;
        }

        public void onSeek()
        {
            isStartingPlaybackAfterSeek = true;
        }

        public boolean onStateTransitionEvent(Player.StateTransition statetransition)
        {
            if (isStartingPlaybackAfterSeek)
            {
                isStartingPlaybackAfterSeek = statetransition.isBuffering();
            }
            return !isStartingPlayback(statetransition) && statetransition.isBuffering();
        }

        public Detector()
        {
            isStartingPlaybackAfterSeek = false;
        }
    }


    private static final String TAG = "BufferUnderrunListener";
    private final DateProvider dateProvider;
    private final Detector detector;
    private Date enteringPlayingStateTime;
    private final EventBus eventBus;
    private final UninterruptedPlaytimeStorage uninterruptedPlaytimeStorage;

    public BufferUnderrunListener(Detector detector1, EventBus eventbus, UninterruptedPlaytimeStorage uninterruptedplaytimestorage, CurrentDateProvider currentdateprovider)
    {
        detector = detector1;
        eventBus = eventbus;
        uninterruptedPlaytimeStorage = uninterruptedplaytimestorage;
        dateProvider = currentdateprovider;
    }

    private void checkForEmptyPlayerType(Player.StateTransition statetransition)
    {
        if (TextUtils.isEmpty(statetransition.getExtraAttribute(1)))
        {
            ErrorUtils.handleSilentException("BufferUnderrunListener", new IllegalStateException((new StringBuilder("Buffer Underrun event with empty player type: ")).append(statetransition.toString()).toString()));
        }
    }

    private void emitUninterruptedPlaytimeEvent(Urn urn, PlaybackProtocol playbackprotocol, PlayerType playertype, ConnectionType connectiontype, long l)
    {
        urn = PlaybackPerformanceEvent.uninterruptedPlaytimeMs(l, playbackprotocol, playertype, connectiontype, urn.toString());
        (new StringBuilder("Playa buffer underrun. ")).append(urn);
        eventBus.publish(EventQueue.PLAYBACK_PERFORMANCE, urn);
    }

    private long incrementPlaytime(long l)
    {
        return (dateProvider.getCurrentDate().getTime() - enteringPlayingStateTime.getTime()) + l;
    }

    public void onPlaystateChanged(Player.StateTransition statetransition, PlaybackProtocol playbackprotocol, PlayerType playertype, ConnectionType connectiontype)
    {
        (new StringBuilder("StateTransition: ")).append(statetransition);
        boolean flag = detector.onStateTransitionEvent(statetransition);
        if (statetransition.isPlayerPlaying())
        {
            if (enteringPlayingStateTime == null)
            {
                enteringPlayingStateTime = dateProvider.getCurrentDate();
            }
        } else
        if (enteringPlayingStateTime != null)
        {
            long l1 = incrementPlaytime(uninterruptedPlaytimeStorage.getPlayTime(playertype));
            long l = l1;
            if (flag)
            {
                checkForEmptyPlayerType(statetransition);
                emitUninterruptedPlaytimeEvent(statetransition.getTrackUrn(), playbackprotocol, playertype, connectiontype, l1);
                l = 0L;
            }
            enteringPlayingStateTime = null;
            uninterruptedPlaytimeStorage.setPlaytime(l, playertype);
            return;
        }
    }

    public void onSeek()
    {
        detector.onSeek();
    }
}
