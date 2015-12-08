// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.h.o;
import com.google.android.m4b.maps.k.c;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.j:
//            e, q

public final class b
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final int a;
    final IBinder b;
    final o c[];

    b(int i, IBinder ibinder, o ao[])
    {
        a = i;
        b = ibinder;
        c = ao;
    }

    public b(q q1, Set set)
    {
        this(1, q1.asBinder(), (o[])set.toArray(new o[set.size()]));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
