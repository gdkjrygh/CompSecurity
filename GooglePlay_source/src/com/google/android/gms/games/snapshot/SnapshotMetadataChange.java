// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChangeEntity

public abstract class SnapshotMetadataChange
{
    public static final class Builder
    {

        public BitmapTeleporter mCoverImage;
        public Uri mCoverImageUri;
        public String mDescription;
        public Long mPlayedTimeMillis;
        public Long mProgressValue;

        public final SnapshotMetadataChange build()
        {
            return new SnapshotMetadataChangeEntity(mDescription, mPlayedTimeMillis, mCoverImage, mCoverImageUri, mProgressValue);
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

    public abstract Long getProgressValue();

    public abstract void replaceCoverImage(BitmapTeleporter bitmapteleporter);

    public abstract ContentValues toContentValues();

}
