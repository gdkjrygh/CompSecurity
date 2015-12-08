// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzd, zzq

public class zzc
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    final int zzFG;
    final IBinder zzPn;
    final Scope zzPo[];

    zzc(int i, IBinder ibinder, Scope ascope[])
    {
        zzFG = i;
        zzPn = ibinder;
        zzPo = ascope;
    }

    public zzc(zzq zzq1, Set set)
    {
        this(1, zzq1.asBinder(), (Scope[])set.toArray(new Scope[set.size()]));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

}
