// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            d

public class PlusCommonExtras
    implements SafeParcelable
{

    public static String a = "PlusCommonExtras";
    public static final d b = new d();
    private final int c;
    private String d;
    private String e;

    public PlusCommonExtras()
    {
        c = 1;
        d = "";
        e = "";
    }

    PlusCommonExtras(int i, String s, String s1)
    {
        c = i;
        d = s;
        e = s1;
    }

    public final int a()
    {
        return c;
    }

    public final String b()
    {
        return d;
    }

    public final String c()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlusCommonExtras)
        {
            if (c == ((PlusCommonExtras) (obj = (PlusCommonExtras)obj)).c && gq.a(d, ((PlusCommonExtras) (obj)).d) && gq.a(e, ((PlusCommonExtras) (obj)).e))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(c), d, e
        });
    }

    public String toString()
    {
        return gq.a(this).a("versionCode", Integer.valueOf(c)).a("Gpsrc", d).a("ClientCallingPackage", e).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.plus.internal.d.a(this, parcel);
    }

}
