// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.fitness.data:
//            r, Session, DataSet

public class q
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new r();
    final int BR;
    private final Session St;
    private final DataSet Ts;

    q(int i, Session session, DataSet dataset)
    {
        BR = i;
        St = session;
        Ts = dataset;
    }

    private boolean a(q q1)
    {
        return n.equal(St, q1.St) && n.equal(Ts, q1.Ts);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof q) && a((q)obj);
    }

    public Session getSession()
    {
        return St;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            St, Ts
        });
    }

    public DataSet iW()
    {
        return Ts;
    }

    public String toString()
    {
        return n.h(this).a("session", St).a("dataSet", Ts).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        r.a(this, parcel, i);
    }

}
