// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import cur;
import gcf;
import gen;
import ggi;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            PlayOrigin, PlayerTrack, PlayerContextIndex, PlayerOptions, 
//            PlayerRestrictions, PlayerSuppressions

public class PlayerState
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final PlayerState createFromParcel(Parcel parcel)
        {
            return new PlayerState(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PlayerState[] newArray(int i)
        {
            return new PlayerState[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final long NO_TIME = -1L;
    private gcf mClock;
    private final ImmutableMap mContextMetadata;
    private final long mDuration;
    private final String mEntityUri;
    private final PlayerTrack mFuture[];
    private final PlayerContextIndex mIndex;
    private final boolean mIsPaused;
    private final boolean mIsPlaying;
    private final PlayerOptions mOptions;
    private final ImmutableMap mPageMetadata;
    private final PlayOrigin mPlayOrigin;
    private final String mPlaybackId;
    private final float mPlaybackSpeed;
    private final long mPositionAsOfTimestamp;
    private final PlayerRestrictions mRestrictions;
    private final PlayerTrack mReverse[];
    private final PlayerSuppressions mSuppressions;
    private final long mTimestamp;
    private final PlayerTrack mTrack;

    public PlayerState(long l, String s, PlayOrigin playorigin, PlayerTrack playertrack, String s1, PlayerContextIndex playercontextindex, 
            float f, long l1, long l2, boolean flag, boolean flag1, 
            PlayerOptions playeroptions, PlayerRestrictions playerrestrictions, PlayerSuppressions playersuppressions, PlayerTrack aplayertrack[], PlayerTrack aplayertrack1[], Map map, Map map1)
    {
        mTimestamp = l;
        mEntityUri = s;
        mPlayOrigin = playorigin;
        mTrack = playertrack;
        mPlaybackId = s1;
        mIndex = playercontextindex;
        mPlaybackSpeed = f;
        mPositionAsOfTimestamp = l1;
        mDuration = l2;
        mIsPlaying = flag;
        mIsPaused = flag1;
        mOptions = playeroptions;
        mRestrictions = playerrestrictions;
        mSuppressions = playersuppressions;
        mFuture = (PlayerTrack[])Arrays.copyOf(aplayertrack, aplayertrack.length);
        mReverse = (PlayerTrack[])Arrays.copyOf(aplayertrack1, aplayertrack1.length);
        mClock = gcf.a;
        s = ImmutableMap.i();
        if (map != null && !map.isEmpty())
        {
            s.a(map);
        }
        mContextMetadata = s.a();
        s = ImmutableMap.i();
        if (map1 != null && !map1.isEmpty())
        {
            s.a(map1);
        }
        mPageMetadata = s.a();
    }

    protected PlayerState(Parcel parcel)
    {
        mTimestamp = parcel.readLong();
        mEntityUri = parcel.readString();
        mPlayOrigin = (PlayOrigin)parcel.readParcelable(com/spotify/mobile/android/cosmos/player/v2/PlayOrigin.getClassLoader());
        mTrack = (PlayerTrack)parcel.readParcelable(com/spotify/mobile/android/cosmos/player/v2/PlayerTrack.getClassLoader());
        mPlaybackId = parcel.readString();
        mIndex = (PlayerContextIndex)parcel.readParcelable(com/spotify/mobile/android/cosmos/player/v2/PlayerContextIndex.getClassLoader());
        mPlaybackSpeed = parcel.readFloat();
        mPositionAsOfTimestamp = parcel.readLong();
        mDuration = parcel.readLong();
        mIsPlaying = gen.a(parcel);
        mIsPaused = gen.a(parcel);
        mOptions = (PlayerOptions)parcel.readParcelable(com/spotify/mobile/android/cosmos/player/v2/PlayerOptions.getClassLoader());
        mRestrictions = (PlayerRestrictions)parcel.readParcelable(com/spotify/mobile/android/cosmos/player/v2/PlayerRestrictions.getClassLoader());
        mSuppressions = (PlayerSuppressions)parcel.readParcelable(com/spotify/mobile/android/cosmos/player/v2/PlayerSuppressions.getClassLoader());
        mFuture = (PlayerTrack[])parcel.createTypedArray(PlayerTrack.CREATOR);
        mReverse = (PlayerTrack[])parcel.createTypedArray(PlayerTrack.CREATOR);
        mContextMetadata = gen.c(parcel);
        mPageMetadata = gen.c(parcel);
        mClock = gcf.a;
    }

    public Map contextMetadata()
    {
        return mContextMetadata;
    }

    public long currentPlaybackPosition()
    {
        return currentPlaybackPosition(gcf.a());
    }

    public long currentPlaybackPosition(long l)
    {
        long l1 = positionAsOfTimestamp();
        if (l1 == -1L)
        {
            return -1L;
        } else
        {
            long l2 = timestamp();
            float f = playbackSpeed();
            return Math.min((long)((float)(l - l2) * f) + l1, duration());
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public long duration()
    {
        return mDuration;
    }

    public String entityUri()
    {
        return mEntityUri;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (getClass() != obj.getClass()) goto _L4; else goto _L5
_L5:
        obj = (PlayerState)obj;
        flag = flag1;
        if (mTimestamp != ((PlayerState) (obj)).mTimestamp) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (Float.compare(((PlayerState) (obj)).mPlaybackSpeed, mPlaybackSpeed) != 0) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (mPositionAsOfTimestamp != ((PlayerState) (obj)).mPositionAsOfTimestamp) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (mDuration != ((PlayerState) (obj)).mDuration) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (mIsPlaying != ((PlayerState) (obj)).mIsPlaying) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (mIsPaused != ((PlayerState) (obj)).mIsPaused) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (!mEntityUri.equals(((PlayerState) (obj)).mEntityUri)) goto _L4; else goto _L12
_L12:
        flag = flag1;
        if (!mPlayOrigin.equals(((PlayerState) (obj)).mPlayOrigin)) goto _L4; else goto _L13
_L13:
        if (mTrack == null) goto _L15; else goto _L14
_L14:
        flag = flag1;
        if (!mTrack.equals(((PlayerState) (obj)).mTrack)) goto _L4; else goto _L16
_L16:
        if (mPlaybackId == null) goto _L18; else goto _L17
_L17:
        flag = flag1;
        if (!mPlaybackId.equals(((PlayerState) (obj)).mPlaybackId)) goto _L4; else goto _L19
_L19:
        if (mIndex == null)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        flag = flag1;
        if (!mIndex.equals(((PlayerState) (obj)).mIndex)) goto _L4; else goto _L20
_L20:
        flag = flag1;
        if (mOptions.equals(((PlayerState) (obj)).mOptions))
        {
            flag = flag1;
            if (mRestrictions.equals(((PlayerState) (obj)).mRestrictions))
            {
                flag = flag1;
                if (mSuppressions.equals(((PlayerState) (obj)).mSuppressions))
                {
                    flag = flag1;
                    if (Arrays.equals(mFuture, ((PlayerState) (obj)).mFuture))
                    {
                        flag = flag1;
                        if (Arrays.equals(mReverse, ((PlayerState) (obj)).mReverse))
                        {
                            flag = flag1;
                            if (ggi.a(mContextMetadata, ((PlayerState) (obj)).mContextMetadata))
                            {
                                return ggi.a(mPageMetadata, ((PlayerState) (obj)).mPageMetadata);
                            }
                        }
                    }
                }
            }
        }
          goto _L4
_L15:
        if (((PlayerState) (obj)).mTrack != null)
        {
            return false;
        }
          goto _L16
_L18:
        if (((PlayerState) (obj)).mPlaybackId != null)
        {
            return false;
        }
          goto _L19
        if (((PlayerState) (obj)).mIndex != null)
        {
            return false;
        }
          goto _L20
    }

    public PlayerTrack[] future()
    {
        return mFuture;
    }

    public int hashCode()
    {
        int k = 1;
        int l = (int)(mTimestamp ^ mTimestamp >>> 32);
        int i1 = Arrays.hashCode(new Object[] {
            mEntityUri, mPlayOrigin, mTrack, mPlaybackId, mIndex, mOptions, mRestrictions, mSuppressions
        });
        int i;
        int j;
        int j1;
        int k1;
        if (mPlaybackSpeed != 0.0F)
        {
            i = Float.floatToIntBits(mPlaybackSpeed);
        } else
        {
            i = 0;
        }
        j1 = (int)(mPositionAsOfTimestamp ^ mPositionAsOfTimestamp >>> 32);
        k1 = (int)(mDuration ^ mDuration >>> 32);
        if (mIsPlaying)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!mIsPaused)
        {
            k = 0;
        }
        return (((((j + (((i + (l * 31 + i1) * 31) * 31 + j1) * 31 + k1) * 31) * 31 + k) * 31 + Arrays.hashCode(mFuture)) * 31 + Arrays.hashCode(mReverse)) * 31 + ggi.a(mContextMetadata)) * 31 + ggi.a(mPageMetadata);
    }

    public PlayerContextIndex index()
    {
        return mIndex;
    }

    public boolean isPaused()
    {
        return mIsPaused;
    }

    public boolean isPlaying()
    {
        return mIsPlaying;
    }

    public PlayerOptions options()
    {
        return mOptions;
    }

    public Map pageMetadata()
    {
        return mPageMetadata;
    }

    public PlayOrigin playOrigin()
    {
        return mPlayOrigin;
    }

    public String playbackId()
    {
        return mPlaybackId;
    }

    public float playbackSpeed()
    {
        return mPlaybackSpeed;
    }

    public long positionAsOfTimestamp()
    {
        return mPositionAsOfTimestamp;
    }

    public PlayerRestrictions restrictions()
    {
        return mRestrictions;
    }

    public PlayerTrack[] reverse()
    {
        return mReverse;
    }

    public void setClock(gcf gcf1)
    {
        mClock = gcf1;
    }

    public PlayerSuppressions suppressions()
    {
        return mSuppressions;
    }

    public long timestamp()
    {
        return mTimestamp;
    }

    public PlayerTrack track()
    {
        return mTrack;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(mTimestamp);
        parcel.writeString(mEntityUri);
        parcel.writeParcelable(mPlayOrigin, 0);
        parcel.writeParcelable(mTrack, 0);
        parcel.writeString(mPlaybackId);
        parcel.writeParcelable(mIndex, 0);
        parcel.writeFloat(mPlaybackSpeed);
        parcel.writeLong(mPositionAsOfTimestamp);
        parcel.writeLong(mDuration);
        gen.a(parcel, mIsPlaying);
        gen.a(parcel, mIsPaused);
        parcel.writeParcelable(mOptions, 0);
        parcel.writeParcelable(mRestrictions, 0);
        parcel.writeParcelable(mSuppressions, 0);
        parcel.writeTypedArray(mFuture, 0);
        parcel.writeTypedArray(mReverse, 0);
        gen.b(parcel, mContextMetadata);
        gen.b(parcel, mPageMetadata);
    }

}
