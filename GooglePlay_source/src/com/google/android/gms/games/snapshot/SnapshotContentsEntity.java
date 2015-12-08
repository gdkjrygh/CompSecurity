// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotContents, SnapshotContentsEntityCreator

public final class SnapshotContentsEntity
    implements SafeParcelable, SnapshotContents
{

    private static final Object CONTENTS_LOCK = new Object();
    public static final SnapshotContentsEntityCreator CREATOR = new SnapshotContentsEntityCreator();
    Contents mContents;
    final int mVersionCode;

    SnapshotContentsEntity(int i, Contents contents)
    {
        mVersionCode = i;
        mContents = contents;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        SnapshotContentsEntityCreator.writeToParcel(this, parcel, i);
    }

}
