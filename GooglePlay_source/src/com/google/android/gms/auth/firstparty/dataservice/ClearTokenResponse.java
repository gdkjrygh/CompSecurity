// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            ClearTokenResponseCreator

public class ClearTokenResponse
    implements SafeParcelable
{

    public static final ClearTokenResponseCreator CREATOR = new ClearTokenResponseCreator();
    final String statusWireCode;
    final int version;

    ClearTokenResponse(int i, String s)
    {
        version = i;
        statusWireCode = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ClearTokenResponseCreator.writeToParcel$24b36e6b(this, parcel);
    }

}
