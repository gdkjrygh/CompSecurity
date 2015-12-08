// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChange, SnapshotMetadataChangeEntity

public static final class 
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

    public ()
    {
    }
}
