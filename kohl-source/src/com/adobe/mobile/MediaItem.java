// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.adobe.mobile:
//            MediaSettings, StaticMethods, MediaAnalytics, MediaState

final class MediaItem
{
    private static class MonitorThread extends Thread
    {

        protected boolean canceled;
        long delay;
        protected MediaItem monitorMediaItem;

        public void run()
        {
            try
            {
                while (!canceled) 
                {
                    Thread.sleep(delay);
                    StaticMethods.getMediaExecutor().execute(new Runnable() {

                        final MonitorThread this$0;

                        public void run()
                        {
                            monitorMediaItem.mediaAnalytics.monitor(monitorMediaItem.name, -1D);
                        }

            
            {
                this$0 = MonitorThread.this;
                super();
            }
                    });
                }
            }
            catch (InterruptedException interruptedexception)
            {
                StaticMethods.logWarningFormat("Media - Background Thread Interrupted : %s", new Object[] {
                    interruptedexception.getMessage()
                });
            }
        }

        private MonitorThread()
        {
            delay = 1000L;
            canceled = false;
        }

    }


    private static final Object monitorMutex = new Object();
    protected String CPM;
    protected Media.MediaCallback callback;
    protected String channel;
    private int completeCloseOffsetThreshold;
    private boolean completeTracked;
    protected MediaState currentMediaState;
    private HashSet firstEventList;
    protected boolean itemClosed;
    protected int lastTrackSegmentNumber;
    protected double length;
    protected boolean mediaAd;
    protected MediaAnalytics mediaAnalytics;
    private ArrayList milestones;
    private MonitorThread monitor;
    protected String name;
    private ArrayList offsetMilestones;
    protected String parentName;
    protected String parentPod;
    protected double parentPodPosition;
    protected String playerID;
    protected String playerName;
    protected MediaState previousMediaState;
    private boolean segmentByMilestones;
    private boolean segmentByOffsetMilestones;
    protected double timestamp;
    protected boolean trackCalled;
    private int trackSecondsThreshold;

