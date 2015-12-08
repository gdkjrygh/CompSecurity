// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.identity.intents.model:
//            UserAddress

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(UserAddress useraddress, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.H(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, useraddress.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, useraddress.name, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, useraddress.afK, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, useraddress.afL, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, useraddress.afM, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, useraddress.afN, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, useraddress.afO, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, useraddress.afP, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, useraddress.afQ, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, useraddress.vk, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, useraddress.afR, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 12, useraddress.afS, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 13, useraddress.afT, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 14, useraddress.afU);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 15, useraddress.afV, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 16, useraddress.afW, false);
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, i);
    }

    public UserAddress cH(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s13 = null;
        String s12 = null;
        String s11 = null;
        String s10 = null;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        boolean flag = false;
        String s1 = null;
        String s = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s13 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    s12 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    s11 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 5: // '\005'
                    s10 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 6: // '\006'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 7: // '\007'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 8: // '\b'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 9: // '\t'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 10: // '\n'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 11: // '\013'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 12: // '\f'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 13: // '\r'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 14: // '\016'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 15: // '\017'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 16: // '\020'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new UserAddress(i, s13, s12, s11, s10, s9, s8, s7, s6, s5, s4, s3, s2, flag, s1, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cH(parcel);
    }

    public UserAddress[] eu(int i)
    {
        return new UserAddress[i];
    }

    public Object[] newArray(int i)
    {
        return eu(i);
    }
}
