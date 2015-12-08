// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.utils;

import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.adobe.mediacore.utils:
//            TimeRange, ReplacementTimeRange

public class TimeRangeCollection
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type DELETE_RANGES;
        public static final Type MARK_RANGES;
        public static final Type REPLACE_RANGES;
        private final String _value;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/adobe/mediacore/utils/TimeRangeCollection$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        public String getValue()
        {
            return _value;
        }

        static 
        {
            DELETE_RANGES = new Type("DELETE_RANGES", 0, "delete_ranges");
            REPLACE_RANGES = new Type("REPLACE_RANGES", 1, "replace_ranges");
            MARK_RANGES = new Type("MARK_RANGES", 2, "mark_ranges");
            $VALUES = (new Type[] {
                DELETE_RANGES, REPLACE_RANGES, MARK_RANGES
            });
        }

        private Type(String s, int i, String s1)
        {
            super(s, i);
            _value = s1;
        }
    }


    public static final String TIME_RANGE_BEGIN = "time_range_begin";
    public static final String TIME_RANGE_END = "time_range_end";
    public static final String TIME_RANGE_LIST = "time_range_list";
    public static final String TIME_RANGE_REPLACEMENT_DURATION = "replacement_duration";
    public static final String TIME_RANGE_TYPE = "time_range_type";
    public static final String TIME_RANGE_TYPE_DELETE = "delete";
    public static final String TIME_RANGE_TYPE_MARK = "mark";
    public static final String TIME_RANGE_TYPE_REPLACE = "replace";
    private List _timeRanges;
    private final Type _type;

    public TimeRangeCollection(Type type)
    {
        _timeRanges = new ArrayList();
        _type = type;
    }

    public TimeRangeCollection(Type type, List list)
    {
        this(type);
        _timeRanges.addAll(list);
    }

    public void addTimeRange(TimeRange timerange)
    {
        _timeRanges.add(timerange);
    }

    public Metadata toMetadata(Metadata metadata)
    {
        MetadataNode metadatanode = new MetadataNode();
        MetadataNode metadatanode1 = new MetadataNode();
        static class _cls1
        {

            static final int $SwitchMap$com$adobe$mediacore$utils$TimeRangeCollection$Type[];

            static 
            {
                $SwitchMap$com$adobe$mediacore$utils$TimeRangeCollection$Type = new int[Type.values().length];
                try
                {
                    $SwitchMap$com$adobe$mediacore$utils$TimeRangeCollection$Type[Type.DELETE_RANGES.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$utils$TimeRangeCollection$Type[Type.MARK_RANGES.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$utils$TimeRangeCollection$Type[Type.REPLACE_RANGES.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        int k;
        switch (_cls1..SwitchMap.com.adobe.mediacore.utils.TimeRangeCollection.Type[_type.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid time-range collection type: ").append(_type).toString());

        case 1: // '\001'
            metadatanode.setValue("time_range_type", "delete");
            for (int i = 0; i < _timeRanges.size(); i++)
            {
                metadata = (TimeRange)_timeRanges.get(i);
                MetadataNode metadatanode2 = new MetadataNode();
                metadatanode2.setValue("time_range_begin", (new StringBuilder()).append(metadata.getBegin()).append("").toString());
                metadatanode2.setValue("time_range_end", (new StringBuilder()).append(metadata.getEnd()).append("").toString());
                metadatanode1.setNode((new StringBuilder()).append(i).append("").toString(), metadatanode2);
            }

            metadatanode.setNode("time_range_list", metadatanode1);
            return metadatanode;

        case 2: // '\002'
            metadatanode.setValue(DefaultMetadataKeys.METADATA_KEY_TYPE.getValue(), Type.MARK_RANGES.getValue());
            int j;
            if (metadata == null || !metadata.containsKey(DefaultMetadataKeys.METADATA_KEY_ADJUST_SEEK_ENABLED.getValue()) || !metadata.getValue(DefaultMetadataKeys.METADATA_KEY_ADJUST_SEEK_ENABLED.getValue()).equals("true"))
            {
                metadatanode.setValue(DefaultMetadataKeys.METADATA_KEY_ADJUST_SEEK_ENABLED.getValue(), "false");
            } else
            {
                metadatanode.setValue(DefaultMetadataKeys.METADATA_KEY_ADJUST_SEEK_ENABLED.getValue(), "true");
            }
            for (j = 0; j < _timeRanges.size(); j++)
            {
                metadata = (TimeRange)_timeRanges.get(j);
                MetadataNode metadatanode3 = new MetadataNode();
                metadatanode3.setValue("time_range_begin", (new StringBuilder()).append(metadata.getBegin()).append("").toString());
                metadatanode3.setValue("time_range_end", (new StringBuilder()).append(metadata.getEnd()).append("").toString());
                metadatanode1.setNode((new StringBuilder()).append(j).append("").toString(), metadatanode3);
            }

            metadatanode.setNode("time_range_list", metadatanode1);
            return metadatanode;

        case 3: // '\003'
            metadatanode.setValue("time_range_type", "replace");
            k = 0;
            break;
        }
        for (; k < _timeRanges.size(); k++)
        {
            metadata = (ReplacementTimeRange)_timeRanges.get(k);
            MetadataNode metadatanode4 = new MetadataNode();
            metadatanode4.setValue("time_range_begin", (new StringBuilder()).append(metadata.getBegin()).append("").toString());
            metadatanode4.setValue("time_range_end", (new StringBuilder()).append(metadata.getEnd()).append("").toString());
            metadatanode4.setValue("replacement_duration", (new StringBuilder()).append(metadata.getReplacementDuration()).append("").toString());
            metadatanode1.setNode((new StringBuilder()).append(k).append("").toString(), metadatanode4);
        }

        metadatanode.setNode("time_range_list", metadatanode1);
        return metadatanode;
    }
}
