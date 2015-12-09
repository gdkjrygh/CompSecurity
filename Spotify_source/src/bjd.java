// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bjd
    implements android.os.Parcelable.Creator
{

    public bjd()
    {
    }

    public static void a(CapabilityParcel capabilityparcel, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, capabilityparcel.a);
        brp.a(parcel, 2, capabilityparcel.b);
        brp.a(parcel, 3, capabilityparcel.c);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag1 = false;
        int j = zza.a(parcel);
        boolean flag = false;
        int i = 0;
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
                    flag = zza.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = zza.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CapabilityParcel(i, flag, flag1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CapabilityParcel[i];
    }
}
