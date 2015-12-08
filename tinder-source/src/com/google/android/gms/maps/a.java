// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, googlemapoptions.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, com.google.android.gms.maps.a.a.a(googlemapoptions.b));
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, com.google.android.gms.maps.a.a.a(googlemapoptions.c));
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, googlemapoptions.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, googlemapoptions.e, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, com.google.android.gms.maps.a.a.a(googlemapoptions.f));
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, com.google.android.gms.maps.a.a.a(googlemapoptions.g));
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, com.google.android.gms.maps.a.a.a(googlemapoptions.h));
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, com.google.android.gms.maps.a.a.a(googlemapoptions.i));
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, com.google.android.gms.maps.a.a.a(googlemapoptions.j));
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, com.google.android.gms.maps.a.a.a(googlemapoptions.k));
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, com.google.android.gms.maps.a.a.a(googlemapoptions.l));
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 14, com.google.android.gms.maps.a.a.a(googlemapoptions.m));
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 15, com.google.android.gms.maps.a.a.a(googlemapoptions.n));
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = zza.a(parcel);
        int j = 0;
        byte byte10 = -1;
        byte byte9 = -1;
        int i = 0;
        CameraPosition cameraposition = null;
        byte byte8 = -1;
        byte byte7 = -1;
        byte byte6 = -1;
        byte byte5 = -1;
        byte byte4 = -1;
        byte byte3 = -1;
        byte byte2 = -1;
        byte byte1 = -1;
        byte byte0 = -1;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 13: // '\r'
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    byte10 = zza.d(parcel, l);
                    break;

                case 3: // '\003'
                    byte9 = zza.d(parcel, l);
                    break;

                case 4: // '\004'
                    i = zza.e(parcel, l);
                    break;

                case 5: // '\005'
                    cameraposition = (CameraPosition)zza.a(parcel, l, CameraPosition.CREATOR);
                    break;

                case 6: // '\006'
                    byte8 = zza.d(parcel, l);
                    break;

                case 7: // '\007'
                    byte7 = zza.d(parcel, l);
                    break;

                case 8: // '\b'
                    byte6 = zza.d(parcel, l);
                    break;

                case 9: // '\t'
                    byte5 = zza.d(parcel, l);
                    break;

                case 10: // '\n'
                    byte4 = zza.d(parcel, l);
                    break;

                case 11: // '\013'
                    byte3 = zza.d(parcel, l);
                    break;

                case 12: // '\f'
                    byte2 = zza.d(parcel, l);
                    break;

                case 14: // '\016'
                    byte1 = zza.d(parcel, l);
                    break;

                case 15: // '\017'
                    byte0 = zza.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GoogleMapOptions(j, byte10, byte9, i, cameraposition, byte8, byte7, byte6, byte5, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GoogleMapOptions[i];
    }
}
