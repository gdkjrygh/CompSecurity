// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, OwnedByMeFilterCreator, FilterVisitor

public class OwnedByMeFilter extends AbstractFilter
{

    public static final OwnedByMeFilterCreator CREATOR = new OwnedByMeFilterCreator();
    final int mVersionCode;

    public OwnedByMeFilter()
    {
        this(1);
    }

    OwnedByMeFilter(int i)
    {
        mVersionCode = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public final Object visit(FilterVisitor filtervisitor)
    {
        return filtervisitor.ownedByMe();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        OwnedByMeFilterCreator.writeToParcel$5aac534e(this, parcel);
    }

}
