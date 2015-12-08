// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ig;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            e

public final class d
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    String akP;
    String akQ;
    ArrayList akR;
    private final int xM;

    d()
    {
        xM = 1;
        akR = ig.ga();
    }

    d(int i, String s, String s1, ArrayList arraylist)
    {
        xM = i;
        akP = s;
        akQ = s1;
        akR = arraylist;
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
        e.a(this, parcel, i);
    }

}
