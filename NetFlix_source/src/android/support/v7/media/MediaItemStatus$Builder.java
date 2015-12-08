// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package android.support.v7.media:
//            MediaItemStatus

public static final class _cls00
{

    private final Bundle mBundle;

    public MediaItemStatus build()
    {
        return new MediaItemStatus(mBundle, null);
    }

    public mBundle setContentDuration(long l)
    {
        mBundle.putLong("contentDuration", l);
        return this;
    }

    public mBundle setContentPosition(long l)
    {
        mBundle.putLong("contentPosition", l);
        return this;
    }

    public mBundle setExtras(Bundle bundle)
    {
        mBundle.putBundle("extras", bundle);
        return this;
    }

    public mBundle setPlaybackState(int i)
    {
        mBundle.putInt("playbackState", i);
        return this;
    }

    public mBundle setTimestamp(long l)
    {
        mBundle.putLong("timestamp", l);
        return this;
    }

    public (int i)
    {
        mBundle = new Bundle();
        setTimestamp(SystemClock.elapsedRealtime());
        setPlaybackState(i);
    }

    public setPlaybackState(MediaItemStatus mediaitemstatus)
    {
        if (mediaitemstatus == null)
        {
            throw new IllegalArgumentException("status must not be null");
        } else
        {
            mBundle = new Bundle(MediaItemStatus.access$000(mediaitemstatus));
            return;
        }
    }
}
