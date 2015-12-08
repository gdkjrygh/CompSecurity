// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public class PlayerWorkflowState
{

    PlayerActivity.PlayerActivityState activityState;
    boolean audioSeekToInProgress;
    boolean draggingAudioInProgress;
    boolean draggingInProgress;
    private long lastActionTime;
    boolean lowBandwidth;
    AtomicBoolean playStartInProgress;
    boolean playStarted;
    private boolean playbackStopped;
    boolean seekToInProgress;
    boolean stalled;
    private int timelineCurrentSeekPosition;
    boolean timelineExitOnSnap;
    public boolean timelineInSnapZone;
    private int timelinePreviousSeekPosition;
    private int timelineSeekDelta;
    int timelineStartSeekPosition;
    private boolean userInteraction;
    boolean videoLoaded;
    boolean videoPrepared;
    long volumeChangeInProgress;

    public PlayerWorkflowState()
    {
        playStartInProgress = new AtomicBoolean();
        activityState = PlayerActivity.PlayerActivityState.ACTIVITY_NOTREADY;
        videoLoaded = false;
        videoPrepared = false;
        playbackStopped = false;
        playStarted = false;
        volumeChangeInProgress = -1L;
        timelineStartSeekPosition = 0;
        timelineCurrentSeekPosition = 0;
        timelineSeekDelta = 0;
        timelineExitOnSnap = false;
        timelinePreviousSeekPosition = 0;
        timelineInSnapZone = true;
    }

    public PlayerActivity.PlayerActivityState getActivityState()
    {
        return activityState;
    }

    public long getLastActionTime()
    {
        return lastActionTime;
    }

    public AtomicBoolean getPlayStartInProgress()
    {
        return playStartInProgress;
    }

    public int getTimelineCurrentSeekPosition()
    {
        return timelineCurrentSeekPosition;
    }

    public boolean getTimelineExitOnSnap()
    {
        return timelineExitOnSnap;
    }

    public int getTimelinePreviousSeekPosition()
    {
        return timelinePreviousSeekPosition;
    }

    public int getTimelineSeekDelta()
    {
        return timelineSeekDelta;
    }

    public int getTimelineStartSeekPosition()
    {
        return timelineStartSeekPosition;
    }

    public long getVolumeChangeInProgress()
    {
        return volumeChangeInProgress;
    }

    public boolean isAudioSeekToInProgress()
    {
        return audioSeekToInProgress;
    }

    public boolean isDraggingAudioInProgress()
    {
        return draggingAudioInProgress;
    }

    public boolean isDraggingInProgress()
    {
        return draggingInProgress;
    }

    public boolean isLowBandwidth()
    {
        return lowBandwidth;
    }

    public boolean isPlayStarted()
    {
        return playStarted;
    }

    public boolean isPlaybackStopped()
    {
        return playbackStopped;
    }

    public boolean isSeekForward()
    {
        return timelineCurrentSeekPosition < timelinePreviousSeekPosition;
    }

    public boolean isSeekToInProgress()
    {
        return seekToInProgress;
    }

    public boolean isStalled()
    {
        return stalled;
    }

    public boolean isTimelineInSnapZone()
    {
        return timelineInSnapZone;
    }

    public boolean isVideoLoaded()
    {
        return videoLoaded;
    }

    public boolean isVideoPrepared()
    {
        return videoPrepared;
    }

    public boolean noUserInteraction()
    {
        return !userInteraction;
    }

    public void reset()
    {
        lastActionTime = 0L;
        videoLoaded = false;
        videoPrepared = false;
        draggingInProgress = false;
        draggingAudioInProgress = false;
        seekToInProgress = false;
        audioSeekToInProgress = false;
        playbackStopped = false;
        playStarted = false;
        stalled = false;
        volumeChangeInProgress = -1L;
        lowBandwidth = false;
        resetTimeline();
    }

    public void resetTimeline()
    {
        timelineCurrentSeekPosition = 0;
        timelineInSnapZone = true;
        timelinePreviousSeekPosition = 0;
        timelineStartSeekPosition = 0;
        timelineSeekDelta = 0;
    }

    public void setDraggingInProgress(boolean flag)
    {
        draggingInProgress = flag;
    }

    public void setLastActionTime(long l)
    {
        lastActionTime = l;
    }

    public void setTimelineExitOnSnap(boolean flag)
    {
        timelineExitOnSnap = flag;
    }

    public void updatePosition(int i)
    {
        timelineCurrentSeekPosition = timelinePreviousSeekPosition;
        timelinePreviousSeekPosition = i;
        timelineSeekDelta = Math.abs(timelineCurrentSeekPosition - timelinePreviousSeekPosition);
    }

    public void userInteraction()
    {
        Log.d("SRDJAN", "userInteraction called!");
        userInteraction = true;
    }
}
