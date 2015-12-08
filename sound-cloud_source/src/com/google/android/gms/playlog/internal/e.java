// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            PlayLoggerContext

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    public static PlayLoggerContext a(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int i1 = zza.zzaj(parcel);
        boolean flag1 = true;
        boolean flag = false;
        String s1 = null;
        String s2 = null;
        int j = 0;
        int k = 0;
        String s3 = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = zza.zzai(parcel);
                switch (zza.zzbH(j1))
                {
                default:
                    zza.zzb(parcel, j1);
                    break;

                case 1: // '\001'
                    l = zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    s3 = zza.zzo(parcel, j1);
                    break;

                case 3: // '\003'
                    k = zza.zzg(parcel, j1);
                    break;

                case 4: // '\004'
                    j = zza.zzg(parcel, j1);
                    break;

                case 5: // '\005'
                    s2 = zza.zzo(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = zza.zzo(parcel, j1);
                    break;

                case 7: // '\007'
                    flag1 = zza.zzc(parcel, j1);
                    break;

                case 8: // '\b'
                    s = zza.zzo(parcel, j1);
                    break;

                case 9: // '\t'
                    flag = zza.zzc(parcel, j1);
                    break;

                case 10: // '\n'
                    i = zza.zzg(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new PlayLoggerContext(l, s3, k, j, s2, s1, flag1, s, flag, i);
            }
        } while (true);
    }

    static void a(PlayLoggerContext playloggercontext, Parcel parcel)
    {
        int i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, playloggercontext.a);
        zzb.zza(parcel, 2, playloggercontext.b, false);
        zzb.zzc(parcel, 3, playloggercontext.c);
        zzb.zzc(parcel, 4, playloggercontext.d);
        zzb.zza(parcel, 5, playloggercontext.e, false);
        zzb.zza(parcel, 6, playloggercontext.f, false);
        zzb.zza(parcel, 7, playloggercontext.g);
        zzb.zza(parcel, 8, playloggercontext.h, false);
        zzb.zza(parcel, 9, playloggercontext.i);
        zzb.zzc(parcel, 10, playloggercontext.j);
        zzb.zzH(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new PlayLoggerContext[i];
    }
}
