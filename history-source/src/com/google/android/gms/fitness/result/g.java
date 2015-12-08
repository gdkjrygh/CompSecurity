// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Session;

// Referenced classes of package com.google.android.gms.fitness.result:
//            SessionStopResult

public class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(SessionStopResult sessionstopresult, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1000, sessionstopresult.getVersionCode());
        b.a(parcel, 2, sessionstopresult.getStatus(), i, false);
        b.c(parcel, 3, sessionstopresult.getSessions(), false);
        b.H(parcel, j);
    }

    public SessionStopResult cj(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        Status status = null;
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

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    status = (Status)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Status.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, Session.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SessionStopResult(i, status, arraylist);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cj(parcel);
    }

    public SessionStopResult[] dE(int i)
    {
        return new SessionStopResult[i];
    }

    public Object[] newArray(int i)
    {
        return dE(i);
    }
}
