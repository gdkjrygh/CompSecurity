// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.common.images:
//            WebImage

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(WebImage webimage, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, webimage.a());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, webimage.b(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 3, webimage.c());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 4, webimage.d());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, j);
    }

    public WebImage a(Parcel parcel)
    {
        int i = 0;
        int l = zza.b(parcel);
        Uri uri = null;
        int j = 0;
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
                    uri = (Uri)zza.a(parcel, i1, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    j = zza.f(parcel, i1);
                    break;

                case 4: // '\004'
                    i = zza.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new WebImage(k, uri, j, i);
            }
        } while (true);
    }

    public WebImage[] a(int i)
    {
        return new WebImage[i];
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
