// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;

public final class csz
    implements android.os.Parcelable.Creator
{

    public csz()
    {
    }

    public static void a(CapabilityInfoParcelable capabilityinfoparcelable, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, capabilityinfoparcelable.a);
        brp.a(parcel, 2, capabilityinfoparcelable.b);
        brp.b(parcel, 3, capabilityinfoparcelable.c);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = zza.a(parcel);
        int i = 0;
        String s = null;
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
                    s = zza.h(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = zza.c(parcel, k, NodeParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CapabilityInfoParcelable(i, s, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CapabilityInfoParcelable[i];
    }
}
