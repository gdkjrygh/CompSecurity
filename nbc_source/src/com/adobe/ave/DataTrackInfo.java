// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public class DataTrackInfo
{
    public static final class DataTrackInfoServiceType extends Enum
    {

        private static final DataTrackInfoServiceType $VALUES[];
        public static final DataTrackInfoServiceType DATATYPE_608Captions;
        public static final DataTrackInfoServiceType DATATYPE_708Captions;
        public static final DataTrackInfoServiceType DATATYPE_WebVTTCaptions;
        private final int value;

        public static DataTrackInfoServiceType valueOf(String s)
        {
            return (DataTrackInfoServiceType)Enum.valueOf(com/adobe/ave/DataTrackInfo$DataTrackInfoServiceType, s);
        }

        public static DataTrackInfoServiceType[] values()
        {
            return (DataTrackInfoServiceType[])$VALUES.clone();
        }

        public int getValue()
        {
            return value;
        }

        static 
        {
            DATATYPE_608Captions = new DataTrackInfoServiceType("DATATYPE_608Captions", 0, 0);
            DATATYPE_708Captions = new DataTrackInfoServiceType("DATATYPE_708Captions", 1, 1);
            DATATYPE_WebVTTCaptions = new DataTrackInfoServiceType("DATATYPE_WebVTTCaptions", 2, 2);
            $VALUES = (new DataTrackInfoServiceType[] {
                DATATYPE_608Captions, DATATYPE_708Captions, DATATYPE_WebVTTCaptions
            });
        }

        private DataTrackInfoServiceType(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }


    public boolean activity;
    public String description;
    public boolean isAutoSelect;
    public boolean isDefault;
    public boolean isForced;
    public String language;
    public DataTrackInfoServiceType serviceType;

    DataTrackInfo(String s, String s1, int i, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        description = s;
        language = s1;
        s = DataTrackInfoServiceType.values();
        int k = s.length;
        int j = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    s1 = s[j];
                    if (s1.getValue() != i)
                    {
                        break label0;
                    }
                    serviceType = s1;
                }
                isDefault = flag;
                isAutoSelect = flag1;
                isForced = flag2;
                activity = flag3;
                return;
            }
            j++;
        } while (true);
    }
}
