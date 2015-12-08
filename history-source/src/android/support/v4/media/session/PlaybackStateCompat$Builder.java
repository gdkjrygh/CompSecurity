// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.SystemClock;

// Referenced classes of package android.support.v4.media.session:
//            PlaybackStateCompat

public static final class _cls00
{

    private long mActions;
    private long mBufferedPosition;
    private CharSequence mErrorMessage;
    private long mPosition;
    private float mRate;
    private int mState;
    private long mUpdateTime;

    public PlaybackStateCompat build()
    {
        return new PlaybackStateCompat(mState, mPosition, mBufferedPosition, mRate, mActions, mErrorMessage, mUpdateTime, null);
    }

    public void setActions(long l)
    {
        mActions = l;
    }

    public void setBufferedPosition(long l)
    {
        mBufferedPosition = l;
    }

    public void setErrorMessage(CharSequence charsequence)
    {
        mErrorMessage = charsequence;
    }

    public void setState(int i, long l, float f)
    {
        mState = i;
        mPosition = l;
        mRate = f;
        mUpdateTime = SystemClock.elapsedRealtime();
    }

    public ()
    {
    }

    public (PlaybackStateCompat playbackstatecompat)
    {
        mState = PlaybackStateCompat.access$100(playbackstatecompat);
        mPosition = PlaybackStateCompat.access$200(playbackstatecompat);
        mRate = PlaybackStateCompat.access$300(playbackstatecompat);
        mUpdateTime = PlaybackStateCompat.access$400(playbackstatecompat);
        mBufferedPosition = PlaybackStateCompat.access$500(playbackstatecompat);
        mActions = PlaybackStateCompat.access$600(playbackstatecompat);
        mErrorMessage = PlaybackStateCompat.access$700(playbackstatecompat);
    }
}
