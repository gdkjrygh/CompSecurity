// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ay

public class az
    implements android.os.Parcelable.Creator
{

    public az()
    {
    }

    static void a(ay ay1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, ay1.versionCode);
        b.a(parcel, 2, ay1.op, false);
        b.c(parcel, 3, ay1.height);
        b.c(parcel, 4, ay1.heightPixels);
        b.a(parcel, 5, ay1.oq);
        b.c(parcel, 6, ay1.width);
        b.c(parcel, 7, ay1.widthPixels);
        b.a(parcel, 8, ay1.or, i, false);
        b.H(parcel, j);
    }

    public ay c(Parcel parcel)
    {
        ay aay[] = null;
        int i = 0;
        int j1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int j = 0;
        boolean flag = false;
        int k = 0;
        int l = 0;
        String s = null;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k1);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k1);
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 8: // '\b'
                    aay = (ay[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1, ay.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j1).toString(), parcel);
            } else
            {
                return new ay(i1, s, l, k, flag, j, i, aay);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return c(parcel);
    }

    public ay[] g(int i)
    {
        return new ay[i];
    }

    public Object[] newArray(int i)
    {
        return g(i);
    }
}
