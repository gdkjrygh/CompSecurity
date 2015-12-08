// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            Credential, IdToken

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(Credential credential, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1001, credential.a());
        b.a(parcel, 1, credential.c());
        b.a(parcel, 1000, credential.a);
        b.a(parcel, 2, credential.d());
        b.a(parcel, 3, credential.e(), i);
        b.a(parcel, 1002, credential.b());
        b.c(parcel, 4, credential.f());
        b.a(parcel, 5, credential.g());
        b.a(parcel, 6, credential.i());
        b.a(parcel, 7, credential.h());
        b.a(parcel, 8, credential.j());
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        java.util.ArrayList arraylist = null;
        Uri uri = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
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

                case 1001: 
                    s7 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 1: // '\001'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 3: // '\003'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;

                case 1002: 
                    s6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, IdToken.CREATOR);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new Credential(i, s7, s6, s5, s4, uri, arraylist, s3, s2, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new Credential[i];
    }
}
