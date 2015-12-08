// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            DeleteDataItemsResponse

public class zzad
    implements android.os.Parcelable.Creator
{

    public zzad()
    {
    }

    static void a(DeleteDataItemsResponse deletedataitemsresponse, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, deletedataitemsresponse.a);
        zzb.a(parcel, 2, deletedataitemsresponse.b);
        zzb.a(parcel, 3, deletedataitemsresponse.c);
        zzb.a(parcel, i);
    }

    public DeleteDataItemsResponse a(Parcel parcel)
    {
        int k = 0;
        int l = zza.b(parcel);
        int j = 0;
        int i = 0;
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
                    i = zza.f(parcel, i1);
                    break;

                case 2: // '\002'
                    j = zza.f(parcel, i1);
                    break;

                case 3: // '\003'
                    k = zza.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new DeleteDataItemsResponse(i, j, k);
            }
        } while (true);
    }

    public DeleteDataItemsResponse[] a(int i)
    {
        return new DeleteDataItemsResponse[i];
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
