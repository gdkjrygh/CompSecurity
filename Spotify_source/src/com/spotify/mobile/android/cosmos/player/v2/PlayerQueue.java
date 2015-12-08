// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            PlayerTrack

public class PlayerQueue
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final PlayerQueue createFromParcel(Parcel parcel)
        {
            return new PlayerQueue(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PlayerQueue[] newArray(int i)
        {
            return new PlayerQueue[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final PlayerTrack mNextTracks[];
    private final PlayerTrack mPrevTracks[];
    private final String mRevision;
    private final PlayerTrack mTrack;

    protected PlayerQueue(Parcel parcel)
    {
        mRevision = parcel.readString();
        mTrack = (PlayerTrack)parcel.readParcelable(com/spotify/mobile/android/cosmos/player/v2/PlayerTrack.getClassLoader());
        mNextTracks = (PlayerTrack[])parcel.createTypedArray(PlayerTrack.CREATOR);
        mPrevTracks = (PlayerTrack[])parcel.createTypedArray(PlayerTrack.CREATOR);
    }

    public PlayerQueue(String s, PlayerTrack playertrack, PlayerTrack aplayertrack[], PlayerTrack aplayertrack1[])
    {
        mRevision = s;
        mTrack = playertrack;
        mNextTracks = aplayertrack;
        mPrevTracks = aplayertrack1;
    }

    public int describeContents()
    {
        return 0;
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
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (getClass() != obj.getClass())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (PlayerQueue)obj;
        flag = flag1;
        if (mRevision.equals(((PlayerQueue) (obj)).mRevision))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (mTrack == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!mTrack.equals(((PlayerQueue) (obj)).mTrack))
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (Arrays.equals(mNextTracks, ((PlayerQueue) (obj)).mNextTracks))
        {
            return Arrays.equals(mPrevTracks, ((PlayerQueue) (obj)).mPrevTracks);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (((PlayerQueue) (obj)).mTrack != null)
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        return (Arrays.hashCode(new Object[] {
            mRevision, mTrack
        }) * 31 + Arrays.hashCode(mNextTracks)) * 31 + Arrays.hashCode(mPrevTracks);
    }

    public PlayerTrack[] nextTracks()
    {
        return mNextTracks;
    }

    public PlayerTrack[] prevTracks()
    {
        return mPrevTracks;
    }

    public String revision()
    {
        return mRevision;
    }

    public PlayerTrack track()
    {
        return mTrack;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mRevision);
        parcel.writeParcelable(mTrack, 0);
        parcel.writeTypedArray(mNextTracks, 0);
        parcel.writeTypedArray(mPrevTracks, 0);
    }

}
