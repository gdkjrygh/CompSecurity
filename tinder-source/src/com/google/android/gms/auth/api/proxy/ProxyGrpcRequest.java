// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            a

public class ProxyGrpcRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int a;
    public final String b;
    public final int c;
    public final long d;
    public final byte e[];
    public final String f;

    ProxyGrpcRequest(int i, String s, int j, long l, byte abyte0[], String s1)
    {
        a = i;
        b = s;
        c = j;
        d = l;
        e = abyte0;
        f = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.api.proxy.a.a(this, parcel);
    }

}
