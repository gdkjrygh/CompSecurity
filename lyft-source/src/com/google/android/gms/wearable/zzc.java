// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable:
//            Asset

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(Asset asset, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, asset.a);
        zzb.a(parcel, 2, asset.a(), false);
        zzb.a(parcel, 3, asset.b(), false);
        zzb.a(parcel, 4, asset.b, i, false);
        zzb.a(parcel, 5, asset.c, i, false);
        zzb.a(parcel, j);
    }

    public Asset a(Parcel parcel)
    {
        Uri uri = null;
        int j = zza.b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelfiledescriptor = null;
        String s = null;
        byte abyte0[] = null;
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
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    abyte0 = zza.p(parcel, k);
                    break;

                case 3: // '\003'
                    s = zza.m(parcel, k);
                    break;

                case 4: // '\004'
                    parcelfiledescriptor = (ParcelFileDescriptor)zza.a(parcel, k, ParcelFileDescriptor.CREATOR);
                    break;

                case 5: // '\005'
                    uri = (Uri)zza.a(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new Asset(i, abyte0, s, parcelfiledescriptor, uri);
            }
        } while (true);
    }

    public Asset[] a(int i)
    {
        return new Asset[i];
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
