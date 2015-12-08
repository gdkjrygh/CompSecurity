// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.query.Filter;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, k, FilterHolder, f

public class NotFilter extends AbstractFilter
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    final int CK;
    final FilterHolder Sv;

    NotFilter(int i, FilterHolder filterholder)
    {
        CK = i;
        Sv = filterholder;
    }

    public NotFilter(Filter filter)
    {
        this(1, new FilterHolder(filter));
    }

    public Object a(f f1)
    {
        return f1.j(Sv.getFilter().a(f1));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
