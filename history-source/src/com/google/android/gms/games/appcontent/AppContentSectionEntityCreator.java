// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentSectionEntity, AppContentActionEntity, AppContentCardEntity

public class AppContentSectionEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentSectionEntityCreator()
    {
    }

    static void a(AppContentSectionEntity appcontentsectionentity, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, appcontentsectionentity.getActions(), false);
        b.c(parcel, 1000, appcontentsectionentity.getVersionCode());
        b.a(parcel, 2, appcontentsectionentity.kY(), i, false);
        b.c(parcel, 3, appcontentsectionentity.kZ(), false);
        b.a(parcel, 4, appcontentsectionentity.kI(), false);
        b.a(parcel, 5, appcontentsectionentity.kP(), false);
        b.a(parcel, 6, appcontentsectionentity.kQ(), false);
        b.a(parcel, 7, appcontentsectionentity.getTitle(), false);
        b.a(parcel, 8, appcontentsectionentity.getType(), false);
        b.H(parcel, j);
    }

    public AppContentSectionEntity cr(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        android.os.Bundle bundle = null;
        String s3 = null;
        java.util.ArrayList arraylist = null;
        Uri uri = null;
        java.util.ArrayList arraylist1 = null;
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
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, AppContentActionEntity.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, AppContentCardEntity.CREATOR);
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AppContentSectionEntity(i, arraylist1, uri, arraylist, s3, bundle, s2, s1, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cr(parcel);
    }

    public AppContentSectionEntity[] dM(int i)
    {
        return new AppContentSectionEntity[i];
    }

    public Object[] newArray(int i)
    {
        return dM(i);
    }
}
