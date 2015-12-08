// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SessionReadRequest

public class t
    implements android.os.Parcelable.Creator
{

    public t()
    {
    }

    static void a(SessionReadRequest sessionreadrequest, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.a(parcel, 1, sessionreadrequest.getSessionName(), false);
        b.c(parcel, 1000, sessionreadrequest.getVersionCode());
        b.a(parcel, 2, sessionreadrequest.getSessionId(), false);
        b.a(parcel, 3, sessionreadrequest.jo());
        b.a(parcel, 4, sessionreadrequest.jp());
        b.c(parcel, 5, sessionreadrequest.getDataTypes(), false);
        b.c(parcel, 6, sessionreadrequest.getDataSources(), false);
        b.a(parcel, 7, sessionreadrequest.kj());
        b.a(parcel, 8, sessionreadrequest.jV());
        b.b(parcel, 9, sessionreadrequest.getExcludedPackages(), false);
        b.H(parcel, i);
    }

    public SessionReadRequest bT(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s1 = null;
        String s = null;
        long l1 = 0L;
        long l = 0L;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        boolean flag1 = false;
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 4: // '\004'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, DataType.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, DataSource.CREATOR);
                    break;

                case 7: // '\007'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 9: // '\t'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.C(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SessionReadRequest(i, s1, s, l1, l, arraylist2, arraylist1, flag1, flag, arraylist);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bT(parcel);
    }

    public SessionReadRequest[] _mthdo(int i)
    {
        return new SessionReadRequest[i];
    }

    public Object[] newArray(int i)
    {
        return _mthdo(i);
    }
}
