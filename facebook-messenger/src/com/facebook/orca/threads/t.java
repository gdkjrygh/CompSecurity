// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.threads:
//            ThreadSummary

final class t
    implements android.os.Parcelable.Creator
{

    t()
    {
    }

    public ThreadSummary a(Parcel parcel)
    {
        return new ThreadSummary(parcel, null);
    }

    public ThreadSummary[] a(int i)
    {
        return new ThreadSummary[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
