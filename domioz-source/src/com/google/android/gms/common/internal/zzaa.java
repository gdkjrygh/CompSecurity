// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            d, ac, ab

public class zzaa
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final int a;
    IBinder b;
    private ConnectionResult c;
    private boolean d;
    private boolean e;

    public zzaa()
    {
        this(new ConnectionResult(8, null));
    }

    zzaa(int i, IBinder ibinder, ConnectionResult connectionresult, boolean flag, boolean flag1)
    {
        a = i;
        b = ibinder;
        c = connectionresult;
        d = flag;
        e = flag1;
    }

    private zzaa(ConnectionResult connectionresult)
    {
        this(1, null, connectionresult, false, false);
    }

    public final ab a()
    {
        return ac.a(b);
    }

    public final ConnectionResult b()
    {
        return c;
    }

    public final boolean c()
    {
        return d;
    }

    public final boolean d()
    {
        return e;
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
            if (!c.equals(((zzaa) (obj)).c) || !ac.a(b).equals(ac.a(((zzaa) (obj)).b)))
            {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.internal.d.a(this, parcel, i);
    }

}
