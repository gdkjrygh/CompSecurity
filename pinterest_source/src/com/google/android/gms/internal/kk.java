// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            kl

public class kk
    implements SafeParcelable
{

    public static final kl CREATOR = new kl();
    final int CK;
    public final String ND;
    public final int NE;

    public kk(int i, String s, int j)
    {
        CK = i;
        ND = s;
        NE = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kl.a(this, parcel, i);
    }

}
