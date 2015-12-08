// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.bj;
import com.google.android.gms.common.internal.bk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            d

public class PlusCommonExtras
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    private final int a;
    private String b;
    private String c;

    public PlusCommonExtras()
    {
        a = 1;
        b = "";
        c = "";
    }

    PlusCommonExtras(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public final int a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlusCommonExtras)
        {
            if (a == ((PlusCommonExtras) (obj = (PlusCommonExtras)obj)).a && bj.a(b, ((PlusCommonExtras) (obj)).b) && bj.a(c, ((PlusCommonExtras) (obj)).c))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), b, c
        });
    }

    public String toString()
    {
        return bj.a(this).a("versionCode", Integer.valueOf(a)).a("Gpsrc", b).a("ClientCallingPackage", c).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel);
    }

}
