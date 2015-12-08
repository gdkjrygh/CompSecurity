// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            CheckRealNameRequestCreator

public class CheckRealNameRequest
    implements SafeParcelable
{

    public static final CheckRealNameRequestCreator CREATOR = new CheckRealNameRequestCreator();
    AppDescription callingAppDescription;
    String firstName;
    String lastName;
    final int version;

    public CheckRealNameRequest()
    {
        version = 1;
    }

    CheckRealNameRequest(int i, AppDescription appdescription, String s, String s1)
    {
        version = i;
        callingAppDescription = appdescription;
        firstName = s;
        lastName = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CheckRealNameRequestCreator.writeToParcel(this, parcel, i);
    }

}
