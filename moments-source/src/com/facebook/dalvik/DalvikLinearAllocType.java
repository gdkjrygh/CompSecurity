// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dalvik;


public final class DalvikLinearAllocType extends Enum
{

    private static final DalvikLinearAllocType $VALUES[];
    public static final DalvikLinearAllocType FBANDROID_DEBUG;
    public static final DalvikLinearAllocType FBANDROID_RELEASE;
    public static final DalvikLinearAllocType MESSENGER_DEBUG;
    public static final DalvikLinearAllocType MESSENGER_RELEASE;
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
        MESSENGER_DEBUG = new DalvikLinearAllocType("MESSENGER_DEBUG", 2, 0x2000000);
        MESSENGER_RELEASE = new DalvikLinearAllocType("MESSENGER_RELEASE", 3, 0x1000000);
        SAMPLE_APP = new DalvikLinearAllocType("SAMPLE_APP", 4, 0x800000);
        $VALUES = (new DalvikLinearAllocType[] {
            FBANDROID_DEBUG, FBANDROID_RELEASE, MESSENGER_DEBUG, MESSENGER_RELEASE, SAMPLE_APP
        });
    }
}
