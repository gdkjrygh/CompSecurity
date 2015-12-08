// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CancelPendingActionsRequestCreator

public class CancelPendingActionsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new CancelPendingActionsRequestCreator();
    final List mTrackingTags;
    final int mVersionCode;

    CancelPendingActionsRequest(int i, List list)
    {
        mVersionCode = i;
        mTrackingTags = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CancelPendingActionsRequestCreator.writeToParcel$5fa212ea(this, parcel);
    }

}
