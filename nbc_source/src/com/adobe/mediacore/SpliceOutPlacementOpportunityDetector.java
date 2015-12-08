// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.TimedMetadata;
import com.adobe.mediacore.timeline.PlacementOpportunity;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;
import com.adobe.mediacore.utils.NumberUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            PlacementOpportunityDetector, MediaPlayerItem

final class SpliceOutPlacementOpportunityDetector
    implements PlacementOpportunityDetector
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/SpliceOutPlacementOpportunityDetector.getSimpleName()).toString();
    private static final String OPPORTUNITY_DURATION_KEY = "DURATION";
    private static final String OPPORTUNITY_ELAPSED_TIME_KEY[] = {
        "ELAPSEDTIME", "ELAPSED"
    };
    private static final String OPPORTUNITY_ID_KEY = "ID";
    private static final String OPPORTUNITY_TYPE_KEY = "TYPE";
    private static final String OPPORTUNITY_TYPE_VALUE = "SpliceOut";
    private Logger _logger;
    private MediaPlayerItem _mediaPlayerItem;

    public SpliceOutPlacementOpportunityDetector(MediaPlayerItem mediaplayeritem)
    {
        _logger = Log.getLogger(LOG_TAG);
        _mediaPlayerItem = mediaplayeritem;
    }

    private PlacementOpportunity createOpportunity(TimedMetadata timedmetadata, Metadata metadata)
    {
        long l1 = timedmetadata.getTime();
        timedmetadata = timedmetadata.getMetadata();
        String as[] = OPPORTUNITY_ELAPSED_TIME_KEY;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (timedmetadata.containsKey(s) && NumberUtils.parseNumber(timedmetadata.getValue(s), 1L) != 0L)
            {
                return null;
            }
        }

        long l;
        if (timedmetadata.containsKey("DURATION"))
        {
            l = NumberUtils.parseNumber(timedmetadata.getValue("DURATION"), 0L) * 1000L;
        } else
        {
            l = 0L;
        }
        if (timedmetadata.containsKey("ID"))
        {
            timedmetadata = timedmetadata.getValue("ID");
        } else
        {
            timedmetadata = null;
        }
        if (timedmetadata == null || l <= 0L)
        {
            return null;
        } else
        {
            return new PlacementOpportunity(timedmetadata, new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.MID_ROLL, l1, l), metadata);
        }
    }

    private boolean isCueTagSupported(TimedMetadata timedmetadata, MediaPlayerItem mediaplayeritem)
    {
        return mediaplayeritem == null || mediaplayeritem.getAdTags() == null || mediaplayeritem.getAdTags().contains(timedmetadata.getName());
    }

    private boolean isOpportunity(TimedMetadata timedmetadata)
    {
        timedmetadata = timedmetadata.getMetadata();
        return timedmetadata != null && timedmetadata.containsKey("TYPE") && timedmetadata.getValue("TYPE").equalsIgnoreCase("SpliceOut");
    }

    public List process(List list, Metadata metadata)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#process").toString(), (new StringBuilder()).append("Processing [").append(list.size()).append("] timed metadata, in order to provide placement opportunities.").toString());
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext();)
        {
            TimedMetadata timedmetadata = (TimedMetadata)list.next();
            if (isCueTagSupported(timedmetadata, _mediaPlayerItem) && isOpportunity(timedmetadata))
            {
                _logger.i((new StringBuilder()).append(LOG_TAG).append("#process").toString(), (new StringBuilder()).append("Processing ").append(timedmetadata.toString()).toString());
                PlacementOpportunity placementopportunity = createOpportunity(timedmetadata, metadata);
                if (placementopportunity != null)
                {
                    _logger.i((new StringBuilder()).append(LOG_TAG).append("#process").toString(), (new StringBuilder()).append("Ad placement placementOpportunity created for timed metadata ID [").append(timedmetadata.getId()).append("] .[").append("  placementOpportunity time=").append(String.valueOf(placementopportunity.getPlacementInformation().getTime())).append(", placementOpportunity duration=").append(String.valueOf(placementopportunity.getPlacementInformation().getDuration())).append("].").toString());
                    arraylist.add(placementopportunity);
                } else
                {
                    _logger.w((new StringBuilder()).append(LOG_TAG).append("#process").toString(), (new StringBuilder()).append("Ad placement placementOpportunity creation has failed. Probably has invalid metadata. placementOpportunity time = ").append(String.valueOf(timedmetadata.getTime())).append(", metadata: ").append(timedmetadata.getMetadata()).append("].").toString());
                }
            } else
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#process").toString(), (new StringBuilder()).append("Ad placement placementOpportunity creation has failed. Probably has invalid metadata. placementOpportunity time = ").append(String.valueOf(timedmetadata.getTime())).append(", metadata: ").append(timedmetadata.getMetadata()).append("].").toString());
            }
        }

        return arraylist;
    }

}
