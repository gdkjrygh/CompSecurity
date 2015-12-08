// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            PasswordSpecification

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(PasswordSpecification passwordspecification, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, passwordspecification.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, passwordspecification.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, passwordspecification.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, passwordspecification.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, passwordspecification.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, passwordspecification.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int i = 0;
        int l = zza.a(parcel);
        int j = 0;
        java.util.ArrayList arraylist1 = null;
        String s = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    s = zza.l(parcel, i1);
                    break;

                case 1000: 
                    k = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    arraylist1 = zza.t(parcel, i1);
                    break;

                case 3: // '\003'
                    arraylist = zza.s(parcel, i1);
                    break;

                case 4: // '\004'
                    j = zza.e(parcel, i1);
                    break;

                case 5: // '\005'
                    i = zza.e(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new PasswordSpecification(k, s, arraylist1, arraylist, j, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PasswordSpecification[i];
    }
}
