// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.geofence;


// Referenced classes of package com.digby.mm.android.library.geofence:
//            IDownloadInfo

public static final class I extends Enum
{

    private static final COMPLETE $VALUES[];
    public static final COMPLETE COMPLETE;
    public static final COMPLETE DOWNLOADING;
    public static final COMPLETE NEVER;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/digby/mm/android/library/geofence/IDownloadInfo$eDownloadStates, s);
    }

    public static I[] values()
    {
        return (I[])$VALUES.clone();
    }

    static 
    {
        NEVER = new <init>("NEVER", 0);
        DOWNLOADING = new <init>("DOWNLOADING", 1);
        COMPLETE = new <init>("COMPLETE", 2);
        $VALUES = (new .VALUES[] {
            NEVER, DOWNLOADING, COMPLETE
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
