// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.content.ContentUris;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.DataUtils;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChange, SnapshotMetadataChangeCreator

public final class SnapshotMetadataChangeEntity extends SnapshotMetadataChange
    implements SafeParcelable
{

    public static final SnapshotMetadataChangeCreator CREATOR = new SnapshotMetadataChangeCreator();
    BitmapTeleporter mCoverImageTeleporter;
    final Uri mCoverImageUri;
    final String mDescription;
    final Long mPlayedTime;
    final Long mProgressValue;
    final int mVersionCode;

    SnapshotMetadataChangeEntity()
    {
        this(5, null, null, null, null, null);
    }

    SnapshotMetadataChangeEntity(int i, String s, Long long1, BitmapTeleporter bitmapteleporter, Uri uri, Long long2)
    {
        boolean flag2 = true;
        boolean flag = true;
        super();
        mVersionCode = i;
        mDescription = s;
        mPlayedTime = long1;
        mCoverImageTeleporter = bitmapteleporter;
        mCoverImageUri = uri;
        mProgressValue = long2;
        if (mCoverImageTeleporter != null)
        {
            if (mCoverImageUri != null)
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Cannot set both a URI and an image");
        } else
        if (mCoverImageUri != null)
        {
            boolean flag1;
            if (mCoverImageTeleporter == null)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Cannot set both a URI and an image");
            return;
        }
    }

    SnapshotMetadataChangeEntity(String s, Long long1, BitmapTeleporter bitmapteleporter, Uri uri, Long long2)
    {
        this(5, s, long1, bitmapteleporter, uri, long2);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Bitmap getCoverImage()
    {
        if (mCoverImageTeleporter == null)
        {
            return null;
        } else
        {
            return mCoverImageTeleporter.get();
        }
    }

    public final String getDescription()
    {
        return mDescription;
    }

    public final Long getPlayedTimeMillis()
    {
        return mPlayedTime;
    }

    public final Long getProgressValue()
    {
        return mProgressValue;
    }

    public final void replaceCoverImage(BitmapTeleporter bitmapteleporter)
    {
        mCoverImageTeleporter = bitmapteleporter;
    }

    public final ContentValues toContentValues()
    {
        ContentValues contentvalues = new ContentValues();
        if (mDescription != null)
        {
            contentvalues.put("description", mDescription);
        }
        if (mPlayedTime != null)
        {
            contentvalues.put("duration", mPlayedTime);
        }
        if (mProgressValue != null)
        {
            contentvalues.put("progress_value", mProgressValue);
        }
        if (mCoverImageTeleporter != null)
        {
            Bitmap bitmap = mCoverImageTeleporter.get();
            contentvalues.put("cover_icon_image_bytes", DataUtils.loadImageBytes(bitmap));
            contentvalues.put("cover_icon_image_height", Integer.valueOf(bitmap.getHeight()));
            contentvalues.put("cover_icon_image_width", Integer.valueOf(bitmap.getWidth()));
        }
        if (mCoverImageUri != null)
        {
            contentvalues.put("cover_icon_image_id", Long.valueOf(ContentUris.parseId(mCoverImageUri)));
        }
        return contentvalues;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        SnapshotMetadataChangeCreator.writeToParcel(this, parcel, i);
    }

}
