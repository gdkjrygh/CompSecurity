// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEvent, QueryResultEventParcelableCreator

public class QueryResultEventParcelable extends WriteAwareParcelable
    implements DriveEvent
{

    public static final QueryResultEventParcelableCreator CREATOR = new QueryResultEventParcelableCreator();
    final DataHolder mDataHolder;
    final boolean mIsStatusChanged;
    final int mQueryStatus;
    final int mVersionCode;

    QueryResultEventParcelable(int i, DataHolder dataholder, boolean flag, int j)
    {
        mVersionCode = i;
        mDataHolder = dataholder;
        mIsStatusChanged = flag;
        mQueryStatus = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public final void doWriteToParcel(Parcel parcel, int i)
    {
        QueryResultEventParcelableCreator.writeToParcel(this, parcel, i);
    }

    public final int getType()
    {
        return 3;
    }

}
