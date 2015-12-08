// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            f, zzg, zzl

public final class zzf
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    String a;
    zzg b;
    String c;
    zzl d;
    private final int e;

    zzf()
    {
        e = 1;
    }

    zzf(int i, String s, zzg zzg, String s1, zzl zzl)
    {
        e = i;
        a = s;
        b = zzg;
        c = s1;
        d = zzl;
    }

    public final int a()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
