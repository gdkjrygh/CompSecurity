// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.h:
//            n

public final class o
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    final int a;
    final String b;

    o(int i, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException(String.valueOf("scopeUri must not be null or empty"));
        } else
        {
            a = i;
            b = s;
            return;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof o))
        {
            return false;
        } else
        {
            return b.equals(((o)obj).b);
        }
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final String toString()
    {
        return b;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel);
    }

}
