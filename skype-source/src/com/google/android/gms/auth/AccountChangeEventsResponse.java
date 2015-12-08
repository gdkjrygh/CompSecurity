// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.y;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            c

public class AccountChangeEventsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int a;
    final List b;

    AccountChangeEventsResponse(int i, List list)
    {
        a = i;
        b = (List)y.a(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel);
    }

}
