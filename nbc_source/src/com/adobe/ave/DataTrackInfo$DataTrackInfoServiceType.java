// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


// Referenced classes of package com.adobe.ave:
//            DataTrackInfo

public static final class value extends Enum
{

    private static final DATATYPE_WebVTTCaptions $VALUES[];
    public static final DATATYPE_WebVTTCaptions DATATYPE_608Captions;
    public static final DATATYPE_WebVTTCaptions DATATYPE_708Captions;
    public static final DATATYPE_WebVTTCaptions DATATYPE_WebVTTCaptions;
    private final int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/adobe/ave/DataTrackInfo$DataTrackInfoServiceType, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        DATATYPE_608Captions = new <init>("DATATYPE_608Captions", 0, 0);
        DATATYPE_708Captions = new <init>("DATATYPE_708Captions", 1, 1);
        DATATYPE_WebVTTCaptions = new <init>("DATATYPE_WebVTTCaptions", 2, 2);
        $VALUES = (new .VALUES[] {
            DATATYPE_608Captions, DATATYPE_708Captions, DATATYPE_WebVTTCaptions
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
