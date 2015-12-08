// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChange, SnapshotMetadataChangeCreator

public final class SnapshotMetadataChangeEntity extends SnapshotMetadataChange
    implements SafeParcelable
{

    public static final SnapshotMetadataChangeCreator CREATOR = new SnapshotMetadataChangeCreator();
    private final int CK;
    private final String UO;
    private final Uri afd;
    private final Long afe;
    private a aff;

    SnapshotMetadataChangeEntity()
    {
        this(4, null, null, null, null);
    }

    SnapshotMetadataChangeEntity(int i, String s, Long long1, a a1, Uri uri)
    {
        boolean flag2 = true;
        boolean flag = true;
        super();
        CK = i;
        UO = s;
        afe = long1;
        aff = a1;
        afd = uri;
        if (aff != null)
        {
            if (afd != null)
            {
                flag = false;
            }
            jx.a(flag, "Cannot set both a URI and an image");
        } else
        if (afd != null)
        {
            boolean flag1;
            if (aff == null)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            jx.a(flag1, "Cannot set both a URI and an image");
            return;
        }
    }

    SnapshotMetadataChangeEntity(String s, Long long1, a a1, Uri uri)
    {
        this(4, s, long1, a1, uri);
    }

    public int describeContents()
    {
        return 0;
    }

    public Bitmap getCoverImage()
    {
        if (aff == null)
        {
            return null;
        } else
        {
            return aff.gT();
        }
    }

    public Uri getCoverImageUri()
    {
        return afd;
    }

    public String getDescription()
    {
        return UO;
    }

    public Long getPlayedTimeMillis()
    {
        return afe;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public a mT()
    {
        return aff;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.games.snapshot.SnapshotMetadataChangeCreator.a(this, parcel, i);
    }

}
