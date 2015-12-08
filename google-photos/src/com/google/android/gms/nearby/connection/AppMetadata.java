// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import lkf;

public final class AppMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lkf();
    public final int a;
    public final List b;

    public AppMetadata(int i, List list)
    {
        a = i;
        b = (List)b.f(list, "Must specify application identifiers");
        if (list.size() == 0)
        {
            throw new IllegalArgumentException(String.valueOf("Application identifiers cannot be empty"));
        } else
        {
            return;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        lkf.a(this, parcel);
    }

}
