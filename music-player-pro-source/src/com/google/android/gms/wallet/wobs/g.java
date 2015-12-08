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
    private final int CK;
    int awN;
    String awO;
    double awP;
    String awQ;
    long awR;
    int awS;

    g()
    {
        CK = 1;
        awS = -1;
        awN = -1;
        awP = -1D;
    }

    g(int i, int j, String s, double d, String s1, long l, int k)
    {
        CK = i;
        awN = j;
        awO = s;
        awP = d;
        awQ = s1;
        awR = l;
        awS = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}
