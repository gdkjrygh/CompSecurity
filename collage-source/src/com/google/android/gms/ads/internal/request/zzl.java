// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            LargeParcelTeleporter

public class zzl
    implements android.os.Parcelable.Creator
{

    public zzl()
    {
    }

    static void zza(LargeParcelTeleporter largeparcelteleporter, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, largeparcelteleporter.mVersionCode);
        b.a(parcel, 2, largeparcelteleporter.zzEo, i, false);
        b.a(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzm(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzF(i);
    }

    public LargeParcelTeleporter[] zzF(int i)
    {
        return new LargeParcelTeleporter[i];
    }

    public LargeParcelTeleporter zzm(Parcel parcel)
    {
        int j = a.b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelfiledescriptor = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = a.a(parcel);
                switch (a.a(k))
                {
                default:
                    a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = a.d(parcel, k);
                    break;

                case 2: // '\002'
                    parcelfiledescriptor = (ParcelFileDescriptor)a.a(parcel, k, ParcelFileDescriptor.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LargeParcelTeleporter(i, parcelfiledescriptor);
            }
        } while (true);
    }
}
