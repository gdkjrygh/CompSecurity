// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.signin:
//            GoogleSignInAccount

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(GoogleSignInAccount googlesigninaccount, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, googlesigninaccount.a);
        zzb.zza(parcel, 2, googlesigninaccount.b, false);
        zzb.zza(parcel, 3, googlesigninaccount.c, false);
        zzb.zza(parcel, 4, googlesigninaccount.d, false);
        zzb.zza(parcel, 5, googlesigninaccount.e, false);
        zzb.zza(parcel, 6, googlesigninaccount.f, i, false);
        zzb.zzH(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Uri uri = null;
        int j = zza.zzaj(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    s3 = zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = zza.zzo(parcel, k);
                    break;

                case 5: // '\005'
                    s = zza.zzo(parcel, k);
                    break;

                case 6: // '\006'
                    uri = (Uri)zza.zza(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GoogleSignInAccount(i, s3, s2, s1, s, uri);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GoogleSignInAccount[i];
    }
}
