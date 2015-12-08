// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            a

public final class AppVisibleCustomProperties
    implements SafeParcelable, Iterable
{
    public static class a
    {

        private final Map PI = new HashMap();

        public AppVisibleCustomProperties im()
        {
            return new AppVisibleCustomProperties(PI.values());
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.drive.metadata.internal.a();
    public static final AppVisibleCustomProperties PG = (new a()).im();
    final int BR;
    final List PH;

    AppVisibleCustomProperties(int i, Collection collection)
    {
        BR = i;
        o.i(collection);
        PH = new ArrayList(collection);
    }

    private AppVisibleCustomProperties(Collection collection)
    {
        this(1, collection);
    }


    public int describeContents()
    {
        return 0;
    }

    public Iterator iterator()
    {
        return PH.iterator();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.metadata.internal.a.a(this, parcel, i);
    }

}
