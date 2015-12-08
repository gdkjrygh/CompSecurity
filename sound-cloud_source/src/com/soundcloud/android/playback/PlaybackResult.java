// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


public class PlaybackResult
{
    public static final class ErrorReason extends Enum
    {

        private static final ErrorReason $VALUES[];
        public static final ErrorReason MISSING_PLAYABLE_TRACKS;
        public static final ErrorReason NONE;
        public static final ErrorReason TRACK_UNAVAILABLE_CAST;
        public static final ErrorReason TRACK_UNAVAILABLE_OFFLINE;
        public static final ErrorReason UNSKIPPABLE;

        public static ErrorReason valueOf(String s)
        {
            return (ErrorReason)Enum.valueOf(com/soundcloud/android/playback/PlaybackResult$ErrorReason, s);
        }

        public static ErrorReason[] values()
        {
            return (ErrorReason[])$VALUES.clone();
        }

        static 
        {
            NONE = new ErrorReason("NONE", 0);
            UNSKIPPABLE = new ErrorReason("UNSKIPPABLE", 1);
            TRACK_UNAVAILABLE_OFFLINE = new ErrorReason("TRACK_UNAVAILABLE_OFFLINE", 2);
            TRACK_UNAVAILABLE_CAST = new ErrorReason("TRACK_UNAVAILABLE_CAST", 3);
            MISSING_PLAYABLE_TRACKS = new ErrorReason("MISSING_PLAYABLE_TRACKS", 4);
            $VALUES = (new ErrorReason[] {
                NONE, UNSKIPPABLE, TRACK_UNAVAILABLE_OFFLINE, TRACK_UNAVAILABLE_CAST, MISSING_PLAYABLE_TRACKS
            });
        }

        private ErrorReason(String s, int i)
        {
            super(s, i);
        }
    }


    private final ErrorReason errorReason;
    private final boolean isSuccess;

    private PlaybackResult(boolean flag, ErrorReason errorreason)
    {
        isSuccess = flag;
        errorReason = errorreason;
    }

    public static PlaybackResult error(ErrorReason errorreason)
    {
        return new PlaybackResult(false, errorreason);
    }

    public static PlaybackResult success()
    {
        return new PlaybackResult(true, ErrorReason.NONE);
    }

    public ErrorReason getErrorReason()
    {
        return errorReason;
    }

    public boolean isSuccess()
    {
        return isSuccess;
    }
}
