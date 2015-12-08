// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.utils;


// Referenced classes of package com.adobe.mediacore.utils:
//            TimeRangeCollection

public static final class _value extends Enum
{

    private static final MARK_RANGES $VALUES[];
    public static final MARK_RANGES DELETE_RANGES;
    public static final MARK_RANGES MARK_RANGES;
    public static final MARK_RANGES REPLACE_RANGES;
    private final String _value;

    public static _value valueOf(String s)
    {
        return (_value)Enum.valueOf(com/adobe/mediacore/utils/TimeRangeCollection$Type, s);
    }

    public static _value[] values()
    {
        return (_value[])$VALUES.clone();
    }

    public String getValue()
    {
        return _value;
    }

    static 
    {
        DELETE_RANGES = new <init>("DELETE_RANGES", 0, "delete_ranges");
        REPLACE_RANGES = new <init>("REPLACE_RANGES", 1, "replace_ranges");
        MARK_RANGES = new <init>("MARK_RANGES", 2, "mark_ranges");
        $VALUES = (new .VALUES[] {
            DELETE_RANGES, REPLACE_RANGES, MARK_RANGES
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        _value = s1;
    }
}
