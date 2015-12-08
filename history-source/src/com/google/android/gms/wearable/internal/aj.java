// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ai

public class aj
    implements android.os.Parcelable.Creator
{

    public aj()
    {
    }

    static void a(ai ai1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, ai1.CK);
        b.c(parcel, 2, ai1.getRequestId());
        b.a(parcel, 3, ai1.getPath(), false);
        b.a(parcel, 4, ai1.getData(), false);
        b.a(parcel, 5, ai1.getSourceNodeId(), false);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ey(parcel);
    }

    public ai ey(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        byte abyte0[] = null;
        String s1 = null;
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
                return new ai(j, i, s1, abyte0, s);
            }
        } while (true);
    }

    public ai[] gH(int i)
    {
        return new ai[i];
    }

    public Object[] newArray(int i)
    {
        return gH(i);
    }
}
