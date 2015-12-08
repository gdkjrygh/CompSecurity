// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.s;
import com.google.android.gms.location.t;
import com.google.android.gms.location.v;
import com.google.android.gms.location.w;

// Referenced classes of package com.google.android.gms.internal:
//            kd, zzpg

public class zzpi
    implements SafeParcelable
{

    public static final kd CREATOR = new kd();
    int a;
    zzpg b;
    s c;
    PendingIntent d;
    v e;
    private final int f;

    zzpi(int i, int j, zzpg zzpg, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1)
    {
        Object obj = null;
        super();
        f = i;
        a = j;
        b = zzpg;
        if (ibinder == null)
        {
            zzpg = null;
        } else
        {
            zzpg = t.a(ibinder);
        }
        c = zzpg;
        d = pendingintent;
        if (ibinder1 == null)
        {
            zzpg = obj;
        } else
        {
            zzpg = w.a(ibinder1);
        }
        e = zzpg;
    }

    public static zzpi a(zzpg zzpg, s s1)
    {
        return new zzpi(1, 1, zzpg, s1.asBinder(), null, null);
    }

    public static zzpi a(s s1)
    {
        return new zzpi(1, 2, null, s1.asBinder(), null, null);
    }

    public static zzpi a(v v1)
    {
        return new zzpi(1, 2, null, null, null, v1.asBinder());
    }

    final int a()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kd.a(this, parcel, i);
    }

}
