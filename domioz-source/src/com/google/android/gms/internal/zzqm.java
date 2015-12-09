// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kp

public class zzqm
    implements SafeParcelable
{

    public static final kp CREATOR = new kp();
    final int a;
    private final String b;
    private final List c;

    zzqm(int i, String s, List list)
    {
        a = i;
        b = s;
        c = list;
    }

    public final String a()
    {
        return b;
    }

    public final List b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof zzqm))
            {
                return false;
            }
            obj = (zzqm)obj;
            if (!an.a(b, ((zzqm) (obj)).b) || !an.a(c, ((zzqm) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c
        });
    }

    public String toString()
    {
        return an.a(this).a("data", b).a("actions", c).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kp.a(this, parcel);
    }

}
