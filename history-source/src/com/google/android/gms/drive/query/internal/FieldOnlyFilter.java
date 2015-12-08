// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, b, e, f

public class FieldOnlyFilter extends AbstractFilter
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int CK;
    final MetadataBundle Si;
    private final MetadataField Sj;

    FieldOnlyFilter(int i, MetadataBundle metadatabundle)
    {
        CK = i;
        Si = metadatabundle;
        Sj = e.b(metadatabundle);
    }

    public FieldOnlyFilter(SearchableMetadataField searchablemetadatafield)
    {
        this(1, MetadataBundle.a(searchablemetadatafield, null));
    }

    public Object a(f f1)
    {
        return f1.d(Sj);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
