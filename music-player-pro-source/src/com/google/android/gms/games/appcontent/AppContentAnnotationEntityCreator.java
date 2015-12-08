// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentAnnotationEntity

public class AppContentAnnotationEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentAnnotationEntityCreator()
    {
    }

    static void a(AppContentAnnotationEntity appcontentannotationentity, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, appcontentannotationentity.getDescription(), false);
        b.c(parcel, 1000, appcontentannotationentity.getVersionCode());
        b.a(parcel, 2, appcontentannotationentity.kL(), i, false);
        b.a(parcel, 3, appcontentannotationentity.getTitle(), false);
        b.a(parcel, 4, appcontentannotationentity.getType(), false);
        b.H(parcel, j);
    }

    public AppContentAnnotationEntity co(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s1 = null;
        Uri uri = null;
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
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AppContentAnnotationEntity(i, s2, uri, s1, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return co(parcel);
    }

    public AppContentAnnotationEntity[] dJ(int i)
    {
        return new AppContentAnnotationEntity[i];
    }

    public Object[] newArray(int i)
    {
        return dJ(i);
    }
}
