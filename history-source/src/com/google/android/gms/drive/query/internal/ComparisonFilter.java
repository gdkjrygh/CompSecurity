// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, a, e, f, 
//            Operator

public class ComparisonFilter extends AbstractFilter
{

    public static final a CREATOR = new a();
    final int CK;
    final Operator Sh;
    final MetadataBundle Si;
    final MetadataField Sj;

    ComparisonFilter(int i, Operator operator, MetadataBundle metadatabundle)
    {
        CK = i;
        Sh = operator;
        Si = metadatabundle;
        Sj = e.b(metadatabundle);
    }

    public ComparisonFilter(Operator operator, SearchableMetadataField searchablemetadatafield, Object obj)
    {
        this(1, operator, MetadataBundle.a(searchablemetadatafield, obj));
    }

    public Object a(f f1)
    {
        return f1.b(Sh, Sj, getValue());
    }

    public int describeContents()
    {
        return 0;
    }

    public Object getValue()
    {
        return Si.a(Sj);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.internal.a.a(this, parcel, i);
    }

}
