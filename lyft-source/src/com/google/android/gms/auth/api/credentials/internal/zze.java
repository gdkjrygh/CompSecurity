// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.auth.api.credentials.internal:
//            DeleteRequest

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void a(DeleteRequest deleterequest, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, deleterequest.a(), i, false);
        zzb.a(parcel, 1000, deleterequest.a);
        zzb.a(parcel, j);
    }

    public DeleteRequest a(Parcel parcel)
    {
        int j = zza.b(parcel);
        int i = 0;
        Credential credential = null;
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
                    credential = (Credential)zza.a(parcel, k, Credential.CREATOR);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DeleteRequest(i, credential);
            }
        } while (true);
    }

    public DeleteRequest[] a(int i)
    {
        return new DeleteRequest[i];
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
