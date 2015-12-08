// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            fk, fp

public class fl
    implements android.os.Parcelable.Creator
{

    public fl()
    {
    }

    static void a(fk fk1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, fk1.xU, false);
        b.c(parcel, 1000, fk1.xM);
        b.a(parcel, 3, fk1.xV, i, false);
        b.c(parcel, 4, fk1.xW);
        b.a(parcel, 5, fk1.xX, false);
        b.G(parcel, j);
    }

    public fk[] F(int i)
    {
        return new fk[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return n(parcel);
    }

    public fk n(Parcel parcel)
    {
        byte abyte0[] = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int j = 0;
        int i = -1;
        fp fp1 = null;
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
                    fp1 = (fp)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, fp.CREATOR);
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
                return new fk(j, s, fp1, i, abyte0);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return F(i);
    }
}
