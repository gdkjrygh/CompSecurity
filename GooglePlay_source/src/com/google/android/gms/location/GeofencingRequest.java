// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            GeofencingRequestCreator

public class GeofencingRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GeofencingRequestCreator();
    final List mGeofences;
    final int mInitialTrigger;
    final int mVersionCode;

    GeofencingRequest(int i, List list, int j)
    {
        mVersionCode = i;
        mGeofences = list;
        mInitialTrigger = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GeofencingRequestCreator.writeToParcel$75418c60(this, parcel);
    }

}
