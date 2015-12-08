// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.format;


// Referenced classes of package com.skype.android.video.hw.format:
//            SliqOmxMapping, FormatMapper

public final class ColorFormat extends Enum
    implements SliqOmxMapping
{

    private static final ColorFormat $VALUES[];
    public static final ColorFormat I420;
    public static final ColorFormat NV12;
    public static final ColorFormat OMX_QCOM_COLOR_FormatYUV420PackedSemiPlanar32m;
    public static final ColorFormat SURFACE;
    public static final ColorFormat UYVY;
    public static final ColorFormat YUY2;
    public static final ColorFormat YVYU;
    private static FormatMapper mapper;
    private final int bitsPerPixel;
    private final String name;
    private final int omxValue;
    private final int sliqValue;

    private ColorFormat(String s, int i, int j, int k, int l)
    {
        super(s, i);
        name = (new StringBuilder("0x")).append(Integer.toHexString(j)).toString();
        bitsPerPixel = l;
        sliqValue = j;
        omxValue = k;
    }

    private ColorFormat(String s, int i, String s1, int j, int k)
    {
        super(s, i);
        name = s1;
        bitsPerPixel = k;
        sliqValue = fourcc(s1);
        omxValue = j;
    }

    private static int fourcc(CharSequence charsequence)
    {
        if (charsequence.length() != 4)
        {
            throw new IllegalArgumentException("four chars expected");
        }
        int j = 0;
        for (int i = 3; i >= 0; i--)
        {
            j = j << 8 | charsequence.charAt(i) & 0xff;
        }

        return j;
    }

    public static ColorFormat fromName(String s)
    {
        return (ColorFormat)getMapper().fromName(s);
    }

    public static ColorFormat fromOmx(int i)
    {
        return (ColorFormat)getMapper().fromOmx(Integer.valueOf(i));
    }

    public static ColorFormat fromSliq(int i)
    {
        return (ColorFormat)getMapper().fromSliq(Integer.valueOf(i));
    }

    private static FormatMapper getMapper()
    {
        com/skype/android/video/hw/format/ColorFormat;
        JVM INSTR monitorenter ;
        FormatMapper formatmapper;
        if (mapper == null)
        {
            mapper = new FormatMapper(values());
        }
        formatmapper = mapper;
        com/skype/android/video/hw/format/ColorFormat;
        JVM INSTR monitorexit ;
        return formatmapper;
        Exception exception;
        exception;
        throw exception;
    }

    public static ColorFormat valueOf(String s)
    {
        return (ColorFormat)Enum.valueOf(com/skype/android/video/hw/format/ColorFormat, s);
    }

    public static ColorFormat[] values()
    {
        return (ColorFormat[])$VALUES.clone();
    }

    public final int getBitsPerPixel()
    {
        return bitsPerPixel;
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
        I420 = new ColorFormat("I420", 0, "I420", 19, 12);
        NV12 = new ColorFormat("NV12", 1, "NV12", 21, 12);
        YUY2 = new ColorFormat("YUY2", 2, "YUY2", 25, 16);
        UYVY = new ColorFormat("UYVY", 3, "UYVY", 27, 16);
        YVYU = new ColorFormat("YVYU", 4, "YVYU", 26, 16);
        OMX_QCOM_COLOR_FormatYUV420PackedSemiPlanar32m = new ColorFormat("OMX_QCOM_COLOR_FormatYUV420PackedSemiPlanar32m", 5, 0x7fa30c04, 0x7fa30c04, 0);
        SURFACE = new ColorFormat("SURFACE", 6, 0x7f000789, 0x7f000789, 32);
        $VALUES = (new ColorFormat[] {
            I420, NV12, YUY2, UYVY, YVYU, OMX_QCOM_COLOR_FormatYUV420PackedSemiPlanar32m, SURFACE
        });
    }
}
