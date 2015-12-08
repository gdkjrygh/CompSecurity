// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentCardEntity, AppContentActionEntity, AppContentAnnotationEntity, AppContentConditionEntity

public class AppContentCardEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentCardEntityCreator()
    {
    }

    static void a(AppContentCardEntity appcontentcardentity, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, appcontentcardentity.getActions(), false);
        b.c(parcel, 1000, appcontentcardentity.getVersionCode());
        b.c(parcel, 2, appcontentcardentity.kN(), false);
        b.c(parcel, 3, appcontentcardentity.kH(), false);
        b.a(parcel, 4, appcontentcardentity.kI(), false);
        b.c(parcel, 5, appcontentcardentity.kO());
        b.a(parcel, 6, appcontentcardentity.getDescription(), false);
        b.a(parcel, 7, appcontentcardentity.kP(), false);
        b.a(parcel, 8, appcontentcardentity.getIconImageUri(), i, false);
        b.a(parcel, 9, appcontentcardentity.kL(), i, false);
        b.a(parcel, 10, appcontentcardentity.kQ(), false);
        b.a(parcel, 11, appcontentcardentity.getTitle(), false);
        b.c(parcel, 12, appcontentcardentity.kR());
        b.a(parcel, 13, appcontentcardentity.getType(), false);
        b.H(parcel, j);
    }

    public AppContentCardEntity cp(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int k = 0;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist = null;
        String s4 = null;
        int j = 0;
        String s3 = null;
        android.os.Bundle bundle = null;
        Uri uri1 = null;
        Uri uri = null;
        String s2 = null;
        String s1 = null;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, AppContentActionEntity.CREATOR);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, AppContentAnnotationEntity.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, AppContentConditionEntity.CREATOR);
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 6: // '\006'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 7: // '\007'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, i1);
                    break;

                case 8: // '\b'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Uri.CREATOR);
                    break;

                case 10: // '\n'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 11: // '\013'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 13: // '\r'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new AppContentCardEntity(k, arraylist2, arraylist1, arraylist, s4, j, s3, bundle, uri1, uri, s2, s1, i, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cp(parcel);
    }

    public AppContentCardEntity[] dK(int i)
    {
        return new AppContentCardEntity[i];
    }

    public Object[] newArray(int i)
    {
        return dK(i);
    }
}
