// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.os.Parcel;

// Referenced classes of package com.facebook.bugreporter:
//            ConstBugReporterConfig

final class y
    implements android.os.Parcelable.Creator
{

    y()
    {
    }

    public ConstBugReporterConfig a(Parcel parcel)
    {
        return new ConstBugReporterConfig(parcel, null);
    }

    public ConstBugReporterConfig[] a(int i)
    {
        return new ConstBugReporterConfig[i];
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
