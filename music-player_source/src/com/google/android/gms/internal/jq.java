// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            io, im

public final class jq
    implements android.os.Parcelable.Creator
{

    public jq()
    {
    }

    static void a(io io1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = io1.e();
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, io1.f());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, io1.g(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, io1.h(), i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            c.a(parcel, 5, io1.i(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            c.a(parcel, 6, io1.j(), i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            c.a(parcel, 7, io1.k(), true);
        }
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        im im1 = null;
        String s1 = null;
        im im2 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 3: // '\003'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    im2 = (im)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, com.google.android.gms.internal.im.a);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    im1 = (im)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, com.google.android.gms.internal.im.a);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new io(hashset, i, s2, im2, s1, im1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new io[i];
    }
}
