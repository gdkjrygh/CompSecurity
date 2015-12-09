// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import gen;
import java.util.Collections;
import java.util.Set;

public class PlayerRestrictions
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final PlayerRestrictions createFromParcel(Parcel parcel)
        {
            return new PlayerRestrictions(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PlayerRestrictions[] newArray(int i)
        {
            return new PlayerRestrictions[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final Set mDisallowPausingReasons;
    private final Set mDisallowPeekingNextReasons;
    private final Set mDisallowPeekingPrevReasons;
    private final Set mDisallowPlayingReasons;
    private final Set mDisallowRemoteControlReasons;
    private final Set mDisallowResumingReasons;
    private final Set mDisallowSeekingReasons;
    private final Set mDisallowSkippingNextReasons;
    private final Set mDisallowSkippingPrevReasons;
    private final Set mDisallowStoppingReasons;
    private final Set mDisallowTogglingRepeatContextReasons;
    private final Set mDisallowTogglingRepeatTrackReasons;
    private final Set mDisallowTogglingShuffleReasons;
    private final Set mDisallowTransferringPlaybackReasons;

    protected PlayerRestrictions(Parcel parcel)
    {
        mDisallowPlayingReasons = gen.b(parcel);
        mDisallowStoppingReasons = gen.b(parcel);
        mDisallowPeekingPrevReasons = gen.b(parcel);
        mDisallowPeekingNextReasons = gen.b(parcel);
        mDisallowSkippingPrevReasons = gen.b(parcel);
        mDisallowSkippingNextReasons = gen.b(parcel);
        mDisallowPausingReasons = gen.b(parcel);
        mDisallowResumingReasons = gen.b(parcel);
        mDisallowTogglingRepeatContextReasons = gen.b(parcel);
        mDisallowTogglingRepeatTrackReasons = gen.b(parcel);
        mDisallowTogglingShuffleReasons = gen.b(parcel);
        mDisallowSeekingReasons = gen.b(parcel);
        mDisallowTransferringPlaybackReasons = gen.b(parcel);
        mDisallowRemoteControlReasons = gen.b(parcel);
    }

    public PlayerRestrictions(Set set, Set set1, Set set2, Set set3, Set set4, Set set5, Set set6, 
            Set set7, Set set8, Set set9, Set set10, Set set11, Set set12, Set set13)
    {
        mDisallowPlayingReasons = Collections.unmodifiableSet(set);
        mDisallowStoppingReasons = Collections.unmodifiableSet(set1);
        mDisallowPeekingPrevReasons = Collections.unmodifiableSet(set2);
        mDisallowPeekingNextReasons = Collections.unmodifiableSet(set3);
        mDisallowSkippingPrevReasons = Collections.unmodifiableSet(set4);
        mDisallowSkippingNextReasons = Collections.unmodifiableSet(set5);
        mDisallowPausingReasons = Collections.unmodifiableSet(set6);
        mDisallowResumingReasons = Collections.unmodifiableSet(set7);
        mDisallowTogglingRepeatContextReasons = Collections.unmodifiableSet(set8);
        mDisallowTogglingRepeatTrackReasons = Collections.unmodifiableSet(set9);
        mDisallowTogglingShuffleReasons = Collections.unmodifiableSet(set10);
        mDisallowSeekingReasons = Collections.unmodifiableSet(set11);
        mDisallowTransferringPlaybackReasons = Collections.unmodifiableSet(set12);
        mDisallowRemoteControlReasons = Collections.unmodifiableSet(set13);
    }

    public static PlayerRestrictions empty()
    {
        return new PlayerRestrictions(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
    }

    public int describeContents()
    {
        return 0;
    }

    public Set disallowPausingReasons()
    {
        return mDisallowPausingReasons;
    }

    public Set disallowPeekingNextReasons()
    {
        return mDisallowPeekingNextReasons;
    }

    public Set disallowPeekingPrevReasons()
    {
        return mDisallowPeekingPrevReasons;
    }

    public Set disallowPlayingReasons()
    {
        return mDisallowPlayingReasons;
    }

    public Set disallowRemoteControlReasons()
    {
        return mDisallowRemoteControlReasons;
    }

    public Set disallowResumingReasons()
    {
        return mDisallowResumingReasons;
    }

    public Set disallowSeekingReasons()
    {
        return mDisallowSeekingReasons;
    }

    public Set disallowSkippingNextReasons()
    {
        return mDisallowSkippingNextReasons;
    }

    public Set disallowSkippingPrevReasons()
    {
        return mDisallowSkippingPrevReasons;
    }

    public Set disallowStoppingReasons()
    {
        return mDisallowStoppingReasons;
    }

    public Set disallowTogglingRepeatContextReasons()
    {
        return mDisallowTogglingRepeatContextReasons;
    }

    public Set disallowTogglingRepeatTrackReasons()
    {
        return mDisallowTogglingRepeatTrackReasons;
    }

    public Set disallowTogglingShuffleReasons()
    {
        return mDisallowTogglingShuffleReasons;
    }

    public Set disallowTransferringPlaybackReasons()
    {
        return mDisallowTransferringPlaybackReasons;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PlayerRestrictions)obj;
            if (!mDisallowPausingReasons.equals(((PlayerRestrictions) (obj)).mDisallowPausingReasons))
            {
                return false;
            }
            if (!mDisallowPeekingNextReasons.equals(((PlayerRestrictions) (obj)).mDisallowPeekingNextReasons))
            {
                return false;
            }
            if (!mDisallowPeekingPrevReasons.equals(((PlayerRestrictions) (obj)).mDisallowPeekingPrevReasons))
            {
                return false;
            }
            if (!mDisallowPlayingReasons.equals(((PlayerRestrictions) (obj)).mDisallowPlayingReasons))
            {
                return false;
            }
            if (!mDisallowResumingReasons.equals(((PlayerRestrictions) (obj)).mDisallowResumingReasons))
            {
                return false;
            }
            if (!mDisallowSeekingReasons.equals(((PlayerRestrictions) (obj)).mDisallowSeekingReasons))
            {
                return false;
            }
            if (!mDisallowSkippingNextReasons.equals(((PlayerRestrictions) (obj)).mDisallowSkippingNextReasons))
            {
                return false;
            }
            if (!mDisallowSkippingPrevReasons.equals(((PlayerRestrictions) (obj)).mDisallowSkippingPrevReasons))
            {
                return false;
            }
            if (!mDisallowStoppingReasons.equals(((PlayerRestrictions) (obj)).mDisallowStoppingReasons))
            {
                return false;
            }
            if (!mDisallowTogglingRepeatContextReasons.equals(((PlayerRestrictions) (obj)).mDisallowTogglingRepeatContextReasons))
            {
                return false;
            }
            if (!mDisallowTogglingRepeatTrackReasons.equals(((PlayerRestrictions) (obj)).mDisallowTogglingRepeatTrackReasons))
            {
                return false;
            }
            if (!mDisallowTogglingShuffleReasons.equals(((PlayerRestrictions) (obj)).mDisallowTogglingShuffleReasons))
            {
                return false;
            }
            if (!mDisallowTransferringPlaybackReasons.equals(((PlayerRestrictions) (obj)).mDisallowTransferringPlaybackReasons))
            {
                return false;
            }
            if (!mDisallowRemoteControlReasons.equals(((PlayerRestrictions) (obj)).mDisallowRemoteControlReasons))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((((((((((((mDisallowPlayingReasons.hashCode() * 31 + mDisallowStoppingReasons.hashCode()) * 31 + mDisallowPeekingPrevReasons.hashCode()) * 31 + mDisallowPeekingNextReasons.hashCode()) * 31 + mDisallowSkippingPrevReasons.hashCode()) * 31 + mDisallowSkippingNextReasons.hashCode()) * 31 + mDisallowPausingReasons.hashCode()) * 31 + mDisallowResumingReasons.hashCode()) * 31 + mDisallowTogglingRepeatContextReasons.hashCode()) * 31 + mDisallowTogglingRepeatTrackReasons.hashCode()) * 31 + mDisallowTogglingShuffleReasons.hashCode()) * 31 + mDisallowSeekingReasons.hashCode()) * 31 + mDisallowTransferringPlaybackReasons.hashCode()) * 31 + mDisallowRemoteControlReasons.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gen.a(parcel, mDisallowPlayingReasons);
        gen.a(parcel, mDisallowStoppingReasons);
        gen.a(parcel, mDisallowPeekingPrevReasons);
        gen.a(parcel, mDisallowPeekingNextReasons);
        gen.a(parcel, mDisallowSkippingPrevReasons);
        gen.a(parcel, mDisallowSkippingNextReasons);
        gen.a(parcel, mDisallowPausingReasons);
        gen.a(parcel, mDisallowResumingReasons);
        gen.a(parcel, mDisallowTogglingRepeatContextReasons);
        gen.a(parcel, mDisallowTogglingRepeatTrackReasons);
        gen.a(parcel, mDisallowTogglingShuffleReasons);
        gen.a(parcel, mDisallowSeekingReasons);
        gen.a(parcel, mDisallowTransferringPlaybackReasons);
        gen.a(parcel, mDisallowRemoteControlReasons);
    }

}
