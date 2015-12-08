// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.fitness.data:
//            r, Session, DataSet

public class q
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new r();
    final int CK;
    private final Session TQ;
    private final DataSet UP;

    q(int i, Session session, DataSet dataset)
    {
        CK = i;
        TQ = session;
        UP = dataset;
    }

    private boolean a(q q1)
    {
        return jv.equal(TQ, q1.TQ) && jv.equal(UP, q1.UP);
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
        return TQ;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            TQ, UP
        });
    }

    public DataSet jH()
    {
        return UP;
    }

    public String toString()
    {
        return jv.h(this).a("session", TQ).a("dataSet", UP).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        r.a(this, parcel, i);
    }

}
