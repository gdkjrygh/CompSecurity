// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.format;


// Referenced classes of package com.skype.android.video.hw.format:
//            SliqOmxMapping, FormatMapper

public final class H264Profile extends Enum
    implements SliqOmxMapping
{

    private static final H264Profile $VALUES[];
    public static final H264Profile BASELINE;
    public static final H264Profile EXTENDEND;
    public static final H264Profile HIGH;
    public static final H264Profile HIGH10;
    public static final H264Profile HIGH422;
    public static final H264Profile HIGH444;
    public static final H264Profile MAIN;
    private static FormatMapper mapper;
    private final String name;
    private final int omxValue;
    private final int sliqValue;

    private H264Profile(String s, int i, String s1, int j, int k)
    {
        super(s, i);
        name = s1;
        omxValue = j;
        sliqValue = k;
    }

    public static H264Profile fromName(String s)
    {
        return (H264Profile)getMapper().fromName(s);
    }

    public static H264Profile fromOmx(int i)
    {
        return (H264Profile)getMapper().fromOmx(Integer.valueOf(i));
    }

    public static H264Profile fromSliq(int i)
    {
        return (H264Profile)getMapper().fromSliq(Integer.valueOf(i));
    }

    private static FormatMapper getMapper()
    {
        com/skype/android/video/hw/format/H264Profile;
        JVM INSTR monitorenter ;
        FormatMapper formatmapper;
        if (mapper == null)
        {
            mapper = new FormatMapper(values());
        }
        formatmapper = mapper;
        com/skype/android/video/hw/format/H264Profile;
        JVM INSTR monitorexit ;
        return formatmapper;
        Exception exception;
        exception;
        throw exception;
    }

    public static H264Profile valueOf(String s)
    {
        return (H264Profile)Enum.valueOf(com/skype/android/video/hw/format/H264Profile, s);
    }

    public static H264Profile[] values()
    {
        return (H264Profile[])$VALUES.clone();
    }

    public final String getName()
    {
        return name;
    }

    public final Integer getOmxValue()
    {
        return Integer.valueOf(omxValue);
    }

    public final volatile Object getOmxValue()
    {
        return getOmxValue();
    }

    public final Integer getSliqValue()
    {
        return Integer.valueOf(sliqValue);
    }

    public final volatile Object getSliqValue()
    {
        return getSliqValue();
    }

    static 
    {
        BASELINE = new H264Profile("BASELINE", 0, "baseline", 1, 1);
        EXTENDEND = new H264Profile("EXTENDEND", 1, "extended", 4, 2);
        MAIN = new H264Profile("MAIN", 2, "main", 2, 3);
        HIGH = new H264Profile("HIGH", 3, "high", 8, 6);
        HIGH10 = new H264Profile("HIGH10", 4, "high10", 16, 8);
        HIGH422 = new H264Profile("HIGH422", 5, "high422", 32, 10);
        HIGH444 = new H264Profile("HIGH444", 6, "high444", 64, 13);
        $VALUES = (new H264Profile[] {
            BASELINE, EXTENDEND, MAIN, HIGH, HIGH10, HIGH422, HIGH444
        });
    }
}
