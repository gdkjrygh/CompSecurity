// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable:
//            ConnectionConfiguration

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void a(ConnectionConfiguration connectionconfiguration, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, connectionconfiguration.a);
        zzb.a(parcel, 2, connectionconfiguration.a(), false);
        zzb.a(parcel, 3, connectionconfiguration.b(), false);
        zzb.a(parcel, 4, connectionconfiguration.c());
        zzb.a(parcel, 5, connectionconfiguration.d());
        zzb.a(parcel, 6, connectionconfiguration.i());
        zzb.a(parcel, 7, connectionconfiguration.e());
        zzb.a(parcel, 8, connectionconfiguration.f(), false);
        zzb.a(parcel, 9, connectionconfiguration.g());
        zzb.a(parcel, 10, connectionconfiguration.h(), false);
        zzb.a(parcel, i);
    }

    public ConnectionConfiguration a(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = zza.b(parcel);
        String s1 = null;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
        int j = 0;
        String s2 = null;
        String s3 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = zza.a(parcel);
                switch (zza.a(i1))
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.f(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = zza.m(parcel, i1);
                    break;

                case 3: // '\003'
                    s2 = zza.m(parcel, i1);
                    break;

                case 4: // '\004'
                    j = zza.f(parcel, i1);
                    break;

                case 5: // '\005'
                    i = zza.f(parcel, i1);
                    break;

                case 6: // '\006'
                    flag2 = zza.c(parcel, i1);
                    break;

                case 7: // '\007'
                    flag1 = zza.c(parcel, i1);
                    break;

                case 8: // '\b'
                    s1 = zza.m(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = zza.c(parcel, i1);
                    break;

                case 10: // '\n'
                    s = zza.m(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ConnectionConfiguration(k, s3, s2, j, i, flag2, flag1, s1, flag, s);
            }
        } while (true);
    }

    public ConnectionConfiguration[] a(int i)
    {
        return new ConnectionConfiguration[i];
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
