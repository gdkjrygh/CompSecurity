// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.location.places.personalized.e;

// Referenced classes of package com.google.android.gms.location.places.personalized.internal:
//            a

public class TestDataImpl extends e
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    final int a;
    private final String b;

    TestDataImpl(int i, String s)
    {
        a = i;
        b = s;
    }

    public final String a()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof TestDataImpl))
        {
            return false;
        } else
        {
            obj = (TestDataImpl)obj;
            return b.equals(((TestDataImpl) (obj)).b);
        }
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public String toString()
    {
        return x.a(this).a("testName", b).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.personalized.internal.a.a(this, parcel);
    }

}
