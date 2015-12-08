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
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.le;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata, SnapshotMetadataEntityCreator

public final class SnapshotMetadataEntity
    implements SafeParcelable, SnapshotMetadata
{

    public static final SnapshotMetadataEntityCreator CREATOR = new SnapshotMetadataEntityCreator();
    private final int CK;
    private final String OH;
    private final String UO;
    private final String YB;
    private final GameEntity acs;
    private final Uri afd;
    private final PlayerEntity afg;
    private final String afh;
    private final long afi;
    private final long afj;
    private final float afk;
    private final String afl;
    private final boolean afm;

    SnapshotMetadataEntity(int i, GameEntity gameentity, PlayerEntity playerentity, String s, Uri uri, String s1, String s2, 
            String s3, long l, long l1, float f, String s4, 
            boolean flag)
    {
        CK = i;
        acs = gameentity;
        afg = playerentity;
        YB = s;
        afd = uri;
        afh = s1;
        afk = f;
        OH = s2;
        UO = s3;
        afi = l;
        afj = l1;
        afl = s4;
        afm = flag;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotmetadata)
    {
        CK = 4;
        acs = new GameEntity(snapshotmetadata.getGame());
        afg = new PlayerEntity(snapshotmetadata.getOwner());
        YB = snapshotmetadata.getSnapshotId();
        afd = snapshotmetadata.getCoverImageUri();
        afh = snapshotmetadata.getCoverImageUrl();
        afk = snapshotmetadata.getCoverImageAspectRatio();
        OH = snapshotmetadata.getTitle();
        UO = snapshotmetadata.getDescription();
        afi = snapshotmetadata.getLastModifiedTimestamp();
        afj = snapshotmetadata.getPlayedTime();
        afl = snapshotmetadata.getUniqueName();
        afm = snapshotmetadata.hasChangePending();
    }

    static int a(SnapshotMetadata snapshotmetadata)
    {
        return jv.hashCode(new Object[] {
            snapshotmetadata.getGame(), snapshotmetadata.getOwner(), snapshotmetadata.getSnapshotId(), snapshotmetadata.getCoverImageUri(), Float.valueOf(snapshotmetadata.getCoverImageAspectRatio()), snapshotmetadata.getTitle(), snapshotmetadata.getDescription(), Long.valueOf(snapshotmetadata.getLastModifiedTimestamp()), Long.valueOf(snapshotmetadata.getPlayedTime()), snapshotmetadata.getUniqueName(), 
            Boolean.valueOf(snapshotmetadata.hasChangePending())
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
        if (!jv.equal(((SnapshotMetadata) (obj)).getGame(), snapshotmetadata.getGame()) || !jv.equal(((SnapshotMetadata) (obj)).getOwner(), snapshotmetadata.getOwner()) || !jv.equal(((SnapshotMetadata) (obj)).getSnapshotId(), snapshotmetadata.getSnapshotId()) || !jv.equal(((SnapshotMetadata) (obj)).getCoverImageUri(), snapshotmetadata.getCoverImageUri()) || !jv.equal(Float.valueOf(((SnapshotMetadata) (obj)).getCoverImageAspectRatio()), Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())) || !jv.equal(((SnapshotMetadata) (obj)).getTitle(), snapshotmetadata.getTitle()) || !jv.equal(((SnapshotMetadata) (obj)).getDescription(), snapshotmetadata.getDescription()) || !jv.equal(Long.valueOf(((SnapshotMetadata) (obj)).getLastModifiedTimestamp()), Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())) || !jv.equal(Long.valueOf(((SnapshotMetadata) (obj)).getPlayedTime()), Long.valueOf(snapshotmetadata.getPlayedTime())) || !jv.equal(((SnapshotMetadata) (obj)).getUniqueName(), snapshotmetadata.getUniqueName()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(Boolean.valueOf(((SnapshotMetadata) (obj)).hasChangePending()), Boolean.valueOf(snapshotmetadata.hasChangePending()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(SnapshotMetadata snapshotmetadata)
    {
        return jv.h(snapshotmetadata).a("Game", snapshotmetadata.getGame()).a("Owner", snapshotmetadata.getOwner()).a("SnapshotId", snapshotmetadata.getSnapshotId()).a("CoverImageUri", snapshotmetadata.getCoverImageUri()).a("CoverImageUrl", snapshotmetadata.getCoverImageUrl()).a("CoverImageAspectRatio", Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())).a("Description", snapshotmetadata.getDescription()).a("LastModifiedTimestamp", Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())).a("PlayedTime", Long.valueOf(snapshotmetadata.getPlayedTime())).a("UniqueName", snapshotmetadata.getUniqueName()).a("ChangePending", Boolean.valueOf(snapshotmetadata.hasChangePending())).toString();
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
        return afk;
    }

    public Uri getCoverImageUri()
    {
        return afd;
    }

    public String getCoverImageUrl()
    {
        return afh;
    }

    public String getDescription()
    {
        return UO;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        le.b(UO, chararraybuffer);
    }

    public Game getGame()
    {
        return acs;
    }

    public long getLastModifiedTimestamp()
    {
        return afi;
    }

    public Player getOwner()
    {
        return afg;
    }

    public long getPlayedTime()
    {
        return afj;
    }

    public String getSnapshotId()
    {
        return YB;
    }

    public String getTitle()
    {
        return OH;
    }

    public String getUniqueName()
    {
        return afl;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public boolean hasChangePending()
    {
        return afm;
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
