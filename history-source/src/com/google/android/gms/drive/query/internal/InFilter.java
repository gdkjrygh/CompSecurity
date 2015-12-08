// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, h, e, f

public class InFilter extends AbstractFilter
{

    public static final h CREATOR = new h();
    final int CK;
    final MetadataBundle Si;
    private final b St;

    InFilter(int i, MetadataBundle metadatabundle)
    {
        CK = i;
        Si = metadatabundle;
        St = (b)com.google.android.gms.drive.query.internal.e.b(metadatabundle);
    }

    public InFilter(SearchableCollectionMetadataField searchablecollectionmetadatafield, Object obj)
    {
        this(1, MetadataBundle.a(searchablecollectionmetadatafield, Collections.singleton(obj)));
    }

    public Object a(f f1)
    {
        return f1.b(St, getValue());
    }

    public int describeContents()
    {
        return 0;
    }

    public Object getValue()
    {
        return ((Collection)Si.a(St)).iterator().next();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}
