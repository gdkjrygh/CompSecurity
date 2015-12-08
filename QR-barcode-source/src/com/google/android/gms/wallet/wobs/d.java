// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jr;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            e

public final class d
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private final int BR;
    String auA;
    ArrayList auB;
    String auz;

    d()
    {
        BR = 1;
        auB = jr.hz();
    }

    d(int i, String s, String s1, ArrayList arraylist)
    {
        BR = i;
        auz = s;
        auA = s1;
        auB = arraylist;
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
        e.a(this, parcel, i);
    }

}
