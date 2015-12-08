// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.q;

// Referenced classes of package com.google.android.gms.fitness.result:
//            SessionReadResult

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(SessionReadResult sessionreadresult, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, sessionreadresult.getSessions(), false);
        b.c(parcel, 1000, sessionreadresult.getVersionCode());
        b.c(parcel, 2, sessionreadresult.kv(), false);
        b.a(parcel, 3, sessionreadresult.getStatus(), i, false);
        b.H(parcel, j);
    }

    public SessionReadResult ci(Parcel parcel)
    {
        Status status = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        java.util.ArrayList arraylist1 = null;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, Session.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, q.CREATOR);
                    break;

                case 3: // '\003'
                    status = (Status)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Status.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SessionReadResult(i, arraylist, arraylist1, status);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ci(parcel);
    }

    public SessionReadResult[] dD(int i)
    {
        return new SessionReadResult[i];
    }

    public Object[] newArray(int i)
    {
        return dD(i);
    }
}
