// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            h

public final class g
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    private final int BR;
    int auD;
    String auE;
    double auF;
    String auG;
    long auH;
    int auI;

    g()
    {
        BR = 1;
        auI = -1;
        auD = -1;
        auF = -1D;
    }

    g(int i, int j, String s, double d, String s1, long l, int k)
    {
        BR = i;
        auD = j;
        auE = s;
        auF = d;
        auG = s1;
        auH = l;
        auI = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}
