// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.query:
//            SortOrderCreator

public class SortOrder
    implements SafeParcelable
{
    public static final class Builder
    {

        private boolean mSortFolderFirst;
        public final List mSortingFields = new ArrayList();

        public Builder()
        {
            mSortFolderFirst = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new SortOrderCreator();
    final boolean mSortFolderFirst;
    final List mSortingFields;
    final int mVersionCode;

    SortOrder(int i, List list, boolean flag)
    {
        mVersionCode = i;
        mSortingFields = list;
        mSortFolderFirst = flag;
    }

    private SortOrder(List list, boolean flag)
    {
        this(1, list, flag);
    }

    public SortOrder(List list, boolean flag, byte byte0)
    {
        this(list, false);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format(Locale.US, "SortOrder[%s, %s]", new Object[] {
            TextUtils.join(",", mSortingFields), Boolean.valueOf(mSortFolderFirst)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SortOrderCreator.writeToParcel$4b1eb6e0(this, parcel);
    }

}
