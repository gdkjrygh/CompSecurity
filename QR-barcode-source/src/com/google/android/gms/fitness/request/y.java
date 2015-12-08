// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.fitness.request:
//            z

public class y
    implements SafeParcelable
{
    public static class a
    {

        private String Tq;
        private String mName;

        static String a(a a1)
        {
            return a1.mName;
        }

        static String b(a a1)
        {
            return a1.Tq;
        }

        public a bu(String s)
        {
            mName = s;
            return this;
        }

        public a bv(String s)
        {
            Tq = s;
            return this;
        }

        public y jB()
        {
            return new y(this);
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new z();
    private final int BR;
    private final String Tq;
    private final String mName;

    y(int i, String s, String s1)
    {
        BR = i;
        mName = s;
        Tq = s1;
    }

    private y(a a1)
    {
        BR = 1;
        mName = a.a(a1);
        Tq = a.b(a1);
    }


    private boolean a(y y1)
    {
        return n.equal(mName, y1.mName) && n.equal(Tq, y1.Tq);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof y) && a((y)obj);
    }

    public String getIdentifier()
    {
        return Tq;
    }

    public String getName()
    {
        return mName;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            mName, Tq
        });
    }

    public String toString()
    {
        return n.h(this).a("name", mName).a("identifier", Tq).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        z.a(this, parcel, i);
    }

}
