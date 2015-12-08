// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.timeline.Timeline;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;
import com.adobe.mediacore.timeline.advertising.AdPolicyMode;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineTimeline

final class AdTimeline
    implements Timeline
{
    public static class AdInformation
    {

        private final Ad _ad;
        private final int _progress;

        public Ad getAd()
        {
            return _ad;
        }

        public int getProgress()
        {
            return _progress;
        }

        public AdInformation(Ad ad, int i)
        {
            _ad = ad;
            _progress = i;
        }
    }

    public static class Info
    {

        private final Ad _ad;
        private final AdBreak _adBreak;

        public static Info createInfo(AdBreak adbreak, Ad ad)
        {
            if (adbreak != null && ad != null)
            {
                return new Info(adbreak, ad);
            } else
            {
                return null;
            }
        }

        public boolean equals(Info info)
        {
            return info != null && _adBreak == info.getAdBreak() && _ad == info.getAd();
        }

        public Ad getAd()
        {
            return _ad;
        }

        public AdBreak getAdBreak()
        {
            return _adBreak;
        }

        private Info(AdBreak adbreak, Ad ad)
        {
            _adBreak = adbreak;
            _ad = ad;
        }
    }


    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/AdTimeline.getSimpleName()).toString();
    private Logger _logger;
    private final VideoEngineTimeline _videoEngineTimeline;

    public AdTimeline(VideoEngineTimeline videoenginetimeline)
    {
        _logger = Log.getLogger(LOG_TAG);
        if (videoenginetimeline == null)
        {
            throw new IllegalArgumentException("Video engine timeline parameter must not be null.");
        } else
        {
            _videoEngineTimeline = videoenginetimeline;
            return;
        }
    }

    public VideoEngineTimeline.TimeMapping getAdjustedPosition(VideoEngineTimeline.TimeMapping timemapping, long l, AdPolicyMode adpolicymode)
    {
        return _videoEngineTimeline.adjustSeekPosition(timemapping, l, adpolicymode);
    }

    public Info getInfoForContentId(long l)
    {
label0:
        {
            Object obj = _videoEngineTimeline.getAdBreakPlacements();
            if (((List) (obj)).isEmpty())
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            AdBreakPlacement adbreakplacement;
            Ad ad;
label1:
            do
            {
                if (((Iterator) (obj)).hasNext())
                {
                    adbreakplacement = (AdBreakPlacement)((Iterator) (obj)).next();
                    Iterator iterator = adbreakplacement.getAdBreak().adsIterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            continue label1;
                        }
                        ad = (Ad)iterator.next();
                    } while (ad == null || l != (long)ad.getId());
                    break;
                }
                break label0;
            } while (true);
            return Info.createInfo(adbreakplacement.getAdBreak(), ad);
        }
        return null;
    }

    public Iterator timelineMarkers()
    {
        return _videoEngineTimeline.getAdBreakPlacements().iterator();
    }

    public void update(long l)
    {
        _videoEngineTimeline.updateTimelineMarkers(l);
    }

}
