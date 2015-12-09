// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.common.images:
//            WebImage

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(WebImage webimage, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.p(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, webimage.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, webimage.getUrl(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 3, webimage.getWidth());
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 4, webimage.getHeight());
        com.google.android.gms.common.internal.safeparcel.b.F(parcel, j);
    }

    public WebImage[] K(int i)
    {
        return new WebImage[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return l(parcel);
    }

    public WebImage l(Parcel parcel)
    {
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        Uri uri = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new WebImage(k, uri, j, i);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return K(i);
    }
}
