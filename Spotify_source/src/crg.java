// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.NodeParcelable;

public final class crg
    implements android.os.Parcelable.Creator
{

    public crg()
    {
    }

    public static void a(GetConnectedNodesResponse getconnectednodesresponse, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, getconnectednodesresponse.a);
        brp.b(parcel, 2, getconnectednodesresponse.b);
        brp.b(parcel, 3, getconnectednodesresponse.c);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = zza.a(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.e(parcel, l);
                    break;

                case 3: // '\003'
                    arraylist = zza.c(parcel, l, NodeParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetConnectedNodesResponse(i, j, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetConnectedNodesResponse[i];
    }
}
