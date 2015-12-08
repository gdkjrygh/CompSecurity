// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            f, zza

public final class zze
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    private final int a;
    private zza b;

    public zze()
    {
        a = 1;
    }

    zze(int i, zza zza)
    {
        a = i;
        b = zza;
    }

    final int a()
    {
        return a;
    }

    public final zza b()
    {
        return b;
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
