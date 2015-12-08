// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Session;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            x

public class w
    implements SafeParcelable
{
    public static class a
    {

        private Session St;

        static Session a(a a1)
        {
            return a1.St;
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
            o.b(flag, "Cannot start a session which has already ended");
            St = session;
            return this;
        }

        public w jA()
        {
            return new w(this);
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new x();
    private final int BR;
    private final Session St;

    w(int i, Session session)
    {
        BR = i;
        St = session;
    }

    private w(a a1)
    {
        BR = 1;
        St = a.a(a1);
    }


    private boolean a(w w1)
    {
        return n.equal(St, w1.St);
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
        return St;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            St
        });
    }

    public String toString()
    {
        return n.h(this).a("session", St).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        x.a(this, parcel, i);
    }

}
