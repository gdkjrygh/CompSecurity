// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising.customadmarkers;

import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.utils.ReplacementTimeRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class CustomRangeHelper
{

    public static final String DELETE_RANGE = "delete";
    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::[CustomRangeHelper]::").append(com/adobe/mediacore/timeline/advertising/customadmarkers/CustomRangeHelper.getSimpleName()).toString();
    public static final String MARK_RANGE = "mark";
    public static final String REPLACE_RANGE = "replace";
    private String _key;
    private final Logger _logger;
    private Metadata _metadata;

    public CustomRangeHelper(Metadata metadata)
    {
        _logger = Log.getLogger(LOG_TAG);
        _metadata = metadata;
    }

    public MetadataNode extractCustomTimeRangeMetadata()
    {
        MetadataNode metadatanode = null;
        Object obj = null;
        if (_metadata instanceof MetadataNode)
        {
            MetadataNode metadatanode2 = (MetadataNode)_metadata;
            metadatanode = obj;
            if (metadatanode2.containsNode(DefaultMetadataKeys.CUSTOM_AD_MARKERS_METADATA_KEY.getValue()))
            {
                metadatanode = metadatanode2.getNode(DefaultMetadataKeys.CUSTOM_AD_MARKERS_METADATA_KEY.getValue());
            }
            if (metadatanode2.containsKey(DefaultMetadataKeys.ADVERTISING_METADATA.getValue()))
            {
                MetadataNode metadatanode1 = metadatanode2.getNode(DefaultMetadataKeys.ADVERTISING_METADATA.getValue());
                metadatanode = metadatanode1;
                if (metadatanode1 != null)
                {
                    if (metadatanode1.containsNode(DefaultMetadataKeys.CUSTOM_AD_MARKERS_METADATA_KEY.getValue()))
                    {
                        metadatanode = metadatanode1.getNode(DefaultMetadataKeys.CUSTOM_AD_MARKERS_METADATA_KEY.getValue());
                    } else
                    {
                        metadatanode = metadatanode1;
                        if (metadatanode1.containsNode(DefaultMetadataKeys.TIME_RANGES_METADATA_KEY.getValue()))
                        {
                            return metadatanode1.getNode(DefaultMetadataKeys.TIME_RANGES_METADATA_KEY.getValue());
                        }
                    }
                }
            }
        }
        return metadatanode;
    }

    public List extractCustomTimeRanges(Metadata metadata)
    {
        ArrayList arraylist = new ArrayList();
        MetadataNode metadatanode = ((MetadataNode)metadata).getNode("time_range_list");
        for (Iterator iterator = (new TreeSet(metadatanode.keySet())).iterator(); iterator.hasNext();)
        {
            metadata = metadatanode.getNode((String)iterator.next());
            Long long1 = Long.valueOf(Long.parseLong(metadata.getValue("time_range_begin")));
            Long long2 = Long.valueOf(Long.parseLong(metadata.getValue("time_range_end")));
            if (metadata.containsKey("replacement_duration"))
            {
                metadata = Long.valueOf(Long.parseLong(metadata.getValue("replacement_duration")));
            } else
            {
                metadata = Long.valueOf(0L);
            }
            if (long2.longValue() < 0L)
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#extractCustomTimeRanges").toString(), (new StringBuilder()).append("Invalid TimeRange [").append(long1).append(", ").append(long2).append("], 'end' value is less than 0, time range ignored").toString());
            } else
            {
                if (long1.longValue() < 0L)
                {
                    _logger.w((new StringBuilder()).append(LOG_TAG).append("#extractCustomTimeRanges").toString(), (new StringBuilder()).append("Invalid TimeRange [").append(long1).append(", ").append(long2).append("], modified 'begin' to 0").toString());
                    long1 = Long.valueOf(0L);
                }
                if (long1.longValue() >= long2.longValue())
                {
                    _logger.w((new StringBuilder()).append(LOG_TAG).append("#extractCustomTimeRanges").toString(), (new StringBuilder()).append("Invalid TimeRange [").append(long1).append(", ").append(long2).append("], 'begin' value must not be greater then or equal to 'end', time range ignored.").toString());
                } else
                {
                    arraylist.add(ReplacementTimeRange.createRange(long1.longValue(), long2.longValue() - long1.longValue(), metadata.longValue()));
                }
            }
        }

        Collections.sort(arraylist);
        return arraylist;
    }

    public String hasRanges()
    {
        _key = null;
        if (_metadata == null || !_metadata.containsKey(DefaultMetadataKeys.TIME_RANGES_METADATA_KEY.getValue())) goto _L2; else goto _L1
_L1:
        String s = _metadata.getValue(DefaultMetadataKeys.TIME_RANGES_METADATA_KEY.getValue());
        if (!s.equals("delete")) goto _L4; else goto _L3
_L3:
        _key = "delete";
_L2:
        if (_metadata != null && _metadata.containsKey(DefaultMetadataKeys.CUSTOM_AD_MARKERS_METADATA_KEY.getValue()))
        {
            _key = "mark";
        }
        return _key;
_L4:
        if (s.equals("replace"))
        {
            _key = "replace";
        } else
        if (s.equals("mark"))
        {
            _key = "mark";
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public List mergeRanges(List list)
    {
        ArrayList arraylist = new ArrayList();
        ReplacementTimeRange replacementtimerange1 = (ReplacementTimeRange)list.get(0);
        arraylist.add(replacementtimerange1);
        int i = 1;
        while (i < list.size()) 
        {
            ReplacementTimeRange replacementtimerange = (ReplacementTimeRange)list.get(i);
            if (replacementtimerange.getBegin() > replacementtimerange1.getBegin())
            {
                if (replacementtimerange.getBegin() > replacementtimerange1.getEnd())
                {
                    arraylist.add(replacementtimerange);
                } else
                if (replacementtimerange.getEnd() > replacementtimerange1.getEnd())
                {
                    replacementtimerange = ReplacementTimeRange.createRange(replacementtimerange1.getBegin(), replacementtimerange.getEnd() - replacementtimerange1.getBegin(), replacementtimerange1.getReplacementDuration());
                    arraylist.remove(replacementtimerange1);
                    arraylist.add(replacementtimerange);
                    _logger.w((new StringBuilder()).append(LOG_TAG).append("#mergeRanges").toString(), (new StringBuilder()).append("Adjusting timerange due to overlap between prev and current timerange: New Timerange ").append(replacementtimerange).toString());
                } else
                if (replacementtimerange.getEnd() < replacementtimerange1.getEnd())
                {
                    _logger.w((new StringBuilder()).append(LOG_TAG).append("#mergeRanges").toString(), (new StringBuilder()).append("TimeRange ").append(replacementtimerange).append(" was not added because it is a subset ").append("of the previous timerange").toString());
                }
            } else
            if (replacementtimerange.getBegin() == replacementtimerange1.getBegin())
            {
                if (replacementtimerange.getEnd() > replacementtimerange1.getEnd())
                {
                    replacementtimerange = ReplacementTimeRange.createRange(replacementtimerange1.getBegin(), replacementtimerange.getEnd() - replacementtimerange1.getBegin(), replacementtimerange1.getReplacementDuration());
                    arraylist.remove(replacementtimerange1);
                    arraylist.add(replacementtimerange);
                    _logger.w((new StringBuilder()).append(LOG_TAG).append("#mergeRanges").toString(), (new StringBuilder()).append("Adjusting timerange due to overlap between prev and current timerange: New Timerange ").append(replacementtimerange).toString());
                } else
                if (replacementtimerange.getEnd() < replacementtimerange1.getEnd())
                {
                    _logger.w((new StringBuilder()).append(LOG_TAG).append("#mergeRanges").toString(), (new StringBuilder()).append("TimeRange ").append(replacementtimerange).append(" was not added because it is a subset ").append("of the previous timerange").toString());
                }
            }
            i++;
            replacementtimerange1 = replacementtimerange;
        }
        return arraylist;
    }

}
