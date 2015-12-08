// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentConditionEntity

public class AppContentConditionEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentConditionEntityCreator()
    {
    }

    static void a(AppContentConditionEntity appcontentconditionentity, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.a(parcel, 1, appcontentconditionentity.kT(), false);
        b.c(parcel, 1000, appcontentconditionentity.getVersionCode());
        b.a(parcel, 2, appcontentconditionentity.kU(), false);
        b.a(parcel, 3, appcontentconditionentity.kV(), false);
        b.a(parcel, 4, appcontentconditionentity.kW(), false);
        b.H(parcel, i);
    }

    public AppContentConditionEntity cq(Parcel parcel)
    {
        android.os.Bundle bundle = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AppContentConditionEntity(i, s2, s1, s, bundle);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cq(parcel);
    }

    public AppContentConditionEntity[] dL(int i)
    {
        return new AppContentConditionEntity[i];
    }

    public Object[] newArray(int i)
    {
        return dL(i);
    }
}
