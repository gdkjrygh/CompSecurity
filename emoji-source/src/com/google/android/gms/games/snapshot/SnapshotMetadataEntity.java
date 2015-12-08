// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.ik;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata, SnapshotMetadataEntityCreator

public final class SnapshotMetadataEntity
    implements SafeParcelable, SnapshotMetadata
{

    public static final SnapshotMetadataEntityCreator CREATOR = new SnapshotMetadataEntityCreator();
    private final String HY;
    private final String Mp;
    private final String NK;
    private final GameEntity Rt;
    private final Uri Uh;
    private final PlayerEntity Ul;
    private final String Um;
    private final long Un;
    private final long Uo;
    private final float Up;
    private final String Uq;
    private final int xM;

    SnapshotMetadataEntity(int i, GameEntity gameentity, PlayerEntity playerentity, String s, Uri uri, String s1, String s2, 
            String s3, long l, long l1, float f, String s4)
    {
        xM = i;
        Rt = gameentity;
        Ul = playerentity;
        NK = s;
        Uh = uri;
        Um = s1;
        Up = f;
        HY = s2;
        Mp = s3;
        Un = l;
        Uo = l1;
        Uq = s4;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotmetadata)
    {
        xM = 3;
        Rt = new GameEntity(snapshotmetadata.getGame());
        Ul = new PlayerEntity(snapshotmetadata.getOwner());
        NK = snapshotmetadata.getSnapshotId();
        Uh = snapshotmetadata.getCoverImageUri();
        Um = snapshotmetadata.getCoverImageUrl();
        Up = snapshotmetadata.getCoverImageAspectRatio();
        HY = snapshotmetadata.getTitle();
        Mp = snapshotmetadata.getDescription();
        Un = snapshotmetadata.getLastModifiedTimestamp();
        Uo = snapshotmetadata.getPlayedTime();
        Uq = snapshotmetadata.getUniqueName();
    }

    static int a(SnapshotMetadata snapshotmetadata)
    {
        return hk.hashCode(new Object[] {
            snapshotmetadata.getGame(), snapshotmetadata.getOwner(), snapshotmetadata.getSnapshotId(), snapshotmetadata.getCoverImageUri(), Float.valueOf(snapshotmetadata.getCoverImageAspectRatio()), snapshotmetadata.getTitle(), snapshotmetadata.getDescription(), Long.valueOf(snapshotmetadata.getLastModifiedTimestamp()), Long.valueOf(snapshotmetadata.getPlayedTime()), snapshotmetadata.getUniqueName()
        });
    }

    static boolean a(SnapshotMetadata snapshotmetadata, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof SnapshotMetadata) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (snapshotmetadata == obj) goto _L4; else goto _L3
_L3:
        obj = (SnapshotMetadata)obj;
        if (!hk.equal(((SnapshotMetadata) (obj)).getGame(), snapshotmetadata.getGame()) || !hk.equal(((SnapshotMetadata) (obj)).getOwner(), snapshotmetadata.getOwner()) || !hk.equal(((SnapshotMetadata) (obj)).getSnapshotId(), snapshotmetadata.getSnapshotId()) || !hk.equal(((SnapshotMetadata) (obj)).getCoverImageUri(), snapshotmetadata.getCoverImageUri()) || !hk.equal(Float.valueOf(((SnapshotMetadata) (obj)).getCoverImageAspectRatio()), Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())) || !hk.equal(((SnapshotMetadata) (obj)).getTitle(), snapshotmetadata.getTitle()) || !hk.equal(((SnapshotMetadata) (obj)).getDescription(), snapshotmetadata.getDescription()) || !hk.equal(Long.valueOf(((SnapshotMetadata) (obj)).getLastModifiedTimestamp()), Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())) || !hk.equal(Long.valueOf(((SnapshotMetadata) (obj)).getPlayedTime()), Long.valueOf(snapshotmetadata.getPlayedTime())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(((SnapshotMetadata) (obj)).getUniqueName(), snapshotmetadata.getUniqueName())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(SnapshotMetadata snapshotmetadata)
    {
        return hk.e(snapshotmetadata).a("Game", snapshotmetadata.getGame()).a("Owner", snapshotmetadata.getOwner()).a("SnapshotId", snapshotmetadata.getSnapshotId()).a("CoverImageUri", snapshotmetadata.getCoverImageUri()).a("CoverImageUrl", snapshotmetadata.getCoverImageUrl()).a("CoverImageAspectRatio", Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())).a("Description", snapshotmetadata.getDescription()).a("LastModifiedTimestamp", Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())).a("PlayedTime", Long.valueOf(snapshotmetadata.getPlayedTime())).a("UniqueName", snapshotmetadata.getUniqueName()).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public SnapshotMetadata freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public float getCoverImageAspectRatio()
    {
        return Up;
    }

    public Uri getCoverImageUri()
    {
        return Uh;
    }

    public String getCoverImageUrl()
    {
        return Um;
    }

    public String getDescription()
    {
        return Mp;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        ik.b(Mp, chararraybuffer);
    }

    public Game getGame()
    {
        return Rt;
    }

    public long getLastModifiedTimestamp()
    {
        return Un;
    }

    public Player getOwner()
    {
        return Ul;
    }

    public long getPlayedTime()
    {
        return Uo;
    }

    public String getSnapshotId()
    {
        return NK;
    }

    public String getTitle()
    {
        return HY;
    }

    public String getUniqueName()
    {
        return Uq;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SnapshotMetadataEntityCreator.a(this, parcel, i);
    }

}
