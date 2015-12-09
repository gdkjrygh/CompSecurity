// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.frp;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.frp:
//            UnlockFactoryResetProtectionResponseCreator

public class UnlockFactoryResetProtectionResponse
    implements SafeParcelable
{

    public static final UnlockFactoryResetProtectionResponseCreator CREATOR = new UnlockFactoryResetProtectionResponseCreator();
    public final int status;
    final int version;

    UnlockFactoryResetProtectionResponse(int i, int j)
    {
        version = i;
        status = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        UnlockFactoryResetProtectionResponseCreator.writeToParcel$1f097db1(this, parcel);
    }

}
