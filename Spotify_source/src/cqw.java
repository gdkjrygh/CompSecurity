// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;

public final class cqw
    implements android.os.Parcelable.Creator
{

    public cqw()
    {
    }

    public static void a(DeleteDataItemsResponse deletedataitemsresponse, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, deletedataitemsresponse.a);
        brp.b(parcel, 2, deletedataitemsresponse.b);
        brp.b(parcel, 3, deletedataitemsresponse.c);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = zza.a(parcel);
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    j = zza.e(parcel, i1);
                    break;

                case 3: // '\003'
                    k = zza.e(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new DeleteDataItemsResponse(i, j, k);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new DeleteDataItemsResponse[i];
    }
}
