// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.server:
//            DeleteThreadParams

final class g
    implements android.os.Parcelable.Creator
{

    g()
    {
    }

    public DeleteThreadParams a(Parcel parcel)
    {
        return new DeleteThreadParams(parcel, null);
    }

    public DeleteThreadParams[] a(int i)
    {
        return new DeleteThreadParams[i];
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
