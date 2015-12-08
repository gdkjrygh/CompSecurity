// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.a;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChangeEntity, SnapshotMetadata

public abstract class SnapshotMetadataChange
{
    public static final class Builder
    {

        private String UO;
        private Long afb;
        private a afc;
        private Uri afd;

        public SnapshotMetadataChange build()
        {
            return new SnapshotMetadataChangeEntity(UO, afb, afc, afd);
        }

        public Builder fromMetadata(SnapshotMetadata snapshotmetadata)
        {
            UO = snapshotmetadata.getDescription();
            afb = Long.valueOf(snapshotmetadata.getPlayedTime());
            if (afb.longValue() == -1L)
            {
                afb = null;
            }
            afd = snapshotmetadata.getCoverImageUri();
            if (afd != null)
            {
                afc = null;
            }
            return this;
        }

        public Builder setCoverImage(Bitmap bitmap)
        {
            afc = new a(bitmap);
            afd = null;
            return this;
        }

        public Builder setDescription(String s)
        {
            UO = s;
            return this;
        }

        public Builder setPlayedTimeMillis(long l)
        {
            afb = Long.valueOf(l);
            return this;
        }

        public Builder()
        {
        }
    }


    public static final SnapshotMetadataChange EMPTY_CHANGE = new SnapshotMetadataChangeEntity();

    protected SnapshotMetadataChange()
    {
    }

    public abstract Bitmap getCoverImage();

    public abstract String getDescription();

    public abstract Long getPlayedTimeMillis();

    public abstract a mT();

}
