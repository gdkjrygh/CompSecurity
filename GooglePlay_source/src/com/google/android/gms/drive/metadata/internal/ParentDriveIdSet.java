// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            ParentDriveIdSetCreator, PartialDriveId

public class ParentDriveIdSet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ParentDriveIdSetCreator();
    final List mPartialDriveIds;
    final int mVersionCode;

    public ParentDriveIdSet()
    {
        this(1, ((List) (new ArrayList())));
    }

    ParentDriveIdSet(int i, List list)
    {
        mVersionCode = i;
        mPartialDriveIds = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public final Set toDriveIdSet(long l)
    {
        HashSet hashset = new HashSet();
        PartialDriveId partialdriveid;
        for (Iterator iterator = mPartialDriveIds.iterator(); iterator.hasNext(); hashset.add(new DriveId(partialdriveid.mResourceId, partialdriveid.mSqlId, l, partialdriveid.mResourceType)))
        {
            partialdriveid = (PartialDriveId)iterator.next();
        }

        return hashset;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParentDriveIdSetCreator.writeToParcel$16f3b026(this, parcel);
    }

}
