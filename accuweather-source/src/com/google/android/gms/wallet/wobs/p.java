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
    String akW;
    l ala;
    n alb;
    n alc;
    String qb;
    private final int xJ;

    p()
    {
        xJ = 1;
    }

    p(int i, String s, String s1, l l, n n, n n1)
    {
        xJ = i;
        akW = s;
        qb = s1;
        ala = l;
        alb = n;
        alc = n1;
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
        q.a(this, parcel, i);
    }

}
