// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.Filter;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            g, e

public class InFilter
    implements SafeParcelable, Filter
{

    public static final g CREATOR = new g();
    final MetadataBundle KM;
    private final b KX;
    final int xM;

    InFilter(int i, MetadataBundle metadatabundle)
    {
        xM = i;
        KM = metadatabundle;
        KX = (b)com.google.android.gms.drive.query.internal.e.b(metadatabundle);
    }

    public InFilter(SearchableCollectionMetadataField searchablecollectionmetadatafield, Object obj)
    {
        this(1, MetadataBundle.a(searchablecollectionmetadatafield, Collections.singleton(obj)));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
