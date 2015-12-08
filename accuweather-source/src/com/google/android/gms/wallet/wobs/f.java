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
    l ajp;
    g akP;
    String label;
    String type;
    private final int xJ;

    f()
    {
        xJ = 1;
    }

    f(int j, String s, g g, String s1, l l)
    {
        xJ = j;
        label = s;
        akP = g;
        type = s1;
        ajp = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
