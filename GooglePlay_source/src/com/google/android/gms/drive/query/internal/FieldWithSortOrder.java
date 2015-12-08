// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            FieldWithSortOrderCreator

public class FieldWithSortOrder
    implements SafeParcelable
{

    public static final FieldWithSortOrderCreator CREATOR = new FieldWithSortOrderCreator();
    final String mFieldName;
    final boolean mIsSortAscending;
    final int mVersionCode;

    FieldWithSortOrder(int i, String s, boolean flag)
    {
        mVersionCode = i;
        mFieldName = s;
        mIsSortAscending = flag;
    }

    public FieldWithSortOrder(String s)
    {
        this(1, s, true);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        Locale locale = Locale.US;
        String s1 = mFieldName;
        String s;
        if (mIsSortAscending)
        {
            s = "ASC";
        } else
        {
            s = "DESC";
        }
        return String.format(locale, "FieldWithSortOrder[%s %s]", new Object[] {
            s1, s
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FieldWithSortOrderCreator.writeToParcel$29d325b2(this, parcel);
    }

}
