// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.data:
//            RawBucket, Session, RawDataSet

public class m
    implements android.os.Parcelable.Creator
{

    public m()
    {
    }

    static void a(RawBucket rawbucket, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, rawbucket.LW);
        b.c(parcel, 1000, rawbucket.CK);
        b.a(parcel, 2, rawbucket.TO);
        b.a(parcel, 3, rawbucket.TQ, i, false);
        b.c(parcel, 4, rawbucket.UI);
        b.c(parcel, 5, rawbucket.Ua, false);
        b.c(parcel, 6, rawbucket.Ub);
        b.a(parcel, 7, rawbucket.Uc);
        b.H(parcel, j);
    }

    public RawBucket bz(Parcel parcel)
    {
        long l1 = 0L;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        int j = 0;
        Session session = null;
        long l2 = 0L;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 3: // '\003'
                    session = (Session)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Session.CREATOR);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, RawDataSet.CREATOR);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new RawBucket(k, l2, l1, session, j, arraylist, i, flag);
            }
        } while (true);
    }

    public RawBucket[] cS(int i)
    {
        return new RawBucket[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bz(parcel);
    }

    public Object[] newArray(int i)
    {
        return cS(i);
    }
}
