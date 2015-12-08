// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataDeleteRequest

public class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(DataDeleteRequest datadeleterequest, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.a(parcel, 1, datadeleterequest.jo());
        b.c(parcel, 1000, datadeleterequest.getVersionCode());
        b.a(parcel, 2, datadeleterequest.jp());
        b.c(parcel, 3, datadeleterequest.getDataSources(), false);
        b.c(parcel, 4, datadeleterequest.getDataTypes(), false);
        b.c(parcel, 5, datadeleterequest.getSessions(), false);
        b.a(parcel, 6, datadeleterequest.jR());
        b.a(parcel, 7, datadeleterequest.jS());
        b.H(parcel, i);
    }

    public DataDeleteRequest bJ(Parcel parcel)
    {
        long l = 0L;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        boolean flag1 = false;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist2 = null;
        long l1 = 0L;
        int i = 0;
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
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, DataSource.CREATOR);
                    break;

                case 4: // '\004'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, DataType.CREATOR);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, Session.CREATOR);
                    break;

                case 6: // '\006'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DataDeleteRequest(i, l1, l, arraylist2, arraylist1, arraylist, flag1, flag);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bJ(parcel);
    }

    public DataDeleteRequest[] dd(int i)
    {
        return new DataDeleteRequest[i];
    }

    public Object[] newArray(int i)
    {
        return dd(i);
    }
}
