// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising.customadmarkers;

import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.PlacementOpportunity;
import com.adobe.mediacore.timeline.advertising.ContentRemoval;
import com.adobe.mediacore.timeline.advertising.ContentResolver;
import com.adobe.mediacore.timeline.advertising.ContentTracker;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;
import com.adobe.mediacore.utils.ReplacementTimeRange;
import com.adobe.mediacore.utils.TimeRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.adobe.mediacore.timeline.advertising.customadmarkers:
//            CustomRangeHelper

public class DeleteContentResolver extends ContentResolver
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::[DeleteContentResolver]::").append(com/adobe/mediacore/timeline/advertising/customadmarkers/DeleteContentResolver.getSimpleName()).toString();
    private final Logger _logger;

    public DeleteContentResolver()
    {
        _logger = Log.getLogger(LOG_TAG);
    }

    private PlacementInformation createPlacementInformation(TimeRange timerange)
    {
        return new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.CUSTOM_TIME_RANGES, com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.DELETE, timerange.getBegin(), timerange.getDuration());
    }

    private List createTimelineOperations(List list)
    {
        ArrayList arraylist = new ArrayList();
        if (list.isEmpty())
        {
            return arraylist;
        }
        for (list = list.iterator(); list.hasNext(); arraylist.add(new ContentRemoval(createPlacementInformation((ReplacementTimeRange)list.next())))) { }
        return arraylist;
    }

    private void handleInvalidMetadata(Exception exception)
    {
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#handleInvalidMetadata").toString(), String.valueOf(exception.getMessage()));
        com.adobe.mediacore.MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(com.adobe.mediacore.MediaPlayerNotification.ErrorCode.AD_RESOLVER_METADATA_INVALID, "Invalid custom time range metadata.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", exception.getMessage());
        error.setMetadata(metadatanode);
        notifyResolveError(error);
    }

    private void processDeleteRanges(PlacementOpportunity placementopportunity, CustomRangeHelper customrangehelper)
    {
        try
        {
            notifyResolveComplete(createTimelineOperations(customrangehelper.mergeRanges(customrangehelper.extractCustomTimeRanges(customrangehelper.extractCustomTimeRangeMetadata()))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PlacementOpportunity placementopportunity)
        {
            handleInvalidMetadata(placementopportunity);
        }
    }

    protected boolean doCanResolve(PlacementOpportunity placementopportunity)
    {
        return placementopportunity.getPlacementInformation().getMode() == com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.DELETE;
    }

    protected ContentTracker doProvideAdTracker()
    {
        return null;
    }

    protected void doResolveAds(Metadata metadata, PlacementOpportunity placementopportunity)
    {
        processDeleteRanges(placementopportunity, new CustomRangeHelper(metadata));
    }

}
