// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            CheckFactoryResetPolicyComplianceRequestCreator

public class CheckFactoryResetPolicyComplianceRequest
    implements SafeParcelable
{

    public static final CheckFactoryResetPolicyComplianceRequestCreator CREATOR = new CheckFactoryResetPolicyComplianceRequestCreator();
    public final String accountId;
    final int version;

    CheckFactoryResetPolicyComplianceRequest(int i, String s)
    {
        version = i;
        accountId = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CheckFactoryResetPolicyComplianceRequestCreator.writeToParcel$6bda4ef3(this, parcel);
    }

}
