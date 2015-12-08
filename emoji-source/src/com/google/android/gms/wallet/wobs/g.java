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
    int akT;
    String akU;
    double akV;
    String akW;
    long akX;
    int akY;
    private final int xM;

    g()
    {
        xM = 1;
        akY = -1;
        akT = -1;
        akV = -1D;
    }

    g(int i, int j, String s, double d, String s1, long l, int k)
    {
        xM = i;
        akT = j;
        akU = s;
        akV = d;
        akW = s1;
        akX = l;
        akY = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}
