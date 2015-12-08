// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising.customadmarkers;

import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.MediaResource;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.PlacementOpportunity;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdAsset;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;
import com.adobe.mediacore.timeline.advertising.AdClick;
import com.adobe.mediacore.timeline.advertising.ContentResolver;
import com.adobe.mediacore.timeline.advertising.ContentTracker;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;
import com.adobe.mediacore.utils.TimeRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

// Referenced classes of package com.adobe.mediacore.timeline.advertising.customadmarkers:
//            CustomRangeHelper

public final class CustomAdMarkersContentResolver extends ContentResolver
{

    public static final int DEFAULT_TIME_PREROLL = 0;
    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::[CustomAdMarkers]::").append(com/adobe/mediacore/timeline/advertising/customadmarkers/CustomAdMarkersContentResolver.getSimpleName()).toString();
    private static int _nextAvailableAdId = 10000;
    private final Logger _logger;

    public CustomAdMarkersContentResolver()
    {
        _logger = Log.getLogger(LOG_TAG);
    }

    private List extractAdBreakPlacements(List list, Metadata metadata)
    {
        Object obj;
        Object obj1;
        Object obj3;
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        if (list.isEmpty())
        {
            return arraylist;
        }
        obj3 = (TimeRange)list.get(0);
        long l = ((TimeRange) (obj3)).getBegin();
        obj1 = new ArrayList();
        ((List) (obj1)).add(timeRangeToAd(((TimeRange) (obj3)), metadata));
        i = 1;
        obj = Long.valueOf(l);
_L2:
        Object obj2;
        TimeRange timerange;
        if (i >= list.size())
        {
            break MISSING_BLOCK_LABEL_530;
        }
        timerange = (TimeRange)list.get(i);
        Long long2 = Long.valueOf(timerange.getBegin() - ((TimeRange) (obj3)).getEnd());
        obj2 = timerange;
        if (long2.longValue() >= 0L)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        obj2 = Long.valueOf(Math.abs(long2.longValue()));
        if (timerange.getBegin() + ((Long) (obj2)).longValue() < timerange.getEnd())
        {
            break; /* Loop/switch isn't completed */
        }
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#extractAdBreakPlacements").toString(), (new StringBuilder()).append("Failed to place custome ad-marker for timerange: ").append(timerange).append(". Prev. time-range: ").append(obj3).toString());
        obj2 = obj;
        obj = obj3;
_L3:
        i++;
        obj3 = obj;
        obj = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#extractAdBreakPlacements").toString(), (new StringBuilder()).append("Adjusting timerange: ").append(timerange).append("with offset: ").append(obj2).append(". Prev. time-range: ").append(obj3).toString());
        obj2 = Long.valueOf(timerange.getBegin() + ((Long) (obj2)).longValue());
        obj2 = TimeRange.createRange(((Long) (obj2)).longValue(), timerange.getEnd() - ((Long) (obj2)).longValue());
        Long long1 = Long.valueOf(((TimeRange) (obj2)).getBegin() - ((TimeRange) (obj3)).getEnd());
        if (long1.longValue() > 0L)
        {
            obj1 = AdBreak.createAdBreak(((List) (obj1)), ((Long) (obj)).longValue(), 0L, "custom_ad_break");
            arraylist.add(new AdBreakPlacement(((AdBreak) (obj1)), getPlacementInformation(((Long) (obj)).longValue(), ((AdBreak) (obj1)).getDuration())));
            obj1 = new ArrayList();
            ((List) (obj1)).add(timeRangeToAd(((TimeRange) (obj2)), metadata));
            obj = Long.valueOf(((TimeRange) (obj2)).getBegin());
        } else
        if (long1.longValue() == 0L)
        {
            ((List) (obj1)).add(timeRangeToAd(((TimeRange) (obj2)), metadata));
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Time-ranges should not overlap at this point. Current time-range: ").append(obj2).append(". Prev. time-range: ").append(obj3).toString());
        }
        obj3 = obj2;
        obj2 = obj;
        obj = obj3;
          goto _L3
        if (!((List) (obj1)).isEmpty())
        {
            list = AdBreak.createAdBreak(((List) (obj1)), ((Long) (obj)).longValue(), 0L, "custom_ad_break");
            arraylist.add(new AdBreakPlacement(list, getPlacementInformation(((Long) (obj)).longValue(), list.getDuration())));
        }
        return arraylist;
    }

