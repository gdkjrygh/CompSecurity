// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.geofence;

import android.location.Location;
import java.util.Date;

public interface IDownloadInfo
{
    public static final class eDownloadStates extends Enum
    {

        private static final eDownloadStates $VALUES[];
        public static final eDownloadStates COMPLETE;
        public static final eDownloadStates DOWNLOADING;
        public static final eDownloadStates NEVER;

        public static eDownloadStates valueOf(String s)
        {
            return (eDownloadStates)Enum.valueOf(com/digby/mm/android/library/geofence/IDownloadInfo$eDownloadStates, s);
        }

        public static eDownloadStates[] values()
        {
            return (eDownloadStates[])$VALUES.clone();
        }

        static 
        {
            NEVER = new eDownloadStates("NEVER", 0);
            DOWNLOADING = new eDownloadStates("DOWNLOADING", 1);
            COMPLETE = new eDownloadStates("COMPLETE", 2);
            $VALUES = (new eDownloadStates[] {
                NEVER, DOWNLOADING, COMPLETE
            });
        }

        private eDownloadStates(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract eDownloadStates getDownloadState();

    public abstract Date getLastDownloadDate();

    public abstract Location getLastDownloadLocation();

    public abstract void saveInfo();

    public abstract void setState(eDownloadStates edownloadstates);

    public abstract boolean shouldDownload();
}
