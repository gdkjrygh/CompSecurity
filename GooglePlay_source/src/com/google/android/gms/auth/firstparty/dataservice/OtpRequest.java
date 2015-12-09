// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            OtpRequestCreator

public class OtpRequest
    implements SafeParcelable
{

    public static final OtpRequestCreator CREATOR = new OtpRequestCreator();
    public final String accountName;
    public final AppDescription callerDescription;
    public final byte challenge[];
    public final boolean isLegacyRequest;
    final int mVersion;

    OtpRequest(int i, String s, AppDescription appdescription, byte abyte0[], boolean flag)
    {
        mVersion = i;
        accountName = s;
        challenge = abyte0;
        callerDescription = (AppDescription)Preconditions.checkNotNull(appdescription, "Caller's app description cannot be null!");
        isLegacyRequest = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        OtpRequestCreator.writeToParcel(this, parcel, i);
    }

}
