// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;


public final class OfflineState extends Enum
{

    private static final OfflineState $VALUES[];
    public static final OfflineState DOWNLOADED;
    public static final OfflineState DOWNLOADING;
    public static final OfflineState NO_OFFLINE;
    public static final OfflineState REQUESTED;
    public static final OfflineState UNAVAILABLE;

    private OfflineState(String s, int i)
    {
        super(s, i);
    }

    public static OfflineState valueOf(String s)
    {
        return (OfflineState)Enum.valueOf(com/soundcloud/android/offline/OfflineState, s);
    }

    public static OfflineState[] values()
    {
        return (OfflineState[])$VALUES.clone();
    }

    static 
    {
        NO_OFFLINE = new OfflineState("NO_OFFLINE", 0);
        REQUESTED = new OfflineState("REQUESTED", 1);
        DOWNLOADING = new OfflineState("DOWNLOADING", 2);
        DOWNLOADED = new OfflineState("DOWNLOADED", 3);
        UNAVAILABLE = new OfflineState("UNAVAILABLE", 4);
        $VALUES = (new OfflineState[] {
            NO_OFFLINE, REQUESTED, DOWNLOADING, DOWNLOADED, UNAVAILABLE
        });
    }
}
