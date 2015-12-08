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
    String ajS;
    String ajT;
    int ajU;
    int ajV;
    private final int xJ;

    ProxyCard(int i, String s, String s1, int j, int k)
    {
        xJ = i;
        ajS = s;
        ajT = s1;
        ajU = j;
        ajV = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCvn()
    {
        return ajT;
    }

    public int getExpirationMonth()
    {
        return ajU;
    }

    public int getExpirationYear()
    {
        return ajV;
    }

    public String getPan()
    {
        return ajS;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel, i);
    }

}
