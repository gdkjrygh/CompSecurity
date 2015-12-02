// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dalvik;


public final class DalvikLinearAllocType extends Enum
{

    private static final DalvikLinearAllocType $VALUES[];
    public static final DalvikLinearAllocType FBANDROID_DEBUG;
    public static final DalvikLinearAllocType FBANDROID_RELEASE;
    public static final DalvikLinearAllocType MESSENGER;
    public static final DalvikLinearAllocType SAMPLE_APP;
    public final int bufferSizeBytes;

    private DalvikLinearAllocType(String s, int i, int j)
    {
        super(s, i);
        bufferSizeBytes = j;
    }

    public static DalvikLinearAllocType valueOf(String s)
    {
        return (DalvikLinearAllocType)Enum.valueOf(com/facebook/dalvik/DalvikLinearAllocType, s);
    }

    public static DalvikLinearAllocType[] values()
    {
        return (DalvikLinearAllocType[])$VALUES.clone();
    }

    static 
    {
        FBANDROID_DEBUG = new DalvikLinearAllocType("FBANDROID_DEBUG", 0, 0x2000000);
        FBANDROID_RELEASE = new DalvikLinearAllocType("FBANDROID_RELEASE", 1, 0x2000000);
        MESSENGER = new DalvikLinearAllocType("MESSENGER", 2, 0x1000000);
        SAMPLE_APP = new DalvikLinearAllocType("SAMPLE_APP", 3, 0x800000);
        $VALUES = (new DalvikLinearAllocType[] {
            FBANDROID_DEBUG, FBANDROID_RELEASE, MESSENGER, SAMPLE_APP
        });
    }
}
