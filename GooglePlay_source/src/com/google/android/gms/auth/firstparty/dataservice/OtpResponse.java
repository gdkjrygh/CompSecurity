// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            OtpResponseCreator

public class OtpResponse
    implements SafeParcelable
{

    public static final OtpResponseCreator CREATOR = new OtpResponseCreator();
    final int mVersion;
    public final String otp;

    OtpResponse(int i, String s)
    {
        mVersion = i;
        otp = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        OtpResponseCreator.writeToParcel$10c9a92e(this, parcel);
    }

}
