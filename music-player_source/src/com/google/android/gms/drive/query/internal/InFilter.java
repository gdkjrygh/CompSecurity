// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.a;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            e, d

public class InFilter
    implements SafeParcelable, a
{

    public static final e a = new e();
    final MetadataBundle b;
    final int c;
    private final com.google.android.gms.drive.metadata.a d;

    InFilter(int i, MetadataBundle metadatabundle)
    {
        c = i;
        b = metadatabundle;
        d = (com.google.android.gms.drive.metadata.a)com.google.android.gms.drive.query.internal.d.a(metadatabundle);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.internal.e.a(this, parcel, i);
    }

}