    private MetadataNode extractCustomAdMarkersMetadata(Metadata metadata)
    {
        Object obj = null;
        Object obj1 = null;
        if (metadata instanceof MetadataNode)
        {
            metadata = (MetadataNode)metadata;
            obj = obj1;
            if (metadata.containsNode(DefaultMetadataKeys.CUSTOM_AD_MARKERS_METADATA_KEY.getValue()))
            {
                obj = metadata.getNode(DefaultMetadataKeys.CUSTOM_AD_MARKERS_METADATA_KEY.getValue());
            }
            if (metadata.containsKey(DefaultMetadataKeys.ADVERTISING_METADATA.getValue()))
            {
                metadata = metadata.getNode(DefaultMetadataKeys.ADVERTISING_METADATA.getValue());
                obj = metadata;
                if (metadata != null)
                {
                    if (metadata.containsNode(DefaultMetadataKeys.CUSTOM_AD_MARKERS_METADATA_KEY.getValue()))
                    {
                        obj = metadata.getNode(DefaultMetadataKeys.CUSTOM_AD_MARKERS_METADATA_KEY.getValue());
                    } else
                    {
                        obj = metadata;
                        if (metadata.containsNode(DefaultMetadataKeys.TIME_RANGES_METADATA_KEY.getValue()))
                        {
                            return metadata.getNode(DefaultMetadataKeys.TIME_RANGES_METADATA_KEY.getValue());
                        }
                    }
                }
            }
        }
        return ((MetadataNode) (obj));
    }

    private List extractTimeRanges(Metadata metadata)
    {
        ArrayList arraylist = new ArrayList();
        metadata = ((MetadataNode)metadata).getNode("time_range_list");
        Long long1;
        Object obj;
        for (Iterator iterator = (new TreeSet(metadata.keySet())).iterator(); iterator.hasNext(); arraylist.add(TimeRange.createRange(long1.longValue(), ((Long) (obj)).longValue() - long1.longValue())))
        {
            obj = metadata.getNode((String)iterator.next());
            long1 = Long.valueOf(Long.parseLong(((MetadataNode) (obj)).getValue("time_range_begin")));
            obj = Long.valueOf(Long.parseLong(((MetadataNode) (obj)).getValue("time_range_end")));
            if (long1.longValue() >= ((Long) (obj)).longValue())
            {
                throw new IllegalArgumentException("'begin' value must not be greater or equal than the 'end' value.");
            }
        }

        return arraylist;
    }

    public static int getNextTimelineId()
    {
        com/adobe/mediacore/timeline/advertising/customadmarkers/CustomAdMarkersContentResolver;
        JVM INSTR monitorenter ;
        int i;
        i = _nextAvailableAdId;
        _nextAvailableAdId = i + 1;
        com/adobe/mediacore/timeline/advertising/customadmarkers/CustomAdMarkersContentResolver;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    private PlacementInformation getPlacementInformation(long l, long l1)
    {
        com.adobe.mediacore.timeline.advertising.PlacementInformation.Type type = com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.MID_ROLL;
        if (l == 0L)
        {
            type = com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.PRE_ROLL;
        }
        return new PlacementInformation(type, com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.MARK, l, l1);
    }

    private AdAsset getPrimaryAdAssetForCustomAdMarker(Metadata metadata, int i, long l)
    {
        AdClick adclick = new AdClick("", "", "");
        return new AdAsset(i, l, MediaResource.createFromMetadata(metadata, com.adobe.mediacore.MediaResource.Type.HLS), adclick, metadata);
    }

    private void handleInvalidMetadata(Exception exception)
    {
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#handleInvalidMetadata").toString(), String.valueOf(exception.getMessage()));
        com.adobe.mediacore.MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(com.adobe.mediacore.MediaPlayerNotification.ErrorCode.AD_RESOLVER_METADATA_INVALID, "Invalid JSON metadata.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", exception.getMessage());
        error.setMetadata(metadatanode);
        notifyResolveError(error);
    }

    private void processMetadata(Metadata metadata, CustomRangeHelper customrangehelper)
    {
        try
        {
            String s = DefaultMetadataKeys.METADATA_KEY_TYPE.getValue();
            if (!metadata.containsKey(s) || !metadata.getValue(s).equals(com.adobe.mediacore.utils.TimeRangeCollection.Type.MARK_RANGES.getValue()))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Metadata type must be: ").append(s).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Metadata metadata)
        {
            handleInvalidMetadata(metadata);
            return;
        }
        notifyResolveComplete(extractAdBreakPlacements(customrangehelper.mergeRanges(customrangehelper.extractCustomTimeRanges(customrangehelper.extractCustomTimeRangeMetadata())), metadata));
        return;
    }

    private Ad timeRangeToAd(TimeRange timerange, Metadata metadata)
    {
        int i = getNextTimelineId();
        long l = timerange.getDuration();
        return Ad.createCustomAdMarker(com.adobe.mediacore.MediaResource.Type.HLS, l, i, getPrimaryAdAssetForCustomAdMarker(metadata, i, l));
    }

    protected boolean doCanResolve(PlacementOpportunity placementopportunity)
    {
        return placementopportunity.getPlacementInformation().getMode() == com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.MARK;
    }

    protected ContentTracker doProvideAdTracker()
    {
        return null;
    }

    protected void doResolveAds(Metadata metadata, PlacementOpportunity placementopportunity)
    {
        processMetadata(extractCustomAdMarkersMetadata(metadata), new CustomRangeHelper(metadata));
    }

}
