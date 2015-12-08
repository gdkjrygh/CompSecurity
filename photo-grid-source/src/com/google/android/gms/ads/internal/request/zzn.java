// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            StringParcel

public class zzn
    implements android.os.Parcelable.Creator
{

    public zzn()
    {
    }

    static void a(StringParcel stringparcel, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, stringparcel.a);
        c.a(parcel, 2, stringparcel.b, false);
        c.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzm(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzH(i);
    }

    public StringParcel[] zzH(int i)
    {
        return new StringParcel[i];
    }

    public StringParcel zzm(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StringParcel(i, s);
            }
        } while (true);
    }
}
