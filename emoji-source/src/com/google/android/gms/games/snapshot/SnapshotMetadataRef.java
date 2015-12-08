// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata, SnapshotMetadataEntity

public final class SnapshotMetadataRef extends d
    implements SnapshotMetadata
{

    private final Game Ss;
    private final Player Ur;

    public SnapshotMetadataRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        Ss = new GameRef(dataholder, i);
        Ur = new PlayerRef(dataholder, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return SnapshotMetadataEntity.a(this, obj);
    }

    public SnapshotMetadata freeze()
    {
        return new SnapshotMetadataEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public float getCoverImageAspectRatio()
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

    public Uri getCoverImageUri()
    {
        return aw("cover_icon_image_uri");
    }

    public String getCoverImageUrl()
    {
        return getString("cover_icon_image_url");
    }

    public String getDescription()
    {
        return getString("description");
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        a("description", chararraybuffer);
    }

    public Game getGame()
    {
        return Ss;
    }

    public long getLastModifiedTimestamp()
    {
        return getLong("last_modified_timestamp");
    }

    public Player getOwner()
    {
        return Ur;
    }

    public long getPlayedTime()
    {
        return getLong("duration");
    }

    public String getSnapshotId()
    {
        return getString("external_snapshot_id");
    }

    public String getTitle()
    {
        return getString("title");
    }

    public String getUniqueName()
    {
        return getString("unique_name");
    }

    public int hashCode()
    {
        return SnapshotMetadataEntity.a(this);
    }

    public String toString()
    {
        return SnapshotMetadataEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((SnapshotMetadataEntity)freeze()).writeToParcel(parcel, i);
    }
}
