// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzx, zzo

public class ResolveAccountResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzx();
    private boolean zzQe;
    private ConnectionResult zzRm;
    IBinder zzSS;
    private boolean zzUb;
    final int zzzH;

    public ResolveAccountResponse(int i)
    {
        this(new ConnectionResult(i, null));
    }

    ResolveAccountResponse(int i, IBinder ibinder, ConnectionResult connectionresult, boolean flag, boolean flag1)
    {
        zzzH = i;
        zzSS = ibinder;
        zzRm = connectionresult;
        zzQe = flag;
        zzUb = flag1;
    }

    public ResolveAccountResponse(ConnectionResult connectionresult)
    {
        this(1, null, connectionresult, false, false);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ResolveAccountResponse))
            {
                return false;
            }
            obj = (ResolveAccountResponse)obj;
            if (!zzRm.equals(((ResolveAccountResponse) (obj)).zzRm) || !zzmm().equals(((ResolveAccountResponse) (obj)).zzmm()))
            {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzx.zza(this, parcel, i);
    }

    public zzo zzmm()
    {
        return zzo.zza.zzQ(zzSS);
    }

    public ConnectionResult zzmn()
    {
        return zzRm;
    }

    public boolean zzmo()
    {
        return zzQe;
    }

    public boolean zzmp()
    {
        return zzUb;
    }

}
