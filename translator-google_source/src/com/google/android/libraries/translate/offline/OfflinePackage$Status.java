// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;


public final class  extends Enum
{

    public static final PAUSED AVAILABLE;
    public static final PAUSED DOWNLOADED;
    public static final PAUSED DOWNLOADED_POST_PROCESSED;
    public static final PAUSED DOWNLOAD_NOT_STARTED;
    public static final PAUSED ERROR;
    public static final PAUSED INPROGRESS;
    public static final PAUSED PAUSED;
    public static final PAUSED REMOVED;
    private static final PAUSED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/translate/offline/OfflinePackage$Status, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        DOWNLOADED = new <init>("DOWNLOADED", 0);
        DOWNLOADED_POST_PROCESSED = new <init>("DOWNLOADED_POST_PROCESSED", 1);
        ERROR = new <init>("ERROR", 2);
        INPROGRESS = new <init>("INPROGRESS", 3);
        AVAILABLE = new <init>("AVAILABLE", 4);
        DOWNLOAD_NOT_STARTED = new <init>("DOWNLOAD_NOT_STARTED", 5);
        REMOVED = new <init>("REMOVED", 6);
        PAUSED = new <init>("PAUSED", 7);
        a = (new a[] {
            DOWNLOADED, DOWNLOADED_POST_PROCESSED, ERROR, INPROGRESS, AVAILABLE, DOWNLOAD_NOT_STARTED, REMOVED, PAUSED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
