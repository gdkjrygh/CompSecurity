// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzaf, zzq

public class zzae
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzaf();
    final int zzFG;
    final IBinder zzPn;
    private final Scope zzPo[];
    private final int zzQv;
    private final Bundle zzQw;
    private final String zzQx;

    zzae(int i, int j, IBinder ibinder, Scope ascope[], Bundle bundle, String s)
    {
        zzFG = i;
        zzQv = j;
        zzPn = ibinder;
        zzPo = ascope;
        zzQw = bundle;
        zzQx = s;
    }

    public zzae(zzq zzq1, Scope ascope[], String s, Bundle bundle)
    {
        if (zzq1 == null)
        {
            zzq1 = null;
        } else
        {
            zzq1 = zzq1.asBinder();
        }
        this(1, 0x6c42d8, ((IBinder) (zzq1)), ascope, bundle, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCallingPackage()
    {
        return zzQx;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaf.zza(this, parcel, i);
    }

    public int zzjr()
    {
        return zzQv;
    }

    public Scope[] zzjs()
    {
        return zzPo;
    }

    public Bundle zzjt()
    {
        return zzQw;
    }

}
