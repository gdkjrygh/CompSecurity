// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            i

public final class zzn
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    String a;
    String b;
    private final int c;

    zzn()
    {
        c = 1;
    }

    zzn(int j, String s, String s1)
    {
        c = j;
        a = s;
        b = s1;
    }

    public final int a()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel);
    }

}
