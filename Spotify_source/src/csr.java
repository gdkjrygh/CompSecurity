// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.IntentFilter;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.AddListenerRequest;

public final class csr
    implements android.os.Parcelable.Creator
{

    public csr()
    {
    }

    public static void a(AddListenerRequest addlistenerrequest, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, addlistenerrequest.a);
        android.os.IBinder ibinder;
        if (addlistenerrequest.b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = addlistenerrequest.b.asBinder();
        }
        brp.a(parcel, 2, ibinder);
        brp.a(parcel, 3, addlistenerrequest.c, i);
        brp.a(parcel, 4, addlistenerrequest.d);
        brp.a(parcel, 5, addlistenerrequest.e);
        brp.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = zza.a(parcel);
        int i = 0;
        String s1 = null;
        IntentFilter aintentfilter[] = null;
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

                case 3: // '\003'
                    aintentfilter = (IntentFilter[])zza.b(parcel, k, IntentFilter.CREATOR);
                    break;

                case 4: // '\004'
                    s1 = zza.h(parcel, k);
                    break;

                case 5: // '\005'
                    s = zza.h(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AddListenerRequest(i, ibinder, aintentfilter, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AddListenerRequest[i];
    }
}
