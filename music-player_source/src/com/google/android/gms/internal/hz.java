// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ji, gq, gr

public final class hz
    implements SafeParcelable
{

    public static final ji a = new ji();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;

    public hz(int i, String s, String s1, String s2, String s3, List list)
    {
        b = i;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = list;
    }

    public final int describeContents()
    {
        ji ji1 = a;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof hz))
            {
                return false;
            }
            obj = (hz)obj;
            if (!gq.a(c, ((hz) (obj)).c) || !gq.a(d, ((hz) (obj)).d) || !gq.a(e, ((hz) (obj)).e) || !gq.a(f, ((hz) (obj)).f) || !gq.a(g, ((hz) (obj)).g))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            c, d, e, f
        });
    }

    public final String toString()
    {
        return gq.a(this).a("name", c).a("address", d).a("internationalPhoneNumber", e).a("regularOpenHours", f).a("attributions", g).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ji ji1 = a;
        ji.a(this, parcel);
    }

}
