// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AncsNotificationParcelable

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void a(AncsNotificationParcelable ancsnotificationparcelable, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, ancsnotificationparcelable.a);
        zzb.a(parcel, 2, ancsnotificationparcelable.a());
        zzb.a(parcel, 3, ancsnotificationparcelable.b(), false);
        zzb.a(parcel, 4, ancsnotificationparcelable.c(), false);
        zzb.a(parcel, 5, ancsnotificationparcelable.d(), false);
        zzb.a(parcel, 6, ancsnotificationparcelable.e(), false);
        zzb.a(parcel, 7, ancsnotificationparcelable.f(), false);
        zzb.a(parcel, 8, ancsnotificationparcelable.g(), false);
        zzb.a(parcel, 9, ancsnotificationparcelable.h());
        zzb.a(parcel, 10, ancsnotificationparcelable.i());
        zzb.a(parcel, 11, ancsnotificationparcelable.j());
        zzb.a(parcel, 12, ancsnotificationparcelable.k());
        zzb.a(parcel, i);
    }

    public AncsNotificationParcelable a(Parcel parcel)
    {
        int k = zza.b(parcel);
        int j = 0;
        int i = 0;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        byte byte3 = 0;
        byte byte2 = 0;
        byte byte1 = 0;
        byte byte0 = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    i = zza.f(parcel, l);
                    break;

                case 3: // '\003'
                    s5 = zza.m(parcel, l);
                    break;

                case 4: // '\004'
                    s4 = zza.m(parcel, l);
                    break;

                case 5: // '\005'
                    s3 = zza.m(parcel, l);
                    break;

                case 6: // '\006'
                    s2 = zza.m(parcel, l);
                    break;

                case 7: // '\007'
                    s1 = zza.m(parcel, l);
                    break;

                case 8: // '\b'
                    s = zza.m(parcel, l);
                    break;

                case 9: // '\t'
                    byte3 = zza.d(parcel, l);
                    break;

                case 10: // '\n'
                    byte2 = zza.d(parcel, l);
                    break;

                case 11: // '\013'
                    byte1 = zza.d(parcel, l);
                    break;

                case 12: // '\f'
                    byte0 = zza.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new AncsNotificationParcelable(j, i, s5, s4, s3, s2, s1, s, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public AncsNotificationParcelable[] a(int i)
    {
        return new AncsNotificationParcelable[i];
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
