// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.fitness.result:
//            DataReadResult

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(DataReadResult datareadresult, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.H(parcel);
        com.google.android.gms.common.internal.safeparcel.b.d(parcel, 1, datareadresult.kt(), false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1000, datareadresult.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, datareadresult.getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.d(parcel, 3, datareadresult.ks(), false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 5, datareadresult.kr());
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 6, datareadresult.jw(), false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 7, datareadresult.ku(), false);
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, j);
    }

    public DataReadResult ce(Parcel parcel)
    {
        int i = 0;
        ArrayList arraylist = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        ArrayList arraylist2 = new ArrayList();
        ArrayList arraylist3 = new ArrayList();
        ArrayList arraylist1 = null;
        Status status = null;
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
                    com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, arraylist2, getClass().getClassLoader());
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    status = (Status)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Status.CREATOR);
                    break;

                case 3: // '\003'
                    com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, arraylist3, getClass().getClassLoader());
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, DataSource.CREATOR);
                    break;

                case 7: // '\007'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, DataType.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new DataReadResult(j, arraylist2, status, arraylist3, i, arraylist1, arraylist);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ce(parcel);
    }

    public DataReadResult[] dz(int i)
    {
        return new DataReadResult[i];
    }

    public Object[] newArray(int i)
    {
        return dz(i);
    }
}
