// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzc

public class ClientIdentity
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    public final int a;
    public final String b;
    private final int c;

    ClientIdentity(int i, int j, String s)
    {
        c = i;
        a = j;
        b = s;
    }

    int a()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ClientIdentity)
        {
            if (((ClientIdentity) (obj = (ClientIdentity)obj)).a == a && zzt.a(((ClientIdentity) (obj)).b, b))
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
        zzc.a(this, parcel, i);
    }

}
