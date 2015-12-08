// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ParcelableEventListCreator

public class ParcelableEventList
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ParcelableEventListCreator();
    final List mAffectedObjectIds;
    final DataHolder mEventData;
    final List mEvents;
    final ParcelableChangeInfo mPreviousChangeInfo;
    final boolean mUndoRedoStateChanged;
    final int mVersionCode;

    ParcelableEventList(int i, List list, DataHolder dataholder, boolean flag, List list1, ParcelableChangeInfo parcelablechangeinfo)
    {
        mVersionCode = i;
        mEvents = list;
        mEventData = dataholder;
        mUndoRedoStateChanged = flag;
        mAffectedObjectIds = list1;
        mPreviousChangeInfo = parcelablechangeinfo;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParcelableEventListCreator.writeToParcel(this, parcel, i);
    }

}
