// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            EndCompoundOperationRequestCreator

public class EndCompoundOperationRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new EndCompoundOperationRequestCreator();
    final int mVersionCode;

    public EndCompoundOperationRequest()
    {
        this(1);
    }

    EndCompoundOperationRequest(int i)
    {
        mVersionCode = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        EndCompoundOperationRequestCreator.writeToParcel$20220ac9(this, parcel);
    }

}
