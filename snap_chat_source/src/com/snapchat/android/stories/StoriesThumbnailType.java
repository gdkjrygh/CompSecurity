// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories;


public final class StoriesThumbnailType extends Enum
{

    private static final StoriesThumbnailType $VALUES[];
    public static final StoriesThumbnailType ALL_SNAPS;
    public static final StoriesThumbnailType NEWEST_SNAP_THUMBNAIL_WITHOUT_DECAY;
    public static final StoriesThumbnailType SOME_SNAPS;
    public static final StoriesThumbnailType SPECIFIED_BY_METADATA;

    private StoriesThumbnailType(String s, int i)
    {
        super(s, i);
    }

    public static StoriesThumbnailType valueOf(String s)
    {
        return (StoriesThumbnailType)Enum.valueOf(com/snapchat/android/stories/StoriesThumbnailType, s);
    }

    public static StoriesThumbnailType[] values()
    {
        return (StoriesThumbnailType[])$VALUES.clone();
    }

    static 
    {
        ALL_SNAPS = new StoriesThumbnailType("ALL_SNAPS", 0);
        SOME_SNAPS = new StoriesThumbnailType("SOME_SNAPS", 1);
        NEWEST_SNAP_THUMBNAIL_WITHOUT_DECAY = new StoriesThumbnailType("NEWEST_SNAP_THUMBNAIL_WITHOUT_DECAY", 2);
        SPECIFIED_BY_METADATA = new StoriesThumbnailType("SPECIFIED_BY_METADATA", 3);
        $VALUES = (new StoriesThumbnailType[] {
            ALL_SNAPS, SOME_SNAPS, NEWEST_SNAP_THUMBNAIL_WITHOUT_DECAY, SPECIFIED_BY_METADATA
        });
    }
}
