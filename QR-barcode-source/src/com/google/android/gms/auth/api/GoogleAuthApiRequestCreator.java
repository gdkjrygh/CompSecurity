// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.api:
//            GoogleAuthApiRequest

public class GoogleAuthApiRequestCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public GoogleAuthApiRequestCreator()
    {
    }

    static void a(GoogleAuthApiRequest googleauthapirequest, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.a(parcel, 1, googleauthapirequest.name, false);
        b.c(parcel, 1000, googleauthapirequest.versionCode);
        b.a(parcel, 2, googleauthapirequest.version, false);
        b.a(parcel, 3, googleauthapirequest.Dt, false);
        b.a(parcel, 4, googleauthapirequest.yR, false);
        b.a(parcel, 5, googleauthapirequest.Du, false);
        b.a(parcel, 6, googleauthapirequest.Dv, false);
        b.b(parcel, 7, googleauthapirequest.Dw, false);
        b.a(parcel, 8, googleauthapirequest.Dx, false);
        b.c(parcel, 9, googleauthapirequest.Dy);
        b.a(parcel, 10, googleauthapirequest.Dz, false);
        b.a(parcel, 11, googleauthapirequest.DA, false);
        b.a(parcel, 12, googleauthapirequest.DB);
        b.H(parcel, i);
    }

    public GoogleAuthApiRequest createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int j = 0;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        android.os.Bundle bundle1 = null;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        String s = null;
        int i = 0;
        android.os.Bundle bundle = null;
        byte abyte0[] = null;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 3: // '\003'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 5: // '\005'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, l);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 7: // '\007'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.C(parcel, l);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 10: // '\n'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, l);
                    break;

                case 11: // '\013'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, l);
                    break;

                case 12: // '\f'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GoogleAuthApiRequest(j, s5, s4, s3, s2, bundle1, s1, arraylist, s, i, bundle, abyte0, l1);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public GoogleAuthApiRequest[] newArray(int i)
    {
        return new GoogleAuthApiRequest[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
