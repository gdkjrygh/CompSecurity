// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places:
//            a

public class PlaceReport
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    final int a;
    private final String b;
    private final String c;
    private final String d;

    PlaceReport(int i, String s, String s1, String s2)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlaceReport)
        {
            if (an.a(b, ((PlaceReport) (obj = (PlaceReport)obj)).b) && an.a(c, ((PlaceReport) (obj)).c) && an.a(d, ((PlaceReport) (obj)).d))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, d
        });
    }

    public String toString()
    {
        ao ao1 = an.a(this);
        ao1.a("placeId", b);
        ao1.a("tag", c);
        if (!"unknown".equals(d))
        {
            ao1.a("source", d);
        }
        return ao1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.a.a(this, parcel);
    }

}
