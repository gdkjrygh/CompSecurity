// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import android.os.Handler;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.NopTimelineOperation;
import com.adobe.mediacore.timeline.TimelineOperation;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineDispatcher, VideoEngineTimeline, OpportunityHandledEvent, MediaPlayerNotification, 
//            OperationFailedEvent, MediaPlayerEvent, AdBreakPlacementCompletedListener, AdBreakPlacementFailedListener, 
//            AdBreakRemovalCompletedListener

class TimelineOperationQueue
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/TimelineOperationQueue.getSimpleName()).toString();
    private Runnable _executor;
    private Handler _handler;
    private final Logger _logger;
    private final AdBreakPlacementCompletedListener _onAdBreakPlacementCompletedListener = new AdBreakPlacementCompletedListener() {

        final TimelineOperationQueue this$0;

        public void onCompleted(AdBreakPlacement adbreakplacement, AdBreakPlacement adbreakplacement1)
        {
            if (adbreakplacement != null && adbreakplacement.getAdBreak() != null)
            {
                if (adbreakplacement.getAdBreak().getRestoreId() != null)
                {
                    long l = adbreakplacement.getAdBreak().getLocalTime();
                    adbreakplacement1.getAdBreak().setLocalTime(l);
                } else
                {
                    long l1 = _videoEngineTimeline.convertToLocalTime(adbreakplacement1.getTime());
                    adbreakplacement1.getAdBreak().setLocalTime(l1);
                    _videoEngineDispatcher.dispatch(new OpportunityHandledEvent(MediaPlayerEvent.Type.OPPORTUNITY_COMPLETED, adbreakplacement.getTime()));
                }
            }
            _pendingOperation = null;
            process();
        }

            
            {
                this$0 = TimelineOperationQueue.this;
                super();
            }
    };
    private final AdBreakPlacementFailedListener _onAdBreakPlacementFailedListener = new AdBreakPlacementFailedListener() {

        final TimelineOperationQueue this$0;

        public void onFailed(AdBreakPlacement adbreakplacement)
        {
            _logger.w((new StringBuilder()).append(TimelineOperationQueue.LOG_TAG).append("#adProviderError").toString(), (new StringBuilder()).append("Proposed ad break was refused as we fail to place any of the contained ads.[").append(adbreakplacement.toString()).append("]").toString());
            _videoEngineDispatcher.dispatch(new OpportunityHandledEvent(MediaPlayerEvent.Type.OPPORTUNITY_FAILED, adbreakplacement.getTime()));
            _pendingOperation = null;
            process();
        }

            
            {
                this$0 = TimelineOperationQueue.this;
                super();
            }
    };
    private final AdBreakRemovalCompletedListener _onAdBreakRemovalCompletedListener = new AdBreakRemovalCompletedListener() {

        final TimelineOperationQueue this$0;

        public void onCompleted()
        {
            _pendingOperation = null;
            process();
        }

            
            {
                this$0 = TimelineOperationQueue.this;
                super();
            }
    };
    private final Queue _operationsToBeExecuted = new PriorityQueue();
    private TimelineOperation _pendingOperation;
    private final VideoEngineDispatcher _videoEngineDispatcher;
    private final VideoEngineTimeline _videoEngineTimeline;

    public TimelineOperationQueue(VideoEngineTimeline videoenginetimeline, VideoEngineDispatcher videoenginedispatcher)
    {
        _logger = Log.getLogger(LOG_TAG);
        _pendingOperation = null;
        _videoEngineTimeline = videoenginetimeline;
        _videoEngineDispatcher = videoenginedispatcher;
        initialise();
    }

    private void clearOperation()
    {
        _pendingOperation = null;
    }

    private void clearOperationsQueue()
    {
        _operationsToBeExecuted.clear();
    }

    private void initialise()
    {
        _handler = new Handler();
        _executor = new Runnable() {

            final TimelineOperationQueue this$0;

            public void run()
            {
                if (_videoEngineTimeline != null && _pendingOperation != null)
                {
                    _videoEngineTimeline.execute(_pendingOperation);
                    return;
                } else
                {
                    _pendingOperation = null;
                    process();
                    return;
                }
            }

            
            {
                this$0 = TimelineOperationQueue.this;
                super();
            }
        };
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.ADBREAK_PLACEMENT_COMPLETED, _onAdBreakPlacementCompletedListener);
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.ADBREAK_PLACEMENT_FAILED, _onAdBreakPlacementFailedListener);
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.ADBREAK_REMOVAL_COMPLETED, _onAdBreakRemovalCompletedListener);
    }

    private void process()
    {
        if (_pendingOperation != null)
        {
            return;
        }
        boolean flag2 = false;
        boolean flag = false;
        TimelineOperation timelineoperation;
label0:
        do
        {
            do
            {
                timelineoperation = (TimelineOperation)_operationsToBeExecuted.poll();
                boolean flag3 = flag2;
                boolean flag1 = flag;
                if (timelineoperation != null)
                {
                    flag1 = flag;
                    if (timelineoperation instanceof AdBreakPlacement)
                    {
                        flag1 = flag;
                        if (((AdBreakPlacement)timelineoperation).getAdBreak().getRestoreId() == null)
                        {
                            MetadataNode metadatanode;
                            if (!_videoEngineTimeline.willAccept(timelineoperation))
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            flag1 = flag;
                        }
                    }
                    if (!timelineoperation.isValid())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag1 || flag)
                    {
                        Object obj;
                        if (flag1)
                        {
                            obj = "Proposed ad break is conflicting with previously placed ad breaks.";
                        } else
                        {
                            obj = (new StringBuilder()).append("Proposed ad break is invalid - replace duration [").append(String.valueOf(((AdBreakPlacement)timelineoperation).getAdBreak().getInitialReplaceDuration())).append("] is smaller than the actual duration of ad break [").append(String.valueOf(((AdBreakPlacement)timelineoperation).getAdBreak().getDuration())).append("].").toString();
                        }
                        _logger.w((new StringBuilder()).append(LOG_TAG).append("#process").toString(), (new StringBuilder()).append(((String) (obj))).append("[").append(timelineoperation.toString()).append("].").toString());
                        _videoEngineDispatcher.dispatch(new OpportunityHandledEvent(MediaPlayerEvent.Type.OPPORTUNITY_FAILED, timelineoperation.getPlacement().getTime()));
                        obj = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.AD_RESOLVER_FAIL, ((String) (obj)));
                        metadatanode = new MetadataNode();
                        metadatanode.setValue("AD_BREAK", ((AdBreakPlacement)timelineoperation).toString());
                        ((MediaPlayerNotification.Warning) (obj)).setMetadata(metadatanode);
                        _videoEngineDispatcher.dispatch(OperationFailedEvent.createEvent(((MediaPlayerNotification.Warning) (obj))));
                    }
                    flag3 = flag;
                }
                if (timelineoperation == null)
                {
                    break label0;
                }
                flag2 = flag3;
                flag = flag1;
            } while (flag3);
            flag2 = flag3;
            flag = flag1;
        } while (flag1);
        if (timelineoperation == null)
        {
            _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.CONTENT_PLACEMENT_COMPLETE));
            return;
        }
        if (timelineoperation instanceof NopTimelineOperation)
        {
            process();
            return;
        } else
        {
            _pendingOperation = timelineoperation;
            _handler.post(_executor);
            return;
        }
    }

    public void addAllToQueue(List list)
    {
        this;
        JVM INSTR monitorenter ;
        Collections.sort(list);
        _operationsToBeExecuted.addAll(list);
        process();
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public void addToQueue(TimelineOperation timelineoperation)
    {
        this;
        JVM INSTR monitorenter ;
        _operationsToBeExecuted.add(timelineoperation);
        process();
        this;
        JVM INSTR monitorexit ;
        return;
        timelineoperation;
        throw timelineoperation;
    }

    public void clear()
    {
        clearOperation();
        clearOperationsQueue();
    }

    public void dispose()
    {
        _handler = null;
        _executor = null;
        _videoEngineDispatcher.removeEventListener(MediaPlayerEvent.Type.ADBREAK_PLACEMENT_COMPLETED, _onAdBreakPlacementCompletedListener);
        _videoEngineDispatcher.removeEventListener(MediaPlayerEvent.Type.ADBREAK_PLACEMENT_FAILED, _onAdBreakPlacementFailedListener);
        _videoEngineDispatcher.removeEventListener(MediaPlayerEvent.Type.ADBREAK_REMOVAL_COMPLETED, _onAdBreakRemovalCompletedListener);
    }

    public boolean isEmpty()
    {
        return _operationsToBeExecuted.size() <= 0 && _pendingOperation == null;
    }





/*
    static TimelineOperation access$102(TimelineOperationQueue timelineoperationqueue, TimelineOperation timelineoperation)
    {
        timelineoperationqueue._pendingOperation = timelineoperation;
        return timelineoperation;
    }

*/




}
