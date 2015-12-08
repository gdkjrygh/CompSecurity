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
    int akQ;
    String akR;
    double akS;
    String akT;
    long akU;
    int akV;
    private final int xJ;

    g()
    {
        xJ = 1;
        akV = -1;
        akQ = -1;
        akS = -1D;
    }

    g(int i, int j, String s, double d, String s1, long l, int k)
    {
        xJ = i;
        akQ = j;
        akR = s;
        akS = d;
        akT = s1;
        akU = l;
        akV = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}
