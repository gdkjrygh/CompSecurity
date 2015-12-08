// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            RecoveryReadResponseCreator

public class RecoveryReadResponse
    implements SafeParcelable
{

    public static final RecoveryReadResponseCreator CREATOR = new RecoveryReadResponseCreator();
    public String mAction;
    public String mAllowedOptions;
    public List mCountryList;
    public String mError;
    public String mPhoneCountryCode;
    public String mPhoneNumber;
    public String mSecondaryEmail;
    final int mVersionCode;

    public RecoveryReadResponse()
    {
        mVersionCode = 1;
    }

    RecoveryReadResponse(int i, String s, String s1, String s2, List list, String s3, String s4, 
            String s5)
    {
        mVersionCode = i;
        mSecondaryEmail = s;
        mPhoneNumber = s1;
        mPhoneCountryCode = s2;
        mCountryList = list;
        mError = s3;
        mAction = s4;
        mAllowedOptions = s5;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        RecoveryReadResponseCreator.writeToParcel$d57022f(this, parcel);
    }

}
