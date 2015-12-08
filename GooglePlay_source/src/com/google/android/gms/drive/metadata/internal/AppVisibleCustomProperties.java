// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            AppVisibleCustomPropertiesCreator, CustomProperty

public final class AppVisibleCustomProperties
    implements SafeParcelable, Iterable
{
    public static final class Builder
    {

        public final Map mProperties = new HashMap();

        public final Builder add(CustomPropertyKey custompropertykey, String s)
        {
            Preconditions.checkNotNull(custompropertykey, "key");
            mProperties.put(custompropertykey, new CustomProperty(custompropertykey, s));
            return this;
        }

        public final AppVisibleCustomProperties build()
        {
            return new AppVisibleCustomProperties(mProperties.values(), (byte)0);
        }

        public Builder()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new AppVisibleCustomPropertiesCreator();
    public static final AppVisibleCustomProperties EMPTY_PROPERTIES = (new Builder()).build();
    final List mProperties;
    final int mVersionCode;

    AppVisibleCustomProperties(int i, Collection collection)
    {
        mVersionCode = i;
        Preconditions.checkNotNull(collection);
        mProperties = new ArrayList(collection);
    }

    private AppVisibleCustomProperties(Collection collection)
    {
        this(1, collection);
    }

    AppVisibleCustomProperties(Collection collection, byte byte0)
    {
        this(collection);
    }

    public final Map asMap()
    {
        HashMap hashmap = new HashMap(mProperties.size());
        CustomProperty customproperty;
        for (Iterator iterator1 = mProperties.iterator(); iterator1.hasNext(); hashmap.put(customproperty.mKey, customproperty.mValue))
        {
            customproperty = (CustomProperty)iterator1.next();
        }

        return Collections.unmodifiableMap(hashmap);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || obj.getClass() != getClass())
        {
            return false;
        } else
        {
            return asMap().equals(((AppVisibleCustomProperties)obj).asMap());
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mProperties
        });
    }

    public final Iterator iterator()
    {
        return mProperties.iterator();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AppVisibleCustomPropertiesCreator.writeToParcel$936f234(this, parcel);
    }

}
