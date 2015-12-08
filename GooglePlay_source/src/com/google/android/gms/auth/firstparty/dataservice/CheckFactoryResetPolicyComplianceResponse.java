// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            CheckFactoryResetPolicyComplianceResponseCreator

public class CheckFactoryResetPolicyComplianceResponse
    implements SafeParcelable
{

    public static final CheckFactoryResetPolicyComplianceResponseCreator CREATOR = new CheckFactoryResetPolicyComplianceResponseCreator();
    public final boolean isCompliant;
    final int version;

    CheckFactoryResetPolicyComplianceResponse(int i, boolean flag)
    {
        version = i;
        isCompliant = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CheckFactoryResetPolicyComplianceResponseCreator.writeToParcel$37f2d4df(this, parcel);
    }

}
