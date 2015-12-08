// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            FACLData, FACLConfig

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(FACLData facldata, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, facldata.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, facldata.b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, facldata.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, facldata.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, facldata.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = zza.a(parcel);
        String s1 = null;
        FACLConfig faclconfig = null;
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
                    faclconfig = (FACLConfig)zza.a(parcel, k, FACLConfig.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = zza.l(parcel, k);
                    break;

                case 4: // '\004'
                    flag = zza.c(parcel, k);
                    break;

                case 5: // '\005'
                    s = zza.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FACLData(i, faclconfig, s1, flag, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new FACLData[i];
    }
}
