// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.threads:
//            FolderName

final class e
    implements android.os.Parcelable.Creator
{

    e()
    {
    }

    public FolderName a(Parcel parcel)
    {
        return FolderName.a(new FolderName(parcel, null));
    }

    public FolderName[] a(int i)
    {
        return new FolderName[i];
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
