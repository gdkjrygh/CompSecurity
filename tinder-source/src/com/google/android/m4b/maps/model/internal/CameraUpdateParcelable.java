// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.model.internal:
//            b

public final class CameraUpdateParcelable
    implements c
{

    public static final b CREATOR = new b();
    final int a;
    int b;
    Bundle c;

    CameraUpdateParcelable(int i, int j, Bundle bundle)
    {
        a = i;
        b = j;
        c = bundle;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.m4b.maps.model.internal.b.a(this, parcel);
    }

}
