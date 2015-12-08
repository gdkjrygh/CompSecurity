// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

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
        int j = c.a(parcel);
        c.a(parcel, 1, facldata.a);
        c.a(parcel, 2, facldata.b, i, false);
        c.a(parcel, 3, facldata.c, false);
        c.a(parcel, 4, facldata.d);
        c.a(parcel, 5, facldata.e, false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    faclconfig = (FACLConfig)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, FACLConfig.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
