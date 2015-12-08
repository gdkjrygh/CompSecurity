// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            a, CustomProperty

public final class AppVisibleCustomProperties
    implements SafeParcelable, Iterable
{
    public static class a
    {

        private final Map Rf = new HashMap();

        public a a(CustomPropertyKey custompropertykey, String s)
        {
            jx.b(custompropertykey, "key");
            Rf.put(custompropertykey, new CustomProperty(custompropertykey, s));
            return this;
        }

        public AppVisibleCustomProperties iW()
        {
            return new AppVisibleCustomProperties(Rf.values());
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.drive.metadata.internal.a();
    public static final AppVisibleCustomProperties Rd = (new a()).iW();
    final int CK;
    final List Re;

    AppVisibleCustomProperties(int i, Collection collection)
    {
        CK = i;
        jx.i(collection);
        Re = new ArrayList(collection);
    }

    private AppVisibleCustomProperties(Collection collection)
    {
        this(1, collection);
    }


    public int describeContents()
    {
        return 0;
    }

    public Map iV()
    {
        HashMap hashmap = new HashMap(Re.size());
        CustomProperty customproperty;
        for (Iterator iterator1 = Re.iterator(); iterator1.hasNext(); hashmap.put(customproperty.iX(), customproperty.getValue()))
        {
            customproperty = (CustomProperty)iterator1.next();
        }

        return Collections.unmodifiableMap(hashmap);
    }

    public Iterator iterator()
    {
        return Re.iterator();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.metadata.internal.a.a(this, parcel, i);
    }

}
