// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            n

public class AuthorizeAccessRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    final int a;
    final long b;
    final DriveId c;

    AuthorizeAccessRequest(int i, long l, DriveId driveid)
    {
        a = i;
        b = l;
        c = driveid;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel, i);
    }

}
