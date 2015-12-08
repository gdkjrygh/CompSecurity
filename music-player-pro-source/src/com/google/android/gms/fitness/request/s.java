// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SessionInsertRequest

public class s
    implements android.os.Parcelable.Creator
{

    public s()
    {
    }

    static void a(SessionInsertRequest sessioninsertrequest, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, sessioninsertrequest.getSession(), i, false);
        b.c(parcel, 1000, sessioninsertrequest.getVersionCode());
        b.c(parcel, 2, sessioninsertrequest.getDataSets(), false);
        b.c(parcel, 3, sessioninsertrequest.getAggregateDataPoints(), false);
        b.H(parcel, j);
    }

    public SessionInsertRequest bS(Parcel parcel)
    {
        java.util.ArrayList arraylist;
        Object obj;
        Object obj1;
        int i;
        int j;
        arraylist = null;
        j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        i = 0;
        obj1 = null;
        obj = null;
_L7:
        int k;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        com.google.android.gms.common.internal.safeparcel.a.aH(k);
        JVM INSTR lookupswitch 4: default 80
    //                   1: 109
    //                   2: 154
    //                   3: 174
    //                   1000: 133;
           goto _L1 _L2 _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_174;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
        Object obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L8:
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L7; else goto _L6
_L6:
        Session session = (Session)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Session.CREATOR);
        obj = obj1;
        obj1 = session;
          goto _L8
_L5:
        i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L8
_L3:
        java.util.ArrayList arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, DataSet.CREATOR);
        obj1 = obj;
        obj = arraylist1;
          goto _L8
        arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, DataPoint.CREATOR);
        Object obj5 = obj;
        obj = obj1;
        obj1 = obj5;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new SessionInsertRequest(i, ((Session) (obj)), ((java.util.List) (obj1)), arraylist);
        }
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bS(parcel);
    }

    public SessionInsertRequest[] dn(int i)
    {
        return new SessionInsertRequest[i];
    }

    public Object[] newArray(int i)
    {
        return dn(i);
    }
}
