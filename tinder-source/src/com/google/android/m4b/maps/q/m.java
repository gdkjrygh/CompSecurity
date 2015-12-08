// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;
import com.google.android.m4b.maps.o.l;
import com.google.android.m4b.maps.o.n;

// Referenced classes of package com.google.android.m4b.maps.q:
//            j, l

public final class m
    implements android.os.Parcelable.Creator
{

    public m()
    {
    }

    public static com.google.android.m4b.maps.q.l a(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int i1 = com.google.android.m4b.maps.k.a.a(parcel);
        int k = 0;
        int i = 1;
        PendingIntent pendingintent = null;
        android.os.IBinder ibinder1 = null;
        j j1 = null;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i = com.google.android.m4b.maps.k.a.e(parcel, k1);
                    break;

                case 2: // '\002'
                    j1 = (j)com.google.android.m4b.maps.k.a.a(parcel, k1, j.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder1 = com.google.android.m4b.maps.k.a.j(parcel, k1);
                    break;

                case 4: // '\004'
                    pendingintent = (PendingIntent)com.google.android.m4b.maps.k.a.a(parcel, k1, PendingIntent.CREATOR);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.m4b.maps.k.a.j(parcel, k1);
                    break;

                case 1000: 
                    k = com.google.android.m4b.maps.k.a.e(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new com.google.android.m4b.maps.q.l(k, i, j1, ibinder1, pendingintent, ibinder);
            }
        } while (true);
    }

    static void a(com.google.android.m4b.maps.q.l l1, Parcel parcel, int i)
    {
        Object obj = null;
        int k = b.a(parcel, 20293);
        b.b(parcel, 1, l1.b);
        b.a(parcel, 2, l1.c, i);
        android.os.IBinder ibinder;
        if (l1.d == null)
        {
            ibinder = null;
        } else
        {
            ibinder = l1.d.asBinder();
        }
        b.a(parcel, 3, ibinder);
        b.a(parcel, 4, l1.e, i);
        if (l1.f == null)
        {
            ibinder = obj;
        } else
        {
            ibinder = l1.f.asBinder();
        }
        b.a(parcel, 5, ibinder);
        b.b(parcel, 1000, l1.a);
        b.b(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new com.google.android.m4b.maps.q.l[i];
    }
}
