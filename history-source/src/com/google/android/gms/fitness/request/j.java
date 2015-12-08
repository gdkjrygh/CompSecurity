// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.fitness.request:
//            k

public class j
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    private final int CK;
    private final String mName;

    j(int i, String s)
    {
        CK = i;
        mName = s;
    }

    public j(String s)
    {
        CK = 1;
        mName = s;
    }

    private boolean a(j j1)
    {
        return jv.equal(mName, j1.mName);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof j) && a((j)obj);
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
            mName
        });
    }

    public String toString()
    {
        return jv.h(this).a("name", mName).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
