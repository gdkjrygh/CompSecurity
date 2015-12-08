// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.metadata;


public final class AdSignalingMode extends Enum
{

    private static final AdSignalingMode $VALUES[];
    public static final AdSignalingMode CUSTOM_TIME_RANGES;
    public static final AdSignalingMode DEFAULT;
    public static final AdSignalingMode MANIFEST_CUES;
    public static final AdSignalingMode SERVER_MAP;
    private String _value;

    private AdSignalingMode(String s, int i, String s1)
    {
        super(s, i);
        _value = s1;
    }

    public static AdSignalingMode createFrom(String s)
    {
        AdSignalingMode aadsignalingmode[] = values();
        int j = aadsignalingmode.length;
        for (int i = 0; i < j; i++)
        {
            AdSignalingMode adsignalingmode = aadsignalingmode[i];
            if (adsignalingmode.getValue().equalsIgnoreCase(s))
            {
                return adsignalingmode;
            }
        }

        return DEFAULT;
    }

    public static AdSignalingMode valueOf(String s)
    {
        return (AdSignalingMode)Enum.valueOf(com/adobe/mediacore/metadata/AdSignalingMode, s);
    }

    public static AdSignalingMode[] values()
    {
        return (AdSignalingMode[])$VALUES.clone();
    }

    public String getValue()
    {
        return _value;
    }

    static 
    {
        DEFAULT = new AdSignalingMode("DEFAULT", 0, "default");
        MANIFEST_CUES = new AdSignalingMode("MANIFEST_CUES", 1, "manifest cues");
        SERVER_MAP = new AdSignalingMode("SERVER_MAP", 2, "server map");
        CUSTOM_TIME_RANGES = new AdSignalingMode("CUSTOM_TIME_RANGES", 3, "custom time ranges");
        $VALUES = (new AdSignalingMode[] {
            DEFAULT, MANIFEST_CUES, SERVER_MAP, CUSTOM_TIME_RANGES
        });
    }
}
