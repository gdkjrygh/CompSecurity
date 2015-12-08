// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            x

public class w
    implements SafeParcelable
{
    public static class a
    {

        private Session TQ;

        static Session a(a a1)
        {
            return a1.TQ;
        }

        public a b(Session session)
        {
            boolean flag;
            if (session.getEndTime(TimeUnit.MILLISECONDS) == 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Cannot start a session which has already ended");
            TQ = session;
            return this;
        }

        public w kk()
        {
            return new w(this);
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new x();
    private final int CK;
    private final Session TQ;

    w(int i, Session session)
    {
        CK = i;
        TQ = session;
    }

    private w(a a1)
    {
        CK = 1;
        TQ = a.a(a1);
    }


    private boolean a(w w1)
    {
        return jv.equal(TQ, w1.TQ);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof w) && a((w)obj);
    }

    public Session getSession()
    {
        return TQ;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            TQ
        });
    }

    public String toString()
    {
        return jv.h(this).a("session", TQ).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        x.a(this, parcel, i);
    }

}
