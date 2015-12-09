// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.query.Filter;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, NotFilterCreator, FilterHolder, FilterVisitor

public class NotFilter extends AbstractFilter
{

    public static final android.os.Parcelable.Creator CREATOR = new NotFilterCreator();
    final FilterHolder mToNegate;
    final int mVersionCode;

    NotFilter(int i, FilterHolder filterholder)
    {
        mVersionCode = i;
        mToNegate = filterholder;
    }

    public int describeContents()
    {
        return 0;
    }

    public final Object visit(FilterVisitor filtervisitor)
    {
        return filtervisitor.not(mToNegate.mFilter.visit(filtervisitor));
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        NotFilterCreator.writeToParcel(this, parcel, i);
    }

}
