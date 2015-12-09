// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            ae, zza

public final class zzp
    implements SafeParcelable
{

    public static final ae CREATOR = new ae();
    private final int a;
    private zza b;

    public zzp()
    {
        a = 1;
    }

    zzp(int i, zza zza)
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
        ae.a(this, parcel, i);
    }

}
