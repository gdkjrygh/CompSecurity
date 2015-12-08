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
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.il;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata, SnapshotMetadataEntityCreator

public final class SnapshotMetadataEntity
    implements SafeParcelable, SnapshotMetadata
{

    public static final SnapshotMetadataEntityCreator CREATOR = new SnapshotMetadataEntityCreator();
    private final String HV;
    private final String Mm;
    private final String NH;
    private final GameEntity Rq;
    private final Uri Ue;
    private final PlayerEntity Ui;
    private final String Uj;
    private final long Uk;
    private final long Ul;
    private final float Um;
    private final String Un;
    private final int xJ;

    SnapshotMetadataEntity(int i, GameEntity gameentity, PlayerEntity playerentity, String s, Uri uri, String s1, String s2, 
            String s3, long l, long l1, float f, String s4)
    {
        xJ = i;
        Rq = gameentity;
        Ui = playerentity;
        NH = s;
        Ue = uri;
        Uj = s1;
        Um = f;
        HV = s2;
        Mm = s3;
        Uk = l;
        Ul = l1;
        Un = s4;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotmetadata)
    {
        xJ = 3;
        Rq = new GameEntity(snapshotmetadata.getGame());
        Ui = new PlayerEntity(snapshotmetadata.getOwner());
        NH = snapshotmetadata.getSnapshotId();
        Ue = snapshotmetadata.getCoverImageUri();
        Uj = snapshotmetadata.getCoverImageUrl();
        Um = snapshotmetadata.getCoverImageAspectRatio();
        HV = snapshotmetadata.getTitle();
        Mm = snapshotmetadata.getDescription();
        Uk = snapshotmetadata.getLastModifiedTimestamp();
        Ul = snapshotmetadata.getPlayedTime();
        Un = snapshotmetadata.getUniqueName();
    }

    static int a(SnapshotMetadata snapshotmetadata)
    {
        return hl.hashCode(new Object[] {
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
        if (!hl.equal(((SnapshotMetadata) (obj)).getGame(), snapshotmetadata.getGame()) || !hl.equal(((SnapshotMetadata) (obj)).getOwner(), snapshotmetadata.getOwner()) || !hl.equal(((SnapshotMetadata) (obj)).getSnapshotId(), snapshotmetadata.getSnapshotId()) || !hl.equal(((SnapshotMetadata) (obj)).getCoverImageUri(), snapshotmetadata.getCoverImageUri()) || !hl.equal(Float.valueOf(((SnapshotMetadata) (obj)).getCoverImageAspectRatio()), Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())) || !hl.equal(((SnapshotMetadata) (obj)).getTitle(), snapshotmetadata.getTitle()) || !hl.equal(((SnapshotMetadata) (obj)).getDescription(), snapshotmetadata.getDescription()) || !hl.equal(Long.valueOf(((SnapshotMetadata) (obj)).getLastModifiedTimestamp()), Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())) || !hl.equal(Long.valueOf(((SnapshotMetadata) (obj)).getPlayedTime()), Long.valueOf(snapshotmetadata.getPlayedTime())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(((SnapshotMetadata) (obj)).getUniqueName(), snapshotmetadata.getUniqueName())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(SnapshotMetadata snapshotmetadata)
    {
        return hl.e(snapshotmetadata).a("Game", snapshotmetadata.getGame()).a("Owner", snapshotmetadata.getOwner()).a("SnapshotId", snapshotmetadata.getSnapshotId()).a("CoverImageUri", snapshotmetadata.getCoverImageUri()).a("CoverImageUrl", snapshotmetadata.getCoverImageUrl()).a("CoverImageAspectRatio", Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())).a("Description", snapshotmetadata.getDescription()).a("LastModifiedTimestamp", Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())).a("PlayedTime", Long.valueOf(snapshotmetadata.getPlayedTime())).a("UniqueName", snapshotmetadata.getUniqueName()).toString();
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
        return Um;
    }

    public Uri getCoverImageUri()
    {
        return Ue;
    }

    public String getCoverImageUrl()
    {
        return Uj;
    }

    public String getDescription()
    {
        return Mm;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        il.b(Mm, chararraybuffer);
    }

    public Game getGame()
    {
        return Rq;
    }

    public long getLastModifiedTimestamp()
    {
        return Uk;
    }

    public Player getOwner()
    {
        return Ui;
    }

    public long getPlayedTime()
    {
        return Ul;
    }

    public String getSnapshotId()
    {
        return NH;
    }

    public String getTitle()
    {
        return HV;
    }

    public String getUniqueName()
    {
        return Un;
    }

    public int getVersionCode()
    {
        return xJ;
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
