// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import lih;

public class GeofencingRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lih();
    public final int a;
    public final List b;
    public final int c;

    public GeofencingRequest(int i, List list, int j)
    {
        a = i;
        b = list;
        c = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lih.a(this, parcel);
    }

}
