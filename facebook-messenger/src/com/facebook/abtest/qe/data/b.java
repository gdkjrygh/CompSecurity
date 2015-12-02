// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.data;

import android.os.Parcel;

// Referenced classes of package com.facebook.abtest.qe.data:
//            QuickExperimentInfo

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public QuickExperimentInfo a(Parcel parcel)
    {
        return new QuickExperimentInfo(parcel, null);
    }

    public QuickExperimentInfo[] a(int i)
    {
        return new QuickExperimentInfo[i];
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
