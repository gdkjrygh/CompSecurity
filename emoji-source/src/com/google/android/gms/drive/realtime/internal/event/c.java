// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ParcelableObjectChangedEvent

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(ParcelableObjectChangedEvent parcelableobjectchangedevent, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, parcelableobjectchangedevent.xM);
        b.a(parcel, 2, parcelableobjectchangedevent.rR, false);
        b.a(parcel, 3, parcelableobjectchangedevent.Lm, false);
        b.a(parcel, 4, parcelableobjectchangedevent.Ls);
        b.a(parcel, 5, parcelableobjectchangedevent.Lq, false);
        b.a(parcel, 6, parcelableobjectchangedevent.Lt, false);
        b.c(parcel, 7, parcelableobjectchangedevent.LF);
        b.c(parcel, 8, parcelableobjectchangedevent.LG);
        b.G(parcel, i);
    }

    public ParcelableObjectChangedEvent aV(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int j = 0;
        String s1 = null;
        boolean flag = false;
        String s2 = null;
        String s3 = null;
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
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 7: // '\007'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 8: // '\b'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ParcelableObjectChangedEvent(k, s3, s2, flag, s1, s, j, i);
            }
        } while (true);
    }

    public ParcelableObjectChangedEvent[] bS(int i)
    {
        return new ParcelableObjectChangedEvent[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aV(parcel);
    }

    public Object[] newArray(int i)
    {
        return bS(i);
    }
}
