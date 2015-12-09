// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.cast:
//            ApplicationMetadata

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(ApplicationMetadata applicationmetadata, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, applicationmetadata.getVersionCode());
        zzb.zza(parcel, 2, applicationmetadata.getApplicationId(), false);
        zzb.zza(parcel, 3, applicationmetadata.getName(), false);
        zzb.zzc(parcel, 4, applicationmetadata.getImages(), false);
        zzb.zzb(parcel, 5, applicationmetadata.zzLF, false);
        zzb.zza(parcel, 6, applicationmetadata.getSenderAppIdentifier(), false);
        zzb.zza(parcel, 7, applicationmetadata.zzjR(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzv(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzag(i);
    }

    public ApplicationMetadata[] zzag(int i)
    {
        return new ApplicationMetadata[i];
    }

    public ApplicationMetadata zzv(Parcel parcel)
    {
        Uri uri = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        String s = null;
        java.util.ArrayList arraylist = null;
        java.util.ArrayList arraylist1 = null;
        String s1 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaV(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, WebImage.CREATOR);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, k);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 7: // '\007'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ApplicationMetadata(i, s2, s1, arraylist1, arraylist, s, uri);
            }
        } while (true);
    }
}
