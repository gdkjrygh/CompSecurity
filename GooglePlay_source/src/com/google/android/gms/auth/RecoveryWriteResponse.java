// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth:
//            RecoveryWriteResponseCreator

public class RecoveryWriteResponse
    implements SafeParcelable
{

    public static final RecoveryWriteResponseCreator CREATOR = new RecoveryWriteResponseCreator();
    public String mErrorCode;
    final int mVersionCode;

    public RecoveryWriteResponse()
    {
        mVersionCode = 1;
    }

    RecoveryWriteResponse(int i, String s)
    {
        mVersionCode = i;
        mErrorCode = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        RecoveryWriteResponseCreator.writeToParcel$361acac(this, parcel);
    }

}
