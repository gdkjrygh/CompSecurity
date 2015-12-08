// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChangeCreator, SnapshotMetadata

public final class SnapshotMetadataChange
    implements SafeParcelable
{
    public static final class Builder
    {

        private String Tr;
        private Uri adk;
        private Long adm;
        private a adn;

        public SnapshotMetadataChange build()
        {
            return new SnapshotMetadataChange(Tr, adm, adn, adk);
        }

        public Builder fromMetadata(SnapshotMetadata snapshotmetadata)
        {
            Tr = snapshotmetadata.getDescription();
            adm = Long.valueOf(snapshotmetadata.getPlayedTime());
            if (adm.longValue() == -1L)
            {
                adm = null;
            }
            adk = snapshotmetadata.getCoverImageUri();
            if (adk != null)
            {
                adn = null;
            }
            return this;
        }

        public Builder setCoverImage(Bitmap bitmap)
        {
            adn = new a(bitmap);
            adk = null;
            return this;
        }

        public Builder setDescription(String s)
        {
            Tr = s;
            return this;
        }

        public Builder setPlayedTimeMillis(long l)
        {
            adm = Long.valueOf(l);
            return this;
        }

        public Builder()
        {
        }
    }


    public static final SnapshotMetadataChangeCreator CREATOR = new SnapshotMetadataChangeCreator();
    public static final SnapshotMetadataChange EMPTY_CHANGE = new SnapshotMetadataChange();
    private final int BR;
    private final String Tr;
    private final Long adj;
    private final Uri adk;
    private a adl;

    SnapshotMetadataChange()
    {
        this(4, null, null, null, null);
    }

    SnapshotMetadataChange(int i, String s, Long long1, a a1, Uri uri)
    {
        boolean flag2 = true;
        boolean flag = true;
        super();
        BR = i;
        Tr = s;
        adj = long1;
        adl = a1;
        adk = uri;
        if (adl != null)
        {
            if (adk != null)
            {
                flag = false;
            }
            o.a(flag, "Cannot set both a URI and an image");
        } else
        if (adk != null)
        {
            boolean flag1;
            if (adl == null)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            o.a(flag1, "Cannot set both a URI and an image");
            return;
        }
    }

    SnapshotMetadataChange(String s, Long long1, a a1, Uri uri)
    {
        this(4, s, long1, a1, uri);
    }

    public int describeContents()
    {
        return 0;
    }

    public Bitmap getCoverImage()
    {
        if (adl == null)
        {
            return null;
        } else
        {
            return adl.gw();
        }
    }

    public Uri getCoverImageUri()
    {
        return adk;
    }

    public String getDescription()
    {
        return Tr;
    }

    public Long getPlayedTimeMillis()
    {
        return adj;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public a lM()
    {
        return adl;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.games.snapshot.SnapshotMetadataChangeCreator.a(this, parcel, i);
    }

}
