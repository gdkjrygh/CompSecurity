// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            o

public class DisconnectRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    final int xM;

    public DisconnectRequest()
    {
        this(1);
    }

    DisconnectRequest(int i)
    {
        xM = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel, i);
    }

}
