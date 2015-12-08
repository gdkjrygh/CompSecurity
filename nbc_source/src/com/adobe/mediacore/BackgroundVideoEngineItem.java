// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.PeriodInfo;
import com.adobe.ave.TagData;
import com.adobe.ave.Timeline;
import com.adobe.ave.VideoEngine;
import com.adobe.ave.VideoEngineException;
import com.adobe.mediacore.info.AudioTrack;
import com.adobe.mediacore.info.ClosedCaptionsTrack;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.TimedMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerItem, TimedMetadataAddedEvent, VideoEngineDispatcher, TimedMetadataParser, 
//            DRMMetadataCache, MediaResource

final class BackgroundVideoEngineItem
    implements MediaPlayerItem
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/BackgroundVideoEngineItem.getSimpleName()).toString();
    private static final int UNKNOWN_PERIOD_INDEX = -1;
    private static final Logger _logger = Log.getLogger(LOG_TAG);
    private List _adCueTags;
    private List _audioTracks;
    private List _closedCaptionsTracks;
    private AudioTrack _currentAudioTrack;
    private ClosedCaptionsTrack _currentClosedCaptionsTrack;
    private List _dispatchedTimedMetadata;
    private DRMMetadataCache _drmMetadataCache;
    private boolean _hasAudio;
    private boolean _hasClosedCaptions;
    private boolean _hasTimedMetadata;
    private List _internalAudioTracks;
    private List _internalClosedCaptionsTracks;
    private List _internalProfiles;
    private List _internalTimedMetadatas;
    private boolean _isDynamic;
    private boolean _isLive;
    private boolean _isProtected;
    private boolean _isTrickPlaySupported;
    private List _profiles;
    private MediaResource _resource;
    private List _timedMetadatas;
    private VideoEngine _videoEngine;
    private VideoEngineDispatcher _videoEngineDispatcher;

    public BackgroundVideoEngineItem(VideoEngineDispatcher videoenginedispatcher, MediaResource mediaresource, DRMMetadataCache drmmetadatacache, List list)
    {
        _timedMetadatas = new CopyOnWriteArrayList();
        _videoEngineDispatcher = videoenginedispatcher;
        _resource = mediaresource;
        _adCueTags = list;
        _dispatchedTimedMetadata = new ArrayList();
        _drmMetadataCache = drmmetadatacache;
    }

    private void checkAndDispatchTimedMetadata(TimedMetadata timedmetadata)
    {
        if (!_dispatchedTimedMetadata.contains(timedmetadata))
        {
            _dispatchedTimedMetadata.add(timedmetadata);
            _videoEngineDispatcher.dispatch(TimedMetadataAddedEvent.createBackgroundAddedEvent(timedmetadata));
        }
    }

    private boolean isTimedMetadataAdded(TimedMetadata timedmetadata)
    {
label0:
        {
            if (_timedMetadatas == null)
            {
                break label0;
            }
            Iterator iterator = _dispatchedTimedMetadata.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!((TimedMetadata)iterator.next()).equals(timedmetadata));
            return true;
        }
        return false;
    }

    private List loadTimedMetadata(Timeline timeline)
        throws VideoEngineException
    {
        ArrayList arraylist = new ArrayList();
        long l = Math.min(_videoEngine.getTime(), timeline.virtualStartTime);
        Object obj = new ArrayList();
        Iterator iterator = _dispatchedTimedMetadata.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            TimedMetadata timedmetadata = (TimedMetadata)iterator.next();
            if (timedmetadata.getTime() < l)
            {
                ((List) (obj)).add(timedmetadata);
            }
        } while (true);
        if (((List) (obj)).size() > 0)
        {
            _dispatchedTimedMetadata.removeAll(((java.util.Collection) (obj)));
            _timedMetadatas.removeAll(((java.util.Collection) (obj)));
        }
        obj = timeline.getPeriodInfo(0);
        _logger.i(LOG_TAG, (new StringBuilder()).append("#loadTimedMetadata : # of subTag in period [").append(0).append("] = ").append((((PeriodInfo) (obj)).lastSubscribedTagIndex - ((PeriodInfo) (obj)).firstSubscribedTagIndex) + 1).toString());
        int i = ((PeriodInfo) (obj)).firstSubscribedTagIndex;
        while (i <= ((PeriodInfo) (obj)).lastSubscribedTagIndex) 
        {
            Object obj1 = timeline.getSubscribedTag(0, i);
            if (obj1 != null && ((TagData) (obj1)).data != null)
            {
                obj1 = TimedMetadataParser.parseTagData(((TagData) (obj1)));
                if (obj1 != null && !arraylist.contains(obj1) && !isTimedMetadataAdded(((TimedMetadata) (obj1))))
                {
                    checkAndDispatchTimedMetadata(((TimedMetadata) (obj1)));
                    arraylist.add(obj1);
                }
            }
            i++;
        }
        Collections.sort(arraylist);
        return arraylist;
    }

    private void updateTimedMetadata(Timeline timeline)
        throws VideoEngineException
    {
        _internalTimedMetadatas = loadTimedMetadata(timeline);
        timeline = _internalTimedMetadatas.iterator();
        do
        {
            if (!timeline.hasNext())
            {
                break;
            }
            TimedMetadata timedmetadata = (TimedMetadata)timeline.next();
            if (!_timedMetadatas.contains(timedmetadata))
            {
                _timedMetadatas.add(timedmetadata);
            }
        } while (true);
        boolean flag;
        if (_timedMetadatas.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _hasTimedMetadata = flag;
    }

    public List getAdTags()
    {
        return _adCueTags;
    }

    public List getAudioTracks()
    {
        return _audioTracks;
    }

    public List getAvailablePlaybackRates()
    {
        return new ArrayList();
    }

    public List getClosedCaptionsTracks()
    {
        return _closedCaptionsTracks;
    }

    public List getDRMMetadataInfos()
    {
        return _drmMetadataCache.getDRMMetadataInfos();
    }

    public List getProfiles()
    {
        return _profiles;
    }

    public MediaResource getResource()
    {
        return _resource;
    }

    public AudioTrack getSelectedAudioTrack()
    {
        return _currentAudioTrack;
    }

    public ClosedCaptionsTrack getSelectedClosedCaptionsTrack()
    {
        return _currentClosedCaptionsTrack;
    }

    public List getTimedMetadata()
    {
        return _timedMetadatas;
    }

    public boolean hasAlternateAudio()
    {
        return _hasAudio;
    }

    public boolean hasClosedCaptions()
    {
        return _hasClosedCaptions;
    }

    public boolean hasTimedMetadata()
    {
        return _hasTimedMetadata;
    }

    public boolean isDynamic()
    {
        return _isDynamic;
    }

    public boolean isLive()
    {
        return _isLive;
    }

    public boolean isProtected()
    {
        return _isProtected;
    }

    public boolean isTrickPlaySupported()
    {
        return _isTrickPlaySupported;
    }

    public boolean selectAudioTrack(AudioTrack audiotrack)
    {
        return false;
    }

    public boolean selectClosedCaptionsTrack(ClosedCaptionsTrack closedcaptionstrack)
    {
        return false;
    }

    public void setIsProtected(boolean flag)
    {
        _isProtected = flag;
    }

    public void update(VideoEngine videoengine)
    {
        boolean flag;
        try
        {
            _videoEngine = videoengine;
            videoengine = _videoEngine.getBackgroundTimeline();
        }
        // Misplaced declaration of an exception variable
        catch (VideoEngine videoengine)
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#update").toString(), "A video engine exception occurred.", videoengine);
            return;
        }
        if (videoengine == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        if (((Timeline) (videoengine)).complete == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _isLive = flag;
        updateTimedMetadata(videoengine);
    }

}
