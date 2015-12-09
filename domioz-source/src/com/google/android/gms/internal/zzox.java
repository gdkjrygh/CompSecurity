// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jd

public class zzox
    implements SafeParcelable
{

    public static final jd CREATOR = new jd();
    public final int a;
    public final String b;
    private final int c;

    zzox(int i, int j, String s)
    {
        c = i;
        a = j;
        b = s;
    }

    final int a()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof zzox)
        {
            if (((zzox) (obj = (zzox)obj)).a == a && an.a(((zzox) (obj)).b, b))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return a;
    }

    public String toString()
    {
        return String.format("%d:%s", new Object[] {
            Integer.valueOf(a), b
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jd.a(this, parcel);
    }

}
