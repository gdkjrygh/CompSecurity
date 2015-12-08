// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            VerifyPinResponseCreator

public class VerifyPinResponse
    implements SafeParcelable
{

    public static final VerifyPinResponseCreator CREATOR = new VerifyPinResponseCreator();
    public final String rapt;
    public final int status;
    final int version;

    VerifyPinResponse(int i, int j, String s)
    {
        version = i;
        status = j;
        rapt = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        VerifyPinResponseCreator.writeToParcel$15613d23(this, parcel);
    }

}
