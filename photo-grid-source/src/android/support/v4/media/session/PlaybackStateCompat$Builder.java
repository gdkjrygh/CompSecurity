// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            PlaybackStateCompat

public final class _cls200
{

    private long mActions;
    private long mActiveItemId;
    private long mBufferedPosition;
    private final List mCustomActions;
    private CharSequence mErrorMessage;
    private Bundle mExtras;
    private long mPosition;
    private float mRate;
    private int mState;
    private long mUpdateTime;

    public final tion addCustomAction(tion tion)
    {
        if (tion == null)
        {
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
        } else
        {
            mCustomActions.add(tion);
            return this;
        }
    }

    public final mCustomActions addCustomAction(String s, String s1, int i)
    {
        return addCustomAction(new tion(s, s1, i, null, null));
    }

    public final PlaybackStateCompat build()
    {
        return new PlaybackStateCompat(mState, mPosition, mBufferedPosition, mRate, mActions, mErrorMessage, mUpdateTime, mCustomActions, mActiveItemId, mExtras, null);
    }

    public final mExtras setActions(long l)
    {
        mActions = l;
        return this;
    }

    public final mActions setActiveQueueItemId(long l)
    {
        mActiveItemId = l;
        return this;
    }

    public final mActiveItemId setBufferedPosition(long l)
    {
        mBufferedPosition = l;
        return this;
    }

    public final mBufferedPosition setErrorMessage(CharSequence charsequence)
    {
        mErrorMessage = charsequence;
        return this;
    }

    public final mErrorMessage setExtras(Bundle bundle)
    {
        mExtras = bundle;
        return this;
    }

    public final mExtras setState(int i, long l, float f)
    {
        return setState(i, l, f, SystemClock.elapsedRealtime());
    }

    public final setState setState(int i, long l, float f, long l1)
    {
        mState = i;
        mPosition = l;
        mUpdateTime = l1;
        mRate = f;
        return this;
    }

    public tion()
    {
        mCustomActions = new ArrayList();
        mActiveItemId = -1L;
    }

    public mActiveItemId(PlaybackStateCompat playbackstatecompat)
    {
        mCustomActions = new ArrayList();
        mActiveItemId = -1L;
        mState = PlaybackStateCompat.access$300(playbackstatecompat);
        mPosition = PlaybackStateCompat.access$400(playbackstatecompat);
        mRate = PlaybackStateCompat.access$500(playbackstatecompat);
        mUpdateTime = PlaybackStateCompat.access$600(playbackstatecompat);
        mBufferedPosition = PlaybackStateCompat.access$700(playbackstatecompat);
        mActions = PlaybackStateCompat.access$800(playbackstatecompat);
        mErrorMessage = PlaybackStateCompat.access$900(playbackstatecompat);
        if (PlaybackStateCompat.access$1000(playbackstatecompat) != null)
        {
            mCustomActions.addAll(PlaybackStateCompat.access$1000(playbackstatecompat));
        }
        mActiveItemId = PlaybackStateCompat.access$1100(playbackstatecompat);
        mExtras = PlaybackStateCompat.access$1200(playbackstatecompat);
    }
}
