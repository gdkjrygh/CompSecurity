// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive:
//            h

public class UserMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    final int CK;
    final String OR;
    final String OS;
    final String OT;
    final boolean OU;
    final String OV;

    UserMetadata(int i, String s, String s1, String s2, boolean flag, String s3)
    {
        CK = i;
        OR = s;
        OS = s1;
        OT = s2;
        OU = flag;
        OV = s3;
    }

    public UserMetadata(String s, String s1, String s2, boolean flag, String s3)
    {
        this(1, s, s1, s2, flag, s3);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", new Object[] {
            OR, OS, OT, Boolean.valueOf(OU), OV
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}
