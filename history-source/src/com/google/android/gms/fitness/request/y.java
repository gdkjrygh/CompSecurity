// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.fitness.request:
//            z

public class y
    implements SafeParcelable
{
    public static class a
    {

        private String UN;
        private String mName;

        static String a(a a1)
        {
            return a1.mName;
        }

        static String b(a a1)
        {
            return a1.UN;
        }

        public a bx(String s)
        {
            mName = s;
            return this;
        }

        public a by(String s)
        {
            UN = s;
            return this;
        }

        public y kl()
        {
            return new y(this);
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new z();
    private final int CK;
    private final String UN;
    private final String mName;

    y(int i, String s, String s1)
    {
        CK = i;
        mName = s;
        UN = s1;
    }

    private y(a a1)
    {
        CK = 1;
        mName = a.a(a1);
        UN = a.b(a1);
    }


    private boolean a(y y1)
    {
        return jv.equal(mName, y1.mName) && jv.equal(UN, y1.UN);
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
        return UN;
    }

    public String getName()
    {
        return mName;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            mName, UN
        });
    }

    public String toString()
    {
        return jv.h(this).a("name", mName).a("identifier", UN).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        z.a(this, parcel, i);
    }

}
