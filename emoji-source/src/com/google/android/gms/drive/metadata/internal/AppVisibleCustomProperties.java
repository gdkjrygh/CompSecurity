// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hm;
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

        private final Map JP = new HashMap();

        public AppVisibleCustomProperties gD()
        {
            return new AppVisibleCustomProperties(JP.values());
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.drive.metadata.internal.a();
    public static final AppVisibleCustomProperties JN = (new a()).gD();
    final List JO;
    final int xM;

    AppVisibleCustomProperties(int i, Collection collection)
    {
        xM = i;
        hm.f(collection);
        JO = new ArrayList(collection);
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
        return JO.iterator();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.metadata.internal.a.a(this, parcel, i);
    }

}
