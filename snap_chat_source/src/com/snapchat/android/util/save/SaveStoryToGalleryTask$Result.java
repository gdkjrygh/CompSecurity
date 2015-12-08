// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.save;


// Referenced classes of package com.snapchat.android.util.save:
//            SaveStoryToGalleryTask

public static final class  extends Enum
{

    private static final FAILED_SNAPS_DID_NOT_LOAD_IN_TIME $VALUES[];
    public static final FAILED_SNAPS_DID_NOT_LOAD_IN_TIME FAILED_ALREADY_SAVING;
    public static final FAILED_SNAPS_DID_NOT_LOAD_IN_TIME FAILED_DURING_TRANSCODER_SETUP;
    public static final FAILED_SNAPS_DID_NOT_LOAD_IN_TIME FAILED_DURING_TRANSCODING;
    public static final FAILED_SNAPS_DID_NOT_LOAD_IN_TIME FAILED_INITIALIZING_MEDIA_SOURCES;
    public static final FAILED_SNAPS_DID_NOT_LOAD_IN_TIME FAILED_INTERRUPTED;
    public static final FAILED_SNAPS_DID_NOT_LOAD_IN_TIME FAILED_SNAPS_DID_NOT_LOAD_IN_TIME;
    public static final FAILED_SNAPS_DID_NOT_LOAD_IN_TIME FAILED_SNAPS_NOT_ALL_LOADED;
    public static final FAILED_SNAPS_DID_NOT_LOAD_IN_TIME FAILED_SSTG_DISABLED;
    public static final FAILED_SNAPS_DID_NOT_LOAD_IN_TIME INIT;
    public static final FAILED_SNAPS_DID_NOT_LOAD_IN_TIME STARTED;
    public static final FAILED_SNAPS_DID_NOT_LOAD_IN_TIME SUCCESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/save/SaveStoryToGalleryTask$Result, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INIT = new <init>("INIT", 0);
        STARTED = new <init>("STARTED", 1);
        SUCCESS = new <init>("SUCCESS", 2);
        FAILED_SSTG_DISABLED = new <init>("FAILED_SSTG_DISABLED", 3);
        FAILED_ALREADY_SAVING = new <init>("FAILED_ALREADY_SAVING", 4);
        FAILED_SNAPS_NOT_ALL_LOADED = new <init>("FAILED_SNAPS_NOT_ALL_LOADED", 5);
        FAILED_INITIALIZING_MEDIA_SOURCES = new <init>("FAILED_INITIALIZING_MEDIA_SOURCES", 6);
        FAILED_INTERRUPTED = new <init>("FAILED_INTERRUPTED", 7);
        FAILED_DURING_TRANSCODER_SETUP = new <init>("FAILED_DURING_TRANSCODER_SETUP", 8);
        FAILED_DURING_TRANSCODING = new <init>("FAILED_DURING_TRANSCODING", 9);
        FAILED_SNAPS_DID_NOT_LOAD_IN_TIME = new <init>("FAILED_SNAPS_DID_NOT_LOAD_IN_TIME", 10);
        $VALUES = (new .VALUES[] {
            INIT, STARTED, SUCCESS, FAILED_SSTG_DISABLED, FAILED_ALREADY_SAVING, FAILED_SNAPS_NOT_ALL_LOADED, FAILED_INITIALIZING_MEDIA_SOURCES, FAILED_INTERRUPTED, FAILED_DURING_TRANSCODER_SETUP, FAILED_DURING_TRANSCODING, 
            FAILED_SNAPS_DID_NOT_LOAD_IN_TIME
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
