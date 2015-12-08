// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;

import android.os.Parcel;

// Referenced classes of package android.support.v4.os:
//            d

public final class c
    implements android.os.Parcelable.Creator
{

    final d a;

    public c(d d1)
    {
        a = d1;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a.a(parcel, null);
    }

    public final Object[] newArray(int i)
    {
        return a.a(i);
    }
}
