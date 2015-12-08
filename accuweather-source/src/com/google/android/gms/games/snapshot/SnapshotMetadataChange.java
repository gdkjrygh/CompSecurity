// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChangeCreator, SnapshotMetadata

public final class SnapshotMetadataChange
    implements SafeParcelable
{
    public static final class Builder
    {

        private String Mm;
        private Uri Ue;
        private Long Ug;
        private a Uh;

        public SnapshotMetadataChange build()
        {
            return new SnapshotMetadataChange(Mm, Ug, Uh, Ue);
        }

        public Builder fromMetadata(SnapshotMetadata snapshotmetadata)
        {
            Mm = snapshotmetadata.getDescription();
            Ug = Long.valueOf(snapshotmetadata.getPlayedTime());
            if (Ug.longValue() == -1L)
            {
                Ug = null;
            }
            Ue = snapshotmetadata.getCoverImageUri();
            if (Ue != null)
            {
                Uh = null;
            }
            return this;
        }

        public Builder setCoverImage(Bitmap bitmap)
        {
            Uh = new a(bitmap);
            Ue = null;
            return this;
        }

        public Builder setDescription(String s)
        {
            Mm = s;
            return this;
        }

        public Builder setPlayedTimeMillis(long l)
        {
            Ug = Long.valueOf(l);
            return this;
        }

        public Builder()
        {
        }
    }


    public static final SnapshotMetadataChangeCreator CREATOR = new SnapshotMetadataChangeCreator();
    public static final SnapshotMetadataChange EMPTY_CHANGE = new SnapshotMetadataChange();
    private final String Mm;
    private final Long Ud;
    private final Uri Ue;
    private a Uf;
    private final int xJ;

    SnapshotMetadataChange()
    {
        this(4, null, null, null, null);
    }

    SnapshotMetadataChange(int i, String s, Long long1, a a1, Uri uri)
    {
        boolean flag2 = true;
        boolean flag = true;
        super();
        xJ = i;
        Mm = s;
        Ud = long1;
        Uf = a1;
        Ue = uri;
        if (Uf != null)
        {
            if (Ue != null)
            {
                flag = false;
            }
            hn.a(flag, "Cannot set both a URI and an image");
        } else
        if (Ue != null)
        {
            boolean flag1;
            if (Uf == null)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            hn.a(flag1, "Cannot set both a URI and an image");
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
        if (Uf == null)
        {
            return null;
        } else
        {
            return Uf.eN();
        }
    }

    public Uri getCoverImageUri()
    {
        return Ue;
    }

    public String getDescription()
    {
        return Mm;
    }

    public Long getPlayedTimeMillis()
    {
        return Ud;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public a iI()
    {
        return Uf;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.games.snapshot.SnapshotMetadataChangeCreator.a(this, parcel, i);
    }

}
