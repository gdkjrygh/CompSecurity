// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.ABRProfileInfo;
import com.adobe.ave.AudioTrackInfo;
import com.adobe.ave.DataTrackInfo;
import com.adobe.ave.PayloadType;
import com.adobe.ave.PeriodInfo;
import com.adobe.ave.Timeline;
import com.adobe.ave.VideoEngine;
import com.adobe.ave.VideoEngineException;
import com.adobe.ave.VideoTrackInfo;
import com.adobe.mediacore.info.AudioTrack;
import com.adobe.mediacore.info.ClosedCaptionsTrack;
import com.adobe.mediacore.info.Profile;
import com.adobe.mediacore.info.Track;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.TimedMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerItem, TimedMetadataAddedEvent, VideoEngineDispatcher, VideoEngineTimeline, 
//            TimedMetadataParser, DRMMetadataCache, MediaResource

final class VideoEngineItem
    implements MediaPlayerItem
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/VideoEngineItem.getSimpleName()).toString();
    private static final int UNKNOWN_PERIOD_INDEX = -1;
    private static final Logger _logger = Log.getLogger(LOG_TAG);
    private List _adCueTags;
    private List _audioTracks;
    private List _closedCaptionsTracks;
    private int _contentId;
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

    public VideoEngineItem(VideoEngineDispatcher videoenginedispatcher, MediaResource mediaresource, int i, DRMMetadataCache drmmetadatacache, List list)
    {
        _timedMetadatas = new CopyOnWriteArrayList();
        _videoEngineDispatcher = videoenginedispatcher;
        _resource = mediaresource;
        _contentId = i;
        _adCueTags = list;
        _dispatchedTimedMetadata = new ArrayList();
        _drmMetadataCache = drmmetadatacache;
    }

    private void checkAndDispatchTimedMetadata(TimedMetadata timedmetadata)
    {
        if (!_dispatchedTimedMetadata.contains(timedmetadata))
        {
            _dispatchedTimedMetadata.add(timedmetadata);
            _videoEngineDispatcher.dispatch(TimedMetadataAddedEvent.createAddedEvent(timedmetadata));
        }
    }

    private int getCurrentPeriodIndex()
    {
        Timeline timeline;
        long l;
        timeline = _videoEngine.getTimeline();
        l = _videoEngine.getTime();
        if (timeline == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        int i = timeline.firstPeriodIndex;
_L1:
        PeriodInfo periodinfo;
        if (i > timeline.lastPeriodIndex)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        periodinfo = timeline.getPeriodInfo(i);
        if (periodinfo == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        long l1;
        long l2;
        l1 = periodinfo.virtualStartTime;
        l2 = periodinfo.duration;
        if (l1 <= l && l <= l2 + l1)
        {
            return i;
        }
        i++;
          goto _L1
        VideoEngineException videoengineexception;
        videoengineexception;
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#getCurrentPeriodIndex").toString(), "Unable to get current period index.");
        return -1;
    }

    private int getIndexOfLastMainContentPeriod(Timeline timeline)
        throws VideoEngineException
    {
        for (int i = timeline.lastPeriodIndex; i >= timeline.firstPeriodIndex; i--)
        {
            PeriodInfo periodinfo = timeline.getPeriodInfo(i);
            if (periodinfo != null && periodinfo.userData == _contentId)
            {
                return i;
            }
        }

        return -1;
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

    private List loadAudioTracks(Timeline timeline, int i)
        throws VideoEngineException
    {
        ArrayList arraylist = new ArrayList();
        int k = timeline.getTrackCount(i, PayloadType.AUDIO);
        for (int j = 0; j < k; j++)
        {
            AudioTrackInfo audiotrackinfo = (AudioTrackInfo)timeline.getTrackInfo(i, j, PayloadType.AUDIO);
            if (audiotrackinfo != null)
            {
                arraylist.add(new AudioTrack(audiotrackinfo.description, audiotrackinfo.language, audiotrackinfo.isDefault, audiotrackinfo.isAutoSelect, audiotrackinfo.isForced));
            }
        }

        return arraylist;
    }

    private List loadClosedCaptionsTrack(Timeline timeline, int i)
    {
        ArrayList arraylist = new ArrayList();
        int k = timeline.getTrackCount(i, PayloadType.DATA);
        int j = 0;
_L2:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        DataTrackInfo datatrackinfo = (DataTrackInfo)timeline.getTrackInfo(i, j, PayloadType.DATA);
        arraylist.add(new ClosedCaptionsTrack(datatrackinfo.description, datatrackinfo.serviceType.getValue(), datatrackinfo.language, datatrackinfo.isDefault, datatrackinfo.activity));
        j++;
        if (true) goto _L2; else goto _L1
        timeline;
        _logger.e((new StringBuilder()).append(LOG_TAG).append("#refreshClosedCaptionsTracks").toString(), "A video engine exception occurred ", timeline);
_L1:
        return arraylist;
    }

    private List loadProfiles(Timeline timeline, int i)
        throws VideoEngineException
    {
        ArrayList arraylist = new ArrayList();
        int k = timeline.getABRProfileCount(i);
        for (int j = 0; j < k; j++)
        {
            ABRProfileInfo abrprofileinfo = timeline.getABRProfileInfoAtIndex(i, j);
            if (abrprofileinfo != null)
            {
                arraylist.add(new Profile(abrprofileinfo.bitsPerSecond, abrprofileinfo.width, abrprofileinfo.height));
            }
        }

        return arraylist;
    }

    private List loadTimedMetadata(Timeline timeline, int i)
        throws VideoEngineException
    {
        ArrayList arraylist = new ArrayList();
        PeriodInfo periodinfo = timeline.getPeriodInfo(i);
        if (periodinfo == null)
        {
            VideoEngineTimeline.printTimeline(timeline);
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#loadTimedMetadata").toString(), (new StringBuilder()).append("Could not get main period info. Period index is [").append(i).append("]. Main period index is [").append(getIndexOfLastMainContentPeriod(timeline)).append("].").toString());
            return arraylist;
        }
        long l = Math.min(_videoEngine.getTime(), timeline.virtualStartTime);
        ArrayList arraylist1 = new ArrayList();
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
                arraylist1.add(timedmetadata);
            }
        } while (true);
        if (arraylist1.size() > 0)
        {
            _dispatchedTimedMetadata.removeAll(arraylist1);
            _timedMetadatas.removeAll(arraylist1);
        }
        if (timeline.lastSubscribedTagIndex > 0)
        {
            int j = timeline.firstSubscribedTagIndex;
            while (j <= timeline.lastSubscribedTagIndex) 
            {
                Object obj = timeline.getMainManifestSubscribedTag(j);
                if (obj != null)
                {
                    obj = TimedMetadataParser.parseTagData(((com.adobe.ave.TagData) (obj)));
                    if (obj != null && !arraylist.contains(obj) && !isTimedMetadataAdded(((TimedMetadata) (obj))))
                    {
                        checkAndDispatchTimedMetadata(((TimedMetadata) (obj)));
                        arraylist.add(obj);
                    }
                }
                j++;
            }
        }
        int k = periodinfo.firstSubscribedTagIndex;
        while (k <= periodinfo.lastSubscribedTagIndex) 
        {
            Object obj1 = timeline.getSubscribedTag(i, k);
            if (obj1 != null)
            {
                obj1 = TimedMetadataParser.parseTagData(((com.adobe.ave.TagData) (obj1)));
                if (obj1 != null && !arraylist.contains(obj1) && !isTimedMetadataAdded(((TimedMetadata) (obj1))))
                {
                    checkAndDispatchTimedMetadata(((TimedMetadata) (obj1)));
                    arraylist.add(obj1);
                }
            }
            k++;
        }
        Collections.sort(arraylist);
        return arraylist;
    }

    private void selectTrack(Timeline timeline, int i, String s, PayloadType payloadtype)
        throws VideoEngineException
    {
        int j;
        int k;
        k = timeline.getTrackCount(i, payloadtype);
        j = 0;
_L14:
        if (j >= k) goto _L2; else goto _L1
_L1:
        Object obj = timeline.getTrackInfo(i, j, payloadtype);
        static class _cls1
        {

            static final int $SwitchMap$com$adobe$ave$PayloadType[];

            static 
            {
                $SwitchMap$com$adobe$ave$PayloadType = new int[PayloadType.values().length];
                try
                {
                    $SwitchMap$com$adobe$ave$PayloadType[PayloadType.DATA.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$adobe$ave$PayloadType[PayloadType.AUDIO.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$adobe$ave$PayloadType[PayloadType.VIDEO.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.adobe.ave.PayloadType[payloadtype.ordinal()];
        JVM INSTR tableswitch 1 3: default 64
    //                   1 86
    //                   2 112
    //                   3 138;
           goto _L3 _L4 _L5 _L6
_L3:
        boolean flag = false;
_L10:
        if (!flag) goto _L8; else goto _L7
_L7:
        _videoEngine.selectTrack(i, payloadtype, j);
_L2:
        return;
_L4:
        if ((obj = (DataTrackInfo)obj) == null) goto _L3; else goto _L9
_L9:
        flag = ((DataTrackInfo) (obj)).description.equals(s);
          goto _L10
_L5:
        obj = (AudioTrackInfo)obj;
        if (obj == null) goto _L3; else goto _L11
_L11:
        flag = ((AudioTrackInfo) (obj)).description.equals(s);
          goto _L10
_L6:
        obj = (VideoTrackInfo)obj;
        if (obj == null) goto _L3; else goto _L12
_L12:
        flag = ((VideoTrackInfo) (obj)).description.equals(s);
          goto _L10
_L8:
        j++;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private void selectTrackByNameAndServiceType(Timeline timeline, int i, String s, int j, PayloadType payloadtype)
        throws VideoEngineException
    {
        int l = timeline.getTrackCount(i, PayloadType.DATA);
        int k = 0;
        do
        {
label0:
            {
                if (k < l)
                {
                    DataTrackInfo datatrackinfo = (DataTrackInfo)timeline.getTrackInfo(i, k, PayloadType.DATA);
                    boolean flag;
                    if (datatrackinfo != null)
                    {
                        if (datatrackinfo.description.equals(s) && datatrackinfo.serviceType.getValue() == j)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                    _videoEngine.selectTrack(i, payloadtype, k);
                }
                return;
            }
            k++;
        } while (true);
    }

    private void updateAudioTracks(Timeline timeline, int i)
        throws VideoEngineException
    {
        _internalAudioTracks = loadAudioTracks(timeline, i);
        _audioTracks = Collections.unmodifiableList(_internalAudioTracks);
        boolean flag;
        if (_audioTracks.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _hasAudio = flag;
        _currentAudioTrack = (AudioTrack)updateTrack(_internalAudioTracks, _currentAudioTrack);
        if (_currentAudioTrack == null && !_internalAudioTracks.isEmpty())
        {
            _currentAudioTrack = (AudioTrack)_internalAudioTracks.get(0);
        }
    }

    private void updateClosedCaptionsTracks(Timeline timeline, int i)
        throws VideoEngineException
    {
        _internalClosedCaptionsTracks = loadClosedCaptionsTrack(timeline, i);
        _closedCaptionsTracks = Collections.unmodifiableList(_internalClosedCaptionsTracks);
        boolean flag;
        if (_closedCaptionsTracks.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _hasClosedCaptions = flag;
        _currentClosedCaptionsTrack = (ClosedCaptionsTrack)updateTrack(_internalClosedCaptionsTracks, _currentClosedCaptionsTrack);
        if (_currentClosedCaptionsTrack == null && !_internalClosedCaptionsTracks.isEmpty())
        {
            _currentClosedCaptionsTrack = (ClosedCaptionsTrack)_internalClosedCaptionsTracks.get(0);
        }
    }

    private void updateProfiles(Timeline timeline, int i)
        throws VideoEngineException
    {
        boolean flag = true;
        _internalProfiles = loadProfiles(timeline, i);
        _profiles = Collections.unmodifiableList(_internalProfiles);
        if (_profiles.size() <= 1)
        {
            flag = false;
        }
        _isDynamic = flag;
    }

    private void updateTimedMetadata(Timeline timeline, int i)
        throws VideoEngineException
    {
        _internalTimedMetadatas = loadTimedMetadata(timeline, i);
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

    private void updateTrickPlayInfo(Timeline timeline, int i)
    {
        try
        {
            _isTrickPlaySupported = timeline.getPeriodInfo(i).supportsTrickPlay;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Timeline timeline)
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#updateTrickPlayInfo").toString(), "A video engine exception occurred ", timeline);
        }
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
        ArrayList arraylist = new ArrayList();
        if (isTrickPlaySupported())
        {
            arraylist.add(Float.valueOf(-128F));
            arraylist.add(Float.valueOf(-64F));
            arraylist.add(Float.valueOf(-32F));
            arraylist.add(Float.valueOf(-16F));
            arraylist.add(Float.valueOf(-8F));
            arraylist.add(Float.valueOf(-4F));
            arraylist.add(Float.valueOf(-2F));
            arraylist.add(Float.valueOf(0.0F));
            arraylist.add(Float.valueOf(0.25F));
            arraylist.add(Float.valueOf(0.5F));
            arraylist.add(Float.valueOf(0.75F));
            arraylist.add(Float.valueOf(1.0F));
            arraylist.add(Float.valueOf(2.0F));
            arraylist.add(Float.valueOf(4F));
            arraylist.add(Float.valueOf(8F));
            arraylist.add(Float.valueOf(16F));
            arraylist.add(Float.valueOf(32F));
            arraylist.add(Float.valueOf(64F));
            arraylist.add(Float.valueOf(128F));
            return arraylist;
        } else
        {
            arraylist.add(Float.valueOf(0.0F));
            arraylist.add(Float.valueOf(0.25F));
            arraylist.add(Float.valueOf(0.5F));
            arraylist.add(Float.valueOf(0.75F));
            arraylist.add(Float.valueOf(1.0F));
            return arraylist;
        }
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
        if (_currentAudioTrack != null)
        {
            return _currentAudioTrack;
        }
        if (_audioTracks.size() > 0)
        {
            return (AudioTrack)_audioTracks.get(0);
        } else
        {
            return null;
        }
    }

    public ClosedCaptionsTrack getSelectedClosedCaptionsTrack()
    {
        if (_currentClosedCaptionsTrack != null)
        {
            return _currentClosedCaptionsTrack;
        }
        if (_closedCaptionsTracks.size() > 0)
        {
            return (ClosedCaptionsTrack)_closedCaptionsTracks.get(0);
        } else
        {
            return null;
        }
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

    public void refreshClosedCaptionsTracks(VideoEngine videoengine)
    {
        int i;
        try
        {
            videoengine = videoengine.getTimeline();
            i = getIndexOfLastMainContentPeriod(videoengine);
        }
        // Misplaced declaration of an exception variable
        catch (VideoEngine videoengine)
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#refreshClosedCaptionsTracks").toString(), "A video engine exception occurred ", videoengine);
            return;
        }
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        updateClosedCaptionsTracks(videoengine, i);
    }

    public boolean selectAudioTrack(AudioTrack audiotrack)
    {
        boolean flag1;
        _currentAudioTrack = audiotrack;
        _logger.i(LOG_TAG, (new StringBuilder()).append("Selected audio track [").append(_currentAudioTrack).append("].").toString());
        flag1 = true;
        Timeline timeline;
        int i;
        audiotrack = _currentAudioTrack.getName();
        timeline = _videoEngine.getTimeline();
        i = getCurrentPeriodIndex();
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        selectTrack(timeline, i, audiotrack, PayloadType.AUDIO);
        boolean flag = flag1;
        if (timeline == null) goto _L2; else goto _L1
_L1:
        i = timeline.firstPeriodIndex;
_L3:
        flag = flag1;
        if (i > timeline.lastPeriodIndex)
        {
            break; /* Loop/switch isn't completed */
        }
        selectTrack(timeline, i, audiotrack, PayloadType.AUDIO);
        i++;
        if (true) goto _L3; else goto _L2
        audiotrack;
        flag = false;
_L2:
        return flag;
    }

    public boolean selectClosedCaptionsTrack(ClosedCaptionsTrack closedcaptionstrack)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#selectClosedCaptionsTrack").toString(), (new StringBuilder()).append("Selecting CC track: ").append(closedcaptionstrack).toString());
        _currentClosedCaptionsTrack = closedcaptionstrack;
        Timeline timeline;
        int i;
        int j;
        try
        {
            closedcaptionstrack = _currentClosedCaptionsTrack.getName();
            j = _currentClosedCaptionsTrack.getServiceType();
            timeline = _videoEngine.getTimeline();
        }
        // Misplaced declaration of an exception variable
        catch (ClosedCaptionsTrack closedcaptionstrack)
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#refreshClosedCaptionsTracks").toString(), "A video engine exception occurred ", closedcaptionstrack);
            return false;
        }
        if (timeline == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        i = timeline.firstPeriodIndex;
_L1:
        if (i > timeline.lastPeriodIndex)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        selectTrackByNameAndServiceType(timeline, i, closedcaptionstrack, j, PayloadType.DATA);
        i++;
          goto _L1
        return true;
    }

    public void setIsProtected(boolean flag)
    {
        _isProtected = flag;
    }

    public void update(VideoEngine videoengine)
    {
        int i;
        boolean flag;
        try
        {
            _videoEngine = videoengine;
            videoengine = _videoEngine.getTimeline();
        }
        // Misplaced declaration of an exception variable
        catch (VideoEngine videoengine)
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#update").toString(), "A video engine exception occurred.", videoengine);
            return;
        }
        if (videoengine == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (((Timeline) (videoengine)).complete == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _isLive = flag;
        i = getIndexOfLastMainContentPeriod(videoengine);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        updateProfiles(videoengine, i);
        updateAudioTracks(videoengine, i);
        updateClosedCaptionsTracks(videoengine, i);
        updateTimedMetadata(videoengine, i);
        updateTrickPlayInfo(videoengine, i);
        _drmMetadataCache.update(videoengine, _videoEngine.getTime());
    }

    public Track updateTrack(List list, Track track)
    {
        if (track != null)
        {
            track = track.getName();
        } else
        {
            track = null;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            Track track1 = (Track)list.next();
            if (track != null && track.equals(track1.getName()) || track == null && track1.isDefault())
            {
                return track1;
            }
        }

        return null;
    }

}
