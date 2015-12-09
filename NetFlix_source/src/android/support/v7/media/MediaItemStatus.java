// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.util.TimeUtils;

public final class MediaItemStatus
{
    public static final class Builder
    {

        private final Bundle mBundle;

        public MediaItemStatus build()
        {
            return new MediaItemStatus(mBundle);
        }

        public Builder setContentDuration(long l)
        {
            mBundle.putLong("contentDuration", l);
            return this;
        }

        public Builder setContentPosition(long l)
        {
            mBundle.putLong("contentPosition", l);
            return this;
        }

        public Builder setExtras(Bundle bundle)
        {
            mBundle.putBundle("extras", bundle);
            return this;
        }

        public Builder setPlaybackState(int i)
        {
            mBundle.putInt("playbackState", i);
            return this;
        }

        public Builder setTimestamp(long l)
        {
            mBundle.putLong("timestamp", l);
            return this;
        }

        public Builder(int i)
        {
            mBundle = new Bundle();
            setTimestamp(SystemClock.elapsedRealtime());
            setPlaybackState(i);
        }

        public Builder(MediaItemStatus mediaitemstatus)
        {
            if (mediaitemstatus == null)
            {
                throw new IllegalArgumentException("status must not be null");
            } else
            {
                mBundle = new Bundle(mediaitemstatus.mBundle);
                return;
            }
        }
    }


    public static final String EXTRA_HTTP_RESPONSE_HEADERS = "android.media.status.extra.HTTP_RESPONSE_HEADERS";
    public static final String EXTRA_HTTP_STATUS_CODE = "android.media.status.extra.HTTP_STATUS_CODE";
    private static final String KEY_CONTENT_DURATION = "contentDuration";
    private static final String KEY_CONTENT_POSITION = "contentPosition";
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_PLAYBACK_STATE = "playbackState";
    private static final String KEY_TIMESTAMP = "timestamp";
    public static final int PLAYBACK_STATE_BUFFERING = 3;
    public static final int PLAYBACK_STATE_CANCELED = 5;
    public static final int PLAYBACK_STATE_ERROR = 7;
    public static final int PLAYBACK_STATE_FINISHED = 4;
    public static final int PLAYBACK_STATE_INVALIDATED = 6;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PENDING = 0;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    private final Bundle mBundle;

    private MediaItemStatus(Bundle bundle)
    {
        mBundle = bundle;
    }


    public static MediaItemStatus fromBundle(Bundle bundle)
    {
        if (bundle != null)
        {
            return new MediaItemStatus(bundle);
        } else
        {
            return null;
        }
    }

    private static String playbackStateToString(int i)
    {
        switch (i)
        {
        default:
            return Integer.toString(i);

        case 0: // '\0'
            return "pending";

        case 3: // '\003'
            return "buffering";

        case 1: // '\001'
            return "playing";

        case 2: // '\002'
            return "paused";

        case 4: // '\004'
            return "finished";

        case 5: // '\005'
            return "canceled";

        case 6: // '\006'
            return "invalidated";

        case 7: // '\007'
            return "error";
        }
    }

    public Bundle asBundle()
    {
        return mBundle;
    }

    public long getContentDuration()
    {
        return mBundle.getLong("contentDuration", -1L);
    }

    public long getContentPosition()
    {
        return mBundle.getLong("contentPosition", -1L);
    }

    public Bundle getExtras()
    {
        return mBundle.getBundle("extras");
    }

    public int getPlaybackState()
    {
        return mBundle.getInt("playbackState", 7);
    }

    public long getTimestamp()
    {
        return mBundle.getLong("timestamp");
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MediaItemStatus{ ");
        stringbuilder.append("timestamp=");
        TimeUtils.formatDuration(SystemClock.elapsedRealtime() - getTimestamp(), stringbuilder);
        stringbuilder.append(" ms ago");
        stringbuilder.append(", playbackState=").append(playbackStateToString(getPlaybackState()));
        stringbuilder.append(", contentPosition=").append(getContentPosition());
        stringbuilder.append(", contentDuration=").append(getContentDuration());
        stringbuilder.append(", extras=").append(getExtras());
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }

}
