// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            i, l, g

public final class f
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    private final int CK;
    l avm;
    g awM;
    String label;
    String type;

    f()
    {
        CK = 1;
    }

    f(int j, String s, g g, String s1, l l)
    {
        CK = j;
        label = s;
        awM = g;
        type = s1;
        avm = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
