// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata, SnapshotMetadataEntity

public final class SnapshotMetadataRef extends DataBufferRef
    implements SnapshotMetadata
{

    private final Game mGame;
    private final Player mOwner;

    public SnapshotMetadataRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        mGame = new GameRef(dataholder, i);
        mOwner = new PlayerRef(dataholder, i);
    }

    private SnapshotMetadata freeze()
    {
        return new SnapshotMetadataEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return SnapshotMetadataEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final float getCoverImageAspectRatio()
    {
        float f = getFloat("cover_icon_image_height");
        float f1 = getFloat("cover_icon_image_width");
        if (f == 0.0F)
        {
            return 0.0F;
        } else
        {
            return f1 / f;
        }
    }

    public final Uri getCoverImageUri()
    {
        return parseUri("cover_icon_image_uri");
    }

    public final String getCoverImageUrl()
    {
        return getString("cover_icon_image_url");
    }

    public final String getDescription()
    {
        return getString("description");
    }

    public final String getDeviceName()
    {
        return getString("device_name");
    }

    public final Game getGame()
    {
        return mGame;
    }

    public final long getLastModifiedTimestamp()
    {
        return getLong("last_modified_timestamp");
    }

    public final Player getOwner()
    {
        return mOwner;
    }

    public final long getPlayedTime()
    {
        return getLong("duration");
    }

    public final long getProgressValue()
    {
        return getLong("progress_value");
    }

    public final String getSnapshotId()
    {
        return getString("external_snapshot_id");
    }

    public final String getTitle()
    {
        return getString("title");
    }

    public final String getUniqueName()
    {
        return getString("unique_name");
    }

    public final boolean hasChangePending()
    {
        return getInteger("pending_change_count") > 0;
    }

    public final int hashCode()
    {
        return SnapshotMetadataEntity.hashCode(this);
    }

    public final String toString()
    {
        return SnapshotMetadataEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((SnapshotMetadataEntity)freeze()).writeToParcel(parcel, i);
    }
}
