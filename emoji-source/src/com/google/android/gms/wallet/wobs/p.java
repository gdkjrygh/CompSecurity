// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            q, l, n

public final class p
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new q();
    String akZ;
    l ald;
    n ale;
    n alf;
    String qe;
    private final int xM;

    p()
    {
        xM = 1;
    }

    p(int i, String s, String s1, l l, n n, n n1)
    {
        xM = i;
        akZ = s;
        qe = s1;
        ald = l;
        ale = n;
        alf = n1;
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
        q.a(this, parcel, i);
    }

}
