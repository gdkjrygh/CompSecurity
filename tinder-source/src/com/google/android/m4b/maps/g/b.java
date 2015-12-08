// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.g;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.m4b.maps.k.a;

// Referenced classes of package com.google.android.m4b.maps.g:
//            a

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(com.google.android.m4b.maps.g.a a1, Parcel parcel, int i)
    {
        int j = com.google.android.m4b.maps.k.b.a(parcel, 20293);
        com.google.android.m4b.maps.k.b.b(parcel, 1, a1.b);
        com.google.android.m4b.maps.k.b.b(parcel, 2, a1.c);
        com.google.android.m4b.maps.k.b.a(parcel, 3, a1.d, i);
        com.google.android.m4b.maps.k.b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.m4b.maps.k.a.a(parcel);
        PendingIntent pendingintent = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 3: // '\003'
                    pendingintent = (PendingIntent)com.google.android.m4b.maps.k.a.a(parcel, l, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new com.google.android.m4b.maps.g.a(i, j, pendingintent);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new com.google.android.m4b.maps.g.a[i];
    }
}
