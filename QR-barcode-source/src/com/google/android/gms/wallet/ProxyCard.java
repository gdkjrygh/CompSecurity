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
    private final int BR;
    String atF;
    String atG;
    int atH;
    int atI;

    ProxyCard(int i, String s, String s1, int j, int k)
    {
        BR = i;
        atF = s;
        atG = s1;
        atH = j;
        atI = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCvn()
    {
        return atG;
    }

    public int getExpirationMonth()
    {
        return atH;
    }

    public int getExpirationYear()
    {
        return atI;
    }

    public String getPan()
    {
        return atF;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel, i);
    }

}
