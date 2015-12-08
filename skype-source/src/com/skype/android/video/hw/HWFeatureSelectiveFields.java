// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw;


public final class HWFeatureSelectiveFields extends Enum
{

    private static final HWFeatureSelectiveFields $VALUES[];
    public static final HWFeatureSelectiveFields Android_OMX;
    public static final HWFeatureSelectiveFields Mediacodec_Only;
    public static final HWFeatureSelectiveFields QC_OMX_Extension;
    public static final HWFeatureSelectiveFields Skype_OMX_Extension;
    private final String name;
    private final int value;

    private HWFeatureSelectiveFields(String s, int i, String s1, int j)
    {
        super(s, i);
        name = s1;
        value = j;
    }

    public static HWFeatureSelectiveFields valueOf(String s)
    {
        return (HWFeatureSelectiveFields)Enum.valueOf(com/skype/android/video/hw/HWFeatureSelectiveFields, s);
    }

    public static HWFeatureSelectiveFields[] values()
    {
        return (HWFeatureSelectiveFields[])$VALUES.clone();
    }

    public final String getName()
    {
        return name;
    }

    public final int getValue()
    {
        return value;
    }

    static 
    {
        Mediacodec_Only = new HWFeatureSelectiveFields("Mediacodec_Only", 0, "Mediacodec_Only", 1);
        Android_OMX = new HWFeatureSelectiveFields("Android_OMX", 1, "Android_OMX", 2);
        Skype_OMX_Extension = new HWFeatureSelectiveFields("Skype_OMX_Extension", 2, "Skype_OMX_Extension", 4);
        QC_OMX_Extension = new HWFeatureSelectiveFields("QC_OMX_Extension", 3, "QC_OMX_Extension", 8);
        $VALUES = (new HWFeatureSelectiveFields[] {
            Mediacodec_Only, Android_OMX, Skype_OMX_Extension, QC_OMX_Extension
        });
    }
}
