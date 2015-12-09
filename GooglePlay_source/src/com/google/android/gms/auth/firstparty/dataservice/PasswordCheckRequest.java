// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            PasswordCheckRequestCreator

public class PasswordCheckRequest
    implements SafeParcelable
{

    public static final PasswordCheckRequestCreator CREATOR = new PasswordCheckRequestCreator();
    String accountName;
    AppDescription appDescription;
    String optionalFirstName;
    String optionalLastName;
    String password;
    final int version;

    PasswordCheckRequest(int i, String s, String s1, String s2, String s3, AppDescription appdescription)
    {
        version = i;
        accountName = s;
        password = s1;
        optionalFirstName = s2;
        optionalLastName = s3;
        appDescription = appdescription;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PasswordCheckRequestCreator.writeToParcel(this, parcel, i);
    }

}
