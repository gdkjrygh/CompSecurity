// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentActionEntity, AppContentConditionEntity

public class AppContentActionEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentActionEntityCreator()
    {
    }

    static void a(AppContentActionEntity appcontentactionentity, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, appcontentactionentity.kH(), false);
        b.c(parcel, 1000, appcontentactionentity.getVersionCode());
        b.a(parcel, 2, appcontentactionentity.kI(), false);
        b.a(parcel, 3, appcontentactionentity.getExtras(), false);
        b.a(parcel, 4, appcontentactionentity.getLabel(), false);
        b.a(parcel, 5, appcontentactionentity.kJ(), false);
        b.a(parcel, 6, appcontentactionentity.getType(), false);
        b.H(parcel, i);
    }

    public AppContentActionEntity cn(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        android.os.Bundle bundle = null;
        String s3 = null;
        java.util.ArrayList arraylist = null;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, AppContentConditionEntity.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AppContentActionEntity(i, arraylist, s3, bundle, s2, s1, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cn(parcel);
    }

    public AppContentActionEntity[] dI(int i)
    {
        return new AppContentActionEntity[i];
    }

    public Object[] newArray(int i)
    {
        return dI(i);
    }
}
