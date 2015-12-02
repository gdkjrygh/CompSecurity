// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.server:
//            AddMembersParams

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public AddMembersParams a(Parcel parcel)
    {
        return new AddMembersParams(parcel, null);
    }

    public AddMembersParams[] a(int i)
    {
        return new AddMembersParams[i];
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
