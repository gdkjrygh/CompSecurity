// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package android.support.v7.media:
//            MediaSessionStatus

public static final class _cls00
{

    private final Bundle mBundle;

    public MediaSessionStatus build()
    {
        return new MediaSessionStatus(mBundle, null);
    }

    public mBundle setExtras(Bundle bundle)
    {
        mBundle.putBundle("extras", bundle);
        return this;
    }

    public mBundle setQueuePaused(boolean flag)
    {
        mBundle.putBoolean("queuePaused", flag);
        return this;
    }

    public mBundle setSessionState(int i)
    {
        mBundle.putInt("sessionState", i);
        return this;
    }

    public mBundle setTimestamp(long l)
    {
        mBundle.putLong("timestamp", l);
        return this;
    }

    public _cls9(int i)
    {
        mBundle = new Bundle();
        setTimestamp(SystemClock.elapsedRealtime());
        setSessionState(i);
    }

    public setSessionState(MediaSessionStatus mediasessionstatus)
    {
        if (mediasessionstatus == null)
        {
            throw new IllegalArgumentException("status must not be null");
        } else
        {
            mBundle = new Bundle(MediaSessionStatus.access$000(mediasessionstatus));
            return;
        }
    }
}
