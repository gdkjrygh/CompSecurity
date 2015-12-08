// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, googlemapoptions.getVersionCode());
        zzb.zza(parcel, 2, googlemapoptions.zzqh());
        zzb.zza(parcel, 3, googlemapoptions.zzqi());
        zzb.zzc(parcel, 4, googlemapoptions.getMapType());
        zzb.zza(parcel, 5, googlemapoptions.getCamera(), i, false);
        zzb.zza(parcel, 6, googlemapoptions.zzqj());
        zzb.zza(parcel, 7, googlemapoptions.zzqk());
        zzb.zza(parcel, 8, googlemapoptions.zzql());
        zzb.zza(parcel, 9, googlemapoptions.zzqm());
        zzb.zza(parcel, 10, googlemapoptions.zzqn());
        zzb.zza(parcel, 11, googlemapoptions.zzqo());
        zzb.zza(parcel, 12, googlemapoptions.zzqp());
        zzb.zza(parcel, 14, googlemapoptions.zzqq());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdP(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfS(i);
    }

    public GoogleMapOptions zzdP(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
        int j = 0;
        byte byte9 = 0;
        byte byte8 = 0;
        int i = 0;
        CameraPosition cameraposition = null;
        byte byte7 = 0;
        byte byte6 = 0;
        byte byte5 = 0;
        byte byte4 = 0;
        byte byte3 = 0;
        byte byte2 = 0;
        byte byte1 = 0;
        byte byte0 = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzI(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaP(l))
                {
                case 13: // '\r'
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    byte9 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 3: // '\003'
                    byte8 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 5: // '\005'
                    cameraposition = (CameraPosition)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, CameraPosition.CREATOR);
                    break;

                case 6: // '\006'
                    byte7 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 7: // '\007'
                    byte6 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 8: // '\b'
                    byte5 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 9: // '\t'
                    byte4 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 10: // '\n'
                    byte3 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 11: // '\013'
                    byte2 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 12: // '\f'
                    byte1 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 14: // '\016'
                    byte0 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GoogleMapOptions(j, byte9, byte8, i, cameraposition, byte7, byte6, byte5, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public GoogleMapOptions[] zzfS(int i)
    {
        return new GoogleMapOptions[i];
    }
}
