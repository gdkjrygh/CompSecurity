// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata, SnapshotMetadataEntityCreator

public final class SnapshotMetadataEntity
    implements SafeParcelable, SnapshotMetadata
{

    public static final android.os.Parcelable.Creator CREATOR = new SnapshotMetadataEntityCreator();
    final boolean mChangePending;
    final float mCoverImageAspectRatio;
    final Uri mCoverImageUri;
    final String mCoverImageUrl;
    final String mDescription;
    final String mDeviceName;
    final GameEntity mGame;
    final long mLastModifiedTimestamp;
    final PlayerEntity mOwner;
    final long mPlayedTime;
    final long mProgressValue;
    final String mSnapshotId;
    final String mTitle;
    final String mUniqueName;
    final int mVersionCode;

    SnapshotMetadataEntity(int i, GameEntity gameentity, PlayerEntity playerentity, String s, Uri uri, String s1, String s2, 
            String s3, long l, long l1, float f, String s4, 
            boolean flag, long l2, String s5)
    {
        mVersionCode = i;
        mGame = gameentity;
        mOwner = playerentity;
        mSnapshotId = s;
        mCoverImageUri = uri;
        mCoverImageUrl = s1;
        mCoverImageAspectRatio = f;
        mTitle = s2;
        mDescription = s3;
        mLastModifiedTimestamp = l;
        mPlayedTime = l1;
        mUniqueName = s4;
        mChangePending = flag;
        mProgressValue = l2;
        mDeviceName = s5;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotmetadata)
    {
        mVersionCode = 6;
        mGame = new GameEntity(snapshotmetadata.getGame());
        mOwner = new PlayerEntity(snapshotmetadata.getOwner());
        mSnapshotId = snapshotmetadata.getSnapshotId();
        mCoverImageUri = snapshotmetadata.getCoverImageUri();
        mCoverImageUrl = snapshotmetadata.getCoverImageUrl();
        mCoverImageAspectRatio = snapshotmetadata.getCoverImageAspectRatio();
        mTitle = snapshotmetadata.getTitle();
        mDescription = snapshotmetadata.getDescription();
        mLastModifiedTimestamp = snapshotmetadata.getLastModifiedTimestamp();
        mPlayedTime = snapshotmetadata.getPlayedTime();
        mUniqueName = snapshotmetadata.getUniqueName();
        mChangePending = snapshotmetadata.hasChangePending();
        mProgressValue = snapshotmetadata.getProgressValue();
        mDeviceName = snapshotmetadata.getDeviceName();
    }

    static boolean equals(SnapshotMetadata snapshotmetadata, Object obj)
    {
        if (obj instanceof SnapshotMetadata)
        {
            if (snapshotmetadata == obj)
            {
                return true;
            }
            obj = (SnapshotMetadata)obj;
            if (Objects.equal(((SnapshotMetadata) (obj)).getGame(), snapshotmetadata.getGame()) && Objects.equal(((SnapshotMetadata) (obj)).getOwner(), snapshotmetadata.getOwner()) && Objects.equal(((SnapshotMetadata) (obj)).getSnapshotId(), snapshotmetadata.getSnapshotId()) && Objects.equal(((SnapshotMetadata) (obj)).getCoverImageUri(), snapshotmetadata.getCoverImageUri()) && Objects.equal(Float.valueOf(((SnapshotMetadata) (obj)).getCoverImageAspectRatio()), Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())) && Objects.equal(((SnapshotMetadata) (obj)).getTitle(), snapshotmetadata.getTitle()) && Objects.equal(((SnapshotMetadata) (obj)).getDescription(), snapshotmetadata.getDescription()) && Objects.equal(Long.valueOf(((SnapshotMetadata) (obj)).getLastModifiedTimestamp()), Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())) && Objects.equal(Long.valueOf(((SnapshotMetadata) (obj)).getPlayedTime()), Long.valueOf(snapshotmetadata.getPlayedTime())) && Objects.equal(((SnapshotMetadata) (obj)).getUniqueName(), snapshotmetadata.getUniqueName()) && Objects.equal(Boolean.valueOf(((SnapshotMetadata) (obj)).hasChangePending()), Boolean.valueOf(snapshotmetadata.hasChangePending())) && Objects.equal(Long.valueOf(((SnapshotMetadata) (obj)).getProgressValue()), Long.valueOf(snapshotmetadata.getProgressValue())) && Objects.equal(((SnapshotMetadata) (obj)).getDeviceName(), snapshotmetadata.getDeviceName()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(SnapshotMetadata snapshotmetadata)
    {
        return Arrays.hashCode(new Object[] {
            snapshotmetadata.getGame(), snapshotmetadata.getOwner(), snapshotmetadata.getSnapshotId(), snapshotmetadata.getCoverImageUri(), Float.valueOf(snapshotmetadata.getCoverImageAspectRatio()), snapshotmetadata.getTitle(), snapshotmetadata.getDescription(), Long.valueOf(snapshotmetadata.getLastModifiedTimestamp()), Long.valueOf(snapshotmetadata.getPlayedTime()), snapshotmetadata.getUniqueName(), 
            Boolean.valueOf(snapshotmetadata.hasChangePending()), Long.valueOf(snapshotmetadata.getProgressValue()), snapshotmetadata.getDeviceName()
        });
    }

    static String toString(SnapshotMetadata snapshotmetadata)
    {
        return Objects.toStringHelper(snapshotmetadata).add("Game", snapshotmetadata.getGame()).add("Owner", snapshotmetadata.getOwner()).add("SnapshotId", snapshotmetadata.getSnapshotId()).add("CoverImageUri", snapshotmetadata.getCoverImageUri()).add("CoverImageUrl", snapshotmetadata.getCoverImageUrl()).add("CoverImageAspectRatio", Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())).add("Description", snapshotmetadata.getDescription()).add("LastModifiedTimestamp", Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())).add("PlayedTime", Long.valueOf(snapshotmetadata.getPlayedTime())).add("UniqueName", snapshotmetadata.getUniqueName()).add("ChangePending", Boolean.valueOf(snapshotmetadata.hasChangePending())).add("ProgressValue", Long.valueOf(snapshotmetadata.getProgressValue())).add("DeviceName", snapshotmetadata.getDeviceName()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((SnapshotMetadata) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final float getCoverImageAspectRatio()
    {
        return mCoverImageAspectRatio;
    }

    public final Uri getCoverImageUri()
    {
        return mCoverImageUri;
    }

    public final String getCoverImageUrl()
    {
        return mCoverImageUrl;
    }

    public final String getDescription()
    {
        return mDescription;
    }

    public final String getDeviceName()
    {
        return mDeviceName;
    }

    public final Game getGame()
    {
        return mGame;
    }

    public final long getLastModifiedTimestamp()
    {
        return mLastModifiedTimestamp;
    }

    public final Player getOwner()
    {
        return mOwner;
    }

    public final long getPlayedTime()
    {
        return mPlayedTime;
    }

    public final long getProgressValue()
    {
        return mProgressValue;
    }

    public final String getSnapshotId()
    {
        return mSnapshotId;
    }

    public final String getTitle()
    {
        return mTitle;
    }

    public final String getUniqueName()
    {
        return mUniqueName;
    }

    public final boolean hasChangePending()
    {
        return mChangePending;
    }

    public final int hashCode()
    {
        return hashCode(((SnapshotMetadata) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((SnapshotMetadata) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        SnapshotMetadataEntityCreator.writeToParcel(this, parcel, i);
    }

}
