// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ks, kt

public class zzqu extends ks
    implements SafeParcelable
{

    public static final kt CREATOR = new kt();
    final int a;
    private final String b;

    zzqu(int i, String s)
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
        if (!(obj instanceof zzqu))
        {
            return false;
        } else
        {
            obj = (zzqu)obj;
            return b.equals(((zzqu) (obj)).b);
        }
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public String toString()
    {
        return an.a(this).a("testName", b).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kt.a(this, parcel);
    }

}
