// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.format;


// Referenced classes of package com.skype.android.video.hw.format:
//            SliqOmxMapping, FormatMapper

public final class H264Level extends Enum
    implements SliqOmxMapping
{

    private static final H264Level $VALUES[];
    public static final H264Level L1;
    public static final H264Level L11;
    public static final H264Level L12;
    public static final H264Level L13;
    public static final H264Level L1B;
    public static final H264Level L2;
    public static final H264Level L21;
    public static final H264Level L22;
    public static final H264Level L3;
    public static final H264Level L31;
    public static final H264Level L32;
    public static final H264Level L4;
    public static final H264Level L41;
    public static final H264Level L42;
    public static final H264Level L5;
    public static final H264Level L51;
    private static FormatMapper mapper;
    private final String name;
    private final int omxValue;
    private final int sliqValue;

    private H264Level(String s, int i, String s1, int j, int k)
    {
        super(s, i);
        name = s1;
        omxValue = j;
        sliqValue = k;
    }

    public static H264Level fromName(String s)
    {
        return (H264Level)getMapper().fromName(s);
    }

    public static H264Level fromOmx(int i)
    {
        if (i > L51.getOmxValue().intValue())
        {
            return L51;
        } else
        {
            return (H264Level)getMapper().fromOmx(Integer.valueOf(i));
        }
    }

    public static H264Level fromSliq(int i)
    {
        return (H264Level)getMapper().fromSliq(Integer.valueOf(i));
    }

    private static FormatMapper getMapper()
    {
        com/skype/android/video/hw/format/H264Level;
        JVM INSTR monitorenter ;
        FormatMapper formatmapper;
        if (mapper == null)
        {
            mapper = new FormatMapper(values());
        }
        formatmapper = mapper;
        com/skype/android/video/hw/format/H264Level;
        JVM INSTR monitorexit ;
        return formatmapper;
        Exception exception;
        exception;
        throw exception;
    }

    public static H264Level valueOf(String s)
    {
        return (H264Level)Enum.valueOf(com/skype/android/video/hw/format/H264Level, s);
    }

    public static H264Level[] values()
    {
        return (H264Level[])$VALUES.clone();
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
        L1 = new H264Level("L1", 0, "10", 1, 0);
        L1B = new H264Level("L1B", 1, "10b", 2, 1);
        L11 = new H264Level("L11", 2, "11", 4, 2);
        L12 = new H264Level("L12", 3, "12", 8, 3);
        L13 = new H264Level("L13", 4, "13", 16, 4);
        L2 = new H264Level("L2", 5, "20", 32, 5);
        L21 = new H264Level("L21", 6, "21", 64, 6);
        L22 = new H264Level("L22", 7, "22", 128, 7);
        L3 = new H264Level("L3", 8, "30", 256, 8);
        L31 = new H264Level("L31", 9, "31", 512, 9);
        L32 = new H264Level("L32", 10, "32", 1024, 10);
        L4 = new H264Level("L4", 11, "40", 2048, 11);
        L41 = new H264Level("L41", 12, "41", 4096, 12);
        L42 = new H264Level("L42", 13, "42", 8192, 13);
        L5 = new H264Level("L5", 14, "50", 16384, 14);
        L51 = new H264Level("L51", 15, "51", 32768, 15);
        $VALUES = (new H264Level[] {
            L1, L1B, L11, L12, L13, L2, L21, L22, L3, L31, 
            L32, L4, L41, L42, L5, L51
        });
    }
}
