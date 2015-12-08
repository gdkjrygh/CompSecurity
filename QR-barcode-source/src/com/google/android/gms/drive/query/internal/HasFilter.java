// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, g, e, f

public class HasFilter extends AbstractFilter
{

    public static final g CREATOR = new g();
    final int BR;
    final MetadataBundle QL;
    final MetadataField QM;

    HasFilter(int i, MetadataBundle metadatabundle)
    {
        BR = i;
        QL = metadatabundle;
        QM = e.b(metadatabundle);
    }

    public Object a(f f1)
    {
        return f1.d(QM, getValue());
    }

    public int describeContents()
    {
        return 0;
    }

    public Object getValue()
    {
        return QL.a(QM);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
