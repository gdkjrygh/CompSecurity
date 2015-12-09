// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            BeginCompoundOperationRequestCreator

public class BeginCompoundOperationRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new BeginCompoundOperationRequestCreator();
    final boolean mIsCreation;
    final boolean mIsUndoable;
    final String mName;
    final int mVersionCode;

    BeginCompoundOperationRequest(int i, boolean flag, String s, boolean flag1)
    {
        mVersionCode = i;
        mIsCreation = flag;
        mName = s;
        mIsUndoable = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        BeginCompoundOperationRequestCreator.writeToParcel$48b71d05(this, parcel);
    }

}
