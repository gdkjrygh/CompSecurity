// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.internal:
//            AuthAccountRequest

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(AuthAccountRequest authaccountrequest, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, authaccountrequest.a);
        zzb.a(parcel, 2, authaccountrequest.b, false);
        zzb.a(parcel, 3, authaccountrequest.c, i, false);
        zzb.a(parcel, j);
    }

    public AuthAccountRequest a(Parcel parcel)
    {
        Scope ascope[] = null;
        int j = zza.b(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = zza.n(parcel, k);
                    break;

                case 3: // '\003'
                    ascope = (Scope[])zza.b(parcel, k, Scope.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AuthAccountRequest(i, ibinder, ascope);
            }
        } while (true);
    }

    public AuthAccountRequest[] a(int i)
    {
        return new AuthAccountRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
