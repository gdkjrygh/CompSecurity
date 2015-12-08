// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            FACLConfig

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(FACLConfig faclconfig, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, faclconfig.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, faclconfig.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, faclconfig.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, faclconfig.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, faclconfig.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, faclconfig.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, faclconfig.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = zza.a(parcel);
        String s = null;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
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
                    flag4 = zza.c(parcel, k);
                    break;

                case 3: // '\003'
                    s = zza.l(parcel, k);
                    break;

                case 4: // '\004'
                    flag3 = zza.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag2 = zza.c(parcel, k);
                    break;

                case 6: // '\006'
                    flag1 = zza.c(parcel, k);
                    break;

                case 7: // '\007'
                    flag = zza.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FACLConfig(i, flag4, s, flag3, flag2, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new FACLConfig[i];
    }
}
