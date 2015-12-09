// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, MatchAllFilterCreator, FilterVisitor

public class MatchAllFilter extends AbstractFilter
{

    public static final MatchAllFilterCreator CREATOR = new MatchAllFilterCreator();
    final int mVersionCode;

    public MatchAllFilter()
    {
        this(1);
    }

    MatchAllFilter(int i)
    {
        mVersionCode = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public final Object visit(FilterVisitor filtervisitor)
    {
        return filtervisitor.matchAll();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        MatchAllFilterCreator.writeToParcel$1a83d8ea(this, parcel);
    }

}
