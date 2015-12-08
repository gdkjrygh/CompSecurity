// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            PasswordSpecification

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(PasswordSpecification passwordspecification, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, passwordspecification.d, false);
        c.a(parcel, 1000, passwordspecification.c);
        c.a(parcel, 2, passwordspecification.e, false);
        c.a(parcel, passwordspecification.f);
        c.a(parcel, 4, passwordspecification.g);
        c.a(parcel, 5, passwordspecification.h);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        int j = 0;
        ArrayList arraylist = null;
        ArrayList arraylist1 = null;
        String s = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, l);
                    break;

                case 3: // '\003'
                    int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, l);
                    int k1 = parcel.dataPosition();
                    if (j1 == 0)
                    {
                        arraylist = null;
                    } else
                    {
                        arraylist = new ArrayList();
                        int l1 = parcel.readInt();
                        for (l = 0; l < l1; l++)
                        {
                            arraylist.add(Integer.valueOf(parcel.readInt()));
                        }

                        parcel.setDataPosition(k1 + j1);
                    }
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
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
