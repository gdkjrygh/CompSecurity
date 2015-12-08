// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.data:
//            BitmapTeleporter

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void a(BitmapTeleporter bitmapteleporter, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, bitmapteleporter.a);
        zzb.a(parcel, 2, bitmapteleporter.b, i, false);
        zzb.a(parcel, 3, bitmapteleporter.c);
        zzb.a(parcel, j);
    }

    public BitmapTeleporter a(Parcel parcel)
    {
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.b(parcel);
        ParcelFileDescriptor parcelfiledescriptor = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.a(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    parcelfiledescriptor = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.zza.a(parcel, l, ParcelFileDescriptor.CREATOR);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new BitmapTeleporter(j, parcelfiledescriptor, i);
            }
        } while (true);
    }

    public BitmapTeleporter[] a(int i)
    {
        return new BitmapTeleporter[i];
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
