// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            GplusInfoResponseCreator

public class GplusInfoResponse
    implements SafeParcelable
{

    public static final GplusInfoResponseCreator CREATOR = new GplusInfoResponseCreator();
    String firstName;
    boolean isAllowed;
    boolean isEsMobileEnabled;
    boolean isGooglePlusEnabled;
    String lastName;
    String picasaUserName;
    String ropRevision;
    String ropText;
    final int version;
    String wireCode;

    GplusInfoResponse(int i, boolean flag, String s, String s1, String s2, boolean flag1, boolean flag2, 
            String s3, String s4, String s5)
    {
        version = i;
        isAllowed = flag;
        firstName = s;
        lastName = s1;
        picasaUserName = s2;
        isGooglePlusEnabled = flag1;
        isEsMobileEnabled = flag2;
        ropText = s3;
        ropRevision = s4;
        wireCode = s5;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GplusInfoResponseCreator.writeToParcel$12358bf6(this, parcel);
    }

}
