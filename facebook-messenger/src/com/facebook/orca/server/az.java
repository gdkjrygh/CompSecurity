// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.server:
//            ThreadCriteria

final class az
    implements android.os.Parcelable.Creator
{

    az()
    {
    }

    public ThreadCriteria a(Parcel parcel)
    {
        return new ThreadCriteria(parcel, null);
    }

    public ThreadCriteria[] a(int i)
    {
        return new ThreadCriteria[i];
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
