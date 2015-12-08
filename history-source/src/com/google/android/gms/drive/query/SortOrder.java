// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.query:
//            b

public class SortOrder
    implements SafeParcelable
{
    public static class Builder
    {

        private final List Sf = new ArrayList();
        private boolean Sg;

        public Builder addSortAscending(SortableMetadataField sortablemetadatafield)
        {
            Sf.add(new FieldWithSortOrder(sortablemetadatafield.getName(), true));
            return this;
        }

        public Builder addSortDescending(SortableMetadataField sortablemetadatafield)
        {
            Sf.add(new FieldWithSortOrder(sortablemetadatafield.getName(), false));
            return this;
        }

        public SortOrder build()
        {
            return new SortOrder(Sf, Sg);
        }

        public Builder()
        {
            Sg = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int CK;
    final List Sf;
    final boolean Sg;

    SortOrder(int i, List list, boolean flag)
    {
        CK = i;
        Sf = list;
        Sg = flag;
    }

    private SortOrder(List list, boolean flag)
    {
        this(1, list, flag);
    }


    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format(Locale.US, "SortOrder[%s, %s]", new Object[] {
            TextUtils.join(",", Sf), Boolean.valueOf(Sg)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
