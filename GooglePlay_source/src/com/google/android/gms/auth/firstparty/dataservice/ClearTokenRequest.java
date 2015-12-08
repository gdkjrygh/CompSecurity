// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            ClearTokenRequestCreator

public class ClearTokenRequest
    implements SafeParcelable
{

    public static final ClearTokenRequestCreator CREATOR = new ClearTokenRequestCreator();
    String token;
    final int version;

    public ClearTokenRequest()
    {
        version = 1;
    }

    ClearTokenRequest(int i, String s)
    {
        version = i;
        token = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ClearTokenRequestCreator.writeToParcel$77197a69(this, parcel);
    }

}
