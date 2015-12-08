// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.signin.internal:
//            RecordConsentRequest

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(RecordConsentRequest recordconsentrequest, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, recordconsentrequest.a);
        zzb.zza(parcel, 2, recordconsentrequest.b, i, false);
        zzb.zza(parcel, 3, recordconsentrequest.c, i, false);
        zzb.zza(parcel, 4, recordconsentrequest.d, false);
        zzb.zzH(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.zzaj(parcel);
        Scope ascope[] = null;
        Account account = null;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.zzai(parcel);
                switch (zza.zzbH(k))
                {
                default:
                    zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    account = (Account)zza.zza(parcel, k, Account.CREATOR);
                    break;

                case 3: // '\003'
                    ascope = (Scope[])zza.zzb(parcel, k, Scope.CREATOR);
                    break;

                case 4: // '\004'
                    s = zza.zzo(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RecordConsentRequest(i, account, ascope, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new RecordConsentRequest[i];
    }
}
