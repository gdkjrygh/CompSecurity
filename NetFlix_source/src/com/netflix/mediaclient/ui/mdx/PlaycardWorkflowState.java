// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;


class PlaycardWorkflowState
{

    public boolean audioSeekToInProgress;
    public boolean draggingInProgress;
    public long lastActionTime;
    public boolean paused;
    public boolean seekToInProgress;
    public int timelineCurrentSeekPosition;
    public boolean timelineExitOnSnap;
    public boolean timelineInSnapZone;
    public int timelinePreviousSeekPosition;
    public int timelineSeekDelta;
    public int timelineStartSeekPosition;

    PlaycardWorkflowState()
    {
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

    public int getTimelineStartSeekPosition()
    {
        return timelineStartSeekPosition;
    }

    public boolean isDraggingInProgress()
    {
        return draggingInProgress;
    }

    public boolean isSeekForward()
    {
        return timelineCurrentSeekPosition < timelinePreviousSeekPosition;
    }

    public void reset()
    {
        lastActionTime = 0L;
        draggingInProgress = false;
        seekToInProgress = false;
        audioSeekToInProgress = false;
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
}
