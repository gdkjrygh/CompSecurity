// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata, SnapshotMetadataEntityCreator

public final class SnapshotMetadataEntity
    implements SafeParcelable, SnapshotMetadata
{

    public static final SnapshotMetadataEntityCreator CREATOR = new SnapshotMetadataEntityCreator();
    private final int BR;
    private final String Nw;
    private final String Tr;
    private final String WI;
    private final GameEntity aay;
    private final Uri adk;
    private final PlayerEntity ado;
    private final String adp;
    private final long adq;
    private final long adr;
    private final float ads;
    private final String adt;

    SnapshotMetadataEntity(int i, GameEntity gameentity, PlayerEntity playerentity, String s, Uri uri, String s1, String s2, 
            String s3, long l, long l1, float f, String s4)
    {
        BR = i;
        aay = gameentity;
        ado = playerentity;
        WI = s;
        adk = uri;
        adp = s1;
        ads = f;
        Nw = s2;
        Tr = s3;
        adq = l;
        adr = l1;
        adt = s4;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotmetadata)
    {
        BR = 3;
        aay = new GameEntity(snapshotmetadata.getGame());
        ado = new PlayerEntity(snapshotmetadata.getOwner());
        WI = snapshotmetadata.getSnapshotId();
        adk = snapshotmetadata.getCoverImageUri();
        adp = snapshotmetadata.getCoverImageUrl();
        ads = snapshotmetadata.getCoverImageAspectRatio();
        Nw = snapshotmetadata.getTitle();
        Tr = snapshotmetadata.getDescription();
        adq = snapshotmetadata.getLastModifiedTimestamp();
        adr = snapshotmetadata.getPlayedTime();
        adt = snapshotmetadata.getUniqueName();
    }

    static int a(SnapshotMetadata snapshotmetadata)
    {
        return n.hashCode(new Object[] {
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
        if (!n.equal(((SnapshotMetadata) (obj)).getGame(), snapshotmetadata.getGame()) || !n.equal(((SnapshotMetadata) (obj)).getOwner(), snapshotmetadata.getOwner()) || !n.equal(((SnapshotMetadata) (obj)).getSnapshotId(), snapshotmetadata.getSnapshotId()) || !n.equal(((SnapshotMetadata) (obj)).getCoverImageUri(), snapshotmetadata.getCoverImageUri()) || !n.equal(Float.valueOf(((SnapshotMetadata) (obj)).getCoverImageAspectRatio()), Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())) || !n.equal(((SnapshotMetadata) (obj)).getTitle(), snapshotmetadata.getTitle()) || !n.equal(((SnapshotMetadata) (obj)).getDescription(), snapshotmetadata.getDescription()) || !n.equal(Long.valueOf(((SnapshotMetadata) (obj)).getLastModifiedTimestamp()), Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())) || !n.equal(Long.valueOf(((SnapshotMetadata) (obj)).getPlayedTime()), Long.valueOf(snapshotmetadata.getPlayedTime())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(((SnapshotMetadata) (obj)).getUniqueName(), snapshotmetadata.getUniqueName())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(SnapshotMetadata snapshotmetadata)
    {
        return n.h(snapshotmetadata).a("Game", snapshotmetadata.getGame()).a("Owner", snapshotmetadata.getOwner()).a("SnapshotId", snapshotmetadata.getSnapshotId()).a("CoverImageUri", snapshotmetadata.getCoverImageUri()).a("CoverImageUrl", snapshotmetadata.getCoverImageUrl()).a("CoverImageAspectRatio", Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())).a("Description", snapshotmetadata.getDescription()).a("LastModifiedTimestamp", Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())).a("PlayedTime", Long.valueOf(snapshotmetadata.getPlayedTime())).a("UniqueName", snapshotmetadata.getUniqueName()).toString();
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
        return ads;
    }

    public Uri getCoverImageUri()
    {
        return adk;
    }

    public String getCoverImageUrl()
    {
        return adp;
    }

    public String getDescription()
    {
        return Tr;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        jv.b(Tr, chararraybuffer);
    }

    public Game getGame()
    {
        return aay;
    }

    public long getLastModifiedTimestamp()
    {
        return adq;
    }

    public Player getOwner()
    {
        return ado;
    }

    public long getPlayedTime()
    {
        return adr;
    }

    public String getSnapshotId()
    {
        return WI;
    }

    public String getTitle()
    {
        return Nw;
    }

    public String getUniqueName()
    {
        return adt;
    }

    public int getVersionCode()
    {
        return BR;
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
