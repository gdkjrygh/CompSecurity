// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.os.Parcel;

// Referenced classes of package com.facebook.bugreporter:
//            BugReport

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public BugReport a(Parcel parcel)
    {
        return new BugReport(parcel, null);
    }

    public BugReport[] a(int i)
    {
        return new BugReport[i];
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
