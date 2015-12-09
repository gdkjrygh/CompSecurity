// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.frp;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.frp:
//            UnlockFactoryResetProtectionRequestCreator

public class UnlockFactoryResetProtectionRequest
    implements SafeParcelable
{

    public static final UnlockFactoryResetProtectionRequestCreator CREATOR = new UnlockFactoryResetProtectionRequestCreator();
    public final String accountName;
    public final String accountType;
    public final String password;
    final int version;

    UnlockFactoryResetProtectionRequest(int i, String s, String s1, String s2)
    {
        version = i;
        accountName = s;
        password = s1;
        accountType = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        UnlockFactoryResetProtectionRequestCreator.writeToParcel$2e3e959d(this, parcel);
    }

}
