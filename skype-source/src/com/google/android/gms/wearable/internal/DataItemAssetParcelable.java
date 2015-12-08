// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.wearable.g;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            b

public class DataItemAssetParcelable
    implements SafeParcelable, g
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int a;
    private final String b;
    private final String c;

    DataItemAssetParcelable(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public DataItemAssetParcelable(g g1)
    {
        a = 1;
        b = (String)y.a(g1.b());
        c = (String)y.a(g1.c());
    }

    public final Object a()
    {
        return this;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
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
        com.google.android.gms.wearable.internal.b.a(this, parcel);
    }

}
