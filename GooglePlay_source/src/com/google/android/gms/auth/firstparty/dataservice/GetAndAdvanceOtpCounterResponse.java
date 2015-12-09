// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            GetAndAdvanceOtpCounterResponseCreator

public class GetAndAdvanceOtpCounterResponse
    implements SafeParcelable
{

    public static final GetAndAdvanceOtpCounterResponseCreator CREATOR = new GetAndAdvanceOtpCounterResponseCreator();
    public final Long counter;
    final int mVersion;

    GetAndAdvanceOtpCounterResponse(int i, Long long1)
    {
        mVersion = i;
        counter = long1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GetAndAdvanceOtpCounterResponseCreator.writeToParcel$4804b059(this, parcel);
    }

}
