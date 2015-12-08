// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable:
//            Asset

public final class t
    implements android.os.Parcelable.Creator
{

    public t()
    {
    }

    static void a(Asset asset, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, asset.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, asset.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, asset.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, asset.d, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, asset.e, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Uri uri = null;
        int j = zza.a(parcel);
        int i = 0;
        ParcelFileDescriptor parcelfiledescriptor = null;
        String s = null;
        byte abyte0[] = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    abyte0 = zza.o(parcel, k);
                    break;

                case 3: // '\003'
                    s = zza.l(parcel, k);
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
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new Asset(i, abyte0, s, parcelfiledescriptor, uri);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new Asset[i];
    }
}
