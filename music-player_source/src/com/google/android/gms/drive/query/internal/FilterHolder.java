// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.a;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            c, ComparisonFilter, FieldOnlyFilter, LogicalFilter, 
//            NotFilter, InFilter

public class FilterHolder
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int a;
    final ComparisonFilter b;
    final FieldOnlyFilter c;
    final LogicalFilter d;
    final NotFilter e;
    final InFilter f;
    private final a g;

    FilterHolder(int i, ComparisonFilter comparisonfilter, FieldOnlyFilter fieldonlyfilter, LogicalFilter logicalfilter, NotFilter notfilter, InFilter infilter)
    {
        a = i;
        b = comparisonfilter;
        c = fieldonlyfilter;
        d = logicalfilter;
        e = notfilter;
        f = infilter;
        if (b != null)
        {
            g = b;
            return;
        }
        if (c != null)
        {
            g = c;
            return;
        }
        if (d != null)
        {
            g = d;
            return;
        }
        if (e != null)
        {
            g = e;
            return;
        }
        if (f != null)
        {
            g = f;
            return;
        } else
        {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.internal.c.a(this, parcel, i);
    }

}
