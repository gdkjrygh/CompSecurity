// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common.api:
//            Status

public class s
    implements android.os.Parcelable.Creator
{

    public s()
    {
    }

    static void a(Status status, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, status.f());
        b.a(parcel, 1000, status.d());
        b.a(parcel, 2, status.c(), false);
        b.a(parcel, 3, status.b(), i, false);
        b.a(parcel, j);
    }

    public Status a(Parcel parcel)
    {
        PendingIntent pendingintent = null;
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String s1 = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new Status(i, j, s1, pendingintent);
            }
        } while (true);
    }

    public Status[] a(int i)
    {
        return new Status[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
