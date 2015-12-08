// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, g, e, f

public class HasFilter extends AbstractFilter
{

    public static final g CREATOR = new g();
    final int CK;
    final MetadataBundle Si;
    final MetadataField Sj;

    HasFilter(int i, MetadataBundle metadatabundle)
    {
        CK = i;
        Si = metadatabundle;
        Sj = e.b(metadatabundle);
    }

    public HasFilter(SearchableMetadataField searchablemetadatafield, Object obj)
    {
        this(1, MetadataBundle.a(searchablemetadatafield, obj));
    }

    public Object a(f f1)
    {
        return f1.d(Sj, getValue());
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
        g.a(this, parcel, i);
    }

}
