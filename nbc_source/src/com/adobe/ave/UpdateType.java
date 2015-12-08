// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public final class UpdateType extends Enum
{

    private static final UpdateType $VALUES[];
    public static final UpdateType BACKGROUND;
    public static final UpdateType CAPTION_ACTIVITY;
    public static final UpdateType INITIAL;
    public static final UpdateType LIVE;
    public static final UpdateType MASTERMANIFESTUPDATE;
    private final int value;

    private UpdateType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static UpdateType valueOf(String s)
    {
        return (UpdateType)Enum.valueOf(com/adobe/ave/UpdateType, s);
    }

    public static UpdateType[] values()
    {
        return (UpdateType[])$VALUES.clone();
    }

    final int getValue()
    {
        return value;
    }

    static 
    {
        INITIAL = new UpdateType("INITIAL", 0, 0);
        LIVE = new UpdateType("LIVE", 1, 1);
        CAPTION_ACTIVITY = new UpdateType("CAPTION_ACTIVITY", 2, 2);
        BACKGROUND = new UpdateType("BACKGROUND", 3, 3);
        MASTERMANIFESTUPDATE = new UpdateType("MASTERMANIFESTUPDATE", 4, 5);
        $VALUES = (new UpdateType[] {
            INITIAL, LIVE, CAPTION_ACTIVITY, BACKGROUND, MASTERMANIFESTUPDATE
        });
    }
}
