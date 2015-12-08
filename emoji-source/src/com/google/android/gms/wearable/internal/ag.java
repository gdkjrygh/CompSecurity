// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            af

public class ag
    implements android.os.Parcelable.Creator
{

    public ag()
    {
    }

    static void a(af af1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, af1.xM);
        b.c(parcel, 2, af1.getRequestId());
        b.a(parcel, 3, af1.getPath(), false);
        b.a(parcel, 4, af1.getData(), false);
        b.a(parcel, 5, af1.getSourceNodeId(), false);
        b.G(parcel, i);
    }

    public af cE(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        byte abyte0[] = null;
        String s1 = null;
        int j = 0;
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
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, l);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new af(j, i, s1, abyte0, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cE(parcel);
    }

    public af[] en(int i)
    {
        return new af[i];
    }

    public Object[] newArray(int i)
    {
        return en(i);
    }
}
