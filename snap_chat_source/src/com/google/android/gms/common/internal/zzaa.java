// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzab, zzq

public class zzaa
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzab();
    final int zzFG;
    private boolean zzMT;
    private ConnectionResult zzNB;
    IBinder zzPn;
    private boolean zzQt;

    public zzaa(int i)
    {
        this(new ConnectionResult(i, null));
    }

    zzaa(int i, IBinder ibinder, ConnectionResult connectionresult, boolean flag, boolean flag1)
    {
        zzFG = i;
        zzPn = ibinder;
        zzNB = connectionresult;
        zzMT = flag;
        zzQt = flag1;
    }

    public zzaa(ConnectionResult connectionresult)
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
            if (!(obj instanceof zzaa))
            {
                return false;
            }
            obj = (zzaa)obj;
            if (!zzNB.equals(((zzaa) (obj)).zzNB) || !zzjn().equals(((zzaa) (obj)).zzjn()))
            {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzab.zza(this, parcel, i);
    }

    public zzq zzjn()
    {
        return zzq.zza.zzR(zzPn);
    }

    public ConnectionResult zzjo()
    {
        return zzNB;
    }

    public boolean zzjp()
    {
        return zzMT;
    }

    public boolean zzjq()
    {
        return zzQt;
    }

}
