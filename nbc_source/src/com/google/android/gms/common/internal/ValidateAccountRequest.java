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
//            zzaa

public class ValidateAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzaa();
    final int zzCY;
    final IBinder zzZO;
    private final Scope zzZP[];
    private final int zzabg;
    private final Bundle zzabh;
    private final String zzabi;

    ValidateAccountRequest(int i, int j, IBinder ibinder, Scope ascope[], Bundle bundle, String s)
    {
        zzCY = i;
        zzabg = j;
        zzZO = ibinder;
        zzZP = ascope;
        zzabh = bundle;
        zzabi = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCallingPackage()
    {
        return zzabi;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaa.zza(this, parcel, i);
    }

    public int zzod()
    {
        return zzabg;
    }

    public Scope[] zzoe()
    {
        return zzZP;
    }

    public Bundle zzof()
    {
        return zzabh;
    }

}
