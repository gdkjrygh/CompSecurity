// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            CheckRealNameResponseCreator

public class CheckRealNameResponse
    implements SafeParcelable
{

    public static final CheckRealNameResponseCreator CREATOR = new CheckRealNameResponseCreator();
    String statusWireCode;
    final int version;

    CheckRealNameResponse(int i, String s)
    {
        version = i;
        statusWireCode = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CheckRealNameResponseCreator.writeToParcel$3a2d15d8(this, parcel);
    }

}