    public MediaItem(MediaSettings mediasettings, MediaAnalytics mediaanalytics, String s, double d, String s1)
    {
        int i = 1;
        boolean flag = false;
        super();
        callback = null;
        currentMediaState = null;
        previousMediaState = null;
        firstEventList = new HashSet();
        milestones = new ArrayList();
        offsetMilestones = new ArrayList();
        segmentByMilestones = false;
        segmentByOffsetMilestones = false;
        completeCloseOffsetThreshold = 1;
        trackSecondsThreshold = 0;
        name = s;
        length = d;
        playerName = s1;
        mediaAnalytics = mediaanalytics;
        playerID = mediasettings.playerID;
        timestamp = StaticMethods.getTimeSince1970();
        channel = mediasettings.channel;
        setMilestones(mediasettings.milestones);
        setOffsetMilestones(mediasettings.offsetMilestones);
        boolean flag1;
        if (mediasettings.segmentByMilestones && milestones.size() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        setSegmentByMilestones(flag1);
        if (mediasettings.segmentByOffsetMilestones && offsetMilestones.size() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        setSegmentByOffsetMilestones(flag1);
        setTrackSecondsThreshold(mediaanalytics.trackSeconds);
        setCompleteCloseOffsetThreshold(mediaanalytics.completeCloseOffsetThreshold);
        if (mediasettings.isMediaAd)
        {
            mediaAd = true;
            parentPodPosition = mediasettings.parentPodPosition;
            parentName = mediasettings.parentName;
            parentPod = mediasettings.parentPod;
            CPM = mediasettings.CPM;
        }
        if (mediasettings.completeCloseOffsetThreshold > 0)
        {
            i = mediasettings.completeCloseOffsetThreshold;
        }
        completeCloseOffsetThreshold = i;
        i = ((flag) ? 1 : 0);
        if (mediasettings.trackSeconds > 0)
        {
            i = mediasettings.trackSeconds;
        }
        trackSecondsThreshold = i;
    }

    private void calculateCurrentMilestoneAndSegment()
    {
        if (!isLive() && milestones.size() != 0)
        {
            int i = calculateLastPassedMilestoneIndex();
            if (i != -1)
            {
                int j = ((Integer)milestones.get(i)).intValue();
                currentMediaState.milestone = j;
                if (segmentByMilestones)
                {
                    currentMediaState.segmentNum = i + 1;
                    StringBuilder stringbuilder = new StringBuilder();
                    stringbuilder.append("M:");
                    stringbuilder.append(Integer.toString(j));
                    stringbuilder.append("-");
                    if (i < milestones.size() - 1)
                    {
                        stringbuilder.append(Integer.toString(((Integer)milestones.get(i + 1)).intValue()));
                    } else
                    {
                        stringbuilder.append("100");
                    }
                    currentMediaState.segment = stringbuilder.toString();
                    return;
                }
            }
        }
    }

    private void calculateCurrentOffsetMilestoneAndSegment()
    {
        int i;
        if (offsetMilestones.size() != 0)
        {
            if ((i = calculateLastPassedOffsetMilestoneIndex()) != -1)
            {
                int j = ((Integer)offsetMilestones.get(i)).intValue();
                currentMediaState.offsetMilestone = j;
                if (segmentByOffsetMilestones)
                {
                    currentMediaState.segmentNum = i + 1;
                    StringBuilder stringbuilder = new StringBuilder();
                    stringbuilder.append("O:");
                    stringbuilder.append(Integer.toString(j));
                    stringbuilder.append("-");
                    if (i < offsetMilestones.size() - 1)
                    {
                        stringbuilder.append(Integer.toString(((Integer)offsetMilestones.get(i + 1)).intValue()));
                    } else
                    {
                        String s;
                        if (isLive())
                        {
                            s = "E";
                        } else
                        {
                            s = Integer.toString((int)length);
                        }
                        stringbuilder.append(s);
                    }
                    currentMediaState.segment = stringbuilder.toString();
                    return;
                }
            }
        }
    }

    private int calculateLastPassedMilestoneIndex()
    {
        if (milestones.size() != 0) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        int j = -1;
        int i = 0;
        do
        {
            k = j;
            if (i >= milestones.size())
            {
                continue;
            }
            k = ((Integer)milestones.get(i)).intValue();
            if (currentMediaState.percent >= (double)k)
            {
                j = i;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int calculateLastPassedOffsetMilestoneIndex()
    {
        if (offsetMilestones.size() != 0) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        int j = -1;
        int i = 0;
        do
        {
            k = j;
            if (i >= offsetMilestones.size())
            {
                continue;
            }
            k = ((Integer)offsetMilestones.get(i)).intValue();
            if (currentMediaState.offset >= (double)k)
            {
                j = i;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setEventFirstTime(MediaState mediastate)
    {
        String s1 = mediastate.mediaEvent;
        if (!s1.equals("MILESTONE")) goto _L2; else goto _L1
_L1:
        String s = (new StringBuilder()).append(s1).append("_").append(mediastate.milestone).toString();
_L4:
        if (!firstEventList.contains(s))
        {
            mediastate.eventFirstTime = true;
            firstEventList.add(s);
        }
        return;
_L2:
        s = s1;
        if (s1.equals("OFFSET_MILESTONE"))
        {
            s = (new StringBuilder()).append(s1).append("_").append(mediastate.offsetMilestone).toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setMilestones(String s)
    {
        int i = 0;
        milestones.clear();
        if (s == null || s.length() <= 0)
        {
            return;
        }
        milestones.add(Integer.valueOf(0));
        s = s.split(",");
        for (int j = s.length; i < j; i++)
        {
            int k = (int)Double.parseDouble(s[i]);
            if (k > 0 && k <= 100 && !milestones.contains(Integer.valueOf(k)))
            {
                milestones.add(Integer.valueOf(k));
            }
        }

        Collections.sort(milestones);
    }

    private void setOffsetMilestones(String s)
    {
        int i = 0;
        offsetMilestones.clear();
        if (s == null || s.length() <= 0)
        {
            return;
        }
        offsetMilestones.add(Integer.valueOf(0));
        s = s.split(",");
        int j = s.length;
        while (i < j) 
        {
            int k = (int)Double.parseDouble(s[i]);
            if (k > 0 && !offsetMilestones.contains(Integer.valueOf(k)) && (isLive() || (double)k <= length))
            {
                offsetMilestones.add(Integer.valueOf(k));
            }
            i++;
        }
        Collections.sort(offsetMilestones);
    }

    private void updateCurrentMediaStateMediaEventIfNeeded(int i)
    {
        if (i != 0)
        {
            if (currentMediaState.percent >= 100D)
            {
                currentMediaState.mediaEvent = "CLOSE";
                return;
            }
            if (previousMediaState != null)
            {
                if (currentMediaState.milestone > previousMediaState.milestone)
                {
                    currentMediaState.mediaEvent = "MILESTONE";
                    return;
                }
                if (currentMediaState.offsetMilestone > previousMediaState.offsetMilestone)
                {
                    currentMediaState.mediaEvent = "OFFSET_MILESTONE";
                    return;
                }
                if (getTrackSecondsThreshold() > 0 && currentMediaState.getTimePlayedSinceTrack() >= (double)getTrackSecondsThreshold())
                {
                    currentMediaState.mediaEvent = "SECONDS";
                    return;
                }
            }
        }
    }

    private void updateCurrentMediaStateWithOffset(double d, int i)
    {
        MediaState mediastate = currentMediaState;
        boolean flag;
        if (i == 6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mediastate.clicked = flag;
        currentMediaState.ad = mediaAd;
        currentMediaState.setOffset(validateOffset(d));
        calculateCurrentOffsetMilestoneAndSegment();
        calculateCurrentMilestoneAndSegment();
        updateTimePlayed(i);
        currentMediaState.setEventType(i);
        updateCurrentMediaStateMediaEventIfNeeded(i);
        setEventFirstTime(currentMediaState);
    }

    private void updateMediaStates()
    {
        previousMediaState = currentMediaState;
        currentMediaState = new MediaState(name, length, playerName, (long)timestamp);
    }

    private void updateTimePlayed(int i)
    {
        if (previousMediaState == null)
        {
            return;
        }
        double d1 = 0.0D;
        double d = d1;
        if (currentMediaState.offset > previousMediaState.offset)
        {
            d = d1;
            if (i != 1)
            {
                d = currentMediaState.offset - previousMediaState.offset;
            }
        }
        currentMediaState.setTimePlayed(previousMediaState.getTimePlayed() + d);
        currentMediaState.setTimePlayedSinceTrack(previousMediaState.getTimePlayedSinceTrack() + d);
    }

    private double validateOffset(double d)
    {
        double d1 = d;
        if (d < 0.0D)
        {
            d1 = d;
            if (previousMediaState != null)
            {
                d1 = (currentMediaState.getTimestamp() - previousMediaState.getTimestamp()) + previousMediaState.offset;
            }
        }
        return d1;
    }

    protected void click(double d)
    {
        this;
        JVM INSTR monitorenter ;
        MediaState mediastate;
        updateMediaStates();
        mediastate = previousMediaState;
        if (mediastate != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        updateCurrentMediaStateWithOffset(d, 6);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void close()
    {
        this;
        JVM INSTR monitorenter ;
        updateMediaStates();
        if (previousMediaState == null) goto _L2; else goto _L1
_L1:
        int i = previousMediaState.getEventType();
        if (i != 0) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (previousMediaState.eventType != 2)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        updateCurrentMediaStateWithOffset(currentMediaState.offset, 0);
_L4:
        if (isCurrentOffsetPastCompleteThreshold())
        {
            currentMediaState.complete = true;
        }
        stopMonitor();
          goto _L2
        Exception exception;
        exception;
        throw exception;
        updateCurrentMediaStateWithOffset(-1D, 0);
          goto _L4
    }

    protected void complete(double d)
    {
        this;
        JVM INSTR monitorenter ;
        updateMediaStates();
        if (previousMediaState == null) goto _L2; else goto _L1
_L1:
        int i = previousMediaState.getEventType();
        if (i != 5) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        updateCurrentMediaStateWithOffset(d, 5);
        if (currentMediaState.complete)
        {
            stopMonitor();
        }
        currentMediaState.complete = true;
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    protected double getLength()
    {
        return length;
    }

    protected String getName()
    {
        return name;
    }

    protected String getPlayerID()
    {
        return playerID;
    }

    protected String getPlayerName()
    {
        return playerName;
    }

    protected MediaState getReportMediaState()
    {
        MediaState mediastate = new MediaState(currentMediaState);
        if (previousMediaState != null)
        {
            boolean flag = false;
            if (currentMediaState.milestone <= previousMediaState.milestone)
            {
                mediastate.milestone = 0;
                flag = true;
            }
            if (currentMediaState.offsetMilestone <= previousMediaState.offsetMilestone)
            {
                mediastate.offsetMilestone = 0;
                flag = true;
            }
            if (flag)
            {
                mediastate.segment = previousMediaState.segment;
                mediastate.segmentNum = previousMediaState.segmentNum;
                mediastate.segmentLength = previousMediaState.segmentLength;
            }
        }
        return mediastate;
    }

    public int getTrackSecondsThreshold()
    {
        return trackSecondsThreshold;
    }

    protected boolean isCompleteTracked()
    {
        return completeTracked;
    }

    protected boolean isCurrentOffsetPastCompleteThreshold()
    {
        return currentMediaState.offset >= length - (double)completeCloseOffsetThreshold;
    }

    protected boolean isLive()
    {
        return length == -1D;
    }

    protected boolean isPlaying()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (currentMediaState != null)
        {
            flag = flag1;
            if (currentMediaState.eventType != 0)
            {
                flag = flag1;
                if (currentMediaState.eventType != 2)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    protected boolean isSegmentByMilestones()
    {
        return segmentByMilestones;
    }

    protected boolean isSegmentByOffsetMilestones()
    {
        return segmentByOffsetMilestones;
    }

    protected void monitor(double d)
    {
        this;
        JVM INSTR monitorenter ;
        MediaState mediastate;
        updateMediaStates();
        mediastate = previousMediaState;
        if (mediastate != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        updateCurrentMediaStateWithOffset(d, 3);
        if (currentMediaState.complete)
        {
            stopMonitor();
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void play(double d)
    {
        this;
        JVM INSTR monitorenter ;
        if (currentMediaState == null) goto _L2; else goto _L1
_L1:
        boolean flag = isPlaying();
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        updateMediaStates();
        updateCurrentMediaStateWithOffset(d, 1);
        if (!currentMediaState.complete)
        {
            startMonitor();
        }
        if (true) goto _L3; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void setCompleteCloseOffsetThreshold(int i)
    {
        completeCloseOffsetThreshold = i;
    }

    protected void setCompleteTracked(boolean flag)
    {
        completeTracked = flag;
    }

    protected void setSegmentByMilestones(boolean flag)
    {
        segmentByMilestones = flag;
    }

    protected void setSegmentByOffsetMilestones(boolean flag)
    {
        segmentByOffsetMilestones = flag;
    }

    public void setTrackSecondsThreshold(int i)
    {
        trackSecondsThreshold = i;
    }

    protected void startMonitor()
    {
        if (monitor != null && !monitor.canceled)
        {
            return;
        }
        if (monitor != null)
        {
            stopMonitor();
        }
        monitor = new MonitorThread();
        monitor.monitorMediaItem = this;
        monitor.start();
    }

    protected void stop(double d)
    {
        this;
        JVM INSTR monitorenter ;
        updateMediaStates();
        updateCurrentMediaStateWithOffset(d, 2);
        stopMonitor();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void stopMonitor()
    {
        if (monitor != null)
        {
            synchronized (monitorMutex)
            {
                monitor.canceled = true;
                monitor = null;
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
