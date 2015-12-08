// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.search;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.search:
//            a

public class GoogleNowAuthState
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int a;
    String b;
    String c;
    long d;

    GoogleNowAuthState(int i, String s, String s1, long l)
    {
        a = i;
        b = s;
        c = s1;
        d = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder("mAuthCode = ")).append(b).append("\nmAccessToken = ").append(c).append("\nmNextAllowedTimeMillis = ").append(d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.search.a.a(this, parcel);
    }

}
