// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            fl, fq

public class fm
    implements android.os.Parcelable.Creator
{

    public fm()
    {
    }

    static void a(fl fl1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, fl1.xR, false);
        b.c(parcel, 1000, fl1.xJ);
        b.a(parcel, 3, fl1.xS, i, false);
        b.c(parcel, 4, fl1.xT);
        b.a(parcel, 5, fl1.xU, false);
        b.G(parcel, j);
    }

    public fl[] F(int i)
    {
        return new fl[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return n(parcel);
    }

    public fl n(Parcel parcel)
    {
        byte abyte0[] = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int j = 0;
        int i = -1;
        fq fq1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    fq1 = (fq)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, fq.CREATOR);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 5: // '\005'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new fl(j, s, fq1, i, abyte0);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return F(i);
    }
}
