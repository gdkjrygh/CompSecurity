// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth:
//            RecoveryWriteRequestCreator

public class RecoveryWriteRequest
    implements SafeParcelable
{

    public static final RecoveryWriteRequestCreator CREATOR = new RecoveryWriteRequestCreator();
    public String mAccount;
    public boolean mIsBroadUse;
    public String mPhoneCountryCode;
    public String mPhoneNumber;
    public String mSecondaryEmail;
    final int mVersionCode;

    public RecoveryWriteRequest()
    {
        mVersionCode = 1;
    }

    RecoveryWriteRequest(int i, String s, String s1, String s2, String s3, boolean flag)
    {
        mVersionCode = i;
        mAccount = s;
        mSecondaryEmail = s1;
        mPhoneNumber = s2;
        mPhoneCountryCode = s3;
        mIsBroadUse = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        RecoveryWriteRequestCreator.writeToParcel$4479f008(this, parcel);
    }

}
