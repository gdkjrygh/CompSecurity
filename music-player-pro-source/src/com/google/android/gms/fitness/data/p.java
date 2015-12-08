// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Session, a

public class p
    implements android.os.Parcelable.Creator
{

    public p()
    {
    }

    static void a(Session session, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, session.jo());
        b.c(parcel, 1000, session.getVersionCode());
        b.a(parcel, 2, session.jp());
        b.a(parcel, 3, session.getName(), false);
        b.a(parcel, 4, session.getIdentifier(), false);
        b.a(parcel, 5, session.getDescription(), false);
        b.c(parcel, 7, session.jm());
        b.a(parcel, 8, session.jx(), i, false);
        b.H(parcel, j);
    }

    public Session bC(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        com.google.android.gms.fitness.data.a a1 = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        String s = null;
        String s1 = null;
        String s2 = null;
        long l2 = 0L;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 8: // '\b'
                    a1 = (com.google.android.gms.fitness.data.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, a.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new Session(j, l2, l1, s2, s1, s, i, a1);
            }
        } while (true);
    }

    public Session[] cW(int i)
    {
        return new Session[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bC(parcel);
    }

    public Object[] newArray(int i)
    {
        return cW(i);
    }
}
