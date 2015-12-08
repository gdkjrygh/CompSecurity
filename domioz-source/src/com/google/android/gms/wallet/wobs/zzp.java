// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            j, zzl, zzn

public final class zzp
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    String a;
    String b;
    zzl c;
    zzn d;
    zzn e;
    private final int f;

    zzp()
    {
        f = 1;
    }

    zzp(int i, String s, String s1, zzl zzl, zzn zzn, zzn zzn1)
    {
        f = i;
        a = s;
        b = s1;
        c = zzl;
        d = zzn;
        e = zzn1;
    }

    public final int a()
    {
        return f;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
