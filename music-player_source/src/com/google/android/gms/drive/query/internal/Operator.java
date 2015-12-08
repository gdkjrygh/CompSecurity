// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            h

public class Operator
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    public static final Operator a = new Operator("=");
    public static final Operator b = new Operator("<");
    public static final Operator c = new Operator("<=");
    public static final Operator d = new Operator(">");
    public static final Operator e = new Operator(">=");
    public static final Operator f = new Operator("and");
    public static final Operator g = new Operator("or");
    public static final Operator h = new Operator("not");
    public static final Operator i = new Operator("contains");
    final String j;
    final int k;

    Operator(int l, String s)
    {
        k = l;
        j = s;
    }

    private Operator(String s)
    {
        this(1, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (Operator)obj;
        if (j != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Operator) (obj)).j == null) goto _L1; else goto _L3
_L3:
        return false;
        if (j.equals(((Operator) (obj)).j)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int l;
        if (j == null)
        {
            l = 0;
        } else
        {
            l = j.hashCode();
        }
        return l + 31;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        com.google.android.gms.drive.query.internal.h.a(this, parcel);
    }

}
