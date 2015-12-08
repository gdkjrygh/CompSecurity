// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.a;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            f, Operator

public class LogicalFilter
    implements SafeParcelable, a
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    final Operator a;
    final List b;
    final int c;

    LogicalFilter(int i, Operator operator, List list)
    {
        c = i;
        a = operator;
        b = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.internal.f.a(this, parcel, i);
    }

}
