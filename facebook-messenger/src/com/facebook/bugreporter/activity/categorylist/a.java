// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.categorylist;

import android.os.Parcel;

// Referenced classes of package com.facebook.bugreporter.activity.categorylist:
//            CategoryInfo

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public CategoryInfo a(Parcel parcel)
    {
        return new CategoryInfo(parcel, null);
    }

    public CategoryInfo[] a(int i)
    {
        return new CategoryInfo[i];
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
