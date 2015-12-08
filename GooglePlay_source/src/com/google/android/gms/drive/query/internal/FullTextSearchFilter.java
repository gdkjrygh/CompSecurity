// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, FullTextSearchFilterCreator, FilterVisitor

public class FullTextSearchFilter extends AbstractFilter
{

    public static final FullTextSearchFilterCreator CREATOR = new FullTextSearchFilterCreator();
    final String mValue;
    final int mVersionCode;

    FullTextSearchFilter(int i, String s)
    {
        mVersionCode = i;
        mValue = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public final Object visit(FilterVisitor filtervisitor)
    {
        return filtervisitor.fullTextSearch(mValue);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FullTextSearchFilterCreator.writeToParcel$204e359e(this, parcel);
    }

}
