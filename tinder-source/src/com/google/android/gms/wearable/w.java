// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable:
//            PutDataRequest

public final class w
    implements android.os.Parcelable.Creator
{

    public w()
    {
    }

    static void a(PutDataRequest putdatarequest, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, putdatarequest.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, putdatarequest.b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, putdatarequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, putdatarequest.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.a(parcel);
        android.os.Bundle bundle = null;
        Uri uri = null;
        int i = 0;
        byte abyte0[] = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 3: // '\003'
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    uri = (Uri)zza.a(parcel, k, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    bundle = zza.n(parcel, k);
                    break;

                case 5: // '\005'
                    abyte0 = zza.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PutDataRequest(i, uri, bundle, abyte0);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PutDataRequest[i];
    }
}
