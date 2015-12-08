// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;


public final class StorageType extends Enum
{

    private static final StorageType $VALUES[];
    public static final StorageType PHONE_FREE;
    public static final StorageType PHONE_TOTAL;
    public static final StorageType PHONE_USED;
    public static final StorageType SD_CARD_FREE;
    public static final StorageType SD_CARD_TOTAL;
    public static final StorageType SD_CARD_USED;
    private int value;

    private StorageType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static StorageType valueOf(String s)
    {
        return (StorageType)Enum.valueOf(com/ibm/eo/model/StorageType, s);
    }

    public static StorageType[] values()
    {
        return (StorageType[])$VALUES.clone();
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        PHONE_FREE = new StorageType("PHONE_FREE", 0, 0);
        PHONE_USED = new StorageType("PHONE_USED", 1, 1);
        PHONE_TOTAL = new StorageType("PHONE_TOTAL", 2, 2);
        SD_CARD_FREE = new StorageType("SD_CARD_FREE", 3, 3);
        SD_CARD_USED = new StorageType("SD_CARD_USED", 4, 4);
        SD_CARD_TOTAL = new StorageType("SD_CARD_TOTAL", 5, 5);
        $VALUES = (new StorageType[] {
            PHONE_FREE, PHONE_USED, PHONE_TOTAL, SD_CARD_FREE, SD_CARD_USED, SD_CARD_TOTAL
        });
    }
}
