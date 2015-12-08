// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChangeCreator, SnapshotMetadata

public final class SnapshotMetadataChange
    implements SafeParcelable
{
    public static final class Builder
    {

        private String Mp;
        private Uri Uh;
        private Long Uj;
        private a Uk;

        public SnapshotMetadataChange build()
        {
            return new SnapshotMetadataChange(Mp, Uj, Uk, Uh);
        }

        public Builder fromMetadata(SnapshotMetadata snapshotmetadata)
        {
            Mp = snapshotmetadata.getDescription();
            Uj = Long.valueOf(snapshotmetadata.getPlayedTime());
            if (Uj.longValue() == -1L)
            {
                Uj = null;
            }
            Uh = snapshotmetadata.getCoverImageUri();
            if (Uh != null)
            {
                Uk = null;
            }
            return this;
        }

        public Builder setCoverImage(Bitmap bitmap)
        {
            Uk = new a(bitmap);
            Uh = null;
            return this;
        }

        public Builder setDescription(String s)
        {
            Mp = s;
            return this;
        }

        public Builder setPlayedTimeMillis(long l)
        {
            Uj = Long.valueOf(l);
            return this;
        }

        public Builder()
        {
        }
    }


    public static final SnapshotMetadataChangeCreator CREATOR = new SnapshotMetadataChangeCreator();
    public static final SnapshotMetadataChange EMPTY_CHANGE = new SnapshotMetadataChange();
    private final String Mp;
    private final Long Ug;
    private final Uri Uh;
    private a Ui;
    private final int xM;

    SnapshotMetadataChange()
    {
        this(4, null, null, null, null);
    }

    SnapshotMetadataChange(int i, String s, Long long1, a a1, Uri uri)
    {
        boolean flag2 = true;
        boolean flag = true;
        super();
        xM = i;
        Mp = s;
        Ug = long1;
        Ui = a1;
        Uh = uri;
        if (Ui != null)
        {
            if (Uh != null)
            {
                flag = false;
            }
            hm.a(flag, "Cannot set both a URI and an image");
        } else
        if (Uh != null)
        {
            boolean flag1;
            if (Ui == null)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            hm.a(flag1, "Cannot set both a URI and an image");
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
        if (Ui == null)
        {
            return null;
        } else
        {
            return Ui.eS();
        }
    }

    public Uri getCoverImageUri()
    {
        return Uh;
    }

    public String getDescription()
    {
        return Mp;
    }

    public Long getPlayedTimeMillis()
    {
        return Ug;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public a iN()
    {
        return Ui;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.games.snapshot.SnapshotMetadataChangeCreator.a(this, parcel, i);
    }

}
