// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;


public final class mCurrentVolume
{

    public static final int PLAYBACK_TYPE_LOCAL = 1;
    public static final int PLAYBACK_TYPE_REMOTE = 2;
    private final int mAudioStream;
    private final int mCurrentVolume;
    private final int mMaxVolume;
    private final int mPlaybackType;
    private final int mVolumeControl;

    public final int getAudioStream()
    {
        return mAudioStream;
    }

    public final int getCurrentVolume()
    {
        return mCurrentVolume;
    }

    public final int getMaxVolume()
    {
        return mMaxVolume;
    }

    public final int getPlaybackType()
    {
        return mPlaybackType;
    }

    public final int getVolumeControl()
    {
        return mVolumeControl;
    }

    I(int i, int j, int k, int l, int i1)
    {
        mPlaybackType = i;
        mAudioStream = j;
        mVolumeControl = k;
        mMaxVolume = l;
        mCurrentVolume = i1;
    }
}
