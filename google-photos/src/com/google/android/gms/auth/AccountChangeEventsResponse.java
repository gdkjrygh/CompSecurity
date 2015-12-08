// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import juf;

public class AccountChangeEventsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new juf();
    public final int a;
    public final List b;

    public AccountChangeEventsResponse(int i, List list)
    {
        a = i;
        b = (List)b.d(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        juf.a(this, parcel);
    }

}
