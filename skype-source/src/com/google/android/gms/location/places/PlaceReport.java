// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places:
//            n

public class PlaceReport
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
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
            if (x.a(b, ((PlaceReport) (obj = (PlaceReport)obj)).b) && x.a(c, ((PlaceReport) (obj)).c) && x.a(d, ((PlaceReport) (obj)).d))
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
        com.google.android.gms.common.internal.x.a a1 = x.a(this);
        a1.a("placeId", b);
        a1.a("tag", c);
        if (!"unknown".equals(d))
        {
            a1.a("source", d);
        }
        return a1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel);
    }

}
