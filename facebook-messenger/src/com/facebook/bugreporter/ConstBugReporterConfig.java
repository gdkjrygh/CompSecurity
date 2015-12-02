// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.bugreporter.activity.categorylist.CategoryInfo;
import com.google.common.a.es;
import com.google.common.a.fi;
import com.google.common.c.b;

// Referenced classes of package com.facebook.bugreporter:
//            l, y

public class ConstBugReporterConfig
    implements Parcelable, l
{

    public static final android.os.Parcelable.Creator CREATOR = new y();
    private final es a;
    private final fi b;

    private ConstBugReporterConfig(Parcel parcel)
    {
        a = es.a(parcel.createTypedArrayList(CategoryInfo.CREATOR));
        b = fi.a(com.google.common.c.b.a(parcel.createLongArray()));
    }

    ConstBugReporterConfig(Parcel parcel, y y1)
    {
        this(parcel);
    }

    private ConstBugReporterConfig(l l1)
    {
        a = l1.a();
        b = l1.b();
    }

    public static ConstBugReporterConfig a(l l1)
    {
        if (l1 instanceof ConstBugReporterConfig)
        {
            return (ConstBugReporterConfig)l1;
        } else
        {
            return new ConstBugReporterConfig(l1);
        }
    }

    public es a()
    {
        return a;
    }

    public fi b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedList(a);
        parcel.writeLongArray(com.google.common.c.b.a(b));
    }

}
