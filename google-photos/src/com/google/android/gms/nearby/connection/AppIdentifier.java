// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lke;

public final class AppIdentifier
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lke();
    public final int a;
    public final String b;

    public AppIdentifier(int i, String s)
    {
        a = i;
        b = b.a(s, "Missing application identifier value");
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        lke.a(this, parcel);
    }

}
