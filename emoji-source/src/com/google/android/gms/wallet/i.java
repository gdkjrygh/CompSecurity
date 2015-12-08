// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            LineItem

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(LineItem lineitem, Parcel parcel, int j)
    {
        j = b.C(parcel);
        b.c(parcel, 1, lineitem.getVersionCode());
        b.a(parcel, 2, lineitem.description, false);
        b.a(parcel, 3, lineitem.aje, false);
        b.a(parcel, 4, lineitem.ajf, false);
        b.a(parcel, 5, lineitem.aiK, false);
        b.c(parcel, 6, lineitem.ajg);
        b.a(parcel, 7, lineitem.aiL, false);
        b.G(parcel, j);
    }

    public LineItem bX(Parcel parcel)
    {
        int j = 0;
        String s = null;
        int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 3: // '\003'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new LineItem(k, s4, s3, s2, s1, j, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bX(parcel);
    }

    public LineItem[] dD(int j)
    {
        return new LineItem[j];
    }

    public Object[] newArray(int j)
    {
        return dD(j);
    }
}
