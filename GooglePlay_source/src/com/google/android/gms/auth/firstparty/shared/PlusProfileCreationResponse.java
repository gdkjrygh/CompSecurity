// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            PlusProfileCreationResponseCreator

public class PlusProfileCreationResponse
    implements SafeParcelable
{

    public static final PlusProfileCreationResponseCreator CREATOR = new PlusProfileCreationResponseCreator();
    String mStatus;
    final int version;

    PlusProfileCreationResponse(int i, String s)
    {
        version = i;
        mStatus = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlusProfileCreationResponseCreator.writeToParcel$2ba2e9c1(this, parcel);
    }

}
