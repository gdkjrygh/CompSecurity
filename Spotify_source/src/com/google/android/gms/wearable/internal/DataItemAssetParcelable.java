// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import btl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cqi;
import cqs;

public class DataItemAssetParcelable
    implements SafeParcelable, cqi
{

    public static final android.os.Parcelable.Creator CREATOR = new cqs();
    public final int a;
    public final String b;
    public final String c;

    public DataItemAssetParcelable(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public DataItemAssetParcelable(cqi cqi1)
    {
        a = 1;
        b = (String)btl.a(cqi1.a());
        c = (String)btl.a(cqi1.b());
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetParcelable[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (b == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(b);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(c);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        cqs.a(this, parcel);
    }

}
