// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.a;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            g, FilterHolder

public class NotFilter
    implements SafeParcelable, a
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    final FilterHolder a;
    final int b;

    NotFilter(int i, FilterHolder filterholder)
    {
        b = i;
        a = filterholder;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.internal.g.a(this, parcel, i);
    }

}
