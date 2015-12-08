// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.Filter;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            a, e, Operator

public class ComparisonFilter
    implements SafeParcelable, Filter
{

    public static final a CREATOR = new a();
    final Operator KL;
    final MetadataBundle KM;
    final MetadataField KN;
    final int xM;

    ComparisonFilter(int i, Operator operator, MetadataBundle metadatabundle)
    {
        xM = i;
        KL = operator;
        KM = metadatabundle;
        KN = e.b(metadatabundle);
    }

    public ComparisonFilter(Operator operator, SearchableMetadataField searchablemetadatafield, Object obj)
    {
        this(1, operator, MetadataBundle.a(searchablemetadatafield, obj));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
