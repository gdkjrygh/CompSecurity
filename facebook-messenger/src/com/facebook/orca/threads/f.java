// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.threads:
//            FolderType

final class f
    implements android.os.Parcelable.Creator
{

    f()
    {
    }

    public FolderType a(Parcel parcel)
    {
        return FolderType.a(new FolderType(parcel, null));
    }

    public FolderType[] a(int i)
    {
        return new FolderType[i];
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
