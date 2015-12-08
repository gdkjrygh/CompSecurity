// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.AdBreakAsWatched;
import com.adobe.mediacore.metadata.AdSignalingMode;
import com.adobe.mediacore.metadata.AdvertisingMetadata;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;
import com.adobe.mediacore.timeline.advertising.AdBreakPolicy;
import com.adobe.mediacore.timeline.advertising.AdPolicy;
import com.adobe.mediacore.timeline.advertising.AdPolicyInfo;
import com.adobe.mediacore.timeline.advertising.AdPolicyMode;
import com.adobe.mediacore.timeline.advertising.AdPolicySelector;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerItem, MediaResource

public class DefaultAdPolicySelector
    implements AdPolicySelector
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/DefaultAdPolicySelector.getSimpleName()).toString();
    private final AdBreakAsWatched _adBreakAsWatchedPolicy;
    private final Logger _logger;
    private final MediaPlayerItem _mediaPlayerItem;

    public DefaultAdPolicySelector(MediaPlayerItem mediaplayeritem)
    {
        _logger = Log.getLogger(LOG_TAG);
        _mediaPlayerItem = mediaplayeritem;
        _adBreakAsWatchedPolicy = extractAdBreakAsWatchedPolicy(_mediaPlayerItem);
    }

    private AdBreakAsWatched extractAdBreakAsWatchedPolicy(MediaPlayerItem mediaplayeritem)
    {
        AdBreakAsWatched adbreakaswatched = AdBreakAsWatched.AD_BREAK_AS_WATCHED_ON_BEGIN;
        if (mediaplayeritem != null)
        {
            mediaplayeritem = (MetadataNode)mediaplayeritem.getResource().getMetadata();
            if (mediaplayeritem != null)
            {
                mediaplayeritem = (AdvertisingMetadata)mediaplayeritem.getNode(DefaultMetadataKeys.ADVERTISING_METADATA.getValue());
                if (mediaplayeritem != null)
                {
                    return mediaplayeritem.getAdBreakAsWatched();
                }
            }
        }
        return adbreakaswatched;
    }

    public List selectAdBreaksToPlay(AdPolicyInfo adpolicyinfo)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#selectAdBreaksToPlay").toString(), (new StringBuilder()).append("currentTime=").append(adpolicyinfo.getCurrentTime()).append(" seekToTime=").append(adpolicyinfo.getSeekToTime()).append(" rate=").append(adpolicyinfo.getRate()).append(" adPolicyMode=").append(adpolicyinfo.getMode()).toString());
        List list = adpolicyinfo.getAdBreakPlacements();
        if (list != null)
        {
            int i = list.size();
            ArrayList arraylist = new ArrayList();
            if (i > 0 && adpolicyinfo.getCurrentTime() <= adpolicyinfo.getSeekToTime())
            {
                adpolicyinfo = (AdBreakPlacement)list.get(i - 1);
                if (!adpolicyinfo.getAdBreak().isWatched().booleanValue())
                {
                    arraylist.add(adpolicyinfo);
                    return arraylist;
                }
            }
        }
        return null;
    }

    public AdBreakPolicy selectPolicyForAdBreak(AdPolicyInfo adpolicyinfo)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#selectPolicyForAdBreak").toString(), (new StringBuilder()).append("currentTime=").append(adpolicyinfo.getCurrentTime()).append(" seekToTime=").append(adpolicyinfo.getSeekToTime()).append(" rate=").append(adpolicyinfo.getRate()).append(" adPolicyMode=").append(adpolicyinfo.getMode()).toString());
        if (adpolicyinfo.getAdBreakPlacements().size() > 0)
        {
            AdBreakPlacement adbreakplacement = (AdBreakPlacement)adpolicyinfo.getAdBreakPlacements().get(0);
            if (adpolicyinfo.getMode() == AdPolicyMode.SEEK && adbreakplacement.getAdBreak().isWatched().booleanValue())
            {
                return AdBreakPolicy.SKIP;
            }
        }
        adpolicyinfo = AdSignalingMode.DEFAULT;
        if (_mediaPlayerItem != null)
        {
            Object obj = (MetadataNode)_mediaPlayerItem.getResource().getMetadata();
            if (obj != null)
            {
                obj = (AdvertisingMetadata)((MetadataNode) (obj)).getNode(DefaultMetadataKeys.ADVERTISING_METADATA.getValue());
                if (obj != null)
                {
                    adpolicyinfo = ((AdvertisingMetadata) (obj)).getSignalingMode();
                }
            }
        }
        if (_mediaPlayerItem.isLive() || adpolicyinfo == AdSignalingMode.MANIFEST_CUES)
        {
            return AdBreakPolicy.PLAY;
        } else
        {
            return AdBreakPolicy.REMOVE_AFTER_PLAY;
        }
    }

    public AdPolicy selectPolicyForSeekIntoAd(AdPolicyInfo adpolicyinfo)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#selectPolicyForSeekIntoAd").toString(), (new StringBuilder()).append("currentTime=").append(adpolicyinfo.getCurrentTime()).append(" seekToTime=").append(adpolicyinfo.getSeekToTime()).append(" rate=").append(adpolicyinfo.getRate()).append(" adPolicyMode=").append(adpolicyinfo.getMode()).toString());
        adpolicyinfo = adpolicyinfo.getAdBreakPlacements();
        if (adpolicyinfo != null)
        {
            int i = adpolicyinfo.size();
            if (i > 0 && ((AdBreakPlacement)adpolicyinfo.get(i - 1)).getAdBreak().isWatched().booleanValue())
            {
                return AdPolicy.SKIP_AD_BREAK;
            }
        }
        return AdPolicy.PLAY_FROM_AD_BREAK_BEGIN;
    }

    public AdBreakAsWatched selectWatchedPolicyForAdBreak(AdPolicyInfo adpolicyinfo)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#selectWatchedPolicyForAdBreak").toString(), (new StringBuilder()).append("currentTime=").append(adpolicyinfo.getCurrentTime()).append(" seekToTime=").append(adpolicyinfo.getSeekToTime()).append(" rate=").append(adpolicyinfo.getRate()).append(" adPolicyMode=").append(adpolicyinfo.getMode()).toString());
        return _adBreakAsWatchedPolicy;
    }

}
