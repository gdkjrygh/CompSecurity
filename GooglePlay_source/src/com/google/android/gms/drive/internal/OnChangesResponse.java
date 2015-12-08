// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.WriteAwareParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnChangesResponseCreator

public class OnChangesResponse extends WriteAwareParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new OnChangesResponseCreator();
    final List mDeleted;
    final ChangeSequenceNumber mLastChangeSequenceNumber;
    final boolean mMoreChangesExist;
    final DataHolder mNewOrModifiedResourcesData;
    final int mVersionCode;

    OnChangesResponse(int i, DataHolder dataholder, List list, ChangeSequenceNumber changesequencenumber, boolean flag)
    {
        mVersionCode = i;
        mNewOrModifiedResourcesData = dataholder;
        mDeleted = list;
        mLastChangeSequenceNumber = changesequencenumber;
        mMoreChangesExist = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    protected final void doWriteToParcel(Parcel parcel, int i)
    {
        OnChangesResponseCreator.writeToParcel(this, parcel, i | 1);
    }

}
