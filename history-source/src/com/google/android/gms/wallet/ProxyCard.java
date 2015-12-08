// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            o

public final class ProxyCard
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    private final int CK;
    String avP;
    String avQ;
    int avR;
    int avS;

    ProxyCard(int i, String s, String s1, int j, int k)
    {
        CK = i;
        avP = s;
        avQ = s1;
        avR = j;
        avS = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCvn()
    {
        return avQ;
    }

    public int getExpirationMonth()
    {
        return avR;
    }

    public int getExpirationYear()
    {
        return avS;
    }

    public String getPan()
    {
        return avP;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel, i);
    }

}
