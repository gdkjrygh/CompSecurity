// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.googlehelp:
//            b

public final class OfflineSuggestion
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final String CB;
    final String Yv;
    final String ase;
    final int mVersionCode;
    final String pE;

    OfflineSuggestion(int i, String s, String s1, String s2, String s3)
    {
        mVersionCode = i;
        CB = s;
        Yv = s1;
        pE = s2;
        ase = s3;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
