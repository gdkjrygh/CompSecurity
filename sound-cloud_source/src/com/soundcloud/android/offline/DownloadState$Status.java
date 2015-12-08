// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;


// Referenced classes of package com.soundcloud.android.offline:
//            DownloadState

private static final class _cls9 extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR CANCELLED;
    public static final ERROR CONNECTION_ERROR;
    public static final ERROR ERROR;
    public static final ERROR NOT_ENOUGH_SPACE;
    public static final ERROR PROGRESS;
    public static final ERROR SUCCESS;
    public static final ERROR UNAVAILABLE;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/soundcloud/android/offline/DownloadState$Status, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        PROGRESS = new <init>("PROGRESS", 0);
        SUCCESS = new <init>("SUCCESS", 1);
        CANCELLED = new <init>("CANCELLED", 2);
        UNAVAILABLE = new <init>("UNAVAILABLE", 3);
        NOT_ENOUGH_SPACE = new <init>("NOT_ENOUGH_SPACE", 4);
        CONNECTION_ERROR = new <init>("CONNECTION_ERROR", 5);
        ERROR = new <init>("ERROR", 6);
        $VALUES = (new .VALUES[] {
            PROGRESS, SUCCESS, CANCELLED, UNAVAILABLE, NOT_ENOUGH_SPACE, CONNECTION_ERROR, ERROR
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
