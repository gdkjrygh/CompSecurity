// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            ValidateAccountCredentialsResponseCreator

public class ValidateAccountCredentialsResponse
    implements SafeParcelable
{

    public static final ValidateAccountCredentialsResponseCreator CREATOR = new ValidateAccountCredentialsResponseCreator();
    public final String accountId;
    public final int status;
    final int version;

    ValidateAccountCredentialsResponse(int i, int j, String s)
    {
        version = i;
        status = j;
        accountId = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ValidateAccountCredentialsResponseCreator.writeToParcel$581f63dc(this, parcel);
    }

}
