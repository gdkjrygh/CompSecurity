// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            b

public class ProxyRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 7;
    final int j;
    public final String k;
    public final int l;
    public final long m;
    public final byte n[];
    Bundle o;

    ProxyRequest(int i1, String s, int j1, long l1, byte abyte0[], Bundle bundle)
    {
        j = i1;
        k = s;
        l = j1;
        m = l1;
        n = abyte0;
        o = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder("ProxyRequest[ url: ")).append(k).append(", method: ").append(l).append(" ]").toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.auth.api.proxy.b.a(this, parcel);
    }

}
