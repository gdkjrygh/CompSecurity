// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.WriteAwareParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnListEntriesResponseCreator

public class OnListEntriesResponse extends WriteAwareParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new OnListEntriesResponseCreator();
    final DataHolder mEntries;
    final boolean mMoreEntriesMayExist;
    final int mVersionCode;

    OnListEntriesResponse(int i, DataHolder dataholder, boolean flag)
    {
        mVersionCode = i;
        mEntries = dataholder;
        mMoreEntriesMayExist = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    protected final void doWriteToParcel(Parcel parcel, int i)
    {
        OnListEntriesResponseCreator.writeToParcel(this, parcel, i);
    }

}
