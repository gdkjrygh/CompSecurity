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
    String ajV;
    String ajW;
    int ajX;
    int ajY;
    private final int xM;

    ProxyCard(int i, String s, String s1, int j, int k)
    {
        xM = i;
        ajV = s;
        ajW = s1;
        ajX = j;
        ajY = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCvn()
    {
        return ajW;
    }

    public int getExpirationMonth()
    {
        return ajX;
    }

    public int getExpirationYear()
    {
        return ajY;
    }

    public String getPan()
    {
        return ajV;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel, i);
    }

}
