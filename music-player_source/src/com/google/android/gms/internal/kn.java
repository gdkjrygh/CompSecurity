// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            jv, jr, jt

public final class kn
    implements android.os.Parcelable.Creator
{

    public kn()
    {
    }

    static void a(jv jv1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, jv1.a());
        c.a(parcel, 2, jv1.a, false);
        c.a(parcel, 3, jv1.b, false);
        c.a(parcel, 4, jv1.c, i, false);
        c.a(parcel, 5, jv1.d, i, false);
        c.a(parcel, 6, jv1.e, i, false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        jt jt1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        jt jt2 = null;
        jr jr1 = null;
        String s = null;
        String s1 = null;
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

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 4: // '\004'
                    jr1 = (jr)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, jr.CREATOR);
                    break;

                case 5: // '\005'
                    jt2 = (jt)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, jt.CREATOR);
                    break;

                case 6: // '\006'
                    jt1 = (jt)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, jt.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new jv(i, s1, s, jr1, jt2, jt1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new jv[i];
    }
}
