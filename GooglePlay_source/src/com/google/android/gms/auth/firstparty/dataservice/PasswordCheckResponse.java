// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            PasswordCheckResponseCreator

public class PasswordCheckResponse
    implements SafeParcelable
{

    public static final PasswordCheckResponseCreator CREATOR = new PasswordCheckResponseCreator();
    String detail;
    String passwordStrength;
    String status;
    final int version;

    PasswordCheckResponse(int i, String s, String s1, String s2)
    {
        version = i;
        status = s;
        passwordStrength = s1;
        detail = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PasswordCheckResponseCreator.writeToParcel$51a6c614(this, parcel);
    }

}
