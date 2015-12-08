// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            bn, at, as

public class ResolveAccountResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bn();
    final int a;
    IBinder b;
    private ConnectionResult c;
    private boolean d;
    private boolean e;

    public ResolveAccountResponse()
    {
        this(new ConnectionResult(8, null));
    }

    ResolveAccountResponse(int i, IBinder ibinder, ConnectionResult connectionresult, boolean flag, boolean flag1)
    {
        a = i;
        b = ibinder;
        c = connectionresult;
        d = flag;
        e = flag1;
    }

    private ResolveAccountResponse(ConnectionResult connectionresult)
    {
        this(1, null, connectionresult, false, false);
    }

    public final as a()
    {
        return at.a(b);
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
            if (!(obj instanceof ResolveAccountResponse))
            {
                return false;
            }
            obj = (ResolveAccountResponse)obj;
            if (!c.equals(((ResolveAccountResponse) (obj)).c) || !at.a(b).equals(at.a(((ResolveAccountResponse) (obj)).b)))
            {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bn.a(this, parcel, i);
    }

}
