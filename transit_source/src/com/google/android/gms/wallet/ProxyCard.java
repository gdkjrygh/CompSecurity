// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            k

public final class ProxyCard
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    private final int iM;
    String um;
    String un;
    int uo;
    int up;

    ProxyCard(int i, String s, String s1, int j, int l)
    {
        iM = i;
        um = s;
        un = s1;
        uo = j;
        up = l;
    }

    public ProxyCard(String s, String s1, int i, int j)
    {
        iM = 1;
        um = s;
        un = s1;
        uo = i;
        up = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCvn()
    {
        return un;
    }

    public int getExpirationMonth()
    {
        return uo;
    }

    public int getExpirationYear()
    {
        return up;
    }

    public String getPan()
    {
        return um;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
