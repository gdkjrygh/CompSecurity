// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;

public final class csf
    implements android.os.Parcelable.Creator
{

    public csf()
    {
    }

    public static void a(RemoveListenerRequest removelistenerrequest, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, removelistenerrequest.a);
        if (removelistenerrequest.b == null)
        {
            removelistenerrequest = null;
        } else
        {
            removelistenerrequest = removelistenerrequest.b.asBinder();
        }
        brp.a(parcel, 2, removelistenerrequest);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.a(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
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
                    ibinder = zza.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RemoveListenerRequest(i, ibinder);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new RemoveListenerRequest[i];
    }
}
