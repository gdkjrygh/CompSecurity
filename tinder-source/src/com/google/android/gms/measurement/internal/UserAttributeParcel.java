// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            g

public class UserAttributeParcel
    implements SafeParcelable
{

    public static final g CREATOR = new g();
    public final int a;
    public final String b;
    public final long c;
    public final Long d;
    public final Float e;
    public final String f;
    public final String g;

    UserAttributeParcel(int i, String s, long l, Long long1, Float float1, String s1, 
            String s2)
    {
        a = i;
        b = s;
        c = l;
        d = long1;
        e = float1;
        f = s1;
        g = s2;
    }

    UserAttributeParcel(String s, long l, Object obj, String s1)
    {
        u.a(s);
        a = 1;
        b = s;
        c = l;
        g = s1;
        if (obj != null)
        {
            if (obj instanceof Long)
            {
                d = (Long)obj;
                e = null;
                f = null;
                return;
            }
            if (obj instanceof Float)
            {
                d = null;
                e = (Float)obj;
                f = null;
                return;
            }
            if (obj instanceof String)
            {
                d = null;
                e = null;
                f = (String)obj;
                return;
            }
            if (obj != null)
            {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
        }
        d = null;
        e = null;
        f = null;
    }

    public final Object a()
    {
        if (d != null)
        {
            return d;
        }
        if (e != null)
        {
            return e;
        }
        if (f != null)
        {
            return f;
        } else
        {
            return null;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.measurement.internal.g.a(this, parcel);
    }

}
